package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import org.bukkit.Bukkit;

import com.google.common.collect.ImmutableList;
import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class OnlinePlayerHandler {
    private final MinecraftRPC plugin;

    public OnlinePlayerHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public OnlinePlayersResponse handleGetOnlinePlayersRequest(OnlinePlayersRequest request) {
        OnlinePlayersResponse.Builder responseBuilder = OnlinePlayersResponse.newBuilder();

        ImmutableList.copyOf(Bukkit.getOnlinePlayers()).forEach(player -> {
            responseBuilder.addPlayers(OnlinePlayerMapper.mapPlayerToRPC(player));
        });
        responseBuilder.setStatus(
            CommandStatus.newBuilder()
                .setCode(CommandStatusCode.OK)
                .build());
        return responseBuilder.build();
    }

    public OnlinePlayerResponse handleGetOnlinePlayerRequest(OnlinePlayerRequest request) {
        OnlinePlayerResponse.Builder responseBuilder = OnlinePlayerResponse.newBuilder();

        if (!request.getUuid().isEmpty()) {
            var player = Bukkit.getPlayer(UUID.fromString(request.getUuid()));

            if (player != null) {
                responseBuilder.setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player));
            } else {
                responseBuilder.setStatus(
                    CommandStatus.newBuilder()
                        .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                        .setExtra(request.getUuid())
                        .build());
            }
        } else if (!request.getName().isEmpty()) {
            var player = Bukkit.getPlayer(request.getName());

            if (player != null) {
                responseBuilder.setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player));
            } else {
                responseBuilder.setStatus(
                    CommandStatus.newBuilder()
                        .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                        .setExtra(request.getName())
                        .build());
            }
        } else {
            responseBuilder.setStatus(
                CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.INVALID_ARGUMENT)
                    .setExtra("OnlinePlayerRequest.name or OnlinePlayerRequest.uuid")
                    .build());
        }

        return responseBuilder.build();
    }
}
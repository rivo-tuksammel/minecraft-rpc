package com.yplugins.minecraftrpc.rpc.handlers.entity;

import java.util.UUID;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.PlayerRequest;
import com.yplugins.minecraftrpc.proto.PlayerResponse;
import com.yplugins.minecraftrpc.proto.Status;
import com.yplugins.minecraftrpc.proto.StatusCode;
import com.yplugins.minecraftrpc.rpc.mappers.PlayerMapper;

public class RPCPlayerHandler {
    private final MinecraftRPC plugin;

    public RPCPlayerHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerResponse handleGetPlayerRequest(PlayerRequest request) {
        PlayerResponse.Builder responseBuilder = PlayerResponse.newBuilder();

        if (!request.getUuid().isEmpty()) {
            var player = Bukkit.getPlayer(UUID.fromString(request.getUuid()));

            if (player != null) {
                responseBuilder.setPlayer(PlayerMapper.mapPlayerToRPC(player));
            } else {
                responseBuilder.setStatus(Status.newBuilder()
                        .setCode(StatusCode.PLAYER_NOT_FOUND)
                        .setExtra(request.getUuid())
                        .build());
            }
        } else if (!request.getName().isEmpty()) {
            var player = Bukkit.getPlayer(request.getName());

            if (player != null) {
                responseBuilder.setPlayer(PlayerMapper.mapPlayerToRPC(player));
            } else {
                responseBuilder.setStatus(Status.newBuilder()
                        .setCode(StatusCode.PLAYER_NOT_FOUND)
                        .setExtra(request.getName())
                        .build());
            }
        } else {
            responseBuilder.setStatus(Status.newBuilder()
                    .setCode(StatusCode.INVALID_ARGUMENT)
                    .setExtra("PlayerRequest.name or PlayerRequest.uuid")
                    .build());
        }

        return responseBuilder.build();
    }
}

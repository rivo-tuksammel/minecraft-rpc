package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class PlayerFlightHandler {
    private final MinecraftRPC plugin;

    public PlayerFlightHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerSetAllowFlightResponse handleSetAllowFlightRequest(PlayerSetAllowFlightRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetAllowFlightResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setAllowFlight(request.getAllowFlight());
            });

            return PlayerSetAllowFlightResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetAllowFlightResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayerUniqueId())
                .build())
            .build();
    }
}
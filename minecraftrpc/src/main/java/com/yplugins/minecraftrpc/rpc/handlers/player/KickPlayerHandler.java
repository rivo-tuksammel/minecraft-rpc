package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.PlayerKickRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerKickResponse;

public class KickPlayerHandler {
    private final MinecraftRPC plugin;

    public KickPlayerHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerKickResponse handleKickPlayerRequest (PlayerKickRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerKickResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = Bukkit.getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                var reason = request.getReason();

                if (reason != null && !reason.isEmpty()) {
                    player.kickPlayer(reason);
                } else {
                    player.kickPlayer("You have been kicked from the server.");
                }

            });

            return PlayerKickResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        } 

        return PlayerKickResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayer().getUuid())
                .build())
            .build();
    }
}
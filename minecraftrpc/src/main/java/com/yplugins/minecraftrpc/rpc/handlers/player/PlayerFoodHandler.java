package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class PlayerFoodHandler {
    private final MinecraftRPC plugin;

    public PlayerFoodHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerSetFoodLevelResponse handleSetFoodLevelRequest(PlayerSetFoodLevelRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetFoodLevelResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }
        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setFoodLevel(request.getFoodLevel());
            });

            return PlayerSetFoodLevelResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetFoodLevelResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayerUniqueId())
                .build())
            .build();
    }
}
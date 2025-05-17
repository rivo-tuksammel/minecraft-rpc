package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class PlayerExperienceHandler {
    
    private final MinecraftRPC plugin;

    public PlayerExperienceHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerSetExperienceResponse handleSetPlayerExpRequest(PlayerSetExperienceRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetExperienceResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }
        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setExp(request.getExperience());
            });

            return PlayerSetExperienceResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetExperienceResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayerUniqueId())
                .build())
            .build();
    }


    public PlayerSetTotalExperienceResponse handleSetPlayerTotalExpRequest(PlayerSetTotalExperienceRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetTotalExperienceResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setTotalExperience(request.getTotalExperience());
            });

            return PlayerSetTotalExperienceResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetTotalExperienceResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayerUniqueId())
                .build())
            .build();
    }

    public PlayerSetLevelResponse handleSetPlayerLevelRequest(PlayerSetLevelRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetLevelResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setLevel(request.getLevel());
            });

            return PlayerSetLevelResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetLevelResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(request.getPlayerUniqueId())
                .build())
            .build();
    }
}

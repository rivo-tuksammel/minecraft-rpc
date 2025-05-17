package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class PlayerHealthHandler {
    
    private final MinecraftRPC plugin;
    public PlayerHealthHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerSetHealthResponse handleSetPlayerHealthRequest (PlayerSetHealthRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetHealthResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                var health = request.getHealth();
                if (health > player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()) {
                    health = (float)player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
                }
                player.setHealth(health);
            });

            return PlayerSetHealthResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        } 

        return PlayerSetHealthResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(playerUID.toString())
                .build())
            .build();
    }


    public PlayerSetMaxHealthResponse handleSetPlayerMaxHealthRequest(PlayerSetMaxHealthRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };


        if (playerUID == null) {
            return PlayerSetMaxHealthResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);

        if (player != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(request.getMaxHealth());
            });

            return PlayerSetMaxHealthResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        } 

        return PlayerSetMaxHealthResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(playerUID.toString())
                .build())
            .build();
    }
}
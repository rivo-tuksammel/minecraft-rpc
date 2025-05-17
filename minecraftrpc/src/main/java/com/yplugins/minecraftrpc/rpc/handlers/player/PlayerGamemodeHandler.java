package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import org.bukkit.GameMode;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;

public class PlayerGamemodeHandler {

    private final MinecraftRPC plugin;
    public PlayerGamemodeHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public PlayerSetGamemodeResponse handleSetPlayerGamemodeRequest(PlayerSetGamemodeRequest request) {

        UUID playerUID = switch (request.getIdentifierCase()) {
            case PLAYER -> UUID.fromString(request.getPlayer().getUuid());
            case PLAYERUNIQUEID -> UUID.fromString(request.getPlayerUniqueId());
            case IDENTIFIER_NOT_SET -> null;
        };

        if (playerUID == null) {
            return PlayerSetGamemodeResponse.newBuilder()
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.MISSING_ARGUMENT)
                    .setExtra("Player Unique ID or Player is required")
                    .build())
                .build();
        }

        var player = plugin.getServer().getPlayer(playerUID);
        GameMode gameMode = switch (request.getGamemode()) {
            case SURVIVAL -> GameMode.SURVIVAL;
            case CREATIVE -> GameMode.CREATIVE;
            case ADVENTURE -> GameMode.ADVENTURE;
            case SPECTATOR -> GameMode.SPECTATOR;
            default -> null;
        };

        if (player != null && gameMode != null) {
            plugin.gameThreadExecutor().run(() -> {
                player.setGameMode(gameMode);
            });

            return PlayerSetGamemodeResponse.newBuilder()
                .setPlayer(OnlinePlayerMapper.mapPlayerToRPC(player))
                .setStatus(CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.OK)
                    .build())
                .build();
        }

        return PlayerSetGamemodeResponse.newBuilder()
            .setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.PLAYER_NOT_FOUND)
                .setExtra(playerUID.toString())
                .build())
            .build();
    }
}

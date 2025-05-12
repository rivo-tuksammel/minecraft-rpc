package com.yplugins.minecraftrpc.rpc.handlers.entity;

import java.util.UUID;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.EntityLocation;
import com.yplugins.minecraftrpc.proto.Player;
import com.yplugins.minecraftrpc.proto.PlayerRequest;
import com.yplugins.minecraftrpc.proto.PlayerResponse;
import com.yplugins.minecraftrpc.proto.Status;
import com.yplugins.minecraftrpc.proto.StatusCode;
import com.yplugins.minecraftrpc.proto.Vec3f;
import com.yplugins.minecraftrpc.proto.World;
import com.yplugins.minecraftrpc.proto.WorldInfo;

public class RPCPlayerHandler {
    private final MinecraftRPC plugin;

    public RPCPlayerHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    private static Player mapPlayerToRPC(org.bukkit.entity.Player player) {
        Player.Builder playerBuilder = Player.newBuilder();

        playerBuilder.setName(player.getName());
        playerBuilder.setUuid(player.getUniqueId().toString());
        playerBuilder.setPing(player.getPing());

        EntityLocation.Builder locationBuilder = EntityLocation.newBuilder();

        World.Builder worldBuilder = World.newBuilder();
        var playerWorld = player.getWorld();

        worldBuilder.setName(playerWorld.getName());
        worldBuilder.setInfo(WorldInfo.newBuilder()
            .setKey(playerWorld.getKey().getNamespace())
            .setPvp(playerWorld.getPVP())
        );

        locationBuilder.setWorld(worldBuilder);
        locationBuilder.setPos(Vec3f.newBuilder()
            .setX((float) player.getLocation().getX())
            .setY((float) player.getLocation().getY())
            .setZ((float) player.getLocation().getZ())
        );

        playerBuilder.setLocation(locationBuilder);

        return playerBuilder.build();
    }

    public PlayerResponse handleGetPlayerRequest(PlayerRequest request) {
        PlayerResponse.Builder responseBuilder = PlayerResponse.newBuilder();

        if (!request.getUuid().isEmpty()) {
            var player = Bukkit.getPlayer(UUID.fromString(request.getUuid()));

            if (player != null) {
                responseBuilder.setPlayer(mapPlayerToRPC(player));
            } else {
                responseBuilder.setStatus(Status.newBuilder()
                        .setCode(StatusCode.PLAYER_NOT_FOUND)
                        .setExtra(request.getUuid())
                        .build());
            }
        } else if (!request.getName().isEmpty()) {
            var player = Bukkit.getPlayer(request.getName());

            if (player != null) {
                responseBuilder.setPlayer(mapPlayerToRPC(player));
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

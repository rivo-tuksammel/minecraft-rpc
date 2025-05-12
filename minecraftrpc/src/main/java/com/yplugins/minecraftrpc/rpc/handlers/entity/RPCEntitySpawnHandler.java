package com.yplugins.minecraftrpc.rpc.handlers.entity;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.Entity;
import com.yplugins.minecraftrpc.proto.SpawnEntityRequest;
import com.yplugins.minecraftrpc.proto.SpawnedEntityResponse;
import com.yplugins.minecraftrpc.proto.Status;
import com.yplugins.minecraftrpc.proto.StatusCode;
import com.yplugins.minecraftrpc.rpc.mappers.LocationMapper;

public class RPCEntitySpawnHandler {

    private final MinecraftRPC plugin;

    public RPCEntitySpawnHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public SpawnedEntityResponse handleSpawnEntityRequest(SpawnEntityRequest request) {

        SpawnedEntityResponse.Builder responseBuilder = SpawnedEntityResponse.newBuilder();

        // Validate that the request has a valid entity type.
        if (request.getType().isEmpty()) {
            responseBuilder.setStatus(Status.newBuilder().setCode(StatusCode.INVALID_ARGUMENT).setExtra("Entity.type").build());
            return responseBuilder.build();
        } 

        if (!request.hasLocation()) {
            responseBuilder.setStatus(Status.newBuilder().setCode(StatusCode.INVALID_ARGUMENT).setExtra("Entity.position").build());
            return responseBuilder.build();
        } 

        World world = request.getLocation().getWorld() != null ? Bukkit.getWorld(request.getLocation().getWorld().getNamespace()) : Bukkit.getWorlds().stream().findFirst().orElse(null);
        if (world == null) {
            responseBuilder.setStatus(Status.newBuilder().setCode(StatusCode.INVALID_ARGUMENT).setExtra("Entity.world").build());
            return responseBuilder.build();
        } 

        EntityType entityType;
        try {
            entityType = EntityType.valueOf(request.getType());
        } catch (IllegalArgumentException e) {
            responseBuilder.setStatus(Status.newBuilder().setCode(StatusCode.ENTITY_TYPE_NOT_FOUND).setExtra(request.getType()).build());
            return responseBuilder.build();
        }
        
        if (!entityType.isSpawnable()) {
            responseBuilder.setStatus(Status.newBuilder().setCode(StatusCode.ENTITY_NOT_SPAWNABLE).setExtra(request.getType()).build());
            return responseBuilder.build();
        }

        var spawnCords = request.getLocation().getPos();
        var spawnLocation = new Location(world, spawnCords.getX(), spawnCords.getY(), spawnCords.getZ());

        plugin.gameThreadExecutor().run(() -> {
            world.spawnEntity(spawnLocation, entityType);
        });

        return responseBuilder
                .setStatus(Status.newBuilder().setCode(StatusCode.OK).build())
                .setEntity(Entity.newBuilder()
                        .setType(request.getType())
                        .setLocation(
                            LocationMapper.mapLocationToRPC(spawnLocation)
                        ))
                .build();

    }
}

package com.yplugins.minecraftrpc.rpc.handlers.entity;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.rpc.mappers.LocationMapper;
import com.yplugins.minecraftrpc.proto.entity.CommandStatus;
import com.yplugins.minecraftrpc.proto.entity.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.entity.Entity;
import com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest;
import com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse;

public class EntitySpawnHandler {

    private final MinecraftRPC plugin;

    public EntitySpawnHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public SpawnEntityResponse handleSpawnEntityRequest(SpawnEntityRequest request) {

        SpawnEntityResponse.Builder responseBuilder = SpawnEntityResponse.newBuilder();

        // Validate that the request has a valid entity type.
        if (request.getType().isEmpty()) {
            responseBuilder.setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.INVALID_ARGUMENT).setExtra("Entity.type").build());
            return responseBuilder.build();
        } 

        if (!request.hasLocation()) {
            responseBuilder.setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.INVALID_ARGUMENT).setExtra("Entity.position").build());
            return responseBuilder.build();
        } 

        World world = request.getLocation().getDimension() != null ?
              Bukkit.getWorld(request.getLocation().getDimension().getName()) :
              Bukkit.getWorlds().stream().findFirst().orElse(null);
        if (world == null) {
            responseBuilder.setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.INVALID_ARGUMENT).setExtra("Entity.world").build());
            return responseBuilder.build();
        } 

        EntityType entityType;
        try {
            entityType = EntityType.valueOf(request.getType());
        } catch (IllegalArgumentException e) {
            responseBuilder.setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.ENTITY_TYPE_NOT_FOUND).setExtra(request.getType()).build());
            return responseBuilder.build();
        }
        
        if (!entityType.isSpawnable()) {
            responseBuilder.setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.ENTITY_NOT_SPAWNABLE).setExtra(request.getType()).build());
            return responseBuilder.build();
        }

        var spawnCords = request.getLocation().getPos();
        var spawnLocation = new Location(world, spawnCords.getX(), spawnCords.getY(), spawnCords.getZ());

        plugin.gameThreadExecutor().run(() -> {
            world.spawnEntity(spawnLocation, entityType);
        });

        return responseBuilder
                .setStatus(CommandStatus.newBuilder().setCode(CommandStatusCode.OK).build())
                .setEntity(Entity.newBuilder()
                        .setType(request.getType())
                        .setLocation(
                            LocationMapper.mapLocationToRPC(spawnLocation)
                        ))
                .build();
    }
}

package com.yplugins.minecraftrpc.rpc.handlers.world;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.world.CommandStatus;
import com.yplugins.minecraftrpc.proto.world.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.world.GetWorldRequest;
import com.yplugins.minecraftrpc.proto.world.GetWorldResponse;
import com.yplugins.minecraftrpc.proto.world.WorldListRequest;
import com.yplugins.minecraftrpc.proto.world.WorldListResponse;
import com.yplugins.minecraftrpc.rpc.mappers.WorldMapper;

public class WorldHandler {
    private final MinecraftRPC plugin;

    public WorldHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public WorldListResponse handleGetWorldListRequest(WorldListRequest request) {
        WorldListResponse.Builder responseBuilder = WorldListResponse.newBuilder();
        // Assuming you have a method to get the list of worlds
        for (org.bukkit.World world : plugin.getServer().getWorlds()) {
            com.yplugins.minecraftrpc.proto.world.World worldProto =  WorldMapper.mapWorldToRPC(world);
            responseBuilder.addWorlds(worldProto);
        }
        responseBuilder.setStatus(CommandStatus.newBuilder()
                .setCode(CommandStatusCode.OK)
                .build());

        return responseBuilder.build();
    }


    public GetWorldResponse handleGetWorldRequest(GetWorldRequest request) {
        GetWorldResponse.Builder responseBuilder = GetWorldResponse.newBuilder();

        var namespace = request.getName();

        if (namespace == null || namespace.isEmpty()) {
            return responseBuilder.setStatus(
                CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.INVALID_ARGUMENT)
                    .setExtra("World name is required")
                    )
                .build();
        } 

        var world = plugin.getServer().getWorld(namespace);
        if (world == null) {
            return responseBuilder.setStatus(
                CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.WORLD_NOT_FOUND)
                    .setExtra(namespace)
                    )
                .build();
        }

        responseBuilder.setWorld(WorldMapper.mapWorldToRPC(world));

        return responseBuilder.setStatus(
            CommandStatus.newBuilder()
                .setCode(CommandStatusCode.OK)
                )
            .build();
    }
}
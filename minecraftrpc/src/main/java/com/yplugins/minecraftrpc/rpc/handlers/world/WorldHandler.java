package com.yplugins.minecraftrpc.rpc.handlers.world;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.world.CommandStatus;
import com.yplugins.minecraftrpc.proto.world.CommandStatusCode;
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
}
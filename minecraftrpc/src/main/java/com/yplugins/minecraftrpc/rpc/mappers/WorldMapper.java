package com.yplugins.minecraftrpc.rpc.mappers;

class WorldMapper {

    public static com.yplugins.minecraftrpc.proto.world.World mapWorldToRPC(org.bukkit.World world) {
        com.yplugins.minecraftrpc.proto.world.World.Builder worldBuilder = com.yplugins.minecraftrpc.proto.world.World.newBuilder();
        worldBuilder.setName(world.getName());
        return worldBuilder.build();
    }

    
}

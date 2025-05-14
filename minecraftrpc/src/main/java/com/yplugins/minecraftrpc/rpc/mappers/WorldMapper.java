package com.yplugins.minecraftrpc.rpc.mappers;

import com.yplugins.minecraftrpc.proto.world.Difficulty;
import com.yplugins.minecraftrpc.proto.world.WorldInfo;

public class WorldMapper {

    public static com.yplugins.minecraftrpc.proto.world.World mapWorldToRPC(org.bukkit.World world) {
        com.yplugins.minecraftrpc.proto.world.World.Builder worldBuilder = com.yplugins.minecraftrpc.proto.world.World.newBuilder();
        worldBuilder.setName(world.getName());
        worldBuilder.setSeed(world.getSeed());
        
        var worldInfo = WorldInfo.newBuilder()
            .setIsPVP(world.getPVP())
            .setIsHardcore(world.isHardcore())
            .setIsClearWeather(world.isClearWeather())
            .setIsThundering(world.isThundering())
            .setIsUltraWarm(world.isUltraWarm())
            .setKey(world.getKey().toString())
            .setDifficulty(Difficulty.forNumber(world.getDifficulty().ordinal()));

        worldBuilder.setInfo(worldInfo);

        return worldBuilder.build();
    }
}

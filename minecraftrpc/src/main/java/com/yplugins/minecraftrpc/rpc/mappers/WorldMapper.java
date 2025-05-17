package com.yplugins.minecraftrpc.rpc.mappers;

import com.yplugins.minecraftrpc.proto.world.Difficulty;
import com.yplugins.minecraftrpc.proto.world.WeatherState;
import com.yplugins.minecraftrpc.proto.world.WorldInfo;

public class WorldMapper {

    public static com.yplugins.minecraftrpc.proto.world.World mapWorldToRPC(org.bukkit.World world) {
        com.yplugins.minecraftrpc.proto.world.World.Builder worldBuilder = com.yplugins.minecraftrpc.proto.world.World.newBuilder();
        worldBuilder.setName(world.getName());
        worldBuilder.setSeed(world.getSeed());

        var weatherState = world.isClearWeather() ? WeatherState.CLEAR : 
            world.isThundering() ? WeatherState.THUNDER : 
            world.hasStorm() ? WeatherState.STORM :
            WeatherState.UNRECOGNIZED;

        var weatherInfo = com.yplugins.minecraftrpc.proto.world.WeatherInfo.newBuilder()
        .setCurrentWeather(weatherState)
        .setDuration(world.getWeatherDuration());
        
        var worldInfo = WorldInfo.newBuilder()
            .setIsPVP(world.getPVP())
            .setIsHardcore(world.isHardcore())
            .setIsUltraWarm(world.isUltraWarm())
            .setKey(world.getKey().toString())
            .setWeatherInfo(weatherInfo)
            .setDifficulty(Difficulty.forNumber(world.getDifficulty().ordinal()));

        worldBuilder.setInfo(worldInfo);

        return worldBuilder.build();
    }
}

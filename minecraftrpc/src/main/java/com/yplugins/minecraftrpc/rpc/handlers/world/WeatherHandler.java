package com.yplugins.minecraftrpc.rpc.handlers.world;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.world.CommandStatus;
import com.yplugins.minecraftrpc.proto.world.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.world.SetWeatherRequest;
import com.yplugins.minecraftrpc.proto.world.SetWeatherResponse;

public class WeatherHandler {
    
    private final MinecraftRPC plugin;

    public WeatherHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public SetWeatherResponse handleSetWeatherRequest(SetWeatherRequest request) {
        SetWeatherResponse.Builder responseBuilder = SetWeatherResponse.newBuilder();

        var worldName = request.getName();

        if (worldName == null || worldName.isEmpty()) {
            return responseBuilder.setStatus(
                CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.INVALID_ARGUMENT)
                    .setExtra("World name is required")
                    )
                .build();
        } 

        var world = plugin.getServer().getWorld(worldName);

        if (world == null) {
            return responseBuilder.setStatus(
                CommandStatus.newBuilder()
                    .setCode(CommandStatusCode.WORLD_NOT_FOUND)
                    .setExtra(worldName)
                    )
                .build();
        }

        CompletableFuture<Void> setWeatherFuture = new CompletableFuture<>();
        Runnable setWeather = () -> {
                switch (request.getWeather()) {
                    case CLEAR:
                        world.setStorm(false);
                        world.setThundering(false);
                        world.setWeatherDuration(request.getDuration());
                        break;

                    case STORM:
                        world.setStorm(true);
                        world.setThundering(false);
                        world.setWeatherDuration(request.getDuration());
                        break;

                    case THUNDER:
                        world.setStorm(true);
                        world.setThundering(true);
                        world.setWeatherDuration(request.getDuration());
                        break;

                    case UNRECOGNIZED:
                        responseBuilder.setStatus(
                            CommandStatus.newBuilder()
                                .setCode(CommandStatusCode.WEATHER_CONTROL_FAILED)
                                .setExtra("Weather type is not recognized")
                                )
                            .build();

                        setWeatherFuture.complete(null);
                }

                responseBuilder.setStatus(
                    CommandStatus.newBuilder()
                        .setCode(CommandStatusCode.OK)
                        .build()).build();

                setWeatherFuture.complete(null);
                return;
        };

        plugin.gameThreadExecutor().run(setWeather);
        setWeatherFuture.join();
        return responseBuilder.build();
    }
}

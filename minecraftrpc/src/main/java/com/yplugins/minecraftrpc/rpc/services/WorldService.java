package com.yplugins.minecraftrpc.rpc.services;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.world.CommandStatus;
import com.yplugins.minecraftrpc.proto.world.GetWorldRequest;
import com.yplugins.minecraftrpc.proto.world.GetWorldResponse;
import com.yplugins.minecraftrpc.proto.world.SetWeatherRequest;
import com.yplugins.minecraftrpc.proto.world.SetWeatherResponse;
import com.yplugins.minecraftrpc.proto.world.WeatherResponse;
import com.yplugins.minecraftrpc.proto.world.WorldListRequest;
import com.yplugins.minecraftrpc.proto.world.WorldListResponse;
import com.yplugins.minecraftrpc.proto.world.WorldRequest;
import com.yplugins.minecraftrpc.rpc.handlers.world.WeatherHandler;
import com.yplugins.minecraftrpc.rpc.handlers.world.WorldHandler;

import io.grpc.stub.StreamObserver;

public class WorldService extends com.yplugins.minecraftrpc.proto.world.MinecraftWorldGrpc.MinecraftWorldImplBase {

    private final MinecraftRPC plugin;
    private final WorldHandler worldHandler;
    private final WeatherHandler weatherHandler;

    public WorldService(MinecraftRPC plugin) {
        this.plugin = plugin;
        this.worldHandler = new WorldHandler(plugin);
        this.weatherHandler = new WeatherHandler(plugin);
    }

    @Override
    public void getWorldList(WorldListRequest request, StreamObserver<WorldListResponse> responseObserver) {
        WorldListResponse response = worldHandler.handleGetWorldListRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    
    @Override
    public void getWorld(GetWorldRequest request, StreamObserver<GetWorldResponse> responseObserver) {
        GetWorldResponse response = worldHandler.handleGetWorldRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setWeather(SetWeatherRequest request, StreamObserver<SetWeatherResponse> responseObserver) {
        SetWeatherResponse response = weatherHandler.handleSetWeatherRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

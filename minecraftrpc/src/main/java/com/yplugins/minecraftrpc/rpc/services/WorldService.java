package com.yplugins.minecraftrpc.rpc.services;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.world.WorldListRequest;
import com.yplugins.minecraftrpc.proto.world.WorldListResponse;
import com.yplugins.minecraftrpc.rpc.handlers.world.WorldHandler;

import io.grpc.stub.StreamObserver;

public class WorldService extends com.yplugins.minecraftrpc.proto.world.MinecraftWorldGrpc.MinecraftWorldImplBase {

    private final MinecraftRPC plugin;
    private final WorldHandler worldHandler;

    public WorldService(MinecraftRPC plugin) {
        this.plugin = plugin;
        this.worldHandler = new WorldHandler(plugin);
    }

    @Override
    public void getWorldList(WorldListRequest request, StreamObserver<WorldListResponse> responseObserver) {
        WorldListResponse response = worldHandler.handleGetWorldListRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

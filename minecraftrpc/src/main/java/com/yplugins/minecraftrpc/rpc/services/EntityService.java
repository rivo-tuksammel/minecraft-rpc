package com.yplugins.minecraftrpc.rpc.services;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.entity.MinecraftEntityGrpc.MinecraftEntityImplBase;
import com.yplugins.minecraftrpc.rpc.handlers.entity.EntitySpawnHandler;
import com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest;
import com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse;

import io.grpc.stub.StreamObserver;

public class EntityService extends MinecraftEntityImplBase {

    private final EntitySpawnHandler entitySpawnHandler;

    public EntityService(MinecraftRPC plugin) {
        this.entitySpawnHandler = new EntitySpawnHandler(plugin);
    }

    @Override
    public void spawnEntity(SpawnEntityRequest request, StreamObserver<SpawnEntityResponse> responseObserver) {
        SpawnEntityResponse response = entitySpawnHandler.handleSpawnEntityRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

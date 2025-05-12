package com.yplugins.minecraftrpc.rpc.services;

import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

import com.yplugins.minecraftrpc.proto.Player;
import com.yplugins.minecraftrpc.proto.PlayerRequest;
import com.yplugins.minecraftrpc.proto.PlayerResponse;
import com.yplugins.minecraftrpc.proto.PlayersRequest;
import com.yplugins.minecraftrpc.proto.PlayersResponse;
import com.yplugins.minecraftrpc.proto.SpawnedEntityResponse;
import com.yplugins.minecraftrpc.proto.Status;
import com.yplugins.minecraftrpc.proto.StatusCode;
import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.Entity;
import com.yplugins.minecraftrpc.proto.MinecraftGrpc.MinecraftImplBase;
import com.yplugins.minecraftrpc.rpc.handlers.entity.RPCEntitySpawnHandler;
import com.yplugins.minecraftrpc.rpc.handlers.entity.RPCPlayerHandler;

import io.grpc.stub.StreamObserver;

public class CommandService extends MinecraftImplBase {

    private final RPCEntitySpawnHandler entitySpawnHandler;
    private final RPCPlayerHandler playerHandler;

    public CommandService(MinecraftRPC plugin) {
        this.entitySpawnHandler = new RPCEntitySpawnHandler(plugin);
        this.playerHandler = new RPCPlayerHandler(plugin);
    }
    
    @Override
    public void spawnEntity(Entity request, StreamObserver<SpawnedEntityResponse> responseObserver) {
        SpawnedEntityResponse response = entitySpawnHandler.handleSpawnEntityRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void getPlayers(PlayersRequest request, StreamObserver<PlayersResponse> responseObserver) {
        PlayersResponse response = PlayersResponse.newBuilder()
                .addAllPlayers(
                    Bukkit.getOnlinePlayers().stream().map(player -> {
                        return Player.newBuilder()
                                .setName(player.getName())
                                .setUuid(player.getUniqueId().toString())
                                .setPing(player.getPing())
                                .build();
                    }).toList()
                )
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPlayer(PlayerRequest request, StreamObserver<PlayerResponse> responseObserver) {
        
    }

    
}

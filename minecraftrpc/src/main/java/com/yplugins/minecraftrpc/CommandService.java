package com.yplugins.minecraftrpc;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.proto.Player;
import com.yplugins.minecraftrpc.proto.PlayerRequest;
import com.yplugins.minecraftrpc.proto.PlayerResponse;
import com.yplugins.minecraftrpc.proto.Status;
import com.yplugins.minecraftrpc.proto.CommandRequest;
import com.yplugins.minecraftrpc.proto.MinecraftGrpc.MinecraftImplBase;

import io.grpc.stub.StreamObserver;

public class CommandService extends MinecraftImplBase {

    public CommandService(MinecraftRPC plugin) {
    }

    @Override
    public void getPlayers(PlayerRequest request, StreamObserver<PlayerResponse> responseObserver) {
        PlayerResponse response = PlayerResponse.newBuilder()
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
}

package com.yplugins.minecraftrpc.rpc.services;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerKickRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerKickResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodSaturationRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetFoodSaturationResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse;
import com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest;
import com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse;
import com.yplugins.minecraftrpc.rpc.handlers.player.KickPlayerHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.OnlinePlayerHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.PlayerExperienceHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.PlayerFlightHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.PlayerFoodHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.PlayerGamemodeHandler;
import com.yplugins.minecraftrpc.rpc.handlers.player.PlayerHealthHandler;

import io.grpc.stub.StreamObserver;

public class PlayerService extends com.yplugins.minecraftrpc.proto.player.MinecraftPlayerGrpc.MinecraftPlayerImplBase {

    private final OnlinePlayerHandler playerHandler;
    private final KickPlayerHandler kickPlayerHandler;
    private final PlayerHealthHandler playerHealthHandler;
    private final PlayerGamemodeHandler playerGamemodeHandler;
    private final PlayerFlightHandler playerFlightHandler;
    private final PlayerExperienceHandler playerExperienceHandler;
    private final PlayerFoodHandler playerFoodHandler;

    public PlayerService(MinecraftRPC plugin) {
        this.playerHandler = new OnlinePlayerHandler(plugin);
        this.kickPlayerHandler = new KickPlayerHandler(plugin);
        this.playerHealthHandler = new PlayerHealthHandler(plugin);
        this.playerGamemodeHandler = new PlayerGamemodeHandler(plugin);
        this.playerFlightHandler = new PlayerFlightHandler(plugin);
        this.playerExperienceHandler = new PlayerExperienceHandler(plugin);
        this.playerFoodHandler = new PlayerFoodHandler(plugin);
    }

    @Override
    public void getOnlinePlayer(OnlinePlayerRequest request, StreamObserver<OnlinePlayerResponse> responseObserver) {
        OnlinePlayerResponse response = playerHandler.handleGetOnlinePlayerRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOnlinePlayers(OnlinePlayersRequest request, StreamObserver<OnlinePlayersResponse> responseObserver) {
        OnlinePlayersResponse response = playerHandler.handleGetOnlinePlayersRequest (request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void kickPlayer(PlayerKickRequest request, StreamObserver<PlayerKickResponse> responseObserver) {
        PlayerKickResponse response = kickPlayerHandler.handleKickPlayerRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerHealth(PlayerSetHealthRequest request, StreamObserver<PlayerSetHealthResponse> responseObserver) {
        PlayerSetHealthResponse response = playerHealthHandler.handleSetPlayerHealthRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerMaxHealth(PlayerSetMaxHealthRequest request, StreamObserver<PlayerSetMaxHealthResponse> responseObserver) {
        PlayerSetMaxHealthResponse response = playerHealthHandler.handleSetPlayerMaxHealthRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerGamemode(PlayerSetGamemodeRequest request, StreamObserver<PlayerSetGamemodeResponse> responseObserver) {
        PlayerSetGamemodeResponse response = playerGamemodeHandler.handleSetPlayerGamemodeRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerAllowFlight(PlayerSetAllowFlightRequest request, StreamObserver<PlayerSetAllowFlightResponse> responseObserver) {
        PlayerSetAllowFlightResponse response = playerFlightHandler.handleSetAllowFlightRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerExperience(PlayerSetExperienceRequest request, StreamObserver<PlayerSetExperienceResponse> responseObserver) {
        PlayerSetExperienceResponse response = playerExperienceHandler.handleSetPlayerExpRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerTotalExperience(PlayerSetTotalExperienceRequest request, StreamObserver<PlayerSetTotalExperienceResponse> responseObserver) {
        PlayerSetTotalExperienceResponse response = playerExperienceHandler.handleSetPlayerTotalExpRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerLevel(PlayerSetLevelRequest request, StreamObserver<PlayerSetLevelResponse> responseObserver) {
        PlayerSetLevelResponse response = playerExperienceHandler.handleSetPlayerLevelRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setPlayerFoodLevel(PlayerSetFoodLevelRequest request, StreamObserver<PlayerSetFoodLevelResponse> responseObserver) {
        PlayerSetFoodLevelResponse response = playerFoodHandler.handleSetFoodLevelRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
package com.yplugins.minecraftrpc.rpc.services;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.chat.BroadcastMessageRequest;
import com.yplugins.minecraftrpc.proto.chat.BroadcastMessageResponse;
import com.yplugins.minecraftrpc.proto.chat.MinecraftChatGrpc.MinecraftChatImplBase;
import com.yplugins.minecraftrpc.rpc.handlers.chat.MessageBroadcastHandler;

import io.grpc.stub.StreamObserver;

public class ChatService extends MinecraftChatImplBase {

    private final MinecraftRPC plugin;
    private final MessageBroadcastHandler messageBroadcastHandler;

    public ChatService(MinecraftRPC plugin) {
        this.plugin = plugin;
        this.messageBroadcastHandler = new MessageBroadcastHandler(plugin);
    }

    @Override
    public void broadcastMessage(BroadcastMessageRequest request, StreamObserver<BroadcastMessageResponse> responseObserver) {
        BroadcastMessageResponse response = messageBroadcastHandler.handleBroadcastMessageRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
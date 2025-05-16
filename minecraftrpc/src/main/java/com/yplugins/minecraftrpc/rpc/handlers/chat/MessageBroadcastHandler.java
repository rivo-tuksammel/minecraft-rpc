package com.yplugins.minecraftrpc.rpc.handlers.chat;

import org.bukkit.Bukkit;

import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.chat.BroadcastMessageRequest;
import com.yplugins.minecraftrpc.proto.chat.BroadcastMessageResponse;
import com.yplugins.minecraftrpc.proto.chat.CommandStatus;
import com.yplugins.minecraftrpc.proto.chat.CommandStatusCode;

public class MessageBroadcastHandler {
    private final MinecraftRPC plugin;

    public MessageBroadcastHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

    public BroadcastMessageResponse handleBroadcastMessageRequest(BroadcastMessageRequest request) {
        BroadcastMessageResponse.Builder responseBuilder = BroadcastMessageResponse.newBuilder();

        var playersReceived = Bukkit.broadcastMessage(request.getMessage());
        responseBuilder.setPlayersReceived(playersReceived);
        responseBuilder.setStatus(
        CommandStatus.newBuilder()
            .setCode(CommandStatusCode.OK)
            .build());

        return responseBuilder.build();
    }
}
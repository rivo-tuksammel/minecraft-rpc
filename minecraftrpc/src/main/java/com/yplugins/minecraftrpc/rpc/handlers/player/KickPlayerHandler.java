package com.yplugins.minecraftrpc.rpc.handlers.player;

import java.util.UUID;

import org.bukkit.Bukkit;

import com.google.common.collect.ImmutableList;
import com.yplugins.minecraftrpc.MinecraftRPC;
import com.yplugins.minecraftrpc.proto.player.CommandStatus;
import com.yplugins.minecraftrpc.proto.player.CommandStatusCode;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest;
import com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse;
import com.yplugins.minecraftrpc.rpc.mappers.OnlinePlayerMapper;

public class KickPlayerHandler {
    private final MinecraftRPC plugin;

    public KickPlayerHandler(MinecraftRPC plugin) {
        this.plugin = plugin;
    }

}
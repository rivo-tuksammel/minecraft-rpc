package com.yplugins.minecraftrpc;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.InetSocketAddress;
import org.bukkit.Bukkit;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import org.bukkit.plugin.java.JavaPlugin;

import com.yplugins.minecraftrpc.rpc.services.EntityService;
import com.yplugins.minecraftrpc.rpc.services.PlayerService;
import com.yplugins.minecraftrpc.rpc.services.WorldService;
import com.yplugins.minecraftrpc.utils.GameThreadExecutor;

public class MinecraftRPC extends JavaPlugin {

    private static final Logger logger = Bukkit.getLogger();
    private Server grpcServer = null;
    private GameThreadExecutor _gameThreadExecutor = null;

    public GameThreadExecutor gameThreadExecutor() {
        return this._gameThreadExecutor;
    }

    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        this._gameThreadExecutor = new GameThreadExecutor(this);

        logger.log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
        saveDefaultConfig(); // Save the default config.yml if it doesn't exist.

        var port = getConfig().getInt("port");
        var host = getConfig().getString("host");

        if (port <= 0 || port > 65535) {
            logger.log(Level.SEVERE, "Invalid port number: {0}", port);
            return;
        }

        if (host == null || host.isEmpty()) {
            logger.log(Level.SEVERE, "Invalid host: {0}", host);
            return;
        }

        logger.log(Level.INFO, String.format("Starting gRPC server on {0}:{1}") , new Object[]{host, port});
        var grpcAddress = new InetSocketAddress(host, port);

        var grpcServerBuilder = NettyServerBuilder
            .forAddress(grpcAddress)
            .addService(new EntityService(this))
            .addService(new PlayerService(this))
            .addService(new WorldService(this));

        this.grpcServer = grpcServerBuilder.build();

        try {
            this.grpcServer.start();
            logger.log(Level.INFO, "gRPC server started on {0}:{1}", new Object[]{host, port});
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to start gRPC server: {0}", e.getMessage());
            return;
        }
    }

    // This code is called before the server stops and after the /reload command
    @Override
    public void onDisable() {
        logger.log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
        this._gameThreadExecutor = null;
        if (this.grpcServer != null) {
            try {

                this.grpcServer.shutdown(); // Initiate an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
                this.grpcServer.awaitTermination();
                if(!this.grpcServer.awaitTermination(10, TimeUnit.SECONDS)) {
                    this.grpcServer.shutdownNow();
                }

                logger.log(Level.INFO, "gRPC server stopped");
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Failed to stop gRPC server: {0}", e.getMessage());
                this.grpcServer.shutdownNow();
            }
        }
    }
}

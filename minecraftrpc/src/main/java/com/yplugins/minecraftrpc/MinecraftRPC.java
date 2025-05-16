package com.yplugins.minecraftrpc;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.InetSocketAddress;
import java.security.KeyPair;
import java.security.Security;
import java.security.cert.X509Certificate;

import org.bukkit.Bukkit;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolConfig;
import io.grpc.netty.shaded.io.netty.handler.ssl.OpenSsl;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.yplugins.minecraftrpc.rpc.interceptors.AuthInterceptor;
import com.yplugins.minecraftrpc.rpc.services.ChatService;
import com.yplugins.minecraftrpc.rpc.services.EntityService;
import com.yplugins.minecraftrpc.rpc.services.PlayerService;
import com.yplugins.minecraftrpc.rpc.services.WorldService;
import com.yplugins.minecraftrpc.utils.GameThreadExecutor;
import com.yplugins.minecraftrpc.utils.SelfSignedCertGenerator;

public class MinecraftRPC extends JavaPlugin {

    private static final Logger logger = Bukkit.getLogger();
    private Server grpcServer = null;
    private GameThreadExecutor _gameThreadExecutor = null;

    public GameThreadExecutor gameThreadExecutor() {
        return this._gameThreadExecutor;
    }

    public MinecraftRPC() {
        Security.addProvider(new BouncyCastleProvider()); // Add BouncyCastle as a security provider for cryptographic operations.
    }


    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        this._gameThreadExecutor = new GameThreadExecutor(this);



        logger.log(Level.INFO, "{0}.onEnable()", this.getClass().getName());
        saveDefaultConfig(); // Save the default config.yml if it doesn't exist.

        var port = getConfig().getInt("port");
        var host = getConfig().getString("host");
        var token = getConfig().getString("token");

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

        try {
                KeyPair keyPair = SelfSignedCertGenerator.generateKeyPair();
                X509Certificate cert = SelfSignedCertGenerator.generateSelfSignedCertificate(keyPair);

                if (!OpenSsl.isAvailable()) {
                    logger.log(Level.SEVERE, "OpenSSL is not available: {0}", OpenSsl.unavailabilityCause());
                    return;
                }

                System.out.println("OpenSSL Available: " + OpenSsl.isAvailable());
                System.out.println("OpenSSL Version: " + OpenSsl.versionString());


                SslContext sslContext = SslContextBuilder
                    .forServer(keyPair.getPrivate(), cert)
                    .sslProvider(SslProvider.OPENSSL)
                    .applicationProtocolConfig(
                        new ApplicationProtocolConfig(
                            ApplicationProtocolConfig.Protocol.ALPN,
                            ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE,
                            ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT,
                            "h2",
                            "http/1.1"
                        )
                    )
                    .build();

                var grpcServerBuilder = NettyServerBuilder
                        .forAddress(grpcAddress)
                        .sslContext(sslContext) // Set the SSL context for the server.
                        .addService(new EntityService(this)) // Register the EntityService.
                        .addService(new PlayerService(this)) // Register the PlayerService.
                        .addService(new WorldService(this)) // Register the WorldService.
                        .addService(new ChatService(this)) // Register the ChatService.
                        // .addService(ProtoReflectionServiceV1.newInstance())
                        .addService(ProtoReflectionService.newInstance())
                        .intercept(new AuthInterceptor(token)) // Enable reflection for the gRPC server. For some reason it's deprecated, but POSTMAN doesn't work with the V1 version.
                        ; 

                this.grpcServer = grpcServerBuilder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

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
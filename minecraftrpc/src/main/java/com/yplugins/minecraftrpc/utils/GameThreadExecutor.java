package com.yplugins.minecraftrpc.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;


public class GameThreadExecutor {
    private final Plugin plugin;

    public GameThreadExecutor(Plugin plugin) {
        this.plugin = plugin;
    }

    public void run(Runnable task) {
        if (Bukkit.isPrimaryThread()) {
            task.run();
        } else {
            Bukkit.getScheduler().runTask(plugin, task);
        }
    }

    public <T> CompletableFuture<T> call(Callable<T> task) {
        CompletableFuture<T> future = new CompletableFuture<>();
        run(() -> {
            try {
                future.complete(task.call());
            } catch (Exception e) {
                future.completeExceptionally(e);
            }
        });
        return future;
    }
}

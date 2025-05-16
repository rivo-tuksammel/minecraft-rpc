package com.yplugins.minecraftrpc.rpc.mappers;

import com.yplugins.minecraftrpc.proto.world.Dimension;
import com.yplugins.minecraftrpc.proto.world.Orientation;

/**
 * A utility class for mapping Bukkit Location objects to their corresponding
 * RPC (Remote Procedure Call) representations.
 */
public class LocationMapper {

    /**
     * Maps a Bukkit Location object to a gRPC Location object.
     *
     * @param location The Bukkit Location object to be mapped.
     * @return A gRPC Location object representing the given Bukkit Location.
     * @throws IllegalArgumentException If the world in the provided Location is null.
     */
    public static com.yplugins.minecraftrpc.proto.world.Location mapLocationToRPC(org.bukkit.Location location) {
        com.yplugins.minecraftrpc.proto.world.Location.Builder locationBuilder = com.yplugins.minecraftrpc.proto.world.Location.newBuilder();

        locationBuilder.setPos(
            com.yplugins.minecraftrpc.proto.types.Vec3f.newBuilder()
                .setX((float) location.getX())
                .setY((float) location.getY())
                .setZ((float) location.getZ())
        );

        if (location.getWorld() == null) {
            throw new IllegalArgumentException("World cannot be null");
        }

        locationBuilder.setDimension(
            Dimension.newBuilder()
                .setName(location.getWorld().getName())
        );

        locationBuilder.setOrientation(
            Orientation.newBuilder()
                .setPitch((float) location.getPitch())
                .setYaw((float) location.getYaw())
        );

        return locationBuilder.build();
    }
}
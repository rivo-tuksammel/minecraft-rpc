package com.yplugins.minecraftrpc.rpc.mappers;

/**
 * A utility class for mapping Bukkit Player objects to their corresponding
 * RPC (Remote Procedure Call) Player representations.
 */
public class OnlinePlayerMapper {
    /**
     * Maps a Bukkit Player object to a protobuf Player object for RPC communication.
     *
     * @param player The Bukkit Player object to be mapped.
     * @return A protobuf Player object containing the mapped data.
     */
    public static com.yplugins.minecraftrpc.proto.player.OnlinePlayer mapPlayerToRPC(org.bukkit.entity.Player player) {
        com.yplugins.minecraftrpc.proto.player.OnlinePlayer.Builder playerBuilder = com.yplugins.minecraftrpc.proto.player.OnlinePlayer.newBuilder();

        playerBuilder.setName(player.getName());
        playerBuilder.setUuid(player.getUniqueId().toString());
        playerBuilder.setAddress(player.getAddress().getHostString());
        playerBuilder.setPing(player.getPing());

        playerBuilder.setLocation(LocationMapper.mapLocationToRPC(player.getLocation()));

        return playerBuilder.build();
    }
}

package com.yplugins.minecraftrpc.rpc.mappers;

/**
 * A utility class for mapping Bukkit Player objects to their corresponding
 * RPC (Remote Procedure Call) Player representations.
 */
public class PlayerMapper {
    /**
     * Maps a Bukkit Player object to a protobuf Player object for RPC communication.
     *
     * @param player The Bukkit Player object to be mapped.
     * @return A protobuf Player object containing the mapped data.
     */
    public static com.yplugins.minecraftrpc.proto.Player mapPlayerToRPC(org.bukkit.entity.Player player) {
        com.yplugins.minecraftrpc.proto.Player.Builder playerBuilder = com.yplugins.minecraftrpc.proto.Player.newBuilder();

        playerBuilder.setName(player.getName());
        playerBuilder.setUuid(player.getUniqueId().toString());
        playerBuilder.setPing(player.getPing());

        playerBuilder.setLocation(LocationMapper.mapLocationToRPC(player.getLocation()));

        return playerBuilder.build();
    }
}

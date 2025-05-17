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

        switch (player.getGameMode()) {
            case SURVIVAL:
                playerBuilder.setGamemode(com.yplugins.minecraftrpc.proto.player.Gamemode.SURVIVAL);
                break;
            case CREATIVE:
                playerBuilder.setGamemode(com.yplugins.minecraftrpc.proto.player.Gamemode.CREATIVE);
                break;
            case ADVENTURE:
                playerBuilder.setGamemode(com.yplugins.minecraftrpc.proto.player.Gamemode.ADVENTURE);
                break;
            case SPECTATOR:
                playerBuilder.setGamemode(com.yplugins.minecraftrpc.proto.player.Gamemode.SPECTATOR);
                break;
        }

        playerBuilder.setHealth((float)player.getHealth());
        playerBuilder.setMaxHealth((float)player.getAttribute(org.bukkit.attribute.Attribute.GENERIC_MAX_HEALTH).getValue());
        playerBuilder.setFoodLevel (player.getFoodLevel());
        playerBuilder.setAllowFlight(player.getAllowFlight());
        playerBuilder.setIsFlying(player.isFlying());
        playerBuilder.setIsSneaking(player.isSneaking());
        playerBuilder.setIsSprinting(player.isSprinting());
        playerBuilder.setIsGliding(player.isGliding());
        playerBuilder.setIsInvisible(player.isInvisible());
        playerBuilder.setIsBlocking(player.isBlocking());
        playerBuilder.setIsSleeping(player.isSleeping());
        playerBuilder.setIsOperator(player.isOp());
        playerBuilder.setIsOnGround(player.isOnGround());
        
        playerBuilder.setDisplayName(player.getDisplayName());
        playerBuilder.setLocation(LocationMapper.mapLocationToRPC(player.getLocation()));

        return playerBuilder.build();
    }
}

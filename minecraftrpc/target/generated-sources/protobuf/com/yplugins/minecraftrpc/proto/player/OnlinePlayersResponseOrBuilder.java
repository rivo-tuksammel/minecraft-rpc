// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: minecraft_player.proto
// Protobuf Java Version: 4.29.0

package com.yplugins.minecraftrpc.proto.player;

public interface OnlinePlayersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MinecraftPlayer.OnlinePlayersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MinecraftPlayer.CommandStatus status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.MinecraftPlayer.CommandStatus status = 1;</code>
   * @return The status.
   */
  com.yplugins.minecraftrpc.proto.player.CommandStatus getStatus();
  /**
   * <code>.MinecraftPlayer.CommandStatus status = 1;</code>
   */
  com.yplugins.minecraftrpc.proto.player.CommandStatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .MinecraftPlayer.OnlinePlayer players = 2;</code>
   */
  java.util.List<com.yplugins.minecraftrpc.proto.player.OnlinePlayer> 
      getPlayersList();
  /**
   * <code>repeated .MinecraftPlayer.OnlinePlayer players = 2;</code>
   */
  com.yplugins.minecraftrpc.proto.player.OnlinePlayer getPlayers(int index);
  /**
   * <code>repeated .MinecraftPlayer.OnlinePlayer players = 2;</code>
   */
  int getPlayersCount();
  /**
   * <code>repeated .MinecraftPlayer.OnlinePlayer players = 2;</code>
   */
  java.util.List<? extends com.yplugins.minecraftrpc.proto.player.OnlinePlayerOrBuilder> 
      getPlayersOrBuilderList();
  /**
   * <code>repeated .MinecraftPlayer.OnlinePlayer players = 2;</code>
   */
  com.yplugins.minecraftrpc.proto.player.OnlinePlayerOrBuilder getPlayersOrBuilder(
      int index);
}

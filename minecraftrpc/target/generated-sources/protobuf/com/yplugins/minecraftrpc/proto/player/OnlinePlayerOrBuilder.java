// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: minecraft_player.proto
// Protobuf Java Version: 4.29.0

package com.yplugins.minecraftrpc.proto.player;

public interface OnlinePlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MinecraftPlayer.OnlinePlayer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of the player
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of the player
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * entity of the player
   * </pre>
   *
   * <code>.MinecraftWorld.Location location = 2;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * entity of the player
   * </pre>
   *
   * <code>.MinecraftWorld.Location location = 2;</code>
   * @return The location.
   */
  com.yplugins.minecraftrpc.proto.world.Location getLocation();
  /**
   * <pre>
   * entity of the player
   * </pre>
   *
   * <code>.MinecraftWorld.Location location = 2;</code>
   */
  com.yplugins.minecraftrpc.proto.world.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * UUID of the player
   * </pre>
   *
   * <code>string uuid = 3;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * UUID of the player
   * </pre>
   *
   * <code>string uuid = 3;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * IP address of the player
   * </pre>
   *
   * <code>string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * IP address of the player
   * </pre>
   *
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * ping of the player
   * </pre>
   *
   * <code>int32 ping = 5;</code>
   * @return The ping.
   */
  int getPing();

  /**
   * <pre>
   * health of the player
   * </pre>
   *
   * <code>float health = 6;</code>
   * @return The health.
   */
  float getHealth();

  /**
   * <pre>
   * max health of the player
   * </pre>
   *
   * <code>float maxHealth = 7;</code>
   * @return The maxHealth.
   */
  float getMaxHealth();

  /**
   * <pre>
   * food saturation of the player
   * </pre>
   *
   * <code>float foodLevel = 8;</code>
   * @return The foodLevel.
   */
  float getFoodLevel();

  /**
   * <pre>
   * experience of the player
   * </pre>
   *
   * <code>float experience = 9;</code>
   * @return The experience.
   */
  float getExperience();

  /**
   * <pre>
   * level of the player
   * </pre>
   *
   * <code>int32 level = 10;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <pre>
   * gamemode of the player
   * </pre>
   *
   * <code>.MinecraftPlayer.Gamemode gamemode = 11;</code>
   * @return The enum numeric value on the wire for gamemode.
   */
  int getGamemodeValue();
  /**
   * <pre>
   * gamemode of the player
   * </pre>
   *
   * <code>.MinecraftPlayer.Gamemode gamemode = 11;</code>
   * @return The gamemode.
   */
  com.yplugins.minecraftrpc.proto.player.Gamemode getGamemode();

  /**
   * <pre>
   * allow flight of the player
   * </pre>
   *
   * <code>bool allowFlight = 12;</code>
   * @return The allowFlight.
   */
  boolean getAllowFlight();

  /**
   * <pre>
   * total experience of the player
   * </pre>
   *
   * <code>int32 totalExperience = 13;</code>
   * @return The totalExperience.
   */
  int getTotalExperience();

  /**
   * <pre>
   * is the player flying
   * </pre>
   *
   * <code>bool isFlying = 14;</code>
   * @return The isFlying.
   */
  boolean getIsFlying();

  /**
   * <pre>
   * is the player sneaking
   * </pre>
   *
   * <code>bool isSneaking = 15;</code>
   * @return The isSneaking.
   */
  boolean getIsSneaking();

  /**
   * <pre>
   * is the player sprinting
   * </pre>
   *
   * <code>bool isSprinting = 16;</code>
   * @return The isSprinting.
   */
  boolean getIsSprinting();

  /**
   * <pre>
   * is the player blocking
   * </pre>
   *
   * <code>bool isBlocking = 17;</code>
   * @return The isBlocking.
   */
  boolean getIsBlocking();

  /**
   * <pre>
   * is the player gliding
   * </pre>
   *
   * <code>bool isGliding = 18;</code>
   * @return The isGliding.
   */
  boolean getIsGliding();

  /**
   * <pre>
   * is the player swimming
   * </pre>
   *
   * <code>bool isSwimming = 19;</code>
   * @return The isSwimming.
   */
  boolean getIsSwimming();

  /**
   * <pre>
   * is the player riding
   * </pre>
   *
   * <code>bool isRiding = 20;</code>
   * @return The isRiding.
   */
  boolean getIsRiding();

  /**
   * <pre>
   * is the player on ground, this is sus. Can be spoofed by clients.
   * </pre>
   *
   * <code>bool isOnGround = 21;</code>
   * @return The isOnGround.
   */
  boolean getIsOnGround();

  /**
   * <pre>
   * is the player operator
   * </pre>
   *
   * <code>bool isOperator = 22;</code>
   * @return The isOperator.
   */
  boolean getIsOperator();

  /**
   * <pre>
   * is the player invisible
   * </pre>
   *
   * <code>bool isInvisible = 23;</code>
   * @return The isInvisible.
   */
  boolean getIsInvisible();

  /**
   * <pre>
   * is the player sleeping
   * </pre>
   *
   * <code>bool isSleeping = 24;</code>
   * @return The isSleeping.
   */
  boolean getIsSleeping();

  /**
   * <pre>
   * display name of the player
   * </pre>
   *
   * <code>string displayName = 25;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * display name of the player
   * </pre>
   *
   * <code>string displayName = 25;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}

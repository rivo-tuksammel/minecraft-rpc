// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: minecraft_entity.proto
// Protobuf Java Version: 4.29.0

package com.yplugins.minecraftrpc.proto.entity;

public interface EntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MinecraftEntity.EntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MinecraftEntity.EntityRequest.SpecificEntities specific = 1;</code>
   * @return Whether the specific field is set.
   */
  boolean hasSpecific();
  /**
   * <code>.MinecraftEntity.EntityRequest.SpecificEntities specific = 1;</code>
   * @return The specific.
   */
  com.yplugins.minecraftrpc.proto.entity.EntityRequest.SpecificEntities getSpecific();
  /**
   * <code>.MinecraftEntity.EntityRequest.SpecificEntities specific = 1;</code>
   */
  com.yplugins.minecraftrpc.proto.entity.EntityRequest.SpecificEntitiesOrBuilder getSpecificOrBuilder();

  /**
   * <code>.MinecraftEntity.EntityRequest.WorldEntities worldwide = 2;</code>
   * @return Whether the worldwide field is set.
   */
  boolean hasWorldwide();
  /**
   * <code>.MinecraftEntity.EntityRequest.WorldEntities worldwide = 2;</code>
   * @return The worldwide.
   */
  com.yplugins.minecraftrpc.proto.entity.EntityRequest.WorldEntities getWorldwide();
  /**
   * <code>.MinecraftEntity.EntityRequest.WorldEntities worldwide = 2;</code>
   */
  com.yplugins.minecraftrpc.proto.entity.EntityRequest.WorldEntitiesOrBuilder getWorldwideOrBuilder();

  com.yplugins.minecraftrpc.proto.entity.EntityRequest.EntityRequestTypeCase getEntityRequestTypeCase();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: minecraft_types.proto
// Protobuf Java Version: 4.29.0

package com.yplugins.minecraftrpc.proto.types;

public final class MinecraftRPC {
  private MinecraftRPC() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      MinecraftRPC.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MinecraftTypes_Vec3_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MinecraftTypes_Vec3_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MinecraftTypes_Vec3f_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MinecraftTypes_Vec3f_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025minecraft_types.proto\022\016MinecraftTypes\"" +
      "\'\n\004Vec3\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\022\t\n\001z\030\003 \001(\005" +
      "\"(\n\005Vec3f\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\022\t\n\001z\030\003 \001" +
      "(\002B7\n%com.yplugins.minecraftrpc.proto.ty" +
      "pesB\014MinecraftRPCP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MinecraftTypes_Vec3_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MinecraftTypes_Vec3_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MinecraftTypes_Vec3_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_MinecraftTypes_Vec3f_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MinecraftTypes_Vec3f_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MinecraftTypes_Vec3f_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

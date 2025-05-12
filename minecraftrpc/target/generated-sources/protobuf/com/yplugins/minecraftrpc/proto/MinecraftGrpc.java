package com.yplugins.minecraftrpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *Service functions on Minecraft Server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: minecraft.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MinecraftGrpc {

  private MinecraftGrpc() {}

  public static final java.lang.String SERVICE_NAME = "minecraftRPC.Minecraft";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.CommandRequest,
      com.yplugins.minecraftrpc.proto.Status> getRunCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "runCommand",
      requestType = com.yplugins.minecraftrpc.proto.CommandRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.CommandRequest,
      com.yplugins.minecraftrpc.proto.Status> getRunCommandMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.CommandRequest, com.yplugins.minecraftrpc.proto.Status> getRunCommandMethod;
    if ((getRunCommandMethod = MinecraftGrpc.getRunCommandMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getRunCommandMethod = MinecraftGrpc.getRunCommandMethod) == null) {
          MinecraftGrpc.getRunCommandMethod = getRunCommandMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.CommandRequest, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "runCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("runCommand"))
              .build();
        }
      }
    }
    return getRunCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.ChatPostRequest,
      com.yplugins.minecraftrpc.proto.Status> getPostToChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postToChat",
      requestType = com.yplugins.minecraftrpc.proto.ChatPostRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.ChatPostRequest,
      com.yplugins.minecraftrpc.proto.Status> getPostToChatMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.ChatPostRequest, com.yplugins.minecraftrpc.proto.Status> getPostToChatMethod;
    if ((getPostToChatMethod = MinecraftGrpc.getPostToChatMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getPostToChatMethod = MinecraftGrpc.getPostToChatMethod) == null) {
          MinecraftGrpc.getPostToChatMethod = getPostToChatMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.ChatPostRequest, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "postToChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.ChatPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("postToChat"))
              .build();
        }
      }
    }
    return getPostToChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.WorldRequest,
      com.yplugins.minecraftrpc.proto.WorldResponse> getAccessWorldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accessWorlds",
      requestType = com.yplugins.minecraftrpc.proto.WorldRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.WorldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.WorldRequest,
      com.yplugins.minecraftrpc.proto.WorldResponse> getAccessWorldsMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.WorldRequest, com.yplugins.minecraftrpc.proto.WorldResponse> getAccessWorldsMethod;
    if ((getAccessWorldsMethod = MinecraftGrpc.getAccessWorldsMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getAccessWorldsMethod = MinecraftGrpc.getAccessWorldsMethod) == null) {
          MinecraftGrpc.getAccessWorldsMethod = getAccessWorldsMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.WorldRequest, com.yplugins.minecraftrpc.proto.WorldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "accessWorlds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.WorldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.WorldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("accessWorlds"))
              .build();
        }
      }
    }
    return getAccessWorldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.HeightRequest,
      com.yplugins.minecraftrpc.proto.HeightResponse> getGetHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeight",
      requestType = com.yplugins.minecraftrpc.proto.HeightRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.HeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.HeightRequest,
      com.yplugins.minecraftrpc.proto.HeightResponse> getGetHeightMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.HeightRequest, com.yplugins.minecraftrpc.proto.HeightResponse> getGetHeightMethod;
    if ((getGetHeightMethod = MinecraftGrpc.getGetHeightMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetHeightMethod = MinecraftGrpc.getGetHeightMethod) == null) {
          MinecraftGrpc.getGetHeightMethod = getGetHeightMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.HeightRequest, com.yplugins.minecraftrpc.proto.HeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.HeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.HeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getHeight"))
              .build();
        }
      }
    }
    return getGetHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.BlockRequest,
      com.yplugins.minecraftrpc.proto.BlockResponse> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlock",
      requestType = com.yplugins.minecraftrpc.proto.BlockRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.BlockRequest,
      com.yplugins.minecraftrpc.proto.BlockResponse> getGetBlockMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.BlockRequest, com.yplugins.minecraftrpc.proto.BlockResponse> getGetBlockMethod;
    if ((getGetBlockMethod = MinecraftGrpc.getGetBlockMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetBlockMethod = MinecraftGrpc.getGetBlockMethod) == null) {
          MinecraftGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.BlockRequest, com.yplugins.minecraftrpc.proto.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getBlock"))
              .build();
        }
      }
    }
    return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Block,
      com.yplugins.minecraftrpc.proto.Status> getSetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBlock",
      requestType = com.yplugins.minecraftrpc.proto.Block.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Block,
      com.yplugins.minecraftrpc.proto.Status> getSetBlockMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Block, com.yplugins.minecraftrpc.proto.Status> getSetBlockMethod;
    if ((getSetBlockMethod = MinecraftGrpc.getSetBlockMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSetBlockMethod = MinecraftGrpc.getSetBlockMethod) == null) {
          MinecraftGrpc.getSetBlockMethod = getSetBlockMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Block, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Block.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("setBlock"))
              .build();
        }
      }
    }
    return getSetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks,
      com.yplugins.minecraftrpc.proto.Status> getSetBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBlocks",
      requestType = com.yplugins.minecraftrpc.proto.Blocks.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks,
      com.yplugins.minecraftrpc.proto.Status> getSetBlocksMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks, com.yplugins.minecraftrpc.proto.Status> getSetBlocksMethod;
    if ((getSetBlocksMethod = MinecraftGrpc.getSetBlocksMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSetBlocksMethod = MinecraftGrpc.getSetBlocksMethod) == null) {
          MinecraftGrpc.getSetBlocksMethod = getSetBlocksMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Blocks, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Blocks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("setBlocks"))
              .build();
        }
      }
    }
    return getSetBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks,
      com.yplugins.minecraftrpc.proto.Status> getSetBlockCubeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBlockCube",
      requestType = com.yplugins.minecraftrpc.proto.Blocks.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks,
      com.yplugins.minecraftrpc.proto.Status> getSetBlockCubeMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Blocks, com.yplugins.minecraftrpc.proto.Status> getSetBlockCubeMethod;
    if ((getSetBlockCubeMethod = MinecraftGrpc.getSetBlockCubeMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSetBlockCubeMethod = MinecraftGrpc.getSetBlockCubeMethod) == null) {
          MinecraftGrpc.getSetBlockCubeMethod = getSetBlockCubeMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Blocks, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setBlockCube"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Blocks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("setBlockCube"))
              .build();
        }
      }
    }
    return getSetBlockCubeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayersRequest,
      com.yplugins.minecraftrpc.proto.PlayersResponse> getGetPlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPlayers",
      requestType = com.yplugins.minecraftrpc.proto.PlayersRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.PlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayersRequest,
      com.yplugins.minecraftrpc.proto.PlayersResponse> getGetPlayersMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayersRequest, com.yplugins.minecraftrpc.proto.PlayersResponse> getGetPlayersMethod;
    if ((getGetPlayersMethod = MinecraftGrpc.getGetPlayersMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetPlayersMethod = MinecraftGrpc.getGetPlayersMethod) == null) {
          MinecraftGrpc.getGetPlayersMethod = getGetPlayersMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.PlayersRequest, com.yplugins.minecraftrpc.proto.PlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.PlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.PlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getPlayers"))
              .build();
        }
      }
    }
    return getGetPlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayerRequest,
      com.yplugins.minecraftrpc.proto.PlayerResponse> getGetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPlayer",
      requestType = com.yplugins.minecraftrpc.proto.PlayerRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.PlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayerRequest,
      com.yplugins.minecraftrpc.proto.PlayerResponse> getGetPlayerMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.PlayerRequest, com.yplugins.minecraftrpc.proto.PlayerResponse> getGetPlayerMethod;
    if ((getGetPlayerMethod = MinecraftGrpc.getGetPlayerMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetPlayerMethod = MinecraftGrpc.getGetPlayerMethod) == null) {
          MinecraftGrpc.getGetPlayerMethod = getGetPlayerMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.PlayerRequest, com.yplugins.minecraftrpc.proto.PlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.PlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.PlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getPlayer"))
              .build();
        }
      }
    }
    return getGetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Player,
      com.yplugins.minecraftrpc.proto.Status> getSetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayer",
      requestType = com.yplugins.minecraftrpc.proto.Player.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Player,
      com.yplugins.minecraftrpc.proto.Status> getSetPlayerMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Player, com.yplugins.minecraftrpc.proto.Status> getSetPlayerMethod;
    if ((getSetPlayerMethod = MinecraftGrpc.getSetPlayerMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSetPlayerMethod = MinecraftGrpc.getSetPlayerMethod) == null) {
          MinecraftGrpc.getSetPlayerMethod = getSetPlayerMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Player, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Player.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("setPlayer"))
              .build();
        }
      }
    }
    return getSetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity,
      com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> getSpawnEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spawnEntity",
      requestType = com.yplugins.minecraftrpc.proto.Entity.class,
      responseType = com.yplugins.minecraftrpc.proto.SpawnedEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity,
      com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> getSpawnEntityMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity, com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> getSpawnEntityMethod;
    if ((getSpawnEntityMethod = MinecraftGrpc.getSpawnEntityMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSpawnEntityMethod = MinecraftGrpc.getSpawnEntityMethod) == null) {
          MinecraftGrpc.getSpawnEntityMethod = getSpawnEntityMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Entity, com.yplugins.minecraftrpc.proto.SpawnedEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "spawnEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Entity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.SpawnedEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("spawnEntity"))
              .build();
        }
      }
    }
    return getSpawnEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity,
      com.yplugins.minecraftrpc.proto.Status> getSetEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setEntity",
      requestType = com.yplugins.minecraftrpc.proto.Entity.class,
      responseType = com.yplugins.minecraftrpc.proto.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity,
      com.yplugins.minecraftrpc.proto.Status> getSetEntityMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.Entity, com.yplugins.minecraftrpc.proto.Status> getSetEntityMethod;
    if ((getSetEntityMethod = MinecraftGrpc.getSetEntityMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getSetEntityMethod = MinecraftGrpc.getSetEntityMethod) == null) {
          MinecraftGrpc.getSetEntityMethod = getSetEntityMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.Entity, com.yplugins.minecraftrpc.proto.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Entity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("setEntity"))
              .build();
        }
      }
    }
    return getSetEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EntityRequest,
      com.yplugins.minecraftrpc.proto.EntityResponse> getGetEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEntities",
      requestType = com.yplugins.minecraftrpc.proto.EntityRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.EntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EntityRequest,
      com.yplugins.minecraftrpc.proto.EntityResponse> getGetEntitiesMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EntityRequest, com.yplugins.minecraftrpc.proto.EntityResponse> getGetEntitiesMethod;
    if ((getGetEntitiesMethod = MinecraftGrpc.getGetEntitiesMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetEntitiesMethod = MinecraftGrpc.getGetEntitiesMethod) == null) {
          MinecraftGrpc.getGetEntitiesMethod = getGetEntitiesMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.EntityRequest, com.yplugins.minecraftrpc.proto.EntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.EntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.EntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getEntities"))
              .build();
        }
      }
    }
    return getGetEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EventStreamRequest,
      com.yplugins.minecraftrpc.proto.Event> getGetEventStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEventStream",
      requestType = com.yplugins.minecraftrpc.proto.EventStreamRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EventStreamRequest,
      com.yplugins.minecraftrpc.proto.Event> getGetEventStreamMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.EventStreamRequest, com.yplugins.minecraftrpc.proto.Event> getGetEventStreamMethod;
    if ((getGetEventStreamMethod = MinecraftGrpc.getGetEventStreamMethod) == null) {
      synchronized (MinecraftGrpc.class) {
        if ((getGetEventStreamMethod = MinecraftGrpc.getGetEventStreamMethod) == null) {
          MinecraftGrpc.getGetEventStreamMethod = getGetEventStreamMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.EventStreamRequest, com.yplugins.minecraftrpc.proto.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEventStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.EventStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.Event.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftMethodDescriptorSupplier("getEventStream"))
              .build();
        }
      }
    }
    return getGetEventStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MinecraftStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftStub>() {
        @java.lang.Override
        public MinecraftStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftStub(channel, callOptions);
        }
      };
    return MinecraftStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MinecraftBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftBlockingV2Stub>() {
        @java.lang.Override
        public MinecraftBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftBlockingV2Stub(channel, callOptions);
        }
      };
    return MinecraftBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MinecraftBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftBlockingStub>() {
        @java.lang.Override
        public MinecraftBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftBlockingStub(channel, callOptions);
        }
      };
    return MinecraftBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MinecraftFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftFutureStub>() {
        @java.lang.Override
        public MinecraftFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftFutureStub(channel, callOptions);
        }
      };
    return MinecraftFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void runCommand(com.yplugins.minecraftrpc.proto.CommandRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunCommandMethod(), responseObserver);
    }

    /**
     */
    default void postToChat(com.yplugins.minecraftrpc.proto.ChatPostRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostToChatMethod(), responseObserver);
    }

    /**
     */
    default void accessWorlds(com.yplugins.minecraftrpc.proto.WorldRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.WorldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccessWorldsMethod(), responseObserver);
    }

    /**
     */
    default void getHeight(com.yplugins.minecraftrpc.proto.HeightRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.HeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeightMethod(), responseObserver);
    }

    /**
     */
    default void getBlock(com.yplugins.minecraftrpc.proto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.BlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     */
    default void setBlock(com.yplugins.minecraftrpc.proto.Block request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBlockMethod(), responseObserver);
    }

    /**
     */
    default void setBlocks(com.yplugins.minecraftrpc.proto.Blocks request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * expect exactly two blocks: opposite corners of cube
     * </pre>
     */
    default void setBlockCube(com.yplugins.minecraftrpc.proto.Blocks request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBlockCubeMethod(), responseObserver);
    }

    /**
     */
    default void getPlayers(com.yplugins.minecraftrpc.proto.PlayersRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayersMethod(), responseObserver);
    }

    /**
     */
    default void getPlayer(com.yplugins.minecraftrpc.proto.PlayerRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerMethod(), responseObserver);
    }

    /**
     */
    default void setPlayer(com.yplugins.minecraftrpc.proto.Player request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerMethod(), responseObserver);
    }

    /**
     */
    default void spawnEntity(com.yplugins.minecraftrpc.proto.Entity request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpawnEntityMethod(), responseObserver);
    }

    /**
     */
    default void setEntity(com.yplugins.minecraftrpc.proto.Entity request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEntityMethod(), responseObserver);
    }

    /**
     */
    default void getEntities(com.yplugins.minecraftrpc.proto.EntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.EntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntitiesMethod(), responseObserver);
    }

    /**
     */
    default void getEventStream(com.yplugins.minecraftrpc.proto.EventStreamRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Minecraft.
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public static abstract class MinecraftImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MinecraftGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Minecraft.
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public static final class MinecraftStub
      extends io.grpc.stub.AbstractAsyncStub<MinecraftStub> {
    private MinecraftStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftStub(channel, callOptions);
    }

    /**
     */
    public void runCommand(com.yplugins.minecraftrpc.proto.CommandRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postToChat(com.yplugins.minecraftrpc.proto.ChatPostRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostToChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accessWorlds(com.yplugins.minecraftrpc.proto.WorldRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.WorldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccessWorldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHeight(com.yplugins.minecraftrpc.proto.HeightRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.HeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlock(com.yplugins.minecraftrpc.proto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.BlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setBlock(com.yplugins.minecraftrpc.proto.Block request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setBlocks(com.yplugins.minecraftrpc.proto.Blocks request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * expect exactly two blocks: opposite corners of cube
     * </pre>
     */
    public void setBlockCube(com.yplugins.minecraftrpc.proto.Blocks request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBlockCubeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayers(com.yplugins.minecraftrpc.proto.PlayersRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayer(com.yplugins.minecraftrpc.proto.PlayerRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayer(com.yplugins.minecraftrpc.proto.Player request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spawnEntity(com.yplugins.minecraftrpc.proto.Entity request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpawnEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setEntity(com.yplugins.minecraftrpc.proto.Entity request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEntities(com.yplugins.minecraftrpc.proto.EntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.EntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventStream(com.yplugins.minecraftrpc.proto.EventStreamRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEventStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Minecraft.
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public static final class MinecraftBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftBlockingV2Stub> {
    private MinecraftBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status runCommand(com.yplugins.minecraftrpc.proto.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status postToChat(com.yplugins.minecraftrpc.proto.ChatPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostToChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.WorldResponse accessWorlds(com.yplugins.minecraftrpc.proto.WorldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccessWorldsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.HeightResponse getHeight(com.yplugins.minecraftrpc.proto.HeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.BlockResponse getBlock(com.yplugins.minecraftrpc.proto.BlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setBlock(com.yplugins.minecraftrpc.proto.Block request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setBlocks(com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * expect exactly two blocks: opposite corners of cube
     * </pre>
     */
    public com.yplugins.minecraftrpc.proto.Status setBlockCube(com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlockCubeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.PlayersResponse getPlayers(com.yplugins.minecraftrpc.proto.PlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.PlayerResponse getPlayer(com.yplugins.minecraftrpc.proto.PlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setPlayer(com.yplugins.minecraftrpc.proto.Player request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.SpawnedEntityResponse spawnEntity(com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpawnEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setEntity(com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.EntityResponse getEntities(com.yplugins.minecraftrpc.proto.EntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.yplugins.minecraftrpc.proto.Event>
        getEventStream(com.yplugins.minecraftrpc.proto.EventStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetEventStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Minecraft.
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public static final class MinecraftBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftBlockingStub> {
    private MinecraftBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status runCommand(com.yplugins.minecraftrpc.proto.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status postToChat(com.yplugins.minecraftrpc.proto.ChatPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostToChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.WorldResponse accessWorlds(com.yplugins.minecraftrpc.proto.WorldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccessWorldsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.HeightResponse getHeight(com.yplugins.minecraftrpc.proto.HeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.BlockResponse getBlock(com.yplugins.minecraftrpc.proto.BlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setBlock(com.yplugins.minecraftrpc.proto.Block request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setBlocks(com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * expect exactly two blocks: opposite corners of cube
     * </pre>
     */
    public com.yplugins.minecraftrpc.proto.Status setBlockCube(com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBlockCubeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.PlayersResponse getPlayers(com.yplugins.minecraftrpc.proto.PlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.PlayerResponse getPlayer(com.yplugins.minecraftrpc.proto.PlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setPlayer(com.yplugins.minecraftrpc.proto.Player request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.SpawnedEntityResponse spawnEntity(com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpawnEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.Status setEntity(com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.EntityResponse getEntities(com.yplugins.minecraftrpc.proto.EntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yplugins.minecraftrpc.proto.Event> getEventStream(
        com.yplugins.minecraftrpc.proto.EventStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEventStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Minecraft.
   * <pre>
   **
   *Service functions on Minecraft Server
   * </pre>
   */
  public static final class MinecraftFutureStub
      extends io.grpc.stub.AbstractFutureStub<MinecraftFutureStub> {
    private MinecraftFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> runCommand(
        com.yplugins.minecraftrpc.proto.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> postToChat(
        com.yplugins.minecraftrpc.proto.ChatPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostToChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.WorldResponse> accessWorlds(
        com.yplugins.minecraftrpc.proto.WorldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccessWorldsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.HeightResponse> getHeight(
        com.yplugins.minecraftrpc.proto.HeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.BlockResponse> getBlock(
        com.yplugins.minecraftrpc.proto.BlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> setBlock(
        com.yplugins.minecraftrpc.proto.Block request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> setBlocks(
        com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBlocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * expect exactly two blocks: opposite corners of cube
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> setBlockCube(
        com.yplugins.minecraftrpc.proto.Blocks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBlockCubeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.PlayersResponse> getPlayers(
        com.yplugins.minecraftrpc.proto.PlayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.PlayerResponse> getPlayer(
        com.yplugins.minecraftrpc.proto.PlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> setPlayer(
        com.yplugins.minecraftrpc.proto.Player request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.SpawnedEntityResponse> spawnEntity(
        com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpawnEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.Status> setEntity(
        com.yplugins.minecraftrpc.proto.Entity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.EntityResponse> getEntities(
        com.yplugins.minecraftrpc.proto.EntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RUN_COMMAND = 0;
  private static final int METHODID_POST_TO_CHAT = 1;
  private static final int METHODID_ACCESS_WORLDS = 2;
  private static final int METHODID_GET_HEIGHT = 3;
  private static final int METHODID_GET_BLOCK = 4;
  private static final int METHODID_SET_BLOCK = 5;
  private static final int METHODID_SET_BLOCKS = 6;
  private static final int METHODID_SET_BLOCK_CUBE = 7;
  private static final int METHODID_GET_PLAYERS = 8;
  private static final int METHODID_GET_PLAYER = 9;
  private static final int METHODID_SET_PLAYER = 10;
  private static final int METHODID_SPAWN_ENTITY = 11;
  private static final int METHODID_SET_ENTITY = 12;
  private static final int METHODID_GET_ENTITIES = 13;
  private static final int METHODID_GET_EVENT_STREAM = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN_COMMAND:
          serviceImpl.runCommand((com.yplugins.minecraftrpc.proto.CommandRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_POST_TO_CHAT:
          serviceImpl.postToChat((com.yplugins.minecraftrpc.proto.ChatPostRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_ACCESS_WORLDS:
          serviceImpl.accessWorlds((com.yplugins.minecraftrpc.proto.WorldRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.WorldResponse>) responseObserver);
          break;
        case METHODID_GET_HEIGHT:
          serviceImpl.getHeight((com.yplugins.minecraftrpc.proto.HeightRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.HeightResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((com.yplugins.minecraftrpc.proto.BlockRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.BlockResponse>) responseObserver);
          break;
        case METHODID_SET_BLOCK:
          serviceImpl.setBlock((com.yplugins.minecraftrpc.proto.Block) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_SET_BLOCKS:
          serviceImpl.setBlocks((com.yplugins.minecraftrpc.proto.Blocks) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_SET_BLOCK_CUBE:
          serviceImpl.setBlockCube((com.yplugins.minecraftrpc.proto.Blocks) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_GET_PLAYERS:
          serviceImpl.getPlayers((com.yplugins.minecraftrpc.proto.PlayersRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayersResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER:
          serviceImpl.getPlayer((com.yplugins.minecraftrpc.proto.PlayerRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.PlayerResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER:
          serviceImpl.setPlayer((com.yplugins.minecraftrpc.proto.Player) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_SPAWN_ENTITY:
          serviceImpl.spawnEntity((com.yplugins.minecraftrpc.proto.Entity) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.SpawnedEntityResponse>) responseObserver);
          break;
        case METHODID_SET_ENTITY:
          serviceImpl.setEntity((com.yplugins.minecraftrpc.proto.Entity) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Status>) responseObserver);
          break;
        case METHODID_GET_ENTITIES:
          serviceImpl.getEntities((com.yplugins.minecraftrpc.proto.EntityRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.EntityResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_STREAM:
          serviceImpl.getEventStream((com.yplugins.minecraftrpc.proto.EventStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.Event>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRunCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.CommandRequest,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_RUN_COMMAND)))
        .addMethod(
          getPostToChatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.ChatPostRequest,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_POST_TO_CHAT)))
        .addMethod(
          getAccessWorldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.WorldRequest,
              com.yplugins.minecraftrpc.proto.WorldResponse>(
                service, METHODID_ACCESS_WORLDS)))
        .addMethod(
          getGetHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.HeightRequest,
              com.yplugins.minecraftrpc.proto.HeightResponse>(
                service, METHODID_GET_HEIGHT)))
        .addMethod(
          getGetBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.BlockRequest,
              com.yplugins.minecraftrpc.proto.BlockResponse>(
                service, METHODID_GET_BLOCK)))
        .addMethod(
          getSetBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Block,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_SET_BLOCK)))
        .addMethod(
          getSetBlocksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Blocks,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_SET_BLOCKS)))
        .addMethod(
          getSetBlockCubeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Blocks,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_SET_BLOCK_CUBE)))
        .addMethod(
          getGetPlayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.PlayersRequest,
              com.yplugins.minecraftrpc.proto.PlayersResponse>(
                service, METHODID_GET_PLAYERS)))
        .addMethod(
          getGetPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.PlayerRequest,
              com.yplugins.minecraftrpc.proto.PlayerResponse>(
                service, METHODID_GET_PLAYER)))
        .addMethod(
          getSetPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Player,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_SET_PLAYER)))
        .addMethod(
          getSpawnEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Entity,
              com.yplugins.minecraftrpc.proto.SpawnedEntityResponse>(
                service, METHODID_SPAWN_ENTITY)))
        .addMethod(
          getSetEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.Entity,
              com.yplugins.minecraftrpc.proto.Status>(
                service, METHODID_SET_ENTITY)))
        .addMethod(
          getGetEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.EntityRequest,
              com.yplugins.minecraftrpc.proto.EntityResponse>(
                service, METHODID_GET_ENTITIES)))
        .addMethod(
          getGetEventStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.EventStreamRequest,
              com.yplugins.minecraftrpc.proto.Event>(
                service, METHODID_GET_EVENT_STREAM)))
        .build();
  }

  private static abstract class MinecraftBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MinecraftBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yplugins.minecraftrpc.proto.MinecraftRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Minecraft");
    }
  }

  private static final class MinecraftFileDescriptorSupplier
      extends MinecraftBaseDescriptorSupplier {
    MinecraftFileDescriptorSupplier() {}
  }

  private static final class MinecraftMethodDescriptorSupplier
      extends MinecraftBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MinecraftMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MinecraftGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MinecraftFileDescriptorSupplier())
              .addMethod(getRunCommandMethod())
              .addMethod(getPostToChatMethod())
              .addMethod(getAccessWorldsMethod())
              .addMethod(getGetHeightMethod())
              .addMethod(getGetBlockMethod())
              .addMethod(getSetBlockMethod())
              .addMethod(getSetBlocksMethod())
              .addMethod(getSetBlockCubeMethod())
              .addMethod(getGetPlayersMethod())
              .addMethod(getGetPlayerMethod())
              .addMethod(getSetPlayerMethod())
              .addMethod(getSpawnEntityMethod())
              .addMethod(getSetEntityMethod())
              .addMethod(getGetEntitiesMethod())
              .addMethod(getGetEventStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

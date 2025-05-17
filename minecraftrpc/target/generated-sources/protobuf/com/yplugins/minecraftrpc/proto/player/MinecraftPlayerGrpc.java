package com.yplugins.minecraftrpc.proto.player;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: minecraft_player.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MinecraftPlayerGrpc {

  private MinecraftPlayerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MinecraftPlayer.MinecraftPlayer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest,
      com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> getGetOnlinePlayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOnlinePlayers",
      requestType = com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest,
      com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> getGetOnlinePlayersMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest, com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> getGetOnlinePlayersMethod;
    if ((getGetOnlinePlayersMethod = MinecraftPlayerGrpc.getGetOnlinePlayersMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getGetOnlinePlayersMethod = MinecraftPlayerGrpc.getGetOnlinePlayersMethod) == null) {
          MinecraftPlayerGrpc.getGetOnlinePlayersMethod = getGetOnlinePlayersMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest, com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOnlinePlayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("getOnlinePlayers"))
              .build();
        }
      }
    }
    return getGetOnlinePlayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest,
      com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> getGetOnlinePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOnlinePlayer",
      requestType = com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest,
      com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> getGetOnlinePlayerMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest, com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> getGetOnlinePlayerMethod;
    if ((getGetOnlinePlayerMethod = MinecraftPlayerGrpc.getGetOnlinePlayerMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getGetOnlinePlayerMethod = MinecraftPlayerGrpc.getGetOnlinePlayerMethod) == null) {
          MinecraftPlayerGrpc.getGetOnlinePlayerMethod = getGetOnlinePlayerMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest, com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOnlinePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("getOnlinePlayer"))
              .build();
        }
      }
    }
    return getGetOnlinePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerKickRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> getKickPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "kickPlayer",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerKickRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerKickResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerKickRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> getKickPlayerMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerKickRequest, com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> getKickPlayerMethod;
    if ((getKickPlayerMethod = MinecraftPlayerGrpc.getKickPlayerMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getKickPlayerMethod = MinecraftPlayerGrpc.getKickPlayerMethod) == null) {
          MinecraftPlayerGrpc.getKickPlayerMethod = getKickPlayerMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerKickRequest, com.yplugins.minecraftrpc.proto.player.PlayerKickResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "kickPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerKickRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerKickResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("kickPlayer"))
              .build();
        }
      }
    }
    return getKickPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> getSetPlayerHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerHealth",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> getSetPlayerHealthMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> getSetPlayerHealthMethod;
    if ((getSetPlayerHealthMethod = MinecraftPlayerGrpc.getSetPlayerHealthMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerHealthMethod = MinecraftPlayerGrpc.getSetPlayerHealthMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerHealthMethod = getSetPlayerHealthMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerHealth"))
              .build();
        }
      }
    }
    return getSetPlayerHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> getSetPlayerExperienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerExperience",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> getSetPlayerExperienceMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> getSetPlayerExperienceMethod;
    if ((getSetPlayerExperienceMethod = MinecraftPlayerGrpc.getSetPlayerExperienceMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerExperienceMethod = MinecraftPlayerGrpc.getSetPlayerExperienceMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerExperienceMethod = getSetPlayerExperienceMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerExperience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerExperience"))
              .build();
        }
      }
    }
    return getSetPlayerExperienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> getSetPlayerLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerLevel",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> getSetPlayerLevelMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> getSetPlayerLevelMethod;
    if ((getSetPlayerLevelMethod = MinecraftPlayerGrpc.getSetPlayerLevelMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerLevelMethod = MinecraftPlayerGrpc.getSetPlayerLevelMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerLevelMethod = getSetPlayerLevelMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerLevel"))
              .build();
        }
      }
    }
    return getSetPlayerLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> getSetPlayerMaxHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerMaxHealth",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> getSetPlayerMaxHealthMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> getSetPlayerMaxHealthMethod;
    if ((getSetPlayerMaxHealthMethod = MinecraftPlayerGrpc.getSetPlayerMaxHealthMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerMaxHealthMethod = MinecraftPlayerGrpc.getSetPlayerMaxHealthMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerMaxHealthMethod = getSetPlayerMaxHealthMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerMaxHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerMaxHealth"))
              .build();
        }
      }
    }
    return getSetPlayerMaxHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> getSetPlayerFoodLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerFoodLevel",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> getSetPlayerFoodLevelMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> getSetPlayerFoodLevelMethod;
    if ((getSetPlayerFoodLevelMethod = MinecraftPlayerGrpc.getSetPlayerFoodLevelMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerFoodLevelMethod = MinecraftPlayerGrpc.getSetPlayerFoodLevelMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerFoodLevelMethod = getSetPlayerFoodLevelMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerFoodLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerFoodLevel"))
              .build();
        }
      }
    }
    return getSetPlayerFoodLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> getSetPlayerTotalExperienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerTotalExperience",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> getSetPlayerTotalExperienceMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> getSetPlayerTotalExperienceMethod;
    if ((getSetPlayerTotalExperienceMethod = MinecraftPlayerGrpc.getSetPlayerTotalExperienceMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerTotalExperienceMethod = MinecraftPlayerGrpc.getSetPlayerTotalExperienceMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerTotalExperienceMethod = getSetPlayerTotalExperienceMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerTotalExperience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerTotalExperience"))
              .build();
        }
      }
    }
    return getSetPlayerTotalExperienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> getSetPlayerGamemodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerGamemode",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> getSetPlayerGamemodeMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> getSetPlayerGamemodeMethod;
    if ((getSetPlayerGamemodeMethod = MinecraftPlayerGrpc.getSetPlayerGamemodeMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerGamemodeMethod = MinecraftPlayerGrpc.getSetPlayerGamemodeMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerGamemodeMethod = getSetPlayerGamemodeMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerGamemode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerGamemode"))
              .build();
        }
      }
    }
    return getSetPlayerGamemodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> getSetPlayerAllowFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayerAllowFlight",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> getSetPlayerAllowFlightMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> getSetPlayerAllowFlightMethod;
    if ((getSetPlayerAllowFlightMethod = MinecraftPlayerGrpc.getSetPlayerAllowFlightMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSetPlayerAllowFlightMethod = MinecraftPlayerGrpc.getSetPlayerAllowFlightMethod) == null) {
          MinecraftPlayerGrpc.getSetPlayerAllowFlightMethod = getSetPlayerAllowFlightMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest, com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPlayerAllowFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("setPlayerAllowFlight"))
              .build();
        }
      }
    }
    return getSetPlayerAllowFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> getSendPlayerMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendPlayerMessage",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> getSendPlayerMessageMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest, com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> getSendPlayerMessageMethod;
    if ((getSendPlayerMessageMethod = MinecraftPlayerGrpc.getSendPlayerMessageMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getSendPlayerMessageMethod = MinecraftPlayerGrpc.getSendPlayerMessageMethod) == null) {
          MinecraftPlayerGrpc.getSendPlayerMessageMethod = getSendPlayerMessageMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest, com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendPlayerMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("sendPlayerMessage"))
              .build();
        }
      }
    }
    return getSendPlayerMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> getTeleportPlayerToLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "teleportPlayerToLocation",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> getTeleportPlayerToLocationMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest, com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> getTeleportPlayerToLocationMethod;
    if ((getTeleportPlayerToLocationMethod = MinecraftPlayerGrpc.getTeleportPlayerToLocationMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getTeleportPlayerToLocationMethod = MinecraftPlayerGrpc.getTeleportPlayerToLocationMethod) == null) {
          MinecraftPlayerGrpc.getTeleportPlayerToLocationMethod = getTeleportPlayerToLocationMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest, com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "teleportPlayerToLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("teleportPlayerToLocation"))
              .build();
        }
      }
    }
    return getTeleportPlayerToLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> getTeleportPlayerToEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "teleportPlayerToEntity",
      requestType = com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest,
      com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> getTeleportPlayerToEntityMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest, com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> getTeleportPlayerToEntityMethod;
    if ((getTeleportPlayerToEntityMethod = MinecraftPlayerGrpc.getTeleportPlayerToEntityMethod) == null) {
      synchronized (MinecraftPlayerGrpc.class) {
        if ((getTeleportPlayerToEntityMethod = MinecraftPlayerGrpc.getTeleportPlayerToEntityMethod) == null) {
          MinecraftPlayerGrpc.getTeleportPlayerToEntityMethod = getTeleportPlayerToEntityMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest, com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "teleportPlayerToEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftPlayerMethodDescriptorSupplier("teleportPlayerToEntity"))
              .build();
        }
      }
    }
    return getTeleportPlayerToEntityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MinecraftPlayerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerStub>() {
        @java.lang.Override
        public MinecraftPlayerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftPlayerStub(channel, callOptions);
        }
      };
    return MinecraftPlayerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MinecraftPlayerBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerBlockingV2Stub>() {
        @java.lang.Override
        public MinecraftPlayerBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftPlayerBlockingV2Stub(channel, callOptions);
        }
      };
    return MinecraftPlayerBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MinecraftPlayerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerBlockingStub>() {
        @java.lang.Override
        public MinecraftPlayerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftPlayerBlockingStub(channel, callOptions);
        }
      };
    return MinecraftPlayerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MinecraftPlayerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftPlayerFutureStub>() {
        @java.lang.Override
        public MinecraftPlayerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftPlayerFutureStub(channel, callOptions);
        }
      };
    return MinecraftPlayerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOnlinePlayers(com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOnlinePlayersMethod(), responseObserver);
    }

    /**
     */
    default void getOnlinePlayer(com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOnlinePlayerMethod(), responseObserver);
    }

    /**
     */
    default void kickPlayer(com.yplugins.minecraftrpc.proto.player.PlayerKickRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKickPlayerMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerHealthMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerExperienceMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerLevelMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerMaxHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerMaxHealthMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerFoodLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerFoodLevelMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerTotalExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerTotalExperienceMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerGamemode(com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerGamemodeMethod(), responseObserver);
    }

    /**
     */
    default void setPlayerAllowFlight(com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlayerAllowFlightMethod(), responseObserver);
    }

    /**
     */
    default void sendPlayerMessage(com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPlayerMessageMethod(), responseObserver);
    }

    /**
     */
    default void teleportPlayerToLocation(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeleportPlayerToLocationMethod(), responseObserver);
    }

    /**
     */
    default void teleportPlayerToEntity(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeleportPlayerToEntityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MinecraftPlayer.
   */
  public static abstract class MinecraftPlayerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MinecraftPlayerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MinecraftPlayer.
   */
  public static final class MinecraftPlayerStub
      extends io.grpc.stub.AbstractAsyncStub<MinecraftPlayerStub> {
    private MinecraftPlayerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftPlayerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftPlayerStub(channel, callOptions);
    }

    /**
     */
    public void getOnlinePlayers(com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOnlinePlayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOnlinePlayer(com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOnlinePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kickPlayer(com.yplugins.minecraftrpc.proto.player.PlayerKickRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKickPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerExperienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerMaxHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerMaxHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerFoodLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerFoodLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerTotalExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerTotalExperienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerGamemode(com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerGamemodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPlayerAllowFlight(com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlayerAllowFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPlayerMessage(com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPlayerMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void teleportPlayerToLocation(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeleportPlayerToLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void teleportPlayerToEntity(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeleportPlayerToEntityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MinecraftPlayer.
   */
  public static final class MinecraftPlayerBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftPlayerBlockingV2Stub> {
    private MinecraftPlayerBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftPlayerBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftPlayerBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse getOnlinePlayers(com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnlinePlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse getOnlinePlayer(com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnlinePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerKickResponse kickPlayer(com.yplugins.minecraftrpc.proto.player.PlayerKickRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse setPlayerHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse setPlayerExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerExperienceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse setPlayerLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse setPlayerMaxHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerMaxHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse setPlayerFoodLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerFoodLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse setPlayerTotalExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerTotalExperienceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse setPlayerGamemode(com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerGamemodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse setPlayerAllowFlight(com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerAllowFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse sendPlayerMessage(com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPlayerMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse teleportPlayerToLocation(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeleportPlayerToLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse teleportPlayerToEntity(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeleportPlayerToEntityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MinecraftPlayer.
   */
  public static final class MinecraftPlayerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftPlayerBlockingStub> {
    private MinecraftPlayerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftPlayerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftPlayerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse getOnlinePlayers(com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnlinePlayersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse getOnlinePlayer(com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnlinePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerKickResponse kickPlayer(com.yplugins.minecraftrpc.proto.player.PlayerKickRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKickPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse setPlayerHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse setPlayerExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerExperienceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse setPlayerLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse setPlayerMaxHealth(com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerMaxHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse setPlayerFoodLevel(com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerFoodLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse setPlayerTotalExperience(com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerTotalExperienceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse setPlayerGamemode(com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerGamemodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse setPlayerAllowFlight(com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlayerAllowFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse sendPlayerMessage(com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPlayerMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse teleportPlayerToLocation(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeleportPlayerToLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse teleportPlayerToEntity(com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeleportPlayerToEntityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MinecraftPlayer.
   */
  public static final class MinecraftPlayerFutureStub
      extends io.grpc.stub.AbstractFutureStub<MinecraftPlayerFutureStub> {
    private MinecraftPlayerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftPlayerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftPlayerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse> getOnlinePlayers(
        com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOnlinePlayersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse> getOnlinePlayer(
        com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOnlinePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerKickResponse> kickPlayer(
        com.yplugins.minecraftrpc.proto.player.PlayerKickRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKickPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse> setPlayerHealth(
        com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerHealthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse> setPlayerExperience(
        com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerExperienceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse> setPlayerLevel(
        com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse> setPlayerMaxHealth(
        com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerMaxHealthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse> setPlayerFoodLevel(
        com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerFoodLevelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse> setPlayerTotalExperience(
        com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerTotalExperienceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse> setPlayerGamemode(
        com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerGamemodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse> setPlayerAllowFlight(
        com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlayerAllowFlightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse> sendPlayerMessage(
        com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPlayerMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse> teleportPlayerToLocation(
        com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeleportPlayerToLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse> teleportPlayerToEntity(
        com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeleportPlayerToEntityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ONLINE_PLAYERS = 0;
  private static final int METHODID_GET_ONLINE_PLAYER = 1;
  private static final int METHODID_KICK_PLAYER = 2;
  private static final int METHODID_SET_PLAYER_HEALTH = 3;
  private static final int METHODID_SET_PLAYER_EXPERIENCE = 4;
  private static final int METHODID_SET_PLAYER_LEVEL = 5;
  private static final int METHODID_SET_PLAYER_MAX_HEALTH = 6;
  private static final int METHODID_SET_PLAYER_FOOD_LEVEL = 7;
  private static final int METHODID_SET_PLAYER_TOTAL_EXPERIENCE = 8;
  private static final int METHODID_SET_PLAYER_GAMEMODE = 9;
  private static final int METHODID_SET_PLAYER_ALLOW_FLIGHT = 10;
  private static final int METHODID_SEND_PLAYER_MESSAGE = 11;
  private static final int METHODID_TELEPORT_PLAYER_TO_LOCATION = 12;
  private static final int METHODID_TELEPORT_PLAYER_TO_ENTITY = 13;

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
        case METHODID_GET_ONLINE_PLAYERS:
          serviceImpl.getOnlinePlayers((com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse>) responseObserver);
          break;
        case METHODID_GET_ONLINE_PLAYER:
          serviceImpl.getOnlinePlayer((com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse>) responseObserver);
          break;
        case METHODID_KICK_PLAYER:
          serviceImpl.kickPlayer((com.yplugins.minecraftrpc.proto.player.PlayerKickRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerKickResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_HEALTH:
          serviceImpl.setPlayerHealth((com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_EXPERIENCE:
          serviceImpl.setPlayerExperience((com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_LEVEL:
          serviceImpl.setPlayerLevel((com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_MAX_HEALTH:
          serviceImpl.setPlayerMaxHealth((com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_FOOD_LEVEL:
          serviceImpl.setPlayerFoodLevel((com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_TOTAL_EXPERIENCE:
          serviceImpl.setPlayerTotalExperience((com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_GAMEMODE:
          serviceImpl.setPlayerGamemode((com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse>) responseObserver);
          break;
        case METHODID_SET_PLAYER_ALLOW_FLIGHT:
          serviceImpl.setPlayerAllowFlight((com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse>) responseObserver);
          break;
        case METHODID_SEND_PLAYER_MESSAGE:
          serviceImpl.sendPlayerMessage((com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse>) responseObserver);
          break;
        case METHODID_TELEPORT_PLAYER_TO_LOCATION:
          serviceImpl.teleportPlayerToLocation((com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse>) responseObserver);
          break;
        case METHODID_TELEPORT_PLAYER_TO_ENTITY:
          serviceImpl.teleportPlayerToEntity((com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse>) responseObserver);
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
          getGetOnlinePlayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.OnlinePlayersRequest,
              com.yplugins.minecraftrpc.proto.player.OnlinePlayersResponse>(
                service, METHODID_GET_ONLINE_PLAYERS)))
        .addMethod(
          getGetOnlinePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.OnlinePlayerRequest,
              com.yplugins.minecraftrpc.proto.player.OnlinePlayerResponse>(
                service, METHODID_GET_ONLINE_PLAYER)))
        .addMethod(
          getKickPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerKickRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerKickResponse>(
                service, METHODID_KICK_PLAYER)))
        .addMethod(
          getSetPlayerHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetHealthRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetHealthResponse>(
                service, METHODID_SET_PLAYER_HEALTH)))
        .addMethod(
          getSetPlayerExperienceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetExperienceResponse>(
                service, METHODID_SET_PLAYER_EXPERIENCE)))
        .addMethod(
          getSetPlayerLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetLevelRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetLevelResponse>(
                service, METHODID_SET_PLAYER_LEVEL)))
        .addMethod(
          getSetPlayerMaxHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetMaxHealthResponse>(
                service, METHODID_SET_PLAYER_MAX_HEALTH)))
        .addMethod(
          getSetPlayerFoodLevelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetFoodLevelResponse>(
                service, METHODID_SET_PLAYER_FOOD_LEVEL)))
        .addMethod(
          getSetPlayerTotalExperienceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetTotalExperienceResponse>(
                service, METHODID_SET_PLAYER_TOTAL_EXPERIENCE)))
        .addMethod(
          getSetPlayerGamemodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetGamemodeResponse>(
                service, METHODID_SET_PLAYER_GAMEMODE)))
        .addMethod(
          getSetPlayerAllowFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSetAllowFlightResponse>(
                service, METHODID_SET_PLAYER_ALLOW_FLIGHT)))
        .addMethod(
          getSendPlayerMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerSendMessageRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerSendMessageResponse>(
                service, METHODID_SEND_PLAYER_MESSAGE)))
        .addMethod(
          getTeleportPlayerToLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerTeleportToLocationResponse>(
                service, METHODID_TELEPORT_PLAYER_TO_LOCATION)))
        .addMethod(
          getTeleportPlayerToEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityRequest,
              com.yplugins.minecraftrpc.proto.player.PlayerTeleportToEntityResponse>(
                service, METHODID_TELEPORT_PLAYER_TO_ENTITY)))
        .build();
  }

  private static abstract class MinecraftPlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MinecraftPlayerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yplugins.minecraftrpc.proto.player.MinecraftRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MinecraftPlayer");
    }
  }

  private static final class MinecraftPlayerFileDescriptorSupplier
      extends MinecraftPlayerBaseDescriptorSupplier {
    MinecraftPlayerFileDescriptorSupplier() {}
  }

  private static final class MinecraftPlayerMethodDescriptorSupplier
      extends MinecraftPlayerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MinecraftPlayerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MinecraftPlayerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MinecraftPlayerFileDescriptorSupplier())
              .addMethod(getGetOnlinePlayersMethod())
              .addMethod(getGetOnlinePlayerMethod())
              .addMethod(getKickPlayerMethod())
              .addMethod(getSetPlayerHealthMethod())
              .addMethod(getSetPlayerExperienceMethod())
              .addMethod(getSetPlayerLevelMethod())
              .addMethod(getSetPlayerMaxHealthMethod())
              .addMethod(getSetPlayerFoodLevelMethod())
              .addMethod(getSetPlayerTotalExperienceMethod())
              .addMethod(getSetPlayerGamemodeMethod())
              .addMethod(getSetPlayerAllowFlightMethod())
              .addMethod(getSendPlayerMessageMethod())
              .addMethod(getTeleportPlayerToLocationMethod())
              .addMethod(getTeleportPlayerToEntityMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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

  public static final java.lang.String SERVICE_NAME = "MinecraftTypes.MinecraftPlayer";

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
  }

  private static final int METHODID_GET_ONLINE_PLAYERS = 0;
  private static final int METHODID_GET_ONLINE_PLAYER = 1;

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
              .build();
        }
      }
    }
    return result;
  }
}

package com.yplugins.minecraftrpc.proto.world;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: minecraft_world.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MinecraftWorldGrpc {

  private MinecraftWorldGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MinecraftWorld.MinecraftWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.WorldListRequest,
      com.yplugins.minecraftrpc.proto.world.WorldListResponse> getGetWorldListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWorldList",
      requestType = com.yplugins.minecraftrpc.proto.world.WorldListRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.world.WorldListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.WorldListRequest,
      com.yplugins.minecraftrpc.proto.world.WorldListResponse> getGetWorldListMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.WorldListRequest, com.yplugins.minecraftrpc.proto.world.WorldListResponse> getGetWorldListMethod;
    if ((getGetWorldListMethod = MinecraftWorldGrpc.getGetWorldListMethod) == null) {
      synchronized (MinecraftWorldGrpc.class) {
        if ((getGetWorldListMethod = MinecraftWorldGrpc.getGetWorldListMethod) == null) {
          MinecraftWorldGrpc.getGetWorldListMethod = getGetWorldListMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.world.WorldListRequest, com.yplugins.minecraftrpc.proto.world.WorldListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getWorldList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.WorldListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.WorldListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftWorldMethodDescriptorSupplier("getWorldList"))
              .build();
        }
      }
    }
    return getGetWorldListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.GetWorldRequest,
      com.yplugins.minecraftrpc.proto.world.GetWorldResponse> getGetWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWorld",
      requestType = com.yplugins.minecraftrpc.proto.world.GetWorldRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.world.GetWorldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.GetWorldRequest,
      com.yplugins.minecraftrpc.proto.world.GetWorldResponse> getGetWorldMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.GetWorldRequest, com.yplugins.minecraftrpc.proto.world.GetWorldResponse> getGetWorldMethod;
    if ((getGetWorldMethod = MinecraftWorldGrpc.getGetWorldMethod) == null) {
      synchronized (MinecraftWorldGrpc.class) {
        if ((getGetWorldMethod = MinecraftWorldGrpc.getGetWorldMethod) == null) {
          MinecraftWorldGrpc.getGetWorldMethod = getGetWorldMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.world.GetWorldRequest, com.yplugins.minecraftrpc.proto.world.GetWorldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.GetWorldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.GetWorldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftWorldMethodDescriptorSupplier("getWorld"))
              .build();
        }
      }
    }
    return getGetWorldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.SetWeatherRequest,
      com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> getSetWeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setWeather",
      requestType = com.yplugins.minecraftrpc.proto.world.SetWeatherRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.world.SetWeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.SetWeatherRequest,
      com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> getSetWeatherMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.world.SetWeatherRequest, com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> getSetWeatherMethod;
    if ((getSetWeatherMethod = MinecraftWorldGrpc.getSetWeatherMethod) == null) {
      synchronized (MinecraftWorldGrpc.class) {
        if ((getSetWeatherMethod = MinecraftWorldGrpc.getSetWeatherMethod) == null) {
          MinecraftWorldGrpc.getSetWeatherMethod = getSetWeatherMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.world.SetWeatherRequest, com.yplugins.minecraftrpc.proto.world.SetWeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setWeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.SetWeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.world.SetWeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftWorldMethodDescriptorSupplier("setWeather"))
              .build();
        }
      }
    }
    return getSetWeatherMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MinecraftWorldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldStub>() {
        @java.lang.Override
        public MinecraftWorldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftWorldStub(channel, callOptions);
        }
      };
    return MinecraftWorldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MinecraftWorldBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldBlockingV2Stub>() {
        @java.lang.Override
        public MinecraftWorldBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftWorldBlockingV2Stub(channel, callOptions);
        }
      };
    return MinecraftWorldBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MinecraftWorldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldBlockingStub>() {
        @java.lang.Override
        public MinecraftWorldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftWorldBlockingStub(channel, callOptions);
        }
      };
    return MinecraftWorldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MinecraftWorldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftWorldFutureStub>() {
        @java.lang.Override
        public MinecraftWorldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftWorldFutureStub(channel, callOptions);
        }
      };
    return MinecraftWorldFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getWorldList(com.yplugins.minecraftrpc.proto.world.WorldListRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.WorldListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorldListMethod(), responseObserver);
    }

    /**
     */
    default void getWorld(com.yplugins.minecraftrpc.proto.world.GetWorldRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.GetWorldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorldMethod(), responseObserver);
    }

    /**
     */
    default void setWeather(com.yplugins.minecraftrpc.proto.world.SetWeatherRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWeatherMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MinecraftWorld.
   */
  public static abstract class MinecraftWorldImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MinecraftWorldGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MinecraftWorld.
   */
  public static final class MinecraftWorldStub
      extends io.grpc.stub.AbstractAsyncStub<MinecraftWorldStub> {
    private MinecraftWorldStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftWorldStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftWorldStub(channel, callOptions);
    }

    /**
     */
    public void getWorldList(com.yplugins.minecraftrpc.proto.world.WorldListRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.WorldListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorldListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorld(com.yplugins.minecraftrpc.proto.world.GetWorldRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.GetWorldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWeather(com.yplugins.minecraftrpc.proto.world.SetWeatherRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWeatherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MinecraftWorld.
   */
  public static final class MinecraftWorldBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftWorldBlockingV2Stub> {
    private MinecraftWorldBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftWorldBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftWorldBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.WorldListResponse getWorldList(com.yplugins.minecraftrpc.proto.world.WorldListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorldListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.GetWorldResponse getWorld(com.yplugins.minecraftrpc.proto.world.GetWorldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.SetWeatherResponse setWeather(com.yplugins.minecraftrpc.proto.world.SetWeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWeatherMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MinecraftWorld.
   */
  public static final class MinecraftWorldBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftWorldBlockingStub> {
    private MinecraftWorldBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftWorldBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftWorldBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.WorldListResponse getWorldList(com.yplugins.minecraftrpc.proto.world.WorldListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorldListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.GetWorldResponse getWorld(com.yplugins.minecraftrpc.proto.world.GetWorldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.world.SetWeatherResponse setWeather(com.yplugins.minecraftrpc.proto.world.SetWeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWeatherMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MinecraftWorld.
   */
  public static final class MinecraftWorldFutureStub
      extends io.grpc.stub.AbstractFutureStub<MinecraftWorldFutureStub> {
    private MinecraftWorldFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftWorldFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftWorldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.world.WorldListResponse> getWorldList(
        com.yplugins.minecraftrpc.proto.world.WorldListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorldListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.world.GetWorldResponse> getWorld(
        com.yplugins.minecraftrpc.proto.world.GetWorldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.world.SetWeatherResponse> setWeather(
        com.yplugins.minecraftrpc.proto.world.SetWeatherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWeatherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WORLD_LIST = 0;
  private static final int METHODID_GET_WORLD = 1;
  private static final int METHODID_SET_WEATHER = 2;

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
        case METHODID_GET_WORLD_LIST:
          serviceImpl.getWorldList((com.yplugins.minecraftrpc.proto.world.WorldListRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.WorldListResponse>) responseObserver);
          break;
        case METHODID_GET_WORLD:
          serviceImpl.getWorld((com.yplugins.minecraftrpc.proto.world.GetWorldRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.GetWorldResponse>) responseObserver);
          break;
        case METHODID_SET_WEATHER:
          serviceImpl.setWeather((com.yplugins.minecraftrpc.proto.world.SetWeatherRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.world.SetWeatherResponse>) responseObserver);
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
          getGetWorldListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.world.WorldListRequest,
              com.yplugins.minecraftrpc.proto.world.WorldListResponse>(
                service, METHODID_GET_WORLD_LIST)))
        .addMethod(
          getGetWorldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.world.GetWorldRequest,
              com.yplugins.minecraftrpc.proto.world.GetWorldResponse>(
                service, METHODID_GET_WORLD)))
        .addMethod(
          getSetWeatherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.world.SetWeatherRequest,
              com.yplugins.minecraftrpc.proto.world.SetWeatherResponse>(
                service, METHODID_SET_WEATHER)))
        .build();
  }

  private static abstract class MinecraftWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MinecraftWorldBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yplugins.minecraftrpc.proto.world.MinecraftRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MinecraftWorld");
    }
  }

  private static final class MinecraftWorldFileDescriptorSupplier
      extends MinecraftWorldBaseDescriptorSupplier {
    MinecraftWorldFileDescriptorSupplier() {}
  }

  private static final class MinecraftWorldMethodDescriptorSupplier
      extends MinecraftWorldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MinecraftWorldMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MinecraftWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MinecraftWorldFileDescriptorSupplier())
              .addMethod(getGetWorldListMethod())
              .addMethod(getGetWorldMethod())
              .addMethod(getSetWeatherMethod())
              .build();
        }
      }
    }
    return result;
  }
}

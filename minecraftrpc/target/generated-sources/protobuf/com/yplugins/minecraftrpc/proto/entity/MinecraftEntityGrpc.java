package com.yplugins.minecraftrpc.proto.entity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.72.0)",
    comments = "Source: minecraft_entity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MinecraftEntityGrpc {

  private MinecraftEntityGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MinecraftEntity.MinecraftEntity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest,
      com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> getSpawnEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spawnEntity",
      requestType = com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest.class,
      responseType = com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest,
      com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> getSpawnEntityMethod() {
    io.grpc.MethodDescriptor<com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest, com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> getSpawnEntityMethod;
    if ((getSpawnEntityMethod = MinecraftEntityGrpc.getSpawnEntityMethod) == null) {
      synchronized (MinecraftEntityGrpc.class) {
        if ((getSpawnEntityMethod = MinecraftEntityGrpc.getSpawnEntityMethod) == null) {
          MinecraftEntityGrpc.getSpawnEntityMethod = getSpawnEntityMethod =
              io.grpc.MethodDescriptor.<com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest, com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "spawnEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MinecraftEntityMethodDescriptorSupplier("spawnEntity"))
              .build();
        }
      }
    }
    return getSpawnEntityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MinecraftEntityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityStub>() {
        @java.lang.Override
        public MinecraftEntityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftEntityStub(channel, callOptions);
        }
      };
    return MinecraftEntityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MinecraftEntityBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityBlockingV2Stub>() {
        @java.lang.Override
        public MinecraftEntityBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftEntityBlockingV2Stub(channel, callOptions);
        }
      };
    return MinecraftEntityBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MinecraftEntityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityBlockingStub>() {
        @java.lang.Override
        public MinecraftEntityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftEntityBlockingStub(channel, callOptions);
        }
      };
    return MinecraftEntityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MinecraftEntityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MinecraftEntityFutureStub>() {
        @java.lang.Override
        public MinecraftEntityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MinecraftEntityFutureStub(channel, callOptions);
        }
      };
    return MinecraftEntityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void spawnEntity(com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpawnEntityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MinecraftEntity.
   */
  public static abstract class MinecraftEntityImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MinecraftEntityGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MinecraftEntity.
   */
  public static final class MinecraftEntityStub
      extends io.grpc.stub.AbstractAsyncStub<MinecraftEntityStub> {
    private MinecraftEntityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftEntityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftEntityStub(channel, callOptions);
    }

    /**
     */
    public void spawnEntity(com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest request,
        io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpawnEntityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MinecraftEntity.
   */
  public static final class MinecraftEntityBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftEntityBlockingV2Stub> {
    private MinecraftEntityBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftEntityBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftEntityBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse spawnEntity(com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpawnEntityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MinecraftEntity.
   */
  public static final class MinecraftEntityBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MinecraftEntityBlockingStub> {
    private MinecraftEntityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftEntityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftEntityBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse spawnEntity(com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpawnEntityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MinecraftEntity.
   */
  public static final class MinecraftEntityFutureStub
      extends io.grpc.stub.AbstractFutureStub<MinecraftEntityFutureStub> {
    private MinecraftEntityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MinecraftEntityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MinecraftEntityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse> spawnEntity(
        com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpawnEntityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPAWN_ENTITY = 0;

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
        case METHODID_SPAWN_ENTITY:
          serviceImpl.spawnEntity((com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse>) responseObserver);
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
          getSpawnEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.yplugins.minecraftrpc.proto.entity.SpawnEntityRequest,
              com.yplugins.minecraftrpc.proto.entity.SpawnEntityResponse>(
                service, METHODID_SPAWN_ENTITY)))
        .build();
  }

  private static abstract class MinecraftEntityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MinecraftEntityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yplugins.minecraftrpc.proto.entity.MinecraftRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MinecraftEntity");
    }
  }

  private static final class MinecraftEntityFileDescriptorSupplier
      extends MinecraftEntityBaseDescriptorSupplier {
    MinecraftEntityFileDescriptorSupplier() {}
  }

  private static final class MinecraftEntityMethodDescriptorSupplier
      extends MinecraftEntityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MinecraftEntityMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MinecraftEntityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MinecraftEntityFileDescriptorSupplier())
              .addMethod(getSpawnEntityMethod())
              .build();
        }
      }
    }
    return result;
  }
}

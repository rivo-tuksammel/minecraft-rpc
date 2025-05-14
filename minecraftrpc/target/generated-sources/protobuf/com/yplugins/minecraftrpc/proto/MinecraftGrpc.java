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

  public static final java.lang.String SERVICE_NAME = "Minecraft.Minecraft";

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
  }

  private static final int METHODID_RUN_COMMAND = 0;
  private static final int METHODID_POST_TO_CHAT = 1;

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
              .build();
        }
      }
    }
    return result;
  }
}

package ai.sensorycloud.api.v1.assistant;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/assistant/assistant.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssistantServiceGrpc {

  private AssistantServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.assistant.AssistantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.TextChatRequest,
      ai.sensorycloud.api.v1.assistant.TextChatResponse> getTextChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextChat",
      requestType = ai.sensorycloud.api.v1.assistant.TextChatRequest.class,
      responseType = ai.sensorycloud.api.v1.assistant.TextChatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.TextChatRequest,
      ai.sensorycloud.api.v1.assistant.TextChatResponse> getTextChatMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.TextChatRequest, ai.sensorycloud.api.v1.assistant.TextChatResponse> getTextChatMethod;
    if ((getTextChatMethod = AssistantServiceGrpc.getTextChatMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getTextChatMethod = AssistantServiceGrpc.getTextChatMethod) == null) {
          AssistantServiceGrpc.getTextChatMethod = getTextChatMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.assistant.TextChatRequest, ai.sensorycloud.api.v1.assistant.TextChatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.assistant.TextChatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.assistant.TextChatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTextChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssistantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub>() {
        @java.lang.Override
        public AssistantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceStub(channel, callOptions);
        }
      };
    return AssistantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssistantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub>() {
        @java.lang.Override
        public AssistantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceBlockingStub(channel, callOptions);
        }
      };
    return AssistantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssistantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub>() {
        @java.lang.Override
        public AssistantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceFutureStub(channel, callOptions);
        }
      };
    return AssistantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AssistantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Allows a user to verify their own email. Will fail if the email is already verified.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void textChat(ai.sensorycloud.api.v1.assistant.TextChatRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.TextChatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTextChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.assistant.TextChatRequest,
                ai.sensorycloud.api.v1.assistant.TextChatResponse>(
                  this, METHODID_TEXT_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class AssistantServiceStub extends io.grpc.stub.AbstractAsyncStub<AssistantServiceStub> {
    private AssistantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a user to verify their own email. Will fail if the email is already verified.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void textChat(ai.sensorycloud.api.v1.assistant.TextChatRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.TextChatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextChatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AssistantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssistantServiceBlockingStub> {
    private AssistantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a user to verify their own email. Will fail if the email is already verified.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.assistant.TextChatResponse textChat(ai.sensorycloud.api.v1.assistant.TextChatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextChatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AssistantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssistantServiceFutureStub> {
    private AssistantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a user to verify their own email. Will fail if the email is already verified.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.assistant.TextChatResponse> textChat(
        ai.sensorycloud.api.v1.assistant.TextChatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextChatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEXT_CHAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssistantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssistantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEXT_CHAT:
          serviceImpl.textChat((ai.sensorycloud.api.v1.assistant.TextChatRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.TextChatResponse>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AssistantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getTextChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}

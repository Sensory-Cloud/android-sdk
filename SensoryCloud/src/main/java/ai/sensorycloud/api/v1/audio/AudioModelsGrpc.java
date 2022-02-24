package ai.sensorycloud.api.v1.audio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles the retrieval and management of audio models
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/audio/audio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioModelsGrpc {

  private AudioModelsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.audio.AudioModels";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.GetModelsRequest,
      ai.sensorycloud.api.v1.audio.GetModelsResponse> getGetModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModels",
      requestType = ai.sensorycloud.api.v1.audio.GetModelsRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.GetModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.GetModelsRequest,
      ai.sensorycloud.api.v1.audio.GetModelsResponse> getGetModelsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.GetModelsRequest, ai.sensorycloud.api.v1.audio.GetModelsResponse> getGetModelsMethod;
    if ((getGetModelsMethod = AudioModelsGrpc.getGetModelsMethod) == null) {
      synchronized (AudioModelsGrpc.class) {
        if ((getGetModelsMethod = AudioModelsGrpc.getGetModelsMethod) == null) {
          AudioModelsGrpc.getGetModelsMethod = getGetModelsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.GetModelsRequest, ai.sensorycloud.api.v1.audio.GetModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.GetModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.GetModelsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioModelsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioModelsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioModelsStub>() {
        @java.lang.Override
        public AudioModelsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioModelsStub(channel, callOptions);
        }
      };
    return AudioModelsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioModelsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioModelsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioModelsBlockingStub>() {
        @java.lang.Override
        public AudioModelsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioModelsBlockingStub(channel, callOptions);
        }
      };
    return AudioModelsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioModelsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioModelsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioModelsFutureStub>() {
        @java.lang.Override
        public AudioModelsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioModelsFutureStub(channel, callOptions);
        }
      };
    return AudioModelsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles the retrieval and management of audio models
   * </pre>
   */
  public static abstract class AudioModelsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getModels(ai.sensorycloud.api.v1.audio.GetModelsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.GetModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.GetModelsRequest,
                ai.sensorycloud.api.v1.audio.GetModelsResponse>(
                  this, METHODID_GET_MODELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of audio models
   * </pre>
   */
  public static final class AudioModelsStub extends io.grpc.stub.AbstractAsyncStub<AudioModelsStub> {
    private AudioModelsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioModelsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioModelsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getModels(ai.sensorycloud.api.v1.audio.GetModelsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.GetModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of audio models
   * </pre>
   */
  public static final class AudioModelsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioModelsBlockingStub> {
    private AudioModelsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioModelsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioModelsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.audio.GetModelsResponse getModels(ai.sensorycloud.api.v1.audio.GetModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of audio models
   * </pre>
   */
  public static final class AudioModelsFutureStub extends io.grpc.stub.AbstractFutureStub<AudioModelsFutureStub> {
    private AudioModelsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioModelsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioModelsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.audio.GetModelsResponse> getModels(
        ai.sensorycloud.api.v1.audio.GetModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MODELS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioModelsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioModelsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MODELS:
          serviceImpl.getModels((ai.sensorycloud.api.v1.audio.GetModelsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.GetModelsResponse>) responseObserver);
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
      synchronized (AudioModelsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

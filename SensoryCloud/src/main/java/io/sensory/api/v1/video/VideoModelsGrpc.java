package io.sensory.api.v1.video;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles the retrieval and management of video models
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/video/video.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoModelsGrpc {

  private VideoModelsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.video.VideoModels";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.sensory.api.v1.video.GetModelsRequest,
      io.sensory.api.v1.video.GetModelsResponse> getGetModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModels",
      requestType = io.sensory.api.v1.video.GetModelsRequest.class,
      responseType = io.sensory.api.v1.video.GetModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.sensory.api.v1.video.GetModelsRequest,
      io.sensory.api.v1.video.GetModelsResponse> getGetModelsMethod() {
    io.grpc.MethodDescriptor<io.sensory.api.v1.video.GetModelsRequest, io.sensory.api.v1.video.GetModelsResponse> getGetModelsMethod;
    if ((getGetModelsMethod = VideoModelsGrpc.getGetModelsMethod) == null) {
      synchronized (VideoModelsGrpc.class) {
        if ((getGetModelsMethod = VideoModelsGrpc.getGetModelsMethod) == null) {
          VideoModelsGrpc.getGetModelsMethod = getGetModelsMethod =
              io.grpc.MethodDescriptor.<io.sensory.api.v1.video.GetModelsRequest, io.sensory.api.v1.video.GetModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.sensory.api.v1.video.GetModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.sensory.api.v1.video.GetModelsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoModelsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoModelsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoModelsStub>() {
        @java.lang.Override
        public VideoModelsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoModelsStub(channel, callOptions);
        }
      };
    return VideoModelsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoModelsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoModelsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoModelsBlockingStub>() {
        @java.lang.Override
        public VideoModelsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoModelsBlockingStub(channel, callOptions);
        }
      };
    return VideoModelsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoModelsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoModelsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoModelsFutureStub>() {
        @java.lang.Override
        public VideoModelsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoModelsFutureStub(channel, callOptions);
        }
      };
    return VideoModelsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles the retrieval and management of video models
   * </pre>
   */
  public static abstract class VideoModelsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getModels(io.sensory.api.v1.video.GetModelsRequest request,
        io.grpc.stub.StreamObserver<io.sensory.api.v1.video.GetModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.sensory.api.v1.video.GetModelsRequest,
                io.sensory.api.v1.video.GetModelsResponse>(
                  this, METHODID_GET_MODELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of video models
   * </pre>
   */
  public static final class VideoModelsStub extends io.grpc.stub.AbstractAsyncStub<VideoModelsStub> {
    private VideoModelsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoModelsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoModelsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getModels(io.sensory.api.v1.video.GetModelsRequest request,
        io.grpc.stub.StreamObserver<io.sensory.api.v1.video.GetModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of video models
   * </pre>
   */
  public static final class VideoModelsBlockingStub extends io.grpc.stub.AbstractBlockingStub<VideoModelsBlockingStub> {
    private VideoModelsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoModelsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoModelsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.sensory.api.v1.video.GetModelsResponse getModels(io.sensory.api.v1.video.GetModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Handles the retrieval and management of video models
   * </pre>
   */
  public static final class VideoModelsFutureStub extends io.grpc.stub.AbstractFutureStub<VideoModelsFutureStub> {
    private VideoModelsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoModelsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoModelsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get available models for enrollment and authentication
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.sensory.api.v1.video.GetModelsResponse> getModels(
        io.sensory.api.v1.video.GetModelsRequest request) {
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
    private final VideoModelsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoModelsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MODELS:
          serviceImpl.getModels((io.sensory.api.v1.video.GetModelsRequest) request,
              (io.grpc.stub.StreamObserver<io.sensory.api.v1.video.GetModelsResponse>) responseObserver);
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
      synchronized (VideoModelsGrpc.class) {
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

package ai.sensorycloud.api.v1.video;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all video-related biometrics
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/video/video.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoBiometricsGrpc {

  private VideoBiometricsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.video.VideoBiometrics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest,
      ai.sensorycloud.api.v1.video.CreateEnrollmentResponse> getCreateEnrollmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnrollment",
      requestType = ai.sensorycloud.api.v1.video.CreateEnrollmentRequest.class,
      responseType = ai.sensorycloud.api.v1.video.CreateEnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest,
      ai.sensorycloud.api.v1.video.CreateEnrollmentResponse> getCreateEnrollmentMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest, ai.sensorycloud.api.v1.video.CreateEnrollmentResponse> getCreateEnrollmentMethod;
    if ((getCreateEnrollmentMethod = VideoBiometricsGrpc.getCreateEnrollmentMethod) == null) {
      synchronized (VideoBiometricsGrpc.class) {
        if ((getCreateEnrollmentMethod = VideoBiometricsGrpc.getCreateEnrollmentMethod) == null) {
          VideoBiometricsGrpc.getCreateEnrollmentMethod = getCreateEnrollmentMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest, ai.sensorycloud.api.v1.video.CreateEnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnrollment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.video.CreateEnrollmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.video.CreateEnrollmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateEnrollmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.AuthenticateRequest,
      ai.sensorycloud.api.v1.video.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = ai.sensorycloud.api.v1.video.AuthenticateRequest.class,
      responseType = ai.sensorycloud.api.v1.video.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.AuthenticateRequest,
      ai.sensorycloud.api.v1.video.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.AuthenticateRequest, ai.sensorycloud.api.v1.video.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = VideoBiometricsGrpc.getAuthenticateMethod) == null) {
      synchronized (VideoBiometricsGrpc.class) {
        if ((getAuthenticateMethod = VideoBiometricsGrpc.getAuthenticateMethod) == null) {
          VideoBiometricsGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.video.AuthenticateRequest, ai.sensorycloud.api.v1.video.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.video.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.video.AuthenticateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoBiometricsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsStub>() {
        @java.lang.Override
        public VideoBiometricsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoBiometricsStub(channel, callOptions);
        }
      };
    return VideoBiometricsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoBiometricsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsBlockingStub>() {
        @java.lang.Override
        public VideoBiometricsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoBiometricsBlockingStub(channel, callOptions);
        }
      };
    return VideoBiometricsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoBiometricsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoBiometricsFutureStub>() {
        @java.lang.Override
        public VideoBiometricsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoBiometricsFutureStub(channel, callOptions);
        }
      };
    return VideoBiometricsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all video-related biometrics
   * </pre>
   */
  public static abstract class VideoBiometricsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enrolls a user with a stream of video. Streams a CreateEnrollmentResponse
     * as the video is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest> createEnrollment(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateEnrollmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a user with a stream of video against an existing enrollment.
     * Streams an AuthenticateResponse as the video is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.AuthenticateRequest> authenticate(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.AuthenticateResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEnrollmentMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.video.CreateEnrollmentRequest,
                ai.sensorycloud.api.v1.video.CreateEnrollmentResponse>(
                  this, METHODID_CREATE_ENROLLMENT)))
          .addMethod(
            getAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.video.AuthenticateRequest,
                ai.sensorycloud.api.v1.video.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles all video-related biometrics
   * </pre>
   */
  public static final class VideoBiometricsStub extends io.grpc.stub.AbstractAsyncStub<VideoBiometricsStub> {
    private VideoBiometricsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoBiometricsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoBiometricsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enrolls a user with a stream of video. Streams a CreateEnrollmentResponse
     * as the video is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.CreateEnrollmentRequest> createEnrollment(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateEnrollmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a user with a stream of video against an existing enrollment.
     * Streams an AuthenticateResponse as the video is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.AuthenticateRequest> authenticate(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.AuthenticateResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Handles all video-related biometrics
   * </pre>
   */
  public static final class VideoBiometricsBlockingStub extends io.grpc.stub.AbstractBlockingStub<VideoBiometricsBlockingStub> {
    private VideoBiometricsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoBiometricsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoBiometricsBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Handles all video-related biometrics
   * </pre>
   */
  public static final class VideoBiometricsFutureStub extends io.grpc.stub.AbstractFutureStub<VideoBiometricsFutureStub> {
    private VideoBiometricsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoBiometricsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoBiometricsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CREATE_ENROLLMENT = 0;
  private static final int METHODID_AUTHENTICATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoBiometricsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoBiometricsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ENROLLMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createEnrollment(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.CreateEnrollmentResponse>) responseObserver);
        case METHODID_AUTHENTICATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.authenticate(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.AuthenticateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VideoBiometricsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateEnrollmentMethod())
              .addMethod(getAuthenticateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

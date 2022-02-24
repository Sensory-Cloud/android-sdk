package ai.sensorycloud.api.v1.audio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all audio-related biometrics
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/audio/audio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioBiometricsGrpc {

  private AudioBiometricsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.audio.AudioBiometrics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest,
      ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrollmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnrollment",
      requestType = ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest,
      ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrollmentMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest, ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrollmentMethod;
    if ((getCreateEnrollmentMethod = AudioBiometricsGrpc.getCreateEnrollmentMethod) == null) {
      synchronized (AudioBiometricsGrpc.class) {
        if ((getCreateEnrollmentMethod = AudioBiometricsGrpc.getCreateEnrollmentMethod) == null) {
          AudioBiometricsGrpc.getCreateEnrollmentMethod = getCreateEnrollmentMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest, ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnrollment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateEnrollmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.AuthenticateRequest,
      ai.sensorycloud.api.v1.audio.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = ai.sensorycloud.api.v1.audio.AuthenticateRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.AuthenticateRequest,
      ai.sensorycloud.api.v1.audio.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.AuthenticateRequest, ai.sensorycloud.api.v1.audio.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AudioBiometricsGrpc.getAuthenticateMethod) == null) {
      synchronized (AudioBiometricsGrpc.class) {
        if ((getAuthenticateMethod = AudioBiometricsGrpc.getAuthenticateMethod) == null) {
          AudioBiometricsGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.AuthenticateRequest, ai.sensorycloud.api.v1.audio.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.AuthenticateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioBiometricsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsStub>() {
        @java.lang.Override
        public AudioBiometricsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioBiometricsStub(channel, callOptions);
        }
      };
    return AudioBiometricsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioBiometricsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsBlockingStub>() {
        @java.lang.Override
        public AudioBiometricsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioBiometricsBlockingStub(channel, callOptions);
        }
      };
    return AudioBiometricsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioBiometricsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioBiometricsFutureStub>() {
        @java.lang.Override
        public AudioBiometricsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioBiometricsFutureStub(channel, callOptions);
        }
      };
    return AudioBiometricsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all audio-related biometrics
   * </pre>
   */
  public static abstract class AudioBiometricsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enrolls a user with a stream of audio. Streams a CreateEnrollmentResponse as the audio is processed.
     * CreateEnrollment only supports biometric-enabled models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest> createEnrollment(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateEnrollmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a user with a stream of audio against an existing enrollment.
     * Streams an AuthenticateResponse as the audio is processed.
     * Authenticate only supports biometric-enabled models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.AuthenticateRequest> authenticate(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.AuthenticateResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAuthenticateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEnrollmentMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest,
                ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>(
                  this, METHODID_CREATE_ENROLLMENT)))
          .addMethod(
            getAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.AuthenticateRequest,
                ai.sensorycloud.api.v1.audio.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles all audio-related biometrics
   * </pre>
   */
  public static final class AudioBiometricsStub extends io.grpc.stub.AbstractAsyncStub<AudioBiometricsStub> {
    private AudioBiometricsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioBiometricsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioBiometricsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enrolls a user with a stream of audio. Streams a CreateEnrollmentResponse as the audio is processed.
     * CreateEnrollment only supports biometric-enabled models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentRequest> createEnrollment(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateEnrollmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a user with a stream of audio against an existing enrollment.
     * Streams an AuthenticateResponse as the audio is processed.
     * Authenticate only supports biometric-enabled models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.AuthenticateRequest> authenticate(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.AuthenticateResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Handles all audio-related biometrics
   * </pre>
   */
  public static final class AudioBiometricsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioBiometricsBlockingStub> {
    private AudioBiometricsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioBiometricsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioBiometricsBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Handles all audio-related biometrics
   * </pre>
   */
  public static final class AudioBiometricsFutureStub extends io.grpc.stub.AbstractFutureStub<AudioBiometricsFutureStub> {
    private AudioBiometricsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioBiometricsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioBiometricsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CREATE_ENROLLMENT = 0;
  private static final int METHODID_AUTHENTICATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioBiometricsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioBiometricsImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>) responseObserver);
        case METHODID_AUTHENTICATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.authenticate(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.AuthenticateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudioBiometricsGrpc.class) {
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

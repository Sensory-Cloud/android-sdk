package ai.sensorycloud.api.v1.audio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all audio event processing
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/audio/audio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioEventsGrpc {

  private AudioEventsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.audio.AudioEvents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEventRequest,
      ai.sensorycloud.api.v1.audio.ValidateEventResponse> getValidateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateEvent",
      requestType = ai.sensorycloud.api.v1.audio.ValidateEventRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.ValidateEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEventRequest,
      ai.sensorycloud.api.v1.audio.ValidateEventResponse> getValidateEventMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEventRequest, ai.sensorycloud.api.v1.audio.ValidateEventResponse> getValidateEventMethod;
    if ((getValidateEventMethod = AudioEventsGrpc.getValidateEventMethod) == null) {
      synchronized (AudioEventsGrpc.class) {
        if ((getValidateEventMethod = AudioEventsGrpc.getValidateEventMethod) == null) {
          AudioEventsGrpc.getValidateEventMethod = getValidateEventMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.ValidateEventRequest, ai.sensorycloud.api.v1.audio.ValidateEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.ValidateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.ValidateEventResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getValidateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest,
      ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrolledEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnrolledEvent",
      requestType = ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest,
      ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrolledEventMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest, ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> getCreateEnrolledEventMethod;
    if ((getCreateEnrolledEventMethod = AudioEventsGrpc.getCreateEnrolledEventMethod) == null) {
      synchronized (AudioEventsGrpc.class) {
        if ((getCreateEnrolledEventMethod = AudioEventsGrpc.getCreateEnrolledEventMethod) == null) {
          AudioEventsGrpc.getCreateEnrolledEventMethod = getCreateEnrolledEventMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest, ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnrolledEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateEnrolledEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest,
      ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse> getValidateEnrolledEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateEnrolledEvent",
      requestType = ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest,
      ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse> getValidateEnrolledEventMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest, ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse> getValidateEnrolledEventMethod;
    if ((getValidateEnrolledEventMethod = AudioEventsGrpc.getValidateEnrolledEventMethod) == null) {
      synchronized (AudioEventsGrpc.class) {
        if ((getValidateEnrolledEventMethod = AudioEventsGrpc.getValidateEnrolledEventMethod) == null) {
          AudioEventsGrpc.getValidateEnrolledEventMethod = getValidateEnrolledEventMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest, ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateEnrolledEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getValidateEnrolledEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioEventsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioEventsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioEventsStub>() {
        @java.lang.Override
        public AudioEventsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioEventsStub(channel, callOptions);
        }
      };
    return AudioEventsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioEventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioEventsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioEventsBlockingStub>() {
        @java.lang.Override
        public AudioEventsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioEventsBlockingStub(channel, callOptions);
        }
      };
    return AudioEventsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioEventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioEventsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioEventsFutureStub>() {
        @java.lang.Override
        public AudioEventsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioEventsFutureStub(channel, callOptions);
        }
      };
    return AudioEventsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all audio event processing
   * </pre>
   */
  public static abstract class AudioEventsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Validates a phrase or sound with a stream of audio.
     * Streams a ValidateEventResponse as the audio is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEventRequest> validateEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEventResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getValidateEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enrolls a sound or voice. Streams a CreateEnrollmentResponse as the audio is processed.
     * CreateEnrollment supports all enrollable models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest> createEnrolledEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateEnrolledEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a sound or voice. Streams a ValidateEventResponse as the audio is processed.
     * ValidateEnrolledEvent supports all enrollable models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest> validateEnrolledEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getValidateEnrolledEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateEventMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.ValidateEventRequest,
                ai.sensorycloud.api.v1.audio.ValidateEventResponse>(
                  this, METHODID_VALIDATE_EVENT)))
          .addMethod(
            getCreateEnrolledEventMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest,
                ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>(
                  this, METHODID_CREATE_ENROLLED_EVENT)))
          .addMethod(
            getValidateEnrolledEventMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest,
                ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse>(
                  this, METHODID_VALIDATE_ENROLLED_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles all audio event processing
   * </pre>
   */
  public static final class AudioEventsStub extends io.grpc.stub.AbstractAsyncStub<AudioEventsStub> {
    private AudioEventsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioEventsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioEventsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates a phrase or sound with a stream of audio.
     * Streams a ValidateEventResponse as the audio is processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEventRequest> validateEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEventResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getValidateEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Enrolls a sound or voice. Streams a CreateEnrollmentResponse as the audio is processed.
     * CreateEnrollment supports all enrollable models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrolledEventRequest> createEnrolledEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateEnrolledEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Authenticates a sound or voice. Streams a ValidateEventResponse as the audio is processed.
     * ValidateEnrolledEvent supports all enrollable models
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest> validateEnrolledEvent(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getValidateEnrolledEventMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Handles all audio event processing
   * </pre>
   */
  public static final class AudioEventsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioEventsBlockingStub> {
    private AudioEventsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioEventsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioEventsBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Handles all audio event processing
   * </pre>
   */
  public static final class AudioEventsFutureStub extends io.grpc.stub.AbstractFutureStub<AudioEventsFutureStub> {
    private AudioEventsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioEventsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioEventsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_VALIDATE_EVENT = 0;
  private static final int METHODID_CREATE_ENROLLED_EVENT = 1;
  private static final int METHODID_VALIDATE_ENROLLED_EVENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioEventsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioEventsImplBase serviceImpl, int methodId) {
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
        case METHODID_VALIDATE_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.validateEvent(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEventResponse>) responseObserver);
        case METHODID_CREATE_ENROLLED_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createEnrolledEvent(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>) responseObserver);
        case METHODID_VALIDATE_ENROLLED_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.validateEnrolledEvent(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.ValidateEnrolledEventResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudioEventsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getValidateEventMethod())
              .addMethod(getCreateEnrolledEventMethod())
              .addMethod(getValidateEnrolledEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ai.sensorycloud.api.v1.audio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all audio transcriptions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/audio/audio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioTranscriptionsGrpc {

  private AudioTranscriptionsGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.audio.AudioTranscriptions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.TranscribeRequest,
      ai.sensorycloud.api.v1.audio.TranscribeResponse> getTranscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transcribe",
      requestType = ai.sensorycloud.api.v1.audio.TranscribeRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.TranscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.TranscribeRequest,
      ai.sensorycloud.api.v1.audio.TranscribeResponse> getTranscribeMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.TranscribeRequest, ai.sensorycloud.api.v1.audio.TranscribeResponse> getTranscribeMethod;
    if ((getTranscribeMethod = AudioTranscriptionsGrpc.getTranscribeMethod) == null) {
      synchronized (AudioTranscriptionsGrpc.class) {
        if ((getTranscribeMethod = AudioTranscriptionsGrpc.getTranscribeMethod) == null) {
          AudioTranscriptionsGrpc.getTranscribeMethod = getTranscribeMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.TranscribeRequest, ai.sensorycloud.api.v1.audio.TranscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transcribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.TranscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.TranscribeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTranscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioTranscriptionsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsStub>() {
        @java.lang.Override
        public AudioTranscriptionsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioTranscriptionsStub(channel, callOptions);
        }
      };
    return AudioTranscriptionsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioTranscriptionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsBlockingStub>() {
        @java.lang.Override
        public AudioTranscriptionsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioTranscriptionsBlockingStub(channel, callOptions);
        }
      };
    return AudioTranscriptionsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioTranscriptionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioTranscriptionsFutureStub>() {
        @java.lang.Override
        public AudioTranscriptionsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioTranscriptionsFutureStub(channel, callOptions);
        }
      };
    return AudioTranscriptionsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all audio transcriptions
   * </pre>
   */
  public static abstract class AudioTranscriptionsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transcribes voice into text.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.TranscribeRequest> transcribe(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.TranscribeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTranscribeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTranscribeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.TranscribeRequest,
                ai.sensorycloud.api.v1.audio.TranscribeResponse>(
                  this, METHODID_TRANSCRIBE)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles all audio transcriptions
   * </pre>
   */
  public static final class AudioTranscriptionsStub extends io.grpc.stub.AbstractAsyncStub<AudioTranscriptionsStub> {
    private AudioTranscriptionsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioTranscriptionsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioTranscriptionsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transcribes voice into text.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.TranscribeRequest> transcribe(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.TranscribeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTranscribeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Handles all audio transcriptions
   * </pre>
   */
  public static final class AudioTranscriptionsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioTranscriptionsBlockingStub> {
    private AudioTranscriptionsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioTranscriptionsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioTranscriptionsBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Handles all audio transcriptions
   * </pre>
   */
  public static final class AudioTranscriptionsFutureStub extends io.grpc.stub.AbstractFutureStub<AudioTranscriptionsFutureStub> {
    private AudioTranscriptionsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioTranscriptionsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioTranscriptionsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TRANSCRIBE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioTranscriptionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioTranscriptionsImplBase serviceImpl, int methodId) {
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
        case METHODID_TRANSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.transcribe(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.TranscribeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AudioTranscriptionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getTranscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

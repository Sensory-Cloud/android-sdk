package ai.sensorycloud.api.v1.audio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles synthesizing audio from text
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/audio/audio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AudioSynthesisGrpc {

  private AudioSynthesisGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.audio.AudioSynthesis";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest,
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> getSynthesizeSpeechMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SynthesizeSpeech",
      requestType = ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.class,
      responseType = ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest,
      ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> getSynthesizeSpeechMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest, ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> getSynthesizeSpeechMethod;
    if ((getSynthesizeSpeechMethod = AudioSynthesisGrpc.getSynthesizeSpeechMethod) == null) {
      synchronized (AudioSynthesisGrpc.class) {
        if ((getSynthesizeSpeechMethod = AudioSynthesisGrpc.getSynthesizeSpeechMethod) == null) {
          AudioSynthesisGrpc.getSynthesizeSpeechMethod = getSynthesizeSpeechMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest, ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SynthesizeSpeech"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSynthesizeSpeechMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioSynthesisStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisStub>() {
        @java.lang.Override
        public AudioSynthesisStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioSynthesisStub(channel, callOptions);
        }
      };
    return AudioSynthesisStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioSynthesisBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisBlockingStub>() {
        @java.lang.Override
        public AudioSynthesisBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioSynthesisBlockingStub(channel, callOptions);
        }
      };
    return AudioSynthesisBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioSynthesisFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AudioSynthesisFutureStub>() {
        @java.lang.Override
        public AudioSynthesisFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AudioSynthesisFutureStub(channel, callOptions);
        }
      };
    return AudioSynthesisFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles synthesizing audio from text
   * </pre>
   */
  public static abstract class AudioSynthesisImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Synthesizes speech from text
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKNE&gt;"}
     * </pre>
     */
    public void synthesizeSpeech(ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSynthesizeSpeechMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSynthesizeSpeechMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest,
                ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse>(
                  this, METHODID_SYNTHESIZE_SPEECH)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles synthesizing audio from text
   * </pre>
   */
  public static final class AudioSynthesisStub extends io.grpc.stub.AbstractAsyncStub<AudioSynthesisStub> {
    private AudioSynthesisStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSynthesisStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioSynthesisStub(channel, callOptions);
    }

    /**
     * <pre>
     * Synthesizes speech from text
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKNE&gt;"}
     * </pre>
     */
    public void synthesizeSpeech(ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSynthesizeSpeechMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Handles synthesizing audio from text
   * </pre>
   */
  public static final class AudioSynthesisBlockingStub extends io.grpc.stub.AbstractBlockingStub<AudioSynthesisBlockingStub> {
    private AudioSynthesisBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSynthesisBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioSynthesisBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Synthesizes speech from text
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKNE&gt;"}
     * </pre>
     */
    public java.util.Iterator<ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse> synthesizeSpeech(
        ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSynthesizeSpeechMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Handles synthesizing audio from text
   * </pre>
   */
  public static final class AudioSynthesisFutureStub extends io.grpc.stub.AbstractFutureStub<AudioSynthesisFutureStub> {
    private AudioSynthesisFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSynthesisFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AudioSynthesisFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SYNTHESIZE_SPEECH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioSynthesisImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioSynthesisImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNTHESIZE_SPEECH:
          serviceImpl.synthesizeSpeech((ai.sensorycloud.api.v1.audio.SynthesizeSpeechRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.audio.SynthesizeSpeechResponse>) responseObserver);
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
      synchronized (AudioSynthesisGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSynthesizeSpeechMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ai.sensorycloud.api.health;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for Health function
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: health/health.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HealthServiceGrpc {

  private HealthServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.health.HealthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.health.HealthRequest,
      ai.sensorycloud.api.common.ServerHealthResponse> getGetHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHealth",
      requestType = ai.sensorycloud.api.health.HealthRequest.class,
      responseType = ai.sensorycloud.api.common.ServerHealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.health.HealthRequest,
      ai.sensorycloud.api.common.ServerHealthResponse> getGetHealthMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.health.HealthRequest, ai.sensorycloud.api.common.ServerHealthResponse> getGetHealthMethod;
    if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
      synchronized (HealthServiceGrpc.class) {
        if ((getGetHealthMethod = HealthServiceGrpc.getGetHealthMethod) == null) {
          HealthServiceGrpc.getGetHealthMethod = getGetHealthMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.health.HealthRequest, ai.sensorycloud.api.common.ServerHealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.health.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.common.ServerHealthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceStub>() {
        @java.lang.Override
        public HealthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceStub(channel, callOptions);
        }
      };
    return HealthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceBlockingStub>() {
        @java.lang.Override
        public HealthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceBlockingStub(channel, callOptions);
        }
      };
    return HealthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthServiceFutureStub>() {
        @java.lang.Override
        public HealthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthServiceFutureStub(channel, callOptions);
        }
      };
    return HealthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for Health function
   * </pre>
   */
  public static abstract class HealthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtain an Health and Server status information
     * </pre>
     */
    public void getHealth(ai.sensorycloud.api.health.HealthRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.ServerHealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHealthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHealthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.health.HealthRequest,
                ai.sensorycloud.api.common.ServerHealthResponse>(
                  this, METHODID_GET_HEALTH)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for Health function
   * </pre>
   */
  public static final class HealthServiceStub extends io.grpc.stub.AbstractAsyncStub<HealthServiceStub> {
    private HealthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an Health and Server status information
     * </pre>
     */
    public void getHealth(ai.sensorycloud.api.health.HealthRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.ServerHealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for Health function
   * </pre>
   */
  public static final class HealthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HealthServiceBlockingStub> {
    private HealthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an Health and Server status information
     * </pre>
     */
    public ai.sensorycloud.api.common.ServerHealthResponse getHealth(ai.sensorycloud.api.health.HealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for Health function
   * </pre>
   */
  public static final class HealthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HealthServiceFutureStub> {
    private HealthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an Health and Server status information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.common.ServerHealthResponse> getHealth(
        ai.sensorycloud.api.health.HealthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEALTH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEALTH:
          serviceImpl.getHealth((ai.sensorycloud.api.health.HealthRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.ServerHealthResponse>) responseObserver);
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
      synchronized (HealthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}

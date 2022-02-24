package ai.sensorycloud.api.v1.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to publish events to the cloud
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/event/event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.event.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest,
      ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> getPublishUsageEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishUsageEvents",
      requestType = ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.class,
      responseType = ai.sensorycloud.api.v1.event.PublishUsageEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest,
      ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> getPublishUsageEventsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest, ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> getPublishUsageEventsMethod;
    if ((getPublishUsageEventsMethod = EventServiceGrpc.getPublishUsageEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getPublishUsageEventsMethod = EventServiceGrpc.getPublishUsageEventsMethod) == null) {
          EventServiceGrpc.getPublishUsageEventsMethod = getPublishUsageEventsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest, ai.sensorycloud.api.v1.event.PublishUsageEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishUsageEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.event.PublishUsageEventsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishUsageEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to publish events to the cloud
   * </pre>
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Publishes a list of usage event to the cloud
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void publishUsageEvents(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishUsageEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishUsageEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.event.PublishUsageEventsRequest,
                ai.sensorycloud.api.v1.event.PublishUsageEventsResponse>(
                  this, METHODID_PUBLISH_USAGE_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to publish events to the cloud
   * </pre>
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes a list of usage event to the cloud
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void publishUsageEvents(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishUsageEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to publish events to the cloud
   * </pre>
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes a list of usage event to the cloud
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.event.PublishUsageEventsResponse publishUsageEvents(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishUsageEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to publish events to the cloud
   * </pre>
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publishes a list of usage event to the cloud
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.event.PublishUsageEventsResponse> publishUsageEvents(
        ai.sensorycloud.api.v1.event.PublishUsageEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishUsageEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH_USAGE_EVENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH_USAGE_EVENTS:
          serviceImpl.publishUsageEvents((ai.sensorycloud.api.v1.event.PublishUsageEventsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.event.PublishUsageEventsResponse>) responseObserver);
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPublishUsageEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
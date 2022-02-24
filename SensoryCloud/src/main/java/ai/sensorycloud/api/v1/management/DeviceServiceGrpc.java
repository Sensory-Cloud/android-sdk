package ai.sensorycloud.api.v1.management;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Devices in the database
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/management/device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.management.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.EnrollDeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getEnrollDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnrollDevice",
      requestType = ai.sensorycloud.api.v1.management.EnrollDeviceRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.EnrollDeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getEnrollDeviceMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.EnrollDeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse> getEnrollDeviceMethod;
    if ((getEnrollDeviceMethod = DeviceServiceGrpc.getEnrollDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getEnrollDeviceMethod = DeviceServiceGrpc.getEnrollDeviceMethod) == null) {
          DeviceServiceGrpc.getEnrollDeviceMethod = getEnrollDeviceMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.EnrollDeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnrollDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEnrollDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getRenewDeviceCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewDeviceCredential",
      requestType = ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getRenewDeviceCredentialMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest, ai.sensorycloud.api.v1.management.DeviceResponse> getRenewDeviceCredentialMethod;
    if ((getRenewDeviceCredentialMethod = DeviceServiceGrpc.getRenewDeviceCredentialMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getRenewDeviceCredentialMethod = DeviceServiceGrpc.getRenewDeviceCredentialMethod) == null) {
          DeviceServiceGrpc.getRenewDeviceCredentialMethod = getRenewDeviceCredentialMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest, ai.sensorycloud.api.v1.management.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewDeviceCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenewDeviceCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getGetWhoAmIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWhoAmI",
      requestType = ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getGetWhoAmIMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest, ai.sensorycloud.api.v1.management.DeviceResponse> getGetWhoAmIMethod;
    if ((getGetWhoAmIMethod = DeviceServiceGrpc.getGetWhoAmIMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetWhoAmIMethod = DeviceServiceGrpc.getGetWhoAmIMethod) == null) {
          DeviceServiceGrpc.getGetWhoAmIMethod = getGetWhoAmIMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest, ai.sensorycloud.api.v1.management.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWhoAmI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWhoAmIMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub>() {
        @java.lang.Override
        public DeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceStub(channel, callOptions);
        }
      };
    return DeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub>() {
        @java.lang.Override
        public DeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return DeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub>() {
        @java.lang.Override
        public DeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceFutureStub(channel, callOptions);
        }
      };
    return DeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new device in the database
     * </pre>
     */
    public void enrollDevice(ai.sensorycloud.api.v1.management.EnrollDeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrollDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Renew a device's credential, which links the device to a key in the database.
     * This endpoint can be used to assign a new credential to a device if the old credential has expired.
     * </pre>
     */
    public void renewDeviceCredential(ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewDeviceCredentialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a device to fetch information about itself
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getWhoAmI(ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWhoAmIMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnrollDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.EnrollDeviceRequest,
                ai.sensorycloud.api.v1.management.DeviceResponse>(
                  this, METHODID_ENROLL_DEVICE)))
          .addMethod(
            getRenewDeviceCredentialMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest,
                ai.sensorycloud.api.v1.management.DeviceResponse>(
                  this, METHODID_RENEW_DEVICE_CREDENTIAL)))
          .addMethod(
            getGetWhoAmIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest,
                ai.sensorycloud.api.v1.management.DeviceResponse>(
                  this, METHODID_GET_WHO_AM_I)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
    private DeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new device in the database
     * </pre>
     */
    public void enrollDevice(ai.sensorycloud.api.v1.management.EnrollDeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnrollDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Renew a device's credential, which links the device to a key in the database.
     * This endpoint can be used to assign a new credential to a device if the old credential has expired.
     * </pre>
     */
    public void renewDeviceCredential(ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewDeviceCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows a device to fetch information about itself
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getWhoAmI(ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWhoAmIMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new device in the database
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse enrollDevice(ai.sensorycloud.api.v1.management.EnrollDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnrollDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Renew a device's credential, which links the device to a key in the database.
     * This endpoint can be used to assign a new credential to a device if the old credential has expired.
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse renewDeviceCredential(ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewDeviceCredentialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows a device to fetch information about itself
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse getWhoAmI(ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWhoAmIMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new device in the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceResponse> enrollDevice(
        ai.sensorycloud.api.v1.management.EnrollDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnrollDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Renew a device's credential, which links the device to a key in the database.
     * This endpoint can be used to assign a new credential to a device if the old credential has expired.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceResponse> renewDeviceCredential(
        ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewDeviceCredentialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows a device to fetch information about itself
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceResponse> getWhoAmI(
        ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWhoAmIMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENROLL_DEVICE = 0;
  private static final int METHODID_RENEW_DEVICE_CREDENTIAL = 1;
  private static final int METHODID_GET_WHO_AM_I = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENROLL_DEVICE:
          serviceImpl.enrollDevice((ai.sensorycloud.api.v1.management.EnrollDeviceRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse>) responseObserver);
          break;
        case METHODID_RENEW_DEVICE_CREDENTIAL:
          serviceImpl.renewDeviceCredential((ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse>) responseObserver);
          break;
        case METHODID_GET_WHO_AM_I:
          serviceImpl.getWhoAmI((ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse>) responseObserver);
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getEnrollDeviceMethod())
              .addMethod(getRenewDeviceCredentialMethod())
              .addMethod(getGetWhoAmIMethod())
              .build();
        }
      }
    }
    return result;
  }
}

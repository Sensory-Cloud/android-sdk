package ai.sensorycloud.api.v1.management;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Devices in the database
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: v1/management/device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sensory.api.v1.management.DeviceService";

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

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest,
      ai.sensorycloud.api.v1.management.GetDeviceResponse> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = ai.sensorycloud.api.v1.management.DeviceRequest.class,
      responseType = ai.sensorycloud.api.v1.management.GetDeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest,
      ai.sensorycloud.api.v1.management.GetDeviceResponse> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest, ai.sensorycloud.api.v1.management.GetDeviceResponse> getGetDeviceMethod;
    if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
          DeviceServiceGrpc.getGetDeviceMethod = getGetDeviceMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeviceRequest, ai.sensorycloud.api.v1.management.GetDeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetDeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetDevicesRequest,
      ai.sensorycloud.api.v1.management.DeviceListResponse> getGetDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevices",
      requestType = ai.sensorycloud.api.v1.management.GetDevicesRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetDevicesRequest,
      ai.sensorycloud.api.v1.management.DeviceListResponse> getGetDevicesMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetDevicesRequest, ai.sensorycloud.api.v1.management.DeviceListResponse> getGetDevicesMethod;
    if ((getGetDevicesMethod = DeviceServiceGrpc.getGetDevicesMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDevicesMethod = DeviceServiceGrpc.getGetDevicesMethod) == null) {
          DeviceServiceGrpc.getGetDevicesMethod = getGetDevicesMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.GetDevicesRequest, ai.sensorycloud.api.v1.management.DeviceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceListResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateDeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getUpdateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDevice",
      requestType = ai.sensorycloud.api.v1.management.UpdateDeviceRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateDeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getUpdateDeviceMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateDeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse> getUpdateDeviceMethod;
    if ((getUpdateDeviceMethod = DeviceServiceGrpc.getUpdateDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getUpdateDeviceMethod = DeviceServiceGrpc.getUpdateDeviceMethod) == null) {
          DeviceServiceGrpc.getUpdateDeviceMethod = getUpdateDeviceMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.UpdateDeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.UpdateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDevice",
      requestType = ai.sensorycloud.api.v1.management.DeviceRequest.class,
      responseType = ai.sensorycloud.api.v1.management.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest,
      ai.sensorycloud.api.v1.management.DeviceResponse> getDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = DeviceServiceGrpc.getDeleteDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getDeleteDeviceMethod = DeviceServiceGrpc.getDeleteDeviceMethod) == null) {
          DeviceServiceGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeviceRequest, ai.sensorycloud.api.v1.management.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeviceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteDeviceMethod;
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
  public interface AsyncService {

    /**
     * <pre>
     * Create a new device in the database
     * </pre>
     */
    default void enrollDevice(ai.sensorycloud.api.v1.management.EnrollDeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrollDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Renew a device's credential, which links the device to a key in the database.
     * This endpoint can be used to assign a new credential to a device if the old credential has expired.
     * </pre>
     */
    default void renewDeviceCredential(ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewDeviceCredentialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a device to fetch information about itself
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void getWhoAmI(ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWhoAmIMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns device information
     * </pre>
     */
    default void getDevice(ai.sensorycloud.api.v1.management.DeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetDeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of devices associated with the given userId
     * </pre>
     */
    default void getDevices(ai.sensorycloud.api.v1.management.GetDevicesRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows the name of a device to be updated
     * </pre>
     */
    default void updateDevice(ai.sensorycloud.api.v1.management.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a device to be deleted
     * </pre>
     */
    default void deleteDevice(ai.sensorycloud.api.v1.management.DeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDeviceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeviceService.
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static abstract class DeviceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeviceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeviceService.
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
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

    /**
     * <pre>
     * Returns device information
     * </pre>
     */
    public void getDevice(ai.sensorycloud.api.v1.management.DeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetDeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of devices associated with the given userId
     * </pre>
     */
    public void getDevices(ai.sensorycloud.api.v1.management.GetDevicesRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows the name of a device to be updated
     * </pre>
     */
    public void updateDevice(ai.sensorycloud.api.v1.management.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows a device to be deleted
     * </pre>
     */
    public void deleteDevice(ai.sensorycloud.api.v1.management.DeviceRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeviceService.
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
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

    /**
     * <pre>
     * Returns device information
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.GetDeviceResponse getDevice(ai.sensorycloud.api.v1.management.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of devices associated with the given userId
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceListResponse getDevices(ai.sensorycloud.api.v1.management.GetDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows the name of a device to be updated
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse updateDevice(ai.sensorycloud.api.v1.management.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows a device to be deleted
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.DeviceResponse deleteDevice(ai.sensorycloud.api.v1.management.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeviceService.
   * <pre>
   * Service to manage Devices in the database
   * </pre>
   */
  public static final class DeviceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
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

    /**
     * <pre>
     * Returns device information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.GetDeviceResponse> getDevice(
        ai.sensorycloud.api.v1.management.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of devices associated with the given userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceListResponse> getDevices(
        ai.sensorycloud.api.v1.management.GetDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows the name of a device to be updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceResponse> updateDevice(
        ai.sensorycloud.api.v1.management.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows a device to be deleted
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.DeviceResponse> deleteDevice(
        ai.sensorycloud.api.v1.management.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENROLL_DEVICE = 0;
  private static final int METHODID_RENEW_DEVICE_CREDENTIAL = 1;
  private static final int METHODID_GET_WHO_AM_I = 2;
  private static final int METHODID_GET_DEVICE = 3;
  private static final int METHODID_GET_DEVICES = 4;
  private static final int METHODID_UPDATE_DEVICE = 5;
  private static final int METHODID_DELETE_DEVICE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((ai.sensorycloud.api.v1.management.DeviceRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetDeviceResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((ai.sensorycloud.api.v1.management.GetDevicesRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE:
          serviceImpl.updateDevice((ai.sensorycloud.api.v1.management.UpdateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.DeviceResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((ai.sensorycloud.api.v1.management.DeviceRequest) request,
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getEnrollDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.EnrollDeviceRequest,
              ai.sensorycloud.api.v1.management.DeviceResponse>(
                service, METHODID_ENROLL_DEVICE)))
        .addMethod(
          getRenewDeviceCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.RenewDeviceCredentialRequest,
              ai.sensorycloud.api.v1.management.DeviceResponse>(
                service, METHODID_RENEW_DEVICE_CREDENTIAL)))
        .addMethod(
          getGetWhoAmIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.DeviceGetWhoAmIRequest,
              ai.sensorycloud.api.v1.management.DeviceResponse>(
                service, METHODID_GET_WHO_AM_I)))
        .addMethod(
          getGetDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.DeviceRequest,
              ai.sensorycloud.api.v1.management.GetDeviceResponse>(
                service, METHODID_GET_DEVICE)))
        .addMethod(
          getGetDevicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.GetDevicesRequest,
              ai.sensorycloud.api.v1.management.DeviceListResponse>(
                service, METHODID_GET_DEVICES)))
        .addMethod(
          getUpdateDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.UpdateDeviceRequest,
              ai.sensorycloud.api.v1.management.DeviceResponse>(
                service, METHODID_UPDATE_DEVICE)))
        .addMethod(
          getDeleteDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.DeviceRequest,
              ai.sensorycloud.api.v1.management.DeviceResponse>(
                service, METHODID_DELETE_DEVICE)))
        .build();
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
              .addMethod(getGetDeviceMethod())
              .addMethod(getGetDevicesMethod())
              .addMethod(getUpdateDeviceMethod())
              .addMethod(getDeleteDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}

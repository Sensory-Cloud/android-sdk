package ai.sensorycloud.api.v1.management;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Enrollments in the database
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/management/enrollment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnrollmentServiceGrpc {

  private EnrollmentServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.management.EnrollmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnrollments",
      requestType = ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.class,
      responseType = ai.sensorycloud.api.v1.management.GetEnrollmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod;
    if ((getGetEnrollmentsMethod = EnrollmentServiceGrpc.getGetEnrollmentsMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getGetEnrollmentsMethod = EnrollmentServiceGrpc.getGetEnrollmentsMethod) == null) {
          EnrollmentServiceGrpc.getGetEnrollmentsMethod = getGetEnrollmentsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnrollments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetEnrollmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnrollmentGroups",
      requestType = ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.class,
      responseType = ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod;
    if ((getGetEnrollmentGroupsMethod = EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getGetEnrollmentGroupsMethod = EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod) == null) {
          EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod = getGetEnrollmentGroupsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnrollmentGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetEnrollmentGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod;
    if ((getCreateEnrollmentGroupMethod = EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getCreateEnrollmentGroupMethod = EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod = getCreateEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod;
    if ((getAppendEnrollmentGroupMethod = EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getAppendEnrollmentGroupMethod = EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod = getAppendEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAppendEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnrollment",
      requestType = ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod;
    if ((getDeleteEnrollmentMethod = EnrollmentServiceGrpc.getDeleteEnrollmentMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getDeleteEnrollmentMethod = EnrollmentServiceGrpc.getDeleteEnrollmentMethod) == null) {
          EnrollmentServiceGrpc.getDeleteEnrollmentMethod = getDeleteEnrollmentMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnrollment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteEnrollmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod;
    if ((getDeleteEnrollmentGroupMethod = EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getDeleteEnrollmentGroupMethod = EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod = getDeleteEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteEnrollmentGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnrollmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceStub>() {
        @java.lang.Override
        public EnrollmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceStub(channel, callOptions);
        }
      };
    return EnrollmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnrollmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceBlockingStub>() {
        @java.lang.Override
        public EnrollmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceBlockingStub(channel, callOptions);
        }
      };
    return EnrollmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnrollmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceFutureStub>() {
        @java.lang.Override
        public EnrollmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceFutureStub(channel, callOptions);
        }
      };
    return EnrollmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static abstract class EnrollmentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnrollmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnrollmentGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public void deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnrollmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnrollmentGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEnrollmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
                ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>(
                  this, METHODID_GET_ENROLLMENTS)))
          .addMethod(
            getGetEnrollmentGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
                ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>(
                  this, METHODID_GET_ENROLLMENT_GROUPS)))
          .addMethod(
            getCreateEnrollmentGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
                ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                  this, METHODID_CREATE_ENROLLMENT_GROUP)))
          .addMethod(
            getAppendEnrollmentGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
                ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                  this, METHODID_APPEND_ENROLLMENT_GROUP)))
          .addMethod(
            getDeleteEnrollmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
                ai.sensorycloud.api.v1.management.EnrollmentResponse>(
                  this, METHODID_DELETE_ENROLLMENT)))
          .addMethod(
            getDeleteEnrollmentGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
                ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                  this, METHODID_DELETE_ENROLLMENT_GROUP)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceStub extends io.grpc.stub.AbstractAsyncStub<EnrollmentServiceStub> {
    private EnrollmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnrollmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnrollmentGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public void deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnrollmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnrollmentServiceBlockingStub> {
    private EnrollmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.GetEnrollmentsResponse getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnrollmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnrollmentGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentResponse deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnrollmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnrollmentGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnrollmentServiceFutureStub> {
    private EnrollmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getEnrollments(
        ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnrollmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getEnrollmentGroups(
        ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnrollmentGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> createEnrollmentGroup(
        ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> appendEnrollmentGroup(
        ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentResponse> deleteEnrollment(
        ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnrollmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> deleteEnrollmentGroup(
        ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnrollmentGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENROLLMENTS = 0;
  private static final int METHODID_GET_ENROLLMENT_GROUPS = 1;
  private static final int METHODID_CREATE_ENROLLMENT_GROUP = 2;
  private static final int METHODID_APPEND_ENROLLMENT_GROUP = 3;
  private static final int METHODID_DELETE_ENROLLMENT = 4;
  private static final int METHODID_DELETE_ENROLLMENT_GROUP = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnrollmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnrollmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ENROLLMENTS:
          serviceImpl.getEnrollments((ai.sensorycloud.api.v1.management.GetEnrollmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>) responseObserver);
          break;
        case METHODID_GET_ENROLLMENT_GROUPS:
          serviceImpl.getEnrollmentGroups((ai.sensorycloud.api.v1.management.GetEnrollmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENROLLMENT_GROUP:
          serviceImpl.createEnrollmentGroup((ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_APPEND_ENROLLMENT_GROUP:
          serviceImpl.appendEnrollmentGroup((ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENROLLMENT:
          serviceImpl.deleteEnrollment((ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENROLLMENT_GROUP:
          serviceImpl.deleteEnrollmentGroup((ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
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
      synchronized (EnrollmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetEnrollmentsMethod())
              .addMethod(getGetEnrollmentGroupsMethod())
              .addMethod(getCreateEnrollmentGroupMethod())
              .addMethod(getAppendEnrollmentGroupMethod())
              .addMethod(getDeleteEnrollmentMethod())
              .addMethod(getDeleteEnrollmentGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}

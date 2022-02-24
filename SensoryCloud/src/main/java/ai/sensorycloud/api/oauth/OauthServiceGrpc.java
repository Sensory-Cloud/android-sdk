package ai.sensorycloud.api.oauth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for OAuth function
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: oauth/oauth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OauthServiceGrpc {

  private OauthServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.oauth.OauthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.TokenRequest,
      ai.sensorycloud.api.common.TokenResponse> getGetTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetToken",
      requestType = ai.sensorycloud.api.oauth.TokenRequest.class,
      responseType = ai.sensorycloud.api.common.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.TokenRequest,
      ai.sensorycloud.api.common.TokenResponse> getGetTokenMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.TokenRequest, ai.sensorycloud.api.common.TokenResponse> getGetTokenMethod;
    if ((getGetTokenMethod = OauthServiceGrpc.getGetTokenMethod) == null) {
      synchronized (OauthServiceGrpc.class) {
        if ((getGetTokenMethod = OauthServiceGrpc.getGetTokenMethod) == null) {
          OauthServiceGrpc.getGetTokenMethod = getGetTokenMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.oauth.TokenRequest, ai.sensorycloud.api.common.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.common.TokenResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.SignTokenRequest,
      ai.sensorycloud.api.common.TokenResponse> getSignTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignToken",
      requestType = ai.sensorycloud.api.oauth.SignTokenRequest.class,
      responseType = ai.sensorycloud.api.common.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.SignTokenRequest,
      ai.sensorycloud.api.common.TokenResponse> getSignTokenMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.SignTokenRequest, ai.sensorycloud.api.common.TokenResponse> getSignTokenMethod;
    if ((getSignTokenMethod = OauthServiceGrpc.getSignTokenMethod) == null) {
      synchronized (OauthServiceGrpc.class) {
        if ((getSignTokenMethod = OauthServiceGrpc.getSignTokenMethod) == null) {
          OauthServiceGrpc.getSignTokenMethod = getSignTokenMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.oauth.SignTokenRequest, ai.sensorycloud.api.common.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.SignTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.common.TokenResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSignTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.WhoAmIRequest,
      ai.sensorycloud.api.oauth.WhoAmIResponse> getGetWhoAmIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWhoAmI",
      requestType = ai.sensorycloud.api.oauth.WhoAmIRequest.class,
      responseType = ai.sensorycloud.api.oauth.WhoAmIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.WhoAmIRequest,
      ai.sensorycloud.api.oauth.WhoAmIResponse> getGetWhoAmIMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.WhoAmIRequest, ai.sensorycloud.api.oauth.WhoAmIResponse> getGetWhoAmIMethod;
    if ((getGetWhoAmIMethod = OauthServiceGrpc.getGetWhoAmIMethod) == null) {
      synchronized (OauthServiceGrpc.class) {
        if ((getGetWhoAmIMethod = OauthServiceGrpc.getGetWhoAmIMethod) == null) {
          OauthServiceGrpc.getGetWhoAmIMethod = getGetWhoAmIMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.oauth.WhoAmIRequest, ai.sensorycloud.api.oauth.WhoAmIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWhoAmI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.WhoAmIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.WhoAmIResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWhoAmIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.PublicKeyRequest,
      ai.sensorycloud.api.oauth.PublicKeyResponse> getGetPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicKey",
      requestType = ai.sensorycloud.api.oauth.PublicKeyRequest.class,
      responseType = ai.sensorycloud.api.oauth.PublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.PublicKeyRequest,
      ai.sensorycloud.api.oauth.PublicKeyResponse> getGetPublicKeyMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.oauth.PublicKeyRequest, ai.sensorycloud.api.oauth.PublicKeyResponse> getGetPublicKeyMethod;
    if ((getGetPublicKeyMethod = OauthServiceGrpc.getGetPublicKeyMethod) == null) {
      synchronized (OauthServiceGrpc.class) {
        if ((getGetPublicKeyMethod = OauthServiceGrpc.getGetPublicKeyMethod) == null) {
          OauthServiceGrpc.getGetPublicKeyMethod = getGetPublicKeyMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.oauth.PublicKeyRequest, ai.sensorycloud.api.oauth.PublicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.PublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.oauth.PublicKeyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPublicKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OauthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceStub>() {
        @java.lang.Override
        public OauthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceStub(channel, callOptions);
        }
      };
    return OauthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OauthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceBlockingStub>() {
        @java.lang.Override
        public OauthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceBlockingStub(channel, callOptions);
        }
      };
    return OauthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OauthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceFutureStub>() {
        @java.lang.Override
        public OauthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceFutureStub(channel, callOptions);
        }
      };
    return OauthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for OAuth function
   * </pre>
   */
  public static abstract class OauthServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtain an OAuth token for the given credentials
     * Endpoint does not require an authorization token
     * </pre>
     */
    public void getToken(ai.sensorycloud.api.oauth.TokenRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sign and return an OAuth token. The passed authorization token must have the SignToken authority.
     * Therefore, Devices are not allowed to make this request.
     * Sign does not validate credentials, and therefore should be used in specific circumstances where credentials are not required.
     * One common usecase for the Sign request is an Io server issuing a user-scoped token after a successful authentication.
     * Only a limited subset of of scopes may be requested from the SignToken request.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void signToken(ai.sensorycloud.api.oauth.SignTokenRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Obtain information about oneself based on the passed OAuth token
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getWhoAmI(ai.sensorycloud.api.oauth.WhoAmIRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.WhoAmIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWhoAmIMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a public key by ID. Public keys retrieved by this endpoint can be used
     * to validate tokens signed by the Sensory cloud.
     * </pre>
     */
    public void getPublicKey(ai.sensorycloud.api.oauth.PublicKeyRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.PublicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublicKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.oauth.TokenRequest,
                ai.sensorycloud.api.common.TokenResponse>(
                  this, METHODID_GET_TOKEN)))
          .addMethod(
            getSignTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.oauth.SignTokenRequest,
                ai.sensorycloud.api.common.TokenResponse>(
                  this, METHODID_SIGN_TOKEN)))
          .addMethod(
            getGetWhoAmIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.oauth.WhoAmIRequest,
                ai.sensorycloud.api.oauth.WhoAmIResponse>(
                  this, METHODID_GET_WHO_AM_I)))
          .addMethod(
            getGetPublicKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.oauth.PublicKeyRequest,
                ai.sensorycloud.api.oauth.PublicKeyResponse>(
                  this, METHODID_GET_PUBLIC_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for OAuth function
   * </pre>
   */
  public static final class OauthServiceStub extends io.grpc.stub.AbstractAsyncStub<OauthServiceStub> {
    private OauthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an OAuth token for the given credentials
     * Endpoint does not require an authorization token
     * </pre>
     */
    public void getToken(ai.sensorycloud.api.oauth.TokenRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sign and return an OAuth token. The passed authorization token must have the SignToken authority.
     * Therefore, Devices are not allowed to make this request.
     * Sign does not validate credentials, and therefore should be used in specific circumstances where credentials are not required.
     * One common usecase for the Sign request is an Io server issuing a user-scoped token after a successful authentication.
     * Only a limited subset of of scopes may be requested from the SignToken request.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void signToken(ai.sensorycloud.api.oauth.SignTokenRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtain information about oneself based on the passed OAuth token
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getWhoAmI(ai.sensorycloud.api.oauth.WhoAmIRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.WhoAmIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWhoAmIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a public key by ID. Public keys retrieved by this endpoint can be used
     * to validate tokens signed by the Sensory cloud.
     * </pre>
     */
    public void getPublicKey(ai.sensorycloud.api.oauth.PublicKeyRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.PublicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for OAuth function
   * </pre>
   */
  public static final class OauthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OauthServiceBlockingStub> {
    private OauthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an OAuth token for the given credentials
     * Endpoint does not require an authorization token
     * </pre>
     */
    public ai.sensorycloud.api.common.TokenResponse getToken(ai.sensorycloud.api.oauth.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sign and return an OAuth token. The passed authorization token must have the SignToken authority.
     * Therefore, Devices are not allowed to make this request.
     * Sign does not validate credentials, and therefore should be used in specific circumstances where credentials are not required.
     * One common usecase for the Sign request is an Io server issuing a user-scoped token after a successful authentication.
     * Only a limited subset of of scopes may be requested from the SignToken request.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.common.TokenResponse signToken(ai.sensorycloud.api.oauth.SignTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtain information about oneself based on the passed OAuth token
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.oauth.WhoAmIResponse getWhoAmI(ai.sensorycloud.api.oauth.WhoAmIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWhoAmIMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a public key by ID. Public keys retrieved by this endpoint can be used
     * to validate tokens signed by the Sensory cloud.
     * </pre>
     */
    public ai.sensorycloud.api.oauth.PublicKeyResponse getPublicKey(ai.sensorycloud.api.oauth.PublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublicKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for OAuth function
   * </pre>
   */
  public static final class OauthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OauthServiceFutureStub> {
    private OauthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain an OAuth token for the given credentials
     * Endpoint does not require an authorization token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.common.TokenResponse> getToken(
        ai.sensorycloud.api.oauth.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sign and return an OAuth token. The passed authorization token must have the SignToken authority.
     * Therefore, Devices are not allowed to make this request.
     * Sign does not validate credentials, and therefore should be used in specific circumstances where credentials are not required.
     * One common usecase for the Sign request is an Io server issuing a user-scoped token after a successful authentication.
     * Only a limited subset of of scopes may be requested from the SignToken request.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.common.TokenResponse> signToken(
        ai.sensorycloud.api.oauth.SignTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Obtain information about oneself based on the passed OAuth token
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.oauth.WhoAmIResponse> getWhoAmI(
        ai.sensorycloud.api.oauth.WhoAmIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWhoAmIMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a public key by ID. Public keys retrieved by this endpoint can be used
     * to validate tokens signed by the Sensory cloud.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.oauth.PublicKeyResponse> getPublicKey(
        ai.sensorycloud.api.oauth.PublicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN = 0;
  private static final int METHODID_SIGN_TOKEN = 1;
  private static final int METHODID_GET_WHO_AM_I = 2;
  private static final int METHODID_GET_PUBLIC_KEY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OauthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OauthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOKEN:
          serviceImpl.getToken((ai.sensorycloud.api.oauth.TokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse>) responseObserver);
          break;
        case METHODID_SIGN_TOKEN:
          serviceImpl.signToken((ai.sensorycloud.api.oauth.SignTokenRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.common.TokenResponse>) responseObserver);
          break;
        case METHODID_GET_WHO_AM_I:
          serviceImpl.getWhoAmI((ai.sensorycloud.api.oauth.WhoAmIRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.WhoAmIResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLIC_KEY:
          serviceImpl.getPublicKey((ai.sensorycloud.api.oauth.PublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.oauth.PublicKeyResponse>) responseObserver);
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
      synchronized (OauthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetTokenMethod())
              .addMethod(getSignTokenMethod())
              .addMethod(getGetWhoAmIMethod())
              .addMethod(getGetPublicKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}

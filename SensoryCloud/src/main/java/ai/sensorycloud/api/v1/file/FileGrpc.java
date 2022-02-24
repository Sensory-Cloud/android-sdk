package ai.sensorycloud.api.v1.file;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all file-related functions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0-SNAPSHOT)",
    comments = "Source: v1/file/file.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileGrpc {

  private FileGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.file.File";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest,
      ai.sensorycloud.api.v1.file.FileInfo> getGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfo",
      requestType = ai.sensorycloud.api.v1.file.FileRequest.class,
      responseType = ai.sensorycloud.api.v1.file.FileInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest,
      ai.sensorycloud.api.v1.file.FileInfo> getGetInfoMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest, ai.sensorycloud.api.v1.file.FileInfo> getGetInfoMethod;
    if ((getGetInfoMethod = FileGrpc.getGetInfoMethod) == null) {
      synchronized (FileGrpc.class) {
        if ((getGetInfoMethod = FileGrpc.getGetInfoMethod) == null) {
          FileGrpc.getGetInfoMethod = getGetInfoMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.file.FileRequest, ai.sensorycloud.api.v1.file.FileInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileInfo.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCatalogRequest,
      ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCatalog",
      requestType = ai.sensorycloud.api.v1.file.FileCatalogRequest.class,
      responseType = ai.sensorycloud.api.v1.file.FileCatalogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCatalogRequest,
      ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCatalogMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCatalogRequest, ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCatalogMethod;
    if ((getGetCatalogMethod = FileGrpc.getGetCatalogMethod) == null) {
      synchronized (FileGrpc.class) {
        if ((getGetCatalogMethod = FileGrpc.getGetCatalogMethod) == null) {
          FileGrpc.getGetCatalogMethod = getGetCatalogMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.file.FileCatalogRequest, ai.sensorycloud.api.v1.file.FileCatalogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileCatalogResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest,
      ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCompleteCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompleteCatalog",
      requestType = ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest.class,
      responseType = ai.sensorycloud.api.v1.file.FileCatalogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest,
      ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCompleteCatalogMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest, ai.sensorycloud.api.v1.file.FileCatalogResponse> getGetCompleteCatalogMethod;
    if ((getGetCompleteCatalogMethod = FileGrpc.getGetCompleteCatalogMethod) == null) {
      synchronized (FileGrpc.class) {
        if ((getGetCompleteCatalogMethod = FileGrpc.getGetCompleteCatalogMethod) == null) {
          FileGrpc.getGetCompleteCatalogMethod = getGetCompleteCatalogMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest, ai.sensorycloud.api.v1.file.FileCatalogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompleteCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileCatalogResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCompleteCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest,
      ai.sensorycloud.api.v1.file.FileResponse> getDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Download",
      requestType = ai.sensorycloud.api.v1.file.FileRequest.class,
      responseType = ai.sensorycloud.api.v1.file.FileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest,
      ai.sensorycloud.api.v1.file.FileResponse> getDownloadMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.file.FileRequest, ai.sensorycloud.api.v1.file.FileResponse> getDownloadMethod;
    if ((getDownloadMethod = FileGrpc.getDownloadMethod) == null) {
      synchronized (FileGrpc.class) {
        if ((getDownloadMethod = FileGrpc.getDownloadMethod) == null) {
          FileGrpc.getDownloadMethod = getDownloadMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.file.FileRequest, ai.sensorycloud.api.v1.file.FileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  ai.sensorycloud.api.v1.file.FileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDownloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileStub>() {
        @java.lang.Override
        public FileStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileStub(channel, callOptions);
        }
      };
    return FileStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileBlockingStub>() {
        @java.lang.Override
        public FileBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileBlockingStub(channel, callOptions);
        }
      };
    return FileBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileFutureStub>() {
        @java.lang.Override
        public FileFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileFutureStub(channel, callOptions);
        }
      };
    return FileFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all file-related functions
   * </pre>
   */
  public static abstract class FileImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Allows a client to request information about a file in the cloud.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getInfo(ai.sensorycloud.api.v1.file.FileRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a client to request a list of all the files it is allowed to access
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getCatalog(ai.sensorycloud.api.v1.file.FileCatalogRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a root client to request the full list of files
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getCompleteCatalog(ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompleteCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows a client to request a file from the cloud.
     * Download streams a FileResponse until the entire file is downloaded
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void download(ai.sensorycloud.api.v1.file.FileRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.file.FileRequest,
                ai.sensorycloud.api.v1.file.FileInfo>(
                  this, METHODID_GET_INFO)))
          .addMethod(
            getGetCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.file.FileCatalogRequest,
                ai.sensorycloud.api.v1.file.FileCatalogResponse>(
                  this, METHODID_GET_CATALOG)))
          .addMethod(
            getGetCompleteCatalogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest,
                ai.sensorycloud.api.v1.file.FileCatalogResponse>(
                  this, METHODID_GET_COMPLETE_CATALOG)))
          .addMethod(
            getDownloadMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.file.FileRequest,
                ai.sensorycloud.api.v1.file.FileResponse>(
                  this, METHODID_DOWNLOAD)))
          .build();
    }
  }

  /**
   * <pre>
   * Handles all file-related functions
   * </pre>
   */
  public static final class FileStub extends io.grpc.stub.AbstractAsyncStub<FileStub> {
    private FileStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a client to request information about a file in the cloud.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getInfo(ai.sensorycloud.api.v1.file.FileRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows a client to request a list of all the files it is allowed to access
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getCatalog(ai.sensorycloud.api.v1.file.FileCatalogRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows a root client to request the full list of files
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getCompleteCatalog(ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompleteCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows a client to request a file from the cloud.
     * Download streams a FileResponse until the entire file is downloaded
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void download(ai.sensorycloud.api.v1.file.FileRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Handles all file-related functions
   * </pre>
   */
  public static final class FileBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileBlockingStub> {
    private FileBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a client to request information about a file in the cloud.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.file.FileInfo getInfo(ai.sensorycloud.api.v1.file.FileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows a client to request a list of all the files it is allowed to access
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.file.FileCatalogResponse getCatalog(ai.sensorycloud.api.v1.file.FileCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows a root client to request the full list of files
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.file.FileCatalogResponse getCompleteCatalog(ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompleteCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows a client to request a file from the cloud.
     * Download streams a FileResponse until the entire file is downloaded
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public java.util.Iterator<ai.sensorycloud.api.v1.file.FileResponse> download(
        ai.sensorycloud.api.v1.file.FileRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Handles all file-related functions
   * </pre>
   */
  public static final class FileFutureStub extends io.grpc.stub.AbstractFutureStub<FileFutureStub> {
    private FileFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allows a client to request information about a file in the cloud.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.file.FileInfo> getInfo(
        ai.sensorycloud.api.v1.file.FileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows a client to request a list of all the files it is allowed to access
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.file.FileCatalogResponse> getCatalog(
        ai.sensorycloud.api.v1.file.FileCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows a root client to request the full list of files
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.file.FileCatalogResponse> getCompleteCatalog(
        ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompleteCatalogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO = 0;
  private static final int METHODID_GET_CATALOG = 1;
  private static final int METHODID_GET_COMPLETE_CATALOG = 2;
  private static final int METHODID_DOWNLOAD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFO:
          serviceImpl.getInfo((ai.sensorycloud.api.v1.file.FileRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileInfo>) responseObserver);
          break;
        case METHODID_GET_CATALOG:
          serviceImpl.getCatalog((ai.sensorycloud.api.v1.file.FileCatalogRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse>) responseObserver);
          break;
        case METHODID_GET_COMPLETE_CATALOG:
          serviceImpl.getCompleteCatalog((ai.sensorycloud.api.v1.file.FileCompleteCatalogRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileCatalogResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((ai.sensorycloud.api.v1.file.FileRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.file.FileResponse>) responseObserver);
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
      synchronized (FileGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetInfoMethod())
              .addMethod(getGetCatalogMethod())
              .addMethod(getGetCompleteCatalogMethod())
              .addMethod(getDownloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}

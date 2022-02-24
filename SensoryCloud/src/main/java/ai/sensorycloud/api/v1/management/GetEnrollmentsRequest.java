// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * Criteria to filter the returned enrollments
 * A client may only retrieve enrollments
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.GetEnrollmentsRequest}
 */
public  final class GetEnrollmentsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetEnrollmentsRequest, GetEnrollmentsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.GetEnrollmentsRequest)
    GetEnrollmentsRequestOrBuilder {
  private GetEnrollmentsRequest() {
    userId_ = "";
  }
  public static final int USERID_FIELD_NUMBER = 1;
  private java.lang.String userId_;
  /**
   * <pre>
   * The id or userId of the user
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The id or userId of the user
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The id or userId of the user
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @param value The userId to set.
   */
  private void setUserId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userId_ = value;
  }
  /**
   * <pre>
   * The id or userId of the user
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The id or userId of the user
   * </pre>
   *
   * <code>string userId = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for userId to set.
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userId_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Criteria to filter the returned enrollments
   * A client may only retrieve enrollments
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.GetEnrollmentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.GetEnrollmentsRequest)
      ai.sensorycloud.api.v1.management.GetEnrollmentsRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The id or userId of the user
     * </pre>
     *
     * <code>string userId = 1 [(.validate.rules) = { ... }</code>
     * @return The userId.
     */
    @java.lang.Override
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The id or userId of the user
     * </pre>
     *
     * <code>string userId = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for userId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The id or userId of the user
     * </pre>
     *
     * <code>string userId = 1 [(.validate.rules) = { ... }</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserId(value);
      return this;
    }
    /**
     * <pre>
     * The id or userId of the user
     * </pre>
     *
     * <code>string userId = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The id or userId of the user
     * </pre>
     *
     * <code>string userId = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.GetEnrollmentsRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.management.GetEnrollmentsRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "userId_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.GetEnrollmentsRequest)
  private static final ai.sensorycloud.api.v1.management.GetEnrollmentsRequest DEFAULT_INSTANCE;
  static {
    GetEnrollmentsRequest defaultInstance = new GetEnrollmentsRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetEnrollmentsRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetEnrollmentsRequest> PARSER;

  public static com.google.protobuf.Parser<GetEnrollmentsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


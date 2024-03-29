// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Response contect generated from the passed authorization token
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.WhoAmIResponse}
 */
public  final class WhoAmIResponse extends
    com.google.protobuf.GeneratedMessageLite<
        WhoAmIResponse, WhoAmIResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.WhoAmIResponse)
    WhoAmIResponseOrBuilder {
  private WhoAmIResponse() {
    clientId_ = "";
    tenantId_ = "";
  }
  public static final int CLIENTID_FIELD_NUMBER = 1;
  private java.lang.String clientId_;
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    return clientId_;
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(clientId_);
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @param value The clientId to set.
   */
  private void setClientId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    clientId_ = value;
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   */
  private void clearClientId() {

    clientId_ = getDefaultInstance().getClientId();
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1;</code>
   * @param value The bytes for clientId to set.
   */
  private void setClientIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    clientId_ = value.toStringUtf8();

  }

  public static final int TENANTID_FIELD_NUMBER = 2;
  private java.lang.String tenantId_;
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    return tenantId_;
  }
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tenantId_);
  }
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @param value The tenantId to set.
   */
  private void setTenantId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    tenantId_ = value;
  }
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   */
  private void clearTenantId() {

    tenantId_ = getDefaultInstance().getTenantId();
  }
  /**
   * <pre>
   * Unique tenant UUID for the particular client
   * </pre>
   *
   * <code>string tenantId = 2;</code>
   * @param value The bytes for tenantId to set.
   */
  private void setTenantIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    tenantId_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.WhoAmIResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.oauth.WhoAmIResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Response contect generated from the passed authorization token
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.WhoAmIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.oauth.WhoAmIResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.WhoAmIResponse)
      ai.sensorycloud.api.oauth.WhoAmIResponseOrBuilder {
    // Construct using ai.sensorycloud.api.oauth.WhoAmIResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return The clientId.
     */
    @java.lang.Override
    public java.lang.String getClientId() {
      return instance.getClientId();
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return The bytes for clientId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      return instance.getClientIdBytes();
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      copyOnWrite();
      instance.setClientId(value);
      return this;
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      copyOnWrite();
      instance.clearClientId();
      return this;
    }
    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setClientIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return The tenantId.
     */
    @java.lang.Override
    public java.lang.String getTenantId() {
      return instance.getTenantId();
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return The bytes for tenantId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      return instance.getTenantIdBytes();
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTenantId(value);
      return this;
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      copyOnWrite();
      instance.clearTenantId();
      return this;
    }
    /**
     * <pre>
     * Unique tenant UUID for the particular client
     * </pre>
     *
     * <code>string tenantId = 2;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTenantIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.WhoAmIResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.oauth.WhoAmIResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "clientId_",
            "tenantId_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.oauth.WhoAmIResponse> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.oauth.WhoAmIResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.oauth.WhoAmIResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.oauth.WhoAmIResponse)
  private static final ai.sensorycloud.api.oauth.WhoAmIResponse DEFAULT_INSTANCE;
  static {
    WhoAmIResponse defaultInstance = new WhoAmIResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WhoAmIResponse.class, defaultInstance);
  }

  public static ai.sensorycloud.api.oauth.WhoAmIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WhoAmIResponse> PARSER;

  public static com.google.protobuf.Parser<WhoAmIResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


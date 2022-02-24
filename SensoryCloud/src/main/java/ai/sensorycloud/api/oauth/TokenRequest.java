// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Request to obtain an OAuth token
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.TokenRequest}
 */
public  final class TokenRequest extends
    com.google.protobuf.GeneratedMessageLite<
        TokenRequest, TokenRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.TokenRequest)
    TokenRequestOrBuilder {
  private TokenRequest() {
    clientId_ = "";
    secret_ = "";
  }
  public static final int CLIENTID_FIELD_NUMBER = 1;
  private java.lang.String clientId_;
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearClientId() {
    
    clientId_ = getDefaultInstance().getClientId();
  }
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for clientId to set.
   */
  private void setClientIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    clientId_ = value.toStringUtf8();
    
  }

  public static final int SECRET_FIELD_NUMBER = 2;
  private java.lang.String secret_;
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @return The secret.
   */
  @java.lang.Override
  public java.lang.String getSecret() {
    return secret_;
  }
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @return The bytes for secret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecretBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(secret_);
  }
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @param value The secret to set.
   */
  private void setSecret(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    secret_ = value;
  }
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   */
  private void clearSecret() {
    
    secret_ = getDefaultInstance().getSecret();
  }
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @param value The bytes for secret to set.
   */
  private void setSecretBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    secret_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.TokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.oauth.TokenRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to obtain an OAuth token
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.TokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.oauth.TokenRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.TokenRequest)
      ai.sensorycloud.api.oauth.TokenRequestOrBuilder {
    // Construct using ai.sensorycloud.api.oauth.TokenRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Unique client identifier created at enrollment
     * </pre>
     *
     * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
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
     * Secret value correspoinding to the client ID
     * </pre>
     *
     * <code>string secret = 2;</code>
     * @return The secret.
     */
    @java.lang.Override
    public java.lang.String getSecret() {
      return instance.getSecret();
    }
    /**
     * <pre>
     * Secret value correspoinding to the client ID
     * </pre>
     *
     * <code>string secret = 2;</code>
     * @return The bytes for secret.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSecretBytes() {
      return instance.getSecretBytes();
    }
    /**
     * <pre>
     * Secret value correspoinding to the client ID
     * </pre>
     *
     * <code>string secret = 2;</code>
     * @param value The secret to set.
     * @return This builder for chaining.
     */
    public Builder setSecret(
        java.lang.String value) {
      copyOnWrite();
      instance.setSecret(value);
      return this;
    }
    /**
     * <pre>
     * Secret value correspoinding to the client ID
     * </pre>
     *
     * <code>string secret = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecret() {
      copyOnWrite();
      instance.clearSecret();
      return this;
    }
    /**
     * <pre>
     * Secret value correspoinding to the client ID
     * </pre>
     *
     * <code>string secret = 2;</code>
     * @param value The bytes for secret to set.
     * @return This builder for chaining.
     */
    public Builder setSecretBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSecretBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.TokenRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.oauth.TokenRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "clientId_",
            "secret_",
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
        com.google.protobuf.Parser<ai.sensorycloud.api.oauth.TokenRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.oauth.TokenRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.oauth.TokenRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.oauth.TokenRequest)
  private static final ai.sensorycloud.api.oauth.TokenRequest DEFAULT_INSTANCE;
  static {
    TokenRequest defaultInstance = new TokenRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TokenRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.oauth.TokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TokenRequest> PARSER;

  public static com.google.protobuf.Parser<TokenRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

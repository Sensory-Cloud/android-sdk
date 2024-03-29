// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Request for a public key by KeyID in order to validation a token signed by the Sensory Cloud
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.PublicKeyRequest}
 */
public  final class PublicKeyRequest extends
    com.google.protobuf.GeneratedMessageLite<
        PublicKeyRequest, PublicKeyRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.PublicKeyRequest)
    PublicKeyRequestOrBuilder {
  private PublicKeyRequest() {
    keyId_ = "";
  }
  public static final int KEYID_FIELD_NUMBER = 1;
  private java.lang.String keyId_;
  /**
   * <pre>
   * Unique keyId associated with the public key
   * </pre>
   *
   * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    return keyId_;
  }
  /**
   * <pre>
   * Unique keyId associated with the public key
   * </pre>
   *
   * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(keyId_);
  }
  /**
   * <pre>
   * Unique keyId associated with the public key
   * </pre>
   *
   * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
   * @param value The keyId to set.
   */
  private void setKeyId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    keyId_ = value;
  }
  /**
   * <pre>
   * Unique keyId associated with the public key
   * </pre>
   *
   * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearKeyId() {

    keyId_ = getDefaultInstance().getKeyId();
  }
  /**
   * <pre>
   * Unique keyId associated with the public key
   * </pre>
   *
   * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for keyId to set.
   */
  private void setKeyIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    keyId_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.PublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.oauth.PublicKeyRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request for a public key by KeyID in order to validation a token signed by the Sensory Cloud
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.PublicKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.oauth.PublicKeyRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.PublicKeyRequest)
      ai.sensorycloud.api.oauth.PublicKeyRequestOrBuilder {
    // Construct using ai.sensorycloud.api.oauth.PublicKeyRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Unique keyId associated with the public key
     * </pre>
     *
     * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
     * @return The keyId.
     */
    @java.lang.Override
    public java.lang.String getKeyId() {
      return instance.getKeyId();
    }
    /**
     * <pre>
     * Unique keyId associated with the public key
     * </pre>
     *
     * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for keyId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyIdBytes() {
      return instance.getKeyIdBytes();
    }
    /**
     * <pre>
     * Unique keyId associated with the public key
     * </pre>
     *
     * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(
        java.lang.String value) {
      copyOnWrite();
      instance.setKeyId(value);
      return this;
    }
    /**
     * <pre>
     * Unique keyId associated with the public key
     * </pre>
     *
     * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      copyOnWrite();
      instance.clearKeyId();
      return this;
    }
    /**
     * <pre>
     * Unique keyId associated with the public key
     * </pre>
     *
     * <code>string keyId = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeyIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.PublicKeyRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.oauth.PublicKeyRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "keyId_",
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
        com.google.protobuf.Parser<ai.sensorycloud.api.oauth.PublicKeyRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.oauth.PublicKeyRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.oauth.PublicKeyRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.oauth.PublicKeyRequest)
  private static final ai.sensorycloud.api.oauth.PublicKeyRequest DEFAULT_INSTANCE;
  static {
    PublicKeyRequest defaultInstance = new PublicKeyRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PublicKeyRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.oauth.PublicKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PublicKeyRequest> PARSER;

  public static com.google.protobuf.Parser<PublicKeyRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


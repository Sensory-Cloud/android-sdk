// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Response to a key request. Holds a byte array representing the key value.
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.KeyResponse}
 */
public  final class KeyResponse extends
    com.google.protobuf.GeneratedMessageLite<
        KeyResponse, KeyResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.KeyResponse)
    KeyResponseOrBuilder {
  private KeyResponse() {
    id_ = "";
    name_ = "";
    tenantId_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  private void clearId() {

    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();

  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();

  }

  public static final int KEYTYPE_FIELD_NUMBER = 3;
  private int keyType_;
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  @java.lang.Override
  public int getKeyTypeValue() {
    return keyType_;
  }
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @return The keyType.
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.KeyType getKeyType() {
    ai.sensorycloud.api.common.KeyType result = ai.sensorycloud.api.common.KeyType.forNumber(keyType_);
    return result == null ? ai.sensorycloud.api.common.KeyType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @param value The enum numeric value on the wire for keyType to set.
   */
  private void setKeyTypeValue(int value) {
      keyType_ = value;
  }
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @param value The keyType to set.
   */
  private void setKeyType(ai.sensorycloud.api.common.KeyType value) {
    keyType_ = value.getNumber();

  }
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   */
  private void clearKeyType() {

    keyType_ = 0;
  }

  public static final int EXPIRATION_FIELD_NUMBER = 4;
  private long expiration_;
  /**
   * <pre>
   * Optional seconds until this key expires.
   * If this value is 0, this key will never expire
   * </pre>
   *
   * <code>int64 expiration = 4;</code>
   * @return The expiration.
   */
  @java.lang.Override
  public long getExpiration() {
    return expiration_;
  }
  /**
   * <pre>
   * Optional seconds until this key expires.
   * If this value is 0, this key will never expire
   * </pre>
   *
   * <code>int64 expiration = 4;</code>
   * @param value The expiration to set.
   */
  private void setExpiration(long value) {
    
    expiration_ = value;
  }
  /**
   * <pre>
   * Optional seconds until this key expires.
   * If this value is 0, this key will never expire
   * </pre>
   *
   * <code>int64 expiration = 4;</code>
   */
  private void clearExpiration() {

    expiration_ = 0L;
  }

  public static final int TENANTID_FIELD_NUMBER = 5;
  private java.lang.String tenantId_;
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    return tenantId_;
  }
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tenantId_);
  }
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @param value The tenantId to set.
   */
  private void setTenantId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    tenantId_ = value;
  }
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   */
  private void clearTenantId() {

    tenantId_ = getDefaultInstance().getTenantId();
  }
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @param value The bytes for tenantId to set.
   */
  private void setTenantIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    tenantId_ = value.toStringUtf8();

  }

  public static final int DISABLED_FIELD_NUMBER = 6;
  private boolean disabled_;
  /**
   * <pre>
   * Indicates if this key is disabled
   * </pre>
   *
   * <code>bool disabled = 6;</code>
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
  }
  /**
   * <pre>
   * Indicates if this key is disabled
   * </pre>
   *
   * <code>bool disabled = 6;</code>
   * @param value The disabled to set.
   */
  private void setDisabled(boolean value) {
    
    disabled_ = value;
  }
  /**
   * <pre>
   * Indicates if this key is disabled
   * </pre>
   *
   * <code>bool disabled = 6;</code>
   */
  private void clearDisabled() {

    disabled_ = false;
  }

  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.common.KeyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.common.KeyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.KeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.common.KeyResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Response to a key request. Holds a byte array representing the key value.
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.KeyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.common.KeyResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.KeyResponse)
      ai.sensorycloud.api.common.KeyResponseOrBuilder {
    // Construct using ai.sensorycloud.api.common.KeyResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The the uuid associated with this key
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * The the uuid associated with this key
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * The the uuid associated with this key
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * The the uuid associated with this key
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * The the uuid associated with this key
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name associated with this key
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name associated with this key
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name associated with this key
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name associated with this key
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name associated with this key
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 3;</code>
     * @return The enum numeric value on the wire for keyType.
     */
    @java.lang.Override
    public int getKeyTypeValue() {
      return instance.getKeyTypeValue();
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 3;</code>
     * @param value The keyType to set.
     * @return This builder for chaining.
     */
    public Builder setKeyTypeValue(int value) {
      copyOnWrite();
      instance.setKeyTypeValue(value);
      return this;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 3;</code>
     * @return The keyType.
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.KeyType getKeyType() {
      return instance.getKeyType();
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 3;</code>
     * @param value The enum numeric value on the wire for keyType to set.
     * @return This builder for chaining.
     */
    public Builder setKeyType(ai.sensorycloud.api.common.KeyType value) {
      copyOnWrite();
      instance.setKeyType(value);
      return this;
    }
    /**
     * <pre>
     * The key type
     * </pre>
     *
     * <code>.sensory.api.common.KeyType keyType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyType() {
      copyOnWrite();
      instance.clearKeyType();
      return this;
    }

    /**
     * <pre>
     * Optional seconds until this key expires.
     * If this value is 0, this key will never expire
     * </pre>
     *
     * <code>int64 expiration = 4;</code>
     * @return The expiration.
     */
    @java.lang.Override
    public long getExpiration() {
      return instance.getExpiration();
    }
    /**
     * <pre>
     * Optional seconds until this key expires.
     * If this value is 0, this key will never expire
     * </pre>
     *
     * <code>int64 expiration = 4;</code>
     * @param value The expiration to set.
     * @return This builder for chaining.
     */
    public Builder setExpiration(long value) {
      copyOnWrite();
      instance.setExpiration(value);
      return this;
    }
    /**
     * <pre>
     * Optional seconds until this key expires.
     * If this value is 0, this key will never expire
     * </pre>
     *
     * <code>int64 expiration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiration() {
      copyOnWrite();
      instance.clearExpiration();
      return this;
    }

    /**
     * <pre>
     * TenantId for this key
     * </pre>
     *
     * <code>string tenantId = 5;</code>
     * @return The tenantId.
     */
    @java.lang.Override
    public java.lang.String getTenantId() {
      return instance.getTenantId();
    }
    /**
     * <pre>
     * TenantId for this key
     * </pre>
     *
     * <code>string tenantId = 5;</code>
     * @return The bytes for tenantId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      return instance.getTenantIdBytes();
    }
    /**
     * <pre>
     * TenantId for this key
     * </pre>
     *
     * <code>string tenantId = 5;</code>
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
     * TenantId for this key
     * </pre>
     *
     * <code>string tenantId = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      copyOnWrite();
      instance.clearTenantId();
      return this;
    }
    /**
     * <pre>
     * TenantId for this key
     * </pre>
     *
     * <code>string tenantId = 5;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTenantIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Indicates if this key is disabled
     * </pre>
     *
     * <code>bool disabled = 6;</code>
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return instance.getDisabled();
    }
    /**
     * <pre>
     * Indicates if this key is disabled
     * </pre>
     *
     * <code>bool disabled = 6;</code>
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {
      copyOnWrite();
      instance.setDisabled(value);
      return this;
    }
    /**
     * <pre>
     * Indicates if this key is disabled
     * </pre>
     *
     * <code>bool disabled = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      copyOnWrite();
      instance.clearDisabled();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.common.KeyResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.common.KeyResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "name_",
            "keyType_",
            "expiration_",
            "tenantId_",
            "disabled_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\f\u0004\u0002\u0005\u0208\u0006\u0007";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.common.KeyResponse> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.common.KeyResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.common.KeyResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.common.KeyResponse)
  private static final ai.sensorycloud.api.common.KeyResponse DEFAULT_INSTANCE;
  static {
    KeyResponse defaultInstance = new KeyResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      KeyResponse.class, defaultInstance);
  }

  public static ai.sensorycloud.api.common.KeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<KeyResponse> PARSER;

  public static com.google.protobuf.Parser<KeyResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * An indication of the health of a particular service
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.ServiceHealth}
 */
public  final class ServiceHealth extends
    com.google.protobuf.GeneratedMessageLite<
        ServiceHealth, ServiceHealth.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.ServiceHealth)
    ServiceHealthOrBuilder {
  private ServiceHealth() {
    name_ = "";
    message_ = "";
  }
  public static final int ISHEALTHY_FIELD_NUMBER = 1;
  private boolean isHealthy_;
  /**
   * <pre>
   * Is healthy indication
   * </pre>
   *
   * <code>bool isHealthy = 1;</code>
   * @return The isHealthy.
   */
  @java.lang.Override
  public boolean getIsHealthy() {
    return isHealthy_;
  }
  /**
   * <pre>
   * Is healthy indication
   * </pre>
   *
   * <code>bool isHealthy = 1;</code>
   * @param value The isHealthy to set.
   */
  private void setIsHealthy(boolean value) {
    
    isHealthy_ = value;
  }
  /**
   * <pre>
   * Is healthy indication
   * </pre>
   *
   * <code>bool isHealthy = 1;</code>
   */
  private void clearIsHealthy() {

    isHealthy_ = false;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <pre>
   * Name of the service
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
   * Name of the service
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
   * Name of the service
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
   * Name of the service
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Name of the service
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

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private java.lang.String message_;
  /**
   * <pre>
   * Details of the service health
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    return message_;
  }
  /**
   * <pre>
   * Details of the service health
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(message_);
  }
  /**
   * <pre>
   * Details of the service health
   * </pre>
   *
   * <code>string message = 3;</code>
   * @param value The message to set.
   */
  private void setMessage(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    message_ = value;
  }
  /**
   * <pre>
   * Details of the service health
   * </pre>
   *
   * <code>string message = 3;</code>
   */
  private void clearMessage() {

    message_ = getDefaultInstance().getMessage();
  }
  /**
   * <pre>
   * Details of the service health
   * </pre>
   *
   * <code>string message = 3;</code>
   * @param value The bytes for message to set.
   */
  private void setMessageBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    message_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.common.ServiceHealth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.common.ServiceHealth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.ServiceHealth parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.common.ServiceHealth prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * An indication of the health of a particular service
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.ServiceHealth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.common.ServiceHealth, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.ServiceHealth)
      ai.sensorycloud.api.common.ServiceHealthOrBuilder {
    // Construct using ai.sensorycloud.api.common.ServiceHealth.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Is healthy indication
     * </pre>
     *
     * <code>bool isHealthy = 1;</code>
     * @return The isHealthy.
     */
    @java.lang.Override
    public boolean getIsHealthy() {
      return instance.getIsHealthy();
    }
    /**
     * <pre>
     * Is healthy indication
     * </pre>
     *
     * <code>bool isHealthy = 1;</code>
     * @param value The isHealthy to set.
     * @return This builder for chaining.
     */
    public Builder setIsHealthy(boolean value) {
      copyOnWrite();
      instance.setIsHealthy(value);
      return this;
    }
    /**
     * <pre>
     * Is healthy indication
     * </pre>
     *
     * <code>bool isHealthy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsHealthy() {
      copyOnWrite();
      instance.clearIsHealthy();
      return this;
    }

    /**
     * <pre>
     * Name of the service
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
     * Name of the service
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
     * Name of the service
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
     * Name of the service
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
     * Name of the service
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
     * Details of the service health
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
      return instance.getMessage();
    }
    /**
     * <pre>
     * Details of the service health
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageBytes() {
      return instance.getMessageBytes();
    }
    /**
     * <pre>
     * Details of the service health
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setMessage(value);
      return this;
    }
    /**
     * <pre>
     * Details of the service health
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      copyOnWrite();
      instance.clearMessage();
      return this;
    }
    /**
     * <pre>
     * Details of the service health
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.common.ServiceHealth)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.common.ServiceHealth();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "isHealthy_",
            "name_",
            "message_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.common.ServiceHealth> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.common.ServiceHealth.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.common.ServiceHealth>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.common.ServiceHealth)
  private static final ai.sensorycloud.api.common.ServiceHealth DEFAULT_INSTANCE;
  static {
    ServiceHealth defaultInstance = new ServiceHealth();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ServiceHealth.class, defaultInstance);
  }

  public static ai.sensorycloud.api.common.ServiceHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ServiceHealth> PARSER;

  public static com.google.protobuf.Parser<ServiceHealth> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


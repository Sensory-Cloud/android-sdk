// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * <pre>
 * Provides information for an audio-based enrollment
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.assistant.AssistantMessageConfig}
 */
public  final class AssistantMessageConfig extends
    com.google.protobuf.GeneratedMessageLite<
        AssistantMessageConfig, AssistantMessageConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.AssistantMessageConfig)
    AssistantMessageConfigOrBuilder {
  private AssistantMessageConfig() {
    userId_ = "";
    deviceId_ = "";
    modelName_ = "";
  }
  public static final int USERID_FIELD_NUMBER = 2;
  private java.lang.String userId_;
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @param value The userId to set.
   */
  private void setUserId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userId_ = value;
  }
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for userId to set.
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userId_ = value.toStringUtf8();
    
  }

  public static final int DEVICEID_FIELD_NUMBER = 3;
  private java.lang.String deviceId_;
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    return deviceId_;
  }
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(deviceId_);
  }
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @param value The deviceId to set.
   */
  private void setDeviceId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    deviceId_ = value;
  }
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   */
  private void clearDeviceId() {
    
    deviceId_ = getDefaultInstance().getDeviceId();
  }
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @param value The bytes for deviceId to set.
   */
  private void setDeviceIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    deviceId_ = value.toStringUtf8();
    
  }

  public static final int MODELNAME_FIELD_NUMBER = 4;
  private java.lang.String modelName_;
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    return modelName_;
  }
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelName_);
  }
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @param value The modelName to set.
   */
  private void setModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelName_ = value;
  }
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   */
  private void clearModelName() {
    
    modelName_ = getDefaultInstance().getModelName();
  }
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();
    
  }

  public static final int INCLUDEAUDIORESPONSE_FIELD_NUMBER = 5;
  private boolean includeAudioResponse_;
  /**
   * <pre>
   * Indicates if audio content should be returned along with text and intent content
   * </pre>
   *
   * <code>bool includeAudioResponse = 5;</code>
   * @return The includeAudioResponse.
   */
  @java.lang.Override
  public boolean getIncludeAudioResponse() {
    return includeAudioResponse_;
  }
  /**
   * <pre>
   * Indicates if audio content should be returned along with text and intent content
   * </pre>
   *
   * <code>bool includeAudioResponse = 5;</code>
   * @param value The includeAudioResponse to set.
   */
  private void setIncludeAudioResponse(boolean value) {
    
    includeAudioResponse_ = value;
  }
  /**
   * <pre>
   * Indicates if audio content should be returned along with text and intent content
   * </pre>
   *
   * <code>bool includeAudioResponse = 5;</code>
   */
  private void clearIncludeAudioResponse() {
    
    includeAudioResponse_ = false;
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.AssistantMessageConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Provides information for an audio-based enrollment
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.assistant.AssistantMessageConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.assistant.AssistantMessageConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.AssistantMessageConfig)
      ai.sensorycloud.api.v1.assistant.AssistantMessageConfigOrBuilder {
    // Construct using ai.sensorycloud.api.v1.assistant.AssistantMessageConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The unique user Identifer. This value should be a unique email address or username known by the user.
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
     * @return The userId.
     */
    @java.lang.Override
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The unique user Identifer. This value should be a unique email address or username known by the user.
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for userId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The unique user Identifer. This value should be a unique email address or username known by the user.
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer. This value should be a unique email address or username known by the user.
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The unique user Identifer. This value should be a unique email address or username known by the user.
     * </pre>
     *
     * <code>string userId = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
     * this value is used to identify a device uniquely across multiple enrollments
     * </pre>
     *
     * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      return instance.getDeviceId();
    }
    /**
     * <pre>
     * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
     * this value is used to identify a device uniquely across multiple enrollments
     * </pre>
     *
     * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      return instance.getDeviceIdBytes();
    }
    /**
     * <pre>
     * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
     * this value is used to identify a device uniquely across multiple enrollments
     * </pre>
     *
     * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeviceId(value);
      return this;
    }
    /**
     * <pre>
     * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
     * this value is used to identify a device uniquely across multiple enrollments
     * </pre>
     *
     * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      copyOnWrite();
      instance.clearDeviceId();
      return this;
    }
    /**
     * <pre>
     * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
     * this value is used to identify a device uniquely across multiple enrollments
     * </pre>
     *
     * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeviceIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Name of background model to be enrolled in
     * Background models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return The modelName.
     */
    @java.lang.Override
    public java.lang.String getModelName() {
      return instance.getModelName();
    }
    /**
     * <pre>
     * Name of background model to be enrolled in
     * Background models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return The bytes for modelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      return instance.getModelNameBytes();
    }
    /**
     * <pre>
     * Name of background model to be enrolled in
     * Background models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @param value The modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelName(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelName(value);
      return this;
    }
    /**
     * <pre>
     * Name of background model to be enrolled in
     * Background models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      copyOnWrite();
      instance.clearModelName();
      return this;
    }
    /**
     * <pre>
     * Name of background model to be enrolled in
     * Background models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @param value The bytes for modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Indicates if audio content should be returned along with text and intent content
     * </pre>
     *
     * <code>bool includeAudioResponse = 5;</code>
     * @return The includeAudioResponse.
     */
    @java.lang.Override
    public boolean getIncludeAudioResponse() {
      return instance.getIncludeAudioResponse();
    }
    /**
     * <pre>
     * Indicates if audio content should be returned along with text and intent content
     * </pre>
     *
     * <code>bool includeAudioResponse = 5;</code>
     * @param value The includeAudioResponse to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeAudioResponse(boolean value) {
      copyOnWrite();
      instance.setIncludeAudioResponse(value);
      return this;
    }
    /**
     * <pre>
     * Indicates if audio content should be returned along with text and intent content
     * </pre>
     *
     * <code>bool includeAudioResponse = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeAudioResponse() {
      copyOnWrite();
      instance.clearIncludeAudioResponse();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.AssistantMessageConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.assistant.AssistantMessageConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "userId_",
            "deviceId_",
            "modelName_",
            "includeAudioResponse_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0208\u0003\u0208" +
              "\u0004\u0208\u0005\u0007";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.assistant.AssistantMessageConfig> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.assistant.AssistantMessageConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.assistant.AssistantMessageConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.AssistantMessageConfig)
  private static final ai.sensorycloud.api.v1.assistant.AssistantMessageConfig DEFAULT_INSTANCE;
  static {
    AssistantMessageConfig defaultInstance = new AssistantMessageConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AssistantMessageConfig.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessageConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AssistantMessageConfig> PARSER;

  public static com.google.protobuf.Parser<AssistantMessageConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

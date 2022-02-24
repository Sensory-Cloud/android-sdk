// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Provides information for an audio-based transcription
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.TranscribeConfig}
 */
public  final class TranscribeConfig extends
    com.google.protobuf.GeneratedMessageLite<
        TranscribeConfig, TranscribeConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.TranscribeConfig)
    TranscribeConfigOrBuilder {
  private TranscribeConfig() {
    modelName_ = "";
    userId_ = "";
  }
  public static final int AUDIO_FIELD_NUMBER = 1;
  private ai.sensorycloud.api.v1.audio.AudioConfig audio_;
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.AudioConfig getAudio() {
    return audio_ == null ? ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance() : audio_;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  private void setAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
    value.getClass();
  audio_ = value;
    
    }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
    value.getClass();
  if (audio_ != null &&
        audio_ != ai.sensorycloud.api.v1.audio.AudioConfig.getDefaultInstance()) {
      audio_ =
        ai.sensorycloud.api.v1.audio.AudioConfig.newBuilder(audio_).mergeFrom(value).buildPartial();
    } else {
      audio_ = value;
    }
    
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearAudio() {  audio_ = null;
    
  }

  public static final int MODELNAME_FIELD_NUMBER = 2;
  private java.lang.String modelName_;
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    return modelName_;
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelName_);
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @param value The modelName to set.
   */
  private void setModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelName_ = value;
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearModelName() {
    
    modelName_ = getDefaultInstance().getModelName();
  }
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();
    
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private java.lang.String userId_;
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @param value The userId to set.
   */
  private void setUserId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userId_ = value;
  }
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @param value The bytes for userId to set.
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userId_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.TranscribeConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Provides information for an audio-based transcription
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.TranscribeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.audio.TranscribeConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.TranscribeConfig)
      ai.sensorycloud.api.v1.audio.TranscribeConfigOrBuilder {
    // Construct using ai.sensorycloud.api.v1.audio.TranscribeConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public boolean hasAudio() {
      return instance.hasAudio();
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.AudioConfig getAudio() {
      return instance.getAudio();
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      copyOnWrite();
      instance.setAudio(value);
      return this;
      }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(
        ai.sensorycloud.api.v1.audio.AudioConfig.Builder builderForValue) {
      copyOnWrite();
      instance.setAudio(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeAudio(ai.sensorycloud.api.v1.audio.AudioConfig value) {
      copyOnWrite();
      instance.mergeAudio(value);
      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearAudio() {  copyOnWrite();
      instance.clearAudio();
      return this;
    }

    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return The modelName.
     */
    @java.lang.Override
    public java.lang.String getModelName() {
      return instance.getModelName();
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for modelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      return instance.getModelNameBytes();
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
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
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      copyOnWrite();
      instance.clearModelName();
      return this;
    }
    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return The userId.
     */
    @java.lang.Override
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return The bytes for userId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
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
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The unique user Identifer
     * </pre>
     *
     * <code>string userId = 3 [(.validate.rules) = { ... }</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.TranscribeConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.audio.TranscribeConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "audio_",
            "modelName_",
            "userId_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.audio.TranscribeConfig> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.audio.TranscribeConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.audio.TranscribeConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.TranscribeConfig)
  private static final ai.sensorycloud.api.v1.audio.TranscribeConfig DEFAULT_INSTANCE;
  static {
    TranscribeConfig defaultInstance = new TranscribeConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TranscribeConfig.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TranscribeConfig> PARSER;

  public static com.google.protobuf.Parser<TranscribeConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Configurations for the voice synthesis model
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.VoiceSynthesisConfig}
 */
public  final class VoiceSynthesisConfig extends
    com.google.protobuf.GeneratedMessageLite<
        VoiceSynthesisConfig, VoiceSynthesisConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.VoiceSynthesisConfig)
    VoiceSynthesisConfigOrBuilder {
  private VoiceSynthesisConfig() {
    voice_ = "";
  }
  public static final int AUDIO_FIELD_NUMBER = 1;
  private ai.sensorycloud.api.v1.audio.AudioConfig audio_;
  /**
   * <pre>
   * Required. Provides information that specifies how the synthesized audio should be formatted
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
   * Required. Provides information that specifies how the synthesized audio should be formatted
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
   * Required. Provides information that specifies how the synthesized audio should be formatted
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
   * Required. Provides information that specifies how the synthesized audio should be formatted
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
   * Required. Provides information that specifies how the synthesized audio should be formatted
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearAudio() {  audio_ = null;
    
  }

  public static final int VOICE_FIELD_NUMBER = 2;
  private java.lang.String voice_;
  /**
   * <pre>
   * Required. The name of the voice to use for voice synthesis
   * </pre>
   *
   * <code>string voice = 2 [(.validate.rules) = { ... }</code>
   * @return The voice.
   */
  @java.lang.Override
  public java.lang.String getVoice() {
    return voice_;
  }
  /**
   * <pre>
   * Required. The name of the voice to use for voice synthesis
   * </pre>
   *
   * <code>string voice = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for voice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVoiceBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(voice_);
  }
  /**
   * <pre>
   * Required. The name of the voice to use for voice synthesis
   * </pre>
   *
   * <code>string voice = 2 [(.validate.rules) = { ... }</code>
   * @param value The voice to set.
   */
  private void setVoice(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    voice_ = value;
  }
  /**
   * <pre>
   * Required. The name of the voice to use for voice synthesis
   * </pre>
   *
   * <code>string voice = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearVoice() {
    
    voice_ = getDefaultInstance().getVoice();
  }
  /**
   * <pre>
   * Required. The name of the voice to use for voice synthesis
   * </pre>
   *
   * <code>string voice = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for voice to set.
   */
  private void setVoiceBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    voice_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Configurations for the voice synthesis model
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.VoiceSynthesisConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.VoiceSynthesisConfig)
      ai.sensorycloud.api.v1.audio.VoiceSynthesisConfigOrBuilder {
    // Construct using ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. Provides information that specifies how the synthesized audio should be formatted
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
     * Required. The name of the voice to use for voice synthesis
     * </pre>
     *
     * <code>string voice = 2 [(.validate.rules) = { ... }</code>
     * @return The voice.
     */
    @java.lang.Override
    public java.lang.String getVoice() {
      return instance.getVoice();
    }
    /**
     * <pre>
     * Required. The name of the voice to use for voice synthesis
     * </pre>
     *
     * <code>string voice = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for voice.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVoiceBytes() {
      return instance.getVoiceBytes();
    }
    /**
     * <pre>
     * Required. The name of the voice to use for voice synthesis
     * </pre>
     *
     * <code>string voice = 2 [(.validate.rules) = { ... }</code>
     * @param value The voice to set.
     * @return This builder for chaining.
     */
    public Builder setVoice(
        java.lang.String value) {
      copyOnWrite();
      instance.setVoice(value);
      return this;
    }
    /**
     * <pre>
     * Required. The name of the voice to use for voice synthesis
     * </pre>
     *
     * <code>string voice = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVoice() {
      copyOnWrite();
      instance.clearVoice();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the voice to use for voice synthesis
     * </pre>
     *
     * <code>string voice = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for voice to set.
     * @return This builder for chaining.
     */
    public Builder setVoiceBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setVoiceBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.VoiceSynthesisConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "audio_",
            "voice_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.VoiceSynthesisConfig)
  private static final ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig DEFAULT_INSTANCE;
  static {
    VoiceSynthesisConfig defaultInstance = new VoiceSynthesisConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      VoiceSynthesisConfig.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.audio.VoiceSynthesisConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<VoiceSynthesisConfig> PARSER;

  public static com.google.protobuf.Parser<VoiceSynthesisConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


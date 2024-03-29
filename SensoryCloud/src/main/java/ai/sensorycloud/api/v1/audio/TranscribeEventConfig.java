// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Provides information for an audio-based event recognition
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.TranscribeEventConfig}
 */
public  final class TranscribeEventConfig extends
    com.google.protobuf.GeneratedMessageLite<
        TranscribeEventConfig, TranscribeEventConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.TranscribeEventConfig)
    TranscribeEventConfigOrBuilder {
  private TranscribeEventConfig() {
    modelName_ = "";
  }
  public static final int MODELNAME_FIELD_NUMBER = 1;
  private java.lang.String modelName_;
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
   * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();

  }

  public static final int SENSITIVITY_FIELD_NUMBER = 2;
  private int sensitivity_;
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for sensitivity.
   */
  @java.lang.Override
  public int getSensitivityValue() {
    return sensitivity_;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
   * @return The sensitivity.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity() {
    ai.sensorycloud.api.v1.audio.ThresholdSensitivity result = ai.sensorycloud.api.v1.audio.ThresholdSensitivity.forNumber(sensitivity_);
    return result == null ? ai.sensorycloud.api.v1.audio.ThresholdSensitivity.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
   * @param value The enum numeric value on the wire for sensitivity to set.
   */
  private void setSensitivityValue(int value) {
      sensitivity_ = value;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
   * @param value The sensitivity to set.
   */
  private void setSensitivity(ai.sensorycloud.api.v1.audio.ThresholdSensitivity value) {
    sensitivity_ = value.getNumber();

  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearSensitivity() {

    sensitivity_ = 0;
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.TranscribeEventConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Provides information for an audio-based event recognition
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.TranscribeEventConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.audio.TranscribeEventConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.TranscribeEventConfig)
      ai.sensorycloud.api.v1.audio.TranscribeEventConfigOrBuilder {
    // Construct using ai.sensorycloud.api.v1.audio.TranscribeEventConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Name of model to validate against
     * Models can be retrieved from the GetModels() gRPC call
     * </pre>
     *
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string modelName = 1 [(.validate.rules) = { ... }</code>
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
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for sensitivity.
     */
    @java.lang.Override
    public int getSensitivityValue() {
      return instance.getSensitivityValue();
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
     * @param value The sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivityValue(int value) {
      copyOnWrite();
      instance.setSensitivityValue(value);
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
     * @return The sensitivity.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity() {
      return instance.getSensitivity();
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivity(ai.sensorycloud.api.v1.audio.ThresholdSensitivity value) {
      copyOnWrite();
      instance.setSensitivity(value);
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSensitivity() {
      copyOnWrite();
      instance.clearSensitivity();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.TranscribeEventConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.audio.TranscribeEventConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "modelName_",
            "sensitivity_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.audio.TranscribeEventConfig> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.audio.TranscribeEventConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.audio.TranscribeEventConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.TranscribeEventConfig)
  private static final ai.sensorycloud.api.v1.audio.TranscribeEventConfig DEFAULT_INSTANCE;
  static {
    TranscribeEventConfig defaultInstance = new TranscribeEventConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TranscribeEventConfig.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeEventConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TranscribeEventConfig> PARSER;

  public static com.google.protobuf.Parser<TranscribeEventConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


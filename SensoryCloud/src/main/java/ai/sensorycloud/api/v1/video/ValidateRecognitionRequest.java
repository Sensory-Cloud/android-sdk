// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

/**
 * <pre>
 * The top-level message sent by the client for the `ValidateLiveness` method.
 * Multiple `ValidateRecognitionRequest` messages are sent in a stream. The first message
 * must contain a `config` message and must not contain `imageContent`.
 * All subsequent messages must contain `imageContent` and
 * must not contain a `config` message.
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.video.ValidateRecognitionRequest}
 */
public  final class ValidateRecognitionRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ValidateRecognitionRequest, ValidateRecognitionRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.video.ValidateRecognitionRequest)
    ValidateRecognitionRequestOrBuilder {
  private ValidateRecognitionRequest() {
  }
  private int streamingRequestCase_ = 0;
  private java.lang.Object streamingRequest_;
  public enum StreamingRequestCase {
    CONFIG(1),
    IMAGECONTENT(2),
    STREAMINGREQUEST_NOT_SET(0);
    private final int value;
    private StreamingRequestCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StreamingRequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static StreamingRequestCase forNumber(int value) {
      switch (value) {
        case 1: return CONFIG;
        case 2: return IMAGECONTENT;
        case 0: return STREAMINGREQUEST_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public StreamingRequestCase
  getStreamingRequestCase() {
    return StreamingRequestCase.forNumber(
        streamingRequestCase_);
  }

  private void clearStreamingRequest() {
    streamingRequestCase_ = 0;
    streamingRequest_ = null;
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateRecognitionRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
   */
  @java.lang.Override
  public boolean hasConfig() {
    return streamingRequestCase_ == 1;
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateRecognitionRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig getConfig() {
    if (streamingRequestCase_ == 1) {
       return (ai.sensorycloud.api.v1.video.ValidateRecognitionConfig) streamingRequest_;
    }
    return ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateRecognitionRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
   */
  private void setConfig(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig value) {
    value.getClass();
  streamingRequest_ = value;
    streamingRequestCase_ = 1;
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateRecognitionRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
   */
  private void mergeConfig(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig value) {
    value.getClass();
  if (streamingRequestCase_ == 1 &&
        streamingRequest_ != ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.getDefaultInstance()) {
      streamingRequest_ = ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.newBuilder((ai.sensorycloud.api.v1.video.ValidateRecognitionConfig) streamingRequest_)
          .mergeFrom(value).buildPartial();
    } else {
      streamingRequest_ = value;
    }
    streamingRequestCase_ = 1;
  }
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateRecognitionRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
   */
  private void clearConfig() {
    if (streamingRequestCase_ == 1) {
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
    }
  }

  public static final int IMAGECONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return Whether the imageContent field is set.
   */
  @java.lang.Override
  public boolean hasImageContent() {
    return streamingRequestCase_ == 2;
  }
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return The imageContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageContent() {
    if (streamingRequestCase_ == 2) {
      return (com.google.protobuf.ByteString) streamingRequest_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @param value The imageContent to set.
   */
  private void setImageContent(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  streamingRequestCase_ = 2;
    streamingRequest_ = value;
  }
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   */
  private void clearImageContent() {
    if (streamingRequestCase_ == 2) {
      streamingRequestCase_ = 0;
      streamingRequest_ = null;
    }
  }

  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.video.ValidateRecognitionRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The top-level message sent by the client for the `ValidateLiveness` method.
   * Multiple `ValidateRecognitionRequest` messages are sent in a stream. The first message
   * must contain a `config` message and must not contain `imageContent`.
   * All subsequent messages must contain `imageContent` and
   * must not contain a `config` message.
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.video.ValidateRecognitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.video.ValidateRecognitionRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.video.ValidateRecognitionRequest)
      ai.sensorycloud.api.v1.video.ValidateRecognitionRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.video.ValidateRecognitionRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public StreamingRequestCase
        getStreamingRequestCase() {
      return instance.getStreamingRequestCase();
    }

    public Builder clearStreamingRequest() {
      copyOnWrite();
      instance.clearStreamingRequest();
      return this;
    }


    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    @java.lang.Override
    public boolean hasConfig() {
      return instance.hasConfig();
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.video.ValidateRecognitionConfig getConfig() {
      return instance.getConfig();
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    public Builder setConfig(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig value) {
      copyOnWrite();
      instance.setConfig(value);
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    public Builder setConfig(
        ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.Builder builderForValue) {
      copyOnWrite();
      instance.setConfig(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    public Builder mergeConfig(ai.sensorycloud.api.v1.video.ValidateRecognitionConfig value) {
      copyOnWrite();
      instance.mergeConfig(value);
      return this;
    }
    /**
     * <pre>
     * Provides information that specifies how to process the
     * request. The first `ValidateRecognitionRequest` message must contain a
     * `config`  message.
     * </pre>
     *
     * <code>.sensory.api.v1.video.ValidateRecognitionConfig config = 1;</code>
     */
    public Builder clearConfig() {
      copyOnWrite();
      instance.clearConfig();
      return this;
    }

    /**
     * <pre>
     * The image content to be recognized sent as bytes.
     * </pre>
     *
     * <code>bytes imageContent = 2;</code>
     * @return Whether the imageContent field is set.
     */
    @java.lang.Override
    public boolean hasImageContent() {
      return instance.hasImageContent();
    }
    /**
     * <pre>
     * The image content to be recognized sent as bytes.
     * </pre>
     *
     * <code>bytes imageContent = 2;</code>
     * @return The imageContent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getImageContent() {
      return instance.getImageContent();
    }
    /**
     * <pre>
     * The image content to be recognized sent as bytes.
     * </pre>
     *
     * <code>bytes imageContent = 2;</code>
     * @param value The imageContent to set.
     * @return This builder for chaining.
     */
    public Builder setImageContent(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setImageContent(value);
      return this;
    }
    /**
     * <pre>
     * The image content to be recognized sent as bytes.
     * </pre>
     *
     * <code>bytes imageContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageContent() {
      copyOnWrite();
      instance.clearImageContent();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.video.ValidateRecognitionRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.video.ValidateRecognitionRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "streamingRequest_",
            "streamingRequestCase_",
            ai.sensorycloud.api.v1.video.ValidateRecognitionConfig.class,
          };
          java.lang.String info =
              "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002=" +
              "\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.video.ValidateRecognitionRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.video.ValidateRecognitionRequest)
  private static final ai.sensorycloud.api.v1.video.ValidateRecognitionRequest DEFAULT_INSTANCE;
  static {
    ValidateRecognitionRequest defaultInstance = new ValidateRecognitionRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ValidateRecognitionRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.video.ValidateRecognitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ValidateRecognitionRequest> PARSER;

  public static com.google.protobuf.Parser<ValidateRecognitionRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


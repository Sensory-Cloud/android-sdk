// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * <pre>
 * A message from the assistant
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.assistant.AssistantMessage}
 */
public  final class AssistantMessage extends
    com.google.protobuf.GeneratedMessageLite<
        AssistantMessage, AssistantMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.AssistantMessage)
    AssistantMessageOrBuilder {
  private AssistantMessage() {
  }
  private int messageCase_ = 0;
  private java.lang.Object message_;
  public enum MessageCase {
    TEXT(1),
    AUDIOCONTENT(2),
    MESSAGE_NOT_SET(0);
    private final int value;
    private MessageCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessageCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT;
        case 2: return AUDIOCONTENT;
        case 0: return MESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public MessageCase
  getMessageCase() {
    return MessageCase.forNumber(
        messageCase_);
  }

  private void clearMessage() {
    messageCase_ = 0;
    message_ = null;
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return messageCase_ == 1;
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.String ref = "";
    if (messageCase_ == 1) {
      ref = (java.lang.String) message_;
    }
    return ref;
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.String ref = "";
    if (messageCase_ == 1) {
      ref = (java.lang.String) message_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  messageCase_ = 1;
    message_ = value;
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearText() {
    if (messageCase_ == 1) {
      messageCase_ = 0;
      message_ = null;
    }
  }
  /**
   * <code>string text = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    message_ = value.toStringUtf8();
    messageCase_ = 1;
  }

  public static final int AUDIOCONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  @java.lang.Override
  public boolean hasAudioContent() {
    return messageCase_ == 2;
  }
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioContent() {
    if (messageCase_ == 2) {
      return (com.google.protobuf.ByteString) message_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @param value The audioContent to set.
   */
  private void setAudioContent(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  messageCase_ = 2;
    message_ = value;
  }
  /**
   * <pre>
   * Audio content if requested
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   */
  private void clearAudioContent() {
    if (messageCase_ == 2) {
      messageCase_ = 0;
      message_ = null;
    }
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.AssistantMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.AssistantMessage prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A message from the assistant
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.assistant.AssistantMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.assistant.AssistantMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.AssistantMessage)
      ai.sensorycloud.api.v1.assistant.AssistantMessageOrBuilder {
    // Construct using ai.sensorycloud.api.v1.assistant.AssistantMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public MessageCase
        getMessageCase() {
      return instance.getMessageCase();
    }

    public Builder clearMessage() {
      copyOnWrite();
      instance.clearMessage();
      return this;
    }


    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <code>string text = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return Whether the audioContent field is set.
     */
    @java.lang.Override
    public boolean hasAudioContent() {
      return instance.hasAudioContent();
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return The audioContent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAudioContent() {
      return instance.getAudioContent();
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @param value The audioContent to set.
     * @return This builder for chaining.
     */
    public Builder setAudioContent(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAudioContent(value);
      return this;
    }
    /**
     * <pre>
     * Audio content if requested
     * </pre>
     *
     * <code>bytes audioContent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioContent() {
      copyOnWrite();
      instance.clearAudioContent();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.AssistantMessage)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.assistant.AssistantMessage();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "message_",
            "messageCase_",
          };
          java.lang.String info =
              "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u023b\u0000\u0002" +
              "=\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.assistant.AssistantMessage> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.assistant.AssistantMessage.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.assistant.AssistantMessage>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.AssistantMessage)
  private static final ai.sensorycloud.api.v1.assistant.AssistantMessage DEFAULT_INSTANCE;
  static {
    AssistantMessage defaultInstance = new AssistantMessage();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AssistantMessage.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.assistant.AssistantMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AssistantMessage> PARSER;

  public static com.google.protobuf.Parser<AssistantMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


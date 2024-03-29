// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * Protobuf type {@code sensory.api.v1.assistant.TextChatRequest}
 */
public  final class TextChatRequest extends
    com.google.protobuf.GeneratedMessageLite<
        TextChatRequest, TextChatRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.TextChatRequest)
    TextChatRequestOrBuilder {
  private TextChatRequest() {
    modelName_ = "";
    messages_ = emptyProtobufList();
  }
  public static final int MODELNAME_FIELD_NUMBER = 1;
  private java.lang.String modelName_;
  /**
   * <code>string modelName = 1;</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    return modelName_;
  }
  /**
   * <code>string modelName = 1;</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelName_);
  }
  /**
   * <code>string modelName = 1;</code>
   * @param value The modelName to set.
   */
  private void setModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelName_ = value;
  }
  /**
   * <code>string modelName = 1;</code>
   */
  private void clearModelName() {

    modelName_ = getDefaultInstance().getModelName();
  }
  /**
   * <code>string modelName = 1;</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();

  }

  public static final int MESSAGES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.assistant.ChatMessage> messages_;
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.assistant.ChatMessage> getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  public java.util.List<? extends ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  @java.lang.Override
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.ChatMessage getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  public ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
  }
  private void ensureMessagesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.assistant.ChatMessage> tmp = messages_;
    if (!tmp.isModifiable()) {
      messages_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void setMessages(
      int index, ai.sensorycloud.api.v1.assistant.ChatMessage value) {
    value.getClass();
  ensureMessagesIsMutable();
    messages_.set(index, value);
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void addMessages(ai.sensorycloud.api.v1.assistant.ChatMessage value) {
    value.getClass();
  ensureMessagesIsMutable();
    messages_.add(value);
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void addMessages(
      int index, ai.sensorycloud.api.v1.assistant.ChatMessage value) {
    value.getClass();
  ensureMessagesIsMutable();
    messages_.add(index, value);
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void addAllMessages(
      java.lang.Iterable<? extends ai.sensorycloud.api.v1.assistant.ChatMessage> values) {
    ensureMessagesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, messages_);
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void clearMessages() {
    messages_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
   */
  private void removeMessages(int index) {
    ensureMessagesIsMutable();
    messages_.remove(index);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.TextChatRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.TextChatRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.assistant.TextChatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.assistant.TextChatRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.TextChatRequest)
      ai.sensorycloud.api.v1.assistant.TextChatRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.assistant.TextChatRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string modelName = 1;</code>
     * @return The modelName.
     */
    @java.lang.Override
    public java.lang.String getModelName() {
      return instance.getModelName();
    }
    /**
     * <code>string modelName = 1;</code>
     * @return The bytes for modelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      return instance.getModelNameBytes();
    }
    /**
     * <code>string modelName = 1;</code>
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
     * <code>string modelName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      copyOnWrite();
      instance.clearModelName();
      return this;
    }
    /**
     * <code>string modelName = 1;</code>
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
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    @java.lang.Override
    public java.util.List<ai.sensorycloud.api.v1.assistant.ChatMessage> getMessagesList() {
      return java.util.Collections.unmodifiableList(
          instance.getMessagesList());
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    @java.lang.Override
    public int getMessagesCount() {
      return instance.getMessagesCount();
    }/**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.ChatMessage getMessages(int index) {
      return instance.getMessages(index);
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, ai.sensorycloud.api.v1.assistant.ChatMessage value) {
      copyOnWrite();
      instance.setMessages(index, value);
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, ai.sensorycloud.api.v1.assistant.ChatMessage.Builder builderForValue) {
      copyOnWrite();
      instance.setMessages(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(ai.sensorycloud.api.v1.assistant.ChatMessage value) {
      copyOnWrite();
      instance.addMessages(value);
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, ai.sensorycloud.api.v1.assistant.ChatMessage value) {
      copyOnWrite();
      instance.addMessages(index, value);
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        ai.sensorycloud.api.v1.assistant.ChatMessage.Builder builderForValue) {
      copyOnWrite();
      instance.addMessages(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, ai.sensorycloud.api.v1.assistant.ChatMessage.Builder builderForValue) {
      copyOnWrite();
      instance.addMessages(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.assistant.ChatMessage> values) {
      copyOnWrite();
      instance.addAllMessages(values);
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder clearMessages() {
      copyOnWrite();
      instance.clearMessages();
      return this;
    }
    /**
     * <code>repeated .sensory.api.v1.assistant.ChatMessage messages = 2;</code>
     */
    public Builder removeMessages(int index) {
      copyOnWrite();
      instance.removeMessages(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.TextChatRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.assistant.TextChatRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "modelName_",
            "messages_",
            ai.sensorycloud.api.v1.assistant.ChatMessage.class,
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.assistant.TextChatRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.assistant.TextChatRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.assistant.TextChatRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.TextChatRequest)
  private static final ai.sensorycloud.api.v1.assistant.TextChatRequest DEFAULT_INSTANCE;
  static {
    TextChatRequest defaultInstance = new TextChatRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TextChatRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.assistant.TextChatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TextChatRequest> PARSER;

  public static com.google.protobuf.Parser<TextChatRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

/**
 * Protobuf type {@code sensory.api.v1.assistant.ChatMessage}
 */
public  final class ChatMessage extends
    com.google.protobuf.GeneratedMessageLite<
        ChatMessage, ChatMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.assistant.ChatMessage)
    ChatMessageOrBuilder {
  private ChatMessage() {
    content_ = "";
  }
  public static final int ROLE_FIELD_NUMBER = 1;
  private int role_;
  /**
   * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
   * @return The role.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.assistant.ChatRole getRole() {
    ai.sensorycloud.api.v1.assistant.ChatRole result = ai.sensorycloud.api.v1.assistant.ChatRole.forNumber(role_);
    return result == null ? ai.sensorycloud.api.v1.assistant.ChatRole.UNRECOGNIZED : result;
  }
  /**
   * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
   * @param value The enum numeric value on the wire for role to set.
   */
  private void setRoleValue(int value) {
      role_ = value;
  }
  /**
   * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
   * @param value The role to set.
   */
  private void setRole(ai.sensorycloud.api.v1.assistant.ChatRole value) {
    role_ = value.getNumber();

  }
  /**
   * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
   */
  private void clearRole() {

    role_ = 0;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private java.lang.String content_;
  /**
   * <code>string content = 2;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    return content_;
  }
  /**
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(content_);
  }
  /**
   * <code>string content = 2;</code>
   * @param value The content to set.
   */
  private void setContent(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    content_ = value;
  }
  /**
   * <code>string content = 2;</code>
   */
  private void clearContent() {

    content_ = getDefaultInstance().getContent();
  }
  /**
   * <code>string content = 2;</code>
   * @param value The bytes for content to set.
   */
  private void setContentBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    content_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.assistant.ChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.assistant.ChatMessage prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.assistant.ChatMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.assistant.ChatMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.assistant.ChatMessage)
      ai.sensorycloud.api.v1.assistant.ChatMessageOrBuilder {
    // Construct using ai.sensorycloud.api.v1.assistant.ChatMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override
    public int getRoleValue() {
      return instance.getRoleValue();
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      copyOnWrite();
      instance.setRoleValue(value);
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
     * @return The role.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.assistant.ChatRole getRole() {
      return instance.getRole();
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(ai.sensorycloud.api.v1.assistant.ChatRole value) {
      copyOnWrite();
      instance.setRole(value);
      return this;
    }
    /**
     * <code>.sensory.api.v1.assistant.ChatRole role = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      copyOnWrite();
      instance.clearRole();
      return this;
    }

    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      return instance.getContent();
    }
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      return instance.getContentBytes();
    }
    /**
     * <code>string content = 2;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      copyOnWrite();
      instance.setContent(value);
      return this;
    }
    /**
     * <code>string content = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      copyOnWrite();
      instance.clearContent();
      return this;
    }
    /**
     * <code>string content = 2;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setContentBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.assistant.ChatMessage)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.assistant.ChatMessage();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "role_",
            "content_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.assistant.ChatMessage> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.assistant.ChatMessage.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.assistant.ChatMessage>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.assistant.ChatMessage)
  private static final ai.sensorycloud.api.v1.assistant.ChatMessage DEFAULT_INSTANCE;
  static {
    ChatMessage defaultInstance = new ChatMessage();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ChatMessage.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.assistant.ChatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ChatMessage> PARSER;

  public static com.google.protobuf.Parser<ChatMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

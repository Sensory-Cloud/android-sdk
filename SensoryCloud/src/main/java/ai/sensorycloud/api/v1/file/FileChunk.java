// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

/**
 * <pre>
 * A chunk of a downloaded file
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.file.FileChunk}
 */
public  final class FileChunk extends
    com.google.protobuf.GeneratedMessageLite<
        FileChunk, FileChunk.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.file.FileChunk)
    FileChunkOrBuilder {
  private FileChunk() {
    bytes_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int BYTES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString bytes_;
  /**
   * <pre>
   * The bytes to be sent to the
   * </pre>
   *
   * <code>bytes bytes = 1;</code>
   * @return The bytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBytes() {
    return bytes_;
  }
  /**
   * <pre>
   * The bytes to be sent to the
   * </pre>
   *
   * <code>bytes bytes = 1;</code>
   * @param value The bytes to set.
   */
  private void setBytes(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    bytes_ = value;
  }
  /**
   * <pre>
   * The bytes to be sent to the
   * </pre>
   *
   * <code>bytes bytes = 1;</code>
   */
  private void clearBytes() {
    
    bytes_ = getDefaultInstance().getBytes();
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private long offset_;
  /**
   * <pre>
   * The offset value based on the number of bytes currently written
   * </pre>
   *
   * <code>int64 offset = 2;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }
  /**
   * <pre>
   * The offset value based on the number of bytes currently written
   * </pre>
   *
   * <code>int64 offset = 2;</code>
   * @param value The offset to set.
   */
  private void setOffset(long value) {
    
    offset_ = value;
  }
  /**
   * <pre>
   * The offset value based on the number of bytes currently written
   * </pre>
   *
   * <code>int64 offset = 2;</code>
   */
  private void clearOffset() {
    
    offset_ = 0L;
  }

  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.file.FileChunk parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.file.FileChunk prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A chunk of a downloaded file
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.file.FileChunk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.file.FileChunk, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.file.FileChunk)
      ai.sensorycloud.api.v1.file.FileChunkOrBuilder {
    // Construct using ai.sensorycloud.api.v1.file.FileChunk.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The bytes to be sent to the
     * </pre>
     *
     * <code>bytes bytes = 1;</code>
     * @return The bytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBytes() {
      return instance.getBytes();
    }
    /**
     * <pre>
     * The bytes to be sent to the
     * </pre>
     *
     * <code>bytes bytes = 1;</code>
     * @param value The bytes to set.
     * @return This builder for chaining.
     */
    public Builder setBytes(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBytes(value);
      return this;
    }
    /**
     * <pre>
     * The bytes to be sent to the
     * </pre>
     *
     * <code>bytes bytes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBytes() {
      copyOnWrite();
      instance.clearBytes();
      return this;
    }

    /**
     * <pre>
     * The offset value based on the number of bytes currently written
     * </pre>
     *
     * <code>int64 offset = 2;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return instance.getOffset();
    }
    /**
     * <pre>
     * The offset value based on the number of bytes currently written
     * </pre>
     *
     * <code>int64 offset = 2;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {
      copyOnWrite();
      instance.setOffset(value);
      return this;
    }
    /**
     * <pre>
     * The offset value based on the number of bytes currently written
     * </pre>
     *
     * <code>int64 offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      copyOnWrite();
      instance.clearOffset();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.file.FileChunk)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.file.FileChunk();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bytes_",
            "offset_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.file.FileChunk> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.file.FileChunk.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.file.FileChunk>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.file.FileChunk)
  private static final ai.sensorycloud.api.v1.file.FileChunk DEFAULT_INSTANCE;
  static {
    FileChunk defaultInstance = new FileChunk();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FileChunk.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.file.FileChunk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FileChunk> PARSER;

  public static com.google.protobuf.Parser<FileChunk> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


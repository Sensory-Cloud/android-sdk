// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * A summary of memory usage
 * </pre>
 *
 * Protobuf type {@code sensory.api.common.MemorySummary}
 */
public  final class MemorySummary extends
    com.google.protobuf.GeneratedMessageLite<
        MemorySummary, MemorySummary.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.common.MemorySummary)
    MemorySummaryOrBuilder {
  private MemorySummary() {
  }
  public static final int MEMTOTAL_FIELD_NUMBER = 1;
  private long memTotal_;
  /**
   * <pre>
   * total memory in use
   * </pre>
   *
   * <code>uint64 memTotal = 1;</code>
   * @return The memTotal.
   */
  @java.lang.Override
  public long getMemTotal() {
    return memTotal_;
  }
  /**
   * <pre>
   * total memory in use
   * </pre>
   *
   * <code>uint64 memTotal = 1;</code>
   * @param value The memTotal to set.
   */
  private void setMemTotal(long value) {
    
    memTotal_ = value;
  }
  /**
   * <pre>
   * total memory in use
   * </pre>
   *
   * <code>uint64 memTotal = 1;</code>
   */
  private void clearMemTotal() {
    
    memTotal_ = 0L;
  }

  public static final int MEMFREE_FIELD_NUMBER = 2;
  private long memFree_;
  /**
   * <pre>
   * total memory free
   * </pre>
   *
   * <code>uint64 memFree = 2;</code>
   * @return The memFree.
   */
  @java.lang.Override
  public long getMemFree() {
    return memFree_;
  }
  /**
   * <pre>
   * total memory free
   * </pre>
   *
   * <code>uint64 memFree = 2;</code>
   * @param value The memFree to set.
   */
  private void setMemFree(long value) {
    
    memFree_ = value;
  }
  /**
   * <pre>
   * total memory free
   * </pre>
   *
   * <code>uint64 memFree = 2;</code>
   */
  private void clearMemFree() {
    
    memFree_ = 0L;
  }

  public static final int MEMAVAILABLE_FIELD_NUMBER = 3;
  private long memAvailable_;
  /**
   * <pre>
   * total memory available by the system
   * </pre>
   *
   * <code>uint64 memAvailable = 3;</code>
   * @return The memAvailable.
   */
  @java.lang.Override
  public long getMemAvailable() {
    return memAvailable_;
  }
  /**
   * <pre>
   * total memory available by the system
   * </pre>
   *
   * <code>uint64 memAvailable = 3;</code>
   * @param value The memAvailable to set.
   */
  private void setMemAvailable(long value) {
    
    memAvailable_ = value;
  }
  /**
   * <pre>
   * total memory available by the system
   * </pre>
   *
   * <code>uint64 memAvailable = 3;</code>
   */
  private void clearMemAvailable() {
    
    memAvailable_ = 0L;
  }

  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.common.MemorySummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.common.MemorySummary prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A summary of memory usage
   * </pre>
   *
   * Protobuf type {@code sensory.api.common.MemorySummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.common.MemorySummary, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.common.MemorySummary)
      ai.sensorycloud.api.common.MemorySummaryOrBuilder {
    // Construct using ai.sensorycloud.api.common.MemorySummary.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @return The memTotal.
     */
    @java.lang.Override
    public long getMemTotal() {
      return instance.getMemTotal();
    }
    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @param value The memTotal to set.
     * @return This builder for chaining.
     */
    public Builder setMemTotal(long value) {
      copyOnWrite();
      instance.setMemTotal(value);
      return this;
    }
    /**
     * <pre>
     * total memory in use
     * </pre>
     *
     * <code>uint64 memTotal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemTotal() {
      copyOnWrite();
      instance.clearMemTotal();
      return this;
    }

    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @return The memFree.
     */
    @java.lang.Override
    public long getMemFree() {
      return instance.getMemFree();
    }
    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @param value The memFree to set.
     * @return This builder for chaining.
     */
    public Builder setMemFree(long value) {
      copyOnWrite();
      instance.setMemFree(value);
      return this;
    }
    /**
     * <pre>
     * total memory free
     * </pre>
     *
     * <code>uint64 memFree = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemFree() {
      copyOnWrite();
      instance.clearMemFree();
      return this;
    }

    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @return The memAvailable.
     */
    @java.lang.Override
    public long getMemAvailable() {
      return instance.getMemAvailable();
    }
    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @param value The memAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setMemAvailable(long value) {
      copyOnWrite();
      instance.setMemAvailable(value);
      return this;
    }
    /**
     * <pre>
     * total memory available by the system
     * </pre>
     *
     * <code>uint64 memAvailable = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemAvailable() {
      copyOnWrite();
      instance.clearMemAvailable();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.common.MemorySummary)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.common.MemorySummary();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "memTotal_",
            "memFree_",
            "memAvailable_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0003" +
              "\u0003\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.common.MemorySummary> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.common.MemorySummary.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.common.MemorySummary>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.common.MemorySummary)
  private static final ai.sensorycloud.api.common.MemorySummary DEFAULT_INSTANCE;
  static {
    MemorySummary defaultInstance = new MemorySummary();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MemorySummary.class, defaultInstance);
  }

  public static ai.sensorycloud.api.common.MemorySummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MemorySummary> PARSER;

  public static com.google.protobuf.Parser<MemorySummary> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

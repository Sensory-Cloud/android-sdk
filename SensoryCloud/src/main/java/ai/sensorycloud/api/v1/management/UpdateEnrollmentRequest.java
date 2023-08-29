// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * A request to update the description of an enrollment
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.UpdateEnrollmentRequest}
 */
public  final class UpdateEnrollmentRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UpdateEnrollmentRequest, UpdateEnrollmentRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.UpdateEnrollmentRequest)
    UpdateEnrollmentRequestOrBuilder {
  private UpdateEnrollmentRequest() {
    id_ = "";
    description_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * The enrollment ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * The enrollment ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * The enrollment ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * The enrollment ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearId() {

    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * The enrollment ID
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();

  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private java.lang.String description_;
  /**
   * <pre>
   * New description of the enrollment
   * </pre>
   *
   * <code>string description = 2 [(.validate.rules) = { ... }</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * New description of the enrollment
   * </pre>
   *
   * <code>string description = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * New description of the enrollment
   * </pre>
   *
   * <code>string description = 2 [(.validate.rules) = { ... }</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <pre>
   * New description of the enrollment
   * </pre>
   *
   * <code>string description = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearDescription() {

    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * New description of the enrollment
   * </pre>
   *
   * <code>string description = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A request to update the description of an enrollment
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.UpdateEnrollmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.UpdateEnrollmentRequest)
      ai.sensorycloud.api.v1.management.UpdateEnrollmentRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The enrollment ID
     * </pre>
     *
     * <code>string id = 1 [(.validate.rules) = { ... }</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * The enrollment ID
     * </pre>
     *
     * <code>string id = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * The enrollment ID
     * </pre>
     *
     * <code>string id = 1 [(.validate.rules) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * The enrollment ID
     * </pre>
     *
     * <code>string id = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * The enrollment ID
     * </pre>
     *
     * <code>string id = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * New description of the enrollment
     * </pre>
     *
     * <code>string description = 2 [(.validate.rules) = { ... }</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * New description of the enrollment
     * </pre>
     *
     * <code>string description = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * New description of the enrollment
     * </pre>
     *
     * <code>string description = 2 [(.validate.rules) = { ... }</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <pre>
     * New description of the enrollment
     * </pre>
     *
     * <code>string description = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * New description of the enrollment
     * </pre>
     *
     * <code>string description = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.UpdateEnrollmentRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "description_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.UpdateEnrollmentRequest)
  private static final ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest DEFAULT_INSTANCE;
  static {
    UpdateEnrollmentRequest defaultInstance = new UpdateEnrollmentRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UpdateEnrollmentRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpdateEnrollmentRequest> PARSER;

  public static com.google.protobuf.Parser<UpdateEnrollmentRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


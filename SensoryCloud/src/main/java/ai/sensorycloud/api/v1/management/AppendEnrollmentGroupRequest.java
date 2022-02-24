// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * Request to append additional enrollments to an enrollment group
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.AppendEnrollmentGroupRequest}
 */
public  final class AppendEnrollmentGroupRequest extends
    com.google.protobuf.GeneratedMessageLite<
        AppendEnrollmentGroupRequest, AppendEnrollmentGroupRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.AppendEnrollmentGroupRequest)
    AppendEnrollmentGroupRequestOrBuilder {
  private AppendEnrollmentGroupRequest() {
    groupId_ = "";
    enrollmentIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int GROUPID_FIELD_NUMBER = 1;
  private java.lang.String groupId_;
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    return groupId_;
  }
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
  }
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @param value The groupId to set.
   */
  private void setGroupId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    groupId_ = value;
  }
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearGroupId() {
    
    groupId_ = getDefaultInstance().getGroupId();
  }
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for groupId to set.
   */
  private void setGroupIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    groupId_ = value.toStringUtf8();
    
  }

  public static final int ENROLLMENTIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> enrollmentIds_;
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @return A list containing the enrollmentIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getEnrollmentIdsList() {
    return enrollmentIds_;
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @return The count of enrollmentIds.
   */
  @java.lang.Override
  public int getEnrollmentIdsCount() {
    return enrollmentIds_.size();
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param index The index of the element to return.
   * @return The enrollmentIds at the given index.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentIds(int index) {
    return enrollmentIds_.get(index);
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enrollmentIds at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentIdsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        enrollmentIds_.get(index));
  }
  private void ensureEnrollmentIdsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        enrollmentIds_;  if (!tmp.isModifiable()) {
      enrollmentIds_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param index The index to set the value at.
   * @param value The enrollmentIds to set.
   */
  private void setEnrollmentIds(
      int index, java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureEnrollmentIdsIsMutable();
    enrollmentIds_.set(index, value);
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param value The enrollmentIds to add.
   */
  private void addEnrollmentIds(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureEnrollmentIdsIsMutable();
    enrollmentIds_.add(value);
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param values The enrollmentIds to add.
   */
  private void addAllEnrollmentIds(
      java.lang.Iterable<java.lang.String> values) {
    ensureEnrollmentIdsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, enrollmentIds_);
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   */
  private void clearEnrollmentIds() {
    enrollmentIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param value The bytes of the enrollmentIds to add.
   */
  private void addEnrollmentIdsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensureEnrollmentIdsIsMutable();
    enrollmentIds_.add(value.toStringUtf8());
  }

  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to append additional enrollments to an enrollment group
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.AppendEnrollmentGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.AppendEnrollmentGroupRequest)
      ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return The groupId.
     */
    @java.lang.Override
    public java.lang.String getGroupId() {
      return instance.getGroupId();
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for groupId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return instance.getGroupIdBytes();
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(
        java.lang.String value) {
      copyOnWrite();
      instance.setGroupId(value);
      return this;
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      copyOnWrite();
      instance.clearGroupId();
      return this;
    }
    /**
     * <pre>
     * Enrollment group ID to append enrollments to
     * </pre>
     *
     * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGroupIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @return A list containing the enrollmentIds.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getEnrollmentIdsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEnrollmentIdsList());
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @return The count of enrollmentIds.
     */
    @java.lang.Override
    public int getEnrollmentIdsCount() {
      return instance.getEnrollmentIdsCount();
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param index The index of the element to return.
     * @return The enrollmentIds at the given index.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentIds(int index) {
      return instance.getEnrollmentIds(index);
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the enrollmentIds at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnrollmentIdsBytes(int index) {
      return instance.getEnrollmentIdsBytes(index);
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param index The index to set the value at.
     * @param value The enrollmentIds to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentIds(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setEnrollmentIds(index, value);
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param value The enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnrollmentIds(
        java.lang.String value) {
      copyOnWrite();
      instance.addEnrollmentIds(value);
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param values The enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnrollmentIds(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllEnrollmentIds(values);
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentIds() {
      copyOnWrite();
      instance.clearEnrollmentIds();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDS to append
     * </pre>
     *
     * <code>repeated string enrollmentIds = 2;</code>
     * @param value The bytes of the enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnrollmentIdsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addEnrollmentIdsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.AppendEnrollmentGroupRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "groupId_",
            "enrollmentIds_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.AppendEnrollmentGroupRequest)
  private static final ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest DEFAULT_INSTANCE;
  static {
    AppendEnrollmentGroupRequest defaultInstance = new AppendEnrollmentGroupRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AppendEnrollmentGroupRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AppendEnrollmentGroupRequest> PARSER;

  public static com.google.protobuf.Parser<AppendEnrollmentGroupRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


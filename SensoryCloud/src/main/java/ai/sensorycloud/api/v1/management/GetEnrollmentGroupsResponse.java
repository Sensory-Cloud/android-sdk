// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * A response containing a list of enrollment groups
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.GetEnrollmentGroupsResponse}
 */
public  final class GetEnrollmentGroupsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetEnrollmentGroupsResponse, GetEnrollmentGroupsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.GetEnrollmentGroupsResponse)
    GetEnrollmentGroupsResponseOrBuilder {
  private GetEnrollmentGroupsResponse() {
    enrollmentGroups_ = emptyProtobufList();
  }
  public static final int ENROLLMENTGROUPS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> enrollmentGroups_;
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getEnrollmentGroupsList() {
    return enrollmentGroups_;
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  public java.util.List<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder> 
      getEnrollmentGroupsOrBuilderList() {
    return enrollmentGroups_;
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public int getEnrollmentGroupsCount() {
    return enrollmentGroups_.size();
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse getEnrollmentGroups(int index) {
    return enrollmentGroups_.get(index);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  public ai.sensorycloud.api.v1.management.EnrollmentGroupResponseOrBuilder getEnrollmentGroupsOrBuilder(
      int index) {
    return enrollmentGroups_.get(index);
  }
  private void ensureEnrollmentGroupsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> tmp = enrollmentGroups_;
    if (!tmp.isModifiable()) {
      enrollmentGroups_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void setEnrollmentGroups(
      int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
    value.getClass();
  ensureEnrollmentGroupsIsMutable();
    enrollmentGroups_.set(index, value);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void addEnrollmentGroups(ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
    value.getClass();
  ensureEnrollmentGroupsIsMutable();
    enrollmentGroups_.add(value);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void addEnrollmentGroups(
      int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
    value.getClass();
  ensureEnrollmentGroupsIsMutable();
    enrollmentGroups_.add(index, value);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void addAllEnrollmentGroups(
      java.lang.Iterable<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> values) {
    ensureEnrollmentGroupsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, enrollmentGroups_);
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void clearEnrollmentGroups() {
    enrollmentGroups_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A list of enrollment groups
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
   */
  private void removeEnrollmentGroups(int index) {
    ensureEnrollmentGroupsIsMutable();
    enrollmentGroups_.remove(index);
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A response containing a list of enrollment groups
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.GetEnrollmentGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.GetEnrollmentGroupsResponse)
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponseOrBuilder {
    // Construct using ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    @java.lang.Override
    public java.util.List<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getEnrollmentGroupsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEnrollmentGroupsList());
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    @java.lang.Override
    public int getEnrollmentGroupsCount() {
      return instance.getEnrollmentGroupsCount();
    }/**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse getEnrollmentGroups(int index) {
      return instance.getEnrollmentGroups(index);
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder setEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      copyOnWrite();
      instance.setEnrollmentGroups(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder setEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setEnrollmentGroups(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      copyOnWrite();
      instance.addEnrollmentGroups(value);
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse value) {
      copyOnWrite();
      instance.addEnrollmentGroups(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      copyOnWrite();
      instance.addEnrollmentGroups(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addEnrollmentGroups(
        int index, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.Builder builderForValue) {
      copyOnWrite();
      instance.addEnrollmentGroups(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder addAllEnrollmentGroups(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> values) {
      copyOnWrite();
      instance.addAllEnrollmentGroups(values);
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder clearEnrollmentGroups() {
      copyOnWrite();
      instance.clearEnrollmentGroups();
      return this;
    }
    /**
     * <pre>
     * A list of enrollment groups
     * </pre>
     *
     * <code>repeated .sensory.api.v1.management.EnrollmentGroupResponse enrollmentGroups = 1;</code>
     */
    public Builder removeEnrollmentGroups(int index) {
      copyOnWrite();
      instance.removeEnrollmentGroups(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.GetEnrollmentGroupsResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "enrollmentGroups_",
            ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.GetEnrollmentGroupsResponse)
  private static final ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse DEFAULT_INSTANCE;
  static {
    GetEnrollmentGroupsResponse defaultInstance = new GetEnrollmentGroupsResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetEnrollmentGroupsResponse.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetEnrollmentGroupsResponse> PARSER;

  public static com.google.protobuf.Parser<GetEnrollmentGroupsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

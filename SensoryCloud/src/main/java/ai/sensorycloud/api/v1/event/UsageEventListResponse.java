// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

/**
 * Protobuf type {@code sensory.api.v1.event.UsageEventListResponse}
 */
public  final class UsageEventListResponse extends
    com.google.protobuf.GeneratedMessageLite<
        UsageEventListResponse, UsageEventListResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.event.UsageEventListResponse)
    UsageEventListResponseOrBuilder {
  private UsageEventListResponse() {
    events_ = emptyProtobufList();
  }
  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.event.UsageEventResponse> events_;
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.event.UsageEventResponse> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  public java.util.List<? extends ai.sensorycloud.api.v1.event.UsageEventResponseOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.event.UsageEventResponse getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  public ai.sensorycloud.api.v1.event.UsageEventResponseOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }
  private void ensureEventsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.event.UsageEventResponse> tmp = events_;
    if (!tmp.isModifiable()) {
      events_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void setEvents(
      int index, ai.sensorycloud.api.v1.event.UsageEventResponse value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.set(index, value);
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void addEvents(ai.sensorycloud.api.v1.event.UsageEventResponse value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(value);
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void addEvents(
      int index, ai.sensorycloud.api.v1.event.UsageEventResponse value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(index, value);
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void addAllEvents(
      java.lang.Iterable<? extends ai.sensorycloud.api.v1.event.UsageEventResponse> values) {
    ensureEventsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, events_);
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void clearEvents() {
    events_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A list of usage events
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
   */
  private void removeEvents(int index) {
    ensureEventsIsMutable();
    events_.remove(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private ai.sensorycloud.api.common.PaginationResponse pagination_;
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.PaginationResponse getPagination() {
    return pagination_ == null ? ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  private void setPagination(ai.sensorycloud.api.common.PaginationResponse value) {
    value.getClass();
  pagination_ = value;
    
    }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergePagination(ai.sensorycloud.api.common.PaginationResponse value) {
    value.getClass();
  if (pagination_ != null &&
        pagination_ != ai.sensorycloud.api.common.PaginationResponse.getDefaultInstance()) {
      pagination_ =
        ai.sensorycloud.api.common.PaginationResponse.newBuilder(pagination_).mergeFrom(value).buildPartial();
    } else {
      pagination_ = value;
    }
    
  }
  /**
   * <pre>
   * Metadata about how the response has been paginated
   * </pre>
   *
   * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
   */
  private void clearPagination() {  pagination_ = null;
    
  }

  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.event.UsageEventListResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.event.UsageEventListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.event.UsageEventListResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.event.UsageEventListResponse)
      ai.sensorycloud.api.v1.event.UsageEventListResponseOrBuilder {
    // Construct using ai.sensorycloud.api.v1.event.UsageEventListResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    @java.lang.Override
    public java.util.List<ai.sensorycloud.api.v1.event.UsageEventResponse> getEventsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEventsList());
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    @java.lang.Override
    public int getEventsCount() {
      return instance.getEventsCount();
    }/**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.event.UsageEventResponse getEvents(int index) {
      return instance.getEvents(index);
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEventResponse value) {
      copyOnWrite();
      instance.setEvents(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEventResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder addEvents(ai.sensorycloud.api.v1.event.UsageEventResponse value) {
      copyOnWrite();
      instance.addEvents(value);
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEventResponse value) {
      copyOnWrite();
      instance.addEvents(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder addEvents(
        ai.sensorycloud.api.v1.event.UsageEventResponse.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEventResponse.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.event.UsageEventResponse> values) {
      copyOnWrite();
      instance.addAllEvents(values);
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder clearEvents() {
      copyOnWrite();
      instance.clearEvents();
      return this;
    }
    /**
     * <pre>
     * A list of usage events
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEventResponse events = 1;</code>
     */
    public Builder removeEvents(int index) {
      copyOnWrite();
      instance.removeEvents(index);
      return this;
    }

    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    @java.lang.Override
    public boolean hasPagination() {
      return instance.hasPagination();
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.PaginationResponse getPagination() {
      return instance.getPagination();
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder setPagination(ai.sensorycloud.api.common.PaginationResponse value) {
      copyOnWrite();
      instance.setPagination(value);
      return this;
      }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder setPagination(
        ai.sensorycloud.api.common.PaginationResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setPagination(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder mergePagination(ai.sensorycloud.api.common.PaginationResponse value) {
      copyOnWrite();
      instance.mergePagination(value);
      return this;
    }
    /**
     * <pre>
     * Metadata about how the response has been paginated
     * </pre>
     *
     * <code>.sensory.api.common.PaginationResponse pagination = 2;</code>
     */
    public Builder clearPagination() {  copyOnWrite();
      instance.clearPagination();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.event.UsageEventListResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.event.UsageEventListResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "events_",
            ai.sensorycloud.api.v1.event.UsageEventResponse.class,
            "pagination_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.event.UsageEventListResponse> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.event.UsageEventListResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.event.UsageEventListResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.event.UsageEventListResponse)
  private static final ai.sensorycloud.api.v1.event.UsageEventListResponse DEFAULT_INSTANCE;
  static {
    UsageEventListResponse defaultInstance = new UsageEventListResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UsageEventListResponse.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.event.UsageEventListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UsageEventListResponse> PARSER;

  public static com.google.protobuf.Parser<UsageEventListResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


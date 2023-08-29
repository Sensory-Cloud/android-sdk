// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

/**
 * <pre>
 * Request to create a new usage event
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.event.PublishUsageEventsRequest}
 */
public  final class PublishUsageEventsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        PublishUsageEventsRequest, PublishUsageEventsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.event.PublishUsageEventsRequest)
    PublishUsageEventsRequestOrBuilder {
  private PublishUsageEventsRequest() {
    events_ = emptyProtobufList();
  }
  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.event.UsageEvent> events_;
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  public java.util.List<? extends ai.sensorycloud.api.v1.event.UsageEventOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.event.UsageEvent getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  public ai.sensorycloud.api.v1.event.UsageEventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }
  private void ensureEventsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<ai.sensorycloud.api.v1.event.UsageEvent> tmp = events_;
    if (!tmp.isModifiable()) {
      events_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void setEvents(
      int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.set(index, value);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void addEvents(ai.sensorycloud.api.v1.event.UsageEvent value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(value);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void addEvents(
      int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
    value.getClass();
  ensureEventsIsMutable();
    events_.add(index, value);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void addAllEvents(
      java.lang.Iterable<? extends ai.sensorycloud.api.v1.event.UsageEvent> values) {
    ensureEventsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, events_);
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void clearEvents() {
    events_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A list of events to publish
   * </pre>
   *
   * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
   */
  private void removeEvents(int index) {
    ensureEventsIsMutable();
    events_.remove(index);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.event.PublishUsageEventsRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to create a new usage event
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.event.PublishUsageEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.event.PublishUsageEventsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.event.PublishUsageEventsRequest)
      ai.sensorycloud.api.v1.event.PublishUsageEventsRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    @java.lang.Override
    public java.util.List<ai.sensorycloud.api.v1.event.UsageEvent> getEventsList() {
      return java.util.Collections.unmodifiableList(
          instance.getEventsList());
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    @java.lang.Override
    public int getEventsCount() {
      return instance.getEventsCount();
    }/**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.event.UsageEvent getEvents(int index) {
      return instance.getEvents(index);
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
      copyOnWrite();
      instance.setEvents(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      copyOnWrite();
      instance.setEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(ai.sensorycloud.api.v1.event.UsageEvent value) {
      copyOnWrite();
      instance.addEvents(value);
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent value) {
      copyOnWrite();
      instance.addEvents(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ai.sensorycloud.api.v1.event.UsageEvent.Builder builderForValue) {
      copyOnWrite();
      instance.addEvents(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends ai.sensorycloud.api.v1.event.UsageEvent> values) {
      copyOnWrite();
      instance.addAllEvents(values);
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder clearEvents() {
      copyOnWrite();
      instance.clearEvents();
      return this;
    }
    /**
     * <pre>
     * A list of events to publish
     * </pre>
     *
     * <code>repeated .sensory.api.v1.event.UsageEvent events = 1;</code>
     */
    public Builder removeEvents(int index) {
      copyOnWrite();
      instance.removeEvents(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.event.PublishUsageEventsRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.event.PublishUsageEventsRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "events_",
            ai.sensorycloud.api.v1.event.UsageEvent.class,
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
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.event.PublishUsageEventsRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.event.PublishUsageEventsRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.event.PublishUsageEventsRequest)
  private static final ai.sensorycloud.api.v1.event.PublishUsageEventsRequest DEFAULT_INSTANCE;
  static {
    PublishUsageEventsRequest defaultInstance = new PublishUsageEventsRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PublishUsageEventsRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.event.PublishUsageEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PublishUsageEventsRequest> PARSER;

  public static com.google.protobuf.Parser<PublishUsageEventsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

/**
 * Protobuf type {@code sensory.api.v1.event.UsageEventModelSummary}
 */
public  final class UsageEventModelSummary extends
    com.google.protobuf.GeneratedMessageLite<
        UsageEventModelSummary, UsageEventModelSummary.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.event.UsageEventModelSummary)
    UsageEventModelSummaryOrBuilder {
  private UsageEventModelSummary() {
    units_ = "";
  }
  public static final int BILLABLEFUNCTION_FIELD_NUMBER = 1;
  private int billableFunction_;
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @return The enum numeric value on the wire for billableFunction.
   */
  @java.lang.Override
  public int getBillableFunctionValue() {
    return billableFunction_;
  }
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @return The billableFunction.
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.ModelType getBillableFunction() {
    ai.sensorycloud.api.common.ModelType result = ai.sensorycloud.api.common.ModelType.forNumber(billableFunction_);
    return result == null ? ai.sensorycloud.api.common.ModelType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @param value The enum numeric value on the wire for billableFunction to set.
   */
  private void setBillableFunctionValue(int value) {
      billableFunction_ = value;
  }
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   * @param value The billableFunction to set.
   */
  private void setBillableFunction(ai.sensorycloud.api.common.ModelType value) {
    billableFunction_ = value.getNumber();
    
  }
  /**
   * <pre>
   * Function of the model used
   * </pre>
   *
   * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
   */
  private void clearBillableFunction() {
    
    billableFunction_ = 0;
  }

  public static final int UNITS_FIELD_NUMBER = 2;
  private java.lang.String units_;
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @return The units.
   */
  @java.lang.Override
  public java.lang.String getUnits() {
    return units_;
  }
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @return The bytes for units.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnitsBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(units_);
  }
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @param value The units to set.
   */
  private void setUnits(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    units_ = value;
  }
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   */
  private void clearUnits() {
    
    units_ = getDefaultInstance().getUnits();
  }
  /**
   * <pre>
   * Units of measure for the summary value
   * </pre>
   *
   * <code>string units = 2;</code>
   * @param value The bytes for units to set.
   */
  private void setUnitsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    units_ = value.toStringUtf8();
    
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_;
  /**
   * <pre>
   * The value of the summary
   * </pre>
   *
   * <code>int64 value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }
  /**
   * <pre>
   * The value of the summary
   * </pre>
   *
   * <code>int64 value = 3;</code>
   * @param value The value to set.
   */
  private void setValue(long value) {
    
    value_ = value;
  }
  /**
   * <pre>
   * The value of the summary
   * </pre>
   *
   * <code>int64 value = 3;</code>
   */
  private void clearValue() {
    
    value_ = 0L;
  }

  public static final int COUNT_FIELD_NUMBER = 4;
  private long count_;
  /**
   * <pre>
   * The number of events included in the summary
   * </pre>
   *
   * <code>int64 count = 4;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
  }
  /**
   * <pre>
   * The number of events included in the summary
   * </pre>
   *
   * <code>int64 count = 4;</code>
   * @param value The count to set.
   */
  private void setCount(long value) {
    
    count_ = value;
  }
  /**
   * <pre>
   * The number of events included in the summary
   * </pre>
   *
   * <code>int64 count = 4;</code>
   */
  private void clearCount() {
    
    count_ = 0L;
  }

  public static final int CREDITS_FIELD_NUMBER = 5;
  private double credits_;
  /**
   * <pre>
   * Credits used by this event
   * </pre>
   *
   * <code>double credits = 5;</code>
   * @return The credits.
   */
  @java.lang.Override
  public double getCredits() {
    return credits_;
  }
  /**
   * <pre>
   * Credits used by this event
   * </pre>
   *
   * <code>double credits = 5;</code>
   * @param value The credits to set.
   */
  private void setCredits(double value) {
    
    credits_ = value;
  }
  /**
   * <pre>
   * Credits used by this event
   * </pre>
   *
   * <code>double credits = 5;</code>
   */
  private void clearCredits() {
    
    credits_ = 0D;
  }

  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.event.UsageEventModelSummary prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.event.UsageEventModelSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.event.UsageEventModelSummary, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.event.UsageEventModelSummary)
      ai.sensorycloud.api.v1.event.UsageEventModelSummaryOrBuilder {
    // Construct using ai.sensorycloud.api.v1.event.UsageEventModelSummary.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Function of the model used
     * </pre>
     *
     * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
     * @return The enum numeric value on the wire for billableFunction.
     */
    @java.lang.Override
    public int getBillableFunctionValue() {
      return instance.getBillableFunctionValue();
    }
    /**
     * <pre>
     * Function of the model used
     * </pre>
     *
     * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
     * @param value The billableFunction to set.
     * @return This builder for chaining.
     */
    public Builder setBillableFunctionValue(int value) {
      copyOnWrite();
      instance.setBillableFunctionValue(value);
      return this;
    }
    /**
     * <pre>
     * Function of the model used
     * </pre>
     *
     * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
     * @return The billableFunction.
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.ModelType getBillableFunction() {
      return instance.getBillableFunction();
    }
    /**
     * <pre>
     * Function of the model used
     * </pre>
     *
     * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
     * @param value The enum numeric value on the wire for billableFunction to set.
     * @return This builder for chaining.
     */
    public Builder setBillableFunction(ai.sensorycloud.api.common.ModelType value) {
      copyOnWrite();
      instance.setBillableFunction(value);
      return this;
    }
    /**
     * <pre>
     * Function of the model used
     * </pre>
     *
     * <code>.sensory.api.common.ModelType billableFunction = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBillableFunction() {
      copyOnWrite();
      instance.clearBillableFunction();
      return this;
    }

    /**
     * <pre>
     * Units of measure for the summary value
     * </pre>
     *
     * <code>string units = 2;</code>
     * @return The units.
     */
    @java.lang.Override
    public java.lang.String getUnits() {
      return instance.getUnits();
    }
    /**
     * <pre>
     * Units of measure for the summary value
     * </pre>
     *
     * <code>string units = 2;</code>
     * @return The bytes for units.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnitsBytes() {
      return instance.getUnitsBytes();
    }
    /**
     * <pre>
     * Units of measure for the summary value
     * </pre>
     *
     * <code>string units = 2;</code>
     * @param value The units to set.
     * @return This builder for chaining.
     */
    public Builder setUnits(
        java.lang.String value) {
      copyOnWrite();
      instance.setUnits(value);
      return this;
    }
    /**
     * <pre>
     * Units of measure for the summary value
     * </pre>
     *
     * <code>string units = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnits() {
      copyOnWrite();
      instance.clearUnits();
      return this;
    }
    /**
     * <pre>
     * Units of measure for the summary value
     * </pre>
     *
     * <code>string units = 2;</code>
     * @param value The bytes for units to set.
     * @return This builder for chaining.
     */
    public Builder setUnitsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUnitsBytes(value);
      return this;
    }

    /**
     * <pre>
     * The value of the summary
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The value of the summary
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The value of the summary
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }

    /**
     * <pre>
     * The number of events included in the summary
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return instance.getCount();
    }
    /**
     * <pre>
     * The number of events included in the summary
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {
      copyOnWrite();
      instance.setCount(value);
      return this;
    }
    /**
     * <pre>
     * The number of events included in the summary
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      copyOnWrite();
      instance.clearCount();
      return this;
    }

    /**
     * <pre>
     * Credits used by this event
     * </pre>
     *
     * <code>double credits = 5;</code>
     * @return The credits.
     */
    @java.lang.Override
    public double getCredits() {
      return instance.getCredits();
    }
    /**
     * <pre>
     * Credits used by this event
     * </pre>
     *
     * <code>double credits = 5;</code>
     * @param value The credits to set.
     * @return This builder for chaining.
     */
    public Builder setCredits(double value) {
      copyOnWrite();
      instance.setCredits(value);
      return this;
    }
    /**
     * <pre>
     * Credits used by this event
     * </pre>
     *
     * <code>double credits = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCredits() {
      copyOnWrite();
      instance.clearCredits();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.event.UsageEventModelSummary)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.event.UsageEventModelSummary();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "billableFunction_",
            "units_",
            "value_",
            "count_",
            "credits_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0208" +
              "\u0003\u0002\u0004\u0002\u0005\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.event.UsageEventModelSummary> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.event.UsageEventModelSummary.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.event.UsageEventModelSummary>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.event.UsageEventModelSummary)
  private static final ai.sensorycloud.api.v1.event.UsageEventModelSummary DEFAULT_INSTANCE;
  static {
    UsageEventModelSummary defaultInstance = new UsageEventModelSummary();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UsageEventModelSummary.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.event.UsageEventModelSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UsageEventModelSummary> PARSER;

  public static com.google.protobuf.Parser<UsageEventModelSummary> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

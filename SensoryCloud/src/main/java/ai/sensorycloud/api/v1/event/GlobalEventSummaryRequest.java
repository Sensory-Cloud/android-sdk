// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/event/event.proto

package ai.sensorycloud.api.v1.event;

/**
 * Protobuf type {@code sensory.api.v1.event.GlobalEventSummaryRequest}
 */
public  final class GlobalEventSummaryRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GlobalEventSummaryRequest, GlobalEventSummaryRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.event.GlobalEventSummaryRequest)
    GlobalEventSummaryRequestOrBuilder {
  private GlobalEventSummaryRequest() {
    tenants_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    billableFunctions_ = emptyIntList();
  }
  public static final int TENANTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> tenants_;
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @return A list containing the tenants.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getTenantsList() {
    return tenants_;
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @return The count of tenants.
   */
  @java.lang.Override
  public int getTenantsCount() {
    return tenants_.size();
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param index The index of the element to return.
   * @return The tenants at the given index.
   */
  @java.lang.Override
  public java.lang.String getTenants(int index) {
    return tenants_.get(index);
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tenants at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        tenants_.get(index));
  }
  private void ensureTenantsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        tenants_;  if (!tmp.isModifiable()) {
      tenants_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param index The index to set the value at.
   * @param value The tenants to set.
   */
  private void setTenants(
      int index, java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureTenantsIsMutable();
    tenants_.set(index, value);
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param value The tenants to add.
   */
  private void addTenants(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureTenantsIsMutable();
    tenants_.add(value);
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param values The tenants to add.
   */
  private void addAllTenants(
      java.lang.Iterable<java.lang.String> values) {
    ensureTenantsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, tenants_);
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   */
  private void clearTenants() {
    tenants_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * The list of tenants to return data for, If left empty all tenants will be included in the response
   * </pre>
   *
   * <code>repeated string tenants = 1;</code>
   * @param value The bytes of the tenants to add.
   */
  private void addTenantsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensureTenantsIsMutable();
    tenants_.add(value.toStringUtf8());
  }

  public static final int AFTER_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp after_;
  /**
   * <pre>
   * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp after = 2;</code>
   */
  @java.lang.Override
  public boolean hasAfter() {
    return after_ != null;
  }
  /**
   * <pre>
   * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp after = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAfter() {
    return after_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : after_;
  }
  /**
   * <pre>
   * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp after = 2;</code>
   */
  private void setAfter(com.google.protobuf.Timestamp value) {
    value.getClass();
  after_ = value;

    }
  /**
   * <pre>
   * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp after = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAfter(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (after_ != null &&
        after_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      after_ =
        com.google.protobuf.Timestamp.newBuilder(after_).mergeFrom(value).buildPartial();
    } else {
      after_ = value;
    }

  }
  /**
   * <pre>
   * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp after = 2;</code>
   */
  private void clearAfter() {  after_ = null;

  }

  public static final int BEFORE_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp before_;
  /**
   * <pre>
   * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before = 3;</code>
   */
  @java.lang.Override
  public boolean hasBefore() {
    return before_ != null;
  }
  /**
   * <pre>
   * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getBefore() {
    return before_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : before_;
  }
  /**
   * <pre>
   * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before = 3;</code>
   */
  private void setBefore(com.google.protobuf.Timestamp value) {
    value.getClass();
  before_ = value;

    }
  /**
   * <pre>
   * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeBefore(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (before_ != null &&
        before_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      before_ =
        com.google.protobuf.Timestamp.newBuilder(before_).mergeFrom(value).buildPartial();
    } else {
      before_ = value;
    }

  }
  /**
   * <pre>
   * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before = 3;</code>
   */
  private void clearBefore() {  before_ = null;

  }

  public static final int BILLABLEFUNCTIONS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList billableFunctions_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, ai.sensorycloud.api.common.ModelType> billableFunctions_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, ai.sensorycloud.api.common.ModelType>() {
            @java.lang.Override
            public ai.sensorycloud.api.common.ModelType convert(java.lang.Integer from) {
              ai.sensorycloud.api.common.ModelType result = ai.sensorycloud.api.common.ModelType.forNumber(from);
              return result == null ? ai.sensorycloud.api.common.ModelType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @return A list containing the billableFunctions.
   */
  @java.lang.Override
  public java.util.List<ai.sensorycloud.api.common.ModelType> getBillableFunctionsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, ai.sensorycloud.api.common.ModelType>(billableFunctions_, billableFunctions_converter_);
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @return The count of billableFunctions.
   */
  @java.lang.Override
  public int getBillableFunctionsCount() {
    return billableFunctions_.size();
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param index The index of the element to return.
   * @return The billableFunctions at the given index.
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.ModelType getBillableFunctions(int index) {
    ai.sensorycloud.api.common.ModelType result = ai.sensorycloud.api.common.ModelType.forNumber(billableFunctions_.getInt(index));
    return result == null ? ai.sensorycloud.api.common.ModelType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @return A list containing the enum numeric values on the wire for billableFunctions.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getBillableFunctionsValueList() {
    return billableFunctions_;
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of billableFunctions at the given index.
   */
  @java.lang.Override
  public int getBillableFunctionsValue(int index) {
    return billableFunctions_.getInt(index);
  }
  private int billableFunctionsMemoizedSerializedSize;
  private void ensureBillableFunctionsIsMutable() {
    com.google.protobuf.Internal.IntList tmp = billableFunctions_;
    if (!tmp.isModifiable()) {
      billableFunctions_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
    }
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param index The index to set the value at.
   * @param value The billableFunctions to set.
   */
  private void setBillableFunctions(
      int index, ai.sensorycloud.api.common.ModelType value) {
    value.getClass();
  ensureBillableFunctionsIsMutable();
    billableFunctions_.setInt(index, value.getNumber());
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param value The billableFunctions to add.
   */
  private void addBillableFunctions(ai.sensorycloud.api.common.ModelType value) {
    value.getClass();
  ensureBillableFunctionsIsMutable();
    billableFunctions_.addInt(value.getNumber());
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param values The billableFunctions to add.
   */
  private void addAllBillableFunctions(
      java.lang.Iterable<? extends ai.sensorycloud.api.common.ModelType> values) {
    ensureBillableFunctionsIsMutable();
    for (ai.sensorycloud.api.common.ModelType value : values) {
      billableFunctions_.addInt(value.getNumber());
    }
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   */
  private void clearBillableFunctions() {
    billableFunctions_ = emptyIntList();
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param value The enum numeric value on the wire for billableFunctions to set.
   */
  private void setBillableFunctionsValue(
      int index, int value) {
    ensureBillableFunctionsIsMutable();
    billableFunctions_.setInt(index, value);
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param value The enum numeric value on the wire for billableFunctions to add.
   */
  private void addBillableFunctionsValue(int value) {
    ensureBillableFunctionsIsMutable();
    billableFunctions_.addInt(value);
  }
  /**
   * <pre>
   * Type of event to filter on, If left empty all event types will be included
   * </pre>
   *
   * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
   * @param values The enum numeric values on the wire for billableFunctions to add.
   */
  private void addAllBillableFunctionsValue(
      java.lang.Iterable<java.lang.Integer> values) {
    ensureBillableFunctionsIsMutable();
    for (int value : values) {
      billableFunctions_.addInt(value);
    }
  }

  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.event.GlobalEventSummaryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.event.GlobalEventSummaryRequest)
      ai.sensorycloud.api.v1.event.GlobalEventSummaryRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @return A list containing the tenants.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getTenantsList() {
      return java.util.Collections.unmodifiableList(
          instance.getTenantsList());
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @return The count of tenants.
     */
    @java.lang.Override
    public int getTenantsCount() {
      return instance.getTenantsCount();
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param index The index of the element to return.
     * @return The tenants at the given index.
     */
    @java.lang.Override
    public java.lang.String getTenants(int index) {
      return instance.getTenants(index);
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the tenants at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTenantsBytes(int index) {
      return instance.getTenantsBytes(index);
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param index The index to set the value at.
     * @param value The tenants to set.
     * @return This builder for chaining.
     */
    public Builder setTenants(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setTenants(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param value The tenants to add.
     * @return This builder for chaining.
     */
    public Builder addTenants(
        java.lang.String value) {
      copyOnWrite();
      instance.addTenants(value);
      return this;
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param values The tenants to add.
     * @return This builder for chaining.
     */
    public Builder addAllTenants(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllTenants(values);
      return this;
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenants() {
      copyOnWrite();
      instance.clearTenants();
      return this;
    }
    /**
     * <pre>
     * The list of tenants to return data for, If left empty all tenants will be included in the response
     * </pre>
     *
     * <code>repeated string tenants = 1;</code>
     * @param value The bytes of the tenants to add.
     * @return This builder for chaining.
     */
    public Builder addTenantsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addTenantsBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    @java.lang.Override
    public boolean hasAfter() {
      return instance.hasAfter();
    }
    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getAfter() {
      return instance.getAfter();
    }
    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    public Builder setAfter(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setAfter(value);
      return this;
      }
    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    public Builder setAfter(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setAfter(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    public Builder mergeAfter(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeAfter(value);
      return this;
    }
    /**
     * <pre>
     * Optional Start UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp after = 2;</code>
     */
    public Builder clearAfter() {  copyOnWrite();
      instance.clearAfter();
      return this;
    }

    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    @java.lang.Override
    public boolean hasBefore() {
      return instance.hasBefore();
    }
    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getBefore() {
      return instance.getBefore();
    }
    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    public Builder setBefore(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setBefore(value);
      return this;
      }
    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    public Builder setBefore(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setBefore(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    public Builder mergeBefore(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeBefore(value);
      return this;
    }
    /**
     * <pre>
     * Optional End UTC timestamp. Internally this timestamp is rounded to the nearest second.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp before = 3;</code>
     */
    public Builder clearBefore() {  copyOnWrite();
      instance.clearBefore();
      return this;
    }

    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @return A list containing the billableFunctions.
     */
    @java.lang.Override
    public java.util.List<ai.sensorycloud.api.common.ModelType> getBillableFunctionsList() {
      return instance.getBillableFunctionsList();
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @return The count of billableFunctions.
     */
    @java.lang.Override
    public int getBillableFunctionsCount() {
      return instance.getBillableFunctionsCount();
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param index The index of the element to return.
     * @return The billableFunctions at the given index.
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.ModelType getBillableFunctions(int index) {
      return instance.getBillableFunctions(index);
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param index The index to set the value at.
     * @param value The billableFunctions to set.
     * @return This builder for chaining.
     */
    public Builder setBillableFunctions(
        int index, ai.sensorycloud.api.common.ModelType value) {
      copyOnWrite();
      instance.setBillableFunctions(index, value);
      return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param value The billableFunctions to add.
     * @return This builder for chaining.
     */
    public Builder addBillableFunctions(ai.sensorycloud.api.common.ModelType value) {
      copyOnWrite();
      instance.addBillableFunctions(value);
      return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param values The billableFunctions to add.
     * @return This builder for chaining.
     */
    public Builder addAllBillableFunctions(
        java.lang.Iterable<? extends ai.sensorycloud.api.common.ModelType> values) {
      copyOnWrite();
      instance.addAllBillableFunctions(values);  return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBillableFunctions() {
      copyOnWrite();
      instance.clearBillableFunctions();
      return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @return A list containing the enum numeric values on the wire for billableFunctions.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getBillableFunctionsValueList() {
      return java.util.Collections.unmodifiableList(
          instance.getBillableFunctionsValueList());
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of billableFunctions at the given index.
     */
    @java.lang.Override
    public int getBillableFunctionsValue(int index) {
      return instance.getBillableFunctionsValue(index);
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for billableFunctions to set.
     * @return This builder for chaining.
     */
    public Builder setBillableFunctionsValue(
        int index, int value) {
      copyOnWrite();
      instance.setBillableFunctionsValue(index, value);
      return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param value The enum numeric value on the wire for billableFunctions to add.
     * @return This builder for chaining.
     */
    public Builder addBillableFunctionsValue(int value) {
      copyOnWrite();
      instance.addBillableFunctionsValue(value);
      return this;
    }
    /**
     * <pre>
     * Type of event to filter on, If left empty all event types will be included
     * </pre>
     *
     * <code>repeated .sensory.api.common.ModelType billableFunctions = 5;</code>
     * @param values The enum numeric values on the wire for billableFunctions to add.
     * @return This builder for chaining.
     */
    public Builder addAllBillableFunctionsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      copyOnWrite();
      instance.addAllBillableFunctionsValue(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.event.GlobalEventSummaryRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "tenants_",
            "after_",
            "before_",
            "billableFunctions_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u021a\u0002\t" +
              "\u0003\t\u0005,";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.event.GlobalEventSummaryRequest)
  private static final ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest DEFAULT_INSTANCE;
  static {
    GlobalEventSummaryRequest defaultInstance = new GlobalEventSummaryRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GlobalEventSummaryRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.event.GlobalEventSummaryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GlobalEventSummaryRequest> PARSER;

  public static com.google.protobuf.Parser<GlobalEventSummaryRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package io.sensory.api.v1.management;

/**
 * <pre>
 * Request to create a new enrollment group
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.CreateEnrollmentGroupRequest}
 */
public  final class CreateEnrollmentGroupRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateEnrollmentGroupRequest, CreateEnrollmentGroupRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.CreateEnrollmentGroupRequest)
    CreateEnrollmentGroupRequestOrBuilder {
  private CreateEnrollmentGroupRequest() {
    id_ = "";
    name_ = "";
    description_ = "";
    modelName_ = "";
    userId_ = "";
    enrollmentIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * Identifier for enrollment group
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
   * Identifier for enrollment group
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
   * Identifier for enrollment group
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
   * Identifier for enrollment group
   * </pre>
   *
   * <code>string id = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Identifier for enrollment group
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

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Name of the enrollment group
   * </pre>
   *
   * <code>string name = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.String description_;
  /**
   * <pre>
   * Description for the enrollment group
   * </pre>
   *
   * <code>string description = 3 [(.validate.rules) = { ... }</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * Description for the enrollment group
   * </pre>
   *
   * <code>string description = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * Description for the enrollment group
   * </pre>
   *
   * <code>string description = 3 [(.validate.rules) = { ... }</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <pre>
   * Description for the enrollment group
   * </pre>
   *
   * <code>string description = 3 [(.validate.rules) = { ... }</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * Description for the enrollment group
   * </pre>
   *
   * <code>string description = 3 [(.validate.rules) = { ... }</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();
    
  }

  public static final int MODELNAME_FIELD_NUMBER = 4;
  private java.lang.String modelName_;
  /**
   * <pre>
   * Model name for the model used by this enrollment group
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    return modelName_;
  }
  /**
   * <pre>
   * Model name for the model used by this enrollment group
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelName_);
  }
  /**
   * <pre>
   * Model name for the model used by this enrollment group
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @param value The modelName to set.
   */
  private void setModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelName_ = value;
  }
  /**
   * <pre>
   * Model name for the model used by this enrollment group
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   */
  private void clearModelName() {
    
    modelName_ = getDefaultInstance().getModelName();
  }
  /**
   * <pre>
   * Model name for the model used by this enrollment group
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();
    
  }

  public static final int USERID_FIELD_NUMBER = 5;
  private java.lang.String userId_;
  /**
   * <pre>
   * User ID of the user that owns the enrollment group
   * </pre>
   *
   * <code>string userId = 5 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * User ID of the user that owns the enrollment group
   * </pre>
   *
   * <code>string userId = 5 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * User ID of the user that owns the enrollment group
   * </pre>
   *
   * <code>string userId = 5 [(.validate.rules) = { ... }</code>
   * @param value The userId to set.
   */
  private void setUserId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userId_ = value;
  }
  /**
   * <pre>
   * User ID of the user that owns the enrollment group
   * </pre>
   *
   * <code>string userId = 5 [(.validate.rules) = { ... }</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * User ID of the user that owns the enrollment group
   * </pre>
   *
   * <code>string userId = 5 [(.validate.rules) = { ... }</code>
   * @param value The bytes for userId to set.
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userId_ = value.toStringUtf8();
    
  }

  public static final int ENROLLMENTIDS_FIELD_NUMBER = 6;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> enrollmentIds_;
  /**
   * <pre>
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
   * @return A list containing the enrollmentIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getEnrollmentIdsList() {
    return enrollmentIds_;
  }
  /**
   * <pre>
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
   * @return The count of enrollmentIds.
   */
  @java.lang.Override
  public int getEnrollmentIdsCount() {
    return enrollmentIds_.size();
  }
  /**
   * <pre>
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
   * @param index The index of the element to return.
   * @return The enrollmentIds at the given index.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentIds(int index) {
    return enrollmentIds_.get(index);
  }
  /**
   * <pre>
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
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
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
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
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
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
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
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
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
   */
  private void clearEnrollmentIds() {
    enrollmentIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * List of enrollment IDs to include in the enrollment group
   * </pre>
   *
   * <code>repeated string enrollmentIds = 6;</code>
   * @param value The bytes of the enrollmentIds to add.
   */
  private void addEnrollmentIdsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensureEnrollmentIdsIsMutable();
    enrollmentIds_.add(value.toStringUtf8());
  }

  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.sensory.api.v1.management.CreateEnrollmentGroupRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to create a new enrollment group
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.CreateEnrollmentGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.sensory.api.v1.management.CreateEnrollmentGroupRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.CreateEnrollmentGroupRequest)
      io.sensory.api.v1.management.CreateEnrollmentGroupRequestOrBuilder {
    // Construct using io.sensory.api.v1.management.CreateEnrollmentGroupRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Identifier for enrollment group
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
     * Identifier for enrollment group
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
     * Identifier for enrollment group
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
     * Identifier for enrollment group
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
     * Identifier for enrollment group
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
     * Name of the enrollment group
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Name of the enrollment group
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Name of the enrollment group
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Name of the enrollment group
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Name of the enrollment group
     * </pre>
     *
     * <code>string name = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Description for the enrollment group
     * </pre>
     *
     * <code>string description = 3 [(.validate.rules) = { ... }</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * Description for the enrollment group
     * </pre>
     *
     * <code>string description = 3 [(.validate.rules) = { ... }</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * Description for the enrollment group
     * </pre>
     *
     * <code>string description = 3 [(.validate.rules) = { ... }</code>
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
     * Description for the enrollment group
     * </pre>
     *
     * <code>string description = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * Description for the enrollment group
     * </pre>
     *
     * <code>string description = 3 [(.validate.rules) = { ... }</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    /**
     * <pre>
     * Model name for the model used by this enrollment group
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return The modelName.
     */
    @java.lang.Override
    public java.lang.String getModelName() {
      return instance.getModelName();
    }
    /**
     * <pre>
     * Model name for the model used by this enrollment group
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return The bytes for modelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      return instance.getModelNameBytes();
    }
    /**
     * <pre>
     * Model name for the model used by this enrollment group
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @param value The modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelName(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelName(value);
      return this;
    }
    /**
     * <pre>
     * Model name for the model used by this enrollment group
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      copyOnWrite();
      instance.clearModelName();
      return this;
    }
    /**
     * <pre>
     * Model name for the model used by this enrollment group
     * </pre>
     *
     * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
     * @param value The bytes for modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * User ID of the user that owns the enrollment group
     * </pre>
     *
     * <code>string userId = 5 [(.validate.rules) = { ... }</code>
     * @return The userId.
     */
    @java.lang.Override
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * User ID of the user that owns the enrollment group
     * </pre>
     *
     * <code>string userId = 5 [(.validate.rules) = { ... }</code>
     * @return The bytes for userId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * User ID of the user that owns the enrollment group
     * </pre>
     *
     * <code>string userId = 5 [(.validate.rules) = { ... }</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserId(value);
      return this;
    }
    /**
     * <pre>
     * User ID of the user that owns the enrollment group
     * </pre>
     *
     * <code>string userId = 5 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * User ID of the user that owns the enrollment group
     * </pre>
     *
     * <code>string userId = 5 [(.validate.rules) = { ... }</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
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
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
     * @return The count of enrollmentIds.
     */
    @java.lang.Override
    public int getEnrollmentIdsCount() {
      return instance.getEnrollmentIdsCount();
    }
    /**
     * <pre>
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
     * @param index The index of the element to return.
     * @return The enrollmentIds at the given index.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentIds(int index) {
      return instance.getEnrollmentIds(index);
    }
    /**
     * <pre>
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
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
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
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
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
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
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
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
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentIds() {
      copyOnWrite();
      instance.clearEnrollmentIds();
      return this;
    }
    /**
     * <pre>
     * List of enrollment IDs to include in the enrollment group
     * </pre>
     *
     * <code>repeated string enrollmentIds = 6;</code>
     * @param value The bytes of the enrollmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addEnrollmentIdsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addEnrollmentIdsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.CreateEnrollmentGroupRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.sensory.api.v1.management.CreateEnrollmentGroupRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "name_",
            "description_",
            "modelName_",
            "userId_",
            "enrollmentIds_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u021a";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.sensory.api.v1.management.CreateEnrollmentGroupRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.sensory.api.v1.management.CreateEnrollmentGroupRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.sensory.api.v1.management.CreateEnrollmentGroupRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.CreateEnrollmentGroupRequest)
  private static final io.sensory.api.v1.management.CreateEnrollmentGroupRequest DEFAULT_INSTANCE;
  static {
    CreateEnrollmentGroupRequest defaultInstance = new CreateEnrollmentGroupRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateEnrollmentGroupRequest.class, defaultInstance);
  }

  public static io.sensory.api.v1.management.CreateEnrollmentGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateEnrollmentGroupRequest> PARSER;

  public static com.google.protobuf.Parser<CreateEnrollmentGroupRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


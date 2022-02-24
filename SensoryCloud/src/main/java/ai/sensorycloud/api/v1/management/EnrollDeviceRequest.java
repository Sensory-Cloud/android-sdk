// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/device.proto

package ai.sensorycloud.api.v1.management;

/**
 * <pre>
 * Request to enroll a new device in the system. Devices can then enroll and associate users with themselves.
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.management.EnrollDeviceRequest}
 */
public  final class EnrollDeviceRequest extends
    com.google.protobuf.GeneratedMessageLite<
        EnrollDeviceRequest, EnrollDeviceRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.management.EnrollDeviceRequest)
    EnrollDeviceRequestOrBuilder {
  private EnrollDeviceRequest() {
    name_ = "";
    deviceId_ = "";
    tenantId_ = "";
    credential_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The friendly name you'd like to associate with this device
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The friendly name you'd like to associate with this device
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The friendly name you'd like to associate with this device
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * The friendly name you'd like to associate with this device
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The friendly name you'd like to associate with this device
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int DEVICEID_FIELD_NUMBER = 2;
  private java.lang.String deviceId_;
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * A typical value would be a hardware serial number.
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    return deviceId_;
  }
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * A typical value would be a hardware serial number.
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(deviceId_);
  }
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * A typical value would be a hardware serial number.
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @param value The deviceId to set.
   */
  private void setDeviceId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    deviceId_ = value;
  }
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * A typical value would be a hardware serial number.
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearDeviceId() {
    
    deviceId_ = getDefaultInstance().getDeviceId();
  }
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * A typical value would be a hardware serial number.
   * </pre>
   *
   * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for deviceId to set.
   */
  private void setDeviceIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    deviceId_ = value.toStringUtf8();
    
  }

  public static final int TENANTID_FIELD_NUMBER = 3;
  private java.lang.String tenantId_;
  /**
   * <pre>
   * Unique Tenant ID as UUID
   * </pre>
   *
   * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    return tenantId_;
  }
  /**
   * <pre>
   * Unique Tenant ID as UUID
   * </pre>
   *
   * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tenantId_);
  }
  /**
   * <pre>
   * Unique Tenant ID as UUID
   * </pre>
   *
   * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
   * @param value The tenantId to set.
   */
  private void setTenantId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    tenantId_ = value;
  }
  /**
   * <pre>
   * Unique Tenant ID as UUID
   * </pre>
   *
   * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
   */
  private void clearTenantId() {
    
    tenantId_ = getDefaultInstance().getTenantId();
  }
  /**
   * <pre>
   * Unique Tenant ID as UUID
   * </pre>
   *
   * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
   * @param value The bytes for tenantId to set.
   */
  private void setTenantIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    tenantId_ = value.toStringUtf8();
    
  }

  public static final int CLIENT_FIELD_NUMBER = 4;
  private ai.sensorycloud.api.common.GenericClient client_;
  /**
   * <pre>
   * OAuth client-specific request details
   * </pre>
   *
   * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <pre>
   * OAuth client-specific request details
   * </pre>
   *
   * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.GenericClient getClient() {
    return client_ == null ? ai.sensorycloud.api.common.GenericClient.getDefaultInstance() : client_;
  }
  /**
   * <pre>
   * OAuth client-specific request details
   * </pre>
   *
   * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
   */
  private void setClient(ai.sensorycloud.api.common.GenericClient value) {
    value.getClass();
  client_ = value;
    
    }
  /**
   * <pre>
   * OAuth client-specific request details
   * </pre>
   *
   * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeClient(ai.sensorycloud.api.common.GenericClient value) {
    value.getClass();
  if (client_ != null &&
        client_ != ai.sensorycloud.api.common.GenericClient.getDefaultInstance()) {
      client_ =
        ai.sensorycloud.api.common.GenericClient.newBuilder(client_).mergeFrom(value).buildPartial();
    } else {
      client_ = value;
    }
    
  }
  /**
   * <pre>
   * OAuth client-specific request details
   * </pre>
   *
   * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
   */
  private void clearClient() {  client_ = null;
    
  }

  public static final int CREDENTIAL_FIELD_NUMBER = 5;
  private java.lang.String credential_;
  /**
   * <pre>
   * If required, the credential to be validated by the server upon enrollment.
   * Possible values are a shared secret or signed JWT.
   * </pre>
   *
   * <code>string credential = 5;</code>
   * @return The credential.
   */
  @java.lang.Override
  public java.lang.String getCredential() {
    return credential_;
  }
  /**
   * <pre>
   * If required, the credential to be validated by the server upon enrollment.
   * Possible values are a shared secret or signed JWT.
   * </pre>
   *
   * <code>string credential = 5;</code>
   * @return The bytes for credential.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCredentialBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(credential_);
  }
  /**
   * <pre>
   * If required, the credential to be validated by the server upon enrollment.
   * Possible values are a shared secret or signed JWT.
   * </pre>
   *
   * <code>string credential = 5;</code>
   * @param value The credential to set.
   */
  private void setCredential(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    credential_ = value;
  }
  /**
   * <pre>
   * If required, the credential to be validated by the server upon enrollment.
   * Possible values are a shared secret or signed JWT.
   * </pre>
   *
   * <code>string credential = 5;</code>
   */
  private void clearCredential() {
    
    credential_ = getDefaultInstance().getCredential();
  }
  /**
   * <pre>
   * If required, the credential to be validated by the server upon enrollment.
   * Possible values are a shared secret or signed JWT.
   * </pre>
   *
   * <code>string credential = 5;</code>
   * @param value The bytes for credential to set.
   */
  private void setCredentialBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    credential_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.management.EnrollDeviceRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to enroll a new device in the system. Devices can then enroll and associate users with themselves.
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.management.EnrollDeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.management.EnrollDeviceRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.management.EnrollDeviceRequest)
      ai.sensorycloud.api.v1.management.EnrollDeviceRequestOrBuilder {
    // Construct using ai.sensorycloud.api.v1.management.EnrollDeviceRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The friendly name you'd like to associate with this device
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The friendly name you'd like to associate with this device
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The friendly name you'd like to associate with this device
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * The friendly name you'd like to associate with this device
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The friendly name you'd like to associate with this device
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
     * A typical value would be a hardware serial number.
     * </pre>
     *
     * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      return instance.getDeviceId();
    }
    /**
     * <pre>
     * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
     * A typical value would be a hardware serial number.
     * </pre>
     *
     * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      return instance.getDeviceIdBytes();
    }
    /**
     * <pre>
     * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
     * A typical value would be a hardware serial number.
     * </pre>
     *
     * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeviceId(value);
      return this;
    }
    /**
     * <pre>
     * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
     * A typical value would be a hardware serial number.
     * </pre>
     *
     * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      copyOnWrite();
      instance.clearDeviceId();
      return this;
    }
    /**
     * <pre>
     * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
     * A typical value would be a hardware serial number.
     * </pre>
     *
     * <code>string deviceId = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeviceIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Unique Tenant ID as UUID
     * </pre>
     *
     * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
     * @return The tenantId.
     */
    @java.lang.Override
    public java.lang.String getTenantId() {
      return instance.getTenantId();
    }
    /**
     * <pre>
     * Unique Tenant ID as UUID
     * </pre>
     *
     * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
     * @return The bytes for tenantId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      return instance.getTenantIdBytes();
    }
    /**
     * <pre>
     * Unique Tenant ID as UUID
     * </pre>
     *
     * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTenantId(value);
      return this;
    }
    /**
     * <pre>
     * Unique Tenant ID as UUID
     * </pre>
     *
     * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      copyOnWrite();
      instance.clearTenantId();
      return this;
    }
    /**
     * <pre>
     * Unique Tenant ID as UUID
     * </pre>
     *
     * <code>string tenantId = 3 [(.validate.rules) = { ... }</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTenantIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public boolean hasClient() {
      return instance.hasClient();
    }
    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.GenericClient getClient() {
      return instance.getClient();
    }
    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    public Builder setClient(ai.sensorycloud.api.common.GenericClient value) {
      copyOnWrite();
      instance.setClient(value);
      return this;
      }
    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    public Builder setClient(
        ai.sensorycloud.api.common.GenericClient.Builder builderForValue) {
      copyOnWrite();
      instance.setClient(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeClient(ai.sensorycloud.api.common.GenericClient value) {
      copyOnWrite();
      instance.mergeClient(value);
      return this;
    }
    /**
     * <pre>
     * OAuth client-specific request details
     * </pre>
     *
     * <code>.sensory.api.common.GenericClient client = 4 [(.validate.rules) = { ... }</code>
     */
    public Builder clearClient() {  copyOnWrite();
      instance.clearClient();
      return this;
    }

    /**
     * <pre>
     * If required, the credential to be validated by the server upon enrollment.
     * Possible values are a shared secret or signed JWT.
     * </pre>
     *
     * <code>string credential = 5;</code>
     * @return The credential.
     */
    @java.lang.Override
    public java.lang.String getCredential() {
      return instance.getCredential();
    }
    /**
     * <pre>
     * If required, the credential to be validated by the server upon enrollment.
     * Possible values are a shared secret or signed JWT.
     * </pre>
     *
     * <code>string credential = 5;</code>
     * @return The bytes for credential.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCredentialBytes() {
      return instance.getCredentialBytes();
    }
    /**
     * <pre>
     * If required, the credential to be validated by the server upon enrollment.
     * Possible values are a shared secret or signed JWT.
     * </pre>
     *
     * <code>string credential = 5;</code>
     * @param value The credential to set.
     * @return This builder for chaining.
     */
    public Builder setCredential(
        java.lang.String value) {
      copyOnWrite();
      instance.setCredential(value);
      return this;
    }
    /**
     * <pre>
     * If required, the credential to be validated by the server upon enrollment.
     * Possible values are a shared secret or signed JWT.
     * </pre>
     *
     * <code>string credential = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCredential() {
      copyOnWrite();
      instance.clearCredential();
      return this;
    }
    /**
     * <pre>
     * If required, the credential to be validated by the server upon enrollment.
     * Possible values are a shared secret or signed JWT.
     * </pre>
     *
     * <code>string credential = 5;</code>
     * @param value The bytes for credential to set.
     * @return This builder for chaining.
     */
    public Builder setCredentialBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCredentialBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.management.EnrollDeviceRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.management.EnrollDeviceRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "deviceId_",
            "tenantId_",
            "client_",
            "credential_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\t\u0005\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.management.EnrollDeviceRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.management.EnrollDeviceRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.management.EnrollDeviceRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.management.EnrollDeviceRequest)
  private static final ai.sensorycloud.api.v1.management.EnrollDeviceRequest DEFAULT_INSTANCE;
  static {
    EnrollDeviceRequest defaultInstance = new EnrollDeviceRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      EnrollDeviceRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.management.EnrollDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EnrollDeviceRequest> PARSER;

  public static com.google.protobuf.Parser<EnrollDeviceRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

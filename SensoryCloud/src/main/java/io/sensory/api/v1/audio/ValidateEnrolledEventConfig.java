// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package io.sensory.api.v1.audio;

/**
 * <pre>
 * Provides information for an audio-based event validation
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.ValidateEnrolledEventConfig}
 */
public  final class ValidateEnrolledEventConfig extends
    com.google.protobuf.GeneratedMessageLite<
        ValidateEnrolledEventConfig, ValidateEnrolledEventConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.ValidateEnrolledEventConfig)
    ValidateEnrolledEventConfigOrBuilder {
  private ValidateEnrolledEventConfig() {
  }
  private int authIdCase_ = 0;
  private java.lang.Object authId_;
  public enum AuthIdCase {
    ENROLLMENTID(2),
    ENROLLMENTGROUPID(3),
    AUTHID_NOT_SET(0);
    private final int value;
    private AuthIdCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AuthIdCase valueOf(int value) {
      return forNumber(value);
    }

    public static AuthIdCase forNumber(int value) {
      switch (value) {
        case 2: return ENROLLMENTID;
        case 3: return ENROLLMENTGROUPID;
        case 0: return AUTHID_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public AuthIdCase
  getAuthIdCase() {
    return AuthIdCase.forNumber(
        authIdCase_);
  }

  private void clearAuthId() {
    authIdCase_ = 0;
    authId_ = null;
  }

  public static final int AUDIO_FIELD_NUMBER = 1;
  private io.sensory.api.v1.audio.AudioConfig audio_;
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.sensory.api.v1.audio.AudioConfig getAudio() {
    return audio_ == null ? io.sensory.api.v1.audio.AudioConfig.getDefaultInstance() : audio_;
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  private void setAudio(io.sensory.api.v1.audio.AudioConfig value) {
    value.getClass();
  audio_ = value;
    
    }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAudio(io.sensory.api.v1.audio.AudioConfig value) {
    value.getClass();
  if (audio_ != null &&
        audio_ != io.sensory.api.v1.audio.AudioConfig.getDefaultInstance()) {
      audio_ =
        io.sensory.api.v1.audio.AudioConfig.newBuilder(audio_).mergeFrom(value).buildPartial();
    } else {
      audio_ = value;
    }
    
  }
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearAudio() {  audio_ = null;
    
  }

  public static final int ENROLLMENTID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentId field is set.
   */
  @java.lang.Override
  public boolean hasEnrollmentId() {
    return authIdCase_ == 2;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return The enrollmentId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentId() {
    java.lang.String ref = "";
    if (authIdCase_ == 2) {
      ref = (java.lang.String) authId_;
    }
    return ref;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for enrollmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentIdBytes() {
    java.lang.String ref = "";
    if (authIdCase_ == 2) {
      ref = (java.lang.String) authId_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @param value The enrollmentId to set.
   */
  private void setEnrollmentId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  authIdCase_ = 2;
    authId_ = value;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearEnrollmentId() {
    if (authIdCase_ == 2) {
      authIdCase_ = 0;
      authId_ = null;
    }
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
   * @param value The bytes for enrollmentId to set.
   */
  private void setEnrollmentIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    authId_ = value.toStringUtf8();
    authIdCase_ = 2;
  }

  public static final int ENROLLMENTGROUPID_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return Whether the enrollmentGroupId field is set.
   */
  @java.lang.Override
  public boolean hasEnrollmentGroupId() {
    return authIdCase_ == 3;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return The enrollmentGroupId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentGroupId() {
    java.lang.String ref = "";
    if (authIdCase_ == 3) {
      ref = (java.lang.String) authId_;
    }
    return ref;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @return The bytes for enrollmentGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentGroupIdBytes() {
    java.lang.String ref = "";
    if (authIdCase_ == 3) {
      ref = (java.lang.String) authId_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @param value The enrollmentGroupId to set.
   */
  private void setEnrollmentGroupId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  authIdCase_ = 3;
    authId_ = value;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   */
  private void clearEnrollmentGroupId() {
    if (authIdCase_ == 3) {
      authIdCase_ = 0;
      authId_ = null;
    }
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 3;</code>
   * @param value The bytes for enrollmentGroupId to set.
   */
  private void setEnrollmentGroupIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    authId_ = value.toStringUtf8();
    authIdCase_ = 3;
  }

  public static final int SENSITIVITY_FIELD_NUMBER = 4;
  private int sensitivity_;
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for sensitivity.
   */
  @java.lang.Override
  public int getSensitivityValue() {
    return sensitivity_;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The sensitivity.
   */
  @java.lang.Override
  public io.sensory.api.v1.audio.ThresholdSensitivity getSensitivity() {
    io.sensory.api.v1.audio.ThresholdSensitivity result = io.sensory.api.v1.audio.ThresholdSensitivity.forNumber(sensitivity_);
    return result == null ? io.sensory.api.v1.audio.ThresholdSensitivity.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @param value The enum numeric value on the wire for sensitivity to set.
   */
  private void setSensitivityValue(int value) {
      sensitivity_ = value;
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @param value The sensitivity to set.
   */
  private void setSensitivity(io.sensory.api.v1.audio.ThresholdSensitivity value) {
    sensitivity_ = value.getNumber();
    
  }
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   */
  private void clearSensitivity() {
    
    sensitivity_ = 0;
  }

  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.sensory.api.v1.audio.ValidateEnrolledEventConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Provides information for an audio-based event validation
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.ValidateEnrolledEventConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.sensory.api.v1.audio.ValidateEnrolledEventConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.ValidateEnrolledEventConfig)
      io.sensory.api.v1.audio.ValidateEnrolledEventConfigOrBuilder {
    // Construct using io.sensory.api.v1.audio.ValidateEnrolledEventConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public AuthIdCase
        getAuthIdCase() {
      return instance.getAuthIdCase();
    }

    public Builder clearAuthId() {
      copyOnWrite();
      instance.clearAuthId();
      return this;
    }


    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public boolean hasAudio() {
      return instance.hasAudio();
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public io.sensory.api.v1.audio.AudioConfig getAudio() {
      return instance.getAudio();
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(io.sensory.api.v1.audio.AudioConfig value) {
      copyOnWrite();
      instance.setAudio(value);
      return this;
      }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setAudio(
        io.sensory.api.v1.audio.AudioConfig.Builder builderForValue) {
      copyOnWrite();
      instance.setAudio(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeAudio(io.sensory.api.v1.audio.AudioConfig value) {
      copyOnWrite();
      instance.mergeAudio(value);
      return this;
    }
    /**
     * <pre>
     * Required. Provides information that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearAudio() {  copyOnWrite();
      instance.clearAudio();
      return this;
    }

    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the enrollmentId field is set.
     */
    @java.lang.Override
    public boolean hasEnrollmentId() {
      return instance.hasEnrollmentId();
    }
    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @return The enrollmentId.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentId() {
      return instance.getEnrollmentId();
    }
    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for enrollmentId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnrollmentIdBytes() {
      return instance.getEnrollmentIdBytes();
    }
    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @param value The enrollmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentId(
        java.lang.String value) {
      copyOnWrite();
      instance.setEnrollmentId(value);
      return this;
    }
    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentId() {
      copyOnWrite();
      instance.clearEnrollmentId();
      return this;
    }
    /**
     * <pre>
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for enrollmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEnrollmentIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @return Whether the enrollmentGroupId field is set.
     */
    @java.lang.Override
    public boolean hasEnrollmentGroupId() {
      return instance.hasEnrollmentGroupId();
    }
    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @return The enrollmentGroupId.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentGroupId() {
      return instance.getEnrollmentGroupId();
    }
    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @return The bytes for enrollmentGroupId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnrollmentGroupIdBytes() {
      return instance.getEnrollmentGroupIdBytes();
    }
    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @param value The enrollmentGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentGroupId(
        java.lang.String value) {
      copyOnWrite();
      instance.setEnrollmentGroupId(value);
      return this;
    }
    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentGroupId() {
      copyOnWrite();
      instance.clearEnrollmentGroupId();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for an enrollment group
     * </pre>
     *
     * <code>string enrollmentGroupId = 3;</code>
     * @param value The bytes for enrollmentGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentGroupIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEnrollmentGroupIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for sensitivity.
     */
    @java.lang.Override
    public int getSensitivityValue() {
      return instance.getSensitivityValue();
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @param value The sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivityValue(int value) {
      copyOnWrite();
      instance.setSensitivityValue(value);
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return The sensitivity.
     */
    @java.lang.Override
    public io.sensory.api.v1.audio.ThresholdSensitivity getSensitivity() {
      return instance.getSensitivity();
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for sensitivity to set.
     * @return This builder for chaining.
     */
    public Builder setSensitivity(io.sensory.api.v1.audio.ThresholdSensitivity value) {
      copyOnWrite();
      instance.setSensitivity(value);
      return this;
    }
    /**
     * <pre>
     * The model sensitivity
     * </pre>
     *
     * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSensitivity() {
      copyOnWrite();
      instance.clearSensitivity();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.ValidateEnrolledEventConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.sensory.api.v1.audio.ValidateEnrolledEventConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "authId_",
            "authIdCase_",
            "audio_",
            "sensitivity_",
          };
          java.lang.String info =
              "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u023b" +
              "\u0000\u0003\u023b\u0000\u0004\f";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.sensory.api.v1.audio.ValidateEnrolledEventConfig> parser = PARSER;
        if (parser == null) {
          synchronized (io.sensory.api.v1.audio.ValidateEnrolledEventConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.sensory.api.v1.audio.ValidateEnrolledEventConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.ValidateEnrolledEventConfig)
  private static final io.sensory.api.v1.audio.ValidateEnrolledEventConfig DEFAULT_INSTANCE;
  static {
    ValidateEnrolledEventConfig defaultInstance = new ValidateEnrolledEventConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ValidateEnrolledEventConfig.class, defaultInstance);
  }

  public static io.sensory.api.v1.audio.ValidateEnrolledEventConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ValidateEnrolledEventConfig> PARSER;

  public static com.google.protobuf.Parser<ValidateEnrolledEventConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


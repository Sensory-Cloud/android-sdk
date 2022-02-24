// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * <pre>
 * Response to an enrollment request
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.CreateEnrollmentResponse}
 */
public  final class CreateEnrollmentResponse extends
    com.google.protobuf.GeneratedMessageLite<
        CreateEnrollmentResponse, CreateEnrollmentResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.CreateEnrollmentResponse)
    CreateEnrollmentResponseOrBuilder {
  private CreateEnrollmentResponse() {
    enrollmentId_ = "";
    modelName_ = "";
    modelVersion_ = "";
    modelPrompt_ = "";
  }
  public static final int PERCENTCOMPLETE_FIELD_NUMBER = 1;
  private long percentComplete_;
  /**
   * <pre>
   * Percent Complete as values between 0 and 100
   * </pre>
   *
   * <code>int64 percentComplete = 1;</code>
   * @return The percentComplete.
   */
  @java.lang.Override
  public long getPercentComplete() {
    return percentComplete_;
  }
  /**
   * <pre>
   * Percent Complete as values between 0 and 100
   * </pre>
   *
   * <code>int64 percentComplete = 1;</code>
   * @param value The percentComplete to set.
   */
  private void setPercentComplete(long value) {
    
    percentComplete_ = value;
  }
  /**
   * <pre>
   * Percent Complete as values between 0 and 100
   * </pre>
   *
   * <code>int64 percentComplete = 1;</code>
   */
  private void clearPercentComplete() {
    
    percentComplete_ = 0L;
  }

  public static final int AUDIOENERGY_FIELD_NUMBER = 2;
  private float audioEnergy_;
  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 2;</code>
   * @return The audioEnergy.
   */
  @java.lang.Override
  public float getAudioEnergy() {
    return audioEnergy_;
  }
  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 2;</code>
   * @param value The audioEnergy to set.
   */
  private void setAudioEnergy(float value) {
    
    audioEnergy_ = value;
  }
  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 2;</code>
   */
  private void clearAudioEnergy() {
    
    audioEnergy_ = 0F;
  }

  public static final int ENROLLMENTID_FIELD_NUMBER = 3;
  private java.lang.String enrollmentId_;
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The enrollmentId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentId() {
    return enrollmentId_;
  }
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The bytes for enrollmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(enrollmentId_);
  }
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @param value The enrollmentId to set.
   */
  private void setEnrollmentId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    enrollmentId_ = value;
  }
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   */
  private void clearEnrollmentId() {
    
    enrollmentId_ = getDefaultInstance().getEnrollmentId();
  }
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @param value The bytes for enrollmentId to set.
   */
  private void setEnrollmentIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    enrollmentId_ = value.toStringUtf8();
    
  }

  public static final int MODELNAME_FIELD_NUMBER = 4;
  private java.lang.String modelName_;
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    return modelName_;
  }
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelName_);
  }
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @param value The modelName to set.
   */
  private void setModelName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelName_ = value;
  }
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   */
  private void clearModelName() {
    
    modelName_ = getDefaultInstance().getModelName();
  }
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @param value The bytes for modelName to set.
   */
  private void setModelNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelName_ = value.toStringUtf8();
    
  }

  public static final int MODELVERSION_FIELD_NUMBER = 5;
  private java.lang.String modelVersion_;
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @return The modelVersion.
   */
  @java.lang.Override
  public java.lang.String getModelVersion() {
    return modelVersion_;
  }
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @return The bytes for modelVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelVersion_);
  }
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @param value The modelVersion to set.
   */
  private void setModelVersion(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelVersion_ = value;
  }
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   */
  private void clearModelVersion() {
    
    modelVersion_ = getDefaultInstance().getModelVersion();
  }
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @param value The bytes for modelVersion to set.
   */
  private void setModelVersionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelVersion_ = value.toStringUtf8();
    
  }

  public static final int MODELPROMPT_FIELD_NUMBER = 6;
  private java.lang.String modelPrompt_;
  /**
   * <pre>
   * Model prompt instructs the user to say something during enrollment
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @return The modelPrompt.
   */
  @java.lang.Override
  public java.lang.String getModelPrompt() {
    return modelPrompt_;
  }
  /**
   * <pre>
   * Model prompt instructs the user to say something during enrollment
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @return The bytes for modelPrompt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelPromptBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(modelPrompt_);
  }
  /**
   * <pre>
   * Model prompt instructs the user to say something during enrollment
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @param value The modelPrompt to set.
   */
  private void setModelPrompt(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    modelPrompt_ = value;
  }
  /**
   * <pre>
   * Model prompt instructs the user to say something during enrollment
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   */
  private void clearModelPrompt() {
    
    modelPrompt_ = getDefaultInstance().getModelPrompt();
  }
  /**
   * <pre>
   * Model prompt instructs the user to say something during enrollment
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @param value The bytes for modelPrompt to set.
   */
  private void setModelPromptBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    modelPrompt_ = value.toStringUtf8();
    
  }

  public static final int PERCENTSEGMENTCOMPLETE_FIELD_NUMBER = 7;
  private long percentSegmentComplete_;
  /**
   * <pre>
   * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
   * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
   * </pre>
   *
   * <code>int64 percentSegmentComplete = 7;</code>
   * @return The percentSegmentComplete.
   */
  @java.lang.Override
  public long getPercentSegmentComplete() {
    return percentSegmentComplete_;
  }
  /**
   * <pre>
   * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
   * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
   * </pre>
   *
   * <code>int64 percentSegmentComplete = 7;</code>
   * @param value The percentSegmentComplete to set.
   */
  private void setPercentSegmentComplete(long value) {
    
    percentSegmentComplete_ = value;
  }
  /**
   * <pre>
   * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
   * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
   * </pre>
   *
   * <code>int64 percentSegmentComplete = 7;</code>
   */
  private void clearPercentSegmentComplete() {
    
    percentSegmentComplete_ = 0L;
  }

  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Response to an enrollment request
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.CreateEnrollmentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.CreateEnrollmentResponse)
      ai.sensorycloud.api.v1.audio.CreateEnrollmentResponseOrBuilder {
    // Construct using ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Percent Complete as values between 0 and 100
     * </pre>
     *
     * <code>int64 percentComplete = 1;</code>
     * @return The percentComplete.
     */
    @java.lang.Override
    public long getPercentComplete() {
      return instance.getPercentComplete();
    }
    /**
     * <pre>
     * Percent Complete as values between 0 and 100
     * </pre>
     *
     * <code>int64 percentComplete = 1;</code>
     * @param value The percentComplete to set.
     * @return This builder for chaining.
     */
    public Builder setPercentComplete(long value) {
      copyOnWrite();
      instance.setPercentComplete(value);
      return this;
    }
    /**
     * <pre>
     * Percent Complete as values between 0 and 100
     * </pre>
     *
     * <code>int64 percentComplete = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentComplete() {
      copyOnWrite();
      instance.clearPercentComplete();
      return this;
    }

    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 2;</code>
     * @return The audioEnergy.
     */
    @java.lang.Override
    public float getAudioEnergy() {
      return instance.getAudioEnergy();
    }
    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 2;</code>
     * @param value The audioEnergy to set.
     * @return This builder for chaining.
     */
    public Builder setAudioEnergy(float value) {
      copyOnWrite();
      instance.setAudioEnergy(value);
      return this;
    }
    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioEnergy() {
      copyOnWrite();
      instance.clearAudioEnergy();
      return this;
    }

    /**
     * <pre>
     * If enrollment is successful, this value will be the unique Enrollment ID
     * </pre>
     *
     * <code>string enrollmentId = 3;</code>
     * @return The enrollmentId.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentId() {
      return instance.getEnrollmentId();
    }
    /**
     * <pre>
     * If enrollment is successful, this value will be the unique Enrollment ID
     * </pre>
     *
     * <code>string enrollmentId = 3;</code>
     * @return The bytes for enrollmentId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnrollmentIdBytes() {
      return instance.getEnrollmentIdBytes();
    }
    /**
     * <pre>
     * If enrollment is successful, this value will be the unique Enrollment ID
     * </pre>
     *
     * <code>string enrollmentId = 3;</code>
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
     * If enrollment is successful, this value will be the unique Enrollment ID
     * </pre>
     *
     * <code>string enrollmentId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentId() {
      copyOnWrite();
      instance.clearEnrollmentId();
      return this;
    }
    /**
     * <pre>
     * If enrollment is successful, this value will be the unique Enrollment ID
     * </pre>
     *
     * <code>string enrollmentId = 3;</code>
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
     * Model used for enrollment
     * </pre>
     *
     * <code>string modelName = 4;</code>
     * @return The modelName.
     */
    @java.lang.Override
    public java.lang.String getModelName() {
      return instance.getModelName();
    }
    /**
     * <pre>
     * Model used for enrollment
     * </pre>
     *
     * <code>string modelName = 4;</code>
     * @return The bytes for modelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      return instance.getModelNameBytes();
    }
    /**
     * <pre>
     * Model used for enrollment
     * </pre>
     *
     * <code>string modelName = 4;</code>
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
     * Model used for enrollment
     * </pre>
     *
     * <code>string modelName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      copyOnWrite();
      instance.clearModelName();
      return this;
    }
    /**
     * <pre>
     * Model used for enrollment
     * </pre>
     *
     * <code>string modelName = 4;</code>
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
     * Model version used for enrollment
     * </pre>
     *
     * <code>string modelVersion = 5;</code>
     * @return The modelVersion.
     */
    @java.lang.Override
    public java.lang.String getModelVersion() {
      return instance.getModelVersion();
    }
    /**
     * <pre>
     * Model version used for enrollment
     * </pre>
     *
     * <code>string modelVersion = 5;</code>
     * @return The bytes for modelVersion.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelVersionBytes() {
      return instance.getModelVersionBytes();
    }
    /**
     * <pre>
     * Model version used for enrollment
     * </pre>
     *
     * <code>string modelVersion = 5;</code>
     * @param value The modelVersion to set.
     * @return This builder for chaining.
     */
    public Builder setModelVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelVersion(value);
      return this;
    }
    /**
     * <pre>
     * Model version used for enrollment
     * </pre>
     *
     * <code>string modelVersion = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelVersion() {
      copyOnWrite();
      instance.clearModelVersion();
      return this;
    }
    /**
     * <pre>
     * Model version used for enrollment
     * </pre>
     *
     * <code>string modelVersion = 5;</code>
     * @param value The bytes for modelVersion to set.
     * @return This builder for chaining.
     */
    public Builder setModelVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelVersionBytes(value);
      return this;
    }

    /**
     * <pre>
     * Model prompt instructs the user to say something during enrollment
     * </pre>
     *
     * <code>string modelPrompt = 6;</code>
     * @return The modelPrompt.
     */
    @java.lang.Override
    public java.lang.String getModelPrompt() {
      return instance.getModelPrompt();
    }
    /**
     * <pre>
     * Model prompt instructs the user to say something during enrollment
     * </pre>
     *
     * <code>string modelPrompt = 6;</code>
     * @return The bytes for modelPrompt.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelPromptBytes() {
      return instance.getModelPromptBytes();
    }
    /**
     * <pre>
     * Model prompt instructs the user to say something during enrollment
     * </pre>
     *
     * <code>string modelPrompt = 6;</code>
     * @param value The modelPrompt to set.
     * @return This builder for chaining.
     */
    public Builder setModelPrompt(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelPrompt(value);
      return this;
    }
    /**
     * <pre>
     * Model prompt instructs the user to say something during enrollment
     * </pre>
     *
     * <code>string modelPrompt = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelPrompt() {
      copyOnWrite();
      instance.clearModelPrompt();
      return this;
    }
    /**
     * <pre>
     * Model prompt instructs the user to say something during enrollment
     * </pre>
     *
     * <code>string modelPrompt = 6;</code>
     * @param value The bytes for modelPrompt to set.
     * @return This builder for chaining.
     */
    public Builder setModelPromptBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelPromptBytes(value);
      return this;
    }

    /**
     * <pre>
     * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
     * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
     * </pre>
     *
     * <code>int64 percentSegmentComplete = 7;</code>
     * @return The percentSegmentComplete.
     */
    @java.lang.Override
    public long getPercentSegmentComplete() {
      return instance.getPercentSegmentComplete();
    }
    /**
     * <pre>
     * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
     * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
     * </pre>
     *
     * <code>int64 percentSegmentComplete = 7;</code>
     * @param value The percentSegmentComplete to set.
     * @return This builder for chaining.
     */
    public Builder setPercentSegmentComplete(long value) {
      copyOnWrite();
      instance.setPercentSegmentComplete(value);
      return this;
    }
    /**
     * <pre>
     * Percent complete as values between 0 and 100 indicating the progress of the current enrollment segment.
     * This is relevent in liveness enrollment where multiple groups of numbers must be spoken.
     * </pre>
     *
     * <code>int64 percentSegmentComplete = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentSegmentComplete() {
      copyOnWrite();
      instance.clearPercentSegmentComplete();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.CreateEnrollmentResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "percentComplete_",
            "audioEnergy_",
            "enrollmentId_",
            "modelName_",
            "modelVersion_",
            "modelPrompt_",
            "percentSegmentComplete_",
          };
          java.lang.String info =
              "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0001" +
              "\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.CreateEnrollmentResponse)
  private static final ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse DEFAULT_INSTANCE;
  static {
    CreateEnrollmentResponse defaultInstance = new CreateEnrollmentResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateEnrollmentResponse.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.audio.CreateEnrollmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateEnrollmentResponse> PARSER;

  public static com.google.protobuf.Parser<CreateEnrollmentResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

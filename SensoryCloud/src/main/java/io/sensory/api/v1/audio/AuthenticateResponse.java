// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package io.sensory.api.v1.audio;

/**
 * <pre>
 * Response to an authentication request
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.audio.AuthenticateResponse}
 */
public  final class AuthenticateResponse extends
    com.google.protobuf.GeneratedMessageLite<
        AuthenticateResponse, AuthenticateResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.AuthenticateResponse)
    AuthenticateResponseOrBuilder {
  private AuthenticateResponse() {
    userId_ = "";
    enrollmentId_ = "";
    modelPrompt_ = "";
  }
  public static final int AUDIOENERGY_FIELD_NUMBER = 1;
  private float audioEnergy_;
  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 1;</code>
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
   * <code>float audioEnergy = 1;</code>
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
   * <code>float audioEnergy = 1;</code>
   */
  private void clearAudioEnergy() {
    
    audioEnergy_ = 0F;
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private boolean success_;
  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }
  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @param value The success to set.
   */
  private void setSuccess(boolean value) {
    
    success_ = value;
  }
  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   */
  private void clearSuccess() {
    
    success_ = false;
  }

  public static final int TOKEN_FIELD_NUMBER = 3;
  private io.sensory.api.common.TokenResponse token_;
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   */
  @java.lang.Override
  public boolean hasToken() {
    return token_ != null;
  }
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   */
  @java.lang.Override
  public io.sensory.api.common.TokenResponse getToken() {
    return token_ == null ? io.sensory.api.common.TokenResponse.getDefaultInstance() : token_;
  }
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   */
  private void setToken(io.sensory.api.common.TokenResponse value) {
    value.getClass();
  token_ = value;
    
    }
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeToken(io.sensory.api.common.TokenResponse value) {
    value.getClass();
  if (token_ != null &&
        token_ != io.sensory.api.common.TokenResponse.getDefaultInstance()) {
      token_ =
        io.sensory.api.common.TokenResponse.newBuilder(token_).mergeFrom(value).buildPartial();
    } else {
      token_ = value;
    }
    
  }
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   */
  private void clearToken() {  token_ = null;
    
  }

  public static final int USERID_FIELD_NUMBER = 4;
  private java.lang.String userId_;
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @param value The userId to set.
   */
  private void setUserId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userId_ = value;
  }
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @param value The bytes for userId to set.
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userId_ = value.toStringUtf8();
    
  }

  public static final int ENROLLMENTID_FIELD_NUMBER = 5;
  private java.lang.String enrollmentId_;
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @return The enrollmentId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentId() {
    return enrollmentId_;
  }
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @return The bytes for enrollmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(enrollmentId_);
  }
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @param value The enrollmentId to set.
   */
  private void setEnrollmentId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    enrollmentId_ = value;
  }
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   */
  private void clearEnrollmentId() {
    
    enrollmentId_ = getDefaultInstance().getEnrollmentId();
  }
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @param value The bytes for enrollmentId to set.
   */
  private void setEnrollmentIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    enrollmentId_ = value.toStringUtf8();
    
  }

  public static final int MODELPROMPT_FIELD_NUMBER = 6;
  private java.lang.String modelPrompt_;
  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
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
   * Model prompt instructs the user to say something during authentication
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
   * Model prompt instructs the user to say something during authentication
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
   * Model prompt instructs the user to say something during authentication
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   */
  private void clearModelPrompt() {
    
    modelPrompt_ = getDefaultInstance().getModelPrompt();
  }
  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
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
   * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
   * This is relevent in liveness enrollment where multiple numbers must be spoken.
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
   * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
   * This is relevent in liveness enrollment where multiple numbers must be spoken.
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
   * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
   * This is relevent in liveness enrollment where multiple numbers must be spoken.
   * </pre>
   *
   * <code>int64 percentSegmentComplete = 7;</code>
   */
  private void clearPercentSegmentComplete() {
    
    percentSegmentComplete_ = 0L;
  }

  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.sensory.api.v1.audio.AuthenticateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.sensory.api.v1.audio.AuthenticateResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Response to an authentication request
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.audio.AuthenticateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.sensory.api.v1.audio.AuthenticateResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.AuthenticateResponse)
      io.sensory.api.v1.audio.AuthenticateResponseOrBuilder {
    // Construct using io.sensory.api.v1.audio.AuthenticateResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Relative energy of the processed audio as a value between 0 and 1
     * </pre>
     *
     * <code>float audioEnergy = 1;</code>
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
     * <code>float audioEnergy = 1;</code>
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
     * <code>float audioEnergy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioEnergy() {
      copyOnWrite();
      instance.clearAudioEnergy();
      return this;
    }

    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return instance.getSuccess();
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      copyOnWrite();
      instance.setSuccess(value);
      return this;
    }
    /**
     * <pre>
     * Success / Failure bit
     * </pre>
     *
     * <code>bool success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      copyOnWrite();
      instance.clearSuccess();
      return this;
    }

    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    @java.lang.Override
    public boolean hasToken() {
      return instance.hasToken();
    }
    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    @java.lang.Override
    public io.sensory.api.common.TokenResponse getToken() {
      return instance.getToken();
    }
    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    public Builder setToken(io.sensory.api.common.TokenResponse value) {
      copyOnWrite();
      instance.setToken(value);
      return this;
      }
    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    public Builder setToken(
        io.sensory.api.common.TokenResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setToken(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    public Builder mergeToken(io.sensory.api.common.TokenResponse value) {
      copyOnWrite();
      instance.mergeToken(value);
      return this;
    }
    /**
     * <pre>
     * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
     * </pre>
     *
     * <code>.sensory.api.common.TokenResponse token = 3;</code>
     */
    public Builder clearToken() {  copyOnWrite();
      instance.clearToken();
      return this;
    }

    /**
     * <pre>
     * The userID of the authenticated user
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string userId = 4;</code>
     * @return The userId.
     */
    @java.lang.Override
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The userID of the authenticated user
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string userId = 4;</code>
     * @return The bytes for userId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The userID of the authenticated user
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string userId = 4;</code>
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
     * The userID of the authenticated user
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string userId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The userID of the authenticated user
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string userId = 4;</code>
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
     * The enrollmentID of the authenticated enrollment
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string enrollmentId = 5;</code>
     * @return The enrollmentId.
     */
    @java.lang.Override
    public java.lang.String getEnrollmentId() {
      return instance.getEnrollmentId();
    }
    /**
     * <pre>
     * The enrollmentID of the authenticated enrollment
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string enrollmentId = 5;</code>
     * @return The bytes for enrollmentId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnrollmentIdBytes() {
      return instance.getEnrollmentIdBytes();
    }
    /**
     * <pre>
     * The enrollmentID of the authenticated enrollment
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string enrollmentId = 5;</code>
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
     * The enrollmentID of the authenticated enrollment
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string enrollmentId = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentId() {
      copyOnWrite();
      instance.clearEnrollmentId();
      return this;
    }
    /**
     * <pre>
     * The enrollmentID of the authenticated enrollment
     * Useful when evaluating enrollment groups
     * </pre>
     *
     * <code>string enrollmentId = 5;</code>
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
     * Model prompt instructs the user to say something during authentication
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
     * Model prompt instructs the user to say something during authentication
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
     * Model prompt instructs the user to say something during authentication
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
     * Model prompt instructs the user to say something during authentication
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
     * Model prompt instructs the user to say something during authentication
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
     * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
     * This is relevent in liveness enrollment where multiple numbers must be spoken.
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
     * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
     * This is relevent in liveness enrollment where multiple numbers must be spoken.
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
     * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
     * This is relevent in liveness enrollment where multiple numbers must be spoken.
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

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.AuthenticateResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.sensory.api.v1.audio.AuthenticateResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "audioEnergy_",
            "success_",
            "token_",
            "userId_",
            "enrollmentId_",
            "modelPrompt_",
            "percentSegmentComplete_",
          };
          java.lang.String info =
              "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0002\u0007" +
              "\u0003\t\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.sensory.api.v1.audio.AuthenticateResponse> parser = PARSER;
        if (parser == null) {
          synchronized (io.sensory.api.v1.audio.AuthenticateResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.sensory.api.v1.audio.AuthenticateResponse>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.AuthenticateResponse)
  private static final io.sensory.api.v1.audio.AuthenticateResponse DEFAULT_INSTANCE;
  static {
    AuthenticateResponse defaultInstance = new AuthenticateResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AuthenticateResponse.class, defaultInstance);
  }

  public static io.sensory.api.v1.audio.AuthenticateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AuthenticateResponse> PARSER;

  public static com.google.protobuf.Parser<AuthenticateResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


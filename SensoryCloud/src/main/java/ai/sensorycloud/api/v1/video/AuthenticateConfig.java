// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

/**
 * <pre>
 * Provides information for an image-based authentication
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.video.AuthenticateConfig}
 */
public  final class AuthenticateConfig extends
    com.google.protobuf.GeneratedMessageLite<
        AuthenticateConfig, AuthenticateConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.video.AuthenticateConfig)
    AuthenticateConfigOrBuilder {
  private AuthenticateConfig() {
  }
  private int authIdCase_ = 0;
  private java.lang.Object authId_;
  public enum AuthIdCase {
    ENROLLMENTID(1),
    ENROLLMENTGROUPID(2),
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
        case 1: return ENROLLMENTID;
        case 2: return ENROLLMENTGROUPID;
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

  public static final int ENROLLMENTID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentId field is set.
   */
  @java.lang.Override
  public boolean hasEnrollmentId() {
    return authIdCase_ == 1;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return The enrollmentId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentId() {
    java.lang.String ref = "";
    if (authIdCase_ == 1) {
      ref = (java.lang.String) authId_;
    }
    return ref;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for enrollmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentIdBytes() {
    java.lang.String ref = "";
    if (authIdCase_ == 1) {
      ref = (java.lang.String) authId_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @param value The enrollmentId to set.
   */
  private void setEnrollmentId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  authIdCase_ = 1;
    authId_ = value;
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearEnrollmentId() {
    if (authIdCase_ == 1) {
      authIdCase_ = 0;
      authId_ = null;
    }
  }
  /**
   * <pre>
   * Unique identifier created at enrollment
   * </pre>
   *
   * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for enrollmentId to set.
   */
  private void setEnrollmentIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    authId_ = value.toStringUtf8();
    authIdCase_ = 1;
  }

  public static final int ENROLLMENTGROUPID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return Whether the enrollmentGroupId field is set.
   */
  @java.lang.Override
  public boolean hasEnrollmentGroupId() {
    return authIdCase_ == 2;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return The enrollmentGroupId.
   */
  @java.lang.Override
  public java.lang.String getEnrollmentGroupId() {
    java.lang.String ref = "";
    if (authIdCase_ == 2) {
      ref = (java.lang.String) authId_;
    }
    return ref;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @return The bytes for enrollmentGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnrollmentGroupIdBytes() {
    java.lang.String ref = "";
    if (authIdCase_ == 2) {
      ref = (java.lang.String) authId_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @param value The enrollmentGroupId to set.
   */
  private void setEnrollmentGroupId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  authIdCase_ = 2;
    authId_ = value;
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   */
  private void clearEnrollmentGroupId() {
    if (authIdCase_ == 2) {
      authIdCase_ = 0;
      authId_ = null;
    }
  }
  /**
   * <pre>
   * Unique identifier for an enrollment group
   * </pre>
   *
   * <code>string enrollmentGroupId = 2;</code>
   * @param value The bytes for enrollmentGroupId to set.
   */
  private void setEnrollmentGroupIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    authId_ = value.toStringUtf8();
    authIdCase_ = 2;
  }

  public static final int ISLIVENESSENABLED_FIELD_NUMBER = 3;
  private boolean isLivenessEnabled_;
  /**
   * <pre>
   * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
   * </pre>
   *
   * <code>bool isLivenessEnabled = 3;</code>
   * @return The isLivenessEnabled.
   */
  @java.lang.Override
  public boolean getIsLivenessEnabled() {
    return isLivenessEnabled_;
  }
  /**
   * <pre>
   * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
   * </pre>
   *
   * <code>bool isLivenessEnabled = 3;</code>
   * @param value The isLivenessEnabled to set.
   */
  private void setIsLivenessEnabled(boolean value) {
    
    isLivenessEnabled_ = value;
  }
  /**
   * <pre>
   * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
   * </pre>
   *
   * <code>bool isLivenessEnabled = 3;</code>
   */
  private void clearIsLivenessEnabled() {
    
    isLivenessEnabled_ = false;
  }

  public static final int LIVENESSTHRESHOLD_FIELD_NUMBER = 4;
  private int livenessThreshold_;
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for livenessThreshold.
   */
  @java.lang.Override
  public int getLivenessThresholdValue() {
    return livenessThreshold_;
  }
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @return The livenessThreshold.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.video.RecognitionThreshold getLivenessThreshold() {
    ai.sensorycloud.api.v1.video.RecognitionThreshold result = ai.sensorycloud.api.v1.video.RecognitionThreshold.forNumber(livenessThreshold_);
    return result == null ? ai.sensorycloud.api.v1.video.RecognitionThreshold.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @param value The enum numeric value on the wire for livenessThreshold to set.
   */
  private void setLivenessThresholdValue(int value) {
      livenessThreshold_ = value;
  }
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   * @param value The livenessThreshold to set.
   */
  private void setLivenessThreshold(ai.sensorycloud.api.v1.video.RecognitionThreshold value) {
    livenessThreshold_ = value.getNumber();
    
  }
  /**
   * <pre>
   * The liveness threshold
   * </pre>
   *
   * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
   */
  private void clearLivenessThreshold() {
    
    livenessThreshold_ = 0;
  }

  public static final int COMPRESSION_FIELD_NUMBER = 5;
  private ai.sensorycloud.api.common.CompressionConfiguration compression_;
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  @java.lang.Override
  public boolean hasCompression() {
    return compression_ != null;
  }
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  @java.lang.Override
  public ai.sensorycloud.api.common.CompressionConfiguration getCompression() {
    return compression_ == null ? ai.sensorycloud.api.common.CompressionConfiguration.getDefaultInstance() : compression_;
  }
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  private void setCompression(ai.sensorycloud.api.common.CompressionConfiguration value) {
    value.getClass();
  compression_ = value;
    
    }
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeCompression(ai.sensorycloud.api.common.CompressionConfiguration value) {
    value.getClass();
  if (compression_ != null &&
        compression_ != ai.sensorycloud.api.common.CompressionConfiguration.getDefaultInstance()) {
      compression_ =
        ai.sensorycloud.api.common.CompressionConfiguration.newBuilder(compression_).mergeFrom(value).buildPartial();
    } else {
      compression_ = value;
    }
    
  }
  /**
   * <pre>
   * Information aobut how the video data will be compressed.
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
   */
  private void clearCompression() {  compression_ = null;
    
  }

  public static final int DOINCLUDETOKEN_FIELD_NUMBER = 6;
  private boolean doIncludeToken_;
  /**
   * <pre>
   * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
   * The OAuth token will only be returned if the authentication is successful.
   * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
   * </pre>
   *
   * <code>bool doIncludeToken = 6;</code>
   * @return The doIncludeToken.
   */
  @java.lang.Override
  public boolean getDoIncludeToken() {
    return doIncludeToken_;
  }
  /**
   * <pre>
   * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
   * The OAuth token will only be returned if the authentication is successful.
   * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
   * </pre>
   *
   * <code>bool doIncludeToken = 6;</code>
   * @param value The doIncludeToken to set.
   */
  private void setDoIncludeToken(boolean value) {
    
    doIncludeToken_ = value;
  }
  /**
   * <pre>
   * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
   * The OAuth token will only be returned if the authentication is successful.
   * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
   * </pre>
   *
   * <code>bool doIncludeToken = 6;</code>
   */
  private void clearDoIncludeToken() {
    
    doIncludeToken_ = false;
  }

  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.video.AuthenticateConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.video.AuthenticateConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Provides information for an image-based authentication
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.video.AuthenticateConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.video.AuthenticateConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.video.AuthenticateConfig)
      ai.sensorycloud.api.v1.video.AuthenticateConfigOrBuilder {
    // Construct using ai.sensorycloud.api.v1.video.AuthenticateConfig.newBuilder()
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
     * Unique identifier created at enrollment
     * </pre>
     *
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentId = 1 [(.validate.rules) = { ... }</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * <code>string enrollmentGroupId = 2;</code>
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
     * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
     * </pre>
     *
     * <code>bool isLivenessEnabled = 3;</code>
     * @return The isLivenessEnabled.
     */
    @java.lang.Override
    public boolean getIsLivenessEnabled() {
      return instance.getIsLivenessEnabled();
    }
    /**
     * <pre>
     * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
     * </pre>
     *
     * <code>bool isLivenessEnabled = 3;</code>
     * @param value The isLivenessEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setIsLivenessEnabled(boolean value) {
      copyOnWrite();
      instance.setIsLivenessEnabled(value);
      return this;
    }
    /**
     * <pre>
     * Enable a liveness check on the image, which will further improve the security of authentication at the expense of a slightly slower response.
     * </pre>
     *
     * <code>bool isLivenessEnabled = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLivenessEnabled() {
      copyOnWrite();
      instance.clearIsLivenessEnabled();
      return this;
    }

    /**
     * <pre>
     * The liveness threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for livenessThreshold.
     */
    @java.lang.Override
    public int getLivenessThresholdValue() {
      return instance.getLivenessThresholdValue();
    }
    /**
     * <pre>
     * The liveness threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
     * @param value The livenessThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setLivenessThresholdValue(int value) {
      copyOnWrite();
      instance.setLivenessThresholdValue(value);
      return this;
    }
    /**
     * <pre>
     * The liveness threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
     * @return The livenessThreshold.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.video.RecognitionThreshold getLivenessThreshold() {
      return instance.getLivenessThreshold();
    }
    /**
     * <pre>
     * The liveness threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for livenessThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setLivenessThreshold(ai.sensorycloud.api.v1.video.RecognitionThreshold value) {
      copyOnWrite();
      instance.setLivenessThreshold(value);
      return this;
    }
    /**
     * <pre>
     * The liveness threshold
     * </pre>
     *
     * <code>.sensory.api.v1.video.RecognitionThreshold livenessThreshold = 4 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLivenessThreshold() {
      copyOnWrite();
      instance.clearLivenessThreshold();
      return this;
    }

    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    @java.lang.Override
    public boolean hasCompression() {
      return instance.hasCompression();
    }
    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    @java.lang.Override
    public ai.sensorycloud.api.common.CompressionConfiguration getCompression() {
      return instance.getCompression();
    }
    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    public Builder setCompression(ai.sensorycloud.api.common.CompressionConfiguration value) {
      copyOnWrite();
      instance.setCompression(value);
      return this;
      }
    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    public Builder setCompression(
        ai.sensorycloud.api.common.CompressionConfiguration.Builder builderForValue) {
      copyOnWrite();
      instance.setCompression(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    public Builder mergeCompression(ai.sensorycloud.api.common.CompressionConfiguration value) {
      copyOnWrite();
      instance.mergeCompression(value);
      return this;
    }
    /**
     * <pre>
     * Information aobut how the video data will be compressed.
     * </pre>
     *
     * <code>.sensory.api.common.CompressionConfiguration compression = 5;</code>
     */
    public Builder clearCompression() {  copyOnWrite();
      instance.clearCompression();
      return this;
    }

    /**
     * <pre>
     * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
     * The OAuth token will only be returned if the authentication is successful.
     * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
     * </pre>
     *
     * <code>bool doIncludeToken = 6;</code>
     * @return The doIncludeToken.
     */
    @java.lang.Override
    public boolean getDoIncludeToken() {
      return instance.getDoIncludeToken();
    }
    /**
     * <pre>
     * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
     * The OAuth token will only be returned if the authentication is successful.
     * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
     * </pre>
     *
     * <code>bool doIncludeToken = 6;</code>
     * @param value The doIncludeToken to set.
     * @return This builder for chaining.
     */
    public Builder setDoIncludeToken(boolean value) {
      copyOnWrite();
      instance.setDoIncludeToken(value);
      return this;
    }
    /**
     * <pre>
     * A boolean indicating if the response should include an OAuth token for the user associated with the enrollmentId
     * The OAuth token will only be returned if the authentication is successful.
     * It's important to note there will be a minor performance hit to authentication, as OAuth token generation is a semi-expensive operation.
     * </pre>
     *
     * <code>bool doIncludeToken = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoIncludeToken() {
      copyOnWrite();
      instance.clearDoIncludeToken();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.video.AuthenticateConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.video.AuthenticateConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "authId_",
            "authIdCase_",
            "isLivenessEnabled_",
            "livenessThreshold_",
            "compression_",
            "doIncludeToken_",
          };
          java.lang.String info =
              "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u023b\u0000\u0002" +
              "\u023b\u0000\u0003\u0007\u0004\f\u0005\t\u0006\u0007";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.video.AuthenticateConfig> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.video.AuthenticateConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.video.AuthenticateConfig>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.v1.video.AuthenticateConfig)
  private static final ai.sensorycloud.api.v1.video.AuthenticateConfig DEFAULT_INSTANCE;
  static {
    AuthenticateConfig defaultInstance = new AuthenticateConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AuthenticateConfig.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.video.AuthenticateConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AuthenticateConfig> PARSER;

  public static com.google.protobuf.Parser<AuthenticateConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package io.sensory.api.v1.audio;

public interface CreateEnrollmentConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.CreateEnrollmentConfig)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   * <pre>
   * Required. Provides information that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.AudioConfig audio = 1 [(.validate.rules) = { ... }</code>
   * @return The audio.
   */
  io.sensory.api.v1.audio.AudioConfig getAudio();

  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The unique user Identifer. This value should be a unique email address or username known by the user.
   * </pre>
   *
   * <code>string userId = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * The unique device Identifer. This value should be something retrieved by the devie prior to enrollment (like MAC Address)
   * this value is used to identify a device uniquely across multiple enrollments
   * </pre>
   *
   * <code>string deviceId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of background model to be enrolled in
   * Background models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Description of the enrollment as entered by the user.
   * Max length is 1023 characters
   * </pre>
   *
   * <code>string description = 5 [(.validate.rules) = { ... }</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the enrollment as entered by the user.
   * Max length is 1023 characters
   * </pre>
   *
   * <code>string description = 5 [(.validate.rules) = { ... }</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Enable liveness if supported by the audio model
   * </pre>
   *
   * <code>bool isLivenessEnabled = 6;</code>
   * @return The isLivenessEnabled.
   */
  boolean getIsLivenessEnabled();

  /**
   * <pre>
   * The number of times a specific phrase should be uttered during an enrollment.
   * The default value is 4.
   * </pre>
   *
   * <code>uint32 enrollmentNumUtterances = 7 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentNumUtterances field is set.
   */
  boolean hasEnrollmentNumUtterances();
  /**
   * <pre>
   * The number of times a specific phrase should be uttered during an enrollment.
   * The default value is 4.
   * </pre>
   *
   * <code>uint32 enrollmentNumUtterances = 7 [(.validate.rules) = { ... }</code>
   * @return The enrollmentNumUtterances.
   */
  int getEnrollmentNumUtterances();

  /**
   * <pre>
   * The allowed length of text-independent enrollments (such as digit liveness)
   * The default value is 12.5 seconds without liveness and 8 seconds with liveness.
   * </pre>
   *
   * <code>float enrollmentDuration = 8 [(.validate.rules) = { ... }</code>
   * @return Whether the enrollmentDuration field is set.
   */
  boolean hasEnrollmentDuration();
  /**
   * <pre>
   * The allowed length of text-independent enrollments (such as digit liveness)
   * The default value is 12.5 seconds without liveness and 8 seconds with liveness.
   * </pre>
   *
   * <code>float enrollmentDuration = 8 [(.validate.rules) = { ... }</code>
   * @return The enrollmentDuration.
   */
  float getEnrollmentDuration();

  /**
   * <pre>
   * Reference Id allows clients to assign their own identifier to enrollments for various purposes
   * such as tying an audio and video enrollment together.
   * </pre>
   *
   * <code>string referenceId = 9 [(.validate.rules) = { ... }</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * Reference Id allows clients to assign their own identifier to enrollments for various purposes
   * such as tying an audio and video enrollment together.
   * </pre>
   *
   * <code>string referenceId = 9 [(.validate.rules) = { ... }</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();

  public io.sensory.api.v1.audio.CreateEnrollmentConfig.EnrollLengthCase getEnrollLengthCase();
}

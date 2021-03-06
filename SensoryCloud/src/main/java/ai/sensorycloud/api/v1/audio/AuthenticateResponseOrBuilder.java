// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface AuthenticateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.AuthenticateResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Relative energy of the processed audio as a value between 0 and 1
   * </pre>
   *
   * <code>float audioEnergy = 1;</code>
   * @return The audioEnergy.
   */
  float getAudioEnergy();

  /**
   * <pre>
   * Success / Failure bit
   * </pre>
   *
   * <code>bool success = 2;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * Optional token that will be returned upon a successful authentication if doIncludeToken is set to true in the AuthenticateConfig
   * </pre>
   *
   * <code>.sensory.api.common.TokenResponse token = 3;</code>
   * @return The token.
   */
  ai.sensorycloud.api.common.TokenResponse getToken();

  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The userID of the authenticated user
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string userId = 4;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @return The enrollmentId.
   */
  java.lang.String getEnrollmentId();
  /**
   * <pre>
   * The enrollmentID of the authenticated enrollment
   * Useful when evaluating enrollment groups
   * </pre>
   *
   * <code>string enrollmentId = 5;</code>
   * @return The bytes for enrollmentId.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdBytes();

  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @return The modelPrompt.
   */
  java.lang.String getModelPrompt();
  /**
   * <pre>
   * Model prompt instructs the user to say something during authentication
   * </pre>
   *
   * <code>string modelPrompt = 6;</code>
   * @return The bytes for modelPrompt.
   */
  com.google.protobuf.ByteString
      getModelPromptBytes();

  /**
   * <pre>
   * Percent complete as values between 0 and 100 indicating the progress of the current authentication segment.
   * This is relevent in liveness enrollment where multiple numbers must be spoken.
   * </pre>
   *
   * <code>int64 percentSegmentComplete = 7;</code>
   * @return The percentSegmentComplete.
   */
  long getPercentSegmentComplete();
}

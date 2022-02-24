// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface ValidateEnrolledEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.ValidateEnrolledEventRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateEnrolledEventRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ValidateEnrolledEventConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `ValidateEnrolledEventRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ValidateEnrolledEventConfig config = 1;</code>
   * @return The config.
   */
  ai.sensorycloud.api.v1.audio.ValidateEnrolledEventConfig getConfig();

  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `ValidateEnrolledEventRequest` messages. The first
   * `ValidateEnrolledEventRequest` message must not contain `audioContent` data
   * and all subsequent `ValidateEnrolledEventRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `ValidateEnrolledEventConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return Whether the audioContent field is set.
   */
  boolean hasAudioContent();
  /**
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `ValidateEnrolledEventRequest` messages. The first
   * `ValidateEnrolledEventRequest` message must not contain `audioContent` data
   * and all subsequent `ValidateEnrolledEventRequest` messages must contain
   * `audioContent` data. The audio bytes must be encoded as specified in
   * `ValidateEnrolledEventConfig`.
   * </pre>
   *
   * <code>bytes audioContent = 2;</code>
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();

  public ai.sensorycloud.api.v1.audio.ValidateEnrolledEventRequest.StreamingRequestCase getStreamingRequestCase();
}
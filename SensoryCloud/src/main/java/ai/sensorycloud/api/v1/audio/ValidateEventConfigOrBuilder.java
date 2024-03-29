// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface ValidateEventConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.ValidateEventConfig)
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
  ai.sensorycloud.api.v1.audio.AudioConfig getAudio();

  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of model to validate against
   * Models can be retrieved from the GetModels() gRPC call
   * </pre>
   *
   * <code>string modelName = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The unique user Identifer
   * </pre>
   *
   * <code>string userId = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for sensitivity.
   */
  int getSensitivityValue();
  /**
   * <pre>
   * The model sensitivity
   * </pre>
   *
   * <code>.sensory.api.v1.audio.ThresholdSensitivity sensitivity = 4 [(.validate.rules) = { ... }</code>
   * @return The sensitivity.
   */
  ai.sensorycloud.api.v1.audio.ThresholdSensitivity getSensitivity();

  /**
   * <pre>
   * TopN is for the sound_id_topn model and dictates the top N most likely
   * results to return
   * </pre>
   *
   * <code>int32 topN = 5;</code>
   * @return The topN.
   */
  int getTopN();
}

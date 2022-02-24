// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package io.sensory.api.v1.video;

public interface CreateEnrollmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.CreateEnrollmentRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrollmentRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.CreateEnrollmentConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrollmentRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.video.CreateEnrollmentConfig config = 1;</code>
   * @return The config.
   */
  io.sensory.api.v1.video.CreateEnrollmentConfig getConfig();

  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return Whether the imageContent field is set.
   */
  boolean hasImageContent();
  /**
   * <pre>
   * The image content to be recognized sent as bytes.
   * </pre>
   *
   * <code>bytes imageContent = 2;</code>
   * @return The imageContent.
   */
  com.google.protobuf.ByteString getImageContent();

  public io.sensory.api.v1.video.CreateEnrollmentRequest.StreamingRequestCase getStreamingRequestCase();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

public interface AssistantMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.assistant.AssistantMessageRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Provides information that specifies how to process the
   * request. The first `CreateEnrollmentRequest` message must contain a
   * `config`  message.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantMessageConfig config = 1;</code>
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
   * <code>.sensory.api.v1.assistant.AssistantMessageConfig config = 1;</code>
   * @return The config.
   */
  ai.sensorycloud.api.v1.assistant.AssistantMessageConfig getConfig();

  /**
   * <pre>
   * The data to be recognized. Sequential chunks of data are sent
   * in sequential `AssistantMessageRequest` messages. The first
   * `AssistantMessageRequest` message must not contain `config` data
   * and all subsequent `AssistantMessageRequest` messages must contain
   * `message` data.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantMessage message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * The data to be recognized. Sequential chunks of data are sent
   * in sequential `AssistantMessageRequest` messages. The first
   * `AssistantMessageRequest` message must not contain `config` data
   * and all subsequent `AssistantMessageRequest` messages must contain
   * `message` data.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantMessage message = 2;</code>
   * @return The message.
   */
  ai.sensorycloud.api.v1.assistant.AssistantMessage getMessage();

  /**
   * <pre>
   * Message used to instruct the assistant engine to process audio data.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantPostProcessingActionRequest postProcessingAction = 10;</code>
   * @return Whether the postProcessingAction field is set.
   */
  boolean hasPostProcessingAction();
  /**
   * <pre>
   * Message used to instruct the assistant engine to process audio data.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantPostProcessingActionRequest postProcessingAction = 10;</code>
   * @return The postProcessingAction.
   */
  ai.sensorycloud.api.v1.assistant.AssistantPostProcessingActionRequest getPostProcessingAction();

  public ai.sensorycloud.api.v1.assistant.AssistantMessageRequest.StreamingRequestCase getStreamingRequestCase();
}
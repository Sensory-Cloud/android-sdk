// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/assistant/assistant.proto

package ai.sensorycloud.api.v1.assistant;

public interface AssistantPostProcessingActionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.assistant.AssistantPostProcessingActionResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * ID that can be set by the client. This ID will be returned to the client upon a successful flush or reset.
   * </pre>
   *
   * <code>string actionId = 1;</code>
   * @return The actionId.
   */
  java.lang.String getActionId();
  /**
   * <pre>
   * ID that can be set by the client. This ID will be returned to the client upon a successful flush or reset.
   * </pre>
   *
   * <code>string actionId = 1;</code>
   * @return The bytes for actionId.
   */
  com.google.protobuf.ByteString
      getActionIdBytes();

  /**
   * <pre>
   * The specific action that is being requested.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantPostProcessingAction action = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * The specific action that is being requested.
   * </pre>
   *
   * <code>.sensory.api.v1.assistant.AssistantPostProcessingAction action = 2 [(.validate.rules) = { ... }</code>
   * @return The action.
   */
  ai.sensorycloud.api.v1.assistant.AssistantPostProcessingAction getAction();
}

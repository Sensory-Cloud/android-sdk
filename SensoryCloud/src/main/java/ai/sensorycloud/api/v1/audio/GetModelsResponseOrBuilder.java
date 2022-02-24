// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

public interface GetModelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.audio.GetModelsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.AudioModel models = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.audio.AudioModel> 
      getModelsList();
  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.AudioModel models = 1;</code>
   */
  ai.sensorycloud.api.v1.audio.AudioModel getModels(int index);
  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.audio.AudioModel models = 1;</code>
   */
  int getModelsCount();
}

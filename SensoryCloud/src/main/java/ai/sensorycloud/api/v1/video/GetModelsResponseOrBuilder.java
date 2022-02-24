// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public interface GetModelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.GetModelsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.video.VideoModel models = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.video.VideoModel> 
      getModelsList();
  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.video.VideoModel models = 1;</code>
   */
  ai.sensorycloud.api.v1.video.VideoModel getModels(int index);
  /**
   * <pre>
   * List of supported models
   * </pre>
   *
   * <code>repeated .sensory.api.v1.video.VideoModel models = 1;</code>
   */
  int getModelsCount();
}

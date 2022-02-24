// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

public interface CompressionConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.common.CompressionConfiguration)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * List of every compression method that was used
   * </pre>
   *
   * <code>repeated .sensory.api.common.CompressionType compressions = 1;</code>
   * @return A list containing the compressions.
   */
  java.util.List<ai.sensorycloud.api.common.CompressionType> getCompressionsList();
  /**
   * <pre>
   * List of every compression method that was used
   * </pre>
   *
   * <code>repeated .sensory.api.common.CompressionType compressions = 1;</code>
   * @return The count of compressions.
   */
  int getCompressionsCount();
  /**
   * <pre>
   * List of every compression method that was used
   * </pre>
   *
   * <code>repeated .sensory.api.common.CompressionType compressions = 1;</code>
   * @param index The index of the element to return.
   * @return The compressions at the given index.
   */
  ai.sensorycloud.api.common.CompressionType getCompressions(int index);
  /**
   * <pre>
   * List of every compression method that was used
   * </pre>
   *
   * <code>repeated .sensory.api.common.CompressionType compressions = 1;</code>
   * @return A list containing the enum numeric values on the wire for compressions.
   */
  java.util.List<java.lang.Integer>
  getCompressionsValueList();
  /**
   * <pre>
   * List of every compression method that was used
   * </pre>
   *
   * <code>repeated .sensory.api.common.CompressionType compressions = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of compressions at the given index.
   */
  int getCompressionsValue(int index);
}

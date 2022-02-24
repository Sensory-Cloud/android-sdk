// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface FileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.FileRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string file = 1 [(.validate.rules) = { ... }</code>
   * @return The file.
   */
  java.lang.String getFile();
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string file = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString
      getFileBytes();

  /**
   * <pre>
   * The category of file requested with version information.
   * </pre>
   *
   * <code>.sensory.api.v1.file.VersionedFileCategory category = 2;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * The category of file requested with version information.
   * </pre>
   *
   * <code>.sensory.api.v1.file.VersionedFileCategory category = 2;</code>
   * @return The category.
   */
  ai.sensorycloud.api.v1.file.VersionedFileCategory getCategory();

  /**
   * <pre>
   * The offset value based on the number of bytes previously downloaded.
   * Useful if the download previously failed, and you'd like to start from where you left off.
   * </pre>
   *
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  long getOffset();
}

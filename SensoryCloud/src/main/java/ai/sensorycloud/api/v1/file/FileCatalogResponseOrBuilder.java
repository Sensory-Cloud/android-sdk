// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

public interface FileCatalogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.file.FileCatalogResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.file.FileCatalog> 
      getCatalogList();
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  ai.sensorycloud.api.v1.file.FileCatalog getCatalog(int index);
  /**
   * <pre>
   * The catalog of files
   * </pre>
   *
   * <code>repeated .sensory.api.v1.file.FileCatalog catalog = 1;</code>
   */
  int getCatalogCount();
}

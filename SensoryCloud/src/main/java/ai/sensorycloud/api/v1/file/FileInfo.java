// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/file/file.proto

package ai.sensorycloud.api.v1.file;

/**
 * <pre>
 * Information about the file
 * </pre>
 *
 * Protobuf type {@code sensory.api.v1.file.FileInfo}
 */
public  final class FileInfo extends
    com.google.protobuf.GeneratedMessageLite<
        FileInfo, FileInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.file.FileInfo)
    FileInfoOrBuilder {
  private FileInfo() {
    file_ = "";
    absolutePath_ = "";
    contentType_ = "";
    hash_ = "";
    tenantId_ = "";
  }
  public static final int FILE_FIELD_NUMBER = 1;
  private java.lang.String file_;
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    return file_;
  }
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(file_);
  }
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @param value The file to set.
   */
  private void setFile(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    file_ = value;
  }
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   */
  private void clearFile() {

    file_ = getDefaultInstance().getFile();
  }
  /**
   * <pre>
   * The name of the base file.
   * </pre>
   *
   * <code>string file = 1;</code>
   * @param value The bytes for file to set.
   */
  private void setFileBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    file_ = value.toStringUtf8();

  }

  public static final int ABSOLUTEPATH_FIELD_NUMBER = 2;
  private java.lang.String absolutePath_;
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The absolutePath.
   */
  @java.lang.Override
  public java.lang.String getAbsolutePath() {
    return absolutePath_;
  }
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @return The bytes for absolutePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAbsolutePathBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(absolutePath_);
  }
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @param value The absolutePath to set.
   */
  private void setAbsolutePath(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    absolutePath_ = value;
  }
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   */
  private void clearAbsolutePath() {

    absolutePath_ = getDefaultInstance().getAbsolutePath();
  }
  /**
   * <pre>
   * The complete path of the file to be downloaded
   * including the filename. (E.G my/file/path/file.txt)
   * </pre>
   *
   * <code>string absolutePath = 2;</code>
   * @param value The bytes for absolutePath to set.
   */
  private void setAbsolutePathBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    absolutePath_ = value.toStringUtf8();

  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private long size_;
  /**
   * <pre>
   * The full size of the file
   * </pre>
   *
   * <code>int64 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }
  /**
   * <pre>
   * The full size of the file
   * </pre>
   *
   * <code>int64 size = 3;</code>
   * @param value The size to set.
   */
  private void setSize(long value) {
    
    size_ = value;
  }
  /**
   * <pre>
   * The full size of the file
   * </pre>
   *
   * <code>int64 size = 3;</code>
   */
  private void clearSize() {

    size_ = 0L;
  }

  public static final int CONTENTTYPE_FIELD_NUMBER = 4;
  private java.lang.String contentType_;
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    return contentType_;
  }
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(contentType_);
  }
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @param value The contentType to set.
   */
  private void setContentType(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    contentType_ = value;
  }
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   */
  private void clearContentType() {

    contentType_ = getDefaultInstance().getContentType();
  }
  /**
   * <pre>
   * A standard MIME type describing the format of the file
   * </pre>
   *
   * <code>string contentType = 4;</code>
   * @param value The bytes for contentType to set.
   */
  private void setContentTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    contentType_ = value.toStringUtf8();

  }

  public static final int HASH_FIELD_NUMBER = 5;
  private java.lang.String hash_;
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    return hash_;
  }
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(hash_);
  }
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @param value The hash to set.
   */
  private void setHash(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    hash_ = value;
  }
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   */
  private void clearHash() {

    hash_ = getDefaultInstance().getHash();
  }
  /**
   * <pre>
   * The md5 file hash
   * </pre>
   *
   * <code>string hash = 5;</code>
   * @param value The bytes for hash to set.
   */
  private void setHashBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    hash_ = value.toStringUtf8();

  }

  public static final int TENANTID_FIELD_NUMBER = 6;
  private java.lang.String tenantId_;
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    return tenantId_;
  }
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tenantId_);
  }
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @param value The tenantId to set.
   */
  private void setTenantId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    tenantId_ = value;
  }
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   */
  private void clearTenantId() {

    tenantId_ = getDefaultInstance().getTenantId();
  }
  /**
   * <pre>
   * Optional tenantID associated with this file
   * </pre>
   *
   * <code>string tenantId = 6;</code>
   * @param value The bytes for tenantId to set.
   */
  private void setTenantIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    tenantId_ = value.toStringUtf8();

  }

  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static ai.sensorycloud.api.v1.file.FileInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static ai.sensorycloud.api.v1.file.FileInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.file.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.file.FileInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Information about the file
   * </pre>
   *
   * Protobuf type {@code sensory.api.v1.file.FileInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.file.FileInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.file.FileInfo)
      ai.sensorycloud.api.v1.file.FileInfoOrBuilder {
    // Construct using ai.sensorycloud.api.v1.file.FileInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The file.
     */
    @java.lang.Override
    public java.lang.String getFile() {
      return instance.getFile();
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return The bytes for file.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFileBytes() {
      return instance.getFileBytes();
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(
        java.lang.String value) {
      copyOnWrite();
      instance.setFile(value);
      return this;
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      copyOnWrite();
      instance.clearFile();
      return this;
    }
    /**
     * <pre>
     * The name of the base file.
     * </pre>
     *
     * <code>string file = 1;</code>
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFileBytes(value);
      return this;
    }

    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return The absolutePath.
     */
    @java.lang.Override
    public java.lang.String getAbsolutePath() {
      return instance.getAbsolutePath();
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return The bytes for absolutePath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAbsolutePathBytes() {
      return instance.getAbsolutePathBytes();
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @param value The absolutePath to set.
     * @return This builder for chaining.
     */
    public Builder setAbsolutePath(
        java.lang.String value) {
      copyOnWrite();
      instance.setAbsolutePath(value);
      return this;
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbsolutePath() {
      copyOnWrite();
      instance.clearAbsolutePath();
      return this;
    }
    /**
     * <pre>
     * The complete path of the file to be downloaded
     * including the filename. (E.G my/file/path/file.txt)
     * </pre>
     *
     * <code>string absolutePath = 2;</code>
     * @param value The bytes for absolutePath to set.
     * @return This builder for chaining.
     */
    public Builder setAbsolutePathBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAbsolutePathBytes(value);
      return this;
    }

    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return instance.getSize();
    }
    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {
      copyOnWrite();
      instance.setSize(value);
      return this;
    }
    /**
     * <pre>
     * The full size of the file
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      copyOnWrite();
      instance.clearSize();
      return this;
    }

    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return The contentType.
     */
    @java.lang.Override
    public java.lang.String getContentType() {
      return instance.getContentType();
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return The bytes for contentType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentTypeBytes() {
      return instance.getContentTypeBytes();
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(
        java.lang.String value) {
      copyOnWrite();
      instance.setContentType(value);
      return this;
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      copyOnWrite();
      instance.clearContentType();
      return this;
    }
    /**
     * <pre>
     * A standard MIME type describing the format of the file
     * </pre>
     *
     * <code>string contentType = 4;</code>
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setContentTypeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return The hash.
     */
    @java.lang.Override
    public java.lang.String getHash() {
      return instance.getHash();
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return The bytes for hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHashBytes() {
      return instance.getHashBytes();
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      copyOnWrite();
      instance.setHash(value);
      return this;
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      copyOnWrite();
      instance.clearHash();
      return this;
    }
    /**
     * <pre>
     * The md5 file hash
     * </pre>
     *
     * <code>string hash = 5;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHashBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @return The tenantId.
     */
    @java.lang.Override
    public java.lang.String getTenantId() {
      return instance.getTenantId();
    }
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @return The bytes for tenantId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      return instance.getTenantIdBytes();
    }
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTenantId(value);
      return this;
    }
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      copyOnWrite();
      instance.clearTenantId();
      return this;
    }
    /**
     * <pre>
     * Optional tenantID associated with this file
     * </pre>
     *
     * <code>string tenantId = 6;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTenantIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.file.FileInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.file.FileInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "file_",
            "absolutePath_",
            "size_",
            "contentType_",
            "hash_",
            "tenantId_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.file.FileInfo> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.file.FileInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.file.FileInfo>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sensory.api.v1.file.FileInfo)
  private static final ai.sensorycloud.api.v1.file.FileInfo DEFAULT_INSTANCE;
  static {
    FileInfo defaultInstance = new FileInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FileInfo.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.file.FileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FileInfo> PARSER;

  public static com.google.protobuf.Parser<FileInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


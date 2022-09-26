// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

public interface KeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.common.KeyResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The the uuid associated with this key
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name associated with this key
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   * <pre>
   * The key type
   * </pre>
   *
   * <code>.sensory.api.common.KeyType keyType = 3;</code>
   * @return The keyType.
   */
  ai.sensorycloud.api.common.KeyType getKeyType();

  /**
   * <pre>
   * Optional seconds until this key expires.
   * If this value is 0, this key will never expire
   * </pre>
   *
   * <code>int64 expiration = 4;</code>
   * @return The expiration.
   */
  long getExpiration();

  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * TenantId for this key
   * </pre>
   *
   * <code>string tenantId = 5;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <pre>
   * Indicates if this key is disabled
   * </pre>
   *
   * <code>bool disabled = 6;</code>
   * @return The disabled.
   */
  boolean getDisabled();
}

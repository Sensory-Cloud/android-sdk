// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package io.sensory.api.oauth;

public interface TokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.oauth.TokenRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * Unique client identifier created at enrollment
   * </pre>
   *
   * <code>string clientId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   * <pre>
   * Secret value correspoinding to the client ID
   * </pre>
   *
   * <code>string secret = 2;</code>
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString
      getSecretBytes();
}

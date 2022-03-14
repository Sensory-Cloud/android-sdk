// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/device.proto

package ai.sensorycloud.api.v1.management;

public interface DeleteDeviceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.DeleteDeviceRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * </pre>
   *
   * <code>string deviceId = 1 [(.validate.rules) = { ... }</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * The unique internal identifier for this device. Ideally, this value is static for the lifetime of the device.
   * </pre>
   *
   * <code>string deviceId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();
}
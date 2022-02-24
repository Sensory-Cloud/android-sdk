// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface EnrollmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.EnrollmentResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique enrollment idenfier (UUID)
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique enrollment idenfier (UUID)
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Created at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Created at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();

  /**
   * <pre>
   * Updated at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * Updated at epoch
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updatedAt = 3;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();

  /**
   * <pre>
   * User-entered Description
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User-entered Description
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Name of the model belonging to the enrollment
   * </pre>
   *
   * <code>string modelName = 5;</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of the model belonging to the enrollment
   * </pre>
   *
   * <code>string modelName = 5;</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Type of the model enrolled
   * </pre>
   *
   * <code>.sensory.api.common.ModelType modelType = 6;</code>
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <pre>
   * Type of the model enrolled
   * </pre>
   *
   * <code>.sensory.api.common.ModelType modelType = 6;</code>
   * @return The modelType.
   */
  ai.sensorycloud.api.common.ModelType getModelType();

  /**
   * <pre>
   * Version of the model enrolled
   * </pre>
   *
   * <code>string modelVersion = 7;</code>
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   * <pre>
   * Version of the model enrolled
   * </pre>
   *
   * <code>string modelVersion = 7;</code>
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString
      getModelVersionBytes();

  /**
   * <pre>
   * Id of the device that enrolled this model
   * </pre>
   *
   * <code>string deviceId = 8;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * Id of the device that enrolled this model
   * </pre>
   *
   * <code>string deviceId = 8;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   * Id of the user that enrolled this model
   * </pre>
   *
   * <code>string userId = 9;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Id of the user that enrolled this model
   * </pre>
   *
   * <code>string userId = 9;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The type of data compression that was used during enrollment creation
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 10;</code>
   * @return Whether the compression field is set.
   */
  boolean hasCompression();
  /**
   * <pre>
   * The type of data compression that was used during enrollment creation
   * </pre>
   *
   * <code>.sensory.api.common.CompressionConfiguration compression = 10;</code>
   * @return The compression.
   */
  ai.sensorycloud.api.common.CompressionConfiguration getCompression();

  /**
   * <pre>
   * Name of the device that enrolled this model
   * </pre>
   *
   * <code>string deviceName = 11;</code>
   * @return The deviceName.
   */
  java.lang.String getDeviceName();
  /**
   * <pre>
   * Name of the device that enrolled this model
   * </pre>
   *
   * <code>string deviceName = 11;</code>
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString
      getDeviceNameBytes();

  /**
   * <pre>
   * Indicates if liveness was evaluated during the enrollment
   * </pre>
   *
   * <code>bool didEnrollWithLiveness = 12;</code>
   * @return The didEnrollWithLiveness.
   */
  boolean getDidEnrollWithLiveness();

  /**
   * <pre>
   * Client-assigned referenceId for external use
   * </pre>
   *
   * <code>string referenceId = 13;</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * Client-assigned referenceId for external use
   * </pre>
   *
   * <code>string referenceId = 13;</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();
}

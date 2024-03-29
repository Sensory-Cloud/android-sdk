// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

public interface CreateEnrollmentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.video.CreateEnrollmentResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Percent Complete as values between 0 and 100
   * </pre>
   *
   * <code>int64 percentComplete = 1;</code>
   * @return The percentComplete.
   */
  long getPercentComplete();

  /**
   * <pre>
   * Liveness check bit. This value with always be false if 'isLivenessEnabled' is set to false in the CreateEnrollmentConfig
   * </pre>
   *
   * <code>bool isAlive = 2;</code>
   * @return The isAlive.
   */
  boolean getIsAlive();

  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The enrollmentId.
   */
  java.lang.String getEnrollmentId();
  /**
   * <pre>
   * If enrollment is successful, this value will be the unique Enrollment ID
   * </pre>
   *
   * <code>string enrollmentId = 3;</code>
   * @return The bytes for enrollmentId.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdBytes();

  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Model used for enrollment
   * </pre>
   *
   * <code>string modelName = 4;</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   * <pre>
   * Model version used for enrollment
   * </pre>
   *
   * <code>string modelVersion = 5;</code>
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString
      getModelVersionBytes();

  /**
   * <pre>
   * Score of the enrollment. Currently only used for error messages.
   * </pre>
   *
   * <code>float score = 6;</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * Encrypted enrollment token, this token should be included in authentication requests
   * If the server is configured to store enrollments server side, this will be left empty
   * </pre>
   *
   * <code>.sensory.api.common.EnrollmentToken enrollmentToken = 7;</code>
   * @return Whether the enrollmentToken field is set.
   */
  boolean hasEnrollmentToken();
  /**
   * <pre>
   * Encrypted enrollment token, this token should be included in authentication requests
   * If the server is configured to store enrollments server side, this will be left empty
   * </pre>
   *
   * <code>.sensory.api.common.EnrollmentToken enrollmentToken = 7;</code>
   * @return The enrollmentToken.
   */
  ai.sensorycloud.api.common.EnrollmentToken getEnrollmentToken();

  /**
   * <pre>
   * Indicates if a face was found in the uploaded image
   * </pre>
   *
   * <code>bool didFindFace = 8;</code>
   * @return The didFindFace.
   */
  boolean getDidFindFace();

  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 9;</code>
   * @return A list containing the boundingBox.
   */
  java.util.List<java.lang.Long> getBoundingBoxList();
  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 9;</code>
   * @return The count of boundingBox.
   */
  int getBoundingBoxCount();
  /**
   * <pre>
   * The bounding box of the face
   * </pre>
   *
   * <code>repeated int64 boundingBox = 9;</code>
   * @param index The index of the element to return.
   * @return The boundingBox at the given index.
   */
  long getBoundingBox(int index);

  /**
   * <pre>
   * The model's confidence in its face detection
   * </pre>
   *
   * <code>float probabilityFace = 10;</code>
   * @return The probabilityFace.
   */
  float getProbabilityFace();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface AppendEnrollmentGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.AppendEnrollmentGroupRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * Enrollment group ID to append enrollments to
   * </pre>
   *
   * <code>string groupId = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @return A list containing the enrollmentIds.
   */
  java.util.List<java.lang.String>
      getEnrollmentIdsList();
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @return The count of enrollmentIds.
   */
  int getEnrollmentIdsCount();
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param index The index of the element to return.
   * @return The enrollmentIds at the given index.
   */
  java.lang.String getEnrollmentIds(int index);
  /**
   * <pre>
   * List of enrollment IDS to append
   * </pre>
   *
   * <code>repeated string enrollmentIds = 2;</code>
   * @param index The index of the element to return.
   * @return The enrollmentIds at the given index.
   */
  com.google.protobuf.ByteString
      getEnrollmentIdsBytes(int index);
}

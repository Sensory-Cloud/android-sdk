// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/management/enrollment.proto

package ai.sensorycloud.api.v1.management;

public interface GetEnrollmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.v1.management.GetEnrollmentsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of enrollments
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 1;</code>
   */
  java.util.List<ai.sensorycloud.api.v1.management.EnrollmentResponse> 
      getEnrollmentsList();
  /**
   * <pre>
   * A list of enrollments
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 1;</code>
   */
  ai.sensorycloud.api.v1.management.EnrollmentResponse getEnrollments(int index);
  /**
   * <pre>
   * A list of enrollments
   * </pre>
   *
   * <code>repeated .sensory.api.v1.management.EnrollmentResponse enrollments = 1;</code>
   */
  int getEnrollmentsCount();

  /**
   * <pre>
   * An indication of if the requesting oauth agent is trusted for these enrollments.
   * If the device is not trusted, identifying information will be removed from the enrollment response.
   * </pre>
   *
   * <code>bool isRequestorTrusted = 2;</code>
   * @return The isRequestorTrusted.
   */
  boolean getIsRequestorTrusted();
}

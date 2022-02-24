// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

public interface CpuSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensory.api.common.CpuSummary)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * normal processes executing in user mode
   * </pre>
   *
   * <code>uint64 user = 1;</code>
   * @return The user.
   */
  long getUser();

  /**
   * <pre>
   * niced processes executing in user mode
   * </pre>
   *
   * <code>uint64 nice = 2;</code>
   * @return The nice.
   */
  long getNice();

  /**
   * <pre>
   * processes executing in kernel mode
   * </pre>
   *
   * <code>uint64 system = 3;</code>
   * @return The system.
   */
  long getSystem();

  /**
   * <pre>
   * idle cpu
   * </pre>
   *
   * <code>uint64 idle = 4;</code>
   * @return The idle.
   */
  long getIdle();

  /**
   * <pre>
   * waiting for I/O to complete
   * </pre>
   *
   * <code>uint64 ioWait = 5;</code>
   * @return The ioWait.
   */
  long getIoWait();

  /**
   * <pre>
   * servicing interrupts
   * </pre>
   *
   * <code>uint64 irq = 6;</code>
   * @return The irq.
   */
  long getIrq();

  /**
   * <pre>
   * servicing softirqs
   * </pre>
   *
   * <code>uint64 softIrq = 7;</code>
   * @return The softIrq.
   */
  long getSoftIrq();

  /**
   * <pre>
   * counts the ticks spent executing other virtual hosts
   * </pre>
   *
   * <code>uint64 steal = 8;</code>
   * @return The steal.
   */
  long getSteal();

  /**
   * <pre>
   * counts the time spent running a virtual CPU for guest operating systems under the control of the Linux kernel
   * </pre>
   *
   * <code>uint64 guest = 9;</code>
   * @return The guest.
   */
  long getGuest();

  /**
   * <pre>
   * time spent running a niced guest
   * </pre>
   *
   * <code>uint64 guestNice = 10;</code>
   * @return The guestNice.
   */
  long getGuestNice();
}

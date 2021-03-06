// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Generic NULL value
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.Void}
 */
public enum Void
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>VOID_VALUE = 0;</code>
   */
  VOID_VALUE(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VOID_VALUE = 0;</code>
   */
  public static final int VOID_VALUE_VALUE = 0;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The number of the enum to look for.
   * @return The enum associated with the given number.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Void valueOf(int value) {
    return forNumber(value);
  }

  public static Void forNumber(int value) {
    switch (value) {
      case 0: return VOID_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Void>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Void> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Void>() {
          @java.lang.Override
          public Void findValueByNumber(int number) {
            return Void.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return VoidVerifier.INSTANCE;
  }

  private static final class VoidVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new VoidVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return Void.forNumber(number) != null;
          }
        };

  private final int value;

  private Void(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.Void)
}


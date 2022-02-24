// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/video/video.proto

package ai.sensorycloud.api.v1.video;

/**
 * <pre>
 * Specifies how sensitive the recognition threshold of the model should be
 * </pre>
 *
 * Protobuf enum {@code sensory.api.v1.video.RecognitionThreshold}
 */
public enum RecognitionThreshold
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>LOW = 0;</code>
   */
  LOW(0),
  /**
   * <code>MEDIUM = 1;</code>
   */
  MEDIUM(1),
  /**
   * <code>HIGH = 2;</code>
   */
  HIGH(2),
  /**
   * <code>HIGHEST = 3;</code>
   */
  HIGHEST(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LOW = 0;</code>
   */
  public static final int LOW_VALUE = 0;
  /**
   * <code>MEDIUM = 1;</code>
   */
  public static final int MEDIUM_VALUE = 1;
  /**
   * <code>HIGH = 2;</code>
   */
  public static final int HIGH_VALUE = 2;
  /**
   * <code>HIGHEST = 3;</code>
   */
  public static final int HIGHEST_VALUE = 3;


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
  public static RecognitionThreshold valueOf(int value) {
    return forNumber(value);
  }

  public static RecognitionThreshold forNumber(int value) {
    switch (value) {
      case 0: return LOW;
      case 1: return MEDIUM;
      case 2: return HIGH;
      case 3: return HIGHEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RecognitionThreshold>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RecognitionThreshold> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RecognitionThreshold>() {
          @java.lang.Override
          public RecognitionThreshold findValueByNumber(int number) {
            return RecognitionThreshold.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return RecognitionThresholdVerifier.INSTANCE;
  }

  private static final class RecognitionThresholdVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new RecognitionThresholdVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return RecognitionThreshold.forNumber(number) != null;
          }
        };

  private final int value;

  private RecognitionThreshold(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.v1.video.RecognitionThreshold)
}

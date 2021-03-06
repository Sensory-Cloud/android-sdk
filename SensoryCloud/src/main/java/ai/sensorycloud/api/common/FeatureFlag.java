// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * Example ideas of possible FFs
 * Voice
 * VoiceBiometricTextDependent   FeatureFlag = iota // Voice Auth Text Dependent (Enrollable)
 * VoiceBiometricTextIndependent                    // Voice Auth Text Independent (Enrollable)
 * VoiceBiometricWakeword                           // Voice Wakeword (Enrollable)
 * VoiceEventWakeword                               // Voice Wakeword
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.FeatureFlag}
 */
public enum FeatureFlag
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * TssvAll feature set
   * </pre>
   *
   * <code>TSSV_ALL = 0;</code>
   */
  TSSV_ALL(0),
  /**
   * <pre>
   * TsAll feature set
   * </pre>
   *
   * <code>TS_ALL = 1;</code>
   */
  TS_ALL(1),
  /**
   * <pre>
   * TnlAll feature set
   * </pre>
   *
   * <code>TNL_ALL = 2;</code>
   */
  TNL_ALL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * TssvAll feature set
   * </pre>
   *
   * <code>TSSV_ALL = 0;</code>
   */
  public static final int TSSV_ALL_VALUE = 0;
  /**
   * <pre>
   * TsAll feature set
   * </pre>
   *
   * <code>TS_ALL = 1;</code>
   */
  public static final int TS_ALL_VALUE = 1;
  /**
   * <pre>
   * TnlAll feature set
   * </pre>
   *
   * <code>TNL_ALL = 2;</code>
   */
  public static final int TNL_ALL_VALUE = 2;


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
  public static FeatureFlag valueOf(int value) {
    return forNumber(value);
  }

  public static FeatureFlag forNumber(int value) {
    switch (value) {
      case 0: return TSSV_ALL;
      case 1: return TS_ALL;
      case 2: return TNL_ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureFlag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatureFlag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatureFlag>() {
          @java.lang.Override
          public FeatureFlag findValueByNumber(int number) {
            return FeatureFlag.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return FeatureFlagVerifier.INSTANCE;
  }

  private static final class FeatureFlagVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new FeatureFlagVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return FeatureFlag.forNumber(number) != null;
          }
        };

  private final int value;

  private FeatureFlag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.FeatureFlag)
}


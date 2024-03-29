// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * An enum denoting the type of Sensory technology employed
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.TechnologyType}
 */
public enum TechnologyType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Not Set type - used internally
   * </pre>
   *
   * <code>NOT_SET = 0;</code>
   */
  NOT_SET(0),
  /**
   * <pre>
   * Truly Secure Speaker Verification, an audio authentication and wakeword tool
   * </pre>
   *
   * <code>TSSV = 1;</code>
   */
  TSSV(1),
  /**
   * <pre>
   * Truly Secure, a face identification and liveness suite
   * </pre>
   *
   * <code>TS = 2;</code>
   */
  TS(2),
  /**
   * <pre>
   * Truly Natural, a wakeword and speech recognition tool
   * </pre>
   *
   * <code>TNL = 3;</code>
   */
  TNL(3),
  /**
   * <pre>
   * Speech to Text, a large scale neural speech recognition tool
   * </pre>
   *
   * <code>STT = 4;</code>
   */
  STT(4),
  /**
   * <pre>
   * Text to Speech, a voice synthesis tool
   * </pre>
   *
   * <code>TTS = 5;</code>
   */
  TTS(5),
  /**
   * <pre>
   * Sound Id, a sound identification tool
   * </pre>
   *
   * <code>SOUND_ID = 6;</code>
   */
  SOUND_ID(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not Set type - used internally
   * </pre>
   *
   * <code>NOT_SET = 0;</code>
   */
  public static final int NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Truly Secure Speaker Verification, an audio authentication and wakeword tool
   * </pre>
   *
   * <code>TSSV = 1;</code>
   */
  public static final int TSSV_VALUE = 1;
  /**
   * <pre>
   * Truly Secure, a face identification and liveness suite
   * </pre>
   *
   * <code>TS = 2;</code>
   */
  public static final int TS_VALUE = 2;
  /**
   * <pre>
   * Truly Natural, a wakeword and speech recognition tool
   * </pre>
   *
   * <code>TNL = 3;</code>
   */
  public static final int TNL_VALUE = 3;
  /**
   * <pre>
   * Speech to Text, a large scale neural speech recognition tool
   * </pre>
   *
   * <code>STT = 4;</code>
   */
  public static final int STT_VALUE = 4;
  /**
   * <pre>
   * Text to Speech, a voice synthesis tool
   * </pre>
   *
   * <code>TTS = 5;</code>
   */
  public static final int TTS_VALUE = 5;
  /**
   * <pre>
   * Sound Id, a sound identification tool
   * </pre>
   *
   * <code>SOUND_ID = 6;</code>
   */
  public static final int SOUND_ID_VALUE = 6;


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
  public static TechnologyType valueOf(int value) {
    return forNumber(value);
  }

  public static TechnologyType forNumber(int value) {
    switch (value) {
      case 0: return NOT_SET;
      case 1: return TSSV;
      case 2: return TS;
      case 3: return TNL;
      case 4: return STT;
      case 5: return TTS;
      case 6: return SOUND_ID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TechnologyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TechnologyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TechnologyType>() {
          @java.lang.Override
          public TechnologyType findValueByNumber(int number) {
            return TechnologyType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return TechnologyTypeVerifier.INSTANCE;
  }

  private static final class TechnologyTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TechnologyTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return TechnologyType.forNumber(number) != null;
          }
        };

  private final int value;

  private TechnologyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.TechnologyType)
}


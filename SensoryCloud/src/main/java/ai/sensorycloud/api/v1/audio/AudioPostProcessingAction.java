// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * Protobuf enum {@code sensory.api.v1.audio.AudioPostProcessingAction}
 */
public enum AudioPostProcessingAction
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Default value to perform no action
   * </pre>
   *
   * <code>NOT_SET = 0;</code>
   */
  NOT_SET(0),
  /**
   * <pre>
   * Request the audio engine to flush its buffers.
   * </pre>
   *
   * <code>FLUSH = 1;</code>
   */
  FLUSH(1),
  /**
   * <pre>
   * Request the audio engine reset itself.
   * </pre>
   *
   * <code>RESET = 2;</code>
   */
  RESET(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value to perform no action
   * </pre>
   *
   * <code>NOT_SET = 0;</code>
   */
  public static final int NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Request the audio engine to flush its buffers.
   * </pre>
   *
   * <code>FLUSH = 1;</code>
   */
  public static final int FLUSH_VALUE = 1;
  /**
   * <pre>
   * Request the audio engine reset itself.
   * </pre>
   *
   * <code>RESET = 2;</code>
   */
  public static final int RESET_VALUE = 2;


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
  public static AudioPostProcessingAction valueOf(int value) {
    return forNumber(value);
  }

  public static AudioPostProcessingAction forNumber(int value) {
    switch (value) {
      case 0: return NOT_SET;
      case 1: return FLUSH;
      case 2: return RESET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AudioPostProcessingAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AudioPostProcessingAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AudioPostProcessingAction>() {
          @java.lang.Override
          public AudioPostProcessingAction findValueByNumber(int number) {
            return AudioPostProcessingAction.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return AudioPostProcessingActionVerifier.INSTANCE;
  }

  private static final class AudioPostProcessingActionVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new AudioPostProcessingActionVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return AudioPostProcessingAction.forNumber(number) != null;
          }
        };

  private final int value;

  private AudioPostProcessingAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.v1.audio.AudioPostProcessingAction)
}


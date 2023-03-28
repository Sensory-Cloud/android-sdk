// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package ai.sensorycloud.api.common;

/**
 * <pre>
 * A type of model supported by this API
 * Note: if you change this enum, ensure to update schema.prisma ModelType
 * </pre>
 *
 * Protobuf enum {@code sensory.api.common.ModelType}
 */
public enum ModelType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Unknown Model Type
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * Voice Auth Text Independent (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_TEXT_INDEPENDENT = 1;</code>
   */
  VOICE_BIOMETRIC_TEXT_INDEPENDENT(1),
  /**
   * <pre>
   * Voice Wakeword (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_WAKEWORD = 2;</code>
   */
  VOICE_BIOMETRIC_WAKEWORD(2),
  /**
   * <pre>
   * Voice Wakeword
   * </pre>
   *
   * <code>VOICE_EVENT_WAKEWORD = 3;</code>
   */
  VOICE_EVENT_WAKEWORD(3),
  /**
   * <pre>
   * Voice Grammar Recognition such as LVCSR
   * </pre>
   *
   * <code>VOICE_TRANSCRIBE_GRAMMAR = 4;</code>
   */
  VOICE_TRANSCRIBE_GRAMMAR(4),
  /**
   * <pre>
   * Voice Commands and Search recognition
   * </pre>
   *
   * <code>VOICE_TRANSCRIBE_COMMAND_AND_SEARCH = 5;</code>
   */
  VOICE_TRANSCRIBE_COMMAND_AND_SEARCH(5),
  /**
   * <pre>
   * Voice activity detection
   * </pre>
   *
   * <code>VOICE_RECOGNITION_ACTIVITY_DETECTION = 6;</code>
   */
  VOICE_RECOGNITION_ACTIVITY_DETECTION(6),
  /**
   * <pre>
   * Voice feature extractor
   * </pre>
   *
   * <code>VOICE_FEATURE_EXTRACTOR = 7;</code>
   */
  VOICE_FEATURE_EXTRACTOR(7),
  /**
   * <pre>
   * Voice digit recognizer for liveness
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_LIVENESS_DIGIT = 8;</code>
   */
  VOICE_BIOMETRIC_LIVENESS_DIGIT(8),
  /**
   * <pre>
   * Voice Auth Text Dependent (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_TEXT_DEPENDENT = 9;</code>
   */
  VOICE_BIOMETRIC_TEXT_DEPENDENT(9),
  /**
   * <pre>
   * Voice Synthesis
   * </pre>
   *
   * <code>VOICE_SYNTHESIS = 10;</code>
   */
  VOICE_SYNTHESIS(10),
  /**
   * <pre>
   * Sound Event Auth (Enrollable)
   * </pre>
   *
   * <code>SOUND_EVENT_ENROLLABLE = 100;</code>
   */
  SOUND_EVENT_ENROLLABLE(100),
  /**
   * <pre>
   * Sound Event Revalidation
   * </pre>
   *
   * <code>SOUND_EVENT_REVALIDATION = 101;</code>
   */
  SOUND_EVENT_REVALIDATION(101),
  /**
   * <pre>
   * Sound Event Recognition
   * </pre>
   *
   * <code>SOUND_EVENT_FIXED = 102;</code>
   */
  SOUND_EVENT_FIXED(102),
  /**
   * <pre>
   * Sound Scene Recognition
   * </pre>
   *
   * <code>SOUND_SCENE_FIXED = 103;</code>
   */
  SOUND_SCENE_FIXED(103),
  /**
   * <pre>
   * Face Auth (Enrollable)
   * </pre>
   *
   * <code>FACE_BIOMETRIC = 201;</code>
   */
  FACE_BIOMETRIC(201),
  /**
   * <pre>
   * Face Recognition
   * </pre>
   *
   * <code>FACE_RECOGNITION = 202;</code>
   */
  FACE_RECOGNITION(202),
  /**
   * <pre>
   * Object Recognition
   * </pre>
   *
   * <code>OBJECT_RECOGNITION = 203;</code>
   */
  OBJECT_RECOGNITION(203),
  /**
   * <pre>
   * Image Transformation
   * </pre>
   *
   * <code>IMAGE_TRANSFORM = 204;</code>
   */
  IMAGE_TRANSFORM(204),
  /**
   * <pre>
   * Face Embedding
   * </pre>
   *
   * <code>FACE_EMBEDDING = 205;</code>
   */
  FACE_EMBEDDING(205),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown Model Type
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Voice Auth Text Independent (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_TEXT_INDEPENDENT = 1;</code>
   */
  public static final int VOICE_BIOMETRIC_TEXT_INDEPENDENT_VALUE = 1;
  /**
   * <pre>
   * Voice Wakeword (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_WAKEWORD = 2;</code>
   */
  public static final int VOICE_BIOMETRIC_WAKEWORD_VALUE = 2;
  /**
   * <pre>
   * Voice Wakeword
   * </pre>
   *
   * <code>VOICE_EVENT_WAKEWORD = 3;</code>
   */
  public static final int VOICE_EVENT_WAKEWORD_VALUE = 3;
  /**
   * <pre>
   * Voice Grammar Recognition such as LVCSR
   * </pre>
   *
   * <code>VOICE_TRANSCRIBE_GRAMMAR = 4;</code>
   */
  public static final int VOICE_TRANSCRIBE_GRAMMAR_VALUE = 4;
  /**
   * <pre>
   * Voice Commands and Search recognition
   * </pre>
   *
   * <code>VOICE_TRANSCRIBE_COMMAND_AND_SEARCH = 5;</code>
   */
  public static final int VOICE_TRANSCRIBE_COMMAND_AND_SEARCH_VALUE = 5;
  /**
   * <pre>
   * Voice activity detection
   * </pre>
   *
   * <code>VOICE_RECOGNITION_ACTIVITY_DETECTION = 6;</code>
   */
  public static final int VOICE_RECOGNITION_ACTIVITY_DETECTION_VALUE = 6;
  /**
   * <pre>
   * Voice feature extractor
   * </pre>
   *
   * <code>VOICE_FEATURE_EXTRACTOR = 7;</code>
   */
  public static final int VOICE_FEATURE_EXTRACTOR_VALUE = 7;
  /**
   * <pre>
   * Voice digit recognizer for liveness
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_LIVENESS_DIGIT = 8;</code>
   */
  public static final int VOICE_BIOMETRIC_LIVENESS_DIGIT_VALUE = 8;
  /**
   * <pre>
   * Voice Auth Text Dependent (Enrollable)
   * </pre>
   *
   * <code>VOICE_BIOMETRIC_TEXT_DEPENDENT = 9;</code>
   */
  public static final int VOICE_BIOMETRIC_TEXT_DEPENDENT_VALUE = 9;
  /**
   * <pre>
   * Voice Synthesis
   * </pre>
   *
   * <code>VOICE_SYNTHESIS = 10;</code>
   */
  public static final int VOICE_SYNTHESIS_VALUE = 10;
  /**
   * <pre>
   * Sound Event Auth (Enrollable)
   * </pre>
   *
   * <code>SOUND_EVENT_ENROLLABLE = 100;</code>
   */
  public static final int SOUND_EVENT_ENROLLABLE_VALUE = 100;
  /**
   * <pre>
   * Sound Event Revalidation
   * </pre>
   *
   * <code>SOUND_EVENT_REVALIDATION = 101;</code>
   */
  public static final int SOUND_EVENT_REVALIDATION_VALUE = 101;
  /**
   * <pre>
   * Sound Event Recognition
   * </pre>
   *
   * <code>SOUND_EVENT_FIXED = 102;</code>
   */
  public static final int SOUND_EVENT_FIXED_VALUE = 102;
  /**
   * <pre>
   * Sound Scene Recognition
   * </pre>
   *
   * <code>SOUND_SCENE_FIXED = 103;</code>
   */
  public static final int SOUND_SCENE_FIXED_VALUE = 103;
  /**
   * <pre>
   * Face Auth (Enrollable)
   * </pre>
   *
   * <code>FACE_BIOMETRIC = 201;</code>
   */
  public static final int FACE_BIOMETRIC_VALUE = 201;
  /**
   * <pre>
   * Face Recognition
   * </pre>
   *
   * <code>FACE_RECOGNITION = 202;</code>
   */
  public static final int FACE_RECOGNITION_VALUE = 202;
  /**
   * <pre>
   * Object Recognition
   * </pre>
   *
   * <code>OBJECT_RECOGNITION = 203;</code>
   */
  public static final int OBJECT_RECOGNITION_VALUE = 203;
  /**
   * <pre>
   * Image Transformation
   * </pre>
   *
   * <code>IMAGE_TRANSFORM = 204;</code>
   */
  public static final int IMAGE_TRANSFORM_VALUE = 204;
  /**
   * <pre>
   * Face Embedding
   * </pre>
   *
   * <code>FACE_EMBEDDING = 205;</code>
   */
  public static final int FACE_EMBEDDING_VALUE = 205;


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
  public static ModelType valueOf(int value) {
    return forNumber(value);
  }

  public static ModelType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return VOICE_BIOMETRIC_TEXT_INDEPENDENT;
      case 2: return VOICE_BIOMETRIC_WAKEWORD;
      case 3: return VOICE_EVENT_WAKEWORD;
      case 4: return VOICE_TRANSCRIBE_GRAMMAR;
      case 5: return VOICE_TRANSCRIBE_COMMAND_AND_SEARCH;
      case 6: return VOICE_RECOGNITION_ACTIVITY_DETECTION;
      case 7: return VOICE_FEATURE_EXTRACTOR;
      case 8: return VOICE_BIOMETRIC_LIVENESS_DIGIT;
      case 9: return VOICE_BIOMETRIC_TEXT_DEPENDENT;
      case 10: return VOICE_SYNTHESIS;
      case 100: return SOUND_EVENT_ENROLLABLE;
      case 101: return SOUND_EVENT_REVALIDATION;
      case 102: return SOUND_EVENT_FIXED;
      case 103: return SOUND_SCENE_FIXED;
      case 201: return FACE_BIOMETRIC;
      case 202: return FACE_RECOGNITION;
      case 203: return OBJECT_RECOGNITION;
      case 204: return IMAGE_TRANSFORM;
      case 205: return FACE_EMBEDDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ModelType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ModelType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ModelType>() {
          @java.lang.Override
          public ModelType findValueByNumber(int number) {
            return ModelType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return ModelTypeVerifier.INSTANCE;
  }

  private static final class ModelTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ModelTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return ModelType.forNumber(number) != null;
          }
        };

  private final int value;

  private ModelType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensory.api.common.ModelType)
}


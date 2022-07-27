// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/audio/audio.proto

package ai.sensorycloud.api.v1.audio;

/**
 * Protobuf type {@code sensory.api.v1.audio.TranscribeWord}
 */
public  final class TranscribeWord extends
    com.google.protobuf.GeneratedMessageLite<
        TranscribeWord, TranscribeWord.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.v1.audio.TranscribeWord)
    TranscribeWordOrBuilder {
  private TranscribeWord() {
    word_ = "";
  }
  public static final int BEGINTIMEMS_FIELD_NUMBER = 1;
  private long begintimeMs_;
  /**
   * <pre>
   * The time in the transcript where the word begins
   * </pre>
   *
   * <code>uint64 begintimeMs = 1;</code>
   * @return The begintimeMs.
   */
  @java.lang.Override
  public long getBegintimeMs() {
    return begintimeMs_;
  }
  /**
   * <pre>
   * The time in the transcript where the word begins
   * </pre>
   *
   * <code>uint64 begintimeMs = 1;</code>
   * @param value The begintimeMs to set.
   */
  private void setBegintimeMs(long value) {
    
    begintimeMs_ = value;
  }
  /**
   * <pre>
   * The time in the transcript where the word begins
   * </pre>
   *
   * <code>uint64 begintimeMs = 1;</code>
   */
  private void clearBegintimeMs() {
    
    begintimeMs_ = 0L;
  }

  public static final int ENDTIMEMS_FIELD_NUMBER = 2;
  private long endtimeMs_;
  /**
   * <pre>
   * The time in the transcript where the word ends
   * </pre>
   *
   * <code>uint64 endtimeMs = 2;</code>
   * @return The endtimeMs.
   */
  @java.lang.Override
  public long getEndtimeMs() {
    return endtimeMs_;
  }
  /**
   * <pre>
   * The time in the transcript where the word ends
   * </pre>
   *
   * <code>uint64 endtimeMs = 2;</code>
   * @param value The endtimeMs to set.
   */
  private void setEndtimeMs(long value) {
    
    endtimeMs_ = value;
  }
  /**
   * <pre>
   * The time in the transcript where the word ends
   * </pre>
   *
   * <code>uint64 endtimeMs = 2;</code>
   */
  private void clearEndtimeMs() {
    
    endtimeMs_ = 0L;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 3;
  private float confidence_;
  /**
   * <pre>
   * The confidence score [0.0,1.0] that this word is correctly predicted
   * </pre>
   *
   * <code>float confidence = 3;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
  }
  /**
   * <pre>
   * The confidence score [0.0,1.0] that this word is correctly predicted
   * </pre>
   *
   * <code>float confidence = 3;</code>
   * @param value The confidence to set.
   */
  private void setConfidence(float value) {
    
    confidence_ = value;
  }
  /**
   * <pre>
   * The confidence score [0.0,1.0] that this word is correctly predicted
   * </pre>
   *
   * <code>float confidence = 3;</code>
   */
  private void clearConfidence() {
    
    confidence_ = 0F;
  }

  public static final int WORDSTATE_FIELD_NUMBER = 4;
  private int wordState_;
  /**
   * <pre>
   * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
   * </pre>
   *
   * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
   * @return The enum numeric value on the wire for wordState.
   */
  @java.lang.Override
  public int getWordStateValue() {
    return wordState_;
  }
  /**
   * <pre>
   * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
   * </pre>
   *
   * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
   * @return The wordState.
   */
  @java.lang.Override
  public ai.sensorycloud.api.v1.audio.WordState getWordState() {
    ai.sensorycloud.api.v1.audio.WordState result = ai.sensorycloud.api.v1.audio.WordState.forNumber(wordState_);
    return result == null ? ai.sensorycloud.api.v1.audio.WordState.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
   * </pre>
   *
   * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
   * @param value The enum numeric value on the wire for wordState to set.
   */
  private void setWordStateValue(int value) {
      wordState_ = value;
  }
  /**
   * <pre>
   * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
   * </pre>
   *
   * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
   * @param value The wordState to set.
   */
  private void setWordState(ai.sensorycloud.api.v1.audio.WordState value) {
    wordState_ = value.getNumber();
    
  }
  /**
   * <pre>
   * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
   * </pre>
   *
   * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
   */
  private void clearWordState() {
    
    wordState_ = 0;
  }

  public static final int WORDINDEX_FIELD_NUMBER = 5;
  private long wordIndex_;
  /**
   * <pre>
   * The Positional index within the session where this word appeared
   * </pre>
   *
   * <code>uint64 wordIndex = 5;</code>
   * @return The wordIndex.
   */
  @java.lang.Override
  public long getWordIndex() {
    return wordIndex_;
  }
  /**
   * <pre>
   * The Positional index within the session where this word appeared
   * </pre>
   *
   * <code>uint64 wordIndex = 5;</code>
   * @param value The wordIndex to set.
   */
  private void setWordIndex(long value) {
    
    wordIndex_ = value;
  }
  /**
   * <pre>
   * The Positional index within the session where this word appeared
   * </pre>
   *
   * <code>uint64 wordIndex = 5;</code>
   */
  private void clearWordIndex() {
    
    wordIndex_ = 0L;
  }

  public static final int WORD_FIELD_NUMBER = 6;
  private java.lang.String word_;
  /**
   * <pre>
   * The actual word that was predicted
   * </pre>
   *
   * <code>string word = 6;</code>
   * @return The word.
   */
  @java.lang.Override
  public java.lang.String getWord() {
    return word_;
  }
  /**
   * <pre>
   * The actual word that was predicted
   * </pre>
   *
   * <code>string word = 6;</code>
   * @return The bytes for word.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWordBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(word_);
  }
  /**
   * <pre>
   * The actual word that was predicted
   * </pre>
   *
   * <code>string word = 6;</code>
   * @param value The word to set.
   */
  private void setWord(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    word_ = value;
  }
  /**
   * <pre>
   * The actual word that was predicted
   * </pre>
   *
   * <code>string word = 6;</code>
   */
  private void clearWord() {
    
    word_ = getDefaultInstance().getWord();
  }
  /**
   * <pre>
   * The actual word that was predicted
   * </pre>
   *
   * <code>string word = 6;</code>
   * @param value The bytes for word to set.
   */
  private void setWordBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    word_ = value.toStringUtf8();
    
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.v1.audio.TranscribeWord parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.v1.audio.TranscribeWord prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sensory.api.v1.audio.TranscribeWord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.v1.audio.TranscribeWord, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.v1.audio.TranscribeWord)
      ai.sensorycloud.api.v1.audio.TranscribeWordOrBuilder {
    // Construct using ai.sensorycloud.api.v1.audio.TranscribeWord.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The time in the transcript where the word begins
     * </pre>
     *
     * <code>uint64 begintimeMs = 1;</code>
     * @return The begintimeMs.
     */
    @java.lang.Override
    public long getBegintimeMs() {
      return instance.getBegintimeMs();
    }
    /**
     * <pre>
     * The time in the transcript where the word begins
     * </pre>
     *
     * <code>uint64 begintimeMs = 1;</code>
     * @param value The begintimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setBegintimeMs(long value) {
      copyOnWrite();
      instance.setBegintimeMs(value);
      return this;
    }
    /**
     * <pre>
     * The time in the transcript where the word begins
     * </pre>
     *
     * <code>uint64 begintimeMs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBegintimeMs() {
      copyOnWrite();
      instance.clearBegintimeMs();
      return this;
    }

    /**
     * <pre>
     * The time in the transcript where the word ends
     * </pre>
     *
     * <code>uint64 endtimeMs = 2;</code>
     * @return The endtimeMs.
     */
    @java.lang.Override
    public long getEndtimeMs() {
      return instance.getEndtimeMs();
    }
    /**
     * <pre>
     * The time in the transcript where the word ends
     * </pre>
     *
     * <code>uint64 endtimeMs = 2;</code>
     * @param value The endtimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setEndtimeMs(long value) {
      copyOnWrite();
      instance.setEndtimeMs(value);
      return this;
    }
    /**
     * <pre>
     * The time in the transcript where the word ends
     * </pre>
     *
     * <code>uint64 endtimeMs = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndtimeMs() {
      copyOnWrite();
      instance.clearEndtimeMs();
      return this;
    }

    /**
     * <pre>
     * The confidence score [0.0,1.0] that this word is correctly predicted
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return instance.getConfidence();
    }
    /**
     * <pre>
     * The confidence score [0.0,1.0] that this word is correctly predicted
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {
      copyOnWrite();
      instance.setConfidence(value);
      return this;
    }
    /**
     * <pre>
     * The confidence score [0.0,1.0] that this word is correctly predicted
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      copyOnWrite();
      instance.clearConfidence();
      return this;
    }

    /**
     * <pre>
     * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
     * </pre>
     *
     * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
     * @return The enum numeric value on the wire for wordState.
     */
    @java.lang.Override
    public int getWordStateValue() {
      return instance.getWordStateValue();
    }
    /**
     * <pre>
     * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
     * </pre>
     *
     * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
     * @param value The wordState to set.
     * @return This builder for chaining.
     */
    public Builder setWordStateValue(int value) {
      copyOnWrite();
      instance.setWordStateValue(value);
      return this;
    }
    /**
     * <pre>
     * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
     * </pre>
     *
     * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
     * @return The wordState.
     */
    @java.lang.Override
    public ai.sensorycloud.api.v1.audio.WordState getWordState() {
      return instance.getWordState();
    }
    /**
     * <pre>
     * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
     * </pre>
     *
     * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
     * @param value The enum numeric value on the wire for wordState to set.
     * @return This builder for chaining.
     */
    public Builder setWordState(ai.sensorycloud.api.v1.audio.WordState value) {
      copyOnWrite();
      instance.setWordState(value);
      return this;
    }
    /**
     * <pre>
     * indicates the state of the word with respect to additional updates -- FINAL indicate the word will no longer change
     * </pre>
     *
     * <code>.sensory.api.v1.audio.WordState wordState = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWordState() {
      copyOnWrite();
      instance.clearWordState();
      return this;
    }

    /**
     * <pre>
     * The Positional index within the session where this word appeared
     * </pre>
     *
     * <code>uint64 wordIndex = 5;</code>
     * @return The wordIndex.
     */
    @java.lang.Override
    public long getWordIndex() {
      return instance.getWordIndex();
    }
    /**
     * <pre>
     * The Positional index within the session where this word appeared
     * </pre>
     *
     * <code>uint64 wordIndex = 5;</code>
     * @param value The wordIndex to set.
     * @return This builder for chaining.
     */
    public Builder setWordIndex(long value) {
      copyOnWrite();
      instance.setWordIndex(value);
      return this;
    }
    /**
     * <pre>
     * The Positional index within the session where this word appeared
     * </pre>
     *
     * <code>uint64 wordIndex = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearWordIndex() {
      copyOnWrite();
      instance.clearWordIndex();
      return this;
    }

    /**
     * <pre>
     * The actual word that was predicted
     * </pre>
     *
     * <code>string word = 6;</code>
     * @return The word.
     */
    @java.lang.Override
    public java.lang.String getWord() {
      return instance.getWord();
    }
    /**
     * <pre>
     * The actual word that was predicted
     * </pre>
     *
     * <code>string word = 6;</code>
     * @return The bytes for word.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getWordBytes() {
      return instance.getWordBytes();
    }
    /**
     * <pre>
     * The actual word that was predicted
     * </pre>
     *
     * <code>string word = 6;</code>
     * @param value The word to set.
     * @return This builder for chaining.
     */
    public Builder setWord(
        java.lang.String value) {
      copyOnWrite();
      instance.setWord(value);
      return this;
    }
    /**
     * <pre>
     * The actual word that was predicted
     * </pre>
     *
     * <code>string word = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearWord() {
      copyOnWrite();
      instance.clearWord();
      return this;
    }
    /**
     * <pre>
     * The actual word that was predicted
     * </pre>
     *
     * <code>string word = 6;</code>
     * @param value The bytes for word to set.
     * @return This builder for chaining.
     */
    public Builder setWordBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setWordBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.v1.audio.TranscribeWord)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.v1.audio.TranscribeWord();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "begintimeMs_",
            "endtimeMs_",
            "confidence_",
            "wordState_",
            "wordIndex_",
            "word_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0002\u0003" +
              "\u0003\u0001\u0004\f\u0005\u0003\u0006\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.v1.audio.TranscribeWord> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.v1.audio.TranscribeWord.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.v1.audio.TranscribeWord>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sensory.api.v1.audio.TranscribeWord)
  private static final ai.sensorycloud.api.v1.audio.TranscribeWord DEFAULT_INSTANCE;
  static {
    TranscribeWord defaultInstance = new TranscribeWord();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TranscribeWord.class, defaultInstance);
  }

  public static ai.sensorycloud.api.v1.audio.TranscribeWord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TranscribeWord> PARSER;

  public static com.google.protobuf.Parser<TranscribeWord> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

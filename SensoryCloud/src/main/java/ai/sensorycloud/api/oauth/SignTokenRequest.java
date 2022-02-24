// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oauth/oauth.proto

package ai.sensorycloud.api.oauth;

/**
 * <pre>
 * Request to obtain an OAuth token on behalf of a user.
 * </pre>
 *
 * Protobuf type {@code sensory.api.oauth.SignTokenRequest}
 */
public  final class SignTokenRequest extends
    com.google.protobuf.GeneratedMessageLite<
        SignTokenRequest, SignTokenRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:sensory.api.oauth.SignTokenRequest)
    SignTokenRequestOrBuilder {
  private SignTokenRequest() {
    subject_ = "";
  }
  /**
   * <pre>
   * The scope of a token in a SignTokenRequest.
   * </pre>
   *
   * Protobuf enum {@code sensory.api.oauth.SignTokenRequest.TokenScope}
   */
  public enum TokenScope
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * Standard User
     * </pre>
     *
     * <code>USER = 0;</code>
     */
    USER(0),
    /**
     * <pre>
     * Super Administrator, capable of all operations
     * </pre>
     *
     * <code>SUPER_ADMIN = 1;</code>
     */
    SUPER_ADMIN(1),
    /**
     * <pre>
     * Billing Administrator, capable of all billing-related operations
     * </pre>
     *
     * <code>BILLING_ADMIN = 2;</code>
     */
    BILLING_ADMIN(2),
    /**
     * <pre>
     * Read-only Administrator, capable of all read operations
     * </pre>
     *
     * <code>READ_ONLY_ADMIN = 3;</code>
     */
    READ_ONLY_ADMIN(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Standard User
     * </pre>
     *
     * <code>USER = 0;</code>
     */
    public static final int USER_VALUE = 0;
    /**
     * <pre>
     * Super Administrator, capable of all operations
     * </pre>
     *
     * <code>SUPER_ADMIN = 1;</code>
     */
    public static final int SUPER_ADMIN_VALUE = 1;
    /**
     * <pre>
     * Billing Administrator, capable of all billing-related operations
     * </pre>
     *
     * <code>BILLING_ADMIN = 2;</code>
     */
    public static final int BILLING_ADMIN_VALUE = 2;
    /**
     * <pre>
     * Read-only Administrator, capable of all read operations
     * </pre>
     *
     * <code>READ_ONLY_ADMIN = 3;</code>
     */
    public static final int READ_ONLY_ADMIN_VALUE = 3;


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
    public static TokenScope valueOf(int value) {
      return forNumber(value);
    }

    public static TokenScope forNumber(int value) {
      switch (value) {
        case 0: return USER;
        case 1: return SUPER_ADMIN;
        case 2: return BILLING_ADMIN;
        case 3: return READ_ONLY_ADMIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TokenScope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TokenScope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TokenScope>() {
            @java.lang.Override
            public TokenScope findValueByNumber(int number) {
              return TokenScope.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return TokenScopeVerifier.INSTANCE;
    }

    private static final class TokenScopeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TokenScopeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return TokenScope.forNumber(number) != null;
            }
          };

    private final int value;

    private TokenScope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sensory.api.oauth.SignTokenRequest.TokenScope)
  }

  public static final int SUBJECT_FIELD_NUMBER = 1;
  private java.lang.String subject_;
  /**
   * <pre>
   * User identifier - who the token is being issued to
   * </pre>
   *
   * <code>string subject = 1 [(.validate.rules) = { ... }</code>
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    return subject_;
  }
  /**
   * <pre>
   * User identifier - who the token is being issued to
   * </pre>
   *
   * <code>string subject = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(subject_);
  }
  /**
   * <pre>
   * User identifier - who the token is being issued to
   * </pre>
   *
   * <code>string subject = 1 [(.validate.rules) = { ... }</code>
   * @param value The subject to set.
   */
  private void setSubject(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    subject_ = value;
  }
  /**
   * <pre>
   * User identifier - who the token is being issued to
   * </pre>
   *
   * <code>string subject = 1 [(.validate.rules) = { ... }</code>
   */
  private void clearSubject() {
    
    subject_ = getDefaultInstance().getSubject();
  }
  /**
   * <pre>
   * User identifier - who the token is being issued to
   * </pre>
   *
   * <code>string subject = 1 [(.validate.rules) = { ... }</code>
   * @param value The bytes for subject to set.
   */
  private void setSubjectBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    subject_ = value.toStringUtf8();
    
  }

  public static final int SCOPE_FIELD_NUMBER = 2;
  private int scope_;
  /**
   * <pre>
   * The specific scope of the token
   * </pre>
   *
   * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for scope.
   */
  @java.lang.Override
  public int getScopeValue() {
    return scope_;
  }
  /**
   * <pre>
   * The specific scope of the token
   * </pre>
   *
   * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
   * @return The scope.
   */
  @java.lang.Override
  public ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope getScope() {
    ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope result = ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope.forNumber(scope_);
    return result == null ? ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The specific scope of the token
   * </pre>
   *
   * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
   * @param value The enum numeric value on the wire for scope to set.
   */
  private void setScopeValue(int value) {
      scope_ = value;
  }
  /**
   * <pre>
   * The specific scope of the token
   * </pre>
   *
   * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
   * @param value The scope to set.
   */
  private void setScope(ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope value) {
    scope_ = value.getNumber();
    
  }
  /**
   * <pre>
   * The specific scope of the token
   * </pre>
   *
   * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
   */
  private void clearScope() {
    
    scope_ = 0;
  }

  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static ai.sensorycloud.api.oauth.SignTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(ai.sensorycloud.api.oauth.SignTokenRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Request to obtain an OAuth token on behalf of a user.
   * </pre>
   *
   * Protobuf type {@code sensory.api.oauth.SignTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        ai.sensorycloud.api.oauth.SignTokenRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:sensory.api.oauth.SignTokenRequest)
      ai.sensorycloud.api.oauth.SignTokenRequestOrBuilder {
    // Construct using ai.sensorycloud.api.oauth.SignTokenRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * User identifier - who the token is being issued to
     * </pre>
     *
     * <code>string subject = 1 [(.validate.rules) = { ... }</code>
     * @return The subject.
     */
    @java.lang.Override
    public java.lang.String getSubject() {
      return instance.getSubject();
    }
    /**
     * <pre>
     * User identifier - who the token is being issued to
     * </pre>
     *
     * <code>string subject = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for subject.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      return instance.getSubjectBytes();
    }
    /**
     * <pre>
     * User identifier - who the token is being issued to
     * </pre>
     *
     * <code>string subject = 1 [(.validate.rules) = { ... }</code>
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
        java.lang.String value) {
      copyOnWrite();
      instance.setSubject(value);
      return this;
    }
    /**
     * <pre>
     * User identifier - who the token is being issued to
     * </pre>
     *
     * <code>string subject = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      copyOnWrite();
      instance.clearSubject();
      return this;
    }
    /**
     * <pre>
     * User identifier - who the token is being issued to
     * </pre>
     *
     * <code>string subject = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSubjectBytes(value);
      return this;
    }

    /**
     * <pre>
     * The specific scope of the token
     * </pre>
     *
     * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for scope.
     */
    @java.lang.Override
    public int getScopeValue() {
      return instance.getScopeValue();
    }
    /**
     * <pre>
     * The specific scope of the token
     * </pre>
     *
     * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeValue(int value) {
      copyOnWrite();
      instance.setScopeValue(value);
      return this;
    }
    /**
     * <pre>
     * The specific scope of the token
     * </pre>
     *
     * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
     * @return The scope.
     */
    @java.lang.Override
    public ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope getScope() {
      return instance.getScope();
    }
    /**
     * <pre>
     * The specific scope of the token
     * </pre>
     *
     * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(ai.sensorycloud.api.oauth.SignTokenRequest.TokenScope value) {
      copyOnWrite();
      instance.setScope(value);
      return this;
    }
    /**
     * <pre>
     * The specific scope of the token
     * </pre>
     *
     * <code>.sensory.api.oauth.SignTokenRequest.TokenScope scope = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      copyOnWrite();
      instance.clearScope();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sensory.api.oauth.SignTokenRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new ai.sensorycloud.api.oauth.SignTokenRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "subject_",
            "scope_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<ai.sensorycloud.api.oauth.SignTokenRequest> parser = PARSER;
        if (parser == null) {
          synchronized (ai.sensorycloud.api.oauth.SignTokenRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<ai.sensorycloud.api.oauth.SignTokenRequest>(
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


  // @@protoc_insertion_point(class_scope:sensory.api.oauth.SignTokenRequest)
  private static final ai.sensorycloud.api.oauth.SignTokenRequest DEFAULT_INSTANCE;
  static {
    SignTokenRequest defaultInstance = new SignTokenRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SignTokenRequest.class, defaultInstance);
  }

  public static ai.sensorycloud.api.oauth.SignTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SignTokenRequest> PARSER;

  public static com.google.protobuf.Parser<SignTokenRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


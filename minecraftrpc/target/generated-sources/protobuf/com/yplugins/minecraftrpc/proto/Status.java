// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: minecraft.proto
// Protobuf Java Version: 4.29.0

package com.yplugins.minecraftrpc.proto;

/**
 * <pre>
 * * Status if a command was successful or what errors occured 
 * </pre>
 *
 * Protobuf type {@code Minecraft.Status}
 */
public final class Status extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Minecraft.Status)
    StatusOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Status.class.getName());
  }
  // Use Status.newBuilder() to construct.
  private Status(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Status() {
    code_ = 0;
    extra_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.yplugins.minecraftrpc.proto.MinecraftRPC.internal_static_Minecraft_Status_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yplugins.minecraftrpc.proto.MinecraftRPC.internal_static_Minecraft_Status_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yplugins.minecraftrpc.proto.Status.class, com.yplugins.minecraftrpc.proto.Status.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <code>.Minecraft.StatusCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.Minecraft.StatusCode code = 1;</code>
   * @return The code.
   */
  @java.lang.Override public com.yplugins.minecraftrpc.proto.StatusCode getCode() {
    com.yplugins.minecraftrpc.proto.StatusCode result = com.yplugins.minecraftrpc.proto.StatusCode.forNumber(code_);
    return result == null ? com.yplugins.minecraftrpc.proto.StatusCode.UNRECOGNIZED : result;
  }

  public static final int EXTRA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extra_ = "";
  /**
   * <pre>
   * the reason the command failed or additional information about success or failure
   * depending on the function used may be the name of the wrong parameter, number of players affected ...
   * allows for insertion into error messages of any language
   * </pre>
   *
   * <code>string extra = 2;</code>
   * @return The extra.
   */
  @java.lang.Override
  public java.lang.String getExtra() {
    java.lang.Object ref = extra_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extra_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the reason the command failed or additional information about success or failure
   * depending on the function used may be the name of the wrong parameter, number of players affected ...
   * allows for insertion into error messages of any language
   * </pre>
   *
   * <code>string extra = 2;</code>
   * @return The bytes for extra.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtraBytes() {
    java.lang.Object ref = extra_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extra_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != com.yplugins.minecraftrpc.proto.StatusCode.OK.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(extra_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, extra_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.yplugins.minecraftrpc.proto.StatusCode.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(extra_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, extra_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.yplugins.minecraftrpc.proto.Status)) {
      return super.equals(obj);
    }
    com.yplugins.minecraftrpc.proto.Status other = (com.yplugins.minecraftrpc.proto.Status) obj;

    if (code_ != other.code_) return false;
    if (!getExtra()
        .equals(other.getExtra())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + EXTRA_FIELD_NUMBER;
    hash = (53 * hash) + getExtra().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.yplugins.minecraftrpc.proto.Status parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.yplugins.minecraftrpc.proto.Status parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.yplugins.minecraftrpc.proto.Status parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.yplugins.minecraftrpc.proto.Status prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * * Status if a command was successful or what errors occured 
   * </pre>
   *
   * Protobuf type {@code Minecraft.Status}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Minecraft.Status)
      com.yplugins.minecraftrpc.proto.StatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yplugins.minecraftrpc.proto.MinecraftRPC.internal_static_Minecraft_Status_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yplugins.minecraftrpc.proto.MinecraftRPC.internal_static_Minecraft_Status_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yplugins.minecraftrpc.proto.Status.class, com.yplugins.minecraftrpc.proto.Status.Builder.class);
    }

    // Construct using com.yplugins.minecraftrpc.proto.Status.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = 0;
      extra_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yplugins.minecraftrpc.proto.MinecraftRPC.internal_static_Minecraft_Status_descriptor;
    }

    @java.lang.Override
    public com.yplugins.minecraftrpc.proto.Status getDefaultInstanceForType() {
      return com.yplugins.minecraftrpc.proto.Status.getDefaultInstance();
    }

    @java.lang.Override
    public com.yplugins.minecraftrpc.proto.Status build() {
      com.yplugins.minecraftrpc.proto.Status result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yplugins.minecraftrpc.proto.Status buildPartial() {
      com.yplugins.minecraftrpc.proto.Status result = new com.yplugins.minecraftrpc.proto.Status(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.yplugins.minecraftrpc.proto.Status result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.extra_ = extra_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.yplugins.minecraftrpc.proto.Status) {
        return mergeFrom((com.yplugins.minecraftrpc.proto.Status)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yplugins.minecraftrpc.proto.Status other) {
      if (other == com.yplugins.minecraftrpc.proto.Status.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getExtra().isEmpty()) {
        extra_ = other.extra_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              code_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              extra_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int code_ = 0;
    /**
     * <code>.Minecraft.StatusCode code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.Minecraft.StatusCode code = 1;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Minecraft.StatusCode code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public com.yplugins.minecraftrpc.proto.StatusCode getCode() {
      com.yplugins.minecraftrpc.proto.StatusCode result = com.yplugins.minecraftrpc.proto.StatusCode.forNumber(code_);
      return result == null ? com.yplugins.minecraftrpc.proto.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.Minecraft.StatusCode code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.yplugins.minecraftrpc.proto.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Minecraft.StatusCode code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object extra_ = "";
    /**
     * <pre>
     * the reason the command failed or additional information about success or failure
     * depending on the function used may be the name of the wrong parameter, number of players affected ...
     * allows for insertion into error messages of any language
     * </pre>
     *
     * <code>string extra = 2;</code>
     * @return The extra.
     */
    public java.lang.String getExtra() {
      java.lang.Object ref = extra_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extra_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the reason the command failed or additional information about success or failure
     * depending on the function used may be the name of the wrong parameter, number of players affected ...
     * allows for insertion into error messages of any language
     * </pre>
     *
     * <code>string extra = 2;</code>
     * @return The bytes for extra.
     */
    public com.google.protobuf.ByteString
        getExtraBytes() {
      java.lang.Object ref = extra_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extra_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the reason the command failed or additional information about success or failure
     * depending on the function used may be the name of the wrong parameter, number of players affected ...
     * allows for insertion into error messages of any language
     * </pre>
     *
     * <code>string extra = 2;</code>
     * @param value The extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtra(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extra_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the reason the command failed or additional information about success or failure
     * depending on the function used may be the name of the wrong parameter, number of players affected ...
     * allows for insertion into error messages of any language
     * </pre>
     *
     * <code>string extra = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtra() {
      extra_ = getDefaultInstance().getExtra();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the reason the command failed or additional information about success or failure
     * depending on the function used may be the name of the wrong parameter, number of players affected ...
     * allows for insertion into error messages of any language
     * </pre>
     *
     * <code>string extra = 2;</code>
     * @param value The bytes for extra to set.
     * @return This builder for chaining.
     */
    public Builder setExtraBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extra_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Minecraft.Status)
  }

  // @@protoc_insertion_point(class_scope:Minecraft.Status)
  private static final com.yplugins.minecraftrpc.proto.Status DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yplugins.minecraftrpc.proto.Status();
  }

  public static com.yplugins.minecraftrpc.proto.Status getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Status>
      PARSER = new com.google.protobuf.AbstractParser<Status>() {
    @java.lang.Override
    public Status parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Status> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Status> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yplugins.minecraftrpc.proto.Status getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


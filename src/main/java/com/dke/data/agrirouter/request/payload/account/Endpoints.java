// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging/request/payload/account/endpoints.proto

package agrirouter.request.payload.account;

public final class Endpoints {
  private Endpoints() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ListEndpointsQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:agrirouter.request.payload.account.ListEndpointsQuery)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
     * </pre>
     *
     * <code>string technical_message_type = 1;</code>
     */
    java.lang.String getTechnicalMessageType();
    /**
     * <pre>
     * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
     * </pre>
     *
     * <code>string technical_message_type = 1;</code>
     */
    com.google.protobuf.ByteString
        getTechnicalMessageTypeBytes();

    /**
     * <pre>
     * The direction as mentioned above - Default is SEND if not provided
     * </pre>
     *
     * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
     */
    int getDirectionValue();
    /**
     * <pre>
     * The direction as mentioned above - Default is SEND if not provided
     * </pre>
     *
     * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
     */
    agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction getDirection();
  }
  /**
   * Protobuf type {@code agrirouter.request.payload.account.ListEndpointsQuery}
   */
  public  static final class ListEndpointsQuery extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:agrirouter.request.payload.account.ListEndpointsQuery)
      ListEndpointsQueryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListEndpointsQuery.newBuilder() to construct.
    private ListEndpointsQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListEndpointsQuery() {
      technicalMessageType_ = "";
      direction_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListEndpointsQuery(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              technicalMessageType_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              direction_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return agrirouter.request.payload.account.Endpoints.internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return agrirouter.request.payload.account.Endpoints.internal_static_agrirouter_request_payload_account_ListEndpointsQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.class, agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Builder.class);
    }

    /**
     * <pre>
     * Defines the direction the rules should be configured for the endpoint lists
     * </pre>
     *
     * Protobuf enum {@code agrirouter.request.payload.account.ListEndpointsQuery.Direction}
     */
    public enum Direction
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * I as the requesting endpoint can send the requested technical message type too
       * </pre>
       *
       * <code>SEND = 0;</code>
       */
      SEND(0),
      /**
       * <pre>
       * I as the requesting endpoint can recevie the requested technical message type from
       * </pre>
       *
       * <code>RECEIVE = 1;</code>
       */
      RECEIVE(1),
      /**
       * <pre>
       * I as the requesting endpoint can send too or receive from endpoints for the requested technical message type
       * </pre>
       *
       * <code>SEND_RECEIVE = 2;</code>
       */
      SEND_RECEIVE(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * I as the requesting endpoint can send the requested technical message type too
       * </pre>
       *
       * <code>SEND = 0;</code>
       */
      public static final int SEND_VALUE = 0;
      /**
       * <pre>
       * I as the requesting endpoint can recevie the requested technical message type from
       * </pre>
       *
       * <code>RECEIVE = 1;</code>
       */
      public static final int RECEIVE_VALUE = 1;
      /**
       * <pre>
       * I as the requesting endpoint can send too or receive from endpoints for the requested technical message type
       * </pre>
       *
       * <code>SEND_RECEIVE = 2;</code>
       */
      public static final int SEND_RECEIVE_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Direction valueOf(int value) {
        return forNumber(value);
      }

      public static Direction forNumber(int value) {
        switch (value) {
          case 0: return SEND;
          case 1: return RECEIVE;
          case 2: return SEND_RECEIVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Direction>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Direction> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
              public Direction findValueByNumber(int number) {
                return Direction.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.getDescriptor().getEnumTypes().get(0);
      }

      private static final Direction[] VALUES = values();

      public static Direction valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Direction(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:agrirouter.request.payload.account.ListEndpointsQuery.Direction)
    }

    public static final int TECHNICAL_MESSAGE_TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object technicalMessageType_;
    /**
     * <pre>
     * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
     * </pre>
     *
     * <code>string technical_message_type = 1;</code>
     */
    public java.lang.String getTechnicalMessageType() {
      java.lang.Object ref = technicalMessageType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        technicalMessageType_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
     * </pre>
     *
     * <code>string technical_message_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTechnicalMessageTypeBytes() {
      java.lang.Object ref = technicalMessageType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        technicalMessageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DIRECTION_FIELD_NUMBER = 2;
    private int direction_;
    /**
     * <pre>
     * The direction as mentioned above - Default is SEND if not provided
     * </pre>
     *
     * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
     */
    public int getDirectionValue() {
      return direction_;
    }
    /**
     * <pre>
     * The direction as mentioned above - Default is SEND if not provided
     * </pre>
     *
     * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
     */
    public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction getDirection() {
      agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction result = agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.valueOf(direction_);
      return result == null ? agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTechnicalMessageTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, technicalMessageType_);
      }
      if (direction_ != agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.SEND.getNumber()) {
        output.writeEnum(2, direction_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTechnicalMessageTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, technicalMessageType_);
      }
      if (direction_ != agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.SEND.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, direction_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof agrirouter.request.payload.account.Endpoints.ListEndpointsQuery)) {
        return super.equals(obj);
      }
      agrirouter.request.payload.account.Endpoints.ListEndpointsQuery other = (agrirouter.request.payload.account.Endpoints.ListEndpointsQuery) obj;

      boolean result = true;
      result = result && getTechnicalMessageType()
          .equals(other.getTechnicalMessageType());
      result = result && direction_ == other.direction_;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TECHNICAL_MESSAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTechnicalMessageType().hashCode();
      hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
      hash = (53 * hash) + direction_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(agrirouter.request.payload.account.Endpoints.ListEndpointsQuery prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code agrirouter.request.payload.account.ListEndpointsQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:agrirouter.request.payload.account.ListEndpointsQuery)
        agrirouter.request.payload.account.Endpoints.ListEndpointsQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return agrirouter.request.payload.account.Endpoints.internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return agrirouter.request.payload.account.Endpoints.internal_static_agrirouter_request_payload_account_ListEndpointsQuery_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.class, agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Builder.class);
      }

      // Construct using agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        technicalMessageType_ = "";

        direction_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return agrirouter.request.payload.account.Endpoints.internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor;
      }

      public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery getDefaultInstanceForType() {
        return agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.getDefaultInstance();
      }

      public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery build() {
        agrirouter.request.payload.account.Endpoints.ListEndpointsQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery buildPartial() {
        agrirouter.request.payload.account.Endpoints.ListEndpointsQuery result = new agrirouter.request.payload.account.Endpoints.ListEndpointsQuery(this);
        result.technicalMessageType_ = technicalMessageType_;
        result.direction_ = direction_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof agrirouter.request.payload.account.Endpoints.ListEndpointsQuery) {
          return mergeFrom((agrirouter.request.payload.account.Endpoints.ListEndpointsQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(agrirouter.request.payload.account.Endpoints.ListEndpointsQuery other) {
        if (other == agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.getDefaultInstance()) return this;
        if (!other.getTechnicalMessageType().isEmpty()) {
          technicalMessageType_ = other.technicalMessageType_;
          onChanged();
        }
        if (other.direction_ != 0) {
          setDirectionValue(other.getDirectionValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        agrirouter.request.payload.account.Endpoints.ListEndpointsQuery parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (agrirouter.request.payload.account.Endpoints.ListEndpointsQuery) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object technicalMessageType_ = "";
      /**
       * <pre>
       * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
       * </pre>
       *
       * <code>string technical_message_type = 1;</code>
       */
      public java.lang.String getTechnicalMessageType() {
        java.lang.Object ref = technicalMessageType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          technicalMessageType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
       * </pre>
       *
       * <code>string technical_message_type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTechnicalMessageTypeBytes() {
        java.lang.Object ref = technicalMessageType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          technicalMessageType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
       * </pre>
       *
       * <code>string technical_message_type = 1;</code>
       */
      public Builder setTechnicalMessageType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        technicalMessageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
       * </pre>
       *
       * <code>string technical_message_type = 1;</code>
       */
      public Builder clearTechnicalMessageType() {
        
        technicalMessageType_ = getDefaultInstance().getTechnicalMessageType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The technical message type which is relevant for the endpoint listing. If not provided we consider all possible rules
       * </pre>
       *
       * <code>string technical_message_type = 1;</code>
       */
      public Builder setTechnicalMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        technicalMessageType_ = value;
        onChanged();
        return this;
      }

      private int direction_ = 0;
      /**
       * <pre>
       * The direction as mentioned above - Default is SEND if not provided
       * </pre>
       *
       * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
       */
      public int getDirectionValue() {
        return direction_;
      }
      /**
       * <pre>
       * The direction as mentioned above - Default is SEND if not provided
       * </pre>
       *
       * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
       */
      public Builder setDirectionValue(int value) {
        direction_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The direction as mentioned above - Default is SEND if not provided
       * </pre>
       *
       * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
       */
      public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction getDirection() {
        agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction result = agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.valueOf(direction_);
        return result == null ? agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * The direction as mentioned above - Default is SEND if not provided
       * </pre>
       *
       * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
       */
      public Builder setDirection(agrirouter.request.payload.account.Endpoints.ListEndpointsQuery.Direction value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        direction_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The direction as mentioned above - Default is SEND if not provided
       * </pre>
       *
       * <code>.agrirouter.request.payload.account.ListEndpointsQuery.Direction direction = 2;</code>
       */
      public Builder clearDirection() {
        
        direction_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:agrirouter.request.payload.account.ListEndpointsQuery)
    }

    // @@protoc_insertion_point(class_scope:agrirouter.request.payload.account.ListEndpointsQuery)
    private static final agrirouter.request.payload.account.Endpoints.ListEndpointsQuery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new agrirouter.request.payload.account.Endpoints.ListEndpointsQuery();
    }

    public static agrirouter.request.payload.account.Endpoints.ListEndpointsQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ListEndpointsQuery>
        PARSER = new com.google.protobuf.AbstractParser<ListEndpointsQuery>() {
      public ListEndpointsQuery parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListEndpointsQuery(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ListEndpointsQuery> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ListEndpointsQuery> getParserForType() {
      return PARSER;
    }

    public agrirouter.request.payload.account.Endpoints.ListEndpointsQuery getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agrirouter_request_payload_account_ListEndpointsQuery_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1messaging/request/payload/account/endp" +
      "oints.proto\022\"agrirouter.request.payload." +
      "account\"\277\001\n\022ListEndpointsQuery\022\036\n\026techni" +
      "cal_message_type\030\001 \001(\t\022S\n\tdirection\030\002 \001(" +
      "\0162@.agrirouter.request.payload.account.L" +
      "istEndpointsQuery.Direction\"4\n\tDirection" +
      "\022\010\n\004SEND\020\000\022\013\n\007RECEIVE\020\001\022\020\n\014SEND_RECEIVE\020" +
      "\002b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_agrirouter_request_payload_account_ListEndpointsQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agrirouter_request_payload_account_ListEndpointsQuery_descriptor,
        new java.lang.String[] { "TechnicalMessageType", "Direction", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Request to create a new `WorkerPool`.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.CreateWorkerPoolRequest}
 */
public final class CreateWorkerPoolRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.CreateWorkerPoolRequest)
    CreateWorkerPoolRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkerPoolRequest.newBuilder() to construct.
  private CreateWorkerPoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkerPoolRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateWorkerPoolRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloudbuild.v1.WorkerPool.Builder subBuilder = null;
              if (workerPool_ != null) {
                subBuilder = workerPool_.toBuilder();
              }
              workerPool_ =
                  input.readMessage(
                      com.google.cloudbuild.v1.WorkerPool.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(workerPool_);
                workerPool_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_CreateWorkerPoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_CreateWorkerPoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.CreateWorkerPoolRequest.class,
            com.google.cloudbuild.v1.CreateWorkerPoolRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * ID of the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKER_POOL_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v1.WorkerPool workerPool_;
  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  public boolean hasWorkerPool() {
    return workerPool_ != null;
  }
  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  public com.google.cloudbuild.v1.WorkerPool getWorkerPool() {
    return workerPool_ == null
        ? com.google.cloudbuild.v1.WorkerPool.getDefaultInstance()
        : workerPool_;
  }
  /**
   *
   *
   * <pre>
   * `WorkerPool` resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
   */
  public com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolOrBuilder() {
    return getWorkerPool();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (workerPool_ != null) {
      output.writeMessage(2, getWorkerPool());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (workerPool_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWorkerPool());
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
    if (!(obj instanceof com.google.cloudbuild.v1.CreateWorkerPoolRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.CreateWorkerPoolRequest other =
        (com.google.cloudbuild.v1.CreateWorkerPoolRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasWorkerPool() != other.hasWorkerPool()) return false;
    if (hasWorkerPool()) {
      if (!getWorkerPool().equals(other.getWorkerPool())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasWorkerPool()) {
      hash = (37 * hash) + WORKER_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerPool().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloudbuild.v1.CreateWorkerPoolRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to create a new `WorkerPool`.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.CreateWorkerPoolRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.CreateWorkerPoolRequest)
      com.google.cloudbuild.v1.CreateWorkerPoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateWorkerPoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateWorkerPoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.CreateWorkerPoolRequest.class,
              com.google.cloudbuild.v1.CreateWorkerPoolRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.CreateWorkerPoolRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (workerPoolBuilder_ == null) {
        workerPool_ = null;
      } else {
        workerPool_ = null;
        workerPoolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateWorkerPoolRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateWorkerPoolRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.CreateWorkerPoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateWorkerPoolRequest build() {
      com.google.cloudbuild.v1.CreateWorkerPoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateWorkerPoolRequest buildPartial() {
      com.google.cloudbuild.v1.CreateWorkerPoolRequest result =
          new com.google.cloudbuild.v1.CreateWorkerPoolRequest(this);
      result.parent_ = parent_;
      if (workerPoolBuilder_ == null) {
        result.workerPool_ = workerPool_;
      } else {
        result.workerPool_ = workerPoolBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloudbuild.v1.CreateWorkerPoolRequest) {
        return mergeFrom((com.google.cloudbuild.v1.CreateWorkerPoolRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.CreateWorkerPoolRequest other) {
      if (other == com.google.cloudbuild.v1.CreateWorkerPoolRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasWorkerPool()) {
        mergeWorkerPool(other.getWorkerPool());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloudbuild.v1.CreateWorkerPoolRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.CreateWorkerPoolRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * ID of the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.WorkerPool workerPool_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.WorkerPool,
            com.google.cloudbuild.v1.WorkerPool.Builder,
            com.google.cloudbuild.v1.WorkerPoolOrBuilder>
        workerPoolBuilder_;
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public boolean hasWorkerPool() {
      return workerPoolBuilder_ != null || workerPool_ != null;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool getWorkerPool() {
      if (workerPoolBuilder_ == null) {
        return workerPool_ == null
            ? com.google.cloudbuild.v1.WorkerPool.getDefaultInstance()
            : workerPool_;
      } else {
        return workerPoolBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public Builder setWorkerPool(com.google.cloudbuild.v1.WorkerPool value) {
      if (workerPoolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workerPool_ = value;
        onChanged();
      } else {
        workerPoolBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public Builder setWorkerPool(com.google.cloudbuild.v1.WorkerPool.Builder builderForValue) {
      if (workerPoolBuilder_ == null) {
        workerPool_ = builderForValue.build();
        onChanged();
      } else {
        workerPoolBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public Builder mergeWorkerPool(com.google.cloudbuild.v1.WorkerPool value) {
      if (workerPoolBuilder_ == null) {
        if (workerPool_ != null) {
          workerPool_ =
              com.google.cloudbuild.v1.WorkerPool.newBuilder(workerPool_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          workerPool_ = value;
        }
        onChanged();
      } else {
        workerPoolBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public Builder clearWorkerPool() {
      if (workerPoolBuilder_ == null) {
        workerPool_ = null;
        onChanged();
      } else {
        workerPool_ = null;
        workerPoolBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public com.google.cloudbuild.v1.WorkerPool.Builder getWorkerPoolBuilder() {

      onChanged();
      return getWorkerPoolFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    public com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolOrBuilder() {
      if (workerPoolBuilder_ != null) {
        return workerPoolBuilder_.getMessageOrBuilder();
      } else {
        return workerPool_ == null
            ? com.google.cloudbuild.v1.WorkerPool.getDefaultInstance()
            : workerPool_;
      }
    }
    /**
     *
     *
     * <pre>
     * `WorkerPool` resource to create.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.WorkerPool worker_pool = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.WorkerPool,
            com.google.cloudbuild.v1.WorkerPool.Builder,
            com.google.cloudbuild.v1.WorkerPoolOrBuilder>
        getWorkerPoolFieldBuilder() {
      if (workerPoolBuilder_ == null) {
        workerPoolBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.WorkerPool,
                com.google.cloudbuild.v1.WorkerPool.Builder,
                com.google.cloudbuild.v1.WorkerPoolOrBuilder>(
                getWorkerPool(), getParentForChildren(), isClean());
        workerPool_ = null;
      }
      return workerPoolBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.CreateWorkerPoolRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.CreateWorkerPoolRequest)
  private static final com.google.cloudbuild.v1.CreateWorkerPoolRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.CreateWorkerPoolRequest();
  }

  public static com.google.cloudbuild.v1.CreateWorkerPoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkerPoolRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkerPoolRequest>() {
        @java.lang.Override
        public CreateWorkerPoolRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateWorkerPoolRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateWorkerPoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkerPoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.CreateWorkerPoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

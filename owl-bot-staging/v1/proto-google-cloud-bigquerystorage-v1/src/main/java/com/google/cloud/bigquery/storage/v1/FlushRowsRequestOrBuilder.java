// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/storage.proto

package com.google.cloud.bigquery.storage.v1;

public interface FlushRowsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1.FlushRowsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The stream that is the target of the flush operation.
   * </pre>
   *
   * <code>string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The writeStream.
   */
  java.lang.String getWriteStream();
  /**
   * <pre>
   * Required. The stream that is the target of the flush operation.
   * </pre>
   *
   * <code>string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for writeStream.
   */
  com.google.protobuf.ByteString
      getWriteStreamBytes();

  /**
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   * @return Whether the offset field is set.
   */
  boolean hasOffset();
  /**
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   * @return The offset.
   */
  com.google.protobuf.Int64Value getOffset();
  /**
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getOffsetOrBuilder();
}

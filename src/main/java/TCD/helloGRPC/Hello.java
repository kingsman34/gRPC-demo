// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hello.proto

package TCD.helloGRPC;

public final class Hello {
  private Hello() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TCD_helloGRPC_request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TCD_helloGRPC_request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TCD_helloGRPC_response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TCD_helloGRPC_response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Hello.proto\022\rTCD.helloGRPC\"\027\n\007request\022" +
      "\014\n\004name\030\001 \001(\t\"\031\n\010response\022\r\n\005reply\030\001 \001(\t" +
      "2}\n\thelloGRPC\0228\n\005Hello\022\026.TCD.helloGRPC.r" +
      "equest\032\027.TCD.helloGRPC.response\0226\n\003Bye\022\026" +
      ".TCD.helloGRPC.request\032\027.TCD.helloGRPC.r" +
      "esponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TCD_helloGRPC_request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TCD_helloGRPC_request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TCD_helloGRPC_request_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_TCD_helloGRPC_response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TCD_helloGRPC_response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TCD_helloGRPC_response_descriptor,
        new java.lang.String[] { "Reply", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

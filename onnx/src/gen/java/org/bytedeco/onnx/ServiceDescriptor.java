// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Describes an RPC service. Use DescriptorPool to construct your own
// descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ServiceDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServiceDescriptor(Pointer p) { super(p); }


  // The name of the service, not including its containing scope.
  public native @StdString BytePointer name();
  // The fully-qualified name of the service, scope delimited by periods.
  public native @StdString BytePointer full_name();
  // Index of this service within the file's services array.
  public native int index();

  // The .proto file in which this service was defined.  Never nullptr.
  public native @Const FileDescriptor file();

  // Get options for this service type.  These are specified in the .proto file
  // by placing lines like "option foo = 1234;" in the service definition.
  // Allowed options are defined by ServiceOptions in descriptor.proto, and any
  // available extensions of that message.
  public native @Const @ByRef ServiceOptions options();

  // The number of methods this service defines.
  public native int method_count();
  // Gets a MethodDescriptor by index, where 0 <= index < method_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const MethodDescriptor method(int index);

  // Look up a MethodDescriptor by name.
  public native @Const MethodDescriptor FindMethodByName(@StdString BytePointer name);
  public native @Const MethodDescriptor FindMethodByName(@StdString String name);
  // See Descriptor::CopyTo().
  public native void CopyTo(ServiceDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this service declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}

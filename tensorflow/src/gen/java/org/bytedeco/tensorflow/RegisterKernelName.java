// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -----------------------------------------------------------------------------
// OpKernel registration implementation follows, please ignore.

// Allow the REGISTER_KERNEL_BUILDER(Name("op_name").Device(...)...) syntax.

@Name("tensorflow::register_kernel::Name") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RegisterKernelName extends KernelDefBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegisterKernelName(Pointer p) { super(p); }

  // With selective registration, kernels whose implementation class is not used
  // by any kernel are disabled with the SHOULD_REGISTER_OP_KERNEL call in
  // REGISTER_KERNEL_BUILDER_UNIQ. However, an unused kernel that shares an
  // implementation class with a used kernel would get through that mechanism.
  //
  // This mechanism stops that registration by changing the name of the kernel
  // for the unused op to one that is ignored by
  // OpKernelRegistrar::InitInternal.  Note that this method alone is
  // not sufficient - the compiler can't evaluate the entire KernelDefBuilder at
  // compilation time, so this method doesn't actually reduce code size.
  public RegisterKernelName(@Cast("const char*") BytePointer op) { super((Pointer)null); allocate(op); }
  private native void allocate(@Cast("const char*") BytePointer op);
  public RegisterKernelName(String op) { super((Pointer)null); allocate(op); }
  private native void allocate(String op);
}

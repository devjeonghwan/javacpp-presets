// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief The container base structure
 *        contains all the fields except for the Object header.
 *
 * \note We explicitly declare this structure in order to pass
 *       PackedFunc argument using ContainerBase*.
 */
@Name("tvm::runtime::NDArray::ContainerBase") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ContainerBase extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ContainerBase() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ContainerBase(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ContainerBase(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ContainerBase position(long position) {
        return (ContainerBase)super.position(position);
    }
    @Override public ContainerBase getPointer(long i) {
        return new ContainerBase((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief The corresponding dl_tensor field.
   * \note it is important that the first field is DLTensor
   *  So that this data structure is DLTensor compatible.
   *  The head ptr of this struct can be viewed as DLTensor*.
   */
  public native @ByRef DLTensor dl_tensor(); public native ContainerBase dl_tensor(DLTensor setter);

  /**
   * \brief additional context, reserved for recycling
   * \note We can attach additional content here
   *  which the current container depend on
   *  (e.g. reference to original memory when creating views).
   */
  public native Pointer manager_ctx(); public native ContainerBase manager_ctx(Pointer setter);
}

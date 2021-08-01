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
 * \brief Namespace for the list of type index.
 * \note Use struct so that we have to use TypeIndex::ENumName to refer to
 *       the constant, but still able to use enum.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TypeIndex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TypeIndex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeIndex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeIndex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TypeIndex position(long position) {
        return (TypeIndex)super.position(position);
    }
    @Override public TypeIndex getPointer(long i) {
        return new TypeIndex((Pointer)this).offsetAddress(i);
    }

  /** enum tvm::runtime::TypeIndex:: */
  public static final int
    /** \brief Root object type. */
    kRoot = 0,
    // Standard static index assignments,
    // Frontends can take benefit of these constants.
    /** \brief runtime::Module. */
    kRuntimeModule = 1,
    /** \brief runtime::NDArray. */
    kRuntimeNDArray = 2,
    /** \brief runtime::String. */
    kRuntimeString = 3,
    /** \brief runtime::Array. */
    kRuntimeArray = 4,
    /** \brief runtime::Map. */
    kRuntimeMap = 5,
    // static assignments that may subject to change.
    kRuntimeClosure = 6,
    kRuntimeADT = 7,
    kStaticIndexEnd = 8,
    /** \brief Type index is allocated during runtime. */
    kDynamic = kStaticIndexEnd;
}

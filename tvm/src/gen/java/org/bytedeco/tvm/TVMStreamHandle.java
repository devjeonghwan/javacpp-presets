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
 * \brief The stream that is specific to device
 * can be NULL, which indicates the default one.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMStreamHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TVMStreamHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMStreamHandle(Pointer p) { super(p); }
}

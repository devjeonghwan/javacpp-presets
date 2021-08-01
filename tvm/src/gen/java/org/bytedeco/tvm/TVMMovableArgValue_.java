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
 * \brief Internal auxiliary struct for TypedPackedFunc to indicate a movable argument.
 *
 *  We can only construct a movable argument once from a single argument position.
 *  If the argument is passed as RValue reference, the result will be moved.
 *  We should only construct a MovableArg from an argument once,
 *  as the result will can moved.
 *
 * \note For internal development purpose only.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMMovableArgValue_ extends TVMArgValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMMovableArgValue_(Pointer p) { super(p); }

  public TVMMovableArgValue_(@ByVal TVMValue value, int type_code) { super((Pointer)null); allocate(value, type_code); }
  private native void allocate(@ByVal TVMValue value, int type_code);
  // reuse converter from parent
  /**
   * \brief Helper converter function.
   *  Try to move out an argument if possible,
   *  fall back to normal argument conversion rule otherwise.
   */
}

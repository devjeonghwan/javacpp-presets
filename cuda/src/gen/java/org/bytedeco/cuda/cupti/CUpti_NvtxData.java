// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief Data passed into a NVTX callback function.
 *
 * Data passed into a NVTX callback function as the \p cbdata argument
 * to \ref CUpti_CallbackFunc. The \p cbdata will be this type for \p
 * domain equal to CUPTI_CB_DOMAIN_NVTX. Unless otherwise notes, the
 * callback data is valid only within the invocation of the callback
 * function that is passed the data. If you need to retain some data
 * for use outside of the callback, you must make a copy of that data.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_NvtxData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_NvtxData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_NvtxData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_NvtxData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_NvtxData position(long position) {
        return (CUpti_NvtxData)super.position(position);
    }
    @Override public CUpti_NvtxData getPointer(long i) {
        return new CUpti_NvtxData((Pointer)this).offsetAddress(i);
    }

  /**
   * Name of the NVTX API function which issued the callback. This
   * string is a global constant and so may be accessed outside of the
   * callback.
   */
  public native @Cast("const char*") BytePointer functionName(); public native CUpti_NvtxData functionName(BytePointer setter);

  /**
   * Pointer to the arguments passed to the NVTX API call. See
   * generated_nvtx_meta.h for structure definitions for the
   * parameters for each NVTX API function.
   */
  public native @Const Pointer functionParams(); public native CUpti_NvtxData functionParams(Pointer setter);

  /**
   * Pointer to the return value of the NVTX API call. See
   * nvToolsExt.h for each NVTX API function's return value.
   */
  public native @Const Pointer functionReturnValue(); public native CUpti_NvtxData functionReturnValue(Pointer setter);
}

// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** \private
 *  Backward-compat version of TfLiteInterpreterOptionsSetOpResolver.
 * 
 *  WARNING: This function is deprecated / not an official part of the API, is
 *  only for binary backwards compatibility, and should not be called. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Find_builtin_op_v3_Pointer_int_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Find_builtin_op_v3_Pointer_int_int(Pointer p) { super(p); }
    protected Find_builtin_op_v3_Pointer_int_int() { allocate(); }
    private native void allocate();
    public native @Const TfLiteRegistration_V3 call(Pointer user_data,
                                                       @Cast("TfLiteBuiltinOperator") int op,
                                                       int version);
}

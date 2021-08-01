// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ErrorCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ErrorCallback(Pointer p) { super(p); }
    protected ErrorCallback() { allocate(); }
    private native void allocate();
    public native int call( int status, @Cast("const char*") BytePointer func_name,
                                       @Cast("const char*") BytePointer err_msg, @Cast("const char*") BytePointer file_name,
                                       int line, Pointer userdata );
}

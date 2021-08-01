// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Register a function to be called when ShutdownProtocolBuffers() is called.
@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Func extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func(Pointer p) { super(p); }
    protected Func() { allocate(); }
    private native void allocate();
    public native void call();
}

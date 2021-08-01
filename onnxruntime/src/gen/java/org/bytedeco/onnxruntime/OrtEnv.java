// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


// The actual types defined have an Ort prefix
@Opaque @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtEnv extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OrtEnv() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtEnv(Pointer p) { super(p); }
}

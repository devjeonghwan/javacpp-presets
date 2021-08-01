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
  // nullptr for Status* indicates success
@Opaque @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtMemoryInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OrtMemoryInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtMemoryInfo(Pointer p) { super(p); }
}

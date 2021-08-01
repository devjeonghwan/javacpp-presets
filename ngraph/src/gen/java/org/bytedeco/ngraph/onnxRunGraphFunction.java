// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxRunGraphFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxRunGraphFunction(Pointer p) { super(p); }
    protected onnxRunGraphFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxGraph graph,
    @Const onnxMemoryFenceV1 inputFence,
    onnxMemoryFenceV1 outputFence);
}

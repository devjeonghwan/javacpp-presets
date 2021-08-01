// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Specifies whole pipeline, nodes, properties and connections between nodes IOs
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class PipelineSchema extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PipelineSchema() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PipelineSchema(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PipelineSchema(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PipelineSchema position(long position) {
        return (PipelineSchema)super.position(position);
    }
    @Override public PipelineSchema getPointer(long i) {
        return new PipelineSchema((Pointer)this).offsetAddress(i);
    }

    public native @StdVector NodeConnectionSchema connections(); public native PipelineSchema connections(NodeConnectionSchema setter);
    public native @ByRef GlobalProperties globalProperties(); public native PipelineSchema globalProperties(GlobalProperties setter);
    public native @ByRef LongNodeObjInfoMap nodes(); public native PipelineSchema nodes(LongNodeObjInfoMap setter);
}

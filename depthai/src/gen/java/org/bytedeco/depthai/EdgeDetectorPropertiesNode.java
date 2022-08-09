// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("dai::NodeCRTP<dai::Node,dai::node::EdgeDetector,dai::EdgeDetectorProperties>") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EdgeDetectorPropertiesNode extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeDetectorPropertiesNode(Pointer p) { super(p); }

    /** Underlying properties */
    public native @Cast("dai::NodeCRTP<dai::Node,dai::node::EdgeDetector,dai::EdgeDetectorProperties>::Properties*") @ByRef EdgeDetectorProperties properties(); public native EdgeDetectorPropertiesNode properties(EdgeDetectorProperties setter);
    public native @Override @Cast("const char*") BytePointer getName();
    public native @UniquePtr @Override Node clone();
}

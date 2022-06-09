// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ReduceLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ReduceLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ReduceLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ReduceLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ReduceLayer position(long position) {
            return (ReduceLayer)super.position(position);
        }
        @Override public ReduceLayer getPointer(long i) {
            return new ReduceLayer((Pointer)this).offsetAddress(i);
        }
    
        public native int reduceType(); public native ReduceLayer reduceType(int setter);
        public native @Cast("size_t*") @StdVector SizeTPointer reduceDims(); public native ReduceLayer reduceDims(SizeTPointer setter);
        public static native @Ptr ReduceLayer create(@Const @ByRef LayerParams params);
    }

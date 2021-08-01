// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

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
public class LRNLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public LRNLayer(Pointer p) { super(p); }
    
        public native @Name("type") int lrnType(); public native LRNLayer lrnType(int setter);

        public native int size(); public native LRNLayer size(int setter);
        public native float alpha(); public native LRNLayer alpha(float setter);
        public native float beta(); public native LRNLayer beta(float setter);
        public native float bias(); public native LRNLayer bias(float setter);
        public native @Cast("bool") boolean normBySize(); public native LRNLayer normBySize(boolean setter);

        public static native @Ptr LRNLayer create(@Const @ByRef LayerParams params);
    }

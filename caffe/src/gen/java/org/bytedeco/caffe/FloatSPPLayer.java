// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Does spatial pyramid pooling on the input image
 *        by taking the max, average, etc. within regions
 *        so that the result vector of different sized
 *        images are of the same size.
 */
@Name("caffe::SPPLayer<float>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatSPPLayer extends FloatLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatSPPLayer(Pointer p) { super(p); }

  public FloatSPPLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);
  @Virtual public native void LayerSetUp(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual public native void Reshape(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual public native @Const({false, false, true}) int ExactNumBottomBlobs();
  @Virtual public native @Const({false, false, true}) int ExactNumTopBlobs();
  @Virtual protected native void Forward_cpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Backward_cpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native @ByVal LayerParameter GetPoolingParam(@Const int pyramid_level,
        @Const int bottom_h, @Const int bottom_w, @Const @ByVal SPPParameter spp_param);
}

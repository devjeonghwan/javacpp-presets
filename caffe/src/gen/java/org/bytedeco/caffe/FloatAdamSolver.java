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
 * \brief AdamSolver, an algorithm for first-order gradient-based optimization
 *        of stochastic objective functions, based on adaptive estimates of
 *        lower-order moments. Described in [1].
 *
 * [1] D. P. Kingma and J. L. Ba, "ADAM: A Method for Stochastic Optimization."
 *     arXiv preprint arXiv:1412.6980v8 (2014).
 */
@Name("caffe::AdamSolver<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatAdamSolver extends FloatSGDSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatAdamSolver(Pointer p) { super(p); }

  public FloatAdamSolver(@Const @ByRef SolverParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef SolverParameter param);
  public FloatAdamSolver(@Const @StdString @ByRef BytePointer param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef BytePointer param_file);
  public FloatAdamSolver(@Const @StdString @ByRef String param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef String param_file);
  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native void ComputeUpdateValue(int param_id, float rate);
}

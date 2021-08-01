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

@Name("caffe::MemoryDataLayer<double>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleMemoryDataLayer extends DoubleBaseDataLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleMemoryDataLayer(Pointer p) { super(p); }

  public DoubleMemoryDataLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);
  @Virtual public native void DataLayerSetUp(@Const @ByRef DoubleBlobVector bottom,
        @Const @ByRef DoubleBlobVector top);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual public native @Const({false, false, true}) int ExactNumBottomBlobs();
  @Virtual public native @Const({false, false, true}) int ExactNumTopBlobs();

  @Virtual public native void AddDatumVector(@Const @ByRef DatumVector datum_vector);
// #ifdef USE_OPENCV
  @Virtual public native void AddMatVector(@Const @ByRef MatVector mat_vector,
        @Cast({"int*", "const std::vector<int>&"}) @StdVector IntPointer labels);
// #endif  // USE_OPENCV

  // Reset should accept const pointers, but can't, because the memory
  //  will be given to Blob, which is mutable
  public native void Reset(DoublePointer data, DoublePointer label, int n);
  public native void Reset(DoubleBuffer data, DoubleBuffer label, int n);
  public native void Reset(double[] data, double[] label, int n);
  public native void set_batch_size(int new_size);

  public native int batch_size();
  public native int channels();
  public native int height();
  public native int width();
  @Virtual protected native void Forward_cpu(@Const @ByRef DoubleBlobVector bottom,
        @Const @ByRef DoubleBlobVector top);
}

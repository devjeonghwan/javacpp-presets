// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Legacy. Will be deprecated in favor of {@code TfLiteAffineQuantization}.
 *  If per-layer quantization is specified this field will still be populated in
 *  addition to {@code TfLiteAffineQuantization}.
 *  Parameters for asymmetric quantization. Quantized values can be converted
 *  back to float using: {@code real_value = scale * (quantized_value - zero_point)} */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteQuantizationParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteQuantizationParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteQuantizationParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteQuantizationParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteQuantizationParams position(long position) {
        return (TfLiteQuantizationParams)super.position(position);
    }
    @Override public TfLiteQuantizationParams getPointer(long i) {
        return new TfLiteQuantizationParams((Pointer)this).offsetAddress(i);
    }

  public native float scale(); public native TfLiteQuantizationParams scale(float setter);
  public native int zero_point(); public native TfLiteQuantizationParams zero_point(int setter);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the gradients of convolution with respect to the input.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_sizes: An integer vector representing the shape of {@code input},
 *  where {@code input} is a 4-D {@code [batch, height, width, channels]} tensor.
 *  * filter: 4-D with shape
 *  {@code [filter_height, filter_width, in_channels, out_channels]}.
 *  * out_backprop: 4-D with shape {@code [batch, out_height, out_width, out_channels]}.
 *  Gradients w.r.t. the output of the convolution.
 *  * strides: The stride of the sliding window for each dimension of the input
 *  of the convolution. Must be in the same order as the dimension specified with
 *  format.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * explicit_paddings: If {@code padding} is {@code "EXPLICIT"}, the list of explicit padding amounts. For the ith
 *  dimension, the amount of padding inserted before and after the dimension is
 *  {@code explicit_paddings[2 * i]} and {@code explicit_paddings[2 * i + 1]}, respectively. If
 *  {@code padding} is not {@code "EXPLICIT"}, {@code explicit_paddings} must be empty.
 *  * data_format: Specify the data format of the input and output data. With the
 *  default format "NHWC", the data is stored in the order of:
 *      [batch, in_height, in_width, in_channels].
 *  Alternatively, the format could be "NCHW", the data storage order of:
 *      [batch, in_channels, in_height, in_width].
 *  * dilations: 1-D tensor of length 4.  The dilation factor for each dimension of
 *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each filter
 *  element on that dimension. The dimension order is determined by the value of
 *  {@code data_format}, see above for details. Dilations in the batch and depth
 *  dimensions must be 1.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape {@code [batch, in_height, in_width, in_channels]}.  Gradient
 *  w.r.t. the input of the convolution. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Conv2DBackpropInput extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv2DBackpropInput(Pointer p) { super(p); }

  /** Optional attribute setters for Conv2DBackpropInput */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Defaults to true */
    
    ///
    public native @ByVal Attrs UseCudnnOnGpu(@Cast("bool") boolean x);

    /** If {@code padding} is {@code "EXPLICIT"}, the list of explicit padding amounts. For the ith
     *  dimension, the amount of padding inserted before and after the dimension is
     *  {@code explicit_paddings[2 * i]} and {@code explicit_paddings[2 * i + 1]}, respectively. If
     *  {@code padding} is not {@code "EXPLICIT"}, {@code explicit_paddings} must be empty.
     * 
     *  Defaults to [] */
    
    ///
    public native @ByVal Attrs ExplicitPaddings(@ArraySlice IntPointer x);
    public native @ByVal Attrs ExplicitPaddings(@ArraySlice IntBuffer x);
    public native @ByVal Attrs ExplicitPaddings(@ArraySlice int... x);

    /** Specify the data format of the input and output data. With the
     *  default format "NHWC", the data is stored in the order of:
     *      [batch, in_height, in_width, in_channels].
     *  Alternatively, the format could be "NCHW", the data storage order of:
     *      [batch, in_channels, in_height, in_width].
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    /** 1-D tensor of length 4.  The dilation factor for each dimension of
     *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each filter
     *  element on that dimension. The dimension order is determined by the value of
     *  {@code data_format}, see above for details. Dilations in the batch and depth
     *  dimensions must be 1.
     * 
     *  Defaults to [1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @Cast("bool") boolean use_cudnn_on_gpu_(); public native Attrs use_cudnn_on_gpu_(boolean setter);
    public native @ArraySlice IntPointer explicit_paddings_(); public native Attrs explicit_paddings_(IntPointer setter);
    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv2DBackpropInput(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_sizes, @ByVal Input filter,
                      @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseCudnnOnGpu(@Cast("bool") boolean x);
  public static native @ByVal Attrs ExplicitPaddings(@ArraySlice IntPointer x);
  public static native @ByVal Attrs ExplicitPaddings(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs ExplicitPaddings(@ArraySlice int... x);
  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native Conv2DBackpropInput operation(Operation setter);
  public native @ByRef Output output(); public native Conv2DBackpropInput output(Output setter);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// --------------------------------------------------------------------------
// TF_Buffer holds a pointer to a block of data and its associated length.
// Typically, the data consists of a serialized protocol buffer, but other data
// may also be held in a buffer.
//
// By default, TF_Buffer itself does not do any memory management of the
// pointed-to block.  If need be, users of this struct should specify how to
// deallocate the block by setting the `data_deallocator` function pointer.
@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Buffer extends org.bytedeco.tensorflow.AbstractTF_Buffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_Buffer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_Buffer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Buffer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_Buffer position(long position) {
        return (TF_Buffer)super.position(position);
    }
    @Override public TF_Buffer getPointer(long i) {
        return new TF_Buffer((Pointer)this).offsetAddress(i);
    }

  public native @Const Pointer data(); public native TF_Buffer data(Pointer data);
  public native @Cast("size_t") long length(); public native TF_Buffer length(long setter);
  public static class Data_deallocator_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Data_deallocator_Pointer_long(Pointer p) { super(p); }
      protected Data_deallocator_Pointer_long() { allocate(); }
      private native void allocate();
      public native void call(Pointer data, @Cast("size_t") long length);
  }
  public native Data_deallocator_Pointer_long data_deallocator(); public native TF_Buffer data_deallocator(Data_deallocator_Pointer_long setter);
}

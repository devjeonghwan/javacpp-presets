// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArraySortOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArraySortOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArraySortOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ArraySortOptions position(long position) {
        return (ArraySortOptions)super.position(position);
    }
    @Override public ArraySortOptions getPointer(long i) {
        return new ArraySortOptions((Pointer)this).offsetAddress(i);
    }

  public ArraySortOptions(SortOrder order/*=arrow::compute::SortOrder::Ascending*/) { super((Pointer)null); allocate(order); }
  private native void allocate(SortOrder order/*=arrow::compute::SortOrder::Ascending*/);
  public ArraySortOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ArraySortOptions(@Cast("arrow::compute::SortOrder") int order/*=arrow::compute::SortOrder::Ascending*/) { super((Pointer)null); allocate(order); }
  private native void allocate(@Cast("arrow::compute::SortOrder") int order/*=arrow::compute::SortOrder::Ascending*/);

  public static native @ByVal ArraySortOptions Defaults();

  public native SortOrder order(); public native ArraySortOptions order(SortOrder setter);
}

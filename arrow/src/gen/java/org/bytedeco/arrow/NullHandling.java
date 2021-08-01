// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief The strategy to use for propagating or otherwise populating the
 *  validity bitmap of a kernel output. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NullHandling extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NullHandling() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NullHandling(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullHandling(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NullHandling position(long position) {
        return (NullHandling)super.position(position);
    }
    @Override public NullHandling getPointer(long i) {
        return new NullHandling((Pointer)this).offsetAddress(i);
    }

  public enum type {
    /** Compute the output validity bitmap by intersecting the validity bitmaps
     *  of the arguments using bitwise-and operations. This means that values
     *  in the output are valid/non-null only if the corresponding values in
     *  all input arguments were valid/non-null. Kernel generally need not
     *  touch the bitmap thereafter, but a kernel's exec function is permitted
     *  to alter the bitmap after the null intersection is computed if it needs
     *  to. */
    INTERSECTION(0),

    /** Kernel expects a pre-allocated buffer to write the result bitmap
     *  into. The preallocated memory is not zeroed (except for the last byte),
     *  so the kernel should ensure to completely populate the bitmap. */
    COMPUTED_PREALLOCATE(1),

    /** Kernel allocates and sets the validity bitmap of the output. */
    COMPUTED_NO_PREALLOCATE(2),

    /** Kernel output is never null and a validity bitmap does not need to be
     *  allocated. */
    OUTPUT_NOT_NULL(3);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}

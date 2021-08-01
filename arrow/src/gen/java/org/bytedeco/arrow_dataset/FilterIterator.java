// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Like MapIterator, but where the function can fail. */

@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FilterIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FilterIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FilterIterator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FilterIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FilterIterator position(long position) {
        return (FilterIterator)super.position(position);
    }
    @Override public FilterIterator getPointer(long i) {
        return new FilterIterator((Pointer)this).offsetAddress(i);
    }

  public enum Action { ACCEPT(0), REJECT(1);

      public final int value;
      private Action(int v) { this.value = v; }
      private Action(Action e) { this.value = e.value; }
      public Action intern() { for (Action e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}

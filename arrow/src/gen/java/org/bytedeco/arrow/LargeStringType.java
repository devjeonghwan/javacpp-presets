// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for large variable-size string data, utf8-encoded */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeStringType extends LargeBinaryType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeStringType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LargeStringType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LargeStringType position(long position) {
        return (LargeStringType)super.position(position);
    }
    @Override public LargeStringType getPointer(long i) {
        return new LargeStringType((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();
  @MemberGetter public static native @Cast("const bool") boolean is_utf8();
  public static final boolean is_utf8 = is_utf8();

  public static native String type_name();

  public LargeStringType() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @StdString String ToString();
  public native @StdString String name();
}

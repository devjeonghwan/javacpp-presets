// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Represents a location in source code (for debugging). */
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SourceLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SourceLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SourceLocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SourceLocation position(long position) {
        return (SourceLocation)super.position(position);
    }
    @Override public SourceLocation getPointer(long i) {
        return new SourceLocation((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer function(); public native SourceLocation function(BytePointer setter);
  public native @Cast("const char*") BytePointer file(); public native SourceLocation file(BytePointer setter);
  public native @Cast("uint32_t") int line(); public native SourceLocation line(int setter);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

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


@Namespace("at::indexing") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EllipsisIndexType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EllipsisIndexType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EllipsisIndexType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EllipsisIndexType position(long position) {
        return (EllipsisIndexType)super.position(position);
    }
    @Override public EllipsisIndexType getPointer(long i) {
        return new EllipsisIndexType((Pointer)this).offsetAddress(i);
    }
 public EllipsisIndexType() { super((Pointer)null); allocate(); }
private native void allocate(); }

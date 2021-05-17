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

@Namespace("torch::enumtype") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class kArea extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public kArea(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public kArea(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public kArea position(long position) {
        return (kArea)super.position(position);
    }
    @Override public kArea getPointer(long i) {
        return new kArea((Pointer)this).offsetAddress(i);
    }
 public kArea() { super((Pointer)null); allocate(); }
private native void allocate(); }

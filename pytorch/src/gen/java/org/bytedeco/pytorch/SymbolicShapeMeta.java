// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymbolicShapeMeta extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SymbolicShapeMeta() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymbolicShapeMeta(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolicShapeMeta(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SymbolicShapeMeta position(long position) {
        return (SymbolicShapeMeta)super.position(position);
    }
    @Override public SymbolicShapeMeta getPointer(long i) {
        return new SymbolicShapeMeta((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoOffset SymDimVector sizes_(); public native SymbolicShapeMeta sizes_(SymDimVector setter);
  public native @ByRef @NoOffset SymDimVector strides_(); public native SymbolicShapeMeta strides_(SymDimVector setter);
  public native @ByRef @NoOffset SymInt numel_(); public native SymbolicShapeMeta numel_(SymInt setter);
  public native @ByRef @NoOffset SymInt storage_offset_(); public native SymbolicShapeMeta storage_offset_(SymInt setter);
  public native @ByRef @NoOffset SymBool is_contiguous_(); public native SymbolicShapeMeta is_contiguous_(SymBool setter);
  public native @ByRef @NoOffset SymBool is_channels_last_contiguous_(); public native SymbolicShapeMeta is_channels_last_contiguous_(SymBool setter);
  public native @ByRef @NoOffset SymBool is_channels_last_3d_contiguous_(); public native SymbolicShapeMeta is_channels_last_3d_contiguous_(SymBool setter);
  public native @ByRef @NoOffset SymBool is_channels_last_(); public native SymbolicShapeMeta is_channels_last_(SymBool setter);
  public native @ByRef @NoOffset SymBool is_channels_last_3d_(); public native SymbolicShapeMeta is_channels_last_3d_(SymBool setter);
  public native @ByRef @NoOffset SymBool is_non_overlapping_and_dense_(); public native SymbolicShapeMeta is_non_overlapping_and_dense_(SymBool setter);
}

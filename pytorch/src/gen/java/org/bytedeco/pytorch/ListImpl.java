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


@Namespace("c10::detail") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ListImpl extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ListImpl(Pointer p) { super(p); }


  public ListImpl(@StdVector IValue list_, @SharedPtr Type elementType_) { super((Pointer)null); allocate(list_, elementType_); }
  private native void allocate(@StdVector IValue list_, @SharedPtr Type elementType_);

  public native @StdVector IValue list(); public native ListImpl list(IValue setter);

  public native @SharedPtr Type elementType(); public native ListImpl elementType(Type setter);
  
}

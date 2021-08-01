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

@NoOffset @Name("std::tuple<at::Tensor,at::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorTensorTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTensorTuple(Pointer p) { super(p); }
    public TensorTensorTuple(@ByRef Tensor value0, @ByRef Tensor value1) { allocate(value0, value1); }
    private native void allocate(@ByRef Tensor value0, @ByRef Tensor value1);
    public TensorTensorTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorTensorTuple put(@ByRef TensorTensorTuple x);

    public @ByRef Tensor get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Tensor get0(@ByRef TensorTensorTuple container);
    public @ByRef Tensor get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef Tensor get1(@ByRef TensorTensorTuple container);
}


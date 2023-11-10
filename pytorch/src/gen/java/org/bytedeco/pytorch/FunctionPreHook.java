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


@Namespace("torch::autograd") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FunctionPreHook extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionPreHook(Pointer p) { super(p); }

  public native @Name("operator ()") @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector apply(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector grads);
  // only implemented for python hooks, registers hook with compiled autograd
  public native void compiled_args(@ByRef CompiledNodeArgs args);
}

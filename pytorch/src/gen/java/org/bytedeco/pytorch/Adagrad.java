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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Adagrad extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Adagrad(Pointer p) { super(p); }

  public Adagrad(@StdVector OptimizerParamGroup param_groups,
        @ByVal(nullValue = "torch::optim::AdagradOptions{}") AdagradOptions defaults) { super((Pointer)null); allocate(param_groups, defaults); }
  private native void allocate(@StdVector OptimizerParamGroup param_groups,
        @ByVal(nullValue = "torch::optim::AdagradOptions{}") AdagradOptions defaults);
  public Adagrad(@StdVector OptimizerParamGroup param_groups) { super((Pointer)null); allocate(param_groups); }
  private native void allocate(@StdVector OptimizerParamGroup param_groups);

  public Adagrad(
        @StdMove TensorVector params,
        @ByVal(nullValue = "torch::optim::AdagradOptions{}") AdagradOptions defaults) { super((Pointer)null); allocate(params, defaults); }
  private native void allocate(
        @StdMove TensorVector params,
        @ByVal(nullValue = "torch::optim::AdagradOptions{}") AdagradOptions defaults);
  public Adagrad(
        @StdMove TensorVector params) { super((Pointer)null); allocate(params); }
  private native void allocate(
        @StdMove TensorVector params);

  public native @ByVal Tensor step(@ByVal(nullValue = "torch::optim::Optimizer::LossClosure(nullptr)") LossClosure closure);
  public native @ByVal Tensor step();
  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}

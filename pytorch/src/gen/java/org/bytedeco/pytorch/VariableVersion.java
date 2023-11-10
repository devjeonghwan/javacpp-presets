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


// NOTE [ Version Counter Sharing ]
//
// Every Tensor has a version counter. Version counters are incremented whenever
// the data or size of a tensor changes through in-place Variable operations.
// Version counters are used to detect modifications to saved variables which
// would result in incorrect gradient calculations. Version counters may be
// shared between Variables:
//
// 1. A view shares the version counter of the base Variable,
// 2. `x.detach()` shares the version counter of `x`,
// 3. Unpacked saved variables share the version counter of the source.
//
// Version counters are not shared in these scenarios:
//
// 1. When we replace a `Variable`'s underlying `Tensor` by calling
// `set_data(...)`,
// 2. `x.data` does not share the version counter of `x`. (See discussion at
// https://github.com/pytorch/pytorch/issues/5396)
//
// Question: Why do we put the version counter in TensorImpl instead of
// AutogradMeta?
//
// Answer: After the Variable/Tensor merge, a tensor will not have AutogradMeta
// when its `requires_grad_` is false, but when we use this tensor in the
// forward pass of a function that requires saving this tensor for backward, we
// need to keep track of this tensor's version to make sure it's always valid in
// the autograd graph.
//
// To achieve this goal, we put the version counter in TensorImpl instead of
// AutogradMeta, and have it always be available. This allows us to have the
// optimization of not carrying AutogradMeta when a tensor doesn't require
// gradient.
//
// A hypothetical alternative way to achieve this goal is to initialize
// AutogradMeta and create the version counter for the non-requires-grad tensor
// only when it's saved for backward. However, since saving a tensor for
// backward happens in the forward pass, and our invariant is that forward pass
// needs to be thread-safe, lazy-initializing AutogradMeta when saving a tensor
// can introduce race conditions when we are running the forward pass in
// multi-thread scenarios, thus making the forward pass not thread-safe anymore,
// which breaks the invariant.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class VariableVersion extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariableVersion(Pointer p) { super(p); }

  // Note [Disabled VariableVersion]
  // VariableVersion struct has an intrusive_ptr pointing VersionCounter struct
  // with an atomic variable. Thus `VariableVersion(/*version=*/0)` is not as
  // cheap as we expected. In some cases constructing a VariableVersion with
  // version 0 is not necessary so we add a cheap constructor which
  // doesn't allocate the intrusive_ptr.
  // Example use cases are:
  //  - Inference tensors don't track version counter, so they'll just always
  //    have disabled VariableVersion.
  //  - In SavedVariable class we override version_counter_ inside its
  //  constructor
  //    so that we can use the cheap constructor there.
  public enum Disabled { DISABLED(0);

      public final int value;
      private Disabled(int v) { this.value = v; }
      private Disabled(Disabled e) { this.value = e.value; }
      public Disabled intern() { for (Disabled e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  // It's okay to return true even for inference tensor which
  // doesn't have version counter enabled.
  // We want to be permissive here since in many cases (e.g. make_variable)
  // we can std::move a TensorImpl if there's no other uses which saves us
  // an additional TensorImpl allocation.
  public native @Cast("bool") boolean unique();
  // NOTE: As of C++11 and 14, default-constructing a std::atomic variable
  // leaves it in a persistently undefined state. See
  // https://cplusplus.github.io/LWG/issue2334.
  public VariableVersion(@Cast("uint32_t") int version) { super((Pointer)null); allocate(version); }
  private native void allocate(@Cast("uint32_t") int version);
  public VariableVersion(Disabled arg0/*=c10::VariableVersion::DISABLED*/) { super((Pointer)null); allocate(arg0); }
  private native void allocate(Disabled arg0/*=c10::VariableVersion::DISABLED*/);
  public VariableVersion() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") boolean enabled();

  // Note [Inplace update inference tensor]
  // 1. Inplace update to inference tensor is forbidden in normal mode.
  //   For example:
  //     inference_tensor.copy_(normal_tensor_requires_grad)
  //   This inplace makes inference_tensor have requires_grad=True and
  //   have a grad_fn.  This is bad because views of `inference_tensor`
  //   created in InferenceMode won't be able to know the grad_fn since
  //   their ViewMeta were not recorded. To match NoGradMode behavior
  //   that "inplace update to a view created in NoGradMode raise an error",
  //   we just ban inplace update to inference tensor since we can't tell
  //   if an inference tensor is a view created in InferenceMode.
  //
  //   Note that views of normal tensor created in InferenceMode has proper
  //   ViewMeta so that they're aware of the grad_fn correctly.
  //
  // 2. Inplace update to inference tensor in inference tensor doesn't bump
  //    version counter.
  //    * It either doesn't call bump() by skipping ADInplaceOrView kernel,
  //      - e.g. inference_tensor.add_(1)
  //    * or bump() is a no-op for inference tensor.
  //      - e.g. inference_tensor.add_(normal_tensor)
  public native void bump();

  public native void set_version(@Cast("int64_t") long i);

  // Inference tensor doesn't have version counter so it shouldn't be
  // accessed.
  public native @Cast("uint32_t") int current_version();
}

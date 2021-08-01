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


/** A smart pointer around either a borrowed or owned T. When
 *  constructed with borrowed(), the caller MUST ensure that the
 *  borrowed-from argument outlives this MaybeOwned<T>. Compare to
 *  Rust's std::borrow::Cow
 *  (https://doc.rust-lang.org/std/borrow/enum.Cow.html), but note
 *  that it is probably not suitable for general use because C++ has
 *  no borrow checking. Included here to support
 *  Tensor::expect_contiguous. */
@Name("c10::MaybeOwned<at::Tensor>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorMaybeOwned extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorMaybeOwned(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorMaybeOwned(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorMaybeOwned position(long position) {
        return (TensorMaybeOwned)super.position(position);
    }
    @Override public TensorMaybeOwned getPointer(long i) {
        return new TensorMaybeOwned((Pointer)this).offsetAddress(i);
    }

  public TensorMaybeOwned() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Copying a borrow yields another borrow of the original, as with a
  // T*. Copying an owned T yields another owned T for safety: no
  // chains of borrowing by default! (Note you could get that behavior
  // with MaybeOwned<T>::borrowed(*rhs) if you wanted it.)
  public TensorMaybeOwned(@Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned rhs);

  public native @ByRef @Name("operator =") TensorMaybeOwned put(@Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned rhs);

  public static native @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned borrowed(@Const @ByRef Tensor t);

  public static native @NoException(true) @Cast({"", "c10::MaybeOwned<at::Tensor>&&"}) @StdMove TensorMaybeOwned owned(@ByRef(true) Tensor t);

  public native @Const @ByRef @Name("operator *") Tensor multiply();

  public native @Const @Name("operator ->") Tensor access();

  // If borrowed, copy the underlying T. If owned, move from
  // it. borrowed/owned state remains the same, and either we
  // reference the same borrow as before or we are an owned moved-from
  // T.
  
}

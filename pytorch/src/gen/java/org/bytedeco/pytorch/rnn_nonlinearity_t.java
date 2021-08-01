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

@NoOffset @Name("c10::variant<torch::enumtype::kTanh,torch::enumtype::kReLU>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class rnn_nonlinearity_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rnn_nonlinearity_t(Pointer p) { super(p); }
    public rnn_nonlinearity_t(kTanh value) { this(); put(value); }
    public rnn_nonlinearity_t(kReLU value) { this(); put(value); }
    public rnn_nonlinearity_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef rnn_nonlinearity_t put(@ByRef rnn_nonlinearity_t x);

    public @ByRef kTanh get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kTanh get0(@ByRef rnn_nonlinearity_t container);
    @ValueSetter public native rnn_nonlinearity_t put(@ByRef kTanh value);
    public @ByRef kReLU get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kReLU get1(@ByRef rnn_nonlinearity_t container);
    @ValueSetter public native rnn_nonlinearity_t put(@ByRef kReLU value);
}


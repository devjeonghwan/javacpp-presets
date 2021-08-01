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


@Name("torch::optim::OptimizerCloneableParamState<torch::optim::AdagradParamState>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableAdagradParamState extends OptimizerParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableAdagradParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableAdagradParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableAdagradParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableAdagradParamState position(long position) {
        return (OptimizerCloneableAdagradParamState)super.position(position);
    }
    @Override public OptimizerCloneableAdagradParamState getPointer(long i) {
        return new OptimizerCloneableAdagradParamState((Pointer)this).offsetAddress(i);
    }

}

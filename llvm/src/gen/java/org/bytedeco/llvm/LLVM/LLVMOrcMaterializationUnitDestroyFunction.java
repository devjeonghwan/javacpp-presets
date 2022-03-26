// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A MaterializationUnit destruction callback.
 *
 * If a custom MaterializationUnit is destroyed before its Materialize
 * function is called then this function will be called to provide an
 * opportunity for the underlying program representation to be destroyed.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcMaterializationUnitDestroyFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcMaterializationUnitDestroyFunction(Pointer p) { super(p); }
    protected LLVMOrcMaterializationUnitDestroyFunction() { allocate(); }
    private native void allocate();
    public native void call(Pointer Ctx);
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryManagerDestroyCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMMemoryManagerDestroyCallback(Pointer p) { super(p); }
    protected LLVMMemoryManagerDestroyCallback() { allocate(); }
    private native void allocate();
    public native void call(Pointer Opaque);
}

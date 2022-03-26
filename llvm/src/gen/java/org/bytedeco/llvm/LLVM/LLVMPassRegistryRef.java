// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/** @see llvm::PassRegistry */
@Name("LLVMOpaquePassRegistry") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMPassRegistryRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMPassRegistryRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMPassRegistryRef(Pointer p) { super(p); }
}

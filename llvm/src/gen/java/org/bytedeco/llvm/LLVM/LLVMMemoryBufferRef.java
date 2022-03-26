// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/* Opaque types. */

/**
 * LLVM uses a polymorphic type hierarchy which C cannot represent, therefore
 * parameters must be passed as base types. Despite the declared types, most
 * of the functions provided operate only on branches of the type hierarchy.
 * The declared parameter names are descriptive and specify which type is
 * required. Additionally, each type hierarchy is documented along with the
 * functions that operate upon it. For more detail, refer to LLVM's C++ code.
 * If in doubt, refer to Core.cpp, which performs parameter downcasts in the
 * form unwrap<RequiredType>(Param).
 */

/**
 * Used to pass regions of memory through LLVM interfaces.
 *
 * @see llvm::MemoryBuffer
 */
@Name("LLVMOpaqueMemoryBuffer") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryBufferRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMMemoryBufferRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMMemoryBufferRef(Pointer p) { super(p); }
}

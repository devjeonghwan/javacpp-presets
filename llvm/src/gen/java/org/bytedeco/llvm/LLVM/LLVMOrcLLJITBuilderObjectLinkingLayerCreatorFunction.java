// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * \defgroup LLVMCExecutionEngineLLJIT LLJIT
 * \ingroup LLVMCExecutionEngine
 *
 * \{
 */

/**
 * A function for constructing an ObjectLinkingLayer instance to be used
 * by an LLJIT instance.
 *
 * Clients can call LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator to
 * set the creator function to use when constructing an LLJIT instance.
 * This can be used to override the default linking layer implementation
 * that would otherwise be chosen by LLJITBuilder.
 *
 * Object linking layers returned by this function will become owned by the
 * LLJIT instance. The client is not responsible for managing their lifetimes
 * after the function returns.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction(Pointer p) { super(p); }
    protected LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction() { allocate(); }
    private native void allocate();
    public native LLVMOrcObjectLayerRef call(
    Pointer Ctx, LLVMOrcExecutionSessionRef ES, @Cast("const char*") BytePointer Triple);
}

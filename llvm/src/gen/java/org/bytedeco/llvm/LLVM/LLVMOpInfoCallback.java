// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * The type for the operand information call back function.  This is called to
 * get the symbolic information for an operand of an instruction.  Typically
 * this is from the relocation information, symbol table, etc.  That block of
 * information is saved when the disassembler context is created and passed to
 * the call back in the DisInfo parameter.  The instruction containing operand
 * is at the PC parameter.  For some instruction sets, there can be more than
 * one operand with symbolic information.  To determine the symbolic operand
 * information for each operand, the bytes for the specific operand in the
 * instruction are specified by the Offset parameter and its byte widith is the
 * size parameter.  For instructions sets with fixed widths and one symbolic
 * operand per instruction, the Offset parameter will be zero and Size parameter
 * will be the instruction width.  The information is returned in TagBuf and is
 * Triple specific with its specific information defined by the value of
 * TagType for that Triple.  If symbolic information is returned the function
 * returns 1, otherwise it returns 0.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOpInfoCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOpInfoCallback(Pointer p) { super(p); }
    protected LLVMOpInfoCallback() { allocate(); }
    private native void allocate();
    public native int call(Pointer DisInfo, @Cast("uint64_t") long PC,
                                  @Cast("uint64_t") long Offset, @Cast("uint64_t") long Size,
                                  int TagType, Pointer TagBuf);
}

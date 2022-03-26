// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/** \defgroup CINDEX libclang: C Interface to Clang
 *
 * The C Interface to Clang provides a relatively small API that exposes
 * facilities for parsing source code into an abstract syntax tree (AST),
 * loading already-parsed ASTs, traversing the AST, associating
 * physical source locations with elements within the AST, and other
 * facilities that support Clang-based development tools.
 *
 * This C interface to Clang will never provide all of the information
 * representation stored in Clang's C++ AST, nor should it: the intent is to
 * maintain an API that is relatively stable from one release to the next,
 * providing only the basic functionality needed to support development tools.
 *
 * To avoid namespace pollution, data types are prefixed with "CX" and
 * functions are prefixed with "clang_".
 *
 * \{
 */

/**
 * An "index" that consists of a set of translation units that would
 * typically be linked together into an executable or library.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIndex extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIndex() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIndex(Pointer p) { super(p); }
}

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * A type containing information related to an expression that is returned by
 * \ref hs_expression_info() or \ref hs_expression_ext_info.
 */
@Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_expr_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public hs_expr_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public hs_expr_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_expr_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public hs_expr_info_t position(long position) {
        return (hs_expr_info_t)super.position(position);
    }
    @Override public hs_expr_info_t getPointer(long i) {
        return new hs_expr_info_t((Pointer)this).offsetAddress(i);
    }

    /**
     * The minimum length in bytes of a match for the pattern.
     *
     * Note: in some cases when using advanced features to suppress matches
     * (such as extended parameters or the \ref HS_FLAG_SINGLEMATCH flag) this
     * may represent a conservative lower bound for the true minimum length of
     * a match.
     */
    public native @Cast("unsigned int") int min_width(); public native hs_expr_info_t min_width(int setter);

    /**
     * The maximum length in bytes of a match for the pattern. If the pattern
     * has an unbounded maximum length, this will be set to the maximum value
     * of an unsigned int (UINT_MAX).
     *
     * Note: in some cases when using advanced features to suppress matches
     * (such as extended parameters or the \ref HS_FLAG_SINGLEMATCH flag) this
     * may represent a conservative upper bound for the true maximum length of
     * a match.
     */
    public native @Cast("unsigned int") int max_width(); public native hs_expr_info_t max_width(int setter);

    /**
     * Whether this expression can produce matches that are not returned in
     * order, such as those produced by assertions. Zero if false, non-zero if
     * true.
     */
    public native @Cast("char") byte unordered_matches(); public native hs_expr_info_t unordered_matches(byte setter);

    /**
     * Whether this expression can produce matches at end of data (EOD). In
     * streaming mode, EOD matches are raised during \ref hs_close_stream(),
     * since it is only when \ref hs_close_stream() is called that the EOD
     * location is known. Zero if false, non-zero if true.
     *
     * Note: trailing {@code \b} word boundary assertions may also result in EOD
     * matches as end-of-data can act as a word boundary.
     */
    public native @Cast("char") byte matches_at_eod(); public native hs_expr_info_t matches_at_eod(byte setter);

    /**
     * Whether this expression can *only* produce matches at end of data (EOD).
     * In streaming mode, all matches for this expression are raised during
     * \ref hs_close_stream(). Zero if false, non-zero if true.
     */
    public native @Cast("char") byte matches_only_at_eod(); public native hs_expr_info_t matches_only_at_eod(byte setter);
}

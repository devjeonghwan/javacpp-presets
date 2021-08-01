// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libpostal.global.postal.*;


@Properties(inherit = org.bytedeco.libpostal.presets.postal.class)
public class libpostal_normalize_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_normalize_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_normalize_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_normalize_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_normalize_options_t position(long position) {
        return (libpostal_normalize_options_t)super.position(position);
    }
    @Override public libpostal_normalize_options_t getPointer(long i) {
        return new libpostal_normalize_options_t((Pointer)this).offsetAddress(i);
    }

    // List of language codes
    public native @Cast("char*") BytePointer languages(int i); public native libpostal_normalize_options_t languages(int i, BytePointer setter);
    public native @Cast("char**") PointerPointer languages(); public native libpostal_normalize_options_t languages(PointerPointer setter);  
    public native @Cast("size_t") long num_languages(); public native libpostal_normalize_options_t num_languages(long setter);
    public native @Cast("uint16_t") short address_components(); public native libpostal_normalize_options_t address_components(short setter);

    // String options
    public native @Cast("bool") boolean latin_ascii(); public native libpostal_normalize_options_t latin_ascii(boolean setter);
    public native @Cast("bool") boolean transliterate(); public native libpostal_normalize_options_t transliterate(boolean setter);
    public native @Cast("bool") boolean strip_accents(); public native libpostal_normalize_options_t strip_accents(boolean setter);
    public native @Cast("bool") boolean decompose(); public native libpostal_normalize_options_t decompose(boolean setter);
    public native @Cast("bool") boolean lowercase(); public native libpostal_normalize_options_t lowercase(boolean setter);
    public native @Cast("bool") boolean trim_string(); public native libpostal_normalize_options_t trim_string(boolean setter);
    public native @Cast("bool") boolean drop_parentheticals(); public native libpostal_normalize_options_t drop_parentheticals(boolean setter);
    public native @Cast("bool") boolean replace_numeric_hyphens(); public native libpostal_normalize_options_t replace_numeric_hyphens(boolean setter);
    public native @Cast("bool") boolean delete_numeric_hyphens(); public native libpostal_normalize_options_t delete_numeric_hyphens(boolean setter);
    public native @Cast("bool") boolean split_alpha_from_numeric(); public native libpostal_normalize_options_t split_alpha_from_numeric(boolean setter);
    public native @Cast("bool") boolean replace_word_hyphens(); public native libpostal_normalize_options_t replace_word_hyphens(boolean setter);
    public native @Cast("bool") boolean delete_word_hyphens(); public native libpostal_normalize_options_t delete_word_hyphens(boolean setter);
    public native @Cast("bool") boolean delete_final_periods(); public native libpostal_normalize_options_t delete_final_periods(boolean setter);
    public native @Cast("bool") boolean delete_acronym_periods(); public native libpostal_normalize_options_t delete_acronym_periods(boolean setter);
    public native @Cast("bool") boolean drop_english_possessives(); public native libpostal_normalize_options_t drop_english_possessives(boolean setter);
    public native @Cast("bool") boolean delete_apostrophes(); public native libpostal_normalize_options_t delete_apostrophes(boolean setter);
    public native @Cast("bool") boolean expand_numex(); public native libpostal_normalize_options_t expand_numex(boolean setter);
    public native @Cast("bool") boolean roman_numerals(); public native libpostal_normalize_options_t roman_numerals(boolean setter);

}

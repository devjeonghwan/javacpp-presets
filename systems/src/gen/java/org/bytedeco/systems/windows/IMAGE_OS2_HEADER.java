// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_OS2_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_OS2_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_OS2_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_OS2_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_OS2_HEADER position(long position) {
        return (IMAGE_OS2_HEADER)super.position(position);
    }
    @Override public IMAGE_OS2_HEADER getPointer(long i) {
        return new IMAGE_OS2_HEADER((Pointer)this).offsetAddress(i);
    }
      // OS/2 .EXE header
    public native @Cast("WORD") short ne_magic(); public native IMAGE_OS2_HEADER ne_magic(short setter);                    // Magic number
    public native @Cast("CHAR") byte ne_ver(); public native IMAGE_OS2_HEADER ne_ver(byte setter);                      // Version number
    public native @Cast("CHAR") byte ne_rev(); public native IMAGE_OS2_HEADER ne_rev(byte setter);                      // Revision number
    public native @Cast("WORD") short ne_enttab(); public native IMAGE_OS2_HEADER ne_enttab(short setter);                   // Offset of Entry Table
    public native @Cast("WORD") short ne_cbenttab(); public native IMAGE_OS2_HEADER ne_cbenttab(short setter);                 // Number of bytes in Entry Table
    public native @Cast("LONG") int ne_crc(); public native IMAGE_OS2_HEADER ne_crc(int setter);                      // Checksum of whole file
    public native @Cast("WORD") short ne_flags(); public native IMAGE_OS2_HEADER ne_flags(short setter);                    // Flag word
    public native @Cast("WORD") short ne_autodata(); public native IMAGE_OS2_HEADER ne_autodata(short setter);                 // Automatic data segment number
    public native @Cast("WORD") short ne_heap(); public native IMAGE_OS2_HEADER ne_heap(short setter);                     // Initial heap allocation
    public native @Cast("WORD") short ne_stack(); public native IMAGE_OS2_HEADER ne_stack(short setter);                    // Initial stack allocation
    public native @Cast("LONG") int ne_csip(); public native IMAGE_OS2_HEADER ne_csip(int setter);                     // Initial CS:IP setting
    public native @Cast("LONG") int ne_sssp(); public native IMAGE_OS2_HEADER ne_sssp(int setter);                     // Initial SS:SP setting
    public native @Cast("WORD") short ne_cseg(); public native IMAGE_OS2_HEADER ne_cseg(short setter);                     // Count of file segments
    public native @Cast("WORD") short ne_cmod(); public native IMAGE_OS2_HEADER ne_cmod(short setter);                     // Entries in Module Reference Table
    public native @Cast("WORD") short ne_cbnrestab(); public native IMAGE_OS2_HEADER ne_cbnrestab(short setter);                // Size of non-resident name table
    public native @Cast("WORD") short ne_segtab(); public native IMAGE_OS2_HEADER ne_segtab(short setter);                   // Offset of Segment Table
    public native @Cast("WORD") short ne_rsrctab(); public native IMAGE_OS2_HEADER ne_rsrctab(short setter);                  // Offset of Resource Table
    public native @Cast("WORD") short ne_restab(); public native IMAGE_OS2_HEADER ne_restab(short setter);                   // Offset of resident name table
    public native @Cast("WORD") short ne_modtab(); public native IMAGE_OS2_HEADER ne_modtab(short setter);                   // Offset of Module Reference Table
    public native @Cast("WORD") short ne_imptab(); public native IMAGE_OS2_HEADER ne_imptab(short setter);                   // Offset of Imported Names Table
    public native @Cast("LONG") int ne_nrestab(); public native IMAGE_OS2_HEADER ne_nrestab(int setter);                  // Offset of Non-resident Names Table
    public native @Cast("WORD") short ne_cmovent(); public native IMAGE_OS2_HEADER ne_cmovent(short setter);                  // Count of movable entries
    public native @Cast("WORD") short ne_align(); public native IMAGE_OS2_HEADER ne_align(short setter);                    // Segment alignment shift count
    public native @Cast("WORD") short ne_cres(); public native IMAGE_OS2_HEADER ne_cres(short setter);                     // Count of resource segments
    public native @Cast("BYTE") byte ne_exetyp(); public native IMAGE_OS2_HEADER ne_exetyp(byte setter);                   // Target Operating system
    public native @Cast("BYTE") byte ne_flagsothers(); public native IMAGE_OS2_HEADER ne_flagsothers(byte setter);              // Other .EXE flags
    public native @Cast("WORD") short ne_pretthunks(); public native IMAGE_OS2_HEADER ne_pretthunks(short setter);               // offset to return thunks
    public native @Cast("WORD") short ne_psegrefbytes(); public native IMAGE_OS2_HEADER ne_psegrefbytes(short setter);             // offset to segment ref. bytes
    public native @Cast("WORD") short ne_swaparea(); public native IMAGE_OS2_HEADER ne_swaparea(short setter);                 // Minimum code swap area size
    public native @Cast("WORD") short ne_expver(); public native IMAGE_OS2_HEADER ne_expver(short setter);                   // Expected Windows version number
  }

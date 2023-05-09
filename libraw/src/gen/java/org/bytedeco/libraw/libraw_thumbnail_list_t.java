// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_thumbnail_list_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_thumbnail_list_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_thumbnail_list_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_thumbnail_list_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_thumbnail_list_t position(long position) {
          return (libraw_thumbnail_list_t)super.position(position);
      }
      @Override public libraw_thumbnail_list_t getPointer(long i) {
          return new libraw_thumbnail_list_t((Pointer)this).offsetAddress(i);
      }
  
	  public native int thumbcount(); public native libraw_thumbnail_list_t thumbcount(int setter);
	  public native @ByRef libraw_thumbnail_item_t thumblist(int i); public native libraw_thumbnail_list_t thumblist(int i, libraw_thumbnail_item_t setter);
	  @MemberGetter public native libraw_thumbnail_item_t thumblist();
  }

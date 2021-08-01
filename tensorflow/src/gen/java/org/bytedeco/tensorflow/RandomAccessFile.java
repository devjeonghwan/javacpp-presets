// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** A file abstraction for randomly reading the contents of a file. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomAccessFile extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomAccessFile(Pointer p) { super(p); }


  /** \brief Returns the name of the file.
   * 
   *  This is an optional operation that may not be implemented by every
   *  filesystem. */
  
  ///
  ///
  ///
  ///
  public native @ByVal Status Name(@StringPiece @Cast({"char*", "StringPiece*"}) BytePointer result);

  /** \brief Reads up to {@code n} bytes from the file starting at {@code offset}.
   * 
   *  {@code scratch[0..n-1]} may be written by this routine.  Sets {@code *result}
   *  to the data that was read (including if fewer than {@code n} bytes were
   *  successfully read).  May set {@code *result} to point at data in
   *  {@code scratch[0..n-1]}, so {@code scratch[0..n-1]} must be live when
   *  {@code *result} is used.
   * 
   *  On OK returned status: {@code n} bytes have been stored in {@code *result}.
   *  On non-OK returned status: {@code [0..n]} bytes have been stored in {@code *result}.
   * 
   *  Returns {@code OUT_OF_RANGE} if fewer than n bytes were stored in {@code *result}
   *  because of EOF.
   * 
   *  Safe for concurrent use by multiple threads. */
  public native @ByVal Status Read(@Cast("tensorflow::uint64") long offset, @Cast("size_t") long n, @StringPiece @Cast({"char*", "StringPiece*"}) BytePointer result,
                        @Cast("char*") BytePointer scratch);
  public native @ByVal Status Read(@Cast("tensorflow::uint64") long offset, @Cast("size_t") long n, @StringPiece @Cast({"char*", "StringPiece*"}) BytePointer result,
                        @Cast("char*") ByteBuffer scratch);
  public native @ByVal Status Read(@Cast("tensorflow::uint64") long offset, @Cast("size_t") long n, @StringPiece @Cast({"char*", "StringPiece*"}) BytePointer result,
                        @Cast("char*") byte[] scratch);
}

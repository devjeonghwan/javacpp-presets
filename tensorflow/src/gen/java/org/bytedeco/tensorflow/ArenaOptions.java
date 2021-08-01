// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // namespace internal

// ArenaOptions provides optional additional parameters to arena construction
// that control its block-allocation behavior.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ArenaOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArenaOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArenaOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ArenaOptions position(long position) {
        return (ArenaOptions)super.position(position);
    }
    @Override public ArenaOptions getPointer(long i) {
        return new ArenaOptions((Pointer)this).offsetAddress(i);
    }

  // This defines the size of the first block requested from the system malloc.
  // Subsequent block sizes will increase in a geometric series up to a maximum.
  public native @Cast("size_t") long start_block_size(); public native ArenaOptions start_block_size(long setter);

  // This defines the maximum block size requested from system malloc (unless an
  // individual arena allocation request occurs with a size larger than this
  // maximum). Requested block sizes increase up to this value, then remain
  // here.
  public native @Cast("size_t") long max_block_size(); public native ArenaOptions max_block_size(long setter);

  // An initial block of memory for the arena to use, or NULL for none. If
  // provided, the block must live at least as long as the arena itself. The
  // creator of the Arena retains ownership of the block after the Arena is
  // destroyed.
  public native @Cast("char*") BytePointer initial_block(); public native ArenaOptions initial_block(BytePointer setter);

  // The size of the initial block, if provided.
  public native @Cast("size_t") long initial_block_size(); public native ArenaOptions initial_block_size(long setter);

  // A function pointer to an alloc method that returns memory blocks of size
  // requested. By default, it contains a ptr to the malloc function.
  //
  // NOTE: block_alloc and dealloc functions are expected to behave like
  // malloc and free, including Asan poisoning.
  public static class Block_alloc_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Block_alloc_long(Pointer p) { super(p); }
      protected Block_alloc_long() { allocate(); }
      private native void allocate();
      public native Pointer call(@Cast("size_t") long arg0);
  }
  public native Block_alloc_long block_alloc(); public native ArenaOptions block_alloc(Block_alloc_long setter);
  // A function pointer to a dealloc method that takes ownership of the blocks
  // from the arena. By default, it contains a ptr to a wrapper function that
  // calls free.
  public static class Block_dealloc_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Block_dealloc_Pointer_long(Pointer p) { super(p); }
      protected Block_dealloc_Pointer_long() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0, @Cast("size_t") long arg1);
  }
  public native Block_dealloc_Pointer_long block_dealloc(); public native ArenaOptions block_dealloc(Block_dealloc_Pointer_long setter);

  public ArenaOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
}

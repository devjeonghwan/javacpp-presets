// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Interface for chunk reader, which performs data chunking and reading of
 *  entire chunks.
 * 
 *  A chunk could be an entire file, such as an audio data file or an image,
 *  or part of a file in the case of a large text-file split based on seek
 *  positions. */
@Name("torch::data::datasets::ChunkDataReader<torch::data::Example<torch::Tensor,torch::Tensor>,std::vector<torch::data::Example<torch::Tensor,torch::Tensor> > >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkDataReader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ChunkDataReader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ChunkDataReader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkDataReader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ChunkDataReader position(long position) {
        return (ChunkDataReader)super.position(position);
    }
    @Override public ChunkDataReader getPointer(long i) {
        return new ChunkDataReader((Pointer)this).offsetAddress(i);
    }



  /** Read an entire chunk. */
  @Virtual(true) public native @ByVal @Cast("torch::data::datasets::ChunkDataReader<torch::data::Example<torch::Tensor,torch::Tensor>,std::vector<torch::data::Example<torch::Tensor,torch::Tensor> > >::ChunkType*") ExampleVector read_chunk(@Cast("size_t") long chunk_index);

  /** Returns the number of chunks available in this reader. */
  @Virtual(true) public native @Cast("size_t") long chunk_count();

  /** This will clear any internal state associate with this reader. */
  @Virtual(true) public native void reset();
}

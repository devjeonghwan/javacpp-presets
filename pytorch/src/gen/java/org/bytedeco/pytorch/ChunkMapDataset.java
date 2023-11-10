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

@Name("torch::data::datasets::MapDataset<torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkMapDataset extends ChunkMapBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkMapDataset(Pointer p) { super(p); }


  public ChunkMapDataset(@ByVal ChunkSharedBatchDataset dataset, @ByVal @Cast("torch::data::datasets::MapDataset<torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >::TransformType*") ExampleStack transform) { super((Pointer)null); allocate(dataset, transform); }
  private native void allocate(@ByVal ChunkSharedBatchDataset dataset, @ByVal @Cast("torch::data::datasets::MapDataset<torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >,torch::data::transforms::Stack<torch::data::Example<torch::Tensor,torch::Tensor> > >::TransformType*") ExampleStack transform);

  /** Gets a batch from the source dataset and applies the transform to it,
   *  returning the result. */
  public native @Name("get_batch") @ByVal ExampleOptional get_batch_example(@Cast("size_t") long indices);

  /** Returns the size of the source dataset. */
  // NOLINTNEXTLINE(bugprone-exception-escape)
  public native @ByVal @NoException(true) SizeTOptional size();

  /** Calls {@code reset()} on the underlying dataset.
   *  NOTE: Stateless datasets do not have a reset() method, so a call to this
   *  method will only compile for stateful datasets (which have a reset()
   *  method). */
  

  /** Returns the underlying dataset. */
  public native @Const @ByRef @NoException(true) ChunkSharedBatchDataset dataset();

  /** Returns the transform being applied. */
  public native @Const @ByRef @NoException(true) ExampleStack transform();
}

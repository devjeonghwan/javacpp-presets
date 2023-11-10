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

@Name("torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkTensorDataset extends ChunkStatefulTensorDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkTensorDataset(Pointer p) { super(p); }


  public ChunkTensorDataset(
        ChunkTensorDataReader chunk_reader,
        RandomSampler chunk_sampler,
        RandomSampler example_sampler,
        ChunkDatasetOptions options) { super((Pointer)null); allocate(chunk_reader, chunk_sampler, example_sampler, options, null); }
  public ChunkTensorDataset(
        ChunkTensorDataReader chunk_reader,
        RandomSampler chunk_sampler,
        RandomSampler example_sampler,
        ChunkDatasetOptions options,
        Pointer preprocessing_policy) { super((Pointer)null); allocate(chunk_reader, chunk_sampler, example_sampler, options, preprocessing_policy); }
  private native void allocate(
        @ByVal @Cast("JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_00020_0003e_00020_0003e*") ChunkTensorDataReader chunk_reader,
        @ByVal RandomSampler chunk_sampler,
        @ByVal RandomSampler example_sampler,
        @ByVal ChunkDatasetOptions options,
        @ByVal(nullValue = "std::function<void(std::vector<torch::data::Example<torch::Tensor,torch::data::example::NoTarget>>&)>()") @Cast("std::function<void(std::vector<torch::data::Example<torch::Tensor,torch::data::example::NoTarget>>&)>*") Pointer preprocessing_policy);

  /** Default get_batch method of BatchDataset. This method returns
   *  Example batches created from the preloaded chunks. The implemenation
   *  is dataset agnostic and does not need overriding in different chunk
   *  datasets. */
  public native @ByVal TensorExampleVectorOptional get_batch(@Cast("size_t") long batch_size);

  /** Helper method around get_batch as {@code batch_size} is not strictly necessary */
  public native @ByVal TensorExampleVectorOptional get_batch();

  /** This will clear any internal state and starts the internal prefetching
   *  mechanism for the chunk dataset. */
  public native void reset();

  /** size is not used for chunk dataset. */
  public native @ByVal SizeTOptional size();

  // provide a references to chunk sampler. Used mainly in distributed data
  // loading to set the epoch number for the sampler.
  public native @Cast("torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler>::ChunkSamplerType*") @ByRef RandomSampler chunk_sampler();

  public native void save(@ByRef OutputArchive archive);

  public native void load(@ByRef InputArchive archive);
}

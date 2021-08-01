// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxTensorDescriptorV1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public onnxTensorDescriptorV1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public onnxTensorDescriptorV1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxTensorDescriptorV1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public onnxTensorDescriptorV1 position(long position) {
        return (onnxTensorDescriptorV1)super.position(position);
    }
    @Override public onnxTensorDescriptorV1 getPointer(long i) {
        return new onnxTensorDescriptorV1((Pointer)this).offsetAddress(i);
    }

  /**
   * 32-bit tag needed to distinguish different versions of a tensor descriptor
   * structure. In the onnxTensorDescriptorV1 structure, the tag MUST be set to
   * ONNXIFI_TAG_TENSOR_DESCRIPTOR_V1. If ONNXIFI introduce a new version of the
   * tensor descriptor structure in the future, it WILL have 32-bit tag with a
   * different value as the first member of the structure.
   *
   * ONNXIFI implementations MUST validate tag before accessing any other
   * members of the structure.
   */
  public native @Cast("int32_t") int tag(); public native onnxTensorDescriptorV1 tag(int setter);
  /**
   * Name of the blob corresponding to this tensor in the ONNX model. The name
   * must exactly match the ValueInfoProto.name of one of the
   * ModelProto.graph.input or ModelProto.graph.output
   */
  public native @Cast("const char*") BytePointer name(); public native onnxTensorDescriptorV1 name(BytePointer setter);
  /**
   * Data type of the elements in the tensor.
   *
   * Possible values:
   *     ONNXIFI_DATATYPE_FLOAT16
   *     ONNXIFI_DATATYPE_FLOAT32
   *     ONNXIFI_DATATYPE_FLOAT64
   *     ONNXIFI_DATATYPE_INT8
   *     ONNXIFI_DATATYPE_INT16
   *     ONNXIFI_DATATYPE_INT32
   *     ONNXIFI_DATATYPE_INT64
   *     ONNXIFI_DATATYPE_UINT8
   *     ONNXIFI_DATATYPE_UINT16
   *     ONNXIFI_DATATYPE_UINT32
   *     ONNXIFI_DATATYPE_UINT64
   *     ONNXIFI_DATATYPE_COMPLEX64
   *     ONNXIFI_DATATYPE_COMPLEX128
   */
  public native @Cast("onnxEnum") int dataType(); public native onnxTensorDescriptorV1 dataType(int setter);
  /**
   * Type of memory that stores the tensor.
   *
   * ONNXIFI_MEMORY_TYPE_CPU memory type is always supported by the backend, but
   * other memory types are optional. The use MUST call onnxGetBackendInfo with
   * ONNXIFI_BACKEND_MEMORY_TYPES to check if a particular memory type is
   * supported before using it.
   *
   * If the memory type is different than ONNXIFI_MEMORY_TYPE_CPU, it must be
   * allocated on the same device as the backend.
   *
   * Possible values:
   *     ONNXIFI_MEMORY_TYPE_CPU                 (always supported)
   *     ONNXIFI_MEMORY_TYPE_CUDA_BUFFER         (support is optional)
   *     ONNXIFI_MEMORY_TYPE_OPENCL_BUFFER       (support is optional)
   *     ONNXIFI_MEMORY_TYPE_OPENGLES_TEXTURE_2D (support is optional)
   *     ONNXIFI_MEMORY_TYPE_D3D_RESOURCE        (support is optional)
   */
  public native @Cast("onnxEnum") int memoryType(); public native onnxTensorDescriptorV1 memoryType(int setter);
  /**
   * Number of dimensions in the tensor.
   * For a scalar, the number of dimensions is 0.
   */
  public native @Cast("uint32_t") int dimensions(); public native onnxTensorDescriptorV1 dimensions(int setter);
  /**
   * Dimensions of the tensor.
   * For a scalar, this pointer can be NULL.
   */
  public native @Cast("const uint64_t*") IntPointer shape(); public native onnxTensorDescriptorV1 shape(IntPointer setter);
  /**
   * Pointers to tensor data.
   *
   * Interpretation depends on memoryType:
   *   - ONNXIFI_MEMORY_TYPE_CPU: buffer is a valid pointer to CPU memory.
   *   - ONNXIFI_MEMORY_TYPE_CUDA_BUFFER: buffer is a valid pointer to CUDA
   *     device memory, allocated via cudaMalloc or cuMalloc. CUDA device memory
   *     must be allocated on the same device as the backend.
   *   - ONNXIFI_MEMORY_TYPE_OPENCL_BUFFER: buffer is a cl_mem handle for an
   *     OpenCL buffer or a sub-buffer. cl_mem object must be allocated on the
   *     same OpenCL context as the backend. The context must be specified via
   *     ONNXIFI_BACKEND_OPENCL_CONTEXT initialization property to
   *     onnxInitBackend.
   *   - ONNXIFI_MEMORY_TYPE_OPENGLES_TEXTURE_2D: buffer is a name of a 2D
   *     texture created by glGenTextures. The texture must be allocated on the
   *     same device as the backend.
   *   - ONNXIFI_MEMORY_TYPE_D3D_RESOURCE: TBD
   */
  public native @Cast("onnxPointer") int buffer(); public native onnxTensorDescriptorV1 buffer(int setter);
}

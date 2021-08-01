// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief BufferPool for use with CUDA streams
<p>
BufferPool utilizes Stream's allocator to create new buffers for GpuMat's. It is
only useful when enabled with #setBufferPoolUsage.
<p>
<pre>{@code
    setBufferPoolUsage(true);
}</pre>
<p>
\note #setBufferPoolUsage must be called \em before any Stream declaration.
<p>
Users may specify custom allocator for Stream and may implement their own stream based
functions utilizing the same underlying GPU memory management.
<p>
If custom allocator is not specified, BufferPool utilizes StackAllocator by
default. StackAllocator allocates a chunk of GPU device memory beforehand,
and when GpuMat is declared later on, it is given the pre-allocated memory.
This kind of strategy reduces the number of calls for memory allocating APIs
such as cudaMalloc or cudaMallocPitch.
<p>
Below is an example that utilizes BufferPool with StackAllocator:
<p>
<pre>{@code
    #include <opencv2/opencv.hpp>

    using namespace cv;
    using namespace cv::cuda

    int main()
    {
        setBufferPoolUsage(true);                               // Tell OpenCV that we are going to utilize BufferPool
        setBufferPoolConfig(getDevice(), 1024 * 1024 * 64, 2);  // Allocate 64 MB, 2 stacks (default is 10 MB, 5 stacks)

        Stream stream1, stream2;                                // Each stream uses 1 stack
        BufferPool pool1(stream1), pool2(stream2);

        GpuMat d_src1 = pool1.getBuffer(4096, 4096, CV_8UC1);   // 16MB
        GpuMat d_dst1 = pool1.getBuffer(4096, 4096, CV_8UC3);   // 48MB, pool1 is now full

        GpuMat d_src2 = pool2.getBuffer(1024, 1024, CV_8UC1);   // 1MB
        GpuMat d_dst2 = pool2.getBuffer(1024, 1024, CV_8UC3);   // 3MB

        cvtColor(d_src1, d_dst1, CV_GRAY2BGR, 0, stream1);
        cvtColor(d_src2, d_dst2, CV_GRAY2BGR, 0, stream2);
    }
}</pre>
<p>
If we allocate another GpuMat on pool1 in the above example, it will be carried out by
the DefaultAllocator since the stack for pool1 is full.
<p>
<pre>{@code
    GpuMat d_add1 = pool1.getBuffer(1024, 1024, CV_8UC1);   // Stack for pool1 is full, memory is allocated with DefaultAllocator
}</pre>
<p>
If a third stream is declared in the above example, allocating with #getBuffer
within that stream will also be carried out by the DefaultAllocator because we've run out of
stacks.
<p>
<pre>{@code
    Stream stream3;                                         // Only 2 stacks were allocated, we've run out of stacks
    BufferPool pool3(stream3);
    GpuMat d_src3 = pool3.getBuffer(1024, 1024, CV_8UC1);   // Memory is allocated with DefaultAllocator
}</pre>
<p>
\warning When utilizing StackAllocator, deallocation order is important.
<p>
Just like a stack, deallocation must be done in LIFO order. Below is an example of
erroneous usage that violates LIFO rule. If OpenCV is compiled in Debug mode, this
sample code will emit CV_Assert error.
<p>
<pre>{@code
    int main()
    {
        setBufferPoolUsage(true);                               // Tell OpenCV that we are going to utilize BufferPool
        Stream stream;                                          // A default size (10 MB) stack is allocated to this stream
        BufferPool pool(stream);

        GpuMat mat1 = pool.getBuffer(1024, 1024, CV_8UC1);      // Allocate mat1 (1MB)
        GpuMat mat2 = pool.getBuffer(1024, 1024, CV_8UC1);      // Allocate mat2 (1MB)

        mat1.release();                                         // erroneous usage : mat2 must be deallocated before mat1
    }
}</pre>
<p>
Since C++ local variables are destroyed in the reverse order of construction,
the code sample below satisfies the LIFO rule. Local GpuMat's are deallocated
and the corresponding memory is automatically returned to the pool for later usage.
<p>
<pre>{@code
    int main()
    {
        setBufferPoolUsage(true);                               // Tell OpenCV that we are going to utilize BufferPool
        setBufferPoolConfig(getDevice(), 1024 * 1024 * 64, 2);  // Allocate 64 MB, 2 stacks (default is 10 MB, 5 stacks)

        Stream stream1, stream2;                                // Each stream uses 1 stack
        BufferPool pool1(stream1), pool2(stream2);

        for (int i = 0; i < 10; i++)
        {
            GpuMat d_src1 = pool1.getBuffer(4096, 4096, CV_8UC1);   // 16MB
            GpuMat d_dst1 = pool1.getBuffer(4096, 4096, CV_8UC3);   // 48MB, pool1 is now full

            GpuMat d_src2 = pool2.getBuffer(1024, 1024, CV_8UC1);   // 1MB
            GpuMat d_dst2 = pool2.getBuffer(1024, 1024, CV_8UC3);   // 3MB

            d_src1.setTo(Scalar(i), stream1);
            d_src2.setTo(Scalar(i), stream2);

            cvtColor(d_src1, d_dst1, CV_GRAY2BGR, 0, stream1);
            cvtColor(d_src2, d_dst2, CV_GRAY2BGR, 0, stream2);
                                                                    // The order of destruction of the local variables is:
                                                                    //   d_dst2 => d_src2 => d_dst1 => d_src1
                                                                    // LIFO rule is satisfied, this code runs without error
        }
    }
}</pre>
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class BufferPool extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferPool(Pointer p) { super(p); }


    /** Gets the BufferPool for the given stream. */
    public BufferPool(@ByRef Stream stream) { super((Pointer)null); allocate(stream); }
    private native void allocate(@ByRef Stream stream);

    /** Allocates a new GpuMat of given size and type. */
    public native @ByVal GpuMat getBuffer(int rows, int cols, int type);

    /** Allocates a new GpuMat of given size and type. */
    public native @ByVal GpuMat getBuffer(@ByVal Size size, int type);

    /** Returns the allocator associated with the stream. */
    public native @Ptr GpuMat.Allocator getAllocator();
}

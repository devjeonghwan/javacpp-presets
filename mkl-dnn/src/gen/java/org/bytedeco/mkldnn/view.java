// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_view View
 *  A primitive to view on a memory.
 * 
 *  @see mkldnn_view_primitive_desc_create in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class view extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public view(Pointer p) { super(p); }

    public static class primitive_desc extends mkldnn_primitive_desc_handle {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer offsets) { super((Pointer)null); allocate(input, dims, offsets); }
        private native void allocate(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer offsets);
        public primitive_desc(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer offsets) { super((Pointer)null); allocate(input, dims, offsets); }
        private native void allocate(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer offsets);
        public primitive_desc(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] offsets) { super((Pointer)null); allocate(input, dims, offsets); }
        private native void allocate(@Const @ByRef memory.primitive_desc input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dims,
                        @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] offsets);

        public native @ByVal memory.primitive_desc dst_primitive_desc();

        public native @ByVal engine get_engine();
    }

    public view(@Const @ByRef primitive_desc view_pd, @ByVal primitive.at input) { super((Pointer)null); allocate(view_pd, input); }
    private native void allocate(@Const @ByRef primitive_desc view_pd, @ByVal primitive.at input);

    public view(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer offsets) { super((Pointer)null); allocate(input, dims, offsets); }
    private native void allocate(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer offsets);
    public view(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer offsets) { super((Pointer)null); allocate(input, dims, offsets); }
    private native void allocate(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer offsets);
    public view(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] offsets) { super((Pointer)null); allocate(input, dims, offsets); }
    private native void allocate(@ByVal memory input, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] dims, @StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] offsets);
}

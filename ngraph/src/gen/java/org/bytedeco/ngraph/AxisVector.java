// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief A vector of axes. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class AxisVector extends SizeTVector {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AxisVector(Pointer p) { super(p); }
    

        public AxisVector(@Const @ByRef SizeTVector axes) { super((Pointer)null); allocate(axes); }
        private native void allocate(@Const @ByRef SizeTVector axes);

        public AxisVector(@Const @ByRef AxisVector axes) { super((Pointer)null); allocate(axes); }
        private native void allocate(@Const @ByRef AxisVector axes);

        public AxisVector(@Cast("size_t") long n) { super((Pointer)null); allocate(n); }
        private native void allocate(@Cast("size_t") long n);

        public AxisVector() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native @ByRef @Name("operator =") AxisVector put(@Const @ByRef AxisVector v);
    }

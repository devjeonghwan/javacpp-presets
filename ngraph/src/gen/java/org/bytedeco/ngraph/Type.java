// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        @Namespace("ngraph::element") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Type extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Type(Pointer p) { super(p); }
        
            public Type() { super((Pointer)null); allocate(); }
            private native void allocate();
            public Type(@Const @ByRef Type arg0) { super((Pointer)null); allocate(arg0); }
            private native void allocate(@Const @ByRef Type arg0);
            public Type(@Cast("const ngraph::element::Type_t") int t) { super((Pointer)null); allocate(t); }
            private native void allocate(@Cast("const ngraph::element::Type_t") int t);
            public Type(@Cast("size_t") long bitwidth,
                             @Cast("bool") boolean is_real,
                             @Cast("bool") boolean is_signed,
                             @Cast("bool") boolean is_quantized,
                             @StdString BytePointer cname) { super((Pointer)null); allocate(bitwidth, is_real, is_signed, is_quantized, cname); }
            private native void allocate(@Cast("size_t") long bitwidth,
                             @Cast("bool") boolean is_real,
                             @Cast("bool") boolean is_signed,
                             @Cast("bool") boolean is_quantized,
                             @StdString BytePointer cname);
            public Type(@Cast("size_t") long bitwidth,
                             @Cast("bool") boolean is_real,
                             @Cast("bool") boolean is_signed,
                             @Cast("bool") boolean is_quantized,
                             @StdString String cname) { super((Pointer)null); allocate(bitwidth, is_real, is_signed, is_quantized, cname); }
            private native void allocate(@Cast("size_t") long bitwidth,
                             @Cast("bool") boolean is_real,
                             @Cast("bool") boolean is_signed,
                             @Cast("bool") boolean is_quantized,
                             @StdString String cname);
            public native @ByRef @Name("operator =") Type put(@Const @ByRef Type arg0);
            public native @Cast("ngraph::element::Type_t") int get_type_enum();
            public native @StdString BytePointer c_type_string();
            public native @Cast("size_t") long size();
            public native @Cast("size_t") long hash();
            public native @Cast("bool") boolean is_static();
            public native @Cast("bool") boolean is_dynamic();
            public native @Cast("bool") boolean is_real();
            // TODO: We may want to revisit this definition when we do a more general cleanup of
            // element types:
            public native @Cast("bool") boolean is_integral();
            public native @Cast("bool") boolean is_signed();
            public native @Cast("bool") boolean is_quantized();
            public native @Cast("size_t") long bitwidth();
            // The name of this type, the enum name of this type
            public native @StdString BytePointer get_type_name();
            public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Type other);
            public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Type other);
            public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Type other);
            
            public static native @Cast("const ngraph::element::Type**") @StdVector PointerPointer get_known_types();

            /** \brief Checks whether this element type is merge-compatible with {@code t}.
             *  @param t The element type to compare this element type to.
             *  @return {@code true} if this element type is compatible with {@code t}, else {@code false}. */
            
            ///
            ///
            ///
            ///
            ///
            public native @Cast("bool") boolean compatible(@Const @ByRef Type t);

            /** \brief Merges two element types t1 and t2, writing the result into dst and
             *         returning true if successful, else returning false.
             * 
             *         To "merge" two element types t1 and t2 is to find the least restrictive
             *         element type t that is no more restrictive than t1 and t2, if t exists.
             *         More simply:
             * 
             *            merge(dst,element::Type::dynamic,t)
             *               writes t to dst and returns true
             * 
             *            merge(dst,t,element::Type::dynamic)
             *               writes t to dst and returns true
             * 
             *            merge(dst,t1,t2) where t1, t2 both static and equal
             *               writes t1 to dst and returns true
             * 
             *            merge(dst,t1,t2) where t1, t2 both static and unequal
             *               does nothing to dst, and returns false */
            public static native @Cast("bool") boolean merge(@ByRef Type dst, @Const @ByRef Type t1, @Const @ByRef Type t2);

            // \brief This allows switch(element_type)
            public native @Cast("ngraph::element::Type_t") @Name("operator ngraph::element::Type_t") int asInt();
        }

// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief Class representing a shape that may be partially or totally dynamic.
     * 
     *  XXX: THIS CLASS IS EXPERIMENTAL AND THE ENTIRE DESIGN IS SUBJECT TO CHANGE.
     * 
     *  A PartialShape may have:
     * 
     *  \li Dynamic rank. (Informal notation: {@code ?})
     *  \li Static rank, but dynamic dimensions on some or all axes.
     *      (Informal notation examples: {@code {1,2,?,4}}, {@code {?,?,?}})
     *  \li Static rank, and static dimensions on all axes.
     *      (Informal notation examples: {@code {1,2,3,4}}, {@code {6}}, {@code {}}) */
    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class PartialShape extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PartialShape(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PartialShape(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public PartialShape position(long position) {
            return (PartialShape)super.position(position);
        }
        @Override public PartialShape getPointer(long i) {
            return new PartialShape((Pointer)this).offsetAddress(i);
        }
    
        /** \brief Constructs a shape with static rank from an initializer list of Dimension.
         *  @param init The Dimension values for the constructed shape.
         * 
         *  Examples:
         * 
         *  <pre>{@code {.cpp}
         *  PartialShape s{2,3,4};                     // rank=3, all dimensions static
         *  PartialShape s{};                          // rank=0
         *  PartialShape s{2,Dimension::dynamic(),3};  // rank=3, dimension 1 dynamic
         *  }</pre> */

        /** \brief Constructs a PartialShape with static rank from a vector of Dimension.
         *  @param dimensions The Dimension values for the constructed shape. */
        public PartialShape(@StdVector Dimension dimensions) { super((Pointer)null); allocate(dimensions); }
        private native void allocate(@StdVector Dimension dimensions);

        /** \brief Constructs a static PartialShape with zero rank (the shape of a scalar). */
        public PartialShape() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Constructs a static PartialShape from a Shape.
         *  @param shape The Shape to convert into PartialShape. */
        
        ///
        public PartialShape(@Const @ByRef Shape shape) { super((Pointer)null); allocate(shape); }
        private native void allocate(@Const @ByRef Shape shape);

        /** \brief Check if this shape is static.
         *  @return {@code true} if this shape is static, else {@code false}.
         * 
         *  A shape is considered static if it has static rank, and all dimensions of the shape
         *  are static. */
        
        ///
        public native @Cast("bool") boolean is_static();

        /** \brief Check if this shape is dynamic.
         *  @return {@code false} if this shape is static, else {@code true}.
         * 
         *  A shape is considered static if it has static rank, and all dimensions of the shape
         *  are static. */
        public native @Cast("bool") boolean is_dynamic();
        /** \brief Get the rank of the shape.
         *  @return The rank of the shape. This will be Rank::dynamic() if the rank of
         *          the shape is dynamic. */
        public native @ByVal @Cast("ngraph::Rank*") Dimension rank();
        /** \brief Construct a PartialShape with the given rank and all dimensions (if any) dynamic.
         *  @return A PartialShape with the given rank, and all dimensions (if any) dynamic. */
        
        ///
        public static native @ByVal PartialShape dynamic(@ByVal(nullValue = "ngraph::Rank::dynamic()") @Cast("ngraph::Rank*") Dimension r);
        public static native @ByVal PartialShape dynamic();
        /** \brief Check whether this shape is compatible with the argument, i.e., whether it is
         *         possible to merge them.
         *  @param s The shape to be checked for compatibility with this shape.
         *  @return {@code true} if this shape is compatible with {@code s}, else {@code false}.
         * 
         *  Two shapes are compatible if
         *  \li one or both of them has dynamic rank, or
         *  \li both shapes have dynamic and equal rank, and their dimensions are elementwise
         *      compatible (see Dimension::compatible()). */
        
        ///
        public native @Cast("bool") boolean compatible(@Const @ByRef PartialShape s);

        /** \brief Check whether this shape represents the same scheme as the argument.
         *  @param s The shape whose scheme is being compared with this shape.
         *  @return {@code true} if this shape represents the same scheme as {@code s}, else {@code false}.
         * 
         *  Two shapes {@code s1} and {@code s2} represent the same scheme if
         *  \li they both have dynamic rank, or
         *  \li they both have static and equal rank {@code r}, and for every {@code i} from {@code 0} to {@code r-1},
         *      {@code s1[i]} represents the same scheme as {@code s2[i]} (see Dimension::same_scheme()). */
        
        ///
        ///
        ///
        public native @Cast("bool") boolean same_scheme(@Const @ByRef PartialShape s);

        /** \brief Check whether this shape is a relaxation of the argument.
         *  @param s The shape which is being compared against this shape.
         *  @return {@code true} if this shape relaxes {@code s}, else {@code false}.
         * 
         *  Intuitively, a PartialShape {@code s1} is said to _relax_ {@code s2} (or _is a
         *  relaxation_ of {@code s2}) if it is "more permissive" than {@code s2}. In other
         *  words, {@code s1} is a relaxation of {@code s2} if anything you can form by
         *  plugging things into the dynamic dimensions of {@code s2} is also
         *  something you can form by plugging things into the dynamic
         *  dimensions of {@code s1}, but not necessarily the other way around.
         * 
         *  {@code s1.relaxes(s2)} is equivalent to {@code s2.refines(s1)}.
         * 
         *  Formally, PartialShape {@code s1} is said to _relax_ PartialShape {@code s2}
         *  if:
         *  \li {@code s1} has dynamic rank, or
         *  \li {@code s1} and {@code s2} both have static rank {@code r}, and for every {@code i} from {@code 0} to {@code r-1},
         *       either {@code s1[i]} is dynamic, or {@code s1[i]} == {@code s2[i]}. */
        
        ///
        ///
        ///
        public native @Cast("bool") boolean relaxes(@Const @ByRef PartialShape s);

        /** \brief Check whether this shape is a refinement of the argument.
         *  @param s The shape which is being compared against this shape.
         *  @return {@code true} if this shape refines {@code s}, else {@code false}.
         * 
         *  Intuitively, a PartialShape {@code s1} is said to _relax_ {@code s2} (or _is a
         *  relaxation_ of {@code s2}) if it is "less permissive" than {@code s2}. In other
         *  words, {@code s1} is a relaxation of {@code s2} if anything you can form by
         *  plugging things into the dynamic dimensions of {@code s1} is also
         *  something you can form by plugging things into the dynamic
         *  dimensions of {@code s2}, but not necessarily the other way around.
         * 
         *  {@code s1.refines(s2)} is equivalent to {@code s2.relaxes(s1)}.
         * 
         *  Formally, PartialShape {@code s1} is said to _refine_ PartialShape {@code s2}
         *  if:
         *  \li {@code s2} has dynamic rank, or
         *  \li {@code s1} and {@code s2} both have static rank {@code r}, and for every {@code i} from {@code 0} to {@code r-1},
         *       either {@code s2[i]} is dynamic, or {@code s1[i]} == {@code s2[i]}. */
        public native @Cast("bool") boolean refines(@Const @ByRef PartialShape s);

        /** \brief Checks that this shape's rank is compatible with {@code r}, and, if this shape's
         *         rank is dynamic and {@code r} is static, updates this shape to have a rank of {@code r}
         *         with dimensions all dynamic.
         *  @return {@code true} if this shape's rank is compatible with {@code r}, else {@code false}. */
        public native @Cast("bool") boolean merge_rank(@ByVal @Cast("ngraph::Rank*") Dimension r);

        /** \brief Convert a static PartialShape to a Shape.
         *  @return A new Shape {@code s} where {@code s[i] = size_t((*this)[i])}.
         *  @throws std::invalid_argument If this PartialShape is dynamic. */
        public native @ByVal Shape to_shape();

        /** \brief Returns {@code true} if all static dimensions of the tensor are non-negative, else
         *         {@code false}. */
        public native @Cast("bool") boolean all_non_negative();

        /** \brief Index operator for PartialShape.
         *  @param i The index of the dimension being selected.
         *  @return A reference to the {@code i}th Dimension of this shape. */
        /** \brief Index operator for PartialShape.
         *  @param i The index of the dimension being selected.
         *  @return A reference to the {@code i}th Dimension of this shape. */
        public native @ByRef @Name("operator []") Dimension get(@Cast("size_t") long i);
        
        

        /** \brief Try to merge one shape into another.
         *  @param dst [in,out] The shape that {@code src} will be merged into.
         *  @param src The shape that will be merged into {@code dst}.
         *  @return {@code true} if merging succeeds, else {@code false}.
         * 
         *  Merges {@code src} into {@code dst}, returning {@code true} on success and {@code false} on failure. If
         *  {@code false} is returned, the effect on {@code dst} is unspecified.
         * 
         *  To merge two partial shapes {@code s1} and {@code s2} is to find the most permissive partial shape
         *  {@code s} that is no more permissive than {@code s1} or {@code s2}, if {@code s} exists. For example:
         * 
         *  <pre>{@code
         *         merge(?,?) -> ?
         *         merge(?,{?,?}) -> {?,?}
         *         merge({?,?},{?,?}) -> {?,?}
         *         merge({1,2,3,4},?) -> {1,2,3,4}
         *         merge({1,2},{1,?}) -> {1,2}
         *         merge({1,2,?,?},{1,?,3,?}) -> {1,2,3,?}
         *         merge({1,2,3},{1,2,3}) -> {1,2,3}
         * 
         *         merge({1,?},{2,?}) fails [dimension 0 constraints are inconsistent]
         *         merge({?,?},{?,?,?}) fails [ranks are inconsistent]
         *  }</pre>
         * 
         *  This function (merge_into) performs the "merge" operation described above on {@code dst} and
         *  {@code src}, but overwrites {@code dst} with the result and returns {@code true} if merging is
         *  successful; if merging is unsuccessful, the function returns {@code false} and may make
         *  unspecified changes to {@code dst}. */
        public static native @Cast("bool") boolean merge_into(@ByRef PartialShape dst, @Const @ByRef PartialShape src);

        /** \brief Try to merge one shape into another along with implicit broadcasting */
        public static native @Cast("bool") boolean broadcast_merge_into(@ByRef PartialShape dst,
                                                 @Const @ByRef PartialShape src,
                                                 @Const @ByRef AutoBroadcastSpec autob);
    }

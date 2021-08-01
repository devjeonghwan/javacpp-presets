// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Generates labels for candidate sampling with a log-uniform distribution.
 * 
 *  See explanations of candidate sampling and the data formats at
 *  go/candidate-sampling.
 * 
 *  For each batch, this op picks a single set of sampled candidate labels.
 * 
 *  The advantages of sampling candidates per-batch are simplicity and the
 *  possibility of efficient dense matrix multiplication. The disadvantage is that
 *  the sampled candidates must be chosen independently of the context and of the
 *  true labels.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * true_classes: A batch_size * num_true matrix, in which each row contains the
 *  IDs of the num_true target_classes in the corresponding original label.
 *  * num_true: Number of true labels per context.
 *  * num_sampled: Number of candidates to randomly sample.
 *  * unique: If unique is true, we sample with rejection, so that all sampled
 *  candidates in a batch are unique. This requires some approximation to
 *  estimate the post-rejection sampling probabilities.
 *  * range_max: The sampler will sample integers from the interval [0, range_max).
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either seed or seed2 are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: An second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output} sampled_candidates: A vector of length num_sampled, in which each element is
 *  the ID of a sampled candidate.
 *  * {@code Output} true_expected_count: A batch_size * num_true matrix, representing
 *  the number of times each candidate is expected to occur in a batch
 *  of sampled candidates. If unique=true, then this is a probability.
 *  * {@code Output} sampled_expected_count: A vector of length num_sampled, for each sampled
 *  candidate representing the number of times the candidate is expected
 *  to occur in a batch of sampled candidates.  If unique=true, then this is a
 *  probability. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LogUniformCandidateSampler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogUniformCandidateSampler(Pointer p) { super(p); }

  /** Optional attribute setters for LogUniformCandidateSampler */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If either seed or seed2 are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** An second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public LogUniformCandidateSampler(@Const @ByRef Scope scope,
                             @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                             @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max) { super((Pointer)null); allocate(scope, true_classes, num_true, num_sampled, unique, range_max); }
  private native void allocate(@Const @ByRef Scope scope,
                             @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                             @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max);
  public LogUniformCandidateSampler(@Const @ByRef Scope scope,
                             @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                             @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max,
                             @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, true_classes, num_true, num_sampled, unique, range_max, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                             @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                             @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max,
                             @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native LogUniformCandidateSampler operation(Operation setter);
  public native @ByRef Output sampled_candidates(); public native LogUniformCandidateSampler sampled_candidates(Output setter);
  public native @ByRef Output true_expected_count(); public native LogUniformCandidateSampler true_expected_count(Output setter);
  public native @ByRef Output sampled_expected_count(); public native LogUniformCandidateSampler sampled_expected_count(Output setter);
}

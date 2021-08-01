// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_gen_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_gen_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_gen_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_gen_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_gen_workspace position(long position) {
        return (gsl_eigen_gen_workspace)super.position(position);
    }
    @Override public gsl_eigen_gen_workspace getPointer(long i) {
        return new gsl_eigen_gen_workspace((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_gen_workspace size(long setter);            /* size of matrices */
  public native gsl_vector work(); public native gsl_eigen_gen_workspace work(gsl_vector setter);       /* scratch workspace */

  public native @Cast("size_t") long n_evals(); public native gsl_eigen_gen_workspace n_evals(long setter);         /* number of eigenvalues found */
  public native @Cast("size_t") long max_iterations(); public native gsl_eigen_gen_workspace max_iterations(long setter);  /* maximum QZ iterations allowed */
  public native @Cast("size_t") long n_iter(); public native gsl_eigen_gen_workspace n_iter(long setter);          /* number of iterations since last eigenvalue found */
  public native double eshift(); public native gsl_eigen_gen_workspace eshift(double setter);          /* exceptional shift counter */

  public native int needtop(); public native gsl_eigen_gen_workspace needtop(int setter);            /* need to compute top index? */

  public native double atol(); public native gsl_eigen_gen_workspace atol(double setter);            /* tolerance for splitting A matrix */
  public native double btol(); public native gsl_eigen_gen_workspace btol(double setter);            /* tolerance for splitting B matrix */

  public native double ascale(); public native gsl_eigen_gen_workspace ascale(double setter);          /* scaling factor for shifts */
  public native double bscale(); public native gsl_eigen_gen_workspace bscale(double setter);          /* scaling factor for shifts */

  public native gsl_matrix H(); public native gsl_eigen_gen_workspace H(gsl_matrix setter);          /* pointer to hessenberg matrix */
  public native gsl_matrix R(); public native gsl_eigen_gen_workspace R(gsl_matrix setter);          /* pointer to upper triangular matrix */

  public native int compute_s(); public native gsl_eigen_gen_workspace compute_s(int setter);          /* compute generalized Schur form S */
  public native int compute_t(); public native gsl_eigen_gen_workspace compute_t(int setter);          /* compute generalized Schur form T */

  public native gsl_matrix Q(); public native gsl_eigen_gen_workspace Q(gsl_matrix setter);          /* pointer to left Schur vectors */
  public native gsl_matrix Z(); public native gsl_eigen_gen_workspace Z(gsl_matrix setter);          /* pointer to right Schur vectors */
}

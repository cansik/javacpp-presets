// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Elementwise unary operation backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class eltwise_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public eltwise_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public eltwise_backward position(long position) {
        return (eltwise_backward)super.position(position);
    }
    @Override public eltwise_backward getPointer(long i) {
        return new eltwise_backward(this).position(position + i);
    }

    /** Descriptor for an elementwise backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_eltwise_desc_t data(); public native desc data(dnnl_eltwise_desc_t setter);

        /** Constructs a descriptor for an elementwise backward propagation
         *  primitive.
         * 
         *  @param aalgorithm Elementwise algorithm kind.
         *  @param diff_data_desc Diff source and destination memory
         *      descriptors.
         *  @param data_desc Source memory descriptor.
         *  @param alpha The alpha parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm.
         *  @param beta The beta parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm. */
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/) { super((Pointer)null); allocate(aalgorithm, diff_data_desc, data_desc, alpha, beta); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/) { super((Pointer)null); allocate(aalgorithm, diff_data_desc, data_desc, alpha, beta); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/);
    }

    /** Primitive descriptor for eltwise backward propagation. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc(this).position(position + i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an elementwise backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an elementwise backward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an elementwise forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an elementwise backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an elementwise backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an elementwise forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef eltwise_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an eltwise backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an eltwise backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public eltwise_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an eltwise backward propagation primitive.
     *  @param pd Primitive descriptor for an eltwise backward propagation
     *      primitive. */
    public eltwise_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}

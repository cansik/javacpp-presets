// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_Descr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_Descr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_Descr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_Descr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_Descr position(long position) {
        return (PyArray_Descr)super.position(position);
    }
    @Override public PyArray_Descr getPointer(long i) {
        return new PyArray_Descr(this).position(position + i);
    }

        public native @ByRef PyObject ob_base(); public native PyArray_Descr ob_base(PyObject setter);
        /*
         * the type object representing an
         * instance of this type -- should not
         * be two type_numbers with the same type
         * object.
         */
        public native PyTypeObject typeobj(); public native PyArray_Descr typeobj(PyTypeObject setter);
        /* kind for this type */
        public native @Cast("char") byte kind(); public native PyArray_Descr kind(byte setter);
        /* unique-character representing this type */
        public native @Cast("char") byte type(); public native PyArray_Descr type(byte setter);
        /*
         * '>' (big), '<' (little), '|'
         * (not-applicable), or '=' (native).
         */
        public native @Cast("char") byte byteorder(); public native PyArray_Descr byteorder(byte setter);
        /* flags describing data type */
        public native @Cast("char") byte flags(); public native PyArray_Descr flags(byte setter);
        /* number representing this type */
        public native int type_num(); public native PyArray_Descr type_num(int setter);
        /* element size (itemsize) for this type */
        public native int elsize(); public native PyArray_Descr elsize(int setter);
        /* alignment needed for this type */
        public native int alignment(); public native PyArray_Descr alignment(int setter);
        /*
         * Non-NULL if this type is
         * is an array (C-contiguous)
         * of some other type
         */
        public native PyArray_ArrayDescr subarray(); public native PyArray_Descr subarray(PyArray_ArrayDescr setter);
        /*
         * The fields dictionary for this type
         * For statically defined descr this
         * is always Py_None
         */
        public native PyObject fields(); public native PyArray_Descr fields(PyObject setter);
        /*
         * An ordered tuple of field names or NULL
         * if no fields are defined
         */
        public native PyObject names(); public native PyArray_Descr names(PyObject setter);
        /*
         * a table of functions specific for each
         * basic data descriptor
         */
        public native PyArray_ArrFuncs f(); public native PyArray_Descr f(PyArray_ArrFuncs setter);
        /* Metadata about this dtype */
        public native PyObject metadata(); public native PyArray_Descr metadata(PyObject setter);
        /*
         * Metadata specific to the C implementation
         * of the particular dtype. This was added
         * for NumPy 1.7.0.
         */
        public native NpyAuxData c_metadata(); public native PyArray_Descr c_metadata(NpyAuxData setter);
        /* Cached hash value (-1 if not yet computed).
         * This was added for NumPy 2.0.0.
         */
        public native @Cast("npy_hash_t") long hash(); public native PyArray_Descr hash(long setter);
}

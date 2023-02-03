package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.Serializable;

public class TestGenericsBounded
    extends BaseMapTest
{
    @SuppressWarnings("serial")
    static class Range<E extends Comparable<E>> implements Serializable
    {
         protected E start, end;

         public Range(){ }
         public Range(E start, E end) {
             this.start = start;
             this.end = end;
         }

         public E getEnd() { return end; }
         public void setEnd(E e) { end = e; }

         public E getStart() { return start; }
         public void setStart(E s) {
             start = s;
         }
    }

    @SuppressWarnings("serial")
    static class DoubleRange extends Range<Double> {
        public DoubleRange() { }
        public DoubleRange(Double s, Double e) { super(s, e); }
    }
     
    static class BoundedWrapper<A extends Serializable>
    {
        public List<A> values;
    }

    @SuppressWarnings("serial")
    static class IntBean implements Serializable
    {
        public int x;
    }

    static class IntBeanWrapper<T extends IntBean> {
        public T wrapped;
    }

    // Types for [JACKSON-778]
    
    static class Document {}
    static class Row {}
    static class RowWithDoc<D extends Document> extends Row {
        @JsonProperty("d") D d;
    }
    static class ResultSet<R extends Row> {
        @JsonProperty("rows") List<R> rows;
    }
    static class ResultSetWithDoc<D extends Document> extends ResultSet<RowWithDoc<D>> {}

    static class MyDoc extends Document {}    
    /*
    /*******************************************************
    /* Unit tests
    /*******************************************************
     */

    
    
    // Test related to type bound handling problem within [JACKSON-190]
    

    

    
}

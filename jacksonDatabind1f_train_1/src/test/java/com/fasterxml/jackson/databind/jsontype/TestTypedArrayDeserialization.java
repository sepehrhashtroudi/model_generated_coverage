package com.fasterxml.jackson.databind.jsontype;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestTypedArrayDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    /**
     * Let's claim we need type here too (although we won't
     * really use any sub-classes)
     */
    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
    static class TypedList<T> extends ArrayList<T> { }

    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY)
    static class TypedListAsProp<T> extends ArrayList<T> { }
    
    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    static class TypedListAsWrapper<T> extends LinkedList<T> { }
    
    // Mix-in to force wrapper for things like primitive arrays
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    interface WrapperMixIn { }

    /*
    /**********************************************************
    /* Unit tests, Lists
    /**********************************************************
     */
    

public void testBooleanListAsProp44() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     String JSON = "[\"" + TypedListAsProp.class.getName() + "\",[true, false]]"; 
     JavaType type = TypeFactory.defaultInstance().constructCollectionType(TypedListAsProp.class, Boolean.class); 
     TypedListAsProp<Object> result = m.readValue(JSON, type); 
     assertNotNull(result); 
     assertEquals(2, result.size()); 
     assertEquals(Boolean.TRUE, result.get(0)); 
     assertEquals(Boolean.FALSE, result.get(1)); 
 } 


public void testLongListAsWrapper197() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     String JSON = "{\"" + TypedListAsWrapper.class.getName() + "\":[1, 3]}"; 
     JavaType type = TypeFactory.defaultInstance().constructCollectionType(TypedListAsWrapper.class, Long.class); 
     TypedListAsWrapper<Object> result = m.readValue(JSON, type); 
     assertNotNull(result); 
     assertEquals(2, result.size()); 
     assertEquals(Long.class, result.get(0).getClass()); 
     assertEquals(Long.valueOf(1), result.get(0)); 
     assertEquals(Long.class, result.get(1).getClass()); 
     assertEquals(Long.valueOf(3), result.get(1)); 
 } 


public void testIntList482() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     String JSON = "{\"" + TypedListAsWrapper.class.getName() + "\":[4,5, 6]}"; 
     JavaType type = TypeFactory.defaultInstance().constructCollectionType(TypedListAsWrapper.class, Integer.class); 
     TypedListAsWrapper<Integer> result = m.readValue(JSON, type); 
     assertNotNull(result); 
     assertEquals(3, result.size()); 
     assertEquals(Integer.valueOf(4), result.get(0)); 
     assertEquals(Integer.valueOf(5), result.get(1)); 
     assertEquals(Integer.valueOf(6), result.get(2)); 
 } 


public void testLongArray515() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.addMixInAnnotations(long[].class, WrapperMixIn.class); 
     String JSON = "{\"" + long[].class.getName() + "\":[5, 6, 7]}"; 
     long[] value = m.readValue(JSON, long[].class); 
     assertNotNull(value); 
     assertEquals(3, value.length); 
     assertArrayEquals(new long[] { 5L, 6L, 7L }, value); 
 } 

    

    /**
     * Similar to above, but this time let's request adding type info
     * as property. That would not work (since there's no JSON Object to
     * add property in), so it will basically be same as using WRAPPER_ARRAY
     */
    

    

    /*
    /**********************************************************
    /* Unit tests, primitive arrays
    /**********************************************************
     */

    
}

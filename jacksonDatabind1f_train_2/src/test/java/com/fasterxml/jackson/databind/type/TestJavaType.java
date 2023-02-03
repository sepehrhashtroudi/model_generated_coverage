package com.fasterxml.jackson.databind.type;

import java.util.*;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Simple tests to verify that {@link JavaType} types work to
 * some degree
 */
public class TestJavaType
    extends com.fasterxml.jackson.test.BaseTest
{
    static class BaseType { }

    static class SubType extends BaseType { }
    
    static enum MyEnum { A, B; }
    static enum MyEnum2 {
        A(1), B(2);
        
        private MyEnum2(int value) { }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    

public void testArrayType205() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType arrayT = ArrayType.construct(tf.constructType(String.class), null, null); 
     assertNotNull(arrayT); 
     assertTrue(arrayT.isContainerType()); 
     assertSame(arrayT, arrayT.narrowContentsBy(String.class)); 
     assertNotNull(arrayT.toString()); 
     assertTrue(arrayT.equals(arrayT)); 
     assertFalse(arrayT.equals(null)); 
     assertFalse(arrayT.equals("xyz")); 
     assertTrue(arrayT.equals(ArrayType.construct(tf.constructType(String.class), null, null))); 
     assertFalse(arrayT.equals(ArrayType.construct(tf.constructType(Integer.class), null, null))); 
     try { 
         SimpleType.construct(String[].class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for an array"); 
     } 
 } 


public void testMapType240() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType keyT = tf.constructType(String.class); 
     JavaType baseT = tf.constructType(BaseType.class); 
     MapType mapT = MapType.construct(Map.class, keyT, baseT); 
     assertNotNull(mapT); 
     assertTrue(mapT.isContainerType()); 
     assertSame(mapT, mapT.narrowContentsBy(BaseType.class)); 
     assertSame(mapT, mapT.narrowKey(String.class)); 
     assertTrue(mapT.equals(mapT)); 
     assertFalse(mapT.equals(null)); 
     assertFalse(mapT.equals("xyz")); 
     MapType mapT2 = MapType.construct(HashMap.class, keyT, baseT); 
     assertFalse(mapT.equals(mapT2)); 
     try { 
         SimpleType.construct(HashMap.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for a Map"); 
     } 
 } 


public void testJavaTypeAsJLRType246() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t1 = tf.constructType(getClass()); 
     JavaType t2 = tf.constructType(t1); 
     assertSame(t1, t2); 
 } 


public void testClassKey552() { 
     ClassKey key = new ClassKey(String.class); 
     assertEquals(0, key.compareTo(key)); 
     assertTrue(key.equals(key)); 
     assertFalse(key.equals(null)); 
     assertFalse(key.equals("foo")); 
     assertFalse(key.equals(new ClassKey(Integer.class))); 
     assertEquals(String.class.getName(), key.toString()); 
 } 

    

    

    

    

    

    

    // [Issue#116]
    
}


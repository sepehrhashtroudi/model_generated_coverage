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
    
public void testMapType49() { 
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
public void testMapTypesRaw51() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 }
    

    

    

    

    

    

    // [Issue#116]
    
}


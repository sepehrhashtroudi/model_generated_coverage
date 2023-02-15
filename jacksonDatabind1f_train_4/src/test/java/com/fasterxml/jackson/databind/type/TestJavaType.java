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
    

public void testCollectionType110() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType collectionT = CollectionType.construct(List.class, tf.constructType(String.class)); 
     assertNotNull(collectionT); 
     assertTrue(collectionT.isContainerType()); 
     assertSame(collectionT, collectionT.narrowContentsBy(String.class)); 
     assertNotNull(collectionT.toString()); 
     assertTrue(collectionT.equals(collectionT)); 
     assertFalse(collectionT.equals(null)); 
     assertFalse(collectionT.equals("xyz")); 
     assertTrue(collectionT.equals(CollectionType.construct(List.class, tf.constructType(String.class)))); 
     assertFalse(collectionT.equals(CollectionType.construct(Set.class, tf.constructType(String.class)))); 
     try { 
         SimpleType.construct(ArrayList.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for a Collection"); 
     } 
 } 


public void testMapType242() { 
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


public void testSimpleClass275() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType baseType = tf.constructType(BaseType.class); 
     assertSame(BaseType.class, baseType.getRawClass()); 
     assertTrue(baseType.hasRawClass(BaseType.class)); 
     assertFalse(baseType.isArrayType()); 
     assertFalse(baseType.isContainerType()); 
     assertFalse(baseType.isEnumType()); 
     assertFalse(baseType.isInterface()); 
     assertFalse(baseType.isPrimitive()); 
     assertNull(baseType.getContentType()); 
     assertNull(baseType.getValueHandler()); 
     assertSame(baseType, baseType.narrowBy(BaseType.class)); 
     assertSame(baseType, baseType.widenBy(BaseType.class)); 
     try { 
         baseType.narrowBy(SubType.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "should never be called"); 
     } 
 } 


public void testClassKey549() { 
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


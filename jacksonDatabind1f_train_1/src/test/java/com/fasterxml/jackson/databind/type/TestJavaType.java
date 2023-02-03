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


public void testArrayType200() { 
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


public void testJavaTypeAsJLRType248() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t1 = tf.constructType(getClass()); 
     JavaType t2 = tf.constructType(t1); 
     assertSame(t1, t2); 
 } 


public void testSimpleClass268() { 
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

    

    

    

    

    

    

    // [Issue#116]
    
}


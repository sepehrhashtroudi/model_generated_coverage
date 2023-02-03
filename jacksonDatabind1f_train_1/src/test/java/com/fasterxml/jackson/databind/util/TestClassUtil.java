package com.fasterxml.jackson.databind.util;

import java.util.*;

import static org.junit.Assert.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class TestClassUtil
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    /* Test classes and interfaces needed for testing class util
     * methods
     */
    static abstract class BaseClass implements Comparable<BaseClass>,
        BaseInt
    {
        BaseClass(String str) { }
    }

    interface BaseInt { }

    interface SubInt extends BaseInt { }

    enum TestEnum { A; }

    abstract class InnerNonStatic { }

    static class Inner {
        protected Inner() {
            throw new IllegalStateException("test");
        }
    }

    static abstract class SubClass
        extends BaseClass
        implements SubInt {
        SubClass() { super("x"); }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    

public void testSuperInterfaces101() { 
     Collection<Class<?>> result = ClassUtil.findSuperTypes(SubInt.class, null); 
     Class<?>[] classes = result.toArray(new Class<?>[result.size()]); 
     Class<?>[] exp = new Class[] { BaseInt.class }; 
     assertArrayEquals(exp, classes); 
 } 


public void testSuperTypes102() { 
     Collection<Class<?>> result = ClassUtil.findSuperTypes(SubClass.class, null); 
     Class<?>[] classes = result.toArray(new Class<?>[result.size()]); 
     Class<?>[] exp = new Class[] { SubInt.class, BaseInt.class, BaseClass.class, Comparable.class }; 
     assertArrayEquals(exp, classes); 
 } 


public void testCanBeABeanType103() { 
     assertEquals("annotation", ClassUtil.canBeABeanType(java.lang.annotation.Retention.class)); 
     assertEquals("array", ClassUtil.canBeABeanType(String[].class)); 
     assertEquals("enum", ClassUtil.canBeABeanType(TestEnum.class)); 
     assertEquals("primitive", ClassUtil.canBeABeanType(Integer.TYPE)); 
     assertNull(ClassUtil.canBeABeanType(Integer.class)); 
     assertEquals("non-static member class", ClassUtil.isLocalType(InnerNonStatic.class, false)); 
     assertNull(ClassUtil.isLocalType(Integer.class, false)); 
 } 


public void testIsConcrete105() { 
     assertTrue(ClassUtil.isConcrete(getClass())); 
     assertFalse(ClassUtil.isConcrete(BaseClass.class)); 
     assertFalse(ClassUtil.isConcrete(BaseInt.class)); 
 } 


public void testFailedCreateInstance106() { 
     try { 
         ClassUtil.createInstance(BaseClass.class, true); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "has no default"); 
     } 
     try { 
         ClassUtil.createInstance(Inner.class, false); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "is not accessible"); 
     } 
     try { 
         ClassUtil.createInstance(Inner.class, true); 
     } catch (IllegalStateException e) { 
         verifyException(e, "test"); 
     } 
 } 

    

    
    
    

    

    

    
}

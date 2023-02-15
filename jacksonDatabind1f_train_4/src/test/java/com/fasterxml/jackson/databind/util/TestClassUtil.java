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
    

public void testSuperInterfaces99() { 
     Collection<Class<?>> result = ClassUtil.findSuperTypes(SubInt.class, null); 
     Class<?>[] classes = result.toArray(new Class<?>[result.size()]); 
     Class<?>[] exp = new Class[] { BaseInt.class }; 
     assertArrayEquals(exp, classes); 
 } 


public void testSuperTypes100() { 
     Collection<Class<?>> result = ClassUtil.findSuperTypes(SubClass.class, null); 
     Class<?>[] classes = result.toArray(new Class<?>[result.size()]); 
     Class<?>[] exp = new Class[] { SubInt.class, BaseInt.class, BaseClass.class, Comparable.class }; 
     assertArrayEquals(exp, classes); 
 } 


public void testFailedCreateInstance102() { 
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


public void testExceptionHelpers103() { 
     RuntimeException e = new RuntimeException("test"); 
     RuntimeException wrapper = new RuntimeException(e); 
     assertSame(e, ClassUtil.getRootCause(wrapper)); 
     try { 
         ClassUtil.throwAsIAE(e); 
         fail("Shouldn't get this far"); 
     } catch (RuntimeException e2) { 
         assertSame(e, e2); 
     } 
     try { 
         ClassUtil.unwrapAndThrowAsIAE(wrapper); 
         fail("Shouldn't get this far"); 
     } catch (RuntimeException e2) { 
         assertSame(e, e2); 
     } 
 } 

    

    
    
    

    

    

    
}

package com.fasterxml.jackson.databind.ser;

import java.util.*;


import com.fasterxml.jackson.databind.*;

/**
 * Simple unit tests to verify that it is possible to handle
 * potentially cyclic structures, as long as object graph itself
 * is not cyclic. This is the case for directed hierarchies like
 * trees and DAGs.
 */
public class TestCyclicTypes
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class Bean
    {
        Bean _next;
        final String _name;

        public Bean(Bean next, String name) {
            _next = next;
            _name = name;
        }

        public Bean getNext() { return _next; }
        public String getName() { return _name; }

        public void assignNext(Bean n) { _next = n; }
    }

    /*
    /**********************************************************
    /* Types
    /**********************************************************
     */


public void testSelfReference428() throws Exception { 
     Bean selfRef = new Bean(null, "self-refs"); 
     Bean first = new Bean(selfRef, "first"); 
     selfRef.assignNext(selfRef); 
     ObjectMapper m = new ObjectMapper(); 
     Bean[] wrapper = new Bean[] { first }; 
     try { 
         writeAndMap(m, wrapper); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Direct self-reference leading to cycle"); 
     } 
 } 

    

    /**
     * Test for verifying that [JACKSON-158] works as expected
     */
    
}

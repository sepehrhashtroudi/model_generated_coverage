package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that simple exceptions can be serialized.
 */
public class TestExceptionSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */


public void testSimple467() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String TEST = "test exception"; 
     Map<String, Object> result = writeAndMap(mapper, new Exception(TEST)); 
     Object ob = result.get("suppressed"); 
     if (ob != null) { 
         assertEquals(5, result.size()); 
     } else { 
         assertEquals(4, result.size()); 
     } 
     assertEquals(TEST, result.get("message")); 
     assertNull(result.get("cause")); 
     assertEquals(TEST, result.get("localizedMessage")); 
     Object traces = result.get("stackTrace"); 
     if (!(traces instanceof List<?>)) { 
         fail("Expected a List for exception member 'stackTrace', got: " + traces); 
     } 
 } 

    
}

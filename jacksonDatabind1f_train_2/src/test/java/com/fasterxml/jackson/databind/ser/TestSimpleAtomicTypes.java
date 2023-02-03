package com.fasterxml.jackson.databind.ser;

import java.util.concurrent.atomic.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests for verifying serialization of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleAtomicTypes
    extends BaseMapTest
{

public void testAtomicBoolean556() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("true", serializeAsString(mapper, new AtomicBoolean(true))); 
     assertEquals("false", serializeAsString(mapper, new AtomicBoolean(false))); 
 } 


public void testAtomicInteger557() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("1", serializeAsString(mapper, new AtomicInteger(1))); 
     assertEquals("-9", serializeAsString(mapper, new AtomicInteger(-9))); 
 } 


public void testAtomicLong558() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("0", serializeAsString(mapper, new AtomicLong(0))); 
 } 

    

    

    

    
}

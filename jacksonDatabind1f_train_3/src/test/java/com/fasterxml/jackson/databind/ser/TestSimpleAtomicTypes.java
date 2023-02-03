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

public void testAtomicLong558() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("0", serializeAsString(mapper, new AtomicLong(0))); 
 } 


public void testAtomicReference559() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String[] strs = new String[] { "abc" }; 
     assertEquals("[\"abc\"]", serializeAsString(mapper, new AtomicReference<String[]>(strs))); 
 } 

    

    

    

    
}

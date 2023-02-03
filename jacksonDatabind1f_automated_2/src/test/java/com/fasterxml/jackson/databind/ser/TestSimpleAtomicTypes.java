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
public void testAtomicReference314() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AtomicReference<long[]> value = mapper.readValue("[1,2]", new com.fasterxml.jackson.core.type.TypeReference<AtomicReference<long[]>>() { 
     }); 
     Object ob = value.get(); 
     assertNotNull(ob); 
     assertEquals(long[].class, ob.getClass()); 
     long[] longs = (long[]) ob; 
     assertNotNull(longs); 
     assertEquals(2, longs.length); 
     assertEquals(1, longs[0]); 
     assertEquals(2, longs[1]); 
 }
public void testAtomicReference315() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("{\"name\":\"Tatu\",\"x\":1,\"y\":2}", mapper.writeValueAsString(new AtomicReference<Long>(1L))); 
     assertEquals("{\"name\":\"Tatu\",\"x\":1,\"y\":2}", mapper.writeValueAsString(new AtomicReference<Long>(2L))); 
 }
    

    

    

    
}

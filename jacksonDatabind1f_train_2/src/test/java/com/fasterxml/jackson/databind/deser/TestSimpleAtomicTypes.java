package com.fasterxml.jackson.databind.deser;

import java.util.concurrent.atomic.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSimpleAtomicTypes
    extends com.fasterxml.jackson.databind.BaseMapTest
{

public void testAtomicBoolean314() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AtomicBoolean b = mapper.readValue("true", AtomicBoolean.class); 
     assertTrue(b.get()); 
 } 


public void testAtomicReference349() throws Exception { 
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

    

    

    

    
}

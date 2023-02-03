package com.fasterxml.jackson.databind.deser;

import java.util.concurrent.atomic.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSimpleAtomicTypes
    extends com.fasterxml.jackson.databind.BaseMapTest
{

public void testAtomicBoolean330() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AtomicBoolean b = mapper.readValue("true", AtomicBoolean.class); 
     assertTrue(b.get()); 
 } 

    

    

    

    
}

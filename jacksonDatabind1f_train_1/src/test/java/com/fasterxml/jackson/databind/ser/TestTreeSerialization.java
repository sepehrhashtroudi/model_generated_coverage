package com.fasterxml.jackson.databind.ser;


import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

/**
 * This unit test suite tries to verify that JsonNode-based trees
 * can be serialized as expected
 */
public class TestTreeSerialization
    extends BaseMapTest
{
    final static class Bean {
        public String getX() { return "y"; }
        public int getY() { return 13; }
    }


@SuppressWarnings("unchecked") 
 public void testPOJOString272() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectNode n = mapper.getNodeFactory().objectNode(); 
     n.set("pojo", mapper.getNodeFactory().POJONode("abc")); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jg = mapper.getFactory().createGenerator(sw); 
     mapper.writeTree(jg, n); 
     Map<String, Object> result = (Map<String, Object>) mapper.readValue(sw.toString(), Map.class); 
     assertEquals(1, result.size()); 
     assertEquals("abc", result.get("pojo")); 
 } 

    

    /**
     * Simple test to verify that POJONodes (JsonNode wrapper around
     * any old Java object) work with serialization
     */
    

    

    
}

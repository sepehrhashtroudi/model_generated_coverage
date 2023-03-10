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
 public void testPOJOString291() throws Exception { 
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


@SuppressWarnings("unchecked") 
 public void testSimpleViaObjectMapper293() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectNode n = mapper.getNodeFactory().objectNode(); 
     n.put("number", 15); 
     n.put("string", "abc"); 
     ObjectNode n2 = n.putObject("ob"); 
     n2.putArray("arr"); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jg = mapper.getFactory().createGenerator(sw); 
     mapper.writeTree(jg, n); 
     Map<String, Object> result = (Map<String, Object>) mapper.readValue(sw.toString(), Map.class); 
     assertEquals(3, result.size()); 
     assertEquals("abc", result.get("string")); 
     assertEquals(Integer.valueOf(15), result.get("number")); 
     Map<String, Object> ob = (Map<String, Object>) result.get("ob"); 
     assertEquals(1, ob.size()); 
     List<Object> list = (List<Object>) ob.get("arr"); 
     assertEquals(0, list.size()); 
 } 

    

    /**
     * Simple test to verify that POJONodes (JsonNode wrapper around
     * any old Java object) work with serialization
     */
    

    

    
}

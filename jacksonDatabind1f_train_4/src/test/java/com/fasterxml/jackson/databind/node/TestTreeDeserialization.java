package com.fasterxml.jackson.databind.node;

import java.io.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite tries to verify that JsonNode-based trees
 * can be deserialized as expected.
 */
public class TestTreeDeserialization
    extends BaseMapTest
{
    final static class Bean {
        int _x;
        JsonNode _node;

        public void setX(int x) { _x = x; }
        public void setNode(JsonNode n) { _node = n; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * This test checks that is possible to mix "regular" Java objects
     * and JsonNode.
     */

public void testReadFromString212() throws Exception { 
     String json = "{\"field\":\"{\\\"name\\\":\\\"John Smith\\\"}\"}"; 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode jNode = mapper.readValue(json, JsonNode.class); 
     String generated = mapper.writeValueAsString(jNode); 
     JsonNode out = mapper.readValue(generated, JsonNode.class); 
     assertTrue(out.isObject()); 
     assertEquals(1, out.size()); 
     String value = out.path("field").asText(); 
     assertNotNull(value); 
 } 


public void testNullHandling313() throws Exception { 
     JsonNode n = objectReader().readTree("null"); 
     assertNotNull(n); 
     assertTrue(n.isNull()); 
     n = objectMapper().readTree("null"); 
     assertNotNull(n); 
     assertTrue(n.isNull()); 
     ObjectNode root = (ObjectNode) objectReader().readTree("{\"x\":null}"); 
     assertEquals(1, root.size()); 
     n = root.get("x"); 
     assertNotNull(n); 
     assertTrue(n.isNull()); 
 } 


public void testObjectNodeEquality558() { 
     ObjectNode n1 = new ObjectNode(null); 
     ObjectNode n2 = new ObjectNode(null); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
     n1.set("x", TextNode.valueOf("Test")); 
     assertFalse(n1.equals(n2)); 
     assertFalse(n2.equals(n1)); 
     n2.set("x", TextNode.valueOf("Test")); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
 } 

    

    /// Verifying [JACKSON-143]
    

    

    

    // Issue#186
    
}

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Simple tests to verify that [JACKSON-707] is implemented correctly.
 */
public class TestDeepCopy extends BaseMapTest
{
    private final ObjectMapper mapper = new ObjectMapper();
    

public void testWithObjectSimple194() { 
     ObjectNode root = mapper.createObjectNode(); 
     root.put("a", 3); 
     assertEquals(1, root.size()); 
     ObjectNode copy = root.deepCopy(); 
     assertEquals(1, copy.size()); 
     root.put("b", 7); 
     assertEquals(2, root.size()); 
     assertEquals(1, copy.size()); 
     copy.put("c", 3); 
     assertEquals(2, root.size()); 
     assertEquals(2, copy.size()); 
 } 


public void testWithArraySimple447() { 
     ArrayNode root = mapper.createArrayNode(); 
     root.add("a"); 
     assertEquals(1, root.size()); 
     ArrayNode copy = root.deepCopy(); 
     assertEquals(1, copy.size()); 
     root.add(7); 
     assertEquals(2, root.size()); 
     assertEquals(1, copy.size()); 
     copy.add(3); 
     assertEquals(2, root.size()); 
     assertEquals(2, copy.size()); 
 } 


public void testWithNested519() { 
     ObjectNode root = mapper.createObjectNode(); 
     ObjectNode leafObject = root.putObject("ob"); 
     ArrayNode leafArray = root.putArray("arr"); 
     assertEquals(2, root.size()); 
     leafObject.put("a", 3); 
     assertEquals(1, leafObject.size()); 
     leafArray.add(true); 
     assertEquals(1, leafArray.size()); 
     ObjectNode copy = root.deepCopy(); 
     assertNotSame(copy, root); 
     assertEquals(2, copy.size()); 
     leafObject.put("x", 9); 
     assertEquals(2, leafObject.size()); 
     assertEquals(1, copy.get("ob").size()); 
     leafArray.add("foobar"); 
     assertEquals(2, leafArray.size()); 
     assertEquals(1, copy.get("arr").size()); 
     ((ObjectNode) copy.get("ob")).put("c", 3); 
     assertEquals(2, leafObject.size()); 
     assertEquals(2, copy.get("ob").size()); 
     ((ArrayNode) copy.get("arr")).add(13); 
     assertEquals(2, leafArray.size()); 
     assertEquals(2, copy.get("arr").size()); 
 } 

    

    

    
}

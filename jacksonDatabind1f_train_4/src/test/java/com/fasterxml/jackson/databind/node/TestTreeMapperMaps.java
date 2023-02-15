package com.fasterxml.jackson.databind.node;

import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Unit tests to verify that Json Objects map property to Map-like
 * ObjectNodes.
 */
public class TestTreeMapperMaps
    extends BaseTest
{

public void testSimpleObject81() throws Exception { 
     String JSON = "{ \"key\" : 1, \"b\" : \"x\" }"; 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode root = mapper.readTree(JSON); 
     assertFalse(root.isValueNode()); 
     assertTrue(root.isContainerNode()); 
     assertFalse(root.isArray()); 
     assertTrue(root.isObject()); 
     assertEquals(2, root.size()); 
     Iterator<JsonNode> it = root.iterator(); 
     assertNotNull(it); 
     assertTrue(it.hasNext()); 
     JsonNode n = it.next(); 
     assertNotNull(n); 
     assertEquals(IntNode.valueOf(1), n); 
     assertTrue(it.hasNext()); 
     n = it.next(); 
     assertNotNull(n); 
     assertEquals(TextNode.valueOf("x"), n); 
     assertFalse(it.hasNext()); 
     ObjectNode obNode = (ObjectNode) root; 
     Iterator<Map.Entry<String, JsonNode>> fit = obNode.fields(); 
     assertTrue(fit.hasNext()); 
     Map.Entry<String, JsonNode> en = fit.next(); 
     assertEquals("key", en.getKey()); 
     assertEquals(IntNode.valueOf(1), en.getValue()); 
     assertTrue(fit.hasNext()); 
     en = fit.next(); 
     assertEquals("b", en.getKey()); 
     assertEquals(TextNode.valueOf("x"), en.getValue()); 
     fit.remove(); 
     assertEquals(1, obNode.size()); 
     assertEquals(IntNode.valueOf(1), root.get("key")); 
     assertNull(root.get("b")); 
 } 

    

    

}

package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.databind.*;

/**
 * Additional tests for {@link ObjectNode} container class.
 */
public class TestObjectNode
    extends BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();


public void testSetAll107() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals(0, root.size()); 
     HashMap<String, JsonNode> map = new HashMap<String, JsonNode>(); 
     map.put("a", root.numberNode(1)); 
     root.setAll(map); 
     assertEquals(1, root.size()); 
     assertTrue(root.has("a")); 
     assertFalse(root.has("b")); 
     map.put("b", root.numberNode(2)); 
     root.setAll(map); 
     assertEquals(2, root.size()); 
     assertTrue(root.has("a")); 
     assertTrue(root.has("b")); 
     assertEquals(2, root.path("b").intValue()); 
     ObjectNode root2 = MAPPER.createObjectNode(); 
     root2.setAll(root); 
     assertEquals(2, root.size()); 
     assertEquals(2, root2.size()); 
     root2.setAll(root); 
     assertEquals(2, root.size()); 
     assertEquals(2, root2.size()); 
     ObjectNode root3 = MAPPER.createObjectNode(); 
     root3.put("a", 2); 
     root3.put("c", 3); 
     assertEquals(2, root3.path("a").intValue()); 
     root3.setAll(root2); 
     assertEquals(3, root3.size()); 
     assertEquals(1, root3.path("a").intValue()); 
 } 


public void testRetain159() { 
     ObjectNode ob = MAPPER.createObjectNode(); 
     ob.put("a", "a"); 
     ob.put("b", "b"); 
     ob.put("c", "c"); 
     assertEquals(3, ob.size()); 
     assertSame(ob, ob.retain("a", "c")); 
     assertEquals(2, ob.size()); 
     assertEquals("a", ob.get("a").textValue()); 
     assertNull(ob.get("b")); 
     assertEquals("c", ob.get("c").textValue()); 
 } 


public void testValidWith561() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals("{}", MAPPER.writeValueAsString(root)); 
     JsonNode child = root.with("prop"); 
     assertTrue(child instanceof ObjectNode); 
     assertEquals("{\"prop\":{}}", MAPPER.writeValueAsString(root)); 
 } 


public void testNullChecking563() { 
     ObjectNode o1 = JsonNodeFactory.instance.objectNode(); 
     ObjectNode o2 = JsonNodeFactory.instance.objectNode(); 
     o1.setAll(o2); 
     assertEquals(0, o1.size()); 
     assertEquals(0, o2.size()); 
     o1.set("x", null); 
     JsonNode n = o1.get("x"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("str", (String) null); 
     n = o1.get("str"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("d", (BigDecimal) null); 
     n = o1.get("d"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
 } 

    

    /**
     * Verify null handling
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    

    

    

    

    

    

    

    // [Issue#93]
    
}

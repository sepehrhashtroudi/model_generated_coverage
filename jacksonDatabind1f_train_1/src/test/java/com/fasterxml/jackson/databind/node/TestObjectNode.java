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


public void testSetAll93() throws Exception { 
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


public void testBasics94() { 
     ObjectNode n = new ObjectNode(JsonNodeFactory.instance); 
     assertStandardEquals(n); 
     assertFalse(n.elements().hasNext()); 
     assertFalse(n.fields().hasNext()); 
     assertFalse(n.fieldNames().hasNext()); 
     assertNull(n.get("a")); 
     assertTrue(n.path("a").isMissingNode()); 
     TextNode text = TextNode.valueOf("x"); 
     n.set("a", text); 
     assertEquals(1, n.size()); 
     assertTrue(n.elements().hasNext()); 
     assertTrue(n.fields().hasNext()); 
     assertTrue(n.fieldNames().hasNext()); 
     assertSame(text, n.get("a")); 
     assertSame(text, n.path("a")); 
     assertNull(n.get("b")); 
     assertNull(n.get(0)); 
     assertFalse(n.has(0)); 
     assertFalse(n.hasNonNull(0)); 
     assertTrue(n.has("a")); 
     assertTrue(n.hasNonNull("a")); 
     assertFalse(n.has("b")); 
     assertFalse(n.hasNonNull("b")); 
     ObjectNode n2 = new ObjectNode(JsonNodeFactory.instance); 
     n2.put("b", 13); 
     assertFalse(n.equals(n2)); 
     n.setAll(n2); 
     assertEquals(2, n.size()); 
     n.set("null", (JsonNode) null); 
     assertEquals(3, n.size()); 
     assertTrue(n.has("null")); 
     assertFalse(n.hasNonNull("null")); 
     n.put("null", "notReallNull"); 
     assertEquals(3, n.size()); 
     assertNotNull(n.remove("null")); 
     assertEquals(2, n.size()); 
     Map<String, JsonNode> nodes = new HashMap<String, JsonNode>(); 
     nodes.put("d", text); 
     n.setAll(nodes); 
     assertEquals(3, n.size()); 
     n.removeAll(); 
     assertEquals(0, n.size()); 
 } 


public void testInvalidWith97() throws Exception { 
     JsonNode root = MAPPER.createArrayNode(); 
     try { 
         root.with("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "not of type ObjectNode"); 
     } 
     ObjectNode root2 = MAPPER.createObjectNode(); 
     root2.put("prop", 13); 
     try { 
         root2.with("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "has value that is not"); 
     } 
 } 


public void testInvalidWithArray98() throws Exception { 
     JsonNode root = MAPPER.createArrayNode(); 
     try { 
         root.withArray("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "not of type ObjectNode"); 
     } 
     ObjectNode root2 = MAPPER.createObjectNode(); 
     root2.put("prop", 13); 
     try { 
         root2.withArray("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "has value that is not"); 
     } 
 } 


public void testRetain146() { 
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


public void testValidWith558() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals("{}", MAPPER.writeValueAsString(root)); 
     JsonNode child = root.with("prop"); 
     assertTrue(child instanceof ObjectNode); 
     assertEquals("{\"prop\":{}}", MAPPER.writeValueAsString(root)); 
 } 


public void testValidWithArray559() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals("{}", MAPPER.writeValueAsString(root)); 
     JsonNode child = root.withArray("arr"); 
     assertTrue(child instanceof ArrayNode); 
     assertEquals("{\"arr\":[]}", MAPPER.writeValueAsString(root)); 
 } 


public void testNullChecking560() { 
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


public void testRemove561() { 
     ObjectNode ob = MAPPER.createObjectNode(); 
     ob.put("a", "a"); 
     ob.put("b", "b"); 
     ob.put("c", "c"); 
     assertEquals(3, ob.size()); 
     assertSame(ob, ob.without(Arrays.asList("a", "c"))); 
     assertEquals(1, ob.size()); 
     assertEquals("b", ob.get("b").textValue()); 
 } 

    

    /**
     * Verify null handling
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    

    

    

    

    

    

    

    // [Issue#93]
    
}

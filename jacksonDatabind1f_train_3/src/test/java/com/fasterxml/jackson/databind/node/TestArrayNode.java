package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;

/**
 * Additional tests for {@link ArrayNode} container class.
 */
public class TestArrayNode
    extends BaseMapTest
{

public void testParser458() throws Exception { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     n.add(123); 
     TreeTraversingParser p = new TreeTraversingParser(n, null); 
     p.setCodec(null); 
     assertNull(p.getCodec()); 
     assertNotNull(p.getParsingContext()); 
     assertNotNull(p.getTokenLocation()); 
     assertNotNull(p.getCurrentLocation()); 
     assertNull(p.getEmbeddedObject()); 
     assertNull(p.currentNode()); 
     assertToken(JsonToken.START_ARRAY, p.nextToken()); 
     p.skipChildren(); 
     assertToken(JsonToken.END_ARRAY, p.getCurrentToken()); 
     p.close(); 
     p = new TreeTraversingParser(n, null); 
     p.nextToken(); 
     assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken()); 
     assertEquals(JsonParser.NumberType.INT, p.getNumberType()); 
     p.close(); 
 } 


public void testNullChecking460() { 
     ArrayNode a1 = JsonNodeFactory.instance.arrayNode(); 
     ArrayNode a2 = JsonNodeFactory.instance.arrayNode(); 
     a1.addAll(a2); 
     assertEquals(0, a1.size()); 
     assertEquals(0, a2.size()); 
     a2.addAll(a1); 
     assertEquals(0, a1.size()); 
     assertEquals(0, a2.size()); 
 } 


public void testBasics461() throws IOException { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     assertStandardEquals(n); 
     assertFalse(n.elements().hasNext()); 
     assertFalse(n.fieldNames().hasNext()); 
     TextNode text = TextNode.valueOf("x"); 
     n.add(text); 
     assertEquals(1, n.size()); 
     assertFalse(0 == n.hashCode()); 
     assertTrue(n.elements().hasNext()); 
     assertFalse(n.fieldNames().hasNext()); 
     assertNull(n.get("x")); 
     assertTrue(n.path("x").isMissingNode()); 
     assertSame(text, n.get(0)); 
     assertFalse(n.has("field")); 
     assertFalse(n.hasNonNull("field")); 
     assertTrue(n.has(0)); 
     assertTrue(n.hasNonNull(0)); 
     assertFalse(n.has(1)); 
     assertFalse(n.hasNonNull(1)); 
     n.add((JsonNode) null); 
     assertEquals(2, n.size()); 
     assertTrue(n.get(1).isNull()); 
     assertTrue(n.has(1)); 
     assertFalse(n.hasNonNull(1)); 
     n.set(1, text); 
     assertSame(text, n.get(1)); 
     n.set(0, null); 
     assertTrue(n.get(0).isNull()); 
     ArrayNode n2 = new ArrayNode(JsonNodeFactory.instance); 
     n2.add("foobar"); 
     assertFalse(n.equals(n2)); 
     n.addAll(n2); 
     assertEquals(3, n.size()); 
     assertFalse(n.get(0).isTextual()); 
     assertNotNull(n.remove(0)); 
     assertEquals(2, n.size()); 
     assertTrue(n.get(0).isTextual()); 
     ArrayList<JsonNode> nodes = new ArrayList<JsonNode>(); 
     nodes.add(text); 
     n.addAll(nodes); 
     assertEquals(3, n.size()); 
     assertNull(n.get(10000)); 
     assertNull(n.remove(-4)); 
     TextNode text2 = TextNode.valueOf("b"); 
     n.insert(0, text2); 
     assertEquals(4, n.size()); 
     assertSame(text2, n.get(0)); 
     assertNotNull(n.addArray()); 
     assertEquals(5, n.size()); 
     n.addPOJO("foo"); 
     assertEquals(6, n.size()); 
     JsonGenerator jg = new MappingJsonFactory().createGenerator(new StringWriter()); 
     n.serialize(jg, null); 
     n.removeAll(); 
     assertEquals(0, n.size()); 
 } 

    

    

    /**
     * Test to verify [JACKSON-227]
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    
    
    
}

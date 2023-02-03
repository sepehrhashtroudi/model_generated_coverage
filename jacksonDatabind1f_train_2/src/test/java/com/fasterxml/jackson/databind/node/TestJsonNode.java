package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Basic tests for {@link JsonNode} base class and some features
 * of implementation classes
 */
public class TestJsonNode extends NodeTestBase
{

public void testBinary86() throws Exception { 
     assertNull(BinaryNode.valueOf(null)); 
     assertNull(BinaryNode.valueOf(null, 0, 0)); 
     BinaryNode empty = BinaryNode.valueOf(new byte[1], 0, 0); 
     assertSame(BinaryNode.EMPTY_BINARY_NODE, empty); 
     assertStandardEquals(empty); 
     byte[] data = new byte[3]; 
     data[1] = (byte) 3; 
     BinaryNode n = BinaryNode.valueOf(data, 1, 1); 
     data[2] = (byte) 3; 
     BinaryNode n2 = BinaryNode.valueOf(data, 2, 1); 
     assertTrue(n.equals(n2)); 
     assertEquals("\"Aw==\"", n.toString()); 
     assertEquals("AAMD", new BinaryNode(data).asText()); 
     assertNodeNumbersForNonNumeric(n); 
 } 


public void testBoolean92() { 
     BooleanNode f = BooleanNode.getFalse(); 
     assertNotNull(f); 
     assertTrue(f.isBoolean()); 
     assertSame(f, BooleanNode.valueOf(false)); 
     assertStandardEquals(f); 
     assertFalse(f.booleanValue()); 
     assertFalse(f.asBoolean()); 
     assertEquals("false", f.asText()); 
     assertEquals(JsonToken.VALUE_FALSE, f.asToken()); 
     BooleanNode t = BooleanNode.getTrue(); 
     assertNotNull(t); 
     assertTrue(t.isBoolean()); 
     assertSame(t, BooleanNode.valueOf(true)); 
     assertStandardEquals(t); 
     assertTrue(t.booleanValue()); 
     assertTrue(t.asBoolean()); 
     assertEquals("true", t.asText()); 
     assertEquals(JsonToken.VALUE_TRUE, t.asToken()); 
     assertNodeNumbers(f, 0, 0.0); 
     assertNodeNumbers(t, 1, 1.0); 
 } 


public void testText213() { 
     assertNull(TextNode.valueOf(null)); 
     TextNode empty = TextNode.valueOf(""); 
     assertStandardEquals(empty); 
     assertSame(TextNode.EMPTY_STRING_NODE, empty); 
     assertNodeNumbers(TextNode.valueOf("-3"), -3, -3.0); 
     assertNodeNumbers(TextNode.valueOf("17.75"), 17, 17.75); 
     long value = 127353264013893L; 
     TextNode n = TextNode.valueOf(String.valueOf(value)); 
     assertEquals(value, n.asLong()); 
     assertNodeNumbersForNonNumeric(TextNode.valueOf("foobar")); 
 } 


public void testPOJO271() { 
     POJONode n = new POJONode("x"); 
     assertStandardEquals(n); 
     assertEquals(n, new POJONode("x")); 
     assertEquals("x", n.asText()); 
     assertEquals("x", n.toString()); 
     assertEquals(new POJONode(null), new POJONode(null)); 
     assertNodeNumbersForNonNumeric(n); 
     assertNodeNumbers(new POJONode(Integer.valueOf(123)), 123, 123.0); 
 } 

    

    


    

    
}

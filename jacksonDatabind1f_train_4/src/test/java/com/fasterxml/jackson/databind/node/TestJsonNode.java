package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Basic tests for {@link JsonNode} base class and some features
 * of implementation classes
 */
public class TestJsonNode extends NodeTestBase
{

public void testBoolean86() { 
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


public void testText208() { 
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

    

    


    

    
}

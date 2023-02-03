package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Basic tests for {@link JsonNode} base class and some features
 * of implementation classes
 */
public class TestJsonNode extends NodeTestBase
{

public void testBinary97() throws Exception { 
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


public void testPOJO290() { 
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

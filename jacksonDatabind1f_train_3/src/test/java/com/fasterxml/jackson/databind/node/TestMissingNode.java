package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;

public class TestMissingNode extends NodeTestBase
{

public void testMissing106() { 
     MissingNode n = MissingNode.getInstance(); 
     assertTrue(n.isMissingNode()); 
     assertEquals(JsonToken.NOT_AVAILABLE, n.asToken()); 
     assertEquals("", n.asText()); 
     assertStandardEquals(n); 
     assertEquals("", n.toString()); 
     assertNodeNumbersForNonNumeric(n); 
     assertTrue(n.asBoolean(true)); 
     assertEquals(4, n.asInt(4)); 
     assertEquals(5L, n.asLong(5)); 
     assertEquals(0.25, n.asDouble(0.25)); 
 } 

    
}

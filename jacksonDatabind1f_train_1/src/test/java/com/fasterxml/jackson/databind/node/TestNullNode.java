package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestNullNode extends NodeTestBase
{

public void testBasicsWithNullNode84() throws Exception { 
     NullNode n = NullNode.instance; 
     assertFalse(n.isContainerNode()); 
     assertFalse(n.isBigDecimal()); 
     assertFalse(n.isBigInteger()); 
     assertFalse(n.isBinary()); 
     assertFalse(n.isBoolean()); 
     assertFalse(n.isPojo()); 
     assertFalse(n.isMissingNode()); 
     assertFalse(n.booleanValue()); 
     assertNull(n.numberValue()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0L, n.longValue()); 
     assertEquals(BigDecimal.ZERO, n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals(0, n.size()); 
     assertFalse(n.elements().hasNext()); 
     assertFalse(n.fieldNames().hasNext()); 
     assertNotNull(n.path("xyz")); 
     assertTrue(n.path("xyz").isMissingNode()); 
     assertFalse(n.has("field")); 
     assertFalse(n.has(3)); 
     assertNodeNumbersForNonNumeric(n); 
 } 

    
}

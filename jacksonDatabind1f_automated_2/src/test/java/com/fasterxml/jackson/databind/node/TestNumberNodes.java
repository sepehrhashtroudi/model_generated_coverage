package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Basic tests for {@link JsonNode} implementations that
 * contain numeric values.
 */
public class TestNumberNodes extends NodeTestBase
{
public void testLong261() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     long value = 12345678L << 32; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isLong()); 
     assertType(result, LongNode.class); 
     assertFalse(result.isInt()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().longValue()); 
     assertEquals(value, result.longValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals((double) value, result.doubleValue()); 
     assertEquals(result, LongNode.valueOf(value)); 
 }
public void testLong262() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     long value = 12345678L << 32; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isLong()); 
     assertType(result, LongNode.class); 
     assertFalse(result.isInt()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().longValue()); 
     assertEquals(value, result.longValue()); 
     assertEquals(result, LongNode.valueOf(value)); 
 }
public void testDecimalNode320() throws Exception { 
     BigDecimal value = new BigDecimal("0.1"); 
     JsonNode result = DecimalNode.valueOf(value); 
     assertFalse(result.isArray()); 
     assertFalse(result.isObject()); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isLong()); 
     assertType(result, DecimalNode.class); 
     assertFalse(result.isInt()); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isBigDecimal()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue()); 
     assertEquals(value.toString(), result.asText()); 
     assertEquals(result, DecimalNode.valueOf(value)); 
 }
    
    
	

    

    

    // @since 2.2
    
    
    

    

}

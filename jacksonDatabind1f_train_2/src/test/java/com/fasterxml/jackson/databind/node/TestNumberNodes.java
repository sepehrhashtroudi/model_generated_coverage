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

public void testDouble80() { 
     DoubleNode n = DoubleNode.valueOf(0.25); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.DOUBLE, n.numberType()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0.25, n.doubleValue()); 
     assertNotNull(n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals("0.25", n.asText()); 
     assertNodeNumbers(DoubleNode.valueOf(4.5), 4, 4.5); 
     assertTrue(DoubleNode.valueOf(0).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(DoubleNode.valueOf(1L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(DoubleNode.valueOf(-1L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(0L).canConvertToLong()); 
     assertTrue(DoubleNode.valueOf(Long.MAX_VALUE).canConvertToLong()); 
     assertTrue(DoubleNode.valueOf(Long.MIN_VALUE).canConvertToLong()); 
 } 


public void testFloat337() { 
     FloatNode n = FloatNode.valueOf(0.25f); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.FLOAT, n.numberType()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0.25, n.doubleValue()); 
     assertEquals(0.25f, n.floatValue()); 
     assertNotNull(n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals("0.25", n.asText()); 
     assertNodeNumbers(FloatNode.valueOf(4.5f), 4, 4.5f); 
     assertTrue(FloatNode.valueOf(0).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(1000L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(-1000L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(0L).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToLong()); 
 } 


public void testBigIntegerNode375() throws Exception { 
     BigIntegerNode n = BigIntegerNode.valueOf(BigInteger.ONE); 
     assertStandardEquals(n); 
     assertTrue(n.equals(new BigIntegerNode(BigInteger.ONE))); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, n.asToken()); 
     assertEquals(JsonParser.NumberType.BIG_INTEGER, n.numberType()); 
     assertTrue(n.isNumber()); 
     assertTrue(n.isIntegralNumber()); 
     assertTrue(n.isBigInteger()); 
     assertEquals(BigInteger.ONE, n.numberValue()); 
     assertEquals(1, n.intValue()); 
     assertEquals(1L, n.longValue()); 
     assertEquals(BigInteger.ONE, n.bigIntegerValue()); 
     assertEquals("1", n.asText()); 
     assertNodeNumbers(n, 1, 1.0); 
     BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE); 
     n = BigIntegerNode.valueOf(maxLong); 
     assertEquals(Long.MAX_VALUE, n.longValue()); 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode n2 = mapper.readTree(maxLong.toString()); 
     assertEquals(Long.MAX_VALUE, n2.longValue()); 
     BigInteger beyondLong = maxLong.shiftLeft(2); 
     n2 = mapper.readTree(beyondLong.toString()); 
     assertEquals(beyondLong, n2.bigIntegerValue()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.ZERO).canConvertToInt()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.valueOf(Integer.MAX_VALUE)).canConvertToInt()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.valueOf(Integer.MIN_VALUE)).canConvertToInt()); 
     assertFalse(BigIntegerNode.valueOf(BigInteger.valueOf(1L + Integer.MAX_VALUE)).canConvertToInt()); 
     assertFalse(BigIntegerNode.valueOf(BigInteger.valueOf(-1L + Integer.MIN_VALUE)).canConvertToInt()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.ZERO).canConvertToLong()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.valueOf(Long.MAX_VALUE)).canConvertToLong()); 
     assertTrue(BigIntegerNode.valueOf(BigInteger.valueOf(Long.MIN_VALUE)).canConvertToLong()); 
 } 


public void testShort527() { 
     ShortNode n = ShortNode.valueOf((short) 1); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, n.asToken()); 
     assertEquals(JsonParser.NumberType.INT, n.numberType()); 
     assertEquals(1, n.intValue()); 
     assertEquals(1L, n.longValue()); 
     assertEquals(BigDecimal.ONE, n.decimalValue()); 
     assertEquals(BigInteger.ONE, n.bigIntegerValue()); 
     assertEquals("1", n.asText()); 
     assertNodeNumbers(n, 1, 1.0); 
     assertTrue(ShortNode.valueOf((short) 0).canConvertToInt()); 
     assertTrue(ShortNode.valueOf(Short.MAX_VALUE).canConvertToInt()); 
     assertTrue(ShortNode.valueOf(Short.MIN_VALUE).canConvertToInt()); 
     assertTrue(ShortNode.valueOf((short) 0).canConvertToLong()); 
     assertTrue(ShortNode.valueOf(Short.MAX_VALUE).canConvertToLong()); 
     assertTrue(ShortNode.valueOf(Short.MIN_VALUE).canConvertToLong()); 
 } 

    
    
	

    

    

    // @since 2.2
    
    
    

    

}

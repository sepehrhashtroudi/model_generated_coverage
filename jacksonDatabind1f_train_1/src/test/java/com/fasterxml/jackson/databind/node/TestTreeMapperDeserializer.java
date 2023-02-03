package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that ObjectMapper
 * can properly parse JSON and bind contents into appropriate
 * JsonNode instances.
 */
public class TestTreeMapperDeserializer
    extends BaseTest
{

public void testBoolean41() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode result = mapper.readTree("true\n"); 
     assertFalse(result.isNull()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isTextual()); 
     assertTrue(result.isBoolean()); 
     assertType(result, BooleanNode.class); 
     assertTrue(result.booleanValue()); 
     assertEquals("true", result.asText()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(result, BooleanNode.valueOf(true)); 
     assertEquals(result, BooleanNode.getTrue()); 
 } 


public void testDouble78() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     double value = 3.04; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isNull()); 
     assertType(result, DoubleNode.class); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isDouble()); 
     assertFalse(result.isInt()); 
     assertFalse(result.isLong()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.doubleValue()); 
     assertEquals(value, result.numberValue().doubleValue()); 
     assertEquals((int) value, result.intValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals(result, DoubleNode.valueOf(value)); 
 } 


public void testSimple86() throws Exception { 
     final String JSON = SAMPLE_DOC_JSON_SPEC; 
     ObjectMapper mapper = new ObjectMapper(); 
     for (int type = 0; type < 2; ++type) { 
         JsonNode result; 
         if (type == 0) { 
             result = mapper.readTree(new StringReader(JSON)); 
         } else { 
             result = mapper.readTree(JSON); 
         } 
         assertType(result, ObjectNode.class); 
         assertEquals(1, result.size()); 
         assertTrue(result.isObject()); 
         ObjectNode main = (ObjectNode) result; 
         assertEquals("Image", main.fieldNames().next()); 
         JsonNode ob = main.elements().next(); 
         assertType(ob, ObjectNode.class); 
         ObjectNode imageMap = (ObjectNode) ob; 
         assertEquals(5, imageMap.size()); 
         ob = imageMap.get("Width"); 
         assertTrue(ob.isIntegralNumber()); 
         assertFalse(ob.isFloatingPointNumber()); 
         assertEquals(SAMPLE_SPEC_VALUE_WIDTH, ob.intValue()); 
         ob = imageMap.get("Height"); 
         assertTrue(ob.isIntegralNumber()); 
         assertEquals(SAMPLE_SPEC_VALUE_HEIGHT, ob.intValue()); 
         ob = imageMap.get("Title"); 
         assertTrue(ob.isTextual()); 
         assertEquals(SAMPLE_SPEC_VALUE_TITLE, ob.textValue()); 
         ob = imageMap.get("Thumbnail"); 
         assertType(ob, ObjectNode.class); 
         ObjectNode tn = (ObjectNode) ob; 
         ob = tn.get("Url"); 
         assertTrue(ob.isTextual()); 
         assertEquals(SAMPLE_SPEC_VALUE_TN_URL, ob.textValue()); 
         ob = tn.get("Height"); 
         assertTrue(ob.isIntegralNumber()); 
         assertEquals(SAMPLE_SPEC_VALUE_TN_HEIGHT, ob.intValue()); 
         ob = tn.get("Width"); 
         assertTrue(ob.isTextual()); 
         assertEquals(SAMPLE_SPEC_VALUE_TN_WIDTH, ob.textValue()); 
         ob = imageMap.get("IDs"); 
         assertTrue(ob.isArray()); 
         ArrayNode idList = (ArrayNode) ob; 
         assertEquals(4, idList.size()); 
         assertEquals(4, calcLength(idList.elements())); 
         assertEquals(4, calcLength(idList.iterator())); 
         { 
             int[] values = new int[] { SAMPLE_SPEC_VALUE_TN_ID1, SAMPLE_SPEC_VALUE_TN_ID2, SAMPLE_SPEC_VALUE_TN_ID3, SAMPLE_SPEC_VALUE_TN_ID4 }; 
             for (int i = 0; i < values.length; ++i) { 
                 assertEquals(values[i], idList.get(i).intValue()); 
             } 
             int i = 0; 
             for (JsonNode n : idList) { 
                 assertEquals(values[i], n.intValue()); 
                 ++i; 
             } 
         } 
     } 
 } 


public void testDecimalNode87() throws Exception { 
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


public void testSimpleArray122() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ArrayNode result = mapper.createArrayNode(); 
     assertTrue(result.isArray()); 
     assertType(result, ArrayNode.class); 
     assertFalse(result.isObject()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     result.add(false); 
     result.insertNull(0); 
     assertEquals(result, result); 
     assertFalse(result.equals(null)); 
     assertEquals(NullNode.instance, result.path(0)); 
     assertEquals(NullNode.instance, result.get(0)); 
     assertEquals(BooleanNode.FALSE, result.path(1)); 
     assertEquals(BooleanNode.FALSE, result.get(1)); 
     assertEquals(2, result.size()); 
     assertNull(result.get(-1)); 
     assertNull(result.get(2)); 
     JsonNode missing = result.path(2); 
     assertTrue(missing.isMissingNode()); 
     assertTrue(result.path(-100).isMissingNode()); 
     ArrayNode array2 = mapper.createArrayNode(); 
     array2.addNull(); 
     array2.add(false); 
     assertEquals(result, array2); 
     JsonNode rm1 = array2.remove(0); 
     assertEquals(NullNode.instance, rm1); 
     assertEquals(1, array2.size()); 
     assertEquals(BooleanNode.FALSE, array2.get(0)); 
     assertFalse(result.equals(array2)); 
     JsonNode rm2 = array2.remove(0); 
     assertEquals(BooleanNode.FALSE, rm2); 
     assertEquals(0, array2.size()); 
 } 


public void testNull171() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode result = mapper.readTree("   null "); 
     assertNotNull(result); 
     assertTrue(result.isNull()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isTextual()); 
     assertEquals("null", result.asText()); 
     assertEquals(result, NullNode.instance); 
 } 


public void testEOF289() throws Exception { 
     String JSON = "{ \"key\": [ { \"a\" : { \"name\": \"foo\",  \"type\": 1\n" + "},  \"type\": 3, \"url\": \"http://www.google.com\" } ],\n" + "\"name\": \"xyz\", \"type\": 1, \"url\" : null }\n  "; 
     JsonFactory jf = new JsonFactory(); 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonParser jp = jf.createParser(new StringReader(JSON)); 
     JsonNode result = mapper.readTree(jp); 
     assertTrue(result.isObject()); 
     assertEquals(4, result.size()); 
     assertNull(mapper.readTree(jp)); 
 } 


public void testArray376() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     final String JSON = "[[[-0.027512,51.503221],[-0.008497,51.503221],[-0.008497,51.509744],[-0.027512,51.509744]]]"; 
     JsonNode n = mapper.readTree(JSON); 
     assertNotNull(n); 
     assertTrue(n.isArray()); 
     ArrayNode an = (ArrayNode) n; 
     assertEquals(1, an.size()); 
     ArrayNode an2 = (ArrayNode) n.get(0); 
     assertTrue(an2.isArray()); 
     assertEquals(4, an2.size()); 
 } 

	

    

    

    

    

    

    

    

    /**
     * Type mappers should be able to gracefully deal with end of
     * input.
     */
    

    

    /**
     * Let's also verify behavior of "MissingNode" -- one needs to be able
     * to traverse such bogus nodes with appropriate methods.
     */
    

    
    
    /*
    /**********************************************
    /* Helper methods
    /**********************************************
     */

    private int calcLength(Iterator<JsonNode> it)
    {
        int count = 0;
        while (it.hasNext()) {
            it.next();
            ++count;
        }
        return count;
    }
}


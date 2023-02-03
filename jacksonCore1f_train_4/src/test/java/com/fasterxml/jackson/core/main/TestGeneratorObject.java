package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;
import java.math.BigDecimal;

/**
 * Set of basic unit tests for verifying that the Object write methods
 * of {@link JsonGenerator} work as expected.
 */
public class TestGeneratorObject
    extends BaseTest
{

public void testInvalidObjectWrite3() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     try { 
         gen.writeEndArray(); 
         fail("Expected an exception for mismatched array/object write"); 
     } catch (JsonGenerationException e) { 
         verifyException(e, "Current context not an array"); 
     } 
     gen.close(); 
 } 


public void testConvenienceMethods39() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     final BigDecimal dec = new BigDecimal("0.1"); 
     final String TEXT = "\"some\nString!\""; 
     gen.writeNullField("null"); 
     gen.writeBooleanField("bt", true); 
     gen.writeBooleanField("bf", false); 
     gen.writeNumberField("int", -1289); 
     gen.writeNumberField("dec", dec); 
     gen.writeObjectFieldStart("ob"); 
     gen.writeStringField("str", TEXT); 
     gen.writeEndObject(); 
     gen.writeArrayFieldStart("arr"); 
     gen.writeEndArray(); 
     gen.writeEndObject(); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("null", jp.getText()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("bt", jp.getText()); 
     assertEquals(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("bf", jp.getText()); 
     assertEquals(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("int", jp.getText()); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("dec", jp.getText()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("ob", jp.getText()); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("str", jp.getText()); 
     assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertEquals(TEXT, getAndVerifyText(jp)); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("arr", jp.getText()); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     assertEquals(null, jp.nextToken()); 
     jp.close(); 
 } 


public void testSimpleObjectWrite41() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     gen.writeFieldName("first"); 
     gen.writeNumber(-901); 
     gen.writeFieldName("sec"); 
     gen.writeBoolean(false); 
     gen.writeFieldName("3rd!"); 
     gen.writeString("yee-haw"); 
     gen.writeEndObject(); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("first", jp.getText()); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(-901, jp.getIntValue()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("sec", jp.getText()); 
     assertEquals(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("3rd!", jp.getText()); 
     assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertEquals("yee-haw", jp.getText()); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     assertEquals(null, jp.nextToken()); 
     jp.close(); 
 } 


public void testConvenienceMethodsWithNulls94() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     gen.writeStringField("str", null); 
     gen.writeNumberField("num", null); 
     gen.writeObjectField("obj", null); 
     gen.writeEndObject(); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("str", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("num", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("obj", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     jp.close(); 
 } 

    

    

    

    /**
     * Methods to test functionality added for [JACKSON-26]
     */
    

    /**
     * Tests to cover [JACKSON-164]
     */
    
}

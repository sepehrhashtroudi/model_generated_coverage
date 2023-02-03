package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that the trees ObjectMapper
 * constructs can be serialized properly.
 */
public class TestTreeMapperSerializer
    extends BaseTest
{
    final static String FIELD1 = "first";
    final static String FIELD2 = "Second?";
    final static String FIELD3 = "foo'n \"bar\"";
    final static String FIELD4 = "4";

    final static String TEXT1 = "Some text & \"stuff\"";
    final static String TEXT2 = "Some more text:\twith\nlinefeeds and all!";

    final static double DOUBLE_VALUE = 9.25;


public void testNull176() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     StringWriter sw = new StringWriter(); 
     mapper.writeValue(sw, NullNode.instance); 
     assertEquals("null", sw.toString()); 
 } 


public void testFromArray218() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ArrayNode root = mapper.createArrayNode(); 
     root.add(TEXT1); 
     root.add(3); 
     ObjectNode obj = root.addObject(); 
     obj.put(FIELD1, true); 
     obj.putArray(FIELD2); 
     root.add(false); 
     for (int i = 0; i < 2; ++i) { 
         StringWriter sw = new StringWriter(); 
         if (i == 0) { 
             JsonGenerator gen = new JsonFactory().createGenerator(sw); 
             root.serialize(gen, null); 
             gen.close(); 
         } else { 
             mapper.writeValue(sw, root); 
         } 
         verifyFromArray(sw.toString()); 
     } 
     verifyFromArray(root.toString()); 
 } 


public void testBinary464() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     final int LENGTH = 13045; 
     byte[] data = new byte[LENGTH]; 
     for (int i = 0; i < LENGTH; ++i) { 
         data[i] = (byte) i; 
     } 
     StringWriter sw = new StringWriter(); 
     mapper.writeValue(sw, BinaryNode.valueOf(data)); 
     JsonParser jp = new JsonFactory().createParser(sw.toString()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertArrayEquals(data, jp.getBinaryValue()); 
     jp.close(); 
 } 

    

    

    /**
     * Unit test to check for regression of [JACKSON-18].
     */
    

    

    

    /*
    ///////////////////////////////////////////////////////////////
    // Internal methods
    ///////////////////////////////////////////////////////////////
     */

    private void verifyFromArray(String input)
        throws Exception
    {
        JsonParser jp = new JsonFactory().createParser(new StringReader(input));
        
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals(TEXT1, getAndVerifyText(jp));
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(3, jp.getIntValue());
        
        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD1, getAndVerifyText(jp));
        
        assertEquals(JsonToken.VALUE_TRUE, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD2, getAndVerifyText(jp));
        
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_OBJECT, jp.nextToken());
        
        assertEquals(JsonToken.VALUE_FALSE, jp.nextToken());
        
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        assertNull(jp.nextToken());
    }

    private void verifyFromMap(String input)
        throws Exception
    {
        JsonParser jp = new JsonFactory().createParser(new StringReader(input));
        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD4, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals(TEXT2, getAndVerifyText(jp));
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD3, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(-1, jp.getIntValue());
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD2, getAndVerifyText(jp));
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD1, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(DOUBLE_VALUE, jp.getDoubleValue(), 0);
        
        assertEquals(JsonToken.END_OBJECT, jp.nextToken());
        
        assertNull(jp.nextToken());
    }
}

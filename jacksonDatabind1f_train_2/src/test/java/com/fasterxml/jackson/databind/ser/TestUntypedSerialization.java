package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This unit test suite tries verify simplest aspects of
 * "Native" java type mapper; basically that is can properly serialize
 * core JDK objects to JSON.
 */
public class TestUntypedSerialization
    extends BaseMapTest
{

public void testFromArray195() throws Exception { 
     ArrayList<Object> doc = new ArrayList<Object>(); 
     doc.add("Elem1"); 
     doc.add(Integer.valueOf(3)); 
     Map<String, Object> struct = new LinkedHashMap<String, Object>(); 
     struct.put("first", Boolean.TRUE); 
     struct.put("Second", new ArrayList<Object>()); 
     doc.add(struct); 
     doc.add(Boolean.FALSE); 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonFactory f = new JsonFactory(); 
     for (int i = 0; i < 3; ++i) { 
         String str = mapper.writeValueAsString(doc); 
         JsonParser jp = f.createParser(str); 
         assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
         assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals("Elem1", getAndVerifyText(jp)); 
         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(3, jp.getIntValue()); 
         assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals("first", getAndVerifyText(jp)); 
         assertEquals(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals("Second", getAndVerifyText(jp)); 
         if (jp.nextToken() != JsonToken.START_ARRAY) { 
             fail("Expected START_ARRAY: JSON == '" + str + "'"); 
         } 
         assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
         assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
         assertEquals(JsonToken.VALUE_FALSE, jp.nextToken()); 
         assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
         assertNull(jp.nextToken()); 
     } 
 } 

    

    
}

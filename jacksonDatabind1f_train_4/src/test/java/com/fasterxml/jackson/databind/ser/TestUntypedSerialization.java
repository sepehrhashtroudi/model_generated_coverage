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

public void testFromMap546() throws Exception { 
     LinkedHashMap<String, Object> doc = new LinkedHashMap<String, Object>(); 
     JsonFactory f = new JsonFactory(); 
     doc.put("a1", "\"text\""); 
     doc.put("int", Integer.valueOf(137)); 
     doc.put("foo bar", Long.valueOf(1234567890L)); 
     ObjectMapper mapper = new ObjectMapper(); 
     for (int i = 0; i < 3; ++i) { 
         String str = mapper.writeValueAsString(doc); 
         JsonParser jp = f.createParser(str); 
         assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals("a1", getAndVerifyText(jp)); 
         assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals("\"text\"", getAndVerifyText(jp)); 
         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals("int", getAndVerifyText(jp)); 
         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(137, jp.getIntValue()); 
         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals("foo bar", getAndVerifyText(jp)); 
         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1234567890L, jp.getLongValue()); 
         assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
         assertNull(jp.nextToken()); 
     } 
 } 

    

    
}

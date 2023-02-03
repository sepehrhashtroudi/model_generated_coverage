package com.fasterxml.jackson.databind.ser;

import java.io.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

public class TestArraySerialization
    extends BaseTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testStringArray205() throws Exception { 
     StringWriter sw = new StringWriter(); 
     MAPPER.writeValue(sw, new String[] { "a", "\"foo\"", null }); 
     assertEquals("[\"a\",\"\\\"foo\\\"\",null]", sw.toString().trim()); 
 } 


public void testBigIntArray571() throws Exception { 
     final int SIZE = 99999; 
     int[] ints = new int[SIZE]; 
     for (int i = 0; i < ints.length; ++i) { 
         ints[i] = i; 
     } 
     JsonFactory f = MAPPER.getFactory(); 
     for (int round = 0; round < 3; ++round) { 
         byte[] data = MAPPER.writeValueAsBytes(ints); 
         JsonParser jp = f.createParser(data); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         for (int i = 0; i < SIZE; ++i) { 
             assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
             assertEquals(i, jp.getIntValue()); 
         } 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     } 
 } 

    
    
    

    
    
    

    

    

    
}

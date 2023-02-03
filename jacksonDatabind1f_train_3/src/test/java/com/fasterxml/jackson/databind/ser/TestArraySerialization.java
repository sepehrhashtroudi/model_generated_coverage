package com.fasterxml.jackson.databind.ser;

import java.io.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

public class TestArraySerialization
    extends BaseTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testStringArray217() throws Exception { 
     StringWriter sw = new StringWriter(); 
     MAPPER.writeValue(sw, new String[] { "a", "\"foo\"", null }); 
     assertEquals("[\"a\",\"\\\"foo\\\"\",null]", sw.toString().trim()); 
 } 


public void testFloatArray571() throws Exception { 
     StringWriter sw = new StringWriter(); 
     MAPPER.writeValue(sw, new float[] { 1.01f, 2.0f, -7f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY }); 
     assertEquals("[1.01,2.0,-7.0,\"NaN\",\"-Infinity\",\"Infinity\"]", sw.toString().trim()); 
 } 

    
    
    

    
    
    

    

    

    
}

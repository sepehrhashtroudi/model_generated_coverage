package com.fasterxml.jackson.databind.convert;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.*;

public class TestStringConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();


public void testBytestoCharArray153() throws Exception { 
     byte[] input = new byte[] { 1, 2, 3, 4, 5, 6, 7 }; 
     char[] expEncoded = MAPPER.convertValue(input, String.class).toCharArray(); 
     char[] actEncoded = MAPPER.convertValue(input, char[].class); 
     assertArrayEquals(expEncoded, actEncoded); 
 } 


public void testBytesToBase64AndBack263() throws Exception { 
     byte[] input = new byte[] { 1, 2, 3, 4, 5, 6, 7 }; 
     String encoded = MAPPER.convertValue(input, String.class); 
     assertNotNull(encoded); 
     byte[] result = MAPPER.convertValue(encoded, byte[].class); 
     assertArrayEquals(input, result); 
 } 


public void testStringsToInts322() { 
     assertArrayEquals(new int[] { 1, 2, 3, 4, -1, 0 }, MAPPER.convertValue("1  2 3    4  -1 0".split("\\s+"), int[].class)); 
 } 

    

    

    
    
    
}

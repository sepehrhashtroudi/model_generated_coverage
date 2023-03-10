package com.fasterxml.jackson.databind.convert;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.*;

public class TestStringConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();


public void testSimple231() { 
     assertEquals(Boolean.TRUE, MAPPER.convertValue("true", Boolean.class)); 
     assertEquals(Integer.valueOf(-3), MAPPER.convertValue("  -3 ", Integer.class)); 
     assertEquals(Long.valueOf(77), MAPPER.convertValue("77", Long.class)); 
     int[] ints = { 1, 2, 3 }; 
     List<Integer> Ints = new ArrayList<Integer>(); 
     Ints.add(1); 
     Ints.add(2); 
     Ints.add(3); 
     assertArrayEquals(ints, MAPPER.convertValue(Ints, int[].class)); 
 } 


public void testBytesToBase64AndBack281() throws Exception { 
     byte[] input = new byte[] { 1, 2, 3, 4, 5, 6, 7 }; 
     String encoded = MAPPER.convertValue(input, String.class); 
     assertNotNull(encoded); 
     byte[] result = MAPPER.convertValue(encoded, byte[].class); 
     assertArrayEquals(input, result); 
 } 


public void testStringsToInts336() { 
     assertArrayEquals(new int[] { 1, 2, 3, 4, -1, 0 }, MAPPER.convertValue("1  2 3    4  -1 0".split("\\s+"), int[].class)); 
 } 

    

    

    
    
    
}

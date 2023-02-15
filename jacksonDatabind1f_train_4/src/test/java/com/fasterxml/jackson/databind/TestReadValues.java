package com.fasterxml.jackson.databind;

import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestReadValues extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class Bean {
        public int a;
    }
    
    /*
    /**********************************************************
    /* Unit tests; root-level value sequences via Mapper
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testNonRootArraysUsingParser48() throws Exception { 
     final String JSON = "[[1],[3]]"; 
     JsonParser jp = MAPPER.getFactory().createParser(JSON); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     Iterator<int[]> it = MAPPER.readValues(jp, int[].class); 
     assertTrue(it.hasNext()); 
     int[] array = it.next(); 
     assertEquals(1, array.length); 
     assertEquals(1, array[0]); 
     assertTrue(it.hasNext()); 
     array = it.next(); 
     assertEquals(1, array.length); 
     assertEquals(3, array[0]); 
     assertFalse(it.hasNext()); 
     jp.close(); 
 } 


public void testRootArraysWithParser444() throws Exception { 
     final String JSON = "[1][3]"; 
     JsonParser jp = MAPPER.getFactory().createParser(JSON); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     Iterator<int[]> it = MAPPER.reader(int[].class).readValues(jp); 
     assertTrue(it.hasNext()); 
     int[] array = it.next(); 
     assertEquals(1, array.length); 
     assertEquals(1, array[0]); 
     assertTrue(it.hasNext()); 
     array = it.next(); 
     assertEquals(1, array.length); 
     assertEquals(3, array[0]); 
     assertFalse(it.hasNext()); 
 } 


public void testHasNextWithEndArrayManagedParser454() throws Exception { 
     final String JSON = "[1,3]"; 
     Iterator<Integer> it = MAPPER.reader(Integer.class).readValues(JSON); 
     assertTrue(it.hasNext()); 
     int value = it.next(); 
     assertEquals(1, value); 
     assertTrue(it.hasNext()); 
     value = it.next(); 
     assertEquals(3, value); 
     assertFalse(it.hasNext()); 
     assertFalse(it.hasNext()); 
 } 

    

    

    /*
    /**********************************************************
    /* Unit tests; root-level value sequences via JsonParser
    /**********************************************************
     */

    

    
    
    
    
    
    
    /*
    /**********************************************************
    /* Unit tests; non-root arrays
    /**********************************************************
     */

    

    

    
    
    
}

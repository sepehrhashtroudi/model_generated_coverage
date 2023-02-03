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
    

public void testNonRootArraysUsingParser56() throws Exception { 
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


public void testNonRootMapsWithObjectReader239() throws Exception { 
     String JSON = "[{ \"hi\": \"ho\", \"neighbor\": \"Joe\" },\n" + "{\"boy\": \"howdy\", \"huh\": \"what\"}]"; 
     final MappingIterator<Map<String, Object>> iterator = MAPPER.reader().withType(new TypeReference<Map<String, Object>>() { 
     }).readValues(JSON); 
     Map<String, Object> map; 
     assertTrue(iterator.hasNext()); 
     map = iterator.nextValue(); 
     assertEquals(2, map.size()); 
     assertTrue(iterator.hasNext()); 
     map = iterator.nextValue(); 
     assertEquals(2, map.size()); 
     assertFalse(iterator.hasNext()); 
 } 


public void testRootBeans466() throws Exception { 
     final String JSON = "{\"a\":3}{\"a\":27}  "; 
     Iterator<Bean> it = MAPPER.reader(Bean.class).readValues(JSON); 
     assertNotNull(((MappingIterator<?>) it).getCurrentLocation()); 
     assertTrue(it.hasNext()); 
     Bean b = it.next(); 
     assertEquals(3, b.a); 
     assertTrue(it.hasNext()); 
     b = it.next(); 
     assertEquals(27, b.a); 
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

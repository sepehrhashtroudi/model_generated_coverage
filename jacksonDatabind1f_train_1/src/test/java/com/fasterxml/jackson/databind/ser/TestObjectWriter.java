package com.fasterxml.jackson.databind.ser;

import java.util.*;


import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for checking features added to {@link ObjectWriter}, such
 * as adding of explicit pretty printer.
 */
public class TestObjectWriter
    extends BaseMapTest
{

public void testPrettyPrinter442() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectWriter writer = mapper.writer(); 
     HashMap<String, Integer> data = new HashMap<String, Integer>(); 
     data.put("a", 1); 
     assertEquals("{\"a\":1}", writer.writeValueAsString(data)); 
     writer = writer.withDefaultPrettyPrinter(); 
     String lf = System.getProperty("line.separator"); 
     assertEquals("{" + lf + "  \"a\" : 1" + lf + "}", writer.writeValueAsString(data)); 
     writer = writer.with((PrettyPrinter) null); 
     assertEquals("{\"a\":1}", writer.writeValueAsString(data)); 
 } 


public void testPrefetch443() throws Exception { 
     ObjectWriter writer = objectWriter(); 
     assertFalse(writer.hasPrefetchedSerializer()); 
     writer = objectWriter().withType(String.class); 
     assertTrue(writer.hasPrefetchedSerializer()); 
 } 

    

    
} 

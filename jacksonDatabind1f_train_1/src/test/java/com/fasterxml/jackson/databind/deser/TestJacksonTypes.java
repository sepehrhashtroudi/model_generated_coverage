package com.fasterxml.jackson.databind.deser;

import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for those Jackson types we want to ensure can be deserialized.
 */
public class TestJacksonTypes
    extends com.fasterxml.jackson.databind.BaseMapTest
{

public void testJavaType151() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     String json = mapper.writeValueAsString(tf.constructType(String.class)); 
     assertEquals(quote(java.lang.String.class.getName()), json); 
     JavaType t = mapper.readValue(json, JavaType.class); 
     assertNotNull(t); 
     assertEquals(String.class, t.getRawClass()); 
 } 


public void testJsonLocation312() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonLocation loc = new JsonLocation("whatever", -1, -1, 100, 13); 
     String ser = serializeAsString(m, loc); 
     JsonLocation result = m.readValue(ser, JsonLocation.class); 
     assertNotNull(result); 
     assertEquals(loc.getSourceRef(), result.getSourceRef()); 
     assertEquals(loc.getByteOffset(), result.getByteOffset()); 
     assertEquals(loc.getCharOffset(), result.getCharOffset()); 
     assertEquals(loc.getColumnNr(), result.getColumnNr()); 
     assertEquals(loc.getLineNr(), result.getLineNr()); 
 } 

    

    // doesn't really belong here but...
    

    /**
     * Verify that {@link TokenBuffer} can be properly deserialized
     * automatically, using the "standard" JSON sample document
     */
    

    

    
}

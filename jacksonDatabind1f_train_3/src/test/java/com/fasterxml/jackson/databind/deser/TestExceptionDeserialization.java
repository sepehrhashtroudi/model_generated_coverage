package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that simple exceptions can be deserialized.
 */
public class TestExceptionDeserialization
    extends BaseMapTest
{
    @SuppressWarnings("serial")
    static class MyException extends Exception
    {
        protected int value;

        protected String myMessage;
        protected HashMap<String,Object> stuff = new HashMap<String, Object>();
        
        @JsonCreator
        MyException(@JsonProperty("message") String msg, @JsonProperty("value") int v)
        {
            super(msg);
            myMessage = msg;
            value = v;
        }

        public int getValue() { return value; }
        
        public String getFoo() { return "bar"; }

        @JsonAnySetter public void setter(String key, Object value)
        {
            stuff.put(key, value);
        }
    }

    @SuppressWarnings("serial")
    static class MyNoArgException extends Exception
    {
        @JsonCreator MyNoArgException() { }
    }
    
    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    final ObjectMapper MAPPER = new ObjectMapper();
    

public void testWithCreator35() throws IOException { 
     final String MSG = "the message"; 
     String json = MAPPER.writeValueAsString(new MyException(MSG, 3)); 
     MyException result = MAPPER.readValue(json, MyException.class); 
     assertEquals(MSG, result.getMessage()); 
     assertEquals(3, result.value); 
     assertEquals(1, result.stuff.size()); 
     assertEquals(result.getFoo(), result.stuff.get("foo")); 
 } 


public void testIOException186() throws IOException { 
     IOException ioe = new IOException("TEST"); 
     String json = MAPPER.writeValueAsString(ioe); 
     IOException result = MAPPER.readValue(json, IOException.class); 
     assertEquals(ioe.getMessage(), result.getMessage()); 
 } 


public void testNoArgsException187() throws IOException { 
     MyNoArgException exc = MAPPER.readValue("{}", MyNoArgException.class); 
     assertNotNull(exc); 
 } 

    

    // As per [JACKSON-377]
    

    // [JACKSON-388]
    

    

    // [JACKSON-794]: try simulating JDK 7 behavior
    
}

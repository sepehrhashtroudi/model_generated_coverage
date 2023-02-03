package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that ObjectMapper
 * can properly parse JSON and bind contents into appropriate
 * JsonNode instances.
 */
public class TestTreeMapperDeserializer
    extends BaseTest
{
public void testNullChecking290() { 
     ObjectNode o1 = JsonNodeFactory.instance.objectNode(); 
     ObjectNode o2 = JsonNodeFactory.instance.objectNode(); 
     o1.setAll(o2); 
     assertEquals(0, o1.size()); 
     assertEquals(0, o2.size()); 
     o1.set("x", null); 
     JsonNode n = o1.get("x"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("str", (String) null); 
     n = o1.get("str"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("d", (BigDecimal) null); 
     n = o1.get("d"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
 }
	

    

    

    

    

    

    

    

    /**
     * Type mappers should be able to gracefully deal with end of
     * input.
     */
    

    

    /**
     * Let's also verify behavior of "MissingNode" -- one needs to be able
     * to traverse such bogus nodes with appropriate methods.
     */
    

    
    
    /*
    /**********************************************
    /* Helper methods
    /**********************************************
     */

    private int calcLength(Iterator<JsonNode> it)
    {
        int count = 0;
        while (it.hasNext()) {
            it.next();
            ++count;
        }
        return count;
    }
}


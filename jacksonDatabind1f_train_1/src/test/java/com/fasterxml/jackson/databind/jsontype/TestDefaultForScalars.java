package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import static org.junit.Assert.*;


import com.fasterxml.jackson.databind.*;

/**
 * Unit tests to verify that Java/JSON scalar values (non-structured values)
 * are handled properly with respect to additional type information.
 * 
 * @since 1.5
 * @author tatu
 */
public class TestDefaultForScalars
    extends BaseMapTest
{
    static class Jackson417Bean {
        public String foo = "bar";
        public java.io.Serializable bar = new Integer(13);
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * Unit test to verify that limited number of core types do NOT include
     * type information, even if declared as Object. This is only done for types
     * that JSON scalar values natively map to: String, Integer and Boolean (and
     * nulls never have type information)
     */

public void testDateScalars308() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     long ts = 12345678L; 
     assertEquals("[[\"java.util.Date\"," + ts + "]]", m.writeValueAsString(new Object[] { new Date(ts) })); 
     Calendar c = Calendar.getInstance(); 
     c.setTimeInMillis(ts); 
     String json = m.writeValueAsString(new Object[] { c }); 
     assertEquals("[[\"" + c.getClass().getName() + "\"," + ts + "]]", json); 
     Object[] result = m.readValue(json, Object[].class); 
     assertEquals(1, result.length); 
     assertTrue(result[0] instanceof Calendar); 
     assertEquals(ts, ((Calendar) result[0]).getTimeInMillis()); 
 } 


public void testScalarArrays524() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT); 
     Object[] input = new Object[] { "abc", new Date(1234567), null, Integer.valueOf(456) }; 
     String json = m.writeValueAsString(input); 
     assertEquals("[\"abc\",[\"java.util.Date\",1234567],null,456]", json); 
     Object[] output = m.readValue(json, Object[].class); 
     assertArrayEquals(input, output); 
 } 

    

    

    

    /**
     * Test for verifying that contents of "untyped" homogenous arrays are properly
     * handled,
     */
    

    /**
     * Loosely scalar; for [JACKSON-417]
     */
    
}

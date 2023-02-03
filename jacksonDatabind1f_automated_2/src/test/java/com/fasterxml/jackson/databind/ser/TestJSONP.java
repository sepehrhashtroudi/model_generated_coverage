package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class TestJSONP
    extends BaseMapTest
{
    static class Base {
        public String a;
    }
    static class Impl extends Base {
        public String b;

        public Impl(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }
    
public void testSimpleScalars295() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals("callback(\"abc\")", serializeAsString(m, new JSONPObject("callback", "abc"))); 
     assertEquals("calc(123)", serializeAsString(m, new JSONPObject("calc", Integer.valueOf(123)))); 
     assertEquals("dummy(null)", serializeAsString(m, new JSONPObject("dummy", null))); 
 }
    

    
    
    /**
     * Test to ensure that it is possible to force a static type for wrapped
     * value.
     */
    
}

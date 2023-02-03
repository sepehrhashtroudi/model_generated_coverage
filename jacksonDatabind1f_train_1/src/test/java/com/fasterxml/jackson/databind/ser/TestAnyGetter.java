package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class TestAnyGetter
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class Bean
    {
        final static Map<String,Boolean> extra = new HashMap<String,Boolean>();
        static {
            extra.put("a", Boolean.TRUE);
        }
        
        public int getX() { return 3; }

        @JsonAnyGetter
        public Map<String,Boolean> getExtra() { return extra; }
    }

    static class AnyOnlyBean
    {
        @JsonAnyGetter
        public Map<String,Integer> any() {
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            map.put("a", 3);
            return map;
        }
    }

    /*
    /**********************************************************
    /* Test cases
    /**********************************************************
     */


public void testAnyOnly335() throws Exception { 
     ObjectMapper m; 
     m = new ObjectMapper(); 
     m.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true); 
     String json = serializeAsString(m, new AnyOnlyBean()); 
     assertEquals("{\"a\":3}", json); 
     m = new ObjectMapper(); 
     m.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); 
     json = serializeAsString(m, new AnyOnlyBean()); 
     assertEquals("{\"a\":3}", json); 
 } 

    

    // [JACKSON-392]
    
}

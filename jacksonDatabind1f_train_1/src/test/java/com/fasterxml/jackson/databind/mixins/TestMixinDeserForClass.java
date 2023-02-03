package com.fasterxml.jackson.databind.mixins;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import com.fasterxml.jackson.databind.*;

public class TestMixinDeserForClass
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class BaseClass
    {
        /* property that is always found; but has lower priority than
         * setter method if both found
         */
        @JsonProperty
        public String a;

        // setter that may or may not be auto-detected
        public void setA(String v) { a = "XXX"+v; }
    }

    @JsonAutoDetect(setterVisibility=Visibility.ANY, fieldVisibility=Visibility.ANY)
    static class LeafClass
        extends BaseClass { }

    @JsonAutoDetect(setterVisibility=Visibility.NONE, fieldVisibility=Visibility.NONE)
    interface MixIn { }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testClassMixInsTopLevel28() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     LeafClass result = m.readValue("{\"a\":\"value\"}", LeafClass.class); 
     assertEquals("XXXvalue", result.a); 
     m = new ObjectMapper(); 
     m.addMixInAnnotations(LeafClass.class, MixIn.class); 
     result = m.readValue("{\"a\":\"value\"}", LeafClass.class); 
     assertEquals("value", result.a); 
 } 


public void testClassMixInsForObjectClass403() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     m.addMixInAnnotations(Object.class, MixIn.class); 
     { 
         BaseClass result = m.readValue("{\"a\":\"\"}", BaseClass.class); 
         assertEquals("", result.a); 
     } 
     { 
         LeafClass result = m.readValue("{\"a\":\"\"}", LeafClass.class); 
         assertEquals("XXX", result.a); 
     } 
 } 

    

    /* and then a test for mid-level mixin; should have no effect
     * when deserializing leaf (but will if deserializing base class)
     */
    

    /* Also: when mix-in attached to Object.class, will work, if
     * visible (similar to mid-level, basically)
     */
    
}

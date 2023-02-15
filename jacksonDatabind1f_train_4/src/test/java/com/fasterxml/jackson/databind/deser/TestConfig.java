package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;

/**
 * Unit tests for checking handling of DeserializationConfig.
 */
public class TestConfig
    extends BaseMapTest
{
    @JsonAutoDetect(setterVisibility=Visibility.NONE)
    final static class Dummy { }

    final static class EmptyDummy { }

    static class AnnoBean {
        int value = 3;
        
        @JsonProperty("y")
            public void setX(int v) { value = v; }
    }

    enum Alpha { A, B, C; }

    public static class SimpleBean {
        public int x, y;
    }
    
    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    /* Test to verify that we don't overflow number of features; if we
     * hit the limit, need to change implementation -- this test just
     * gives low-water mark
     */

public void testOverrideIntrospectors139() { 
     ObjectMapper m = new ObjectMapper(); 
     DeserializationConfig cfg = m.getDeserializationConfig(); 
     cfg = cfg.with((ClassIntrospector) null); 
     cfg = cfg.with((AnnotationIntrospector) null); 
     assertNull(cfg.getAnnotationIntrospector()); 
 } 


public void testEnumsWhenDisabled149() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals(Alpha.B, m.readValue(quote("B"), Alpha.class)); 
     m = new ObjectMapper(); 
     m.configure(MapperFeature.USE_ANNOTATIONS, false); 
     assertEquals(Alpha.B, m.readValue(quote("B"), Alpha.class)); 
 } 


public void testAnnotationsDisabled576() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertTrue(m.getDeserializationConfig().isEnabled(MapperFeature.USE_ANNOTATIONS)); 
     AnnoBean bean = m.readValue("{ \"y\" : 0 }", AnnoBean.class); 
     assertEquals(0, bean.value); 
     m = new ObjectMapper(); 
     m.configure(MapperFeature.USE_ANNOTATIONS, false); 
     bean = m.readValue("{ \"x\" : 0 }", AnnoBean.class); 
     assertEquals(0, bean.value); 
 } 

    
    
    

    
        
    

    // [JACKSON-875]
    

    
}

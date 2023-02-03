package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerator;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * Unit tests for checking whether JsonSerializerFactory.Feature
 * configuration works
 */
public class TestFeatures
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    /**
     * Class with one explicitly defined getter, one name-based
     * auto-detectable getter.
     */
    static class GetterClass
    {
        @JsonProperty("x") public int getX() { return -2; }
        public int getY() { return 1; }
    }

    /**
     * Another test-class that explicitly disables auto-detection
     */
    @JsonAutoDetect(getterVisibility=Visibility.NONE)
    static class DisabledGetterClass
    {
        @JsonProperty("x") public int getX() { return -2; }
        public int getY() { return 1; }
    }

    /**
     * Another test-class that explicitly enables auto-detection
     */
    @JsonAutoDetect(isGetterVisibility=Visibility.NONE)
    static class EnabledGetterClass
    {
        @JsonProperty("x") public int getX() { return -2; }
        public int getY() { return 1; }

        // not auto-detected, since "is getter" auto-detect disabled
        public boolean isOk() { return true; }
    }

    /**
     * One more: only detect "isXxx", not "getXXX"
     */
    @JsonAutoDetect(getterVisibility=Visibility.NONE)
    static class EnabledIsGetterClass
    {
        // Won't be auto-detected any more
        public int getY() { return 1; }

        // but this will be
        public boolean isOk() { return true; }
    }

    static class CloseableBean implements Closeable
    {
        public int a = 3;

        protected boolean wasClosed = false;

        @Override
        public void close() throws IOException {
            wasClosed = true;
        }
    }

    private static class StringListBean {
        @SuppressWarnings("unused")
        public Collection<String> values;
        
        public StringListBean(Collection<String> v) { values = v; }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */


public void testGlobalAutoDetection351() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     Map<String, Object> result = writeAndMap(m, new GetterClass()); 
     assertEquals(2, result.size()); 
     assertEquals(Integer.valueOf(-2), result.get("x")); 
     assertEquals(Integer.valueOf(1), result.get("y")); 
     m = new ObjectMapper(); 
     m.configure(MapperFeature.AUTO_DETECT_GETTERS, false); 
     result = writeAndMap(m, new GetterClass()); 
     assertEquals(1, result.size()); 
     assertTrue(result.containsKey("x")); 
 } 


public void testFlushingNotAutomatic456() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.FLUSH_AFTER_WRITE_VALUE, false); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jgen = mapper.getFactory().createGenerator(sw); 
     mapper.writeValue(jgen, Integer.valueOf(13)); 
     assertEquals("", sw.toString()); 
     jgen.flush(); 
     assertEquals("13", sw.toString()); 
     jgen.close(); 
     sw = new StringWriter(); 
     jgen = mapper.getFactory().createGenerator(sw); 
     ObjectWriter ow = mapper.writer(); 
     ow.writeValue(jgen, Integer.valueOf(99)); 
     assertEquals("", sw.toString()); 
     jgen.flush(); 
     assertEquals("99", sw.toString()); 
     jgen.close(); 
 } 


public void testFlushingAutomatic457() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertTrue(mapper.getSerializationConfig().isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jgen = mapper.getFactory().createGenerator(sw); 
     mapper.writeValue(jgen, Integer.valueOf(13)); 
     assertEquals("13", sw.toString()); 
     jgen.close(); 
     sw = new StringWriter(); 
     jgen = mapper.getFactory().createGenerator(sw); 
     ObjectWriter ow = mapper.writer(); 
     ow.writeValue(jgen, Integer.valueOf(99)); 
     assertEquals("99", sw.toString()); 
     jgen.close(); 
 } 


public void testCharArrays570() throws IOException { 
     char[] chars = new char[] { 'a', 'b', 'c' }; 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals(quote("abc"), m.writeValueAsString(chars)); 
     m.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true); 
     assertEquals("[\"a\",\"b\",\"c\"]", m.writeValueAsString(chars)); 
 } 

    

    

    

    // Simple test verifying that chainable methods work ok...
    

    // Test for [JACKSON-282]
    

    // Test for [JACKSON-289]
    

    // Test for [JACKSON-401]
    

    // Test for [JACKSON-401]
    

    // Test for [JACKSON-805]
    
}

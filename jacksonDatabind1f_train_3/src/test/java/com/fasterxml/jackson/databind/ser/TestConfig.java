package com.fasterxml.jackson.databind.ser;

import java.io.StringWriter;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;

/**
 * Unit tests for checking handling of SerializationConfig.
 */
public class TestConfig
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT,
                   typing=JsonSerialize.Typing.STATIC)
    final static class Config { }

    final static class ConfigNone { }

    static class AnnoBean {
        public int getX() { return 1; }
        @JsonProperty("y")
        private int getY() { return 2; }
    }

    static class Indentable {
        public int a = 3;
    }

    public static class SimpleBean {
        public int x = 1;
    }
    
    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    final static ObjectMapper MAPPER = new ObjectMapper();

    /* Test to verify that we don't overflow number of features; if we
     * hit the limit, need to change implementation -- this test just
     * gives low-water mark
     */

public void testNoAccessOverrides305() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS); 
     assertEquals("{\"x\":1}", m.writeValueAsString(new SimpleBean())); 
 } 


public void testIndentWithPassedGenerator308() throws Exception { 
     Indentable input = new Indentable(); 
     assertEquals("{\"a\":3}", MAPPER.writeValueAsString(input)); 
     String LF = getLF(); 
     String INDENTED = "{" + LF + "  \"a\" : 3" + LF + "}"; 
     final ObjectWriter indentWriter = MAPPER.writer().with(SerializationFeature.INDENT_OUTPUT); 
     assertEquals(INDENTED, indentWriter.writeValueAsString(input)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jgen = MAPPER.getFactory().createGenerator(sw); 
     indentWriter.writeValue(jgen, input); 
     jgen.close(); 
     assertEquals(INDENTED, sw.toString()); 
     sw = new StringWriter(); 
     ObjectMapper m2 = new ObjectMapper(); 
     m2.enable(SerializationFeature.INDENT_OUTPUT); 
     jgen = m2.getFactory().createGenerator(sw); 
     m2.writeValue(jgen, input); 
     jgen.close(); 
     assertEquals(INDENTED, sw.toString()); 
 } 


public void testOverrideIntrospectors347() { 
     SerializationConfig cfg = MAPPER.getSerializationConfig(); 
     cfg = cfg.with((ClassIntrospector) null); 
     cfg = cfg.with((AnnotationIntrospector) null); 
     assertNull(cfg.getAnnotationIntrospector()); 
 } 


public void testAnnotationsDisabled350() throws Exception { 
     assertTrue(MAPPER.isEnabled(MapperFeature.USE_ANNOTATIONS)); 
     Map<String, Object> result = writeAndMap(MAPPER, new AnnoBean()); 
     assertEquals(2, result.size()); 
     ObjectMapper m2 = new ObjectMapper(); 
     m2.configure(MapperFeature.USE_ANNOTATIONS, false); 
     result = writeAndMap(m2, new AnnoBean()); 
     assertEquals(1, result.size()); 
 } 


public void testMisc352() { 
     ObjectMapper m = new ObjectMapper(); 
     m.setDateFormat(null); 
     assertNotNull(m.getSerializationConfig().toString()); 
 } 


public void testIndentation455() throws Exception { 
     Map<String, Integer> map = new HashMap<String, Integer>(); 
     map.put("a", Integer.valueOf(2)); 
     String result = MAPPER.writer().with(SerializationFeature.INDENT_OUTPUT).writeValueAsString(map); 
     String lf = getLF(); 
     assertEquals("{" + lf + "  \"a\" : 2" + lf + "}", result); 
 } 

    
    
    

    

    

    

    

    /**
     * Test for verifying working of [JACKSON-191]
     */
    

    // Test for [Issue#12]
    

    
    
    private final static String getLF() {
        return System.getProperty("line.separator");
    }
}

package com.fasterxml.jackson.databind.views;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying JSON view functionality: ability to declaratively
 * suppress subset of properties from being serialized.
 */
public class TestViewSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    // Classes that represent views
    static class ViewA { }
    static class ViewAA extends ViewA { }
    static class ViewB { }
    static class ViewBB extends ViewB { }
    
    static class Bean
    {
        @JsonView(ViewA.class)
        public String a = "1";

        @JsonView({ViewAA.class, ViewB.class})
        public String aa = "2";

        @JsonView(ViewB.class)
        public String getB() { return "3"; }
    }

    /**
     * Bean with mix of explicitly annotated
     * properties, and implicit ones that may or may
     * not be included in views.
     */
    static class MixedBean
    {
        @JsonView(ViewA.class)
        public String a = "1";

        public String getB() { return "2"; }
    }

    /**
     * As indicated by [JACKSON-261], @JsonView should imply
     * that associated element (method, field) is to be considered
     * a property
     */
    static class ImplicitBean {
        @JsonView(ViewA.class)
        private int a = 1;
    }

    static class VisibilityBean {
        @JsonProperty protected String id = "id";
    
        @JsonView(ViewA.class)
        public String value = "x";
    }   

    // [JACKSON-868]
    public static class WebView { }
    public static class OtherView { }
    public static class Foo {
        @JsonView(WebView.class)
        public int getFoo() { return 3; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */    
    

@SuppressWarnings("unchecked") 
 public void testDefaultExclusion20() throws IOException { 
     MixedBean bean = new MixedBean(); 
     StringWriter sw = new StringWriter(); 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.writerWithView(ViewA.class).writeValue(sw, bean); 
     Map<String, Object> map = mapper.readValue(sw.toString(), Map.class); 
     assertEquals(2, map.size()); 
     assertEquals("1", map.get("a")); 
     assertEquals("2", map.get("b")); 
     mapper = new ObjectMapper(); 
     mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false); 
     String json = mapper.writerWithView(ViewA.class).writeValueAsString(bean); 
     map = mapper.readValue(json, Map.class); 
     assertEquals(1, map.size()); 
     assertEquals("1", map.get("a")); 
     assertNull(map.get("b")); 
 } 


@SuppressWarnings("unchecked") 
 public void testSimple430() throws IOException { 
     StringWriter sw = new StringWriter(); 
     ObjectMapper mapper = new ObjectMapper(); 
     Bean bean = new Bean(); 
     Map<String, Object> map = writeAndMap(mapper, bean); 
     assertEquals(3, map.size()); 
     sw = new StringWriter(); 
     mapper.writerWithView(ViewA.class).writeValue(sw, bean); 
     map = mapper.readValue(sw.toString(), Map.class); 
     assertEquals(1, map.size()); 
     assertEquals("1", map.get("a")); 
     sw = new StringWriter(); 
     mapper.writerWithView(ViewAA.class).writeValue(sw, bean); 
     map = mapper.readValue(sw.toString(), Map.class); 
     assertEquals(2, map.size()); 
     assertEquals("1", map.get("a")); 
     assertEquals("2", map.get("aa")); 
     String json = mapper.writerWithView(ViewB.class).writeValueAsString(bean); 
     map = mapper.readValue(json, Map.class); 
     assertEquals(2, map.size()); 
     assertEquals("2", map.get("aa")); 
     assertEquals("3", map.get("b")); 
     json = mapper.writerWithView(ViewBB.class).writeValueAsString(bean); 
     map = mapper.readValue(json, Map.class); 
     assertEquals(2, map.size()); 
     assertEquals("2", map.get("aa")); 
     assertEquals("3", map.get("b")); 
 } 

    

    /**
     * Unit test to verify implementation of [JACKSON-232], to
     * allow "opt-in" handling for JSON Views: that is, that
     * default for properties is to exclude unless included in
     * a view.
     */
    

    /**
     * As per [JACKSON-261], @JsonView annotation should imply that associated
     * method/field does indicate a property.
     */
    

    

    // [JACKSON-868]
        
}

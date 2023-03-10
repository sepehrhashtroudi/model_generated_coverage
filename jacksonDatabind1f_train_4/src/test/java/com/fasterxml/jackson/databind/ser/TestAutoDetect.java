package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

/**
 * Unit tests for checking extended auto-detect configuration,
 * in context of serialization
 */
public class TestAutoDetect
    extends BaseMapTest
{
    static class FieldBean
    {
        public String p1 = "public";
        protected String p2 = "protected";
        @SuppressWarnings("unused")
        private String p3 = "private";
    }

    @JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
    static class ProtFieldBean extends FieldBean { }

    static class MethodBean
    {
        public String getA() { return "a"; }
        protected String getB() { return "b"; }
        @SuppressWarnings("unused")
        private String getC() { return "c"; }
    }

    @JsonAutoDetect(getterVisibility=JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
    static class ProtMethodBean extends MethodBean { }

    /*
    /*********************************************************
    /* Test methods
    /*********************************************************
     */


public void testPrivateUsingGlobals140() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     VisibilityChecker<?> vc = m.getVisibilityChecker(); 
     vc = vc.withFieldVisibility(JsonAutoDetect.Visibility.ANY); 
     m.setVisibilityChecker(vc); 
     Map<String, Object> result = writeAndMap(m, new FieldBean()); 
     assertEquals(3, result.size()); 
     assertEquals("public", result.get("p1")); 
     assertEquals("protected", result.get("p2")); 
     assertEquals("private", result.get("p3")); 
     m = new ObjectMapper(); 
     vc = m.getVisibilityChecker(); 
     vc = vc.withGetterVisibility(JsonAutoDetect.Visibility.ANY); 
     m.setVisibilityChecker(vc); 
     result = writeAndMap(m, new MethodBean()); 
     assertEquals(3, result.size()); 
     assertEquals("a", result.get("a")); 
     assertEquals("b", result.get("b")); 
     assertEquals("c", result.get("c")); 
 } 


public void testMapperShortcutMethods141() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); 
     Map<String, Object> result = writeAndMap(m, new FieldBean()); 
     assertEquals(3, result.size()); 
     assertEquals("public", result.get("p1")); 
     assertEquals("protected", result.get("p2")); 
     assertEquals("private", result.get("p3")); 
 } 


public void testBasicSetup588() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     VisibilityChecker<?> vc = m.getVisibilityChecker(); 
     vc = vc.with(JsonAutoDetect.Visibility.ANY); 
     m.setVisibilityChecker(vc); 
     Map<String, Object> result = writeAndMap(m, new FieldBean()); 
     assertEquals(3, result.size()); 
     assertEquals("public", result.get("p1")); 
     assertEquals("protected", result.get("p2")); 
     assertEquals("private", result.get("p3")); 
 } 

    

    

    

    // [JACKSON-621]
    

    // [JACKSON-595]
    

}

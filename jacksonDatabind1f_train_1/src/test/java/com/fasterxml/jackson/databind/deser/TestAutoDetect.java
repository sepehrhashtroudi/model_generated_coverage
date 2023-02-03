package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

public class TestAutoDetect
    extends BaseMapTest
{
    /*
    /********************************************************
    /* Helper beans
    /********************************************************
     */

    static class PrivateBean {
        String a;

        private PrivateBean() { }

        private PrivateBean(String a) { this.a = a; }
    }
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */
    

public void testPrivateCtor589() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     PrivateBean bean = m.readValue("\"abc\"", PrivateBean.class); 
     assertEquals("abc", bean.a); 
     m = new ObjectMapper(); 
     VisibilityChecker<?> vc = m.getVisibilityChecker(); 
     vc = vc.withCreatorVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY); 
     m.setVisibilityChecker(vc); 
     try { 
         m.readValue("\"abc\"", PrivateBean.class); 
         fail("Expected exception for missing constructor"); 
     } catch (JsonProcessingException e) { 
         verifyException(e, "no single-String constructor/factory"); 
     } 
 } 

    

}

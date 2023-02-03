package com.fasterxml.jackson.databind.jsontype;

import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDefaultForEnums
    extends BaseMapTest
{
    public enum TestEnum {
        A, B;
    }

    static final class EnumHolder
    {
        public Object value; // "untyped"
        
        public EnumHolder() { }
        public EnumHolder(TestEnum e) { value = e; }
    }

    protected static class TimeUnitBean {
        public TimeUnit timeUnit;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */


public void testSimpleEnumBean421() throws Exception { 
     TimeUnitBean bean = new TimeUnitBean(); 
     bean.timeUnit = TimeUnit.SECONDS; 
     ObjectMapper m = new ObjectMapper(); 
     String json = m.writeValueAsString(bean); 
     TimeUnitBean result = m.readValue(json, TimeUnitBean.class); 
     assertEquals(TimeUnit.SECONDS, result.timeUnit); 
     m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     json = m.writeValueAsString(bean); 
     result = m.readValue(json, TimeUnitBean.class); 
     assertEquals(TimeUnit.SECONDS, result.timeUnit); 
 } 

    
    
    

    
}

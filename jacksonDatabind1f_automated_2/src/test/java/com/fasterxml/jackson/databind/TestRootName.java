package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests dealing with handling of "root element wrapping",
 * including configuration of root name to use.
 */
public class TestRootName extends BaseMapTest
{
    @JsonRootName("rudy")
    static class Bean {
        public int a = 3;
    }
    
    @JsonRootName("")
    static class RootBeanWithEmpty {
        public int a = 2;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

public void testRootWrapping2() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true); 
     String json = mapper.writeValueAsString(new StringWrapper("abc")); 
     assertEquals("{\"StringWrapper\":{\"str\":\"abc\"}}", json); 
 }
public void testRootViaMapper247() throws Exception { 
     ObjectMapper mapper = rootMapper(); 
     String json = mapper.writeValueAsString(new Bean()); 
     assertEquals("{\"rudy\":{\"a\":3}}", json); 
     Bean bean = mapper.readValue(json, Bean.class); 
     assertNotNull(bean); 
     json = mapper.writeValueAsString(new RootBeanWithEmpty()); 
     assertEquals("{\"RootBeanWithEmpty\":{\"a\":2}}", json); 
     RootBeanWithEmpty bean2 = mapper.readValue(json, RootBeanWithEmpty.class); 
     assertNotNull(bean2); 
     assertEquals(2, bean2.a); 
 }
public void testPrefetch249() throws Exception { 
     ObjectWriter writer = objectWriter(); 
     assertFalse(writer.hasPrefetchedSerializer()); 
     writer = objectWriter().withType(String.class); 
     assertTrue(writer.hasPrefetchedSerializer()); 
 }
    

    

    
    
    // [JACKSON-764]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private ObjectMapper rootMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return mapper;
    }
}

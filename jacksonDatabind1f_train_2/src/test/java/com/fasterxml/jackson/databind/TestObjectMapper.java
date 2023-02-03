package com.fasterxml.jackson.databind;

import java.io.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestObjectMapper extends BaseMapTest
{
    static class Bean {
        int value = 3;
        
        public void setX(int v) { value = v; }
    }

    // for [Issue#206]
    @SuppressWarnings("serial")
    static class CustomMapper extends ObjectMapper {
        @Override
        protected DefaultDeserializationContext createDeserializationContext(JsonParser jp,
                DeserializationConfig cfg) {
            return super.createDeserializationContext(jp, cfg);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    final static ObjectMapper MAPPER = new ObjectMapper();
    

public void testProps146() { 
     ObjectMapper m = new ObjectMapper(); 
     assertNotNull(m.getNodeFactory()); 
     JsonNodeFactory nf = JsonNodeFactory.instance; 
     m.setNodeFactory(nf); 
     assertSame(nf, m.getNodeFactory()); 
 } 


public void testProviderConfig457() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals(0, m._deserializationContext._cache.cachedDeserializersCount()); 
     Bean bean = m.readValue("{ \"x\" : 3 }", Bean.class); 
     assertNotNull(bean); 
     assertEquals(1, m._deserializationContext._cache.cachedDeserializersCount()); 
     m._deserializationContext._cache.flushCachedDeserializers(); 
     assertEquals(0, m._deserializationContext._cache.cachedDeserializersCount()); 
 } 

    

    

    

    // Test to ensure that we can check property ordering defaults...
    


    
    
    /**
     * Test for verifying working of [JACKSON-191]
     */
    
    
    // [Issue#28]: ObjectMapper.copy()
    
}

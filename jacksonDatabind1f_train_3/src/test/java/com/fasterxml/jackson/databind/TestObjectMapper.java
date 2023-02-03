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
    

public void testSupport52() { 
     assertTrue(MAPPER.canSerialize(String.class)); 
     assertTrue(MAPPER.canDeserialize(TypeFactory.defaultInstance().constructType(String.class))); 
 } 


public void testCopy148() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertTrue(m.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); 
     m.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); 
     assertFalse(m.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); 
     ObjectMapper m2 = m.copy(); 
     assertFalse(m2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); 
     m2.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); 
     assertTrue(m2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); 
     assertFalse(m.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); 
     assertFalse(m.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE)); 
     assertFalse(m2.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE)); 
     m.enable(DeserializationFeature.UNWRAP_ROOT_VALUE); 
     assertTrue(m.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE)); 
     assertFalse(m2.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE)); 
     assertNotSame(m.getFactory(), m2.getFactory()); 
     assertEquals(0, m.getSerializationConfig().mixInCount()); 
     assertEquals(0, m2.getSerializationConfig().mixInCount()); 
     assertEquals(0, m.getDeserializationConfig().mixInCount()); 
     assertEquals(0, m2.getDeserializationConfig().mixInCount()); 
     m.addMixInAnnotations(String.class, Integer.class); 
     assertEquals(1, m.getSerializationConfig().mixInCount()); 
     assertEquals(0, m2.getSerializationConfig().mixInCount()); 
     assertEquals(1, m.getDeserializationConfig().mixInCount()); 
     assertEquals(0, m2.getDeserializationConfig().mixInCount()); 
 } 


public void testProps157() { 
     ObjectMapper m = new ObjectMapper(); 
     assertNotNull(m.getNodeFactory()); 
     JsonNodeFactory nf = JsonNodeFactory.instance; 
     m.setNodeFactory(nf); 
     assertSame(nf, m.getNodeFactory()); 
 } 


public void testConfigForPropertySorting304() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertFalse(m.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)); 
     SerializationConfig sc = m.getSerializationConfig(); 
     assertFalse(sc.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)); 
     assertFalse(sc.shouldSortPropertiesAlphabetically()); 
     DeserializationConfig dc = m.getDeserializationConfig(); 
     assertFalse(dc.shouldSortPropertiesAlphabetically()); 
     m.enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY); 
     sc = m.getSerializationConfig(); 
     assertTrue(sc.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)); 
     assertTrue(sc.shouldSortPropertiesAlphabetically()); 
     dc = m.getDeserializationConfig(); 
     assertTrue(dc.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)); 
     assertTrue(dc.shouldSortPropertiesAlphabetically()); 
 } 


public void testTreeRead307() throws Exception { 
     String JSON = "{ }"; 
     JsonNode n = MAPPER.readTree(JSON); 
     assertTrue(n instanceof ObjectNode); 
     n = MAPPER.readTree(new StringReader(JSON)); 
     assertTrue(n instanceof ObjectNode); 
     n = MAPPER.readTree(new ByteArrayInputStream(JSON.getBytes("UTF-8"))); 
     assertTrue(n instanceof ObjectNode); 
 } 

    

    

    

    // Test to ensure that we can check property ordering defaults...
    


    
    
    /**
     * Test for verifying working of [JACKSON-191]
     */
    
    
    // [Issue#28]: ObjectMapper.copy()
    
}

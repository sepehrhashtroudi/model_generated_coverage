package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;

public class TestSerializerProvider
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    static class MyBean {
        public int getX() { return 3; }
    }


public void testFindExplicit497() throws JsonMappingException { 
     ObjectMapper mapper = new ObjectMapper(); 
     SerializationConfig config = mapper.getSerializationConfig(); 
     SerializerFactory f = new BeanSerializerFactory(null); 
     DefaultSerializerProvider prov = new DefaultSerializerProvider.Impl().createInstance(config, f); 
     assertNotNull(prov.findKeySerializer(mapper.constructType(String.class), null)); 
     assertNotNull(prov.getDefaultNullKeySerializer()); 
     assertNotNull(prov.getDefaultNullValueSerializer()); 
     assertNotNull(prov.getUnknownTypeSerializer(getClass())); 
     assertTrue(prov.createInstance(config, f).hasSerializerFor(String.class)); 
     assertTrue(prov.createInstance(config, f).hasSerializerFor(String.class)); 
     assertTrue(prov.createInstance(config, f).hasSerializerFor(MyBean.class)); 
     assertTrue(prov.createInstance(config, f).hasSerializerFor(MyBean.class)); 
 } 

    
}

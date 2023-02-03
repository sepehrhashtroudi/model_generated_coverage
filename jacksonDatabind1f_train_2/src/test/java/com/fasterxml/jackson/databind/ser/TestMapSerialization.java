package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("serial")
public class TestMapSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    /**
     * Class needed for testing [JACKSON-220]
     */
    @JsonSerialize(using=MapSerializer.class)    
    static class PseudoMap extends LinkedHashMap<String,String>
    {
        public PseudoMap(String... values) {
            for (int i = 0, len = values.length; i < len; i += 2) {
                put(values[i], values[i+1]);
            }
        }
    }

    static class MapSerializer extends JsonSerializer<Map<String,String>>
    {
        @Override
        public void serialize(Map<String,String> value,
                              JsonGenerator jgen,
                              SerializerProvider provider)
            throws IOException
        {
            // just use standard Map.toString(), output as JSON String
            jgen.writeString(value.toString());
        }
    }

    // For [JACKSON-574]
    static class DefaultKeySerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
        {
            jgen.writeFieldName("DEFAULT:"+value);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    final ObjectMapper MAPPER = new ObjectMapper();
    
    // Test [JACKSON-220]

public void testMapNullSerialization266() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     Map<String, String> map = new HashMap<String, String>(); 
     map.put("a", null); 
     assertEquals("{\"a\":null}", m.writeValueAsString(map)); 
     m.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false); 
     assertEquals("{}", m.writeValueAsString(map)); 
 } 


public void testDefaultKeySerializer280() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     m.getSerializerProvider().setDefaultKeySerializer(new DefaultKeySerializer()); 
     Map<String, String> map = new HashMap<String, String>(); 
     map.put("a", "b"); 
     assertEquals("{\"DEFAULT:a\":\"b\"}", m.writeValueAsString(map)); 
 } 


public void testOrderByKey294() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     assertFalse(m.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)); 
     LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 
     map.put("b", 3); 
     map.put("a", 6); 
     assertEquals("{\"b\":3,\"a\":6}", m.writeValueAsString(map)); 
     assertEquals("{\"a\":6,\"b\":3}", m.writer(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS).writeValueAsString(map)); 
 } 


public void testMapKeyValueSerialization551() throws IOException { 
     Map<String, String> map = new HashMap<String, String>(); 
     map.put("a", "b"); 
     assertEquals("[\"a\"]", MAPPER.writeValueAsString(map.keySet())); 
     assertEquals("[\"b\"]", MAPPER.writeValueAsString(map.values())); 
     map = new TreeMap<String, String>(); 
     map.put("c", "d"); 
     assertEquals("[\"c\"]", MAPPER.writeValueAsString(map.keySet())); 
     assertEquals("[\"d\"]", MAPPER.writeValueAsString(map.values())); 
     map = new ConcurrentHashMap<String, String>(); 
     map.put("e", "f"); 
     assertEquals("[\"e\"]", MAPPER.writeValueAsString(map.keySet())); 
     assertEquals("[\"f\"]", MAPPER.writeValueAsString(map.values())); 
 } 

    

    // Test [JACKSON-314]
    

    // [JACKSON-499], problems with map entries, values
    

    // For [JACKSON-574]
    

    // [JACKSON-636]: sort Map entries by key
    
}

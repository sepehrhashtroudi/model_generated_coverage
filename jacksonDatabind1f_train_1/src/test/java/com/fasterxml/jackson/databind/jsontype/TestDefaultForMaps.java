package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestDefaultForMaps 
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class MapKey {
        public String key;

        public MapKey(String k) { key = k; }

        @Override public String toString() { return key; }
    }

    static class MapKeyDeserializer extends KeyDeserializer
    {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return new MapKey(key);
        }
    }
    
    static class MapHolder
    {
        @JsonDeserialize(keyAs=MapKey.class, keyUsing=MapKeyDeserializer.class)
        public Map<MapKey,List<Object>> map;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    

public void testJackson428499() throws Exception { 
     ObjectMapper serMapper = new ObjectMapper(); 
     TypeResolverBuilder<?> serializerTyper = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL); 
     serializerTyper = serializerTyper.init(JsonTypeInfo.Id.NAME, createTypeNameIdResolver(true)); 
     serializerTyper = serializerTyper.inclusion(JsonTypeInfo.As.PROPERTY); 
     serMapper.setDefaultTyping(serializerTyper); 
     MapHolder holder = new MapHolder(); 
     holder.map = new HashMap<MapKey, List<Object>>(); 
     List<Object> ints = new ArrayList<Object>(); 
     ints.add(Integer.valueOf(3)); 
     holder.map.put(new MapKey("key"), ints); 
     String json = serMapper.writeValueAsString(holder); 
     ObjectMapper deserMapper = new ObjectMapper(); 
     TypeResolverBuilder<?> deserializerTyper = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL); 
     deserializerTyper = deserializerTyper.init(JsonTypeInfo.Id.NAME, createTypeNameIdResolver(false)); 
     deserializerTyper = deserializerTyper.inclusion(JsonTypeInfo.As.PROPERTY); 
     deserMapper.setDefaultTyping(deserializerTyper); 
     MapHolder result = deserMapper.readValue(json, MapHolder.class); 
     assertNotNull(result); 
     Map<?, ?> map = result.map; 
     assertEquals(1, map.size()); 
     Map.Entry<?, ?> entry = map.entrySet().iterator().next(); 
     Object key = entry.getKey(); 
     assertEquals(MapKey.class, key.getClass()); 
     Object value = entry.getValue(); 
     assertTrue(value instanceof List<?>); 
     List<?> list = (List<?>) value; 
     assertEquals(1, list.size()); 
     assertEquals(Integer.class, list.get(0).getClass()); 
     assertEquals(Integer.valueOf(3), list.get(0)); 
 } 

    

    protected TypeNameIdResolver createTypeNameIdResolver(boolean forSerialization)
    {
        Collection<NamedType> subtypes = new ArrayList<NamedType>();
        subtypes.add(new NamedType(MapHolder.class, "mapHolder"));
        subtypes.add(new NamedType(ArrayList.class, "AList"));
        subtypes.add(new NamedType(HashMap.class, "HMap"));
        ObjectMapper mapper = new ObjectMapper();
        return TypeNameIdResolver.construct(mapper.getDeserializationConfig(),
                TypeFactory.defaultInstance().constructType(Object.class), subtypes, forSerialization, !forSerialization);
    }
}

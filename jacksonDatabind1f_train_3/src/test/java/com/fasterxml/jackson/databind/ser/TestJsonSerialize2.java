package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;

@SuppressWarnings("serial")
public class TestJsonSerialize2
    extends BaseMapTest
{
    // [JACKSON-480]

    static class SimpleKey {
        protected final String key;
        
        public SimpleKey(String str) { key = str; }
        
        @Override public String toString() { return "toString:"+key; }
    }

    static class SimpleValue {
        public final String value;
        
        public SimpleValue(String str) { value = str; }
    }

    @JsonPropertyOrder({"value", "value2"})
    static class ActualValue extends SimpleValue
    {
        public final String other = "123";
        
        public ActualValue(String str) { super(str); }
    }

    static class SimpleKeySerializer extends JsonSerializer<SimpleKey> {
        @Override
        public void serialize(SimpleKey key, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
            jgen.writeFieldName("key "+key.key);
        }
    }

    static class SimpleValueSerializer extends JsonSerializer<SimpleValue> {
        @Override
        public void serialize(SimpleValue value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
            jgen.writeString("value "+value.value);
        }
    }

    @JsonSerialize(contentAs=SimpleValue.class)
    static class SimpleValueList extends ArrayList<ActualValue> { }

    @JsonSerialize(contentAs=SimpleValue.class)
    static class SimpleValueMap extends HashMap<SimpleKey, ActualValue> { }

    @JsonSerialize(contentUsing=SimpleValueSerializer.class)
    static class SimpleValueListWithSerializer extends ArrayList<ActualValue> { }

    @JsonSerialize(keyUsing=SimpleKeySerializer.class, contentUsing=SimpleValueSerializer.class)
    static class SimpleValueMapWithSerializer extends HashMap<SimpleKey, ActualValue> { }
    
    static class ListWrapperSimple
    {
        @JsonSerialize(contentAs=SimpleValue.class)
        public final ArrayList<ActualValue> values = new ArrayList<ActualValue>();
        
        public ListWrapperSimple(String value) {
            values.add(new ActualValue(value));
        }
    }

    static class ListWrapperWithSerializer
    {
        @JsonSerialize(contentUsing=SimpleValueSerializer.class)
        public final ArrayList<ActualValue> values = new ArrayList<ActualValue>();
        
        public ListWrapperWithSerializer(String value) {
            values.add(new ActualValue(value));
        }
    }
    
    static class MapWrapperSimple
    {
        @JsonSerialize(contentAs=SimpleValue.class)
        public final HashMap<SimpleKey, ActualValue> values = new HashMap<SimpleKey, ActualValue>();
        
        public MapWrapperSimple(String key, String value) {
            values.put(new SimpleKey(key), new ActualValue(value));
        }
    }

    static class MapWrapperWithSerializer
    {
        @JsonSerialize(keyUsing=SimpleKeySerializer.class, contentUsing=SimpleValueSerializer.class)
        public final HashMap<SimpleKey, ActualValue> values = new HashMap<SimpleKey, ActualValue>();
        
        public MapWrapperWithSerializer(String key, String value) {
            values.put(new SimpleKey(key), new ActualValue(value));
        }
    }

    static class NullBean
    {
        @JsonSerialize(using=NullSerializer.class)
        public String value = "abc";
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    // [JACKSON-480], test value annotation applied to List value class

public void testSerializedAsMapWithPropertyAnnotations215() throws IOException { 
     MapWrapperWithSerializer input = new MapWrapperWithSerializer("foo", "b"); 
     assertEquals("{\"values\":{\"key foo\":\"value b\"}}", MAPPER.writeValueAsString(input)); 
 } 


public void testSerializedAsMapWithClassAnnotations20() throws IOException { 
     SimpleValueMap map = new SimpleValueMap(); 
     map.put(new SimpleKey("x"), new ActualValue("y")); 
     assertEquals("{\"toString:x\":{\"value\":\"y\"}}", MAPPER.writeValueAsString(map)); 
 } 


public void testNullSerializer96() throws Exception { 
     String json = MAPPER.writeValueAsString(new NullBean()); 
     assertEquals("{\"value\":null}", json); 
 } 


public void testSerializedAsListWithClassAnnotations127() throws IOException { 
     SimpleValueList list = new SimpleValueList(); 
     list.add(new ActualValue("foo")); 
     assertEquals("[{\"value\":\"foo\"}]", MAPPER.writeValueAsString(list)); 
 } 


public void testSerializedAsListWithClassSerializer141() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     SimpleValueListWithSerializer list = new SimpleValueListWithSerializer(); 
     list.add(new ActualValue("foo")); 
     assertEquals("[\"value foo\"]", m.writeValueAsString(list)); 
 } 


public void testSerializedAsListWithPropertyAnnotations2142() throws IOException { 
     ListWrapperWithSerializer input = new ListWrapperWithSerializer("abc"); 
     assertEquals("{\"values\":[\"value abc\"]}", MAPPER.writeValueAsString(input)); 
 } 


public void testEmptyInclusion261() throws IOException { 
     ObjectMapper defMapper = MAPPER; 
     ObjectMapper inclMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY); 
     StringWrapper str = new StringWrapper(""); 
     assertEquals("{\"str\":\"\"}", defMapper.writeValueAsString(str)); 
     assertEquals("{}", inclMapper.writeValueAsString(str)); 
     assertEquals("{}", inclMapper.writeValueAsString(new StringWrapper())); 
     ListWrapper<String> list = new ListWrapper<String>(); 
     assertEquals("{\"list\":[]}", defMapper.writeValueAsString(list)); 
     assertEquals("{}", inclMapper.writeValueAsString(list)); 
     assertEquals("{}", inclMapper.writeValueAsString(new ListWrapper<String>())); 
     MapWrapper<String, Integer> map = new MapWrapper<String, Integer>(new HashMap<String, Integer>()); 
     assertEquals("{\"map\":{}}", defMapper.writeValueAsString(map)); 
     assertEquals("{}", inclMapper.writeValueAsString(map)); 
     assertEquals("{}", inclMapper.writeValueAsString(new MapWrapper<String, Integer>(null))); 
     ArrayWrapper<Integer> array = new ArrayWrapper<Integer>(new Integer[0]); 
     assertEquals("{\"array\":[]}", defMapper.writeValueAsString(array)); 
     assertEquals("{}", inclMapper.writeValueAsString(array)); 
     assertEquals("{}", inclMapper.writeValueAsString(new ArrayWrapper<Integer>(null))); 
 } 


public void testSerializedAsMapWithClassSerializer411() throws IOException { 
     SimpleValueMapWithSerializer map = new SimpleValueMapWithSerializer(); 
     map.put(new SimpleKey("abc"), new ActualValue("123")); 
     assertEquals("{\"key abc\":\"value 123\"}", MAPPER.writeValueAsString(map)); 
 } 

    

    // [JACKSON-480], test value annotation applied to Map value class
    

    // [JACKSON-480], test Serialization annotation with List
    

    // [JACKSON-480], test annotations when applied to List property (getter, setter)
    
    
    // [JACKSON-480], test Serialization annotation with Map
    

    // [JACKSON-480], test annotations when applied to Map property (getter, setter)
    
    
    

    

    // [JACKSON-602]: Include.NON_EMPTY
    

    // [JACKSON-699]
    
}

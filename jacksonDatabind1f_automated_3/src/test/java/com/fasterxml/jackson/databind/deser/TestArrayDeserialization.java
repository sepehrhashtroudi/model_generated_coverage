package com.fasterxml.jackson.databind.deser;


import java.io.*;
import java.util.*;

import static org.junit.Assert.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * This unit test suite tries to verify that the "Native" java type
 * mapper can properly re-construct Java array objects from Json arrays.
 */
public class TestArrayDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    public final static class Bean1
    {
        int _x, _y;
        List<Bean2> _beans;

        // Just for deserialization:
        @SuppressWarnings("unused")
        private Bean1() { }

        public Bean1(int x, int y, List<Bean2> beans)
        {
            _x = x;
            _y = y;
            _beans = beans;
        }

        public int getX() { return _x; }
        public int getY() { return _y; }
        public List<Bean2> getBeans() { return _beans; }

        public void setX(int x) { _x = x; }
        public void setY(int y) { _y = y; }
        public void setBeans(List<Bean2> b) { _beans = b; }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Bean1)) return false;
            Bean1 other = (Bean1) o;
            return (_x == other._x)
                && (_y == other._y)
                && _beans.equals(other._beans)
                ;
        }
    }

    /**
     * Simple bean that just gets serialized as a String value.
     * Deserialization from String value will be done via single-arg
     * constructor.
     */
    public final static class Bean2
        implements JsonSerializable // so we can output as simple String
    {
        final String _desc;

        public Bean2(String d)
        {
            _desc = d;
        }

        @Override
        public void serialize(JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException
        {
            jgen.writeString(_desc);
        }

        @Override public String toString() { return _desc; }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Bean2)) return false;
            Bean2 other = (Bean2) o;
            return _desc.equals(other._desc);
        }

        @Override
        public void serializeWithType(JsonGenerator jgen,
                SerializerProvider provider, TypeSerializer typeSer)
                throws IOException, JsonProcessingException {
        }
    }	

    static class ObjectWrapper {
        public Object wrapped;
    }

    static class ObjectArrayWrapper {
    	public Object[] wrapped;
    }

    static class CustomNonDeserArrayDeserializer extends JsonDeserializer<NonDeserializable[]>
    {
        @Override
        public NonDeserializable[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
        {
            List<NonDeserializable> list = new ArrayList<NonDeserializable>();
            while (jp.nextToken() != JsonToken.END_ARRAY) {
                list.add(new NonDeserializable(jp.getText(), false));
            }
            return list.toArray(new NonDeserializable[list.size()]);
        }
    }

    static class NonDeserializable {
        protected String value;
        
        public NonDeserializable(String v, boolean bogus) {
            value = v;
        }
    }

    static class Product { 
        public String name; 
        public List<Things> thelist; 
    }

    static class Things {
        public String height;
        public String width;
    }
    
    /*
    /**********************************************************
    /* Tests for "untyped" arrays, Object[]
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
public void testCharArrays226() throws IOException { 
     char[] chars = new char[] { 'a', 'b', 'c' }; 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals(quote("abc"), m.writeValueAsString(chars)); 
     m.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true); 
     assertEquals("[\"a\",\"b\",\"c\"]", m.writeValueAsString(chars)); 
 }
public void testCharArrays227() throws Exception { 
     char[] chars = new char[] { 'a', 'b', 'c' }; 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals(quote("abc"), m.writeValueAsString(chars)); 
     m.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true); 
     assertEquals("[\"a\",\"b\",\"c\"]", m.writeValueAsString(chars)); 
 }
    

    

    // [JACKSON-620]: allow "" to mean 'null' for Arrays, List and Maps
    

    // [JACKSON-620]: allow "" to mean 'null' for Arrays, List and Maps
    
    
    /*
    /**********************************************************
    /* Arrays of arrays...
    /**********************************************************
     */

        
    
    /*
    /**********************************************************
    /* Tests for String arrays, char[]
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Tests for primitive arrays
    /**********************************************************
     */

    

    

    

    /**
     * And then bit more challenging case; let's try decoding
     * multiple byte arrays from an array...
     */
    

    // [JACKSON-763]
    
    
    

    

    

    

    

    /*
    /**********************************************************
    /* Tests for Bean arrays
    /**********************************************************
     */

    

    /*
    /**********************************************************
    /* And custom deserializers too
    /**********************************************************
     */

    
}

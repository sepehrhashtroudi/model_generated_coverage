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
    

public void testFloatArray223() throws Exception { 
     final int LEN = 7000; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(i).append('.').append(i % 10); 
     } 
     sb.append(']'); 
     float[] result = MAPPER.readValue(sb.toString(), float[].class); 
     assertNotNull(result); 
     assertEquals(LEN, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         String expStr = String.valueOf(i) + "." + String.valueOf(i % 10); 
         assertEquals(expStr, String.valueOf(result[i])); 
     } 
 } 


public void testBeanArray242() throws Exception { 
     List<Bean1> src = new ArrayList<Bean1>(); 
     List<Bean2> b2 = new ArrayList<Bean2>(); 
     b2.add(new Bean2("a")); 
     b2.add(new Bean2("foobar")); 
     src.add(new Bean1(1, 2, b2)); 
     b2 = new ArrayList<Bean2>(); 
     b2.add(null); 
     src.add(new Bean1(4, 5, b2)); 
     StringWriter sw = new StringWriter(); 
     MAPPER.writeValue(sw, src); 
     List<Bean1> result = MAPPER.readValue(sw.toString(), new TypeReference<List<Bean1>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(src, result); 
 } 


public void testByteArraysWith763265() throws Exception { 
     String[] input = new String[] { "YQ==", "Yg==", "Yw==" }; 
     byte[][] data = MAPPER.convertValue(input, byte[][].class); 
     assertEquals("a", new String(data[0], "US-ASCII")); 
     assertEquals("b", new String(data[1], "US-ASCII")); 
     assertEquals("c", new String(data[2], "US-ASCII")); 
 } 


public void testLongArray325() throws Exception { 
     final int LEN = 12300; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(i); 
     } 
     sb.append(']'); 
     long[] result = MAPPER.readValue(sb.toString(), long[].class); 
     assertNotNull(result); 
     assertEquals(LEN, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         long exp = (long) i; 
         assertEquals(exp, result[i]); 
     } 
 } 


public void testDoubleArray332() throws Exception { 
     final int LEN = 7000; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(i).append('.').append(i % 10); 
     } 
     sb.append(']'); 
     double[] result = MAPPER.readValue(sb.toString(), double[].class); 
     assertNotNull(result); 
     assertEquals(LEN, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         String expStr = String.valueOf(i) + "." + String.valueOf(i % 10); 
         String actStr = String.valueOf(result[i]); 
         if (!expStr.equals(actStr)) { 
             fail("Entry #" + i + "/" + LEN + "; exp '" + expStr + "', got '" + actStr + "'"); 
         } 
     } 
 } 


public void testByteArrayAsNumbers425() throws Exception { 
     final int LEN = 37000; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         int value = i - 128; 
         sb.append((value < 256) ? value : (value & 0x7F)); 
         sb.append(','); 
     } 
     sb.append("0]"); 
     byte[] result = MAPPER.readValue(sb.toString(), byte[].class); 
     assertNotNull(result); 
     assertEquals(LEN + 1, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         int value = i - 128; 
         byte exp = (byte) ((value < 256) ? value : (value & 0x7F)); 
         if (exp != result[i]) { 
             fail("At offset #" + i + " (" + result.length + "), expected " + exp + ", got " + result[i]); 
         } 
         assertEquals(exp, result[i]); 
     } 
     assertEquals(0, result[LEN]); 
 } 


public void testCustomDeserializers490() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule testModule = new SimpleModule("test", Version.unknownVersion()); 
     testModule.addDeserializer(NonDeserializable[].class, new CustomNonDeserArrayDeserializer()); 
     mapper.registerModule(testModule); 
     NonDeserializable[] result = mapper.readValue("[\"a\"]", NonDeserializable[].class); 
     assertNotNull(result); 
     assertEquals(1, result.length); 
     assertEquals("a", result[0].value); 
 } 


public void testCharArray513() throws Exception { 
     final String TEST_STR = "Let's just test it? Ok!"; 
     char[] result = MAPPER.readValue("\"" + TEST_STR + "\"", char[].class); 
     assertEquals(TEST_STR, new String(result)); 
     result = MAPPER.readValue("[\"a\",\"b\",\"c\"]", char[].class); 
     assertEquals("abc", new String(result)); 
 } 


public void testFromEmptyString2521() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true); 
     m.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true); 
     Product p = m.readValue("{\"thelist\":\"\"}", Product.class); 
     assertNotNull(p); 
     assertNull(p.thelist); 
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

package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * Unit tests for verifying serialization of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestEnumSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper enums
    /**********************************************************
     */

    /**
     * Test enumeration for verifying Enum serialization functionality.
     */
    protected enum TestEnum {
        A, B, C;
        private TestEnum() { }

        @Override public String toString() { return name().toLowerCase(); }
    }

    /**
     * Alternative version that forces use of "toString-serializer".
     */
    @JsonSerialize(using=ToStringSerializer.class)
    protected enum AnnotatedTestEnum {
        A2, B2, C2;
        private AnnotatedTestEnum() { }

        @Override public String toString() { return name().toLowerCase(); }
    }

    protected enum EnumWithJsonValue {
        A("foo"), B("bar");
        private final String name;
        private EnumWithJsonValue(String n) {
            name = n;
        }
        @JsonValue
        @Override
        public String toString() { return name; }
    }
    
    protected static interface ToStringMixin {
        @Override
        @JsonValue public String toString();
    }

    protected enum SerializableEnum implements JsonSerializable
    {
        A, B, C;

        private SerializableEnum() { }

        @Override
        public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer)
                throws IOException, JsonProcessingException
        {
            serialize(jgen, provider);
        }

        @Override
        public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
        {
            jgen.writeString("foo");
        }
    }

    protected enum LowerCaseEnum {
        A, B, C;
        private LowerCaseEnum() { }
        @Override
        public String toString() { return name().toLowerCase(); }
    }

    static class MapBean {
        public Map<TestEnum,Integer> map = new HashMap<TestEnum,Integer>();
        
        public void add(TestEnum key, int value) {
            map.put(key, Integer.valueOf(value));
        }
    }

    // [JACKSON-757]
    static enum NOT_OK {
        V1("v1"); 
        protected String key;
        // any runtime-persistent annotation is fine
        NOT_OK(@JsonProperty String key) { this.key = key; }
    }

    static enum OK {
        V1("v1");
        protected String key;
        OK(String key) { this.key = key; }
    }
    
    // Types for [https://github.com/FasterXML/jackson-databind/issues/24]
    // (Enums as JSON Objects)

    @JsonFormat(shape=JsonFormat.Shape.OBJECT)
    static enum PoNUM {
        A("a1"), B("b2");

        @JsonProperty
        protected final String value;
        
        private PoNUM(String v) { value = v; }

        public String getValue() { return value; }
    }

    static class PoNUMContainer {
        @JsonFormat(shape=Shape.NUMBER)
        public OK text = OK.V1;
    }
    
    @JsonFormat(shape=JsonFormat.Shape.ARRAY) // not supported as of now
    static enum BrokenPoNum
    {
        A, B;
    }
    
    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();
    

public void testEnumSet395() throws Exception { 
     StringWriter sw = new StringWriter(); 
     EnumSet<TestEnum> value = EnumSet.of(TestEnum.B); 
     mapper.writeValue(sw, value); 
     assertEquals("[\"B\"]", sw.toString()); 
 } 


public void testAnnotationsOnEnumCtor410() throws Exception { 
     assertEquals(quote("V1"), mapper.writeValueAsString(OK.V1)); 
     assertEquals(quote("V1"), mapper.writeValueAsString(NOT_OK.V1)); 
     assertEquals(quote("V2"), mapper.writeValueAsString(NOT_OK2.V2)); 
 } 


public void testToStringEnumWithEnumMap480() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true); 
     EnumMap<LowerCaseEnum, String> m = new EnumMap<LowerCaseEnum, String>(LowerCaseEnum.class); 
     m.put(LowerCaseEnum.C, "value"); 
     assertEquals("{\"c\":\"value\"}", mapper.writeValueAsString(m)); 
 } 


public void testEnumUsingToString505() throws Exception { 
     StringWriter sw = new StringWriter(); 
     mapper.writeValue(sw, AnnotatedTestEnum.C2); 
     assertEquals("\"c2\"", sw.toString()); 
 } 


public void testEnumAsIndexViaAnnotations509() throws Exception { 
     assertEquals("{\"text\":0}", mapper.writeValueAsString(new PoNUMContainer())); 
 } 


public void testAsIndex510() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertFalse(mapper.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)); 
     assertEquals(quote("B"), mapper.writeValueAsString(TestEnum.B)); 
     mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX); 
     assertEquals("1", mapper.writeValueAsString(TestEnum.B)); 
 } 


public void testEnumAsObjectBroken511() throws Exception { 
     try { 
         String json = mapper.writeValueAsString(BrokenPoNum.A); 
         fail("Should not have succeeded, produced: " + json); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Unsupported serialization shape"); 
     } 
 } 

    

    

    /**
     * Whereas regular Enum serializer uses enum names, some users
     * prefer calling toString() instead. So let's verify that
     * this can be done using annotation for enum class.
     */
    

    // Test [JACKSON-214]
    

    // [JACKSON-193]
    

    // also, for [JACKSON-193], needs to work via mix-ins
    

    /**
     * Test for ensuring that @JsonSerializable is used with Enum types as well
     * as with any other types.
     */
    

    // [JACKSON-212]
    

    // [JACKSON-212]
    

    // [JACKSON-576]
    
    
    // [JACKSON-684]
    

    // [JACKSON-757]
    

    // Tests for [issue#24]

    

    
    
    
}

// [JACKSON-757], non-inner enum
enum NOT_OK2 {
    V2("v2"); 
    protected String key;
    // any runtime-persistent annotation is fine
    NOT_OK2(@JsonProperty String key) { this.key = key; }
}

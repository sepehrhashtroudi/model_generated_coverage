package com.fasterxml.jackson.databind.deser;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestEnumDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes, enums
    /**********************************************************
     */

    enum TestEnum { JACKSON, RULES, OK; }

    /**
     * Alternative version that annotates which deserializer to use
     */
    @JsonDeserialize(using=DummySerializer.class)
    enum AnnotatedTestEnum {
        JACKSON, RULES, OK;
    }

    public static class DummySerializer extends StdDeserializer<Object>
    {
        public DummySerializer() { super(Object.class); }
        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt)
        {
            return AnnotatedTestEnum.OK;
        }
    }

    protected enum EnumWithCreator {
        A, B;

        @JsonCreator
        public static EnumWithCreator fromEnum(String str) {
            if ("enumA".equals(str)) return A;
            if ("enumB".equals(str)) return B;
            return null;
        }
    }
    
    protected enum LowerCaseEnum {
        A, B, C;
        private LowerCaseEnum() { }
        @Override
        public String toString() { return name().toLowerCase(); }
    }

    // for [JACKSON-749]
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
    
    // [JACKSON-810]
    static class ClassWithEnumMapKey {
    	@JsonProperty Map<TestEnum, String> map;
    }

    // [JACKSON-834]
    protected enum TestEnumFor834
    {
        ENUM_A(1), ENUM_B(2), ENUM_C(3);
        
        private final int id;
        
        private TestEnumFor834(int id) {
            this.id = id;
        }
        
        @JsonCreator public static TestEnumFor834 fromId(int id) {
            for (TestEnumFor834 e: values()) {
                if (e.id == id) return e;
            }
            return null;
        }
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    protected final ObjectMapper MAPPER = new ObjectMapper();


public void testDoNotAllowUnknownEnumValuesAsMapKeysWhenReadAsNullDisabled55() throws Exception { 
     assertFalse(MAPPER.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)); 
     try { 
         MAPPER.readValue("{\"map\":{\"NO-SUCH-VALUE\":\"val\"}}", ClassWithEnumMapKey.class); 
         fail("Expected an exception for bogus enum value..."); 
     } catch (JsonMappingException jex) { 
         verifyException(jex, "Can not construct Map key"); 
     } 
 } 


public void testAllowUnknownEnumValuesAsMapKeysReadAsNull300() throws Exception { 
     ObjectReader reader = MAPPER.reader(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL); 
     ClassWithEnumMapKey result = reader.withType(ClassWithEnumMapKey.class).readValue("{\"map\":{\"NO-SUCH-VALUE\":\"val\"}}"); 
     assertTrue(result.map.containsKey(null)); 
 } 


public void testEnumsFromInts416() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     TestEnumFor834 res = mapper.readValue("1 ", TestEnumFor834.class); 
     assertSame(TestEnumFor834.ENUM_A, res); 
 } 


public void testAllowUnknownEnumValuesReadAsNull417() throws Exception { 
     ObjectReader reader = MAPPER.reader(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL); 
     assertNull(reader.withType(TestEnum.class).readValue("\"NO-SUCH-VALUE\"")); 
     assertNull(reader.withType(TestEnum.class).readValue(" 4343 ")); 
 } 


public void testEnumsWithEmpty418() throws Exception { 
     final ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true); 
     TestEnum result = m.readValue("\"\"", TestEnum.class); 
     assertNull(result); 
 } 


public void testNumbersToEnums419() throws Exception { 
     assertFalse(MAPPER.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)); 
     TestEnum value = MAPPER.readValue("1", TestEnum.class); 
     assertSame(TestEnum.RULES, value); 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true); 
     try { 
         value = m.readValue("1", TestEnum.class); 
         fail("Expected an error"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Not allowed to deserialize Enum value out of JSON number"); 
     } 
 } 


public void testToStringEnums436() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true); 
     LowerCaseEnum value = m.readValue("\"c\"", LowerCaseEnum.class); 
     assertEquals(LowerCaseEnum.C, value); 
 } 


public void testEnumsWithJsonValue437() throws Exception { 
     EnumWithJsonValue e = MAPPER.readValue(quote("foo"), EnumWithJsonValue.class); 
     assertSame(EnumWithJsonValue.A, e); 
     e = MAPPER.readValue(quote("bar"), EnumWithJsonValue.class); 
     assertSame(EnumWithJsonValue.B, e); 
     EnumSet<EnumWithJsonValue> set = MAPPER.readValue("[\"bar\"]", new TypeReference<EnumSet<EnumWithJsonValue>>() { 
     }); 
     assertNotNull(set); 
     assertEquals(1, set.size()); 
     assertTrue(set.contains(EnumWithJsonValue.B)); 
     assertFalse(set.contains(EnumWithJsonValue.A)); 
     EnumMap<EnumWithJsonValue, Integer> map = MAPPER.readValue("{\"foo\":13}", new TypeReference<EnumMap<EnumWithJsonValue, Integer>>() { 
     }); 
     assertNotNull(map); 
     assertEquals(1, map.size()); 
     assertEquals(Integer.valueOf(13), map.get(EnumWithJsonValue.A)); 
 } 


public void testEnumWithCreatorMaps438() throws Exception { 
     java.util.HashMap<EnumWithCreator, String> value = MAPPER.readValue("{\"enumA\":\"value\"}", new TypeReference<java.util.HashMap<EnumWithCreator, String>>() { 
     }); 
     assertEquals("value", value.get(EnumWithCreator.A)); 
 } 


public void testCreatorEnums494() throws Exception { 
     EnumWithCreator value = MAPPER.readValue("\"enumA\"", EnumWithCreator.class); 
     assertEquals(EnumWithCreator.A, value); 
 } 


public void testToStringEnumMaps500() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true); 
     EnumMap<LowerCaseEnum, String> value = m.readValue("{\"a\":\"value\"}", new TypeReference<EnumMap<LowerCaseEnum, String>>() { 
     }); 
     assertEquals("value", value.get(LowerCaseEnum.A)); 
 } 


public void testAllowUnknownEnumValuesForEnumSets549() throws Exception { 
     ObjectReader reader = MAPPER.reader(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL); 
     EnumSet<TestEnum> result = reader.withType(new TypeReference<EnumSet<TestEnum>>() { 
     }).readValue("[\"NO-SUCH-VALUE\"]"); 
     assertEquals(0, result.size()); 
 } 

    

    /**
     * Enums are considered complex if they have code (and hence sub-classes)... an
     * example is TimeUnit
     */
    
    
    /**
     * Testing to see that annotation override works
     */
    

    
    
    // Test [JACKSON-214]
    

    // [JACKSON-193]
    
    
    // [JACKSON-212]
    

    // [JACKSON-212]
    

    // [JACKSON-412], disallow use of numbers
    

    // [JACKSON-684], enums using index
    
    
    // [JACKSON-749]: @JsonValue should be considered as well
    

    // [JACKSON-756], next three tests

    

    

    

    // [JACKSON-810], ability to ignore unknown Enum values:

    

    
    
    
    
    

    // [JACKSON-834]
    

    // [Issue#141]: allow mapping of empty String into null
    

}

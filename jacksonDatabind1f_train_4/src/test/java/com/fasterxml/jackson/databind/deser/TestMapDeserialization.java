package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestMapDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    enum Key {
        KEY1, KEY2, WHATEVER;
    }

    static class BrokenMap
        extends HashMap<Object,Object>
    {
        // No default ctor, nor @JsonCreators
        public BrokenMap(boolean dummy) { super(); }
    }

    @JsonDeserialize(using=MapDeserializer.class)
    static class CustomMap extends LinkedHashMap<String,String> { }

    static class MapDeserializer extends StdDeserializer<CustomMap>
    {
        public MapDeserializer() { super(CustomMap.class); }
        @Override
        public CustomMap deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException
        {
            CustomMap result = new CustomMap();
            result.put("x", jp.getText());
            return result;
        }
    }

    static class KeyType {
        protected String value;
        
        private KeyType(String v, boolean bogus) {
            value = v;
        }

        @JsonCreator
        public static KeyType create(String v) {
            return new KeyType(v, true);
        }
    }

    // Issue #142
    public static class EnumMapContainer {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
        public EnumMap<KeyEnum,ITestType> testTypes;
    }

    public static class ListContainer {
        public List<ITestType> testTypes;
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    public static interface ITestType { }

    public static enum KeyEnum {
        A, B
    }
    public static enum ConcreteType implements ITestType {
        ONE, TWO;
    }

    
    
    /*
    /**********************************************************
    /* Test methods, untyped (Object valued) maps
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();


public void testCalendarMap49() throws Exception { 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     c.setTimeInMillis(123456000L); 
     DateFormat fmt = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US); 
     String JSON = "{ \"" + fmt.format(c.getTime()) + "\" : \"\", \"" + new Date(0).getTime() + "\" : null }"; 
     HashMap<Calendar, String> result = MAPPER.readValue(JSON, new TypeReference<HashMap<Calendar, String>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(HashMap.class, result.getClass()); 
     assertEquals(2, result.size()); 
     assertTrue(result.containsKey(c)); 
     assertEquals("", result.get(c)); 
     c.setTimeInMillis(0); 
     assertTrue(result.containsKey(c)); 
     assertNull(result.get(c)); 
 } 


public void testMapError52() throws Exception { 
     try { 
         Object result = MAPPER.readValue("[ 1, 2 ]", new TypeReference<Map<String, String>>() { 
         }); 
         fail("Expected an exception, but got result value: " + result); 
     } catch (JsonMappingException jex) { 
         verifyException(jex, "START_ARRAY"); 
     } 
 } 


public void testNoCtorMap53() throws Exception { 
     try { 
         BrokenMap result = MAPPER.readValue("{ \"a\" : 3 }", BrokenMap.class); 
         assertNull(result); 
     } catch (JsonMappingException e) { 
         verifyException(e, "no default constructor found"); 
     } 
 } 


public void testEnumPolymorphicSerializationTest122() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     List<ITestType> testTypesList = new ArrayList<ITestType>(); 
     testTypesList.add(ConcreteType.ONE); 
     testTypesList.add(ConcreteType.TWO); 
     ListContainer listContainer = new ListContainer(); 
     listContainer.testTypes = testTypesList; 
     String json = mapper.writeValueAsString(listContainer); 
     listContainer = mapper.readValue(json, ListContainer.class); 
     EnumMapContainer enumMapContainer = new EnumMapContainer(); 
     EnumMap<KeyEnum, ITestType> testTypesMap = new EnumMap<KeyEnum, ITestType>(KeyEnum.class); 
     testTypesMap.put(KeyEnum.A, ConcreteType.ONE); 
     testTypesMap.put(KeyEnum.B, ConcreteType.TWO); 
     enumMapContainer.testTypes = testTypesMap; 
     json = mapper.writeValueAsString(enumMapContainer); 
     enumMapContainer = mapper.readValue(json, EnumMapContainer.class); 
 } 


public void testDateMap162() throws Exception { 
     Date date1 = new Date(123456000L); 
     DateFormat fmt = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US); 
     String JSON = "{ \"" + fmt.format(date1) + "\" : \"\", \"" + new Date(0).getTime() + "\" : null }"; 
     HashMap<Date, String> result = MAPPER.readValue(JSON, new TypeReference<HashMap<Date, String>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(HashMap.class, result.getClass()); 
     assertEquals(2, result.size()); 
     assertTrue(result.containsKey(date1)); 
     assertEquals("", result.get(new Date(123456000L))); 
     assertTrue(result.containsKey(new Date(0))); 
     assertNull(result.get(new Date(0))); 
 } 


public void testSpecialMap361() throws IOException { 
     final ObjectWrapperMap map = MAPPER.readValue(UNTYPED_MAP_JSON, ObjectWrapperMap.class); 
     _doTestUntyped(map); 
 } 


public void testUntypedMap462() throws Exception { 
     String JSON = "{ \"foo\" : \"bar\", \"crazy\" : true, \"null\" : null }"; 
     @SuppressWarnings("unchecked") 
     Map<String, Object> result = (Map<String, Object>) MAPPER.readValue(JSON, Object.class); 
     assertNotNull(result); 
     assertTrue(result instanceof Map<?, ?>); 
     assertEquals(3, result.size()); 
     assertEquals("bar", result.get("foo")); 
     assertEquals(Boolean.TRUE, result.get("crazy")); 
     assertNull(result.get("null")); 
     assertNull(result.get("bar")); 
     assertNull(result.get(3)); 
 } 


public void testEnumMap528() throws Exception { 
     String JSON = "{ \"KEY1\" : \"\", \"WHATEVER\" : null }"; 
     EnumMap<Key, String> result = MAPPER.readValue(JSON, new TypeReference<EnumMap<Key, String>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(EnumMap.class, result.getClass()); 
     assertEquals(2, result.size()); 
     assertEquals("", result.get(Key.KEY1)); 
     assertTrue(result.containsKey(Key.WHATEVER)); 
     assertNull(result.get(Key.WHATEVER)); 
     assertFalse(result.containsKey(Key.KEY2)); 
     assertNull(result.get(Key.KEY2)); 
 } 


public void testIntBooleanMap543() throws Exception { 
     String JSON = "{ \"1\" : true, \"-1\" : false }"; 
     Map<String, Integer> result = MAPPER.readValue(JSON, new TypeReference<HashMap<Integer, Boolean>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(HashMap.class, result.getClass()); 
     assertEquals(2, result.size()); 
     assertEquals(Boolean.TRUE, result.get(Integer.valueOf(1))); 
     assertEquals(Boolean.FALSE, result.get(Integer.valueOf(-1))); 
     assertNull(result.get("foobar")); 
     assertNull(result.get(0)); 
 } 


public void testUUIDKeyMap545() throws Exception { 
     UUID key = UUID.nameUUIDFromBytes("foobar".getBytes("UTF-8")); 
     String JSON = "{ \"" + key + "\":4}"; 
     Map<UUID, Object> result = MAPPER.readValue(JSON, new TypeReference<Map<UUID, Object>>() { 
     }); 
     assertNotNull(result); 
     assertEquals(1, result.size()); 
     Object ob = result.keySet().iterator().next(); 
     assertNotNull(ob); 
     assertEquals(UUID.class, ob.getClass()); 
     assertEquals(key, ob); 
 } 


public void testFromEmptyString584() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true); 
     Map<?, ?> result = m.readValue(quote(""), Map.class); 
     assertNull(result); 
 } 

    

    /**
     * Let's also try another way to express "gimme a Map" deserialization;
     * this time by specifying a Map class, to reduce need to cast
     */
    

    /**
     * Unit test for [JACKSON-185]
     */
    

    private static final String UNTYPED_MAP_JSON =
            "{ \"double\":42.0, \"string\":\"string\","
            +"\"boolean\":true, \"list\":[\"list0\"],"
            +"\"null\":null }";
    
    static class ObjectWrapperMap extends HashMap<String, ObjectWrapper> { }
    
    

    
    
    private void _doTestUntyped(final Map<String, ObjectWrapper> map)
    {
       assertEquals(Double.valueOf(42), map.get("double").getObject());
       assertEquals("string", map.get("string").getObject());
       assertEquals(Boolean.TRUE, map.get("boolean").getObject());
       assertEquals(Collections.singletonList("list0"), map.get("list").getObject());
       assertTrue(map.containsKey("null"));
       assertNull(map.get("null"));
       assertEquals(5, map.size());
    }
    
    // [JACKSON-620]: allow "" to mean 'null' for Maps
    

    /*
    /**********************************************************
    /* Test methods, typed maps
    /**********************************************************
     */

    

    /**
     * Let's also check that it is possible to do type conversions
     * to allow use of non-String Map keys.
     */
    

    

    /**
     * Unit test that verifies that it's ok to have incomplete
     * information about Map class itself, as long as it's something
     * we good guess about: for example, <code>Map.Class</code> will
     * be replaced by something like <code>HashMap.class</code>,
     * if given.
     */
    

    /*
    /**********************************************************
    /* Test methods, maps with enums
    /**********************************************************
     */

    

    

    

    /*
    /**********************************************************
    /* Test methods, maps with Date
    /**********************************************************
     */
    
    
    /*
    /**********************************************************
    /* Test methods, maps with various alternative key types
    /**********************************************************
     */

    

    // [JACKSON-726]
    

    

    // Test confirming that @JsonCreator may be used with Map Key types
    
    
    /*
    /**********************************************************
    /* Test methods, annotated Maps
    /**********************************************************
     */

    /**
     * Simple test to ensure that @JsonDeserialize.using is
     * recognized
     */
    

    /*
    /**********************************************************
    /* Error tests
    /**********************************************************
     */

    

    
}

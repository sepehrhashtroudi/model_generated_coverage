package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestCollectionDeserialization
    extends BaseMapTest
{
    enum Key {
        KEY1, KEY2, WHATEVER;
    }

    @JsonDeserialize(using=ListDeserializer.class)
    static class CustomList extends LinkedList<String> { }

    static class ListDeserializer extends StdDeserializer<CustomList>
    {
        public ListDeserializer() { super(CustomList.class); }

        @Override
        public CustomList deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException
        {
            CustomList result = new CustomList();
            result.add(jp.getText());
            return result;
        }
    }

    static class XBean {
        public int x;
    }

    // [Issue#199]
    static class ListAsIterable {
        public Iterable<String> values;
    }

    static class ListAsIterableX {
        public Iterable<XBean> nums;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();
    

@SuppressWarnings("unchecked") 
 public void testImplicitArrays220() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true); 
     List<Integer> ints = mapper.readValue("4", List.class); 
     assertEquals(1, ints.size()); 
     assertEquals(Integer.valueOf(4), ints.get(0)); 
     List<String> strings = mapper.readValue(quote("abc"), new TypeReference<ArrayList<String>>() { 
     }); 
     assertEquals(1, strings.size()); 
     assertEquals("abc", strings.get(0)); 
     int[] intArray = mapper.readValue("-7", int[].class); 
     assertEquals(1, intArray.length); 
     assertEquals(-7, intArray[0]); 
     String[] stringArray = mapper.readValue(quote("xyz"), String[].class); 
     assertEquals(1, stringArray.length); 
     assertEquals("xyz", stringArray[0]); 
     List<XBean> xbeanList = mapper.readValue("{\"x\":4}", new TypeReference<List<XBean>>() { 
     }); 
     assertEquals(1, xbeanList.size()); 
     assertEquals(XBean.class, xbeanList.get(0).getClass()); 
     Object ob = mapper.readValue("{\"x\":29}", XBean[].class); 
     XBean[] xbeanArray = (XBean[]) ob; 
     assertEquals(1, xbeanArray.length); 
     assertEquals(XBean.class, xbeanArray[0].getClass()); 
 } 


public void testArrayBlockingQueue420() throws Exception { 
     ArrayBlockingQueue<?> q = MAPPER.readValue("[1, 2, 3]", ArrayBlockingQueue.class); 
     assertNotNull(q); 
     assertEquals(3, q.size()); 
     assertEquals(Integer.valueOf(1), q.take()); 
     assertEquals(Integer.valueOf(2), q.take()); 
     assertEquals(Integer.valueOf(3), q.take()); 
 } 


public void testHashSet491() throws Exception { 
     String JSON = "[ \"KEY1\", \"KEY2\" ]"; 
     EnumSet<Key> result = MAPPER.readValue(JSON, new TypeReference<EnumSet<Key>>() { 
     }); 
     assertNotNull(result); 
     assertTrue(EnumSet.class.isAssignableFrom(result.getClass())); 
     assertEquals(2, result.size()); 
     assertTrue(result.contains(Key.KEY1)); 
     assertTrue(result.contains(Key.KEY2)); 
     assertFalse(result.contains(Key.WHATEVER)); 
 } 


public void testIterableWithStrings496() throws Exception { 
     String JSON = "{ \"values\":[\"a\",\"b\"]}"; 
     ListAsIterable w = MAPPER.readValue(JSON, ListAsIterable.class); 
     assertNotNull(w); 
     assertNotNull(w.values); 
     Iterator<String> it = w.values.iterator(); 
     assertTrue(it.hasNext()); 
     assertEquals("a", it.next()); 
     assertEquals("b", it.next()); 
     assertFalse(it.hasNext()); 
 } 

    

    

    

    /// Test to verify that @JsonDeserialize.using works as expected
    

    // Testing [JACKSON-526], "implicit JSON array" for single-element arrays,
    // mostly produced by Jettison, Badgerfish conversions (from XML)
    

    // [JACKSON-620]: allow "" to mean 'null' for Maps
    

    // [Issue#161]
    

    // [Issue#199]
    

    
}

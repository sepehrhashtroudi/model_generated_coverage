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
    

public void testArrayBlockingQueue419() throws Exception { 
     ArrayBlockingQueue<?> q = MAPPER.readValue("[1, 2, 3]", ArrayBlockingQueue.class); 
     assertNotNull(q); 
     assertEquals(3, q.size()); 
     assertEquals(Integer.valueOf(1), q.take()); 
     assertEquals(Integer.valueOf(2), q.take()); 
     assertEquals(Integer.valueOf(3), q.take()); 
 } 


public void testIterableWithStrings493() throws Exception { 
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

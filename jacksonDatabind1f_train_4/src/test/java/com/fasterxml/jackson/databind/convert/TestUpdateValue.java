package com.fasterxml.jackson.databind.convert;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit tests for verifying that "updating reader" works as
 * expected.
 */
public class TestUpdateValue extends BaseMapTest
{
    /*
    /********************************************************
    /* Helper types
    /********************************************************
     */

    static class Bean {
        public String a = "a";
        public String b = "b";

        public int[] c = new int[] { 1, 2, 3 };

        public Bean child = null;
    }

    static class XYBean {
        public int x, y;
    }

    // [JACKSON-824]
    public class TextView {}
    public class NumView {}

    public class Updateable {
        @JsonView(NumView.class)
        public int num;

        @JsonView(TextView.class)
        public String str;
    }
        
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();


public void testUpdatingWithViews40() throws Exception { 
     Updateable bean = new Updateable(); 
     bean.num = 100; 
     bean.str = "test"; 
     Updateable result = MAPPER.readerForUpdating(bean).withView(TextView.class).readValue("{\"num\": 10, \"str\":\"foobar\"}"); 
     assertSame(bean, result); 
     assertEquals(100, bean.num); 
     assertEquals("foobar", bean.str); 
 } 


public void testUpdateSequence453() throws Exception { 
     XYBean toUpdate = new XYBean(); 
     Iterator<XYBean> it = MAPPER.readerForUpdating(toUpdate).readValues("{\"x\":1,\"y\":2}\n{\"x\":16}{\"y\":37}"); 
     assertTrue(it.hasNext()); 
     XYBean value = it.next(); 
     assertSame(toUpdate, value); 
     assertEquals(1, value.x); 
     assertEquals(2, value.y); 
     assertTrue(it.hasNext()); 
     value = it.next(); 
     assertSame(toUpdate, value); 
     assertEquals(16, value.x); 
     assertEquals(2, value.y); 
     assertTrue(it.hasNext()); 
     value = it.next(); 
     assertSame(toUpdate, value); 
     assertEquals(16, value.x); 
     assertEquals(37, value.y); 
     assertFalse(it.hasNext()); 
 } 

    

    

    

    // Test for [JACKSON-717] -- ensure 'readValues' also does update
    

    // [JACKSON-824]
    
}

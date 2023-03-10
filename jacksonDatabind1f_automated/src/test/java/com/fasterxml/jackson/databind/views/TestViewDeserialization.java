package com.fasterxml.jackson.databind.views;

import com.fasterxml.jackson.annotation.JsonView;

import com.fasterxml.jackson.databind.*;

public class TestViewDeserialization extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    // Classes that represent views
    static class ViewA { }
    static class ViewAA extends ViewA { }
    static class ViewB { }
    static class ViewBB extends ViewB { }
    
    static class Bean
    {
        @JsonView(ViewA.class)
        public int a;

        @JsonView({ViewAA.class, ViewB.class})
        public String aa;

        protected int b;
        
        @JsonView(ViewB.class)
        public void setB(int value) { b = value; }
    }

    static class DefaultsBean
    {
        public int a;

        @JsonView(ViewA.class)
        public int b;
    }

    /*
    /************************************************************************ 
    /* Tests
    /************************************************************************ 
     */

    private final ObjectMapper mapper = new ObjectMapper();
    
public void testSimple184() throws Exception { 
     Bean bean = mapper.readValue("{\"a\":3, \"aa\":\"foo\", \"b\": 9 }", Bean.class); 
     assertEquals(3, bean.a); 
     assertEquals("foo", bean.aa); 
     assertEquals(9, bean.b); 
     bean = mapper.readerWithView(ViewAA.class).withType(Bean.class).readValue("{\"a\":3, \"aa\":\"foo\", \"b\": 9 }"); 
     assertEquals(3, bean.a); 
     assertEquals("foo", bean.aa); 
     assertEquals(0, bean.b); 
     bean = mapper.readerWithView(ViewA.class).withType(Bean.class).readValue("{\"a\":1, \"aa\":\"x\", \"b\": 3 }"); 
     assertEquals(1, bean.a); 
     assertNull(bean.aa); 
     assertEquals(0, bean.b); 
     bean = mapper.reader(Bean.class).withView(ViewB.class).readValue("{\"a\":-3, \"aa\":\"y\", \"b\": 2 }"); 
     assertEquals(0, bean.a); 
     assertEquals("y", bean.aa); 
     assertEquals(2, bean.b); 
 }
    

    
}

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
    

public void testWithoutDefaultInclusion374() throws Exception { 
     DefaultsBean bean = mapper.readValue("{\"a\":3, \"b\": 9 }", DefaultsBean.class); 
     assertEquals(3, bean.a); 
     assertEquals(9, bean.b); 
     ObjectMapper myMapper = new ObjectMapper(); 
     myMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION); 
     bean = myMapper.readerWithView(ViewAA.class).withType(DefaultsBean.class).readValue("{\"a\":1, \"b\": 2 }"); 
     assertEquals(0, bean.a); 
     assertEquals(2, bean.b); 
 } 

    

    
}

package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Testing to verify that {@link JsonTypeInfo} works
 * for properties as well as types (see [JACKSON-280] for details)
 */
@SuppressWarnings("serial")
public class TestPropertyTypeInfo extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class FieldWrapperBean
    {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public Object value;

        public FieldWrapperBean() { }
        public FieldWrapperBean(Object o) { value = o; }
    }

    static class FieldWrapperBeanList extends ArrayList<FieldWrapperBean> { }
    static class FieldWrapperBeanMap extends HashMap<String,FieldWrapperBean> { }
    static class FieldWrapperBeanArray {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public FieldWrapperBean[] beans;

        public FieldWrapperBeanArray() { }
        public FieldWrapperBeanArray(FieldWrapperBean[] beans) { this.beans = beans; }
    }
    
    static class MethodWrapperBean
    {
        private Object value;
        
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public Object getValue() { return value; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public void setValue(Object v) { value = v; }
        
        public MethodWrapperBean() { }
        public MethodWrapperBean(Object o) { value = o; }
    }
    
    static class MethodWrapperBeanList extends ArrayList<MethodWrapperBean> { }
    static class MethodWrapperBeanMap extends HashMap<String,MethodWrapperBean> { }
    static class MethodWrapperBeanArray {
        protected MethodWrapperBean[] beans;

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public MethodWrapperBean[] getValue() { return beans; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public void setValue(MethodWrapperBean[] v) { beans = v; }
        
        public MethodWrapperBeanArray() { }
        public MethodWrapperBeanArray(MethodWrapperBean[] beans) { this.beans = beans; }
    }

    static class OtherBean {
        public int x = 1, y = 1;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testSimpleArrayField74() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     FieldWrapperBeanArray array = new FieldWrapperBeanArray(new FieldWrapperBean[] { new FieldWrapperBean(new BooleanWrapper(true)) }); 
     String json = mapper.writeValueAsString(array); 
     FieldWrapperBeanArray result = mapper.readValue(json, FieldWrapperBeanArray.class); 
     assertNotNull(result); 
     FieldWrapperBean[] beans = result.beans; 
     assertEquals(1, beans.length); 
     FieldWrapperBean bean = beans[0]; 
     assertEquals(BooleanWrapper.class, bean.value.getClass()); 
     assertEquals(((BooleanWrapper) bean.value).b, Boolean.TRUE); 
 } 


public void testSimpleArrayMethod160() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     MethodWrapperBeanArray array = new MethodWrapperBeanArray(new MethodWrapperBean[] { new MethodWrapperBean(new StringWrapper("A")) }); 
     String json = mapper.writeValueAsString(array); 
     MethodWrapperBeanArray result = mapper.readValue(json, MethodWrapperBeanArray.class); 
     assertNotNull(result); 
     MethodWrapperBean[] beans = result.beans; 
     assertEquals(1, beans.length); 
     MethodWrapperBean bean = beans[0]; 
     assertEquals(StringWrapper.class, bean.value.getClass()); 
     assertEquals(((StringWrapper) bean.value).str, "A"); 
 } 


public void testSimpleMapField399() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     FieldWrapperBeanMap map = new FieldWrapperBeanMap(); 
     map.put("foop", new FieldWrapperBean(new IntWrapper(13))); 
     String json = mapper.writeValueAsString(map); 
     FieldWrapperBeanMap result = mapper.readValue(json, FieldWrapperBeanMap.class); 
     assertNotNull(result); 
     assertEquals(1, result.size()); 
     FieldWrapperBean bean = result.get("foop"); 
     assertNotNull(bean); 
     Object ob = bean.value; 
     assertEquals(IntWrapper.class, ob.getClass()); 
     assertEquals(((IntWrapper) ob).i, 13); 
 } 

    

    

    

    

    

    
    
    

    
}

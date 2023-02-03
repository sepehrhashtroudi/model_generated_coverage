package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

public class TestDefaultForArrays extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class ArrayBean {
        public Object[] values;

        public ArrayBean() { this(null); }
        public ArrayBean(Object[] v) { values = v; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Simple unit test for verifying that we get String array
     * back, even though declared type is Object array
     */

public void testArrayTypingNested201() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(DefaultTyping.NON_CONCRETE_AND_ARRAYS); 
     ArrayBean bean = new ArrayBean(new String[0][0]); 
     String json = m.writeValueAsString(bean); 
     ArrayBean result = m.readValue(json, ArrayBean.class); 
     assertNotNull(result.values); 
     assertEquals(String[][].class, result.values.getClass()); 
 } 


public void testArrayTypingSimple212() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(DefaultTyping.NON_CONCRETE_AND_ARRAYS); 
     ArrayBean bean = new ArrayBean(new String[0]); 
     String json = m.writeValueAsString(bean); 
     ArrayBean result = m.readValue(json, ArrayBean.class); 
     assertNotNull(result.values); 
     assertEquals(String[].class, result.values.getClass()); 
 } 


public void testArraysOfArrays275() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY); 
     Object value = new Object[][] { new Object[] {} }; 
     String json = mapper.writeValueAsString(value); 
     _testArraysAs(mapper, json, Object[][].class); 
     _testArraysAs(mapper, json, Object[].class); 
     _testArraysAs(mapper, json, Object.class); 
 } 


public void testNodeInArray377() throws Exception { 
     JsonNode node = new ObjectMapper().readTree("{\"a\":3}"); 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT); 
     Object[] obs = new Object[] { node }; 
     String json = m.writeValueAsString(obs); 
     Object[] result = m.readValue(json, Object[].class); 
     assertEquals(1, result.length); 
     Object ob = result[0]; 
     assertTrue(ob instanceof JsonNode); 
 } 

    

    // And let's try it with deeper array as well
    

    // @since 1.8
    

    // test for [JACKSON-845]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    protected void _testArraysAs(ObjectMapper mapper, String json, Class<?> type)
        throws Exception
    {
        Object o = mapper.readValue(json, type);
        assertNotNull(o);
        assertTrue(o instanceof Object[]);
        Object[] main = (Object[]) o;
        assertEquals(1, main.length);
        Object element = main[0];
        assertNotNull(element);
        assertTrue(element instanceof Object[]);
        assertEquals(0, ((Object[]) element).length);
    }
}

package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

public class TestDefaultForLists
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    /**
     * Wrapper bean needed before there is a way to force
     * type of the root value. Long is used because it is a final
     * type, but not one of "untypeable" ones.
     */
    static class ListOfLongs {
        public List<Long> longs;

        public ListOfLongs() { }
        public ListOfLongs(Long ... ls) {
            longs = new ArrayList<Long>();
            for (Long l: ls) {
                longs.add(l);
            }
        }
    }

    static class ListOfNumbers {
        public List<Number> nums;

        public ListOfNumbers() { }
        public ListOfNumbers(Number ... numbers) {
            nums = new ArrayList<Number>();
            for (Number n : numbers) {
                nums.add(n);
            }
        }
    }

    static class ObjectListBean {
        public List<Object> values;
    }

    interface Foo { }

    static class SetBean {
        public Set<String> names;
        
        public SetBean() { }
        public SetBean(String str) {
            names = new HashSet<String>();
            names.add(str);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    

public void testJackson667116() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY); 
     String json = mapper.writeValueAsString(new SetBean("abc")); 
     SetBean bean = mapper.readValue(json, SetBean.class); 
     assertNotNull(bean); 
     assertTrue(bean.names instanceof HashSet); 
 } 


public void testDateTypes268() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     ObjectListBean input = new ObjectListBean(); 
     List<Object> inputList = new ArrayList<Object>(); 
     inputList.add(TimeZone.getTimeZone("EST")); 
     inputList.add(Locale.CHINESE); 
     input.values = inputList; 
     String json = m.writeValueAsString(input); 
     ObjectListBean output = m.readValue(json, ObjectListBean.class); 
     List<Object> outputList = output.values; 
     assertEquals(2, outputList.size()); 
     assertTrue(outputList.get(0) instanceof TimeZone); 
     assertTrue(outputList.get(1) instanceof Locale); 
 } 


public void testJackson628516() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(DefaultTyping.NON_FINAL); 
     ArrayList<Foo> data = new ArrayList<Foo>(); 
     String json = mapper.writeValueAsString(data); 
     List<?> output = mapper.readValue(json, List.class); 
     assertTrue(output.isEmpty()); 
 } 


public void testListOfNumbers543() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     ListOfNumbers input = new ListOfNumbers(Long.valueOf(1L), Integer.valueOf(2), Double.valueOf(3.0)); 
     String json = m.writeValueAsString(input); 
     assertEquals("{\"nums\":[\"java.util.ArrayList\",[[\"java.lang.Long\",1],2,3.0]]}", json); 
     ListOfNumbers output = m.readValue(json, ListOfNumbers.class); 
     assertNotNull(output.nums); 
     assertEquals(3, output.nums.size()); 
     assertEquals(Long.valueOf(1L), output.nums.get(0)); 
     assertEquals(Integer.valueOf(2), output.nums.get(1)); 
     assertEquals(Double.valueOf(3.0), output.nums.get(2)); 
 } 

    

    /**
     * Then bit more heterogenous list; also tests mixing of
     * regular scalar types, and non-typed ones (int and double
     * will never have type info added; other numbers will if
     * necessary)
     */
    

    
    
    

    
}

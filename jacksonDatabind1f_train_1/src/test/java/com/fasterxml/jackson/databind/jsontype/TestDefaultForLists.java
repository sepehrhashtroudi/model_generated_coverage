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
    

public void testDateTypes269() throws Exception { 
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

    

    /**
     * Then bit more heterogenous list; also tests mixing of
     * regular scalar types, and non-typed ones (int and double
     * will never have type info added; other numbers will if
     * necessary)
     */
    

    
    
    

    
}

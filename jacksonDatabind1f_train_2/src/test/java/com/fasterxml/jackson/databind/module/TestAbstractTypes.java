package com.fasterxml.jackson.databind.module;

import java.util.*;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestAbstractTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes; simple beans and their handlers
    /**********************************************************
     */

    static class MyString implements CharSequence
    {
        protected String value;
        
        public MyString(String s) { value = s; }

        @Override
        public char charAt(int index) {
            return value.charAt(index);
        }

        @Override
        public int length() {
            return value.length();
        }

        @Override
        public CharSequence subSequence(int arg0, int arg1) { return this; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testMapDefaulting236() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); 
     mod.addAbstractTypeMapping(Map.class, TreeMap.class); 
     mapper.registerModule(mod); 
     Map<?, ?> result = mapper.readValue("{}", Map.class); 
     assertEquals(TreeMap.class, result.getClass()); 
 } 


public void testInterfaceDefaulting413() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); 
     mod.addAbstractTypeMapping(CharSequence.class, MyString.class); 
     mapper.registerModule(mod); 
     Object result = mapper.readValue(quote("abc"), CharSequence.class); 
     assertEquals(MyString.class, result.getClass()); 
     assertEquals("abc", ((MyString) result).value); 
 } 

    

    
    
    
}

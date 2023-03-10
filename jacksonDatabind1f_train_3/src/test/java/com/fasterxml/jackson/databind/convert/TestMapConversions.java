package com.fasterxml.jackson.databind.convert;

import java.util.*;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

public class TestMapConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper mapper = new ObjectMapper();

    enum AB { A, B; }

    static class Bean {
        public Integer A;
        public String B;
    }
    
    /**
     * Test that verifies that we can go between couple of types of Maps...
     */

public void testBeanToMap237() { 
     Bean bean = new Bean(); 
     bean.A = 129; 
     bean.B = "13"; 
     EnumMap<AB, String> result = mapper.convertValue(bean, new TypeReference<EnumMap<AB, String>>() { 
     }); 
     assertEquals("129", result.get(AB.A)); 
     assertEquals("13", result.get(AB.B)); 
 } 


public void testMapToMap498() { 
     Map<String, Integer> input = new LinkedHashMap<String, Integer>(); 
     input.put("A", Integer.valueOf(3)); 
     input.put("B", Integer.valueOf(-4)); 
     Map<AB, String> output = mapper.convertValue(input, new TypeReference<Map<AB, String>>() { 
     }); 
     assertEquals(2, output.size()); 
     assertEquals("3", output.get(AB.A)); 
     assertEquals("-4", output.get(AB.B)); 
     Map<String, Integer> roundtrip = mapper.convertValue(input, new TypeReference<TreeMap<String, Integer>>() { 
     }); 
     assertEquals(2, roundtrip.size()); 
     assertEquals(Integer.valueOf(3), roundtrip.get("A")); 
     assertEquals(Integer.valueOf(-4), roundtrip.get("B")); 
 } 

    

    

    
}

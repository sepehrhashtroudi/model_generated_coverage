package com.fasterxml.jackson.databind.deser;

import java.io.IOException;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestNullHandling extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class FunnyNullDeserializer extends JsonDeserializer<String>
    {
        @Override
        public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return "text";
        }

        @Override
        public String getNullValue() { return "funny"; }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    // Test for [JACKSON-643]

public void testCustomRootNulls438() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule module = new SimpleModule("test", Version.unknownVersion()); 
     module.addDeserializer(String.class, new FunnyNullDeserializer()); 
     mapper.registerModule(module); 
     String str = mapper.readValue("null", String.class); 
     assertNotNull(str); 
     assertEquals("funny", str); 
     ObjectReader reader = mapper.reader(String.class); 
     str = reader.readValue("null"); 
     assertNotNull(str); 
     assertEquals("funny", str); 
 } 

    
}

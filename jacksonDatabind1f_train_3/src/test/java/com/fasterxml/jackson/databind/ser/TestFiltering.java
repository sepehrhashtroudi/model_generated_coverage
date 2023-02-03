package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.*;

/**
 * Tests for verifying that bean property filtering using JsonFilter
 * works as expected.
 */
public class TestFiltering extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    @JsonFilter("RootFilter")
    static class Bean {
        public String a = "a";
        public String b = "b";
    }

    
    // [Issue#89]
    static class Pod
    {
        protected String username;

//        @JsonProperty(value = "user_password")
        protected String userPassword;

        public String getUsername() {
            return username;
        }

        public void setUsername(String value) {
            this.username = value;
        }

        @JsonIgnore
        @JsonProperty(value = "user_password")
        public java.lang.String getUserPassword() {
            return userPassword;
        }

        @JsonProperty(value = "user_password")
        public void setUserPassword(String value) {
            this.userPassword = value;
        }

    }    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    

public void testSimpleInclusionFilter6() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     FilterProvider prov = new SimpleFilterProvider().addFilter("RootFilter", SimpleBeanPropertyFilter.filterOutAllExcept("a")); 
     assertEquals("{\"a\":\"a\"}", mapper.writer(prov).writeValueAsString(new Bean())); 
     mapper = new ObjectMapper(); 
     mapper.setFilters(prov); 
     assertEquals("{\"a\":\"a\"}", mapper.writeValueAsString(new Bean())); 
 } 


public void testSimpleExclusionFilter178() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     FilterProvider prov = new SimpleFilterProvider().addFilter("RootFilter", SimpleBeanPropertyFilter.serializeAllExcept("a")); 
     assertEquals("{\"b\":\"b\"}", mapper.writer(prov).writeValueAsString(new Bean())); 
 } 


public void testMissingFilter396() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     try { 
         mapper.writeValueAsString(new Bean()); 
         fail("Should have failed without configured filter"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Can not resolve BeanPropertyFilter with id 'RootFilter'"); 
     } 
     SimpleFilterProvider fp = new SimpleFilterProvider().setFailOnUnknownId(false); 
     mapper.setFilters(fp); 
     String json = mapper.writeValueAsString(new Bean()); 
     assertEquals("{\"a\":\"a\",\"b\":\"b\"}", json); 
 } 

    

    

    // should handle missing case gracefully
    
    
    // defaulting, as per [JACKSON-449]
    

    // [Issue#89] combining @JsonIgnore, @JsonProperty
    
}

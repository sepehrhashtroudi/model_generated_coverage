package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying [JACKSON-132] implementation.
 */
public class TestUnwrapped extends BaseMapTest
{
    static class Unwrapping {
        public String name;
        @JsonUnwrapped
        public Location location;

        public Unwrapping() { }
        public Unwrapping(String str, int x, int y) {
            name = str;
            location = new Location(x, y);
        }
    }

    static class DeepUnwrapping
    {
        @JsonUnwrapped
        public Unwrapping unwrapped;

        public DeepUnwrapping() { }
        public DeepUnwrapping(String str, int x, int y) {
            unwrapped = new Unwrapping(str, x, y);
        }
    }
    
    static class UnwrappingWithCreator {
        public String name;

        @JsonUnwrapped
        public Location location;

        @JsonCreator
        public UnwrappingWithCreator(@JsonProperty("name") String n) {
            name = n;
        }
    }
    
    final static class Location {
        public int x;
        public int y;

        public Location() { }
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Class with two unwrapped properties
    static class TwoUnwrappedProperties {
        @JsonUnwrapped
        public Location location;
        @JsonUnwrapped
        public Name name;

        public TwoUnwrappedProperties() { }
    }

    static class Name {
        public String first, last;
    }

    /*
    /**********************************************************
    /* Tests, serialization
    /**********************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();
    
public void testSimpleUnwrappedDeserialize85() throws Exception { 
     Unwrapping bean = mapper.readValue("{\"name\":\"Tatu\",\"y\":7,\"x\":-13}", Unwrapping.class); 
     assertEquals("Tatu", bean.name); 
     Location loc = bean.location; 
     assertNotNull(loc); 
     assertEquals(-13, loc.x); 
     assertEquals(7, loc.y); 
 }
public void testDeepUnwrappingSerialize111() throws Exception { 
     assertEquals("{\"name\":\"Tatu\",\"x\":1,\"y\":2}", mapper.writeValueAsString(new DeepUnwrapping("Tatu", 1, 2))); 
 }
    
    

    /*
    /**********************************************************
    /* Tests, deserialization
    /**********************************************************
     */
    
    
    
    
    
    
    
    

    // 22-Apr-2013, tatu: Commented out as it can't be simply fixed; requires implementing
    //    deep-update/merge. But leaving here to help with that effort, if/when it proceeds.
    
    /*
    
    // [Issue#211]: Actually just variant of #160
    
    static class Issue211Bean {
        public String test1;

        public String test2;
        @JsonUnwrapped
        public Issue211Unwrapped unwrapped;
    }

    static class Issue211Unwrapped {
        public String test3;
        public String test4;
    }
    
    public void testIssue211() throws Exception
    {
         Issue211Bean bean = new Issue211Bean();
         bean.test1 = "Field 1";
         bean.test2 = "Field 2";
         Issue211Unwrapped tJackson2 = new Issue211Unwrapped();
         tJackson2.test3 = "Field 3";
         tJackson2.test4 = "Field 4";
         bean.unwrapped = tJackson2;
 
         final String JSON = "{\"test1\": \"Field 1 merged\", \"test3\": \"Field 3 merged\"}";
         ObjectMapper o = new ObjectMapper();
         Issue211Bean result = o.readerForUpdating(bean).withType(Issue211Bean.class).readValue(JSON);
         assertSame(bean, result);
         assertEquals("Field 1 merged", result.test1);
         assertEquals("Field 2", result.test2);
         assertNotNull(result.unwrapped);
         assertEquals("Field 3 merged", result.unwrapped.test3);
         assertEquals("Field 4", result.unwrapped.test4);
    }  
    */
}

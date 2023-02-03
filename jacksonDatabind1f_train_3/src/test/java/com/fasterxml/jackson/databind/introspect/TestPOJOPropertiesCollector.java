package com.fasterxml.jackson.databind.introspect;

import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class TestPOJOPropertiesCollector
    extends BaseMapTest
{
    static class Simple {
        public int value;
        
        @JsonProperty("value")
        public void valueSetter(int v) { value = v; }

        @JsonProperty("value")
        public int getFoobar() { return value; }
    }

    static class SimpleFieldDeser
    {
        @JsonDeserialize String[] values;
    }
    
    static class SimpleGetterVisibility {
        public int getA() { return 0; }
        protected int getB() { return 1; }
        @SuppressWarnings("unused")
        private int getC() { return 2; }
    }
    
    // Class for testing 'shared ignore'
    static class Empty {
        public int value;
        
        public void setValue(int v) { value = v; }

        @JsonIgnore
        public int getValue() { return value; }
    }

    static class IgnoredSetter {
        @JsonProperty
        public int value;
        
        @JsonIgnore
        public void setValue(int v) { value = v; }

        public int getValue() { return value; }
    }

    static class ImplicitIgnores {
        @JsonIgnore public int a;
        @JsonIgnore public void setB(int b) { }
        public int c;
    }
    
    // Should find just one setter for "y", due to partial ignore
    static class IgnoredRenamedSetter {
        @JsonIgnore public void setY(int value) { }
        @JsonProperty("y") void foobar(int value) { }
    }
    
    // should produce a single property, "x"
    static class RenamedProperties {
        @JsonProperty("x")
        public int value;
        
        public void setValue(int v) { value = v; }

        public int getX() { return value; }
    }

    static class RenamedProperties2
    {
        @JsonProperty("renamed")
        public int getValue() { return 1; }
        public void setValue(int x) { }
    }
    
    // Testing that we can "merge" properties with renaming
    static class MergedProperties {
        public int x;
        
        @JsonProperty("x")
        public void setFoobar(int v) { x = v; }
    }

    // Testing that property order is obeyed, even for deserialization purposes
    @JsonPropertyOrder({"a", "b", "c", "d"})
    static class SortedProperties
    {
        public int b;
        public int c;
        
        public void setD(int value) { }
        public void setA(int value) { }
    }

    // [JACKSON-700]: test property type detection, selection
    static class TypeTestBean
    {
        protected Long value;

        @JsonCreator
        public TypeTestBean(@JsonProperty("value") String value) { }

        // If you remove this method, the test will pass
        public Integer getValue() { return 0; }
    }

    static class Jackson703
    {
        private List<FoodOrgLocation> location = new ArrayList<FoodOrgLocation>();

        {
            location.add(new FoodOrgLocation());
        }

        public List<FoodOrgLocation> getLocation() { return location; } 
    }
    
    static class FoodOrgLocation
    {
        protected Long id;
        public String name;
        protected Location location;

        public FoodOrgLocation() {
            location = new Location();
        }

        public FoodOrgLocation(final Location foodOrg) { }
                
        public FoodOrgLocation(final Long id, final String name, final Location location) { }

        public Location getLocation() { return location; }
    }

    static class Location {
        public BigDecimal lattitude;
        public BigDecimal longitude;

        public Location() { }

        public Location(final BigDecimal lattitude, final BigDecimal longitude) { }
    }

    class Issue701Bean { // important: non-static!
        private int i;

        // annotation does not matter -- just need one on the last argument
        public Issue701Bean(@JsonProperty int i) { this.i = i; }

        public int getX() { return i; }
    }

    static class Issue744Bean
    {
        protected Map<String,Object> additionalProperties;
        
        @JsonAnySetter
        public void addAdditionalProperty(String key, Object value) {
            if (additionalProperties == null) additionalProperties = new HashMap<String, Object>();
            additionalProperties.put(key,value);
        }
        
        public void setAdditionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties = additionalProperties;
        }

        @JsonAnyGetter
        public Map<String,Object> getAdditionalProperties() { return additionalProperties; }

        @JsonIgnore
        public String getName() {
           return (String) additionalProperties.get("name");
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();
    

public void testMergeWithRename85() { 
     POJOPropertiesCollector coll = collector(mapper, MergedProperties.class, true); 
     Map<String, POJOPropertyBuilder> props = coll.getPropertyMap(); 
     assertEquals(1, props.size()); 
     POJOPropertyBuilder prop = props.get("x"); 
     assertNotNull(prop); 
     assertTrue(prop.hasSetter()); 
     assertFalse(prop.hasGetter()); 
     assertTrue(prop.hasField()); 
 } 


public void testPartialIgnore87() { 
     POJOPropertiesCollector coll = collector(mapper, IgnoredSetter.class, true); 
     Map<String, POJOPropertyBuilder> props = coll.getPropertyMap(); 
     assertEquals(1, props.size()); 
     POJOPropertyBuilder prop = props.get("value"); 
     assertNotNull(prop); 
     assertFalse(prop.hasSetter()); 
     assertTrue(prop.hasGetter()); 
     assertTrue(prop.hasField()); 
 } 


public void testJackson74489() throws Exception { 
     BasicBeanDescription beanDesc = mapper.getDeserializationConfig().introspect(mapper.constructType(Issue744Bean.class)); 
     assertNotNull(beanDesc); 
     AnnotatedMethod setter = beanDesc.findAnySetter(); 
     assertNotNull(setter); 
 } 


public void testSimpleRenamed2302() { 
     POJOPropertiesCollector coll = collector(mapper, RenamedProperties2.class, true); 
     Map<String, POJOPropertyBuilder> props = coll.getPropertyMap(); 
     assertEquals(1, props.size()); 
     POJOPropertyBuilder prop = props.get("renamed"); 
     assertNotNull(prop); 
     assertTrue(prop.hasSetter()); 
     assertTrue(prop.hasGetter()); 
     assertFalse(prop.hasField()); 
 } 


public void testJackson703415() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(MapperFeature.USE_ANNOTATIONS, false); 
     BasicBeanDescription beanDesc = mapper.getSerializationConfig().introspect(mapper.constructType(Jackson703.class)); 
     assertNotNull(beanDesc); 
     Jackson703 bean = new Jackson703(); 
     String json = mapper.writeValueAsString(bean); 
     assertNotNull(json); 
 } 


public void testInnerClassWithAnnotationsInCreator419() throws Exception { 
     BasicBeanDescription beanDesc; 
     beanDesc = mapper.getSerializationConfig().introspect(mapper.constructType(Issue701Bean.class)); 
     assertNotNull(beanDesc); 
     beanDesc = mapper.getDeserializationConfig().introspect(mapper.constructType(Issue701Bean.class)); 
     assertNotNull(beanDesc); 
 } 


public void testSimpleIgnoreAndRename440() { 
     POJOPropertiesCollector coll = collector(mapper, IgnoredRenamedSetter.class, true); 
     Map<String, POJOPropertyBuilder> props = coll.getPropertyMap(); 
     assertEquals(1, props.size()); 
     POJOPropertyBuilder prop = props.get("y"); 
     assertNotNull(prop); 
     assertTrue(prop.hasSetter()); 
     assertFalse(prop.hasGetter()); 
     assertFalse(prop.hasField()); 
 } 

    

    

    
    
    // Unit test for verifying that a single @JsonIgnore can remove the
    // whole property, unless explicit property marker exists
    

    // Unit test for verifying handling of 'partial' @JsonIgnore; that is,
    // if there is at least one explicit annotation to indicate property,
    // only parts that are ignored are, well, ignored
    

    

    

    
    
    

    

    

    

    

    // for [JACKSON-701]
    

    

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    protected POJOPropertiesCollector collector(ObjectMapper mapper,
            Class<?> cls, boolean forSerialization)
    {
        BasicClassIntrospector bci = new BasicClassIntrospector();
        // no real difference between serialization, deserialization, at least here
        if (forSerialization) {
            return bci.collectProperties(mapper.getSerializationConfig(),
                    mapper.constructType(cls), null, true, "set");
        }
        return bci.collectProperties(mapper.getDeserializationConfig(),
                mapper.constructType(cls), null, false, "set");
    }
}

package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestTypedDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    /**
     * Polymorphic base class
     */
    @JsonTypeInfo(use=Id.CLASS, include=As.PROPERTY, property="@classy")
    static abstract class Animal {
        public String name;
        
        protected Animal(String n)  { name = n; }
    }

    @JsonTypeName("doggie")
    static class Dog extends Animal
    {
        public int boneCount;
        
        @JsonCreator
        public Dog(@JsonProperty("name") String name) {
            super(name);
        }

        public void setBoneCount(int i) { boneCount = i; }
    }
    
    @JsonTypeName("kitty")
    static class Cat extends Animal
    {
        public String furColor;

        @JsonCreator
        public Cat(@JsonProperty("furColor") String c) {
            super(null);
            furColor = c;
        }

        public void setName(String n) { name = n; }
    }

    // for [JACKSON-319] -- allow "empty" beans
    @JsonTypeName("fishy")
    static class Fish extends Animal
    {
        @JsonCreator
        public Fish()
        {
            super(null);
        }
    }

    static class AnimalContainer {
        public Animal animal;
    }

    // base class with no useful info
    @JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_ARRAY)
    static abstract class DummyBase {
        protected DummyBase(boolean foo) { }
    }

    static class DummyImpl extends DummyBase {
        public int x;

        public DummyImpl() { super(true); }
    }
    
    @JsonTypeInfo(use=Id.MINIMAL_CLASS, include=As.WRAPPER_OBJECT)
    interface TypeWithWrapper { }

    @JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_ARRAY)
    interface TypeWithArray { }

    static class Issue506DateBean {
        @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type2")
        public Date date;
    }
        
    static class Issue506NumberBean
    {
        @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type3")
        @JsonSubTypes({ @Type(Long.class),
            @Type(Integer.class) })
        public Number number;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * First things first, let's ensure we can serialize using
     * class name, written as main-level property name
     */

public void testListAsArray81() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     String JSON = "[\n" + asJSONObjectValueString(m, "@classy", Cat.class.getName(), "name", "Hello", "furColor", "white") + ",\n" + asJSONObjectValueString(m, "boneCount", Integer.valueOf(1), "@classy", Dog.class.getName(), "name", "Bob") + ",\n" + asJSONObjectValueString(m, "@classy", Fish.class.getName()) + ", null\n]"; 
     JavaType expType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Animal.class); 
     List<Animal> animals = m.readValue(JSON, expType); 
     assertNotNull(animals); 
     assertEquals(4, animals.size()); 
     Cat c = (Cat) animals.get(0); 
     assertEquals("Hello", c.name); 
     assertEquals("white", c.furColor); 
     Dog d = (Dog) animals.get(1); 
     assertEquals("Bob", d.name); 
     assertEquals(1, d.boneCount); 
     Fish f = (Fish) animals.get(2); 
     assertNotNull(f); 
     assertNull(animals.get(3)); 
 } 


public void testIssue506WithNumber155() throws Exception { 
     Issue506NumberBean input = new Issue506NumberBean(); 
     input.number = Long.valueOf(4567L); 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(input); 
     Issue506NumberBean output = mapper.readValue(json, Issue506NumberBean.class); 
     assertEquals(input.number, output.number); 
 } 


public void testTypeAsArray324() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.addMixInAnnotations(Animal.class, TypeWithArray.class); 
     String JSON = "[\"" + Dog.class.getName() + "\", " + asJSONObjectValueString(m, "name", "Martti", "boneCount", "11") + " ]"; 
     Animal a = m.readValue(JSON, Animal.class); 
     assertEquals(Dog.class, a.getClass()); 
     Dog d = (Dog) a; 
     assertEquals("Martti", d.name); 
     assertEquals(11, d.boneCount); 
 } 

    

    // Test inclusion using wrapper style
    

    // Test inclusion using 2-element array
    

    // Use basic Animal as contents of a regular List
    

    

    /**
     * Test that verifies that there are few limitations on polymorphic
     * base class.
     */
    

    // [JACKSON-506], wrt Date
    
    
    // [JACKSON-506], wrt Number
    
}



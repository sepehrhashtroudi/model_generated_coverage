package com.fasterxml.jackson.databind.creators;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that it is possible to annotate
 * various kinds of things with {@link JsonCreator} annotation.
 */
public class TestPolymorphicCreators
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    static class Animal
    {
        // All animals have names, for our demo purposes...
        public String name;

        protected Animal() { }

        /**
         * Creator method that can instantiate instances of
         * appropriate polymoprphic type
         */
        @JsonCreator
        public static Animal create(@JsonProperty("type") String type)
        {
	    if ("dog".equals(type)) {
		return new Dog();
	    }
	    if ("cat".equals(type)) {
		return new Cat();
	    }
	    throw new IllegalArgumentException("No such animal type ('"+type+"')");
        }
    }

    static class Dog extends Animal
    {
        double barkVolume; // in decibels
        public Dog() { }
        public void setBarkVolume(double v) { barkVolume = v; }
    }

    static class Cat extends Animal
    {
        boolean likesCream;
        public int lives;
        public Cat() { }
        public void setLikesCream(boolean likesCreamSurely) { likesCream = likesCreamSurely; }
    }

    abstract static class AbstractRoot
    {
        private final String opt;

        private AbstractRoot(String opt) {
            this.opt = opt;
        }

        @JsonCreator
        public static final AbstractRoot make(@JsonProperty("which") int which,
            @JsonProperty("opt") String opt) {
            if(1 == which) {
                return new One(opt);
            }
            throw new RuntimeException("cannot instantiate " + which);
        }

        abstract public int getWhich();

        public final String getOpt() {
                return opt;
        }
    }

    static final class One extends AbstractRoot {
        private One(String opt) {
            super(opt);
        }

        @Override public int getWhich() {
            return 1;
        }
    }
    
    /*
    /**********************************************************
    /* Actual tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * Simple test to verify that it is possible to implement polymorphic
     * deserialization manually.
     */

public void testManualPolymorphicDog71() throws Exception { 
     Animal animal = MAPPER.readValue("{ \"type\":\"dog\", \"name\":\"Fido\", \"barkVolume\" : 95.0 }", Animal.class); 
     assertEquals(Dog.class, animal.getClass()); 
     assertEquals("Fido", animal.name); 
     assertEquals(95.0, ((Dog) animal).barkVolume); 
 } 


public void testManualPolymorphicCatWithReorder371() throws Exception { 
     Animal animal = MAPPER.readValue("{ \"likesCream\":true, \"name\" : \"Venla\", \"type\":\"cat\" }", Animal.class); 
     assertEquals(Cat.class, animal.getClass()); 
     assertEquals("Venla", animal.name); 
     assertTrue(((Cat) animal).likesCream); 
 } 

    

    

    

    
}

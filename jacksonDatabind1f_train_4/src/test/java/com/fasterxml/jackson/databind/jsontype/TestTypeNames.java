package com.fasterxml.jackson.databind.jsontype;

import java.util.*;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Separate tests for verifying that "type name" type id mechanism
 * works.
 * 
 * @author tatu
 */
public class TestTypeNames extends BaseMapTest
{
    @SuppressWarnings("serial")
    static class AnimalMap extends LinkedHashMap<String,Animal> { }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testSerialization109() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertEquals("[{\"doggy\":{\"name\":\"Spot\",\"ageInYears\":3}}]", m.writeValueAsString(new Animal[] { new Dog("Spot", 3) })); 
     assertEquals("[{\"MaineCoon\":{\"name\":\"Belzebub\",\"purrs\":true}}]", m.writeValueAsString(new Animal[] { new MaineCoon("Belzebub", true) })); 
 } 


public void testRoundTripMap195() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     AnimalMap input = new AnimalMap(); 
     input.put("venla", new MaineCoon("Venla", true)); 
     input.put("ama", new Dog("Amadeus", 13)); 
     String json = m.writeValueAsString(input); 
     AnimalMap output = m.readValue(json, AnimalMap.class); 
     assertEquals(input, output); 
 } 

    

    

    
}

/*
/**********************************************************
/* Helper types
/**********************************************************
 */

@JsonTypeInfo(use=Id.NAME, include=As.WRAPPER_OBJECT)
@JsonSubTypes({
    @Type(value=Dog.class, name="doggy"),
    @Type(Cat.class) /* defaults to "TestTypedNames$Cat" then */
})
class Animal
{
    public String name;


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;
        return name.equals(((Animal) o).name);
    }

}

class Dog extends Animal
{
    public int ageInYears;

    public Dog() { }
    public Dog(String n, int y) {
        name = n;
        ageInYears = y;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o)
            && ((Dog) o).ageInYears == ageInYears;
    }
}

@JsonSubTypes({
    @Type(MaineCoon.class),
    @Type(Persian.class)
})
abstract class Cat extends Animal {
    public boolean purrs;
    public Cat() { }
    public Cat(String n, boolean p) {
        name = n;
        purrs = p;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && ((Cat) o).purrs == purrs;
    }
}

/* uses default name ("MaineCoon") since there's no @JsonTypeName,
 * nor did supertype specify name
 */
class MaineCoon extends Cat {
    public MaineCoon() { super(); }
    public MaineCoon(String n, boolean p) {
        super(n, p);
    }
}

@JsonTypeName("persialaisKissa")
class Persian extends Cat {
    public Persian() { super(); }
    public Persian(String n, boolean p) {
        super(n, p);
    }
}


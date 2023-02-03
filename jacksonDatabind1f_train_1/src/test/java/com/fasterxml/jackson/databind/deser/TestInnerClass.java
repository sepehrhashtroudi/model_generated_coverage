package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;

public class TestInnerClass extends BaseMapTest
{
    // [JACKSON-594]
    static class Dog
    {
      public String name;
      public Brain brain;

      public Dog() { }
      public Dog(String n, boolean thinking) {
          name = n;
          brain = new Brain();
          brain.isThinking = thinking;
      }
      
      // note: non-static
      public class Brain {
          public boolean isThinking;

          public String parentName() { return name; }
      }
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */


public void testSimpleNonStaticInner359() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     Dog input = new Dog("Smurf", true); 
     String json = mapper.writeValueAsString(input); 
     Dog output = mapper.readValue(json, Dog.class); 
     assertEquals("Smurf", output.name); 
     assertNotNull(output.brain); 
     assertTrue(output.brain.isThinking); 
     assertEquals("Smurf", output.brain.parentName()); 
     output.name = "Foo"; 
     assertEquals("Foo", output.brain.parentName()); 
 } 

    
}

package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestPOJOAsArrayAdvanced extends BaseMapTest
{
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder(alphabetic=true)
    static class CreatorAsArray
    {
        protected int x, y;
        public int a, b;

        @JsonCreator
        public CreatorAsArray(@JsonProperty("x") int x, @JsonProperty("y") int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }
    }

    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder({"a","b","x","y"})
    static class CreatorAsArrayShuffled
    {
        protected int x, y;
        public int a, b;

        @JsonCreator
        public CreatorAsArrayShuffled(@JsonProperty("x") int x, @JsonProperty("y") int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }
    }

    static class ViewA { }
    static class ViewB { }
    
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder(alphabetic=true)
    static class AsArrayWithView
    {
        @JsonView(ViewA.class)
        public int a;
        @JsonView(ViewB.class)
        public int b;
        public int c;
    }
    
    /*
    /*****************************************************
    /* Basic tests
    /*****************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();


public void testWithView233() throws Exception { 
     AsArrayWithView input = new AsArrayWithView(); 
     input.a = 1; 
     input.b = 2; 
     input.c = 3; 
     String json = MAPPER.writerWithView(ViewA.class).writeValueAsString(input); 
     assertEquals("[1,null,3]", json); 
     AsArrayWithView output = MAPPER.reader(AsArrayWithView.class).withView(ViewB.class).readValue("[1,2,3]"); 
     assertEquals(3, output.c); 
     assertEquals(2, output.b); 
     assertEquals(0, output.a); 
 } 

    

    

    // Same as above, but ordering of properties different...
    
}

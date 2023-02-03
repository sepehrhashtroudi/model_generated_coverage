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


public void testWithCreatorsShuffled525() throws Exception { 
     CreatorAsArrayShuffled input = new CreatorAsArrayShuffled(3, 4); 
     input.a = 1; 
     input.b = 2; 
     String json = MAPPER.writeValueAsString(input); 
     assertEquals("[1,2,3,4]", json); 
     CreatorAsArrayShuffled output = MAPPER.readValue(json, CreatorAsArrayShuffled.class); 
     assertEquals(1, output.a); 
     assertEquals(2, output.b); 
     assertEquals(3, output.x); 
     assertEquals(4, output.y); 
 } 


public void testWithCreatorsOrdered526() throws Exception { 
     CreatorAsArray input = new CreatorAsArray(3, 4); 
     input.a = 1; 
     input.b = 2; 
     String json = MAPPER.writeValueAsString(input); 
     assertEquals("[3,4,1,2]", json); 
     CreatorAsArray output = MAPPER.readValue(json, CreatorAsArray.class); 
     assertEquals(1, output.a); 
     assertEquals(2, output.b); 
     assertEquals(3, output.x); 
     assertEquals(4, output.y); 
 } 

    

    

    // Same as above, but ordering of properties different...
    
}

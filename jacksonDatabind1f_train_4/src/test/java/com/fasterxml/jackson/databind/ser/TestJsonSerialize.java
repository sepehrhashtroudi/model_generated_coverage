package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This unit test suite tests use of @JsonClass Annotation
 * with bean serialization.
 */
public class TestJsonSerialize
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    interface ValueInterface {
        public int getX();
    }

    static class ValueClass
        implements ValueInterface
    {
        @Override
        public int getX() { return 3; }
        public int getY() { return 5; }
    }

    /**
     * Test class to verify that <code>JsonSerialize.as</code>
     * works as expected
     */
    static class WrapperClassForAs
    {
        @JsonSerialize(as=ValueInterface.class)
        public ValueClass getValue() {
            return new ValueClass();
        }
    }

    // This should indicate that static type be used for all fields
    @JsonSerialize(typing=JsonSerialize.Typing.STATIC)
    static class WrapperClassForStaticTyping
    {
        public ValueInterface getValue() {
            return new ValueClass();
        }
    }

    static class WrapperClassForStaticTyping2
    {
        @JsonSerialize(typing=JsonSerialize.Typing.STATIC)
        public ValueInterface getStaticValue() {
            return new ValueClass();
        }

        @JsonSerialize(typing=JsonSerialize.Typing.DYNAMIC)
        public ValueInterface getDynamicValue() {
            return new ValueClass();
        }
    }

    /**
     * Test bean that has an invalid {@link JsonSerialize} annotation.
     */
    static class BrokenClass
    {
        // invalid annotation: String not a supertype of Long
        @JsonSerialize(as=String.class)
        public Long getValue() {
            return Long.valueOf(4L);
        }
    }

    @SuppressWarnings("serial")
    static class ValueMap extends HashMap<String,ValueInterface> { }
    @SuppressWarnings("serial")
    static class ValueList extends ArrayList<ValueInterface> { }
    @SuppressWarnings("serial")
    static class ValueLinkedList extends LinkedList<ValueInterface> { }
    
    // Classes for [JACKSON-294]
    static class Foo294
    {
        @JsonProperty private String id;
        @JsonSerialize(using = Bar294Serializer.class)
        private Bar294 bar;

        public Foo294() { }
        public Foo294(String id, String id2) {
            this.id = id;
            bar = new Bar294(id2);
        }
    }

    static class Bar294{
        @JsonProperty private String id;
        @JsonProperty private String name;

        public Bar294() { }
        public Bar294(String id) {
            this.id = id;
        }

        public String getId() { return id; }
        public String getName() { return name; }
    }

    static class Bar294Serializer extends JsonSerializer<Bar294>
    {
        @Override
        public void serialize(Bar294 bar, JsonGenerator jgen,
            SerializerProvider provider) throws IOException
        {
            jgen.writeString(bar.id);
        }
    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */


@SuppressWarnings("unchecked") 
 public void testSimpleValueDefinition16() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Map<String, Object> result = writeAndMap(m, new WrapperClassForAs()); 
     assertEquals(1, result.size()); 
     Object ob = result.get("value"); 
     result = (Map<String, Object>) ob; 
     assertEquals(1, result.size()); 
     assertEquals(Integer.valueOf(3), result.get("x")); 
 } 


public void testStaticTypingWithArrayList138() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(MapperFeature.USE_STATIC_TYPING, true); 
     ValueList list = new ValueList(); 
     list.add(new ValueClass()); 
     assertEquals("[{\"x\":3}]", m.writeValueAsString(list)); 
 } 


public void testStaticTypingWithLinkedList394() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(MapperFeature.USE_STATIC_TYPING, true); 
     ValueLinkedList list = new ValueLinkedList(); 
     list.add(new ValueClass()); 
     assertEquals("[{\"x\":3}]", serializeAsString(m, list)); 
 } 


public void testBrokenAnnotation422() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     try { 
         serializeAsString(m, new BrokenClass()); 
     } catch (Exception e) { 
         verifyException(e, "not a super-type of"); 
     } 
 } 


public void testProblem294423() throws Exception { 
     assertEquals("{\"id\":\"fooId\",\"bar\":\"barId\"}", new ObjectMapper().writeValueAsString(new Foo294("fooId", "barId"))); 
 } 


@SuppressWarnings("unchecked") 
 public void testStaticTypingForClass459() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Map<String, Object> result = writeAndMap(m, new WrapperClassForStaticTyping()); 
     assertEquals(1, result.size()); 
     Object ob = result.get("value"); 
     result = (Map<String, Object>) ob; 
     assertEquals(1, result.size()); 
     assertEquals(Integer.valueOf(3), result.get("x")); 
 } 

    

    

    

    

    

    

    
    
    

    
    
}

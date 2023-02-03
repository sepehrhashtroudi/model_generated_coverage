package com.fasterxml.jackson.databind.ser;

import java.io.StringWriter;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for verifying functioning of [JACKSON-195], ability to
 * force specific root type for serialization (super type of value)
 */
public class TestRootType
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    interface BaseInterface {
        int getB();
    }
    
    static class BaseType
        implements BaseInterface
    {
        public String a = "a";

        @Override
        public int getB() { return 3; }
    }

    static class SubType extends BaseType {
        public String a2 = "x";
        
        public boolean getB2() { return true; }
    }

    @JsonTypeInfo(use=Id.NAME, include=As.PROPERTY, property="beanClass")
    public abstract static class BaseClass398 { }

    public static class TestClass398 extends BaseClass398 {
       public String property = "aa";
    }
    
    @JsonRootName("root")
    static class WithRootName {
        public int a = 3;
    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */
    

public void testRootWrapping3() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true); 
     String json = mapper.writeValueAsString(new StringWrapper("abc")); 
     assertEquals("{\"StringWrapper\":{\"str\":\"abc\"}}", json); 
 } 


public void testIssue456WrapperPart107() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("123", mapper.writerWithType(Integer.TYPE).writeValueAsString(Integer.valueOf(123))); 
     assertEquals("456", mapper.writerWithType(Long.TYPE).writeValueAsString(Long.valueOf(456L))); 
 } 


public void testJackson398113() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JavaType collectionType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, BaseClass398.class); 
     List<TestClass398> typedList = new ArrayList<TestClass398>(); 
     typedList.add(new TestClass398()); 
     final String EXP = "[{\"beanClass\":\"TestRootType$TestClass398\",\"property\":\"aa\"}]"; 
     String json = mapper.writerWithType(collectionType).writeValueAsString(typedList); 
     assertEquals(EXP, json); 
     StringWriter out = new StringWriter(); 
     JsonFactory f = new JsonFactory(); 
     mapper.writerWithType(collectionType).writeValue(f.createGenerator(out), typedList); 
     assertEquals(EXP, out.toString()); 
 } 


public void testInArray207() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(MapperFeature.USE_STATIC_TYPING, true); 
     SubType[] ob = new SubType[] { new SubType() }; 
     String json = mapper.writerWithType(BaseInterface[].class).writeValueAsString(ob); 
     assertEquals("[{\"b\":3}]", json); 
 } 


public void testIncompatibleRootType296() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SubType bean = new SubType(); 
     ObjectWriter w = mapper.writerWithType(HashMap.class); 
     try { 
         w.writeValueAsString(bean); 
         fail("Should have failed due to incompatible type"); 
     } catch (JsonProcessingException e) { 
         verifyException(e, "Incompatible types"); 
     } 
 } 


@SuppressWarnings("unchecked") 
 public void testSuperClass445() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SubType bean = new SubType(); 
     Map<String, Object> result = writeAndMap(mapper, bean); 
     assertEquals(4, result.size()); 
     assertEquals("a", result.get("a")); 
     assertEquals(Integer.valueOf(3), result.get("b")); 
     assertEquals("x", result.get("a2")); 
     assertEquals(Boolean.TRUE, result.get("b2")); 
     ObjectWriter w = mapper.writerWithType(BaseType.class); 
     String json = w.writeValueAsString(bean); 
     result = (Map<String, Object>) mapper.readValue(json, Map.class); 
     assertEquals(2, result.size()); 
     assertEquals("a", result.get("a")); 
     assertEquals(Integer.valueOf(3), result.get("b")); 
 } 

    

    

    
    
    /**
     * Unit test to ensure that proper exception is thrown if declared
     * root type is not compatible with given value instance.
     */
    
    
    /**
     * Unit test to verify [JACKSON-398]
     */
    

    // Test to verify [JACKSON-163]
    

    /**
     * Test to verify that there is support for specifying root type as primitive,
     * even if wrapper value is passed (there is no way to pass primitive values as
     * Objects); this to support frameworks that may pass unprocessed
     * {@link java.lang.reflect.Type} from field or method.
     */
    

    // [JACKSON-630] also, allow annotation to define root name
    
}

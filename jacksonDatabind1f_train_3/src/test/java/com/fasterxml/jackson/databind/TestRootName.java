package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests dealing with handling of "root element wrapping",
 * including configuration of root name to use.
 */
public class TestRootName extends BaseMapTest
{
    @JsonRootName("rudy")
    static class Bean {
        public int a = 3;
    }
    
    @JsonRootName("")
    static class RootBeanWithEmpty {
        public int a = 2;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testRootViaWriterAndReader4() throws Exception { 
     ObjectMapper mapper = rootMapper(); 
     String json = mapper.writer().writeValueAsString(new Bean()); 
     assertEquals("{\"rudy\":{\"a\":3}}", json); 
     Bean bean = mapper.reader(Bean.class).readValue(json); 
     assertNotNull(bean); 
 } 


public void testRootUsingExplicitConfig147() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectWriter writer = mapper.writer().withRootName("wrapper"); 
     String json = writer.writeValueAsString(new Bean()); 
     assertEquals("{\"wrapper\":{\"a\":3}}", json); 
     ObjectReader reader = mapper.reader(Bean.class).withRootName("wrapper"); 
     Bean bean = reader.readValue(json); 
     assertNotNull(bean); 
     ObjectMapper wrapping = rootMapper(); 
     json = wrapping.writer().withRootName("something").writeValueAsString(new Bean()); 
     assertEquals("{\"something\":{\"a\":3}}", json); 
     json = wrapping.writer().withRootName("").writeValueAsString(new Bean()); 
     assertEquals("{\"a\":3}", json); 
     bean = wrapping.reader(Bean.class).withRootName("").readValue(json); 
     assertNotNull(bean); 
 } 


public void testRootViaMapper320() throws Exception { 
     ObjectMapper mapper = rootMapper(); 
     String json = mapper.writeValueAsString(new Bean()); 
     assertEquals("{\"rudy\":{\"a\":3}}", json); 
     Bean bean = mapper.readValue(json, Bean.class); 
     assertNotNull(bean); 
     json = mapper.writeValueAsString(new RootBeanWithEmpty()); 
     assertEquals("{\"RootBeanWithEmpty\":{\"a\":2}}", json); 
     RootBeanWithEmpty bean2 = mapper.readValue(json, RootBeanWithEmpty.class); 
     assertNotNull(bean2); 
     assertEquals(2, bean2.a); 
 } 


public void testReconfiguringOfWrapping449() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     final Bean input = new Bean(); 
     String jsonUnwrapped = mapper.writeValueAsString(input); 
     assertEquals("{\"a\":3}", jsonUnwrapped); 
     String jsonWrapped = mapper.writer(SerializationFeature.WRAP_ROOT_VALUE).writeValueAsString(input); 
     assertEquals("{\"rudy\":{\"a\":3}}", jsonWrapped); 
     Bean result = mapper.readValue(jsonUnwrapped, Bean.class); 
     assertNotNull(result); 
     try { 
         result = mapper.reader(Bean.class).with(DeserializationFeature.UNWRAP_ROOT_VALUE).readValue(jsonUnwrapped); 
         fail("Should have failed"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Root name 'a'"); 
     } 
     result = mapper.reader(Bean.class).with(DeserializationFeature.UNWRAP_ROOT_VALUE).readValue(jsonWrapped); 
     assertNotNull(result); 
 } 

    

    

    
    
    // [JACKSON-764]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private ObjectMapper rootMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return mapper;
    }
}

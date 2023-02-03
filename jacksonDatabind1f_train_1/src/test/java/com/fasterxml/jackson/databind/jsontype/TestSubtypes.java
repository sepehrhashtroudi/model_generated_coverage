package com.fasterxml.jackson.databind.jsontype;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestSubtypes extends com.fasterxml.jackson.databind.BaseMapTest
{
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
    static abstract class SuperType {
    }

    @JsonTypeName("TypeB")
    static class SubB extends SuperType {
        public int b = 1;
    }

    static class SubC extends SuperType {
        public int c = 2;
    }

    static class SubD extends SuperType {
        public int d;
    }

    // "Empty" bean, to test [JACKSON-366]
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
    static abstract class BaseBean { }
    
    static class EmptyBean extends BaseBean { }

    static class EmptyNonFinal { }

    // Verify combinations with [JACKSON-510]

    static class PropertyBean
    {
        @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
        public SuperType value;
        
        public PropertyBean() { this(null); }
        public PropertyBean(SuperType v) { value = v; }
    }

    // And then [JACKSON-614]
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=As.PROPERTY,
            property="#type",
            defaultImpl=DefaultImpl.class)
    static abstract class SuperTypeWithDefault { }

    static class DefaultImpl extends SuperTypeWithDefault {
        public int a;
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=As.PROPERTY, property="#type")
    static abstract class SuperTypeWithoutDefault { }

    static class DefaultImpl505 extends SuperTypeWithoutDefault {
        public int a;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    // JACKSON-510

public void testPropertyWithSubtypes8() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerSubtypes(SubB.class, SubC.class, SubD.class); 
     String json = mapper.writeValueAsString(new PropertyBean(new SubC())); 
     PropertyBean result = mapper.readValue(json, PropertyBean.class); 
     assertSame(SubC.class, result.value.getClass()); 
 } 


public void testDefaultImplViaModule55() throws Exception { 
     final String JSON = "{\"a\":123}"; 
     ObjectMapper mapper = new ObjectMapper(); 
     try { 
         mapper.readValue(JSON, SuperTypeWithoutDefault.class); 
         fail("Expected an exception"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "missing property"); 
     } 
     mapper = new ObjectMapper(); 
     SimpleModule module = new SimpleModule("test", Version.unknownVersion()); 
     module.addAbstractTypeMapping(SuperTypeWithoutDefault.class, DefaultImpl505.class); 
     mapper.registerModule(module); 
     SuperTypeWithoutDefault bean = mapper.readValue(JSON, SuperTypeWithoutDefault.class); 
     assertNotNull(bean); 
     assertEquals(DefaultImpl505.class, bean.getClass()); 
     assertEquals(123, ((DefaultImpl505) bean).a); 
     bean = mapper.readValue("{\"#type\":\"foobar\"}", SuperTypeWithoutDefault.class); 
     assertEquals(DefaultImpl505.class, bean.getClass()); 
     assertEquals(0, ((DefaultImpl505) bean).a); 
 } 


public void testSubtypesViaModule231() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule module = new SimpleModule(); 
     module.registerSubtypes(SubB.class, SubC.class, SubD.class); 
     mapper.registerModule(module); 
     String json = mapper.writeValueAsString(new PropertyBean(new SubC())); 
     PropertyBean result = mapper.readValue(json, PropertyBean.class); 
     assertSame(SubC.class, result.value.getClass()); 
 } 


public void testEmptyBean400() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true); 
     String json = mapper.writeValueAsString(new EmptyBean()); 
     assertEquals("{\"@type\":\"TestSubtypes$EmptyBean\"}", json); 
     mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); 
     json = mapper.writeValueAsString(new EmptyBean()); 
     assertEquals("{\"@type\":\"TestSubtypes$EmptyBean\"}", json); 
     mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL); 
     mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); 
     json = mapper.writeValueAsString(new EmptyNonFinal()); 
     assertEquals("[\"com.fasterxml.jackson.databind.jsontype.TestSubtypes$EmptyNonFinal\",{}]", json); 
 } 

    

    // [JACKSON-748]: also works via modules
    
    
    

    

    

    // Trying to reproduce [JACKSON-366]
    

    

    // [JACKSON-505]: ok to also default to mapping there might be for base type
    
}


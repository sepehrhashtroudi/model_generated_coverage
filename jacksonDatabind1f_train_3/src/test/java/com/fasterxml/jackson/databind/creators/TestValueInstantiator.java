package com.fasterxml.jackson.databind.creators;

import java.util.*;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Test related to [JACKSON-580] (allow specifying custom instantiators)
 */
public class TestValueInstantiator extends BaseMapTest
{
    static class MyBean
    {
        String _secret;
        
        public MyBean(String s, boolean bogus) {
            _secret = s;
        }
    }

    static class MysteryBean
    {
        Object value;
        
        public MysteryBean(Object v) { value = v; }
    }
    
    static class CreatorBean
    {
        String _secret;

        public String value;
        
        protected CreatorBean(String s) {
            _secret = s;
        }
    }

    static abstract class InstantiatorBase extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() {
            return "UNKNOWN";
        }

        @Override
        public boolean canCreateUsingDelegate() { return false; }
    }
    
    static abstract class PolymorphicBeanBase { }
    
    static class PolymorphicBean extends PolymorphicBeanBase
    {
        public String name;
    }
    
    @SuppressWarnings("serial")
    static class MyList extends ArrayList<Object>
    {
        public MyList(boolean b) { super(); }
    }

    @SuppressWarnings("serial")
    static class MyMap extends HashMap<String,Object>
    {
        public MyMap(boolean b) { super(); }
        public MyMap(String name) {
            super();
            put(name, name);
        }
    }
    
    static class MyBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyBean.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyBean createUsingDefault(DeserializationContext ctxt) {
            return new MyBean("secret!", true);
        }
    }

    /**
     * Something more ambitious: semi-automated approach to polymorphic
     * deserialization, using ValueInstantiator; from Object to any
     * type...
     */
    static class PolymorphicBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return Object.class.getName();
        }
        
        @Override
        public boolean canCreateFromObjectWith() { return true; }
        
        @Override
        public CreatorProperty[] getFromObjectArguments(DeserializationConfig config) {
            return  new CreatorProperty[] {
                    new CreatorProperty("type", config.constructType(Class.class), null,
                            null, null, null, 0, null, true)
            };
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
            try {
                Class<?> cls = (Class<?>) args[0];
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    static class CreatorMapInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateFromObjectWith() { return true; }

        @Override
        public CreatorProperty[] getFromObjectArguments(DeserializationConfig config) {
            return  new CreatorProperty[] {
                    new CreatorProperty("name", config.constructType(String.class), null,
                            null, null, null, 0, null, true)
            };
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
            return new MyMap((String) args[0]);
        }
    }
    
    static class MyDelegateBeanInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return config.constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            return new MyBean(""+delegate, true);
        }
    }
    
    static class MyListInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyList.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyList createUsingDefault(DeserializationContext ctxt) {
            return new MyList(true);
        }
    }

    static class MyDelegateListInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return config.constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            MyList list = new MyList(true);
            list.add(delegate);
            return list;
        }
    }
    
    static class MyMapInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyMap createUsingDefault(DeserializationContext ctxt) {
            return new MyMap(true);
        }
    }

    static class MyDelegateMapInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return TypeFactory.defaultInstance().constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            MyMap map = new MyMap(true);
            map.put("value", delegate);
            return map;
        }
    }

    @JsonValueInstantiator(AnnotatedBeanInstantiator.class)
    static class AnnotatedBean {
        protected final String a;
        protected final int b;
        
        public AnnotatedBean(String a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class AnnotatedBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public AnnotatedBean createUsingDefault(DeserializationContext ctxt) {
            return new AnnotatedBean("foo", 3);
        }
    }
    
    @SuppressWarnings("serial")
    static class MyModule extends SimpleModule
    {
        public MyModule(Class<?> cls, ValueInstantiator inst)
        {
            super("Test", Version.unknownVersion());
            this.addValueInstantiator(cls, inst);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests for default creators
    /**********************************************************
     */


public void testDelegateMapInstantiator203() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MyMap.class, new MyDelegateMapInstantiator())); 
     MyMap result = mapper.readValue("123", MyMap.class); 
     assertNotNull(result); 
     assertEquals(1, result.size()); 
     assertEquals(Integer.valueOf(123), result.values().iterator().next()); 
 } 


public void testPolymorphicCreatorBean323() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(PolymorphicBeanBase.class, new PolymorphicBeanInstantiator())); 
     String JSON = "{\"type\":" + quote(PolymorphicBean.class.getName()) + ",\"name\":\"Axel\"}"; 
     PolymorphicBeanBase result = mapper.readValue(JSON, PolymorphicBeanBase.class); 
     assertNotNull(result); 
     assertSame(PolymorphicBean.class, result.getClass()); 
     assertEquals("Axel", ((PolymorphicBean) result).name); 
 } 


public void testDelegateBeanInstantiator324() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MyBean.class, new MyDelegateBeanInstantiator())); 
     MyBean bean = mapper.readValue("123", MyBean.class); 
     assertNotNull(bean); 
     assertEquals("123", bean._secret); 
 } 


public void testBeanFromDouble325() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MysteryBean.class, new InstantiatorBase() { 
  
         @Override 
         public boolean canCreateFromDouble() { 
             return true; 
         } 
  
         @Override 
         public Object createFromDouble(DeserializationContext ctxt, double value) { 
             return new MysteryBean(2.0 * value); 
         } 
     })); 
     MysteryBean result = mapper.readValue("0.25", MysteryBean.class); 
     assertNotNull(result); 
     assertEquals(Double.valueOf(0.5), result.value); 
 } 


public void testCustomMapInstantiator435() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MyMap.class, new MyMapInstantiator())); 
     MyMap result = mapper.readValue("{ \"a\":\"b\" }", MyMap.class); 
     assertNotNull(result); 
     assertEquals(MyMap.class, result.getClass()); 
     assertEquals(1, result.size()); 
 } 


public void testJackson633488() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AnnotatedBean bean = mapper.readValue("{}", AnnotatedBean.class); 
     assertNotNull(bean); 
     assertEquals("foo", bean.a); 
     assertEquals(3, bean.b); 
 } 


public void testDelegateListInstantiator516() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MyList.class, new MyDelegateListInstantiator())); 
     MyList result = mapper.readValue("123", MyList.class); 
     assertNotNull(result); 
     assertEquals(1, result.size()); 
     assertEquals(Integer.valueOf(123), result.get(0)); 
 } 

    

    

    
    
    /*
    /**********************************************************
    /* Unit tests for delegate creators
    /**********************************************************
     */

    

    
    
    

    /*
    /**********************************************************
    /* Unit tests for property-based creators
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Unit tests for scalar-delegates
    /**********************************************************
     */

    

    

    

    

    
    
    /*
    /**********************************************************
    /* Other tests
    /**********************************************************
     */

    
    /**
     * Beyond basic features, it should be possible to even implement
     * polymorphic handling...
     */
    

    
}

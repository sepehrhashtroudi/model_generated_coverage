package com.fasterxml.jackson.databind.jsontype;

import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class TestDefaultForObject
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static abstract class AbstractBean { }
    
    static class StringBean extends AbstractBean { // ha, punny!
        public String name;

        public StringBean() { this(null); }
        protected StringBean(String n)  { name = n; }
    }

    enum Choice { YES, NO; }

    /**
     * Another enum type, but this time forcing sub-classing
     */
    enum ComplexChoice {
    	MAYBE(true), PROBABLY_NOT(false);

    	private boolean state;
    	
    	private ComplexChoice(boolean b) { state = b; }
    	
        @Override
    	public String toString() { return String.valueOf(state); }
    }

    // [JACKSON-311]
    static class PolymorphicType {
        public String foo;
        public Object bar;
        
        public PolymorphicType() { }
        public PolymorphicType(String foo, int bar) {
            this.foo = foo;
            this.bar = bar;
        }
    }

    final static class BeanHolder
    {
        public AbstractBean bean;
        
        public BeanHolder() { }
        public BeanHolder(AbstractBean b) { bean = b; }
    }

    final static class ObjectHolder
    {
        public Object value;

        public ObjectHolder() { }
        public ObjectHolder(Object v) { value = v; }
    }

    // [JACKSON-352]
    static class DomainBean {
        public int weight;
    }

    static class DiscussBean extends DomainBean {
        public String subject;
    }

    static public class DomainBeanWrapper {
        public String name;
        public Object myBean;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Unit test that verifies that a bean is stored with type information,
     * when declared type is <code>Object.class</code> (since it is within
     * Object[]), and default type information is enabled.
     */

@SuppressWarnings("unchecked") 
 public void testEnumSet108() throws Exception { 
     EnumSet<Choice> set = EnumSet.of(Choice.NO); 
     Object[] input = new Object[] { set }; 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     String json = m.writeValueAsString(input); 
     Object[] output = m.readValue(json, Object[].class); 
     assertEquals(1, output.length); 
     Object ob = output[0]; 
     assertTrue(ob instanceof EnumSet<?>); 
     EnumSet<Choice> set2 = (EnumSet<Choice>) ob; 
     assertEquals(1, set2.size()); 
     assertTrue(set2.contains(Choice.NO)); 
     assertFalse(set2.contains(Choice.YES)); 
 } 


@SuppressWarnings("unchecked") 
 public void testEnumMap109() throws Exception { 
     EnumMap<Choice, String> map = new EnumMap<Choice, String>(Choice.class); 
     map.put(Choice.NO, "maybe"); 
     Object[] input = new Object[] { map }; 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     String json = m.writeValueAsString(input); 
     Object[] output = m.readValue(json, Object[].class); 
     assertEquals(1, output.length); 
     Object ob = output[0]; 
     assertTrue(ob instanceof EnumMap<?, ?>); 
     EnumMap<Choice, String> map2 = (EnumMap<Choice, String>) ob; 
     assertEquals(1, map2.size()); 
     assertEquals("maybe", map2.get(Choice.NO)); 
     assertNull(map2.get(Choice.YES)); 
 } 


public void testTokenBuffer154() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL); 
     TokenBuffer buf = new TokenBuffer(mapper); 
     buf.writeStartObject(); 
     buf.writeNumberField("num", 42); 
     buf.writeEndObject(); 
     String json = mapper.writeValueAsString(new ObjectHolder(buf)); 
     ObjectHolder holder = mapper.readValue(json, ObjectHolder.class); 
     assertNotNull(holder.value); 
     assertSame(TokenBuffer.class, holder.value.getClass()); 
     JsonParser jp = ((TokenBuffer) holder.value).asParser(); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf = new TokenBuffer(mapper); 
     buf.writeStartArray(); 
     buf.writeBoolean(true); 
     buf.writeEndArray(); 
     json = mapper.writeValueAsString(new ObjectHolder(buf)); 
     holder = mapper.readValue(json, ObjectHolder.class); 
     assertNotNull(holder.value); 
     assertSame(TokenBuffer.class, holder.value.getClass()); 
     jp = ((TokenBuffer) holder.value).asParser(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf = new TokenBuffer(mapper); 
     buf.writeNumber(321); 
     json = mapper.writeValueAsString(new ObjectHolder(buf)); 
     holder = mapper.readValue(json, ObjectHolder.class); 
     assertNotNull(holder.value); 
     assertSame(TokenBuffer.class, holder.value.getClass()); 
     jp = ((TokenBuffer) holder.value).asParser(); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(321, jp.getIntValue()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
 } 


public void testIssue352253() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY); 
     DiscussBean d1 = new DiscussBean(); 
     d1.subject = "mouse"; 
     d1.weight = 88; 
     DomainBeanWrapper wrapper = new DomainBeanWrapper(); 
     wrapper.name = "mickey"; 
     wrapper.myBean = d1; 
     String json = mapper.writeValueAsString(wrapper); 
     DomainBeanWrapper result = mapper.readValue(json, DomainBeanWrapper.class); 
     assertNotNull(result); 
     assertNotNull(wrapper.myBean); 
     assertSame(DiscussBean.class, wrapper.myBean.getClass()); 
 } 


public void testEnumAsObject282() throws Exception { 
     Object[] input = new Object[] { Choice.YES }; 
     Object[] input2 = new Object[] { ComplexChoice.MAYBE }; 
     assertEquals("[\"YES\"]", serializeAsString(input)); 
     assertEquals("[\"MAYBE\"]", serializeAsString(input2)); 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     String json = m.writeValueAsString(input); 
     assertEquals("[[\"" + Choice.class.getName() + "\",\"YES\"]]", json); 
     Object[] output = m.readValue(json, Object[].class); 
     assertEquals(1, output.length); 
     assertEquals(Choice.YES, output[0]); 
     json = m.writeValueAsString(input2); 
     assertEquals("[[\"" + ComplexChoice.class.getName() + "\",\"MAYBE\"]]", json); 
     output = m.readValue(json, Object[].class); 
     assertEquals(1, output.length); 
     assertEquals(ComplexChoice.MAYBE, output[0]); 
 } 

    

    /**
     * Unit test that verifies that an abstract bean is stored with type information
     * if default type information is enabled for non-concrete types.
     */
    

    /**
     * Unit test to verify that type information is included for
     * all non-final types, if default typing suitably configured
     */
    

    
    
    

    

    

    

    // Also, let's ensure TokenBuffer gets properly handled
    

    /**
     * Test for [JACKSON-352]
     */
        

    // Test to ensure we can also use "As.PROPERTY" inclusion and custom property name
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    @SuppressWarnings("unchecked")
    private void _verifySerializationAsMap(String str) throws Exception
    {
        // First: validate that structure looks correct (as Map etc)
        // note: should look something like:
        // "[["org.codehaus.jackson.map.jsontype.TestDefaultForObject$StringBean",{"name":"abc"}]]")

        // note: must have default mapper, default typer NOT enabled (to get 'plain' map)
        ObjectMapper m = new ObjectMapper();
        List<Object> list = m.readValue(str, List.class);
        assertEquals(1, list.size()); // no type for main List, just single entry
        Object entryOb = list.get(0);
        assertTrue(entryOb instanceof List<?>);
        // but then type wrapper for bean
        List<?> entryList = (List<?>)entryOb;
        assertEquals(2, entryList.size());
        assertEquals(StringBean.class.getName(), entryList.get(0));
        assertTrue(entryList.get(1) instanceof Map);
        Map<?,?> map = (Map<?,?>) entryList.get(1);
        assertEquals(1, map.size());
        assertEquals("abc", map.get("name"));
    }
}

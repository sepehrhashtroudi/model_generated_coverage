package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Tests related to [JACKSON-139]
 */
public class TestNumbers
    extends BaseMapTest
{
    /*
    /**********************************************************************
    /* Helper classes, beans
    /**********************************************************************
     */

    static class MyBeanHolder {
        public Long id;
        public MyBeanDefaultValue defaultValue;
    }

    static class MyBeanDefaultValue
    {
        public MyBeanValue value;
    }

    @JsonDeserialize(using=MyBeanDeserializer.class)
    static class MyBeanValue {
        public BigDecimal decimal;
        public MyBeanValue() { this(null); }
        public MyBeanValue(BigDecimal d) { this.decimal = d; }
    }

    /*
    /**********************************************************************
    /* Helper classes, serializers/deserializers/resolvers
    /**********************************************************************
     */
    
    static class MyBeanDeserializer extends JsonDeserializer<MyBeanValue>
    {
        @Override
        public MyBeanValue deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException
        {
            return new MyBeanValue(jp.getDecimalValue());
        }
    }

    /*
    /**********************************************************************
    /* Unit tests
    /**********************************************************************
     */
    

public void testDeserializeDecimalProperExceptionWhenIdSet25() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = "{\"id\": 5, \"defaultValue\": { \"value\": \"123\" } }"; 
     try { 
         MyBeanHolder result = mapper.readValue(json, MyBeanHolder.class); 
         fail("should have raised exception instead value was set to " + result.defaultValue.value.decimal.toString()); 
     } catch (JsonParseException e) { 
         verifyException(e, "not numeric"); 
     } 
 } 


public void testFloatNaN327() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Float result = m.readValue(" \"NaN\"", Float.class); 
     assertEquals(Float.valueOf(Float.NaN), result); 
 } 


public void testDoubleInf331() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Double result = m.readValue(" \"" + Double.POSITIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result); 
     result = m.readValue(" \"" + Double.NEGATIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), result); 
 } 

    

    

    // [JACKSON-349]
    

    // // Tests for [JACKSON-668]
    
    

    

    
}

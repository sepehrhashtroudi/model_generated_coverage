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
    

public void testFloatNaN331() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Float result = m.readValue(" \"NaN\"", Float.class); 
     assertEquals(Float.valueOf(Float.NaN), result); 
 } 


public void testDoubleInf334() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Double result = m.readValue(" \"" + Double.POSITIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result); 
     result = m.readValue(" \"" + Double.NEGATIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), result); 
 } 


public void testEmptyAsNumber540() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertNull(m.readValue(quote(""), Integer.class)); 
     assertNull(m.readValue(quote(""), Long.class)); 
     assertNull(m.readValue(quote(""), Float.class)); 
     assertNull(m.readValue(quote(""), Double.class)); 
     assertNull(m.readValue(quote(""), BigInteger.class)); 
     assertNull(m.readValue(quote(""), BigDecimal.class)); 
 } 

    

    

    // [JACKSON-349]
    

    // // Tests for [JACKSON-668]
    
    

    

    
}

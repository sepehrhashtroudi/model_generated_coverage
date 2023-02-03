package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying handling of non-specific numeric types.
 */
public class TestGenericNumber
    extends BaseMapTest
{

public void testFpTypeOverrideStructured471() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     BigDecimal dec = new BigDecimal("-19.37"); 
     m.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS); 
     @SuppressWarnings("unchecked") 
     List<Object> list = (List<Object>) m.readValue("[ " + dec.toString() + " ]", List.class); 
     assertEquals(1, list.size()); 
     Object val = list.get(0); 
     assertEquals(BigDecimal.class, val.getClass()); 
     assertEquals(dec, val); 
     Map<?, ?> map = m.readValue("{ \"a\" : " + dec.toString() + " }", Map.class); 
     assertEquals(1, map.size()); 
     val = map.get("a"); 
     assertEquals(BigDecimal.class, val.getClass()); 
     assertEquals(dec, val); 
 } 


public void testDoubleAsNumber537() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 1.0 "), Number.class); 
     assertEquals(Double.valueOf(1.0), result); 
 } 


public void testIntAsNumber540() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 123 "), Number.class); 
     assertEquals(Integer.valueOf(123), result); 
 } 


public void testBigIntAsNumber541() throws Exception { 
     BigInteger biggie = new BigInteger("1234567890123456789012345678901234567890"); 
     Number result = new ObjectMapper().readValue(biggie.toString(), Number.class); 
     assertEquals(BigInteger.class, biggie.getClass()); 
     assertEquals(biggie, result); 
 } 


public void testFpTypeOverrideSimple542() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS); 
     BigDecimal dec = new BigDecimal("0.1"); 
     Number result = m.readValue(dec.toString(), Number.class); 
     assertEquals(BigDecimal.class, result.getClass()); 
     assertEquals(dec, result); 
     Object value = m.readValue(dec.toString(), Object.class); 
     assertEquals(BigDecimal.class, result.getClass()); 
     assertEquals(dec, value); 
 } 

    

    

    

    

    /**
     * Related to [JACKSON-72]: by default should wrap floating-point
     * Number as Double
     */
    

    /**
     * Test for verifying [JACKSON-72].
     */
    

	
}

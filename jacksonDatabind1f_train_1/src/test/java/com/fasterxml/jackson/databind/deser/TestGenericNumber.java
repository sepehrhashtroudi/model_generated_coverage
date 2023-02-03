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

public void testIntTypeOverride464() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS); 
     BigInteger exp = BigInteger.valueOf(123L); 
     Number result = m.readValue(new StringReader(" 123 "), Number.class); 
     assertEquals(BigInteger.class, result.getClass()); 
     assertEquals(exp, result); 
     m.readValue(new StringReader("123"), Object.class); 
     assertEquals(BigInteger.class, result.getClass()); 
     assertEquals(exp, result); 
 } 


public void testFpTypeOverrideStructured465() throws Exception { 
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


public void testDoubleAsNumber539() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 1.0 "), Number.class); 
     assertEquals(Double.valueOf(1.0), result); 
 } 


public void testIntAsNumber542() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 123 "), Number.class); 
     assertEquals(Integer.valueOf(123), result); 
 } 


public void testBigIntAsNumber543() throws Exception { 
     BigInteger biggie = new BigInteger("1234567890123456789012345678901234567890"); 
     Number result = new ObjectMapper().readValue(biggie.toString(), Number.class); 
     assertEquals(BigInteger.class, biggie.getClass()); 
     assertEquals(biggie, result); 
 } 

    

    

    

    

    /**
     * Related to [JACKSON-72]: by default should wrap floating-point
     * Number as Double
     */
    

    /**
     * Test for verifying [JACKSON-72].
     */
    

	
}

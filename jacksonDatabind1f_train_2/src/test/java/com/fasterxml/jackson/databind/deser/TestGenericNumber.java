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

public void testIntTypeOverride469() throws Exception { 
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


public void testDoubleAsNumber539() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 1.0 "), Number.class); 
     assertEquals(Double.valueOf(1.0), result); 
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

package com.fasterxml.jackson.databind.ser;

import java.math.BigInteger;


import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

/**
 * Unit tests for verifying serialization of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleTypes
    extends BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();
    

public void testFloat241() throws Exception { 
     double[] values = new double[] { 0.0, 1.0, 0.1, -37.01, 999.99, 0.3, 33.3, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY }; 
     for (double d : values) { 
         float f = (float) d; 
         String expected = String.valueOf(f); 
         if (Float.isNaN(f) || Float.isInfinite(f)) { 
             expected = "\"" + expected + "\""; 
         } 
         assertEquals(expected, serializeAsString(MAPPER, Float.valueOf(f))); 
     } 
 } 


public void testIntArray244() throws Exception { 
     assertEquals("[0,-3]", serializeAsString(MAPPER, new int[] { 0, -3 })); 
     assertEquals("[13,9]", serializeAsString(MAPPER, new Integer[] { 13, 9 })); 
 } 


public void testBooleanArray567() throws Exception { 
     assertEquals("[true,false]", serializeAsString(MAPPER, new boolean[] { true, false })); 
     assertEquals("[true,false]", serializeAsString(MAPPER, new Boolean[] { Boolean.TRUE, Boolean.FALSE })); 
 } 

    

    

    

    // as per [Issue#42], allow Base64 variant use as well
    
    
    

    

    /* Note: dealing with floating-point values is tricky; not sure if
     * we can really use equality tests here... JDK does have decent
     * conversions though, to retain accuracy and round-trippability.
     * But still...
     */
    

    

    
    
    
}

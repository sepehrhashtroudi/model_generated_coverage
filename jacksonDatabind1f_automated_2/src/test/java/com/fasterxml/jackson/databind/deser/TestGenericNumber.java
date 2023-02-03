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
public void testDoubleAsNumber308() throws Exception { 
     Number result = new ObjectMapper().readValue(new StringReader(" 1.0 "), Number.class); 
     assertEquals(Double.valueOf(1.0), result); 
 }
    

    

    

    

    /**
     * Related to [JACKSON-72]: by default should wrap floating-point
     * Number as Double
     */
    

    /**
     * Test for verifying [JACKSON-72].
     */
    

	
}

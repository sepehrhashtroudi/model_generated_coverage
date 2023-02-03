package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for JDK types not covered by other tests (i.e. things
 * that are not Enums, Collections, Maps, or standard Date/Time types)
 */
public class TestJdkTypes
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * Unit test to catch bug [JACKSON-8].
     */

public void testBigDecimalAsPlainString211() throws Exception { 
     MAPPER.enable(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN); 
     Map<String, Object> map = new HashMap<String, Object>(); 
     String PI_STR = "3.00000000"; 
     map.put("pi", new BigDecimal(PI_STR)); 
     String str = MAPPER.writeValueAsString(map); 
     assertEquals("{\"pi\":3.00000000}", str); 
 } 


public void testInetAddress226() throws IOException { 
     assertEquals(quote("127.0.0.1"), MAPPER.writeValueAsString(InetAddress.getByName("127.0.0.1"))); 
     assertEquals(quote("ning.com"), MAPPER.writeValueAsString(InetAddress.getByName("ning.com"))); 
 } 


public void testClass389() throws IOException { 
     assertEquals(quote("java.lang.String"), MAPPER.writeValueAsString(String.class)); 
     assertEquals(quote("int"), MAPPER.writeValueAsString(Integer.TYPE)); 
     assertEquals(quote("boolean"), MAPPER.writeValueAsString(Boolean.TYPE)); 
     assertEquals(quote("void"), MAPPER.writeValueAsString(Void.TYPE)); 
 } 


public void testCharset391() throws IOException { 
     assertEquals(quote("UTF-8"), MAPPER.writeValueAsString(Charset.forName("UTF-8"))); 
 } 

    
    
    
    
    /**
     * Unit test related to [JACKSON-155]
     */
    

    

    

    

    // [JACKSON-484]
    

    // [JACKSON-597]
    

    // [JACKSON-789]
    
}

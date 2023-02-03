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

public void testBigDecimalAsPlainString204() throws Exception { 
     MAPPER.enable(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN); 
     Map<String, Object> map = new HashMap<String, Object>(); 
     String PI_STR = "3.00000000"; 
     map.put("pi", new BigDecimal(PI_STR)); 
     String str = MAPPER.writeValueAsString(map); 
     assertEquals("{\"pi\":3.00000000}", str); 
 } 


public void testInetAddress224() throws IOException { 
     assertEquals(quote("127.0.0.1"), MAPPER.writeValueAsString(InetAddress.getByName("127.0.0.1"))); 
     assertEquals(quote("ning.com"), MAPPER.writeValueAsString(InetAddress.getByName("ning.com"))); 
 } 


public void testCurrency387() throws IOException { 
     Currency usd = Currency.getInstance("USD"); 
     assertEquals(quote("USD"), MAPPER.writeValueAsString(usd)); 
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

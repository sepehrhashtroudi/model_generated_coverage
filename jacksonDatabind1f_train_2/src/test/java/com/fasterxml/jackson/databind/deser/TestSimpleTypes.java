package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for verifying handling of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleTypes
    extends BaseMapTest
{
    final static String NAN_STRING = "NaN";

    final static class BooleanBean {
        boolean _v;
        void setV(boolean v) { _v = v; }
    }

    static class IntBean {
        int _v;
        void setV(int v) { _v = v; }
    }

    final static class DoubleBean {
        double _v;
        void setV(double v) { _v = v; }
    }

    final static class FloatBean {
        float _v;
        void setV(float v) { _v = v; }
    }

    /**
     * Also, let's ensure that it's ok to override methods.
     */
    static class IntBean2
        extends IntBean
    {
        @Override
        void setV(int v2) { super.setV(v2+1); }
    }

    /*
    /**********************************************************
    /* Then tests for primitives
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();


public void testBase64Variants145() throws Exception { 
     final byte[] INPUT = "abcdefghijklmnopqrstuvwxyz1234567890abcdefghijklmnopqrstuvwxyz1234567890X".getBytes("UTF-8"); 
     Assert.assertArrayEquals(INPUT, MAPPER.readValue(quote("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwYWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwWA=="), byte[].class)); 
     ObjectReader reader = MAPPER.reader(byte[].class); 
     Assert.assertArrayEquals(INPUT, (byte[]) reader.with(Base64Variants.MIME_NO_LINEFEEDS).readValue(quote("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwYWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwWA=="))); 
     Assert.assertArrayEquals(INPUT, (byte[]) reader.with(Base64Variants.MIME).readValue(quote("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwYWJjZGVmZ2hpamtsbW5vcHFyc3R1\\ndnd4eXoxMjM0NTY3ODkwWA=="))); 
     Assert.assertArrayEquals(INPUT, (byte[]) reader.with(Base64Variants.MODIFIED_FOR_URL).readValue(quote("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwYWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwWA"))); 
     Assert.assertArrayEquals(INPUT, (byte[]) reader.with(Base64Variants.PEM).readValue(quote("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwYWJjZGVmZ2hpamts\\nbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwWA=="))); 
 } 


public void testBooleanPrimitive315() throws Exception { 
     BooleanBean result = MAPPER.readValue(new StringReader("{\"v\":true}"), BooleanBean.class); 
     assertTrue(result._v); 
     result = MAPPER.readValue(new StringReader("{\"v\":null}"), BooleanBean.class); 
     assertNotNull(result); 
     assertFalse(result._v); 
     boolean[] array = MAPPER.readValue(new StringReader("[ null ]"), boolean[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertFalse(array[0]); 
 } 


public void testBooleanWrapper316() throws Exception { 
     Boolean result = MAPPER.readValue(new StringReader("true"), Boolean.class); 
     assertEquals(Boolean.TRUE, result); 
     result = MAPPER.readValue(new StringReader("false"), Boolean.class); 
     assertEquals(Boolean.FALSE, result); 
     result = MAPPER.readValue(new StringReader("0"), Boolean.class); 
     assertEquals(Boolean.FALSE, result); 
     result = MAPPER.readValue(new StringReader("1"), Boolean.class); 
     assertEquals(Boolean.TRUE, result); 
 } 


public void testByteWrapper319() throws Exception { 
     Byte result = MAPPER.readValue(new StringReader("   -42\t"), Byte.class); 
     assertEquals(Byte.valueOf((byte) -42), result); 
     result = MAPPER.readValue(new StringReader(" \"-12\""), Byte.class); 
     assertEquals(Byte.valueOf((byte) -12), result); 
     result = MAPPER.readValue(new StringReader(" 39.07"), Byte.class); 
     assertEquals(Byte.valueOf((byte) 39), result); 
 } 


public void testShortWrapper320() throws Exception { 
     Short result = MAPPER.readValue(new StringReader("37"), Short.class); 
     assertEquals(Short.valueOf((short) 37), result); 
     result = MAPPER.readValue(new StringReader(" \"-1009\""), Short.class); 
     assertEquals(Short.valueOf((short) -1009), result); 
     result = MAPPER.readValue(new StringReader("-12.9"), Short.class); 
     assertEquals(Short.valueOf((short) -12), result); 
 } 


public void testIntPrimitive321() throws Exception { 
     IntBean result = MAPPER.readValue(new StringReader("{\"v\":3}"), IntBean.class); 
     assertEquals(3, result._v); 
     result = MAPPER.readValue(new StringReader("{\"v\":null}"), IntBean.class); 
     assertNotNull(result); 
     assertEquals(0, result._v); 
     int[] array = MAPPER.readValue(new StringReader("[ null ]"), int[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(0, array[0]); 
 } 


public void testLongWrapper324() throws Exception { 
     Long result = MAPPER.readValue(new StringReader("12345678901"), Long.class); 
     assertEquals(Long.valueOf(12345678901L), result); 
     result = MAPPER.readValue(new StringReader(" \"-9876\""), Long.class); 
     assertEquals(Long.valueOf(-9876), result); 
     result = MAPPER.readValue(new StringReader("1918.3"), Long.class); 
     assertEquals(Long.valueOf(1918), result); 
 } 


public void testFloatWrapper326() throws Exception { 
     String[] STRS = new String[] { "1.0", "0.0", "-0.3", "0.7", "42.012", "-999.0", NAN_STRING }; 
     for (String str : STRS) { 
         Float exp = Float.valueOf(str); 
         Float result; 
         if (NAN_STRING != str) { 
             result = MAPPER.readValue(new StringReader(str), Float.class); 
             assertEquals(exp, result); 
         } 
         result = MAPPER.readValue(new StringReader(" \"" + str + "\""), Float.class); 
         assertEquals(exp, result); 
     } 
 } 


public void testFloatPrimitiveNonNumeric328() throws Exception { 
     float value = Float.POSITIVE_INFINITY; 
     FloatBean result = MAPPER.readValue(new StringReader("{\"v\":\"" + value + "\"}"), FloatBean.class); 
     assertEquals(value, result._v); 
     float[] array = MAPPER.readValue(new StringReader("[ \"Infinity\" ]"), float[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(Float.POSITIVE_INFINITY, array[0]); 
 } 


public void testDoubleWrapper329() throws Exception { 
     String[] STRS = new String[] { "1.0", "0.0", "-0.3", "0.7", "42.012", "-999.0", NAN_STRING }; 
     for (String str : STRS) { 
         Double exp = Double.valueOf(str); 
         Double result; 
         if (NAN_STRING != str) { 
             result = MAPPER.readValue(new StringReader(str), Double.class); 
             assertEquals(exp, result); 
         } 
         result = MAPPER.readValue(new StringReader(" \"" + str + "\""), Double.class); 
         assertEquals(exp, result); 
     } 
 } 


public void testDoublePrimitiveNonNumeric330() throws Exception { 
     double value = Double.POSITIVE_INFINITY; 
     DoubleBean result = MAPPER.readValue(new StringReader("{\"v\":\"" + value + "\"}"), DoubleBean.class); 
     assertEquals(value, result._v); 
     double[] array = MAPPER.readValue(new StringReader("[ \"Infinity\" ]"), double[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(Double.POSITIVE_INFINITY, array[0]); 
 } 


public void testDoublePrimitive333() throws Exception { 
     double value = 0.016; 
     DoubleBean result = MAPPER.readValue(new StringReader("{\"v\":" + value + "}"), DoubleBean.class); 
     assertEquals(value, result._v); 
     result = MAPPER.readValue(new StringReader("{\"v\":null}"), DoubleBean.class); 
     assertNotNull(result); 
     assertEquals(0.0, result._v); 
     double[] array = MAPPER.readValue(new StringReader("[ null ]"), double[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(0.0, array[0]); 
 } 


public void testURI343() throws Exception { 
     URI value = new URI("http://foo.com"); 
     assertEquals(value, MAPPER.readValue("\"" + value.toString() + "\"", URI.class)); 
 } 


public void testURL344() throws Exception { 
     URL value = new URL("http://foo.com"); 
     assertEquals(value, MAPPER.readValue("\"" + value.toString() + "\"", URL.class)); 
     TokenBuffer buf = new TokenBuffer(null); 
     buf.writeObject(null); 
     assertNull(MAPPER.readValue(buf.asParser(), URL.class)); 
     buf.close(); 
     buf = new TokenBuffer(null); 
     buf.writeObject(value); 
     assertSame(value, MAPPER.readValue(buf.asParser(), URL.class)); 
     buf.close(); 
 } 


public void testBigInteger540() throws Exception { 
     BigInteger value = new BigInteger("-1234567890123456789012345567809"); 
     BigInteger result = MAPPER.readValue(new StringReader(value.toString()), BigInteger.class); 
     assertEquals(value, result); 
 } 


public void testCharacterWrapper541() throws Exception { 
     Character result = MAPPER.readValue(new StringReader("\"a\""), Character.class); 
     assertEquals(Character.valueOf('a'), result); 
     result = MAPPER.readValue(new StringReader(" " + ((int) 'X')), Character.class); 
     assertEquals(Character.valueOf('X'), result); 
 } 

    

    

    

    
    
    
    
    /**
     * Beyond simple case, let's also ensure that method overriding works as
     * expected.
     */
    

    /*
    /**********************************************************
    /* Then tests for wrappers
    /**********************************************************
     */

    /**
     * Simple unit test to verify that we can map boolean values to
     * java.lang.Boolean.
     */
    

    

    

    

    

    

    /* Note: dealing with floating-point values is tricky; not sure if
     * we can really use equality tests here... JDK does have decent
     * conversions though, to retain accuracy and round-trippability.
     * But still...
     */
    

    

    // as per [Issue#42], allow Base64 variant use as well
        
    /*
    /**********************************************************
    /* Simple non-primitive types
    /**********************************************************
     */

    

    

    

    

    

    

    

    

    /*
    /**********************************************************
    /* Sequence tests
    /**********************************************************
     */

    /**
     * Then a unit test to verify that we can conveniently bind sequence of
     * space-separate simple values
     */
    
}


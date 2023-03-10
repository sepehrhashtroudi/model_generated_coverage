package com.fasterxml.jackson.core.json;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestNumericValues
    extends com.fasterxml.jackson.test.BaseTest
{

public void testBigNumbers3() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     for (int i = 0; i < 520; ++i) { 
         sb.append('1'); 
     } 
     final String NUMBER_STR = sb.toString(); 
     BigInteger biggie = new BigInteger(NUMBER_STR); 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(NUMBER_STR); 
         } else { 
             jp = this.createParserUsingStream(NUMBER_STR, "UTF-8"); 
         } 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.BIG_INTEGER, jp.getNumberType()); 
         assertEquals(NUMBER_STR, jp.getText()); 
         assertEquals(biggie, jp.getBigIntegerValue()); 
         jp.close(); 
     } 
 } 


public void testSimpleLong20() throws Exception { 
     long EXP_L = 12345678907L; 
     JsonParser jp = createParserUsingReader("[ " + EXP_L + " ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(JsonParser.NumberType.LONG, jp.getNumberType()); 
     assertEquals("" + EXP_L, jp.getText()); 
     assertEquals(EXP_L, jp.getLongValue()); 
     try { 
         jp.getIntValue(); 
     } catch (JsonParseException jpe) { 
         verifyException(jpe, "out of range"); 
     } 
     assertEquals((double) EXP_L, jp.getDoubleValue()); 
     assertEquals(BigDecimal.valueOf((long) EXP_L), jp.getDecimalValue()); 
     jp.close(); 
 } 


public void testSimpleInt22() throws Exception { 
     int EXP_I = 1234; 
     JsonParser jp = createParserUsingReader("[ " + EXP_I + " ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
     assertEquals("" + EXP_I, jp.getText()); 
     assertEquals(EXP_I, jp.getIntValue()); 
     assertEquals((long) EXP_I, jp.getLongValue()); 
     assertEquals((double) EXP_I, jp.getDoubleValue()); 
     assertEquals(BigDecimal.valueOf((long) EXP_I), jp.getDecimalValue()); 
     jp.close(); 
 } 


public void testIntRange24() throws Exception { 
     for (int i = 0; i < 2; ++i) { 
         String input = "[ " + Integer.MAX_VALUE + "," + Integer.MIN_VALUE + " ]"; 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(input); 
         } else { 
             jp = this.createParserUsingStream(input, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
         assertEquals(Integer.MAX_VALUE, jp.getIntValue()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
         assertEquals(Integer.MIN_VALUE, jp.getIntValue()); 
         jp.close(); 
     } 
 } 


public void testNumbers25() throws Exception { 
     final String DOC = "[ -13, 8100200300, 13.5, 0.00010, -2.033 ]"; 
     for (int input = 0; input < 2; ++input) { 
         JsonParser jp; 
         if (input == 0) { 
             jp = createParserUsingStream(DOC, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(-13, jp.getIntValue()); 
         assertEquals(-13L, jp.getLongValue()); 
         assertEquals(-13., jp.getDoubleValue()); 
         assertEquals("-13", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(8100200300L, jp.getLongValue()); 
         try { 
             jp.getIntValue(); 
             fail("Expected an exception for overflow"); 
         } catch (Exception e) { 
             verifyException(e, "out of range of int"); 
         } 
         assertEquals(8100200300., jp.getDoubleValue()); 
         assertEquals("8100200300", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(13, jp.getIntValue()); 
         assertEquals(13L, jp.getLongValue()); 
         assertEquals(13.5, jp.getDoubleValue()); 
         assertEquals("13.5", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(0, jp.getIntValue()); 
         assertEquals(0L, jp.getLongValue()); 
         assertEquals(0.00010, jp.getDoubleValue()); 
         assertEquals("0.00010", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(-2, jp.getIntValue()); 
         assertEquals(-2L, jp.getLongValue()); 
         assertEquals(-2.033, jp.getDoubleValue()); 
         assertEquals("-2.033", jp.getText()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 } 


@SuppressWarnings("resource") 
 public void testLongOverflow26() throws Exception { 
     BigInteger below = BigInteger.valueOf(Long.MIN_VALUE); 
     below = below.subtract(BigInteger.ONE); 
     BigInteger above = BigInteger.valueOf(Long.MAX_VALUE); 
     above = above.add(BigInteger.ONE); 
     String DOC_BELOW = below.toString() + " "; 
     String DOC_ABOVE = below.toString() + " "; 
     for (int input = 0; input < 2; ++input) { 
         JsonParser jp; 
         if (input == 0) { 
             jp = createParserUsingStream(DOC_BELOW, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC_BELOW); 
         } 
         jp.nextToken(); 
         try { 
             long x = jp.getLongValue(); 
             fail("Expected an exception for underflow (input " + jp.getText() + "): instead, got long value: " + x); 
         } catch (JsonParseException e) { 
             verifyException(e, "out of range of long"); 
         } 
         jp.close(); 
         if (input == 0) { 
             jp = createParserUsingStream(DOC_ABOVE, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC_ABOVE); 
         } 
         jp.nextToken(); 
         try { 
             long x = jp.getLongValue(); 
             fail("Expected an exception for underflow (input " + jp.getText() + "): instead, got long value: " + x); 
         } catch (JsonParseException e) { 
             verifyException(e, "out of range of long"); 
         } 
         jp.close(); 
     } 
 } 


public void testSimpleDouble47() throws Exception { 
     final String[] INPUTS = new String[] { "1234.00", "2.1101567E-16", "1.0e5", "2.5e+5", "9e4", "-12e-3", "0.25" }; 
     for (int input = 0; input < 2; ++input) { 
         for (int i = 0; i < INPUTS.length; ++i) { 
             String STR = INPUTS[i]; 
             double EXP_D = Double.parseDouble(STR); 
             String DOC = "[" + STR + "]"; 
             JsonParser jp; 
             if (input == 0) { 
                 jp = createParserUsingStream(DOC, "UTF-8"); 
             } else { 
                 jp = createParserUsingReader(DOC); 
             } 
             assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
             assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
             assertEquals(STR, jp.getText()); 
             assertEquals(EXP_D, jp.getDoubleValue()); 
             assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
             jp.close(); 
         } 
     } 
 } 


public void testParsingOfLongerSequences50() throws Exception { 
     double[] values = new double[] { 0.01, -10.5, 2.1e9, 4.0e-8 }; 
     StringBuilder sb = new StringBuilder(); 
     for (int i = 0; i < values.length; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(values[i]); 
     } 
     String segment = sb.toString(); 
     int COUNT = 1000; 
     sb = new StringBuilder(COUNT * segment.length() + 20); 
     sb.append("["); 
     for (int i = 0; i < COUNT; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(segment); 
         sb.append('\n'); 
         int x = (i & 3); 
         if (i > 300) { 
             x += i % 5; 
         } 
         while (--x > 0) { 
             sb.append(' '); 
         } 
     } 
     sb.append("]"); 
     String DOC = sb.toString(); 
     for (int input = 0; input < 2; ++input) { 
         JsonParser jp; 
         if (input == 0) { 
             jp = createParserUsingStream(DOC, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         for (int i = 0; i < COUNT; ++i) { 
             for (double d : values) { 
                 assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
                 assertEquals(d, jp.getDoubleValue()); 
             } 
         } 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 } 

    

    

    

    

    

    

    // for [Issue#78]
    
    
    

    

    
    
    /**
     * Method that tries to test that number parsing works in cases where
     * input is split between buffer boundaries.
     */
    

    /*
    /**********************************************************
    /* Tests for invalid access
    /**********************************************************
     */
    
    

    
}

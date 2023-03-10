package com.fasterxml.jackson.core.json;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;

/**
 * Set of basic unit tests for verifying that the basic generator
 * functionality works as expected.
 */
public class TestJsonGeneratorFeatures
    extends com.fasterxml.jackson.test.BaseTest
{

public void testBigDecimalAsPlain83() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     BigDecimal ENG = new BigDecimal("1E+2"); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jg = jf.createGenerator(sw); 
     jg.writeNumber(ENG); 
     jg.close(); 
     assertEquals("1E+2", sw.toString()); 
     jf.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true); 
     sw = new StringWriter(); 
     jg = jf.createGenerator(sw); 
     jg.writeNumber(ENG); 
     jg.close(); 
     assertEquals("100", sw.toString()); 
 } 


public void testConfigDefaults86() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     JsonGenerator jg = jf.createGenerator(new StringWriter()); 
     assertFalse(jg.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)); 
     assertFalse(jg.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)); 
     jg.close(); 
 } 


public void testFieldNameQuoting119() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     _testFieldNameQuoting(jf, true); 
     jf.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES); 
     _testFieldNameQuoting(jf, false); 
     jf.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES); 
     _testFieldNameQuoting(jf, true); 
 } 


public void testNonNumericQuoting120() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     _testNonNumericQuoting(jf, true); 
     jf.disable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS); 
     _testNonNumericQuoting(jf, false); 
     jf.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS); 
     _testNonNumericQuoting(jf, true); 
 } 


public void testNumbersAsJSONStrings121() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     assertEquals("[1,2,1.25,2.25,3001,0.5,-1]", _writeNumbers(jf)); 
     jf.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true); 
     assertEquals("[\"1\",\"2\",\"1.25\",\"2.25\",\"3001\",\"0.5\",\"-1\"]", _writeNumbers(jf)); 
 } 

    

    

    

    /**
     * Testing for [JACKSON-176], ability to force serializing numbers
     * as JSON Strings.
     */
    

    // [Issue#85]
    
    
    private String _writeNumbers(JsonFactory jf) throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
    
        jg.writeStartArray();
        jg.writeNumber(1);
        jg.writeNumber(2L);
        jg.writeNumber(1.25);
        jg.writeNumber(2.25f);
        jg.writeNumber(BigInteger.valueOf(3001));
        jg.writeNumber(BigDecimal.valueOf(0.5));
        jg.writeNumber("-1");
        jg.writeEndArray();
        jg.close();

        return sw.toString();
    }

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void _testFieldNameQuoting(JsonFactory jf, boolean quoted)
        throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
        jg.writeStartObject();
        jg.writeFieldName("foo");
        jg.writeNumber(1);
        jg.writeEndObject();
        jg.close();

        String result = sw.toString();
        if (quoted) {
            assertEquals("{\"foo\":1}", result);
        } else {
            assertEquals("{foo:1}", result);
        }
    }
    private void _testNonNumericQuoting(JsonFactory jf, boolean quoted)
        throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
        jg.writeStartObject();
        jg.writeFieldName("double");
        jg.writeNumber(Double.NaN);
        jg.writeEndObject();
        jg.writeStartObject();
        jg.writeFieldName("float");
        jg.writeNumber(Float.NaN);
        jg.writeEndObject();
        jg.close();
	
        String result = sw.toString();
        if (quoted) {
            assertEquals("{\"double\":\"NaN\"} {\"float\":\"NaN\"}", result);
        } else {
            assertEquals("{\"double\":NaN} {\"float\":NaN}", result);
        }
    }
}

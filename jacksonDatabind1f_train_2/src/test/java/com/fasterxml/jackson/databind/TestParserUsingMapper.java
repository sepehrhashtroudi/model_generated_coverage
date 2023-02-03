package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestParserUsingMapper  extends com.fasterxml.jackson.test.BaseTest
{
    final static int TWO_BYTE_ESCAPED = 0x111;
    final static int THREE_BYTE_ESCAPED = 0x1111;

    final static SerializedString TWO_BYTE_ESCAPED_STRING = new SerializedString("&111;");
    final static SerializedString THREE_BYTE_ESCAPED_STRING = new SerializedString("&1111;");
    
    final static class Pojo
    {
        int _x;

        public void setX(int x) { _x = x; }
    }
    
    /*
    /********************************************************
    /* Helper types
    /********************************************************
     */

    /**
     * Trivial simple custom escape definition set.
     */
    static class MyEscapes extends CharacterEscapes
    {
        private static final long serialVersionUID = 1L;

        private final int[] _asciiEscapes;

        public MyEscapes() {
            _asciiEscapes = standardAsciiEscapesForJSON();
            _asciiEscapes['a'] = 'A'; // to basically give us "\A"
            _asciiEscapes['b'] = CharacterEscapes.ESCAPE_STANDARD; // too force "\u0062"
            _asciiEscapes['d'] = CharacterEscapes.ESCAPE_CUSTOM;
        }
        
        @Override
        public int[] getEscapeCodesForAscii() {
            return _asciiEscapes;
        }

        @Override
        public SerializableString getEscapeSequence(int ch)
        {
            if (ch == 'd') {
                return new SerializedString("[D]");
            }
            if (ch == TWO_BYTE_ESCAPED) {
                return TWO_BYTE_ESCAPED_STRING;
            }
            if (ch == THREE_BYTE_ESCAPED) {
                return THREE_BYTE_ESCAPED_STRING;
            }
            return null;
        }
    }
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */


public void testEscapingUsingMapper284() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true); 
     assertEquals(quote("\\u0101"), mapper.writeValueAsString(String.valueOf((char) 257))); 
 } 


public void testReadingArrayAsTree287() throws IOException { 
     JsonFactory jf = new MappingJsonFactory(); 
     final String JSON = "[ 1, 2, false ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = jf.createParser(new StringReader(JSON)); 
         if (i == 0) { 
             assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         } 
         JsonNode root = (JsonNode) jp.readValueAsTree(); 
         jp.close(); 
         assertTrue(root.isArray()); 
         assertEquals(3, root.size()); 
         assertEquals(1, root.get(0).intValue()); 
         assertEquals(2, root.get(1).intValue()); 
         assertFalse(root.get(2).booleanValue()); 
     } 
 } 


public void testIncrementalPojoReading304() throws IOException { 
     JsonFactory jf = new MappingJsonFactory(); 
     final String JSON = "[ 1, true, null, \"abc\" ]"; 
     JsonParser jp = jf.createParser(new StringReader(JSON)); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(Integer.valueOf(1), jp.readValueAs(Integer.class)); 
     assertEquals(Boolean.TRUE, jp.readValueAs(Boolean.class)); 
     assertNull(jp.readValueAs(Object.class)); 
     assertEquals(JsonToken.VALUE_NULL, jp.getLastClearedToken()); 
     assertEquals("abc", jp.readValueAs(String.class)); 
     assertNull(jp.readValueAs(Object.class)); 
     assertEquals(JsonToken.END_ARRAY, jp.getLastClearedToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
 } 

    
    
    

    /**
     * Test similar to above, but instead reads a sequence of values
     */
    

    
    
    // for [JACKSON-672]
    
}

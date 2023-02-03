package com.fasterxml.jackson.databind.util;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserSequence;

public class TestTokenBuffer extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Basic TokenBuffer tests
    /**********************************************************
     */
    
    /**
     * Test writing of individual simple values
     */

public void testWithJsonParserSequenceSimple260() throws IOException { 
     TokenBuffer buf = new TokenBuffer(null); 
     buf.writeStartArray(); 
     buf.writeString("test"); 
     JsonParser jp = createParserUsingReader("[ true, null ]"); 
     JsonParserSequence seq = JsonParserSequence.createFlattened(buf.asParser(), jp); 
     assertEquals(2, seq.containedParsersCount()); 
     assertFalse(jp.isClosed()); 
     assertFalse(seq.hasCurrentToken()); 
     assertNull(seq.getCurrentToken()); 
     assertNull(seq.getCurrentName()); 
     assertToken(JsonToken.START_ARRAY, seq.nextToken()); 
     assertToken(JsonToken.VALUE_STRING, seq.nextToken()); 
     assertEquals("test", seq.getText()); 
     assertToken(JsonToken.START_ARRAY, seq.nextToken()); 
     assertToken(JsonToken.VALUE_TRUE, seq.nextToken()); 
     assertToken(JsonToken.VALUE_NULL, seq.nextToken()); 
     assertToken(JsonToken.END_ARRAY, seq.nextToken()); 
     assertNull(seq.nextToken()); 
     assertNull(seq.nextToken()); 
     assertTrue(jp.isClosed()); 
     jp.close(); 
     buf.close(); 
 } 


public void testSimpleObject263() throws IOException { 
     TokenBuffer buf = new TokenBuffer(null); 
     assertTrue(buf.getOutputContext().inRoot()); 
     buf.writeStartObject(); 
     assertTrue(buf.getOutputContext().inObject()); 
     buf.writeEndObject(); 
     assertTrue(buf.getOutputContext().inRoot()); 
     JsonParser jp = buf.asParser(); 
     assertNull(jp.getCurrentToken()); 
     assertTrue(jp.getParsingContext().inRoot()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertTrue(jp.getParsingContext().inObject()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertTrue(jp.getParsingContext().inRoot()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf.close(); 
     buf = new TokenBuffer(null); 
     buf.writeStartObject(); 
     buf.writeNumberField("num", 1.25); 
     buf.writeEndObject(); 
     jp = buf.asParser(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("num", jp.getCurrentName()); 
     jp.overrideCurrentName("bah"); 
     assertEquals("bah", jp.getCurrentName()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertEquals(1.25, jp.getDoubleValue()); 
     assertEquals("bah", jp.getCurrentName()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf.close(); 
 } 

    

    

    

    /**
     * Verify handling of that "standard" test document (from JSON
     * specification)
     */
    

    
    
    /*
    /**********************************************************
    /* Tests to verify interaction of TokenBuffer and JsonParserSequence
    /**********************************************************
     */
    
    
    
    /**
     * Test to verify that TokenBuffer and JsonParserSequence work together
     * as expected.
     */
        
}

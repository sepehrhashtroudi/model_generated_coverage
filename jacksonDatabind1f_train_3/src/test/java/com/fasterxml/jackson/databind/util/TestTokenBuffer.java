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

public void testAppend271() throws IOException { 
     TokenBuffer buf1 = new TokenBuffer(null); 
     buf1.writeStartObject(); 
     buf1.writeFieldName("a"); 
     buf1.writeBoolean(true); 
     TokenBuffer buf2 = new TokenBuffer(null); 
     buf2.writeFieldName("b"); 
     buf2.writeNumber(13); 
     buf2.writeEndObject(); 
     buf1.append(buf2); 
     JsonParser jp = buf1.asParser(); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("a", jp.getCurrentName()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("b", jp.getCurrentName()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(13, jp.getIntValue()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     jp.close(); 
     buf1.close(); 
 } 


public void testSimpleArray273() throws IOException { 
     TokenBuffer buf = new TokenBuffer(null); 
     assertTrue(buf.getOutputContext().inRoot()); 
     buf.writeStartArray(); 
     assertTrue(buf.getOutputContext().inArray()); 
     buf.writeEndArray(); 
     assertTrue(buf.getOutputContext().inRoot()); 
     JsonParser jp = buf.asParser(); 
     assertNull(jp.getCurrentToken()); 
     assertTrue(jp.getParsingContext().inRoot()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertTrue(jp.getParsingContext().inArray()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertTrue(jp.getParsingContext().inRoot()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf.close(); 
     buf = new TokenBuffer(null); 
     buf.writeStartArray(); 
     buf.writeBoolean(true); 
     buf.writeNull(); 
     buf.writeEndArray(); 
     jp = buf.asParser(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertTrue(jp.getBooleanValue()); 
     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf.close(); 
     buf = new TokenBuffer(null); 
     buf.writeStartArray(); 
     buf.writeStartArray(); 
     buf.writeBinary(new byte[3]); 
     buf.writeEndArray(); 
     buf.writeEndArray(); 
     jp = buf.asParser(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken()); 
     Object ob = jp.getEmbeddedObject(); 
     assertNotNull(ob); 
     assertTrue(ob instanceof byte[]); 
     assertEquals(3, ((byte[]) ob).length); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     buf.close(); 
 } 


public void testWithJsonParserSequenceSimple274() throws IOException { 
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


public void testSimpleObject277() throws IOException { 
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


public void testWithJSONSampleDoc280() throws Exception { 
     JsonParser jp = createParserUsingReader(SAMPLE_DOC_JSON_SPEC); 
     TokenBuffer tb = new TokenBuffer(null); 
     while (jp.nextToken() != null) { 
         tb.copyCurrentEvent(jp); 
     } 
     verifyJsonSpecSampleDoc(tb.asParser(), false); 
     verifyJsonSpecSampleDoc(tb.asParser(), true); 
     tb.close(); 
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

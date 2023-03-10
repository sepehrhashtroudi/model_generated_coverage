package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class TestGeneratorWithSerializedString
    extends com.fasterxml.jackson.test.BaseTest
{
    final static String NAME_WITH_QUOTES = "\"name\"";
    final static String NAME_WITH_LATIN1 = "P\u00f6ll\u00f6";

    private final SerializedString quotedName = new SerializedString(NAME_WITH_QUOTES);
    private final SerializedString latin1Name = new SerializedString(NAME_WITH_LATIN1);
    

public void testSimple75() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator jgen = jf.createGenerator(sw); 
     _writeSimple(jgen); 
     jgen.close(); 
     String json = sw.toString(); 
     _verifySimple(jf.createParser(json)); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     jgen = jf.createGenerator(out, JsonEncoding.UTF8); 
     _writeSimple(jgen); 
     jgen.close(); 
     byte[] jsonB = out.toByteArray(); 
     _verifySimple(jf.createParser(jsonB)); 
 } 

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private void _writeSimple(JsonGenerator jgen) throws Exception
    {
        // Let's just write array of 2 objects
        jgen.writeStartArray();

        jgen.writeStartObject();
        jgen.writeFieldName(quotedName);
        jgen.writeString("a");
        jgen.writeFieldName(latin1Name);
        jgen.writeString("b");
        jgen.writeEndObject();

        jgen.writeStartObject();
        jgen.writeFieldName(latin1Name);
        jgen.writeString("c");
        jgen.writeFieldName(quotedName);
        jgen.writeString("d");
        jgen.writeEndObject();
        
        jgen.writeEndArray();
    }

    private void _verifySimple(JsonParser jp) throws Exception
    {
        assertToken(JsonToken.START_ARRAY, jp.nextToken());

        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(NAME_WITH_QUOTES, jp.getText());
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("a", jp.getText());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(NAME_WITH_LATIN1, jp.getText());
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("b", jp.getText());
        assertToken(JsonToken.END_OBJECT, jp.nextToken());

        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(NAME_WITH_LATIN1, jp.getText());
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("c", jp.getText());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(NAME_WITH_QUOTES, jp.getText());
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("d", jp.getText());
        assertToken(JsonToken.END_OBJECT, jp.nextToken());
        
        assertToken(JsonToken.END_ARRAY, jp.nextToken());
        assertNull(jp.nextToken());
    }
}

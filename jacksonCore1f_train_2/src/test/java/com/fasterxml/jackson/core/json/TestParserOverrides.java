package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.StringReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class TestParserOverrides extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Wrappers, to test stream and reader-based parsers
    /**********************************************************
     */


public void testTokenAccess14() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     _testTokenAccess(jf, false); 
     _testTokenAccess(jf, true); 
 } 

    
    
    

    /*
    /**********************************************************
    /* Actual test methods
    /**********************************************************
     */
    
    public void _testTokenAccess(JsonFactory jf, boolean useStream) throws Exception
    {
        final String DOC = "[ ]";
        JsonParser jp = useStream ?
                jf.createParser(new ByteArrayInputStream(DOC.getBytes("UTF-8")))
                : jf.createParser(DOC);
        assertNull(jp.getCurrentToken());
        jp.clearCurrentToken();
        assertNull(jp.getCurrentToken());
        assertNull(jp.getEmbeddedObject());
        assertToken(JsonToken.START_ARRAY, jp.nextToken());
        assertToken(JsonToken.START_ARRAY, jp.getCurrentToken());
        jp.clearCurrentToken();
        assertNull(jp.getCurrentToken());
        // Also: no codec defined by default
        try {
            jp.readValueAsTree();
            fail("Should get exception without codec");
        } catch (IllegalStateException e) {
            verifyException(e, "No ObjectCodec defined");
        }
        jp.close();
    }
    
    private void _testCurrentName(JsonFactory jf, boolean useStream) throws Exception
    {
        final String DOC = "{\"first\":{\"second\":3, \"third\":false}}";
        JsonParser jp = useStream ?
                jf.createParser(new ByteArrayInputStream(DOC.getBytes("UTF-8")))
                : jf.createParser(new StringReader(DOC));
        assertNull(jp.getCurrentToken());
        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("first", jp.getCurrentName());
        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals("first", jp.getCurrentName()); // still the same...
        jp.overrideCurrentName("foobar");
        assertEquals("foobar", jp.getCurrentName()); // but not any more!

        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("second", jp.getCurrentName());
        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals("second", jp.getCurrentName());

        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("third", jp.getCurrentName());
        assertToken(JsonToken.VALUE_FALSE, jp.nextToken());
        assertEquals("third", jp.getCurrentName());

        assertToken(JsonToken.END_OBJECT, jp.nextToken());
        // should retain overrides, too
        assertEquals("foobar", jp.getCurrentName());

        assertToken(JsonToken.END_OBJECT, jp.nextToken());
        jp.clearCurrentToken();
        assertNull(jp.getCurrentToken());
        jp.close();
    }
    

}

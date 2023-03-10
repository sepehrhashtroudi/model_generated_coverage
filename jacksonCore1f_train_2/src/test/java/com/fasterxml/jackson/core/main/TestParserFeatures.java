package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.*;

/**
 * Unit tests for verifying that additional <code>JsonParser.Feature</code>
 * settings work as expected.
 */
public class TestParserFeatures
    extends com.fasterxml.jackson.test.BaseTest
{

public void testTabsEnabled52() throws Exception { 
     _testTabsEnabled(false); 
     _testTabsEnabled(true); 
 } 


public void testTabsDefault90() throws Exception { 
     _testTabsDefault(false); 
     _testTabsDefault(true); 
 } 


public void testQuotesRequired110() throws Exception { 
     _testQuotesRequired(false); 
     _testQuotesRequired(true); 
 } 

    

    


    // // Tests for [JACKSON-208], unquoted tabs:

    

    
    
    /*
    /****************************************************************
    /* Secondary test methods
    /****************************************************************
     */

    private void _testQuotesRequired(boolean useStream) throws Exception
    {
        final String JSON = "{ test : 3 }";
        final String EXP_ERROR_FRAGMENT = "was expecting double-quote to start";
        JsonFactory f = new JsonFactory();
        JsonParser jp = useStream ?
            createParserUsingStream(f, JSON, "UTF-8")
            : createParserUsingReader(f, JSON)
            ;

        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        try {
            jp.nextToken();
        } catch (JsonParseException je) {
            verifyException(je, EXP_ERROR_FRAGMENT);
        } finally {
            jp.close();
        }
    }

    // // // Tests for [JACKSON-208]

    private void _testTabsDefault(boolean useStream) throws Exception
    {
        JsonFactory f = new JsonFactory();
        // First, let's see that by default unquoted tabs are illegal
        String JSON = "[\"tab:\t\"]";
        JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON);
        assertToken(JsonToken.START_ARRAY, jp.nextToken());
        try {
            jp.nextToken();
            jp.getText();
            fail("Expected exception");
        } catch (JsonParseException e) {
            verifyException(e, "Illegal unquoted character");
        } finally {
            jp.close();
        }
    }

    private void _testTabsEnabled(boolean useStream) throws Exception
    {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);

        String FIELD = "a\tb";
        String VALUE = "\t";
        String JSON = "{ "+quote(FIELD)+" : "+quote(VALUE)+"}";
        JsonParser jp = useStream ? createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON);

        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD, jp.getText());
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals(VALUE, jp.getText());
        assertToken(JsonToken.END_OBJECT, jp.nextToken());
        jp.close();
    }
}

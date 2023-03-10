package com.fasterxml.jackson.core.sym;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;

/**
 * Unit tests for verifying that {@link JsonParser} instances properly
 * merge back symbols to the root symbol table
 */
@SuppressWarnings("serial")
public class TestJsonParserSymbols
    extends com.fasterxml.jackson.test.BaseTest
{
    /**
     * To peek into state of "root" symbol tables (parent of all symbol
     * tables for parsers constructed by this factory) we need to
     * add some methods.
     */
    final static class MyJsonFactory extends JsonFactory
    {
        public int byteSymbolCount() { return _rootByteSymbols.size(); }
        public int charSymbolCount() { return _rootCharSymbols.size(); }
    }

    final static String JSON = "{ \"a\" : 3, \"aaa\" : 4, \"_a\" : 0 }";


public void testByteSymbolsWithEOF29() throws Exception { 
     MyJsonFactory f = new MyJsonFactory(); 
     JsonParser jp = _getParser(f, JSON, true); 
     while (jp.nextToken() != null) { 
         assertEquals(0, f.byteSymbolCount()); 
     } 
     assertEquals(3, f.byteSymbolCount()); 
     jp.close(); 
     assertEquals(3, f.byteSymbolCount()); 
 } 


public void testByteSymbolsWithClose55() throws Exception { 
     _testWithClose(true); 
 } 


public void testCharSymbolsWithEOF109() throws Exception { 
     MyJsonFactory f = new MyJsonFactory(); 
     JsonParser jp = _getParser(f, JSON, false); 
     while (jp.nextToken() != null) { 
         assertEquals(0, f.charSymbolCount()); 
     } 
     assertEquals(3, f.charSymbolCount()); 
     jp.close(); 
     assertEquals(3, f.charSymbolCount()); 
 } 

    

    

    

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void _testWithClose(boolean useBytes) throws IOException
    {
        MyJsonFactory f = new MyJsonFactory();
        JsonParser jp = _getParser(f, JSON, useBytes);
        // Let's check 2 names
        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());

        // shouldn't update before close or EOF:
        assertEquals(0, useBytes ? f.byteSymbolCount() : f.charSymbolCount());
        jp.close();
        // but should after close
        assertEquals(2, useBytes ? f.byteSymbolCount() : f.charSymbolCount());
    }

    private JsonParser _getParser(MyJsonFactory f, String doc, boolean useBytes) throws IOException
    {
        JsonParser jp;
        if (useBytes) {
            jp = f.createParser(doc.getBytes("UTF-8"));
            assertEquals(UTF8StreamJsonParser.class, jp.getClass());
            assertEquals(0, f.byteSymbolCount());
        } else {
            jp = f.createParser(doc);
            assertEquals(ReaderBasedJsonParser.class, jp.getClass());
            assertEquals(0, f.charSymbolCount());
        }
        return jp;
    }
}

package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for those Jackson types we want to ensure can be serialized.
 */
public class TestJacksonTypes
    extends BaseMapTest
{

public void testTokenBuffer264() throws Exception { 
     JsonParser jp = createParserUsingReader(SAMPLE_DOC_JSON_SPEC); 
     TokenBuffer tb = new TokenBuffer(null); 
     while (jp.nextToken() != null) { 
         tb.copyCurrentEvent(jp); 
     } 
     String str = serializeAsString(tb); 
     verifyJsonSpecSampleDoc(createParserUsingReader(str), true); 
 } 


public void testLocation556() throws IOException { 
     File f = new File("/tmp/test.json"); 
     JsonLocation loc = new JsonLocation(f, -1, 100, 13); 
     ObjectMapper mapper = new ObjectMapper(); 
     Map<String, Object> result = writeAndMap(mapper, loc); 
     assertEquals(5, result.size()); 
     assertEquals(f.getAbsolutePath(), result.get("sourceRef")); 
     assertEquals(Integer.valueOf(-1), result.get("charOffset")); 
     assertEquals(Integer.valueOf(-1), result.get("byteOffset")); 
     assertEquals(Integer.valueOf(100), result.get("lineNr")); 
     assertEquals(Integer.valueOf(13), result.get("columnNr")); 
 } 

    

    /**
     * Verify that {@link TokenBuffer} can be properly serialized
     * automatically, using the "standard" JSON sample document
     */
    
}

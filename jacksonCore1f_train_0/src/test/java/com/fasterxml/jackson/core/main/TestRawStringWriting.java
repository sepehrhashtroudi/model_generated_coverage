package com.fasterxml.jackson.core.main;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;

/**
 * @since 1.7
 */
public class TestRawStringWriting extends com.fasterxml.jackson.test.BaseTest
{
    /**
     * Unit test for "JsonGenerator.writeRawUTF8String()"
     */

public void testUtf8StringsWithEscaping87() throws Exception { 
     List<byte[]> strings = generateStrings(new Random(28), 720000, true); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(16000); 
     JsonFactory jf = new JsonFactory(); 
     JsonGenerator jgen = jf.createGenerator(out, JsonEncoding.UTF8); 
     jgen.writeStartArray(); 
     for (byte[] str : strings) { 
         jgen.writeUTF8String(str, 0, str.length); 
         jgen.writeRaw('\n'); 
     } 
     jgen.writeEndArray(); 
     jgen.close(); 
     byte[] json = out.toByteArray(); 
     JsonParser jp = jf.createParser(json); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     for (byte[] inputBytes : strings) { 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         String string = jp.getText(); 
         byte[] outputBytes = string.getBytes("UTF-8"); 
         assertEquals(inputBytes.length, outputBytes.length); 
         assertArrayEquals(inputBytes, outputBytes); 
     } 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
 } 

    

    /**
     * Unit test for "JsonGenerator.writeUTF8String()", which needs
     * to handle escaping properly
     */
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private List<byte[]> generateStrings(Random rnd, int totalLength, boolean includeCtrlChars)
        throws IOException
    {
        ArrayList<byte[]> strings = new ArrayList<byte[]>();
        do {
            int len = 2;
            int bits = rnd.nextInt(13);
            while (--bits >= 0) {
                len += len;
            }
            len = 1 + ((len + len) / 3);
            String str = generateString(rnd, len, includeCtrlChars);
            byte[] bytes = str.getBytes("UTF-8");
            strings.add(bytes);
            totalLength -= bytes.length;
        } while (totalLength > 0);
        return strings;
    }
        
    private String generateString(Random rnd, int length, boolean includeCtrlChars)
    {
        StringBuilder sb = new StringBuilder(length);
        do {
            int i;
            switch (rnd.nextInt(3)) {
            case 0: // 3 byte one
                i = 2048 + rnd.nextInt(16383);
                break;
            case 1: // 2 byte
                i = 128 + rnd.nextInt(1024);
                break;
            default: // ASCII
                i = rnd.nextInt(192);
                if (!includeCtrlChars) {
                    i += 32;
                    // but also need to avoid backslash, double-quote
                    if (i == '\\' || i == '"') {
                        i = '@'; // just arbitrary choice
                    }
                }
            }
            sb.append((char) i);
        } while (sb.length() < length);
        return sb.toString();
    }
}

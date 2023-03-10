package com.fasterxml.jackson.core.main;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.*;

import com.fasterxml.jackson.core.*;

/**
 * Set of basic unit tests for verifying basic generator
 * features.
 */
public class TestGeneratorMisc
    extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Tests for closing, status
    /**********************************************************
     */


public void testSimpleWriteObject42() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     gen.writeStartArray(); 
     gen.writeObject(1); 
     gen.writeObject((short) -2); 
     gen.writeObject((long) 3); 
     gen.writeObject((byte) -4); 
     gen.writeObject(0.25); 
     gen.writeObject(-0.125f); 
     gen.writeObject(Boolean.TRUE); 
     gen.close(); 
     String act = sw.toString().trim(); 
     assertEquals("[1,-2,3,-4,0.25,-0.125,true]", act); 
     sw = new StringWriter(); 
     gen = jf.createGenerator(sw); 
     gen.writeStartArray(); 
     gen.writeObject(BigInteger.valueOf(1234)); 
     gen.writeObject(new BigDecimal(0.5)); 
     gen.writeEndArray(); 
     gen.close(); 
     act = sw.toString().trim(); 
     assertEquals("[1234,0.5]", act); 
     sw = new StringWriter(); 
     gen = jf.createGenerator(sw); 
     gen.writeStartArray(); 
     gen.writeObject(new AtomicBoolean(false)); 
     gen.writeObject(new AtomicInteger(13)); 
     gen.writeObject(new AtomicLong(-127L)); 
     gen.writeEndArray(); 
     gen.close(); 
     act = sw.toString().trim(); 
     assertEquals("[false,13,-127]", act); 
 } 


public void testLongerObjects44() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     for (int i = 0; i < 2; ++i) { 
         boolean useChars = (i == 0); 
         JsonGenerator jgen; 
         ByteArrayOutputStream bout = new ByteArrayOutputStream(200); 
         if (useChars) { 
             jgen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); 
         } else { 
             jgen = jf.createGenerator(bout, JsonEncoding.UTF8); 
         } 
         jgen.writeStartObject(); 
         for (int rounds = 0; rounds < 1500; ++rounds) { 
             for (int letter = 'a'; letter <= 'z'; ++letter) { 
                 for (int index = 0; index < 20; ++index) { 
                     String name; 
                     if (letter > 'f') { 
                         name = "X" + letter + index; 
                     } else if (letter > 'p') { 
                         name = "" + letter + index; 
                     } else { 
                         name = "__" + index + letter; 
                     } 
                     jgen.writeFieldName(name); 
                     jgen.writeNumber(index - 1); 
                 } 
                 jgen.writeRaw('\n'); 
             } 
         } 
         jgen.writeEndObject(); 
         jgen.close(); 
         byte[] json = bout.toByteArray(); 
         JsonParser jp = jf.createParser(json); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         for (int rounds = 0; rounds < 1500; ++rounds) { 
             for (int letter = 'a'; letter <= 'z'; ++letter) { 
                 for (int index = 0; index < 20; ++index) { 
                     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
                     String name; 
                     if (letter > 'f') { 
                         name = "X" + letter + index; 
                     } else if (letter > 'p') { 
                         name = "" + letter + index; 
                     } else { 
                         name = "__" + index + letter; 
                     } 
                     assertEquals(name, jp.getCurrentName()); 
                     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
                     assertEquals(index - 1, jp.getIntValue()); 
                 } 
             } 
         } 
         assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
         jp.close(); 
     } 
 } 


public void testRawValue93() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     gen.writeStartArray(); 
     gen.writeRawValue("7"); 
     gen.writeRawValue("[ null ]"); 
     gen.writeRawValue("false"); 
     gen.writeEndArray(); 
     gen.close(); 
     JsonParser jp = createParserUsingReader(sw.toString()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(7, jp.getIntValue()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
 } 

    

    // Also, "very simple" objects are supported even without Codec:
    
    
    /*
    /**********************************************************
    /* Tests for raw output
    /**********************************************************
     */

    

    
    
    /*
    /**********************************************************
    /* Tests for binary data
    /**********************************************************
     */

    /**
     * This is really inadequate test, all in all, but should serve
     * as some kind of sanity check. Reader-side should more thoroughly
     * test things, as it does need writers to construct the data first.
     */
    

    private void _testBinaryWrite(boolean useCharBased) throws Exception
    {
        /* The usual sample input string, from Thomas Hobbes's "Leviathan"
         * (via Wikipedia)
         */
        final String INPUT = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
        final byte[] INPUT_BYTES = INPUT.getBytes("US-ASCII");
        // as per MIME variant, result minus lfs =
        final String OUTPUT =
 "TWFuIGlzIGRpc3Rpbmd1aXNoZWQsIG5vdCBvbmx5IGJ5IGhpcyByZWFzb24sIGJ1dCBieSB0aGlz"
+"IHNpbmd1bGFyIHBhc3Npb24gZnJvbSBvdGhlciBhbmltYWxzLCB3aGljaCBpcyBhIGx1c3Qgb2Yg"
+"dGhlIG1pbmQsIHRoYXQgYnkgYSBwZXJzZXZlcmFuY2Ugb2YgZGVsaWdodCBpbiB0aGUgY29udGlu"
+"dWVkIGFuZCBpbmRlZmF0aWdhYmxlIGdlbmVyYXRpb24gb2Yga25vd2xlZGdlLCBleGNlZWRzIHRo"
+"ZSBzaG9ydCB2ZWhlbWVuY2Ugb2YgYW55IGNhcm5hbCBwbGVhc3VyZS4="
            ;

        /* Let's only test the standard base64 variant; but write
         * values in root, array and object contexts.
         */
        Base64Variant b64v = Base64Variants.getDefaultVariant();
        JsonFactory jf = new JsonFactory();

        for (int i = 0; i < 3; ++i) {
            JsonGenerator gen;
            ByteArrayOutputStream bout = new ByteArrayOutputStream(200);
            if (useCharBased) {
                gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8"));
            } else {
                gen = jf.createGenerator(bout, JsonEncoding.UTF8);
            }

            switch (i) {
            case 0: // root
                gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length);
                break;
            case 1: // array
                gen.writeStartArray();
                gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length);
                gen.writeEndArray();
                break;
            default: // object
                gen.writeStartObject();
                gen.writeFieldName("field");
                gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length);
                gen.writeEndObject();
                break;
            }
            gen.close();

            JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray()));
            
            // Need to skip other events before binary data:
            switch (i) {
            case 0:
                break;
            case 1:
                assertEquals(JsonToken.START_ARRAY, jp.nextToken());
                break;
            default:
                assertEquals(JsonToken.START_OBJECT, jp.nextToken());
                assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
                break;
            }
            assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
            String actualValue = jp.getText();
            jp.close();
            assertEquals(OUTPUT, actualValue);
        }
    }

    /*
    /**********************************************************
    /* Tests for object writing
    /**********************************************************
     */

    /**
     * Unit test that tries to trigger buffer-boundary conditions
     */
    
}

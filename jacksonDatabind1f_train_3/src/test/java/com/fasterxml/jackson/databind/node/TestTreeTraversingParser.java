package com.fasterxml.jackson.databind.node;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;

public class TestTreeTraversingParser
    extends BaseMapTest
{
    static class Person {
        public String name;
        public int magicNumber;
        public List<String> kids;
    }

    // Helper class for [JACKSON-370]
    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class Jackson370Bean {
        public Inner inner;
    }

    public static class Inner {
        public String value;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    

public void testArray90() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonParser jp = m.readTree("[]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[ 12.1 ]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
 } 


public void testSimple184() throws Exception { 
     final String JSON = "{ \"a\" : 123, \"list\" : [ 12.25, null, true, { }, [ ] ] }"; 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(JSON); 
     JsonParser jp = tree.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertEquals("Expected START_OBJECT", JsonToken.START_OBJECT.asString(), jp.getText()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("a", jp.getCurrentName()); 
     assertEquals("a", jp.getText()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals("a", jp.getCurrentName()); 
     assertEquals(123, jp.getIntValue()); 
     assertEquals("123", jp.getText()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("list", jp.getCurrentName()); 
     assertEquals("list", jp.getText()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals("list", jp.getCurrentName()); 
     assertEquals(JsonToken.START_ARRAY.asString(), jp.getText()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertEquals(12.25, jp.getDoubleValue(), 0); 
     assertEquals("12.25", jp.getText()); 
     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL.asString(), jp.getText()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertTrue(jp.getBooleanValue()); 
     assertEquals(JsonToken.VALUE_TRUE.asString(), jp.getText()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.getCurrentName()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     assertTrue(jp.isClosed()); 
 } 


public void testTextAsBinary219() throws Exception { 
     TextNode n = new TextNode("   APs=\n"); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(); 
     assertNotNull(data); 
     assertArrayEquals(new byte[] { 0, -5 }, data); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     assertTrue(jp.isClosed()); 
     n = new TextNode("?!??"); 
     jp = n.traverse(); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     try { 
         jp.getBinaryValue(); 
     } catch (JsonParseException e) { 
         verifyException(e, "Illegal character"); 
     } 
 } 


public void testBinaryPojo289() throws Exception { 
     byte[] inputBinary = new byte[] { 1, 2, 100 }; 
     POJONode n = new POJONode(inputBinary); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(); 
     assertNotNull(data); 
     assertArrayEquals(inputBinary, data); 
     Object pojo = jp.getEmbeddedObject(); 
     assertSame(data, pojo); 
 } 


public void testNested478() throws Exception { 
     final String JSON = "{\"coordinates\":[[[-3,\n1],[179.859681,51.175092]]]}"; 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(JSON); 
     JsonParser jp = tree.traverse(); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
 } 


public void testSpecDoc479() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(SAMPLE_DOC_JSON_SPEC); 
     JsonParser jp = tree.traverse(); 
     verifyJsonSpecSampleDoc(jp, true); 
 } 

    

    
    
    
    
    /**
     * Unit test that verifies that we can (re)parse sample document
     * from JSON specification.
     */
    

    

    

    

    /**
     * Very simple test case to verify that tree-to-POJO
     * conversion works ok
     */
    

    // [JACKSON-370]
    
}


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
    

public void testArray76() throws Exception { 
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


public void testDataBind209() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree("{ \"name\" : \"Tatu\", \n" + "\"magicNumber\" : 42," + "\"kids\" : [ \"Leo\", \"Lila\", \"Leia\" ] \n" + "}"); 
     Person tatu = m.treeToValue(tree, Person.class); 
     assertNotNull(tatu); 
     assertEquals(42, tatu.magicNumber); 
     assertEquals("Tatu", tatu.name); 
     assertNotNull(tatu.kids); 
     assertEquals(3, tatu.kids.size()); 
     assertEquals("Leo", tatu.kids.get(0)); 
     assertEquals("Lila", tatu.kids.get(1)); 
     assertEquals("Leia", tatu.kids.get(2)); 
 } 


public void testTextAsBinary211() throws Exception { 
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


public void testBinaryPojo277() throws Exception { 
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


public void testSkipChildrenWrt370296() throws Exception { 
     ObjectMapper o = new ObjectMapper(); 
     ObjectNode n = o.createObjectNode(); 
     n.putObject("inner").put("value", "test"); 
     n.putObject("unknown").putNull("inner"); 
     Jackson370Bean obj = o.readValue(n.traverse(), Jackson370Bean.class); 
     assertNotNull(obj.inner); 
     assertEquals("test", obj.inner.value); 
 } 


public void testBinaryNode455() throws Exception { 
     byte[] inputBinary = new byte[] { 0, -5 }; 
     BinaryNode n = new BinaryNode(inputBinary); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(); 
     assertNotNull(data); 
     assertArrayEquals(inputBinary, data); 
     assertEquals("APs=", jp.getText()); 
     assertNull(jp.nextToken()); 
 } 


public void testSpecDoc471() throws Exception { 
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


package com.fasterxml.jackson.databind.node;

import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for verifying functionality of {@link JsonNode} methods that
 * convert values to other types
 */
public class TestConversions extends BaseMapTest
{
    static class Root {
        public Leaf leaf;
    }

    static class Leaf {
        public int value;

        public Leaf() { }
        public Leaf(int v) { value = v; }
    }
    
    // MixIn for [JACKSON-554]
    @JsonDeserialize(using = LeafDeserializer.class)
    public static class LeafMixIn
    {
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();
    

public void testEmbeddedObjectInObject84() throws Exception { 
     TokenBuffer buf = new TokenBuffer(MAPPER); 
     buf.writeStartObject(); 
     buf.writeFieldName("pojo"); 
     buf.writeObject(MARKER); 
     buf.writeEndObject(); 
     JsonNode node = MAPPER.readTree(buf.asParser()); 
     buf.close(); 
     assertTrue(node.isObject()); 
     assertEquals(1, node.size()); 
     JsonNode n = node.get("pojo"); 
     assertTrue(n.isPojo()); 
     assertSame(MARKER, ((POJONode) n).getPojo()); 
 } 


public void testIssue70987() throws Exception { 
     byte[] inputData = new byte[] { 1, 2, 3 }; 
     ObjectNode node = MAPPER.createObjectNode(); 
     node.put("data", inputData); 
     Issue709Bean result = MAPPER.treeToValue(node, Issue709Bean.class); 
     String json = MAPPER.writeValueAsString(node); 
     Issue709Bean resultFromString = MAPPER.readValue(json, Issue709Bean.class); 
     Issue709Bean resultFromConvert = MAPPER.convertValue(node, Issue709Bean.class); 
     Assert.assertArrayEquals(inputData, resultFromString.data); 
     Assert.assertArrayEquals(inputData, resultFromConvert.data); 
     Assert.assertArrayEquals(inputData, result.data); 
 } 


public void testAsBoolean90() throws Exception { 
     assertEquals(false, BooleanNode.FALSE.asBoolean()); 
     assertEquals(true, BooleanNode.TRUE.asBoolean()); 
     assertEquals(false, IntNode.valueOf(0).asBoolean()); 
     assertEquals(true, IntNode.valueOf(1).asBoolean()); 
     assertEquals(false, LongNode.valueOf(0).asBoolean()); 
     assertEquals(true, LongNode.valueOf(-34L).asBoolean()); 
     assertEquals(true, new TextNode("true").asBoolean()); 
     assertEquals(false, new TextNode("false").asBoolean()); 
     assertEquals(false, new TextNode("barf").asBoolean()); 
     assertEquals(true, new TextNode("barf").asBoolean(true)); 
     assertEquals(true, new POJONode(Boolean.TRUE).asBoolean()); 
 } 


public void testBase64Text210() throws Exception { 
     final int[] LENS = { 1, 2, 3, 4, 7, 9, 32, 33, 34, 35 }; 
     final Base64Variant[] VARIANTS = { Base64Variants.MIME, Base64Variants.MIME_NO_LINEFEEDS, Base64Variants.MODIFIED_FOR_URL, Base64Variants.PEM }; 
     for (int len : LENS) { 
         byte[] input = new byte[len]; 
         for (int i = 0; i < input.length; ++i) { 
             input[i] = (byte) i; 
         } 
         for (Base64Variant variant : VARIANTS) { 
             TextNode n = new TextNode(variant.encode(input)); 
             byte[] data = null; 
             try { 
                 data = n.getBinaryValue(variant); 
             } catch (Exception e) { 
                 throw new IOException("Failed (variant " + variant + ", data length " + len + "): " + e.getMessage()); 
             } 
             assertNotNull(data); 
             assertArrayEquals(data, input); 
         } 
     } 
 } 


public void testAsInt318() throws Exception { 
     assertEquals(9, IntNode.valueOf(9).asInt()); 
     assertEquals(7, LongNode.valueOf(7L).asInt()); 
     assertEquals(13, new TextNode("13").asInt()); 
     assertEquals(0, new TextNode("foobar").asInt()); 
     assertEquals(27, new TextNode("foobar").asInt(27)); 
     assertEquals(1, BooleanNode.TRUE.asInt()); 
 } 


public void testEmbeddedObject380() throws Exception { 
     TokenBuffer buf = new TokenBuffer(MAPPER); 
     buf.writeObject(new byte[3]); 
     JsonNode node = MAPPER.readTree(buf.asParser()); 
     buf.close(); 
     assertTrue(node.isBinary()); 
     byte[] data = node.binaryValue(); 
     assertNotNull(data); 
     assertEquals(3, data.length); 
 } 

    

    
    
    // Deserializer to trigger the problem described in [JACKSON-554]
    public static class LeafDeserializer extends JsonDeserializer<Leaf>
    {
        @Override
        public Leaf deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            JsonNode tree = (JsonNode) jp.readValueAsTree();
            Leaf leaf = new Leaf();
            leaf.value = tree.get("value").intValue();
            return leaf;
        }
    }

    // Test for [JACKSON-554]
    

    // Test for [JACKSON-631]
    

    static class Issue709Bean {
        public byte[] data;
    }
    
    /**
     * Simple test to verify that byte[] values can be handled properly when
     * converting, as long as there is metadata (from POJO definitions).
     */
    

    
    
    private final Object MARKER = new Object();

    

    
}


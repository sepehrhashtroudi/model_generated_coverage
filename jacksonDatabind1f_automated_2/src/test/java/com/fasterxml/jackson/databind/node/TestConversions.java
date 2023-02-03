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
    
public void testBoolean166() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode result = mapper.readTree("true\n"); 
     assertFalse(result.isNull()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isTextual()); 
     assertTrue(result.isBoolean()); 
     assertType(result, BooleanNode.class); 
     assertTrue(result.booleanValue()); 
     assertEquals("true", result.asText()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(result, BooleanNode.valueOf(true)); 
     assertEquals(result, BooleanNode.getTrue()); 
 }
public void testBinaryPojo260() throws Exception { 
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
public void testInt318() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     int value = -90184; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isInt()); 
     assertType(result, IntNode.class); 
     assertFalse(result.isLong()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().intValue()); 
     assertEquals(value, result.intValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals((double) value, result.doubleValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(result, IntNode.valueOf(value)); 
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


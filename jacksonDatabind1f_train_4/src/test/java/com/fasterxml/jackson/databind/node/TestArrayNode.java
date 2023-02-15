package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;

/**
 * Additional tests for {@link ArrayNode} container class.
 */
public class TestArrayNode
    extends BaseMapTest
{

public void testAdds449() { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     assertNotNull(n.addArray()); 
     assertNotNull(n.addObject()); 
     n.addPOJO("foobar"); 
     n.add(1); 
     n.add(1L); 
     n.add(0.5); 
     n.add(0.5f); 
     assertEquals(7, n.size()); 
     assertNotNull(n.insertArray(0)); 
     assertNotNull(n.insertObject(0)); 
     n.insertPOJO(2, "xxx"); 
     assertEquals(10, n.size()); 
 } 

    

    

    /**
     * Test to verify [JACKSON-227]
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    
    
    
}

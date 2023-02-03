package com.fasterxml.jackson.databind.ext;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.InputSource;
import org.w3c.dom.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDOM extends com.fasterxml.jackson.databind.BaseMapTest
{
    final static String SIMPLE_XML =
        "<root attr='3'><leaf>Rock &amp; Roll!</leaf><?proc instr?></root>";
    final static String SIMPLE_XML_NS =
        "<root ns:attr='abc' xmlns:ns='http://foo' />";
    

public void testSerializeSimpleNonNS232() throws Exception { 
     Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(SIMPLE_XML))); 
     assertNotNull(doc); 
     ObjectMapper mapper = new ObjectMapper(); 
     String outputRaw = mapper.writeValueAsString(doc); 
     String output = mapper.readValue(outputRaw, String.class); 
     assertEquals(SIMPLE_XML, normalizeOutput(output)); 
 } 


public void testDeserializeNonNS578() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     for (int i = 0; i < 2; ++i) { 
         Document doc; 
         if (i == 0) { 
             doc = mapper.readValue(quote(SIMPLE_XML), Document.class); 
         } else { 
             Node node = mapper.readValue(quote(SIMPLE_XML), Node.class); 
             doc = (Document) node; 
         } 
         Element root = doc.getDocumentElement(); 
         assertNotNull(root); 
         assertEquals("root", root.getTagName()); 
         assertEquals("3", root.getAttribute("attr")); 
         assertEquals(1, root.getAttributes().getLength()); 
         NodeList nodes = root.getChildNodes(); 
         assertEquals(2, nodes.getLength()); 
         Element leaf = (Element) nodes.item(0); 
         assertEquals("leaf", leaf.getTagName()); 
         assertEquals(0, leaf.getAttributes().getLength()); 
         ProcessingInstruction pi = (ProcessingInstruction) nodes.item(1); 
         assertEquals("proc", pi.getTarget()); 
         assertEquals("instr", pi.getData()); 
     } 
 } 

    

    
    
    

    /*
     **********************************************************
     * Helper methods
     **********************************************************
     */

    protected static String normalizeOutput(String output)
    {
        // XML declaration to get rid of?
        output = output.trim();
        if (output.startsWith("<?xml")) {
            // can find closing '>' of xml decl...
            output = output.substring(output.indexOf('>')+1).trim();
        }
        // And replace double quotes with single-quotes...
        return output.replace('"', '\'');
    }
}

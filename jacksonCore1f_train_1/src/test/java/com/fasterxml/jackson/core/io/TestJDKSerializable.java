package com.fasterxml.jackson.core.io;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestJDKSerializable
    extends com.fasterxml.jackson.test.BaseTest
{

public void testLocationSerializability106() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     JsonParser jp = jf.createParser("  { }"); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     JsonLocation loc = jp.getCurrentLocation(); 
     ByteArrayOutputStream bytes = new ByteArrayOutputStream(); 
     ObjectOutputStream out = new ObjectOutputStream(bytes); 
     out.writeObject(loc); 
     out.close(); 
     byte[] stuff = bytes.toByteArray(); 
     ObjectInputStream obIn = new ObjectInputStream(new ByteArrayInputStream(stuff)); 
     JsonLocation loc2 = (JsonLocation) obIn.readObject(); 
     assertNotNull(loc2); 
     assertEquals(loc.getLineNr(), loc2.getLineNr()); 
     assertEquals(loc.getColumnNr(), loc2.getColumnNr()); 
     jp.close(); 
 } 

    
}

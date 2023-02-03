package com.fasterxml.jackson.databind;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Tests to verify that most core Jackson components can be serialized
 * using default JDK serialization: this feature is useful for some
 * platforms, such as Android, where memory management is handled
 * much more aggressively.
 */
public class TestJDKSerialization extends BaseMapTest
{
    static class MyPojo {
        public int x;
        private int y;
        
        public MyPojo() { }
        public MyPojo(int x0, int y0) {
            x = x0;
            y = y0;
        }
        
        public int getY() { return y; }
        public void setY(int y) { this.y = y; }
    }
    
    /*
    /**********************************************************
    /* Tests for individual objects
    /**********************************************************
     */


public void testConfigs138() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     byte[] base = jdkSerialize(mapper.getDeserializationConfig().getBaseSettings()); 
     assertNotNull(jdkDeserialize(base)); 
     DeserializationConfig origDC = mapper.getDeserializationConfig(); 
     SerializationConfig origSC = mapper.getSerializationConfig(); 
     byte[] dcBytes = jdkSerialize(origDC); 
     byte[] scBytes = jdkSerialize(origSC); 
     DeserializationConfig dc = jdkDeserialize(dcBytes); 
     assertNotNull(dc); 
     assertEquals(dc._deserFeatures, origDC._deserFeatures); 
     SerializationConfig sc = jdkDeserialize(scBytes); 
     assertNotNull(sc); 
     assertEquals(sc._serFeatures, origSC._serFeatures); 
 } 


public void testObjectReader171() throws IOException { 
     ObjectReader origReader = new ObjectMapper().reader(MyPojo.class); 
     final String JSON = "{\"x\":1,\"y\":2}"; 
     MyPojo p1 = origReader.readValue(JSON); 
     assertEquals(2, p1.y); 
     byte[] bytes = jdkSerialize(origReader); 
     ObjectReader reader2 = jdkDeserialize(bytes); 
     MyPojo p2 = reader2.readValue(JSON); 
     assertEquals(2, p2.y); 
 } 

    

    
    
    

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    protected byte[] jdkSerialize(Object o) throws IOException
    {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream(1000);
        ObjectOutputStream obOut = new ObjectOutputStream(bytes);
        obOut.writeObject(o);
        obOut.close();
        return bytes.toByteArray();
    }

    @SuppressWarnings("unchecked")
    protected <T> T jdkDeserialize(byte[] raw) throws IOException
    {
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(raw));
        try {
            return (T) objIn.readObject();
        } catch (ClassNotFoundException e) {
            fail("Missing class: "+e.getMessage());
            return null;
        } finally {
            objIn.close();
        }
    }

}

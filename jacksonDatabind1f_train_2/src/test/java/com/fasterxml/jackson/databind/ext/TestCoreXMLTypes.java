package com.fasterxml.jackson.databind.ext;

import javax.xml.datatype.*;
import javax.xml.namespace.QName;


import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;

/**
 * Core XML types (javax.xml) are considered "external" (or more precisely "optional")
 * since some Java(-like) platforms do not include them: specifically, Google AppEngine
 * and Android seem to skimp on their inclusion. As such, they are dynamically loaded
 * only as needed, and need bit special handling.
 * 
 * @author tatu
 */
public class TestCoreXMLTypes
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Serializer tests
    /**********************************************************
     */


public void testXMLGregorianCalendarSerAndDeser45() throws Exception { 
     DatatypeFactory dtf = DatatypeFactory.newInstance(); 
     XMLGregorianCalendar cal = dtf.newXMLGregorianCalendar(1974, 10, 10, 18, 15, 17, 123, 0); 
     ObjectMapper mapper = new ObjectMapper(); 
     long timestamp = cal.toGregorianCalendar().getTimeInMillis(); 
     String numStr = String.valueOf(timestamp); 
     assertEquals(numStr, mapper.writeValueAsString(cal)); 
     XMLGregorianCalendar calOut = mapper.readValue(numStr, XMLGregorianCalendar.class); 
     assertNotNull(calOut); 
     assertEquals(timestamp, calOut.toGregorianCalendar().getTimeInMillis()); 
     mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false); 
     String exp = cal.toXMLFormat(); 
     String act = mapper.writeValueAsString(cal); 
     act = act.substring(1, act.length() - 1); 
     exp = removeZ(exp); 
     act = removeZ(act); 
     assertEquals(exp, act); 
 } 


public void testCalendarDeser165() throws Exception { 
     DatatypeFactory dtf = DatatypeFactory.newInstance(); 
     XMLGregorianCalendar cal = dtf.newXMLGregorianCalendar(1974, 10, 10, 18, 15, 17, 123, 0); 
     String exp = cal.toXMLFormat(); 
     assertEquals("Should deserialize to equal XMLGregorianCalendar ('" + exp + "')", cal, new ObjectMapper().readValue(quote(exp), XMLGregorianCalendar.class)); 
 } 


public void testQNameSer428() throws Exception { 
     QName qn = new QName("http://abc", "tag", "prefix"); 
     assertEquals(quote(qn.toString()), serializeAsString(qn)); 
 } 


public void testQNameDeser573() throws Exception { 
     QName qn = new QName("http://abc", "tag", "prefix"); 
     String qstr = qn.toString(); 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("Should deserialize to equal QName (exp serialization: '" + qstr + "')", qn, mapper.readValue(quote(qstr), QName.class)); 
 } 


public void testDurationDeser574() throws Exception { 
     DatatypeFactory dtf = DatatypeFactory.newInstance(); 
     Duration dur = dtf.newDurationDayTime(true, 27, 5, 15, 59); 
     String exp = dur.toString(); 
     assertEquals("Should deserialize to equal Duration ('" + exp + "')", dur, new ObjectMapper().readValue(quote(exp), Duration.class)); 
 } 


public void testDeserializerLoading575() { 
     new CoreXMLDeserializers.DurationDeserializer(); 
     new CoreXMLDeserializers.GregorianCalendarDeserializer(); 
     new CoreXMLDeserializers.QNameDeserializer(); 
 } 

    

    

    

    private String removeZ(String dateStr) {
        if (dateStr.endsWith("Z")) {
            return dateStr.substring(0, dateStr.length()-1);
        }
        if (dateStr.endsWith("+0000")) {
            return dateStr.substring(0, dateStr.length()-5);
        }
        return dateStr;
    }
    
    /*
    /**********************************************************
    /* Deserializer tests
    /**********************************************************
     */
    
    // First things first: must be able to load the deserializers...
    

    

    

    
}

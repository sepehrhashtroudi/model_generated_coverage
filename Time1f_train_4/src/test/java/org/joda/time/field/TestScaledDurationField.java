/*
 *  Copyright 2001-2009 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestScaledDurationField extends TestCase {
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestScaledDurationField.class);
    }

    public TestScaledDurationField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DurationField base = MillisDurationField.INSTANCE;
        iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }

    protected void tearDown() throws Exception {
        iField = null;
    }

    //-----------------------------------------------------------------------

public void test_constructor278() { 
     try { 
         new ScaledDurationField(null, DurationFieldType.minutes(), 10); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new ScaledDurationField(MillisDurationField.INSTANCE, null, 10); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void test_getValue_long279() { 
     assertEquals(0, iField.getValue(0L)); 
     assertEquals(12345678 / 90, iField.getValue(12345678L)); 
     assertEquals(-1234 / 90, iField.getValue(-1234L)); 
     assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX)); 
     try { 
         iField.getValue(LONG_INTEGER_MAX + 1L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getValueAsLong_long280() { 
     assertEquals(0L, iField.getValueAsLong(0L)); 
     assertEquals(12345678L / 90, iField.getValueAsLong(12345678L)); 
     assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L)); 
     assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L)); 
 } 


public void test_getValue_long_long281() { 
     assertEquals(0, iField.getValue(0L, 567L)); 
     assertEquals(12345678 / 90, iField.getValue(12345678L, 567L)); 
     assertEquals(-1234 / 90, iField.getValue(-1234L, 567L)); 
     assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L)); 
     try { 
         iField.getValue(LONG_INTEGER_MAX + 1L, 567L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getValueAsLong_long_long282() { 
     assertEquals(0L, iField.getValueAsLong(0L, 567L)); 
     assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L)); 
     assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L)); 
     assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L)); 
 } 


public void test_getMillis_long283() { 
     assertEquals(0L, iField.getMillis(0L)); 
     assertEquals(1234L * 90L, iField.getMillis(1234L)); 
     assertEquals(-1234L * 90L, iField.getMillis(-1234L)); 
     try { 
         iField.getMillis(LONG_MAX); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getMillis_long_long284() { 
     assertEquals(0L, iField.getMillis(0L, 567L)); 
     assertEquals(1234L * 90L, iField.getMillis(1234L, 567L)); 
     assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L)); 
     try { 
         iField.getMillis(LONG_MAX, 567L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_add_long_int285() { 
     assertEquals(567L, iField.add(567L, 0)); 
     assertEquals(567L + 1234L * 90L, iField.add(567L, 1234)); 
     assertEquals(567L - 1234L * 90L, iField.add(567L, -1234)); 
     try { 
         iField.add(LONG_MAX, 1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_add_long_long286() { 
     assertEquals(567L, iField.add(567L, 0L)); 
     assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L)); 
     assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L)); 
     try { 
         iField.add(LONG_MAX, 1L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
     try { 
         iField.add(1L, LONG_MAX); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getDifference_long_int287() { 
     assertEquals(0, iField.getDifference(1L, 0L)); 
     assertEquals(567, iField.getDifference(567L * 90L, 0L)); 
     assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L)); 
     assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L)); 
     try { 
         iField.getDifference(LONG_MAX, -1L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getDifferenceAsLong_long_long288() { 
     assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L)); 
     assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L)); 
     assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L)); 
     try { 
         iField.getDifferenceAsLong(LONG_MAX, -1L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_compareTo289() { 
     assertEquals(0, iField.compareTo(iField)); 
     assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0); 
     assertEquals(1, iField.compareTo(dummy)); 
     try { 
         iField.compareTo(null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void test_getScalar290() { 
     assertEquals(90, iField.getScalar()); 
 } 


public void testSerialization291() throws Exception { 
     DurationField test = iField; 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     DurationField result = (DurationField) ois.readObject(); 
     ois.close(); 
     assertEquals(test, result); 
 } 


public void test_equals292() { 
     assertEquals(true, iField.equals(iField)); 
     assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2); 
     assertEquals(false, iField.equals(dummy)); 
     dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90); 
     assertEquals(true, iField.equals(dummy)); 
     dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90); 
     assertEquals(false, iField.equals(dummy)); 
     assertEquals(false, iField.equals("")); 
     assertEquals(false, iField.equals(null)); 
 } 


public void test_toString307() { 
     assertEquals("DurationField[minutes]", iField.toString()); 
 } 

    

    

    //-----------------------------------------------------------------------
    

    
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}

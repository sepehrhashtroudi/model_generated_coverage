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
public class TestPreciseDurationField extends TestCase {
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private PreciseDurationField iField;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationField.class);
    }

    public TestPreciseDurationField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }

    protected void tearDown() throws Exception {
        iField = null;
    }

    //-----------------------------------------------------------------------

public void test_getValue_long302() { 
     assertEquals(0, iField.getValue(0L)); 
     assertEquals(12345, iField.getValue(12345678L)); 
     assertEquals(-1, iField.getValue(-1234L)); 
     assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L)); 
     try { 
         iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_getValueAsLong_long303() { 
     assertEquals(0L, iField.getValueAsLong(0L)); 
     assertEquals(12345L, iField.getValueAsLong(12345678L)); 
     assertEquals(-1L, iField.getValueAsLong(-1234L)); 
     assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L)); 
 } 


public void test_getValue_long_long304() { 
     assertEquals(0, iField.getValue(0L, 567L)); 
     assertEquals(12345, iField.getValue(12345678L, 567L)); 
     assertEquals(-1, iField.getValue(-1234L, 567L)); 
     assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L)); 
     try { 
         iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_compareTo434() { 
     assertEquals(0, iField.compareTo(iField)); 
     assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes())); 
     DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     assertEquals(1, iField.compareTo(dummy)); 
     try { 
         iField.compareTo(null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void test_isPrecise435() { 
     assertEquals(true, iField.isPrecise()); 
 } 


public void test_getMillis_int_long436() { 
     assertEquals(0L, iField.getMillis(0, 567L)); 
     assertEquals(1234000L, iField.getMillis(1234, 567L)); 
     assertEquals(-1234000L, iField.getMillis(-1234, 567L)); 
     assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L)); 
 } 


public void test_getMillis_long_long437() { 
     assertEquals(0L, iField.getMillis(0L, 567L)); 
     assertEquals(1234000L, iField.getMillis(1234L, 567L)); 
     assertEquals(-1234000L, iField.getMillis(-1234L, 567L)); 
     try { 
         iField.getMillis(LONG_MAX, 567L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_add_long_int438() { 
     assertEquals(567L, iField.add(567L, 0)); 
     assertEquals(567L + 1234000L, iField.add(567L, 1234)); 
     assertEquals(567L - 1234000L, iField.add(567L, -1234)); 
     try { 
         iField.add(LONG_MAX, 1); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_add_long_long439() { 
     assertEquals(567L, iField.add(567L, 0L)); 
     assertEquals(567L + 1234000L, iField.add(567L, 1234L)); 
     assertEquals(567L - 1234000L, iField.add(567L, -1234L)); 
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


public void test_getDifferenceAsLong_long_long440() { 
     assertEquals(0L, iField.getDifferenceAsLong(1L, 0L)); 
     assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L)); 
     assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L)); 
     assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L)); 
     try { 
         iField.getDifferenceAsLong(LONG_MAX, -1L); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void test_equals441() { 
     assertEquals(true, iField.equals(iField)); 
     assertEquals(false, iField.equals(ISOChronology.getInstance().minutes())); 
     DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     assertEquals(false, iField.equals(dummy)); 
     dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     assertEquals(true, iField.equals(dummy)); 
     dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     assertEquals(false, iField.equals(dummy)); 
     assertEquals(false, iField.equals("")); 
     assertEquals(false, iField.equals(null)); 
 } 


public void test_hashCode442() { 
     assertEquals(true, iField.hashCode() == iField.hashCode()); 
     assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode()); 
     DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0); 
     assertEquals(false, iField.hashCode() == dummy.hashCode()); 
     dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000); 
     assertEquals(true, iField.hashCode() == dummy.hashCode()); 
     dummy = new PreciseDurationField(DurationFieldType.millis(), 1000); 
     assertEquals(false, iField.hashCode() == dummy.hashCode()); 
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

/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPartial_Constructors.class);
    }

    public TestPartial_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */

public void testConstructor_TypeArray_intArray_Chrono446() throws Throwable { 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     int[] values = new int[] { 2005, 33 }; 
     Partial test = new Partial(types, values, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(2, test.size()); 
     assertEquals(2005, test.getValue(0)); 
     assertEquals(2005, test.get(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(33, test.getValue(1)); 
     assertEquals(33, test.get(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, Arrays.equals(test.getFieldTypes(), types)); 
     assertEquals(true, Arrays.equals(test.getValues(), values)); 
 } 


public void testConstructor_Chrono632() throws Throwable { 
     Partial test = new Partial((Chronology) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(0, test.size()); 
     test = new Partial(GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(0, test.size()); 
 } 


public void testConstructorEx_Type_int_Chrono634() throws Throwable { 
     try { 
         new Partial(null, 4, ISO_UTC); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must not be null"); 
     } 
 } 


public void testConstructorEx1_TypeArray_intArray636() throws Throwable { 
     try { 
         new Partial((DateTimeFieldType[]) null, new int[] { 1 }); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must not be null"); 
     } 
 } 


public void testConstructorEx3_TypeArray_intArray637() throws Throwable { 
     try { 
         new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must not be null"); 
     } 
 } 


public void testConstructorEx5_TypeArray_intArray638() throws Throwable { 
     try { 
         new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, new int[2]); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "same length"); 
     } 
 } 


public void testConstructor2_TypeArray_intArray639() throws Throwable { 
     DateTimeFieldType[] types = new DateTimeFieldType[0]; 
     int[] values = new int[0]; 
     Partial test = new Partial(types, values); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(0, test.size()); 
 } 


public void testConstructorEx6_TypeArray_intArray640() throws Throwable { 
     try { 
         new Partial(new DateTimeFieldType[] { null, DateTimeFieldType.dayOfYear() }, new int[2]); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "contain null"); 
     } 
     try { 
         new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), null }, new int[2]); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "contain null"); 
     } 
 } 


public void testConstructorEx7_TypeArray_intArray641() throws Throwable { 
     int[] values = new int[] { 1, 1, 1 }; 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     types = new DateTimeFieldType[] { DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     try { 
         new Partial(types, values); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
 } 


public void testConstructorEx_Partial642() throws Throwable { 
     try { 
         new Partial((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
         assertMessageContains(ex, "must not be null"); 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testConstructor_Partial643() throws Throwable { 
     YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS); 
     Partial test = new Partial(ymd); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(3, test.size()); 
     assertEquals(2005, test.getValue(0)); 
     assertEquals(2005, test.get(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(6, test.getValue(1)); 
     assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     assertEquals(25, test.getValue(2)); 
     assertEquals(25, test.get(DateTimeFieldType.dayOfMonth())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
 } 

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {
        assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {
        assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }

}

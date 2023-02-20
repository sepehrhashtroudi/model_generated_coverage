/*
 *  Copyright 2001-2006 Stephen Colebourne
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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;

/**
 * This class is a JUnit test to test only the UnsupportedDateTimeField class.
 * This set of test cases exercises everything described in the Javadoc for this
 * class.
 * 
 * @author Jeremy R. Rickard
 */
public class TestUnsupportedDateTimeField extends TestCase {

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {
        return new TestSuite(TestUnsupportedDateTimeField.class);
    }

    protected void setUp() throws Exception {
        weeks = DurationFieldType.weeks();
        months = DurationFieldType.months();
        dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        localTime = new LocalTime();
    }

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testAlwaysFalseReturnTypes929() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     assertFalse(fieldOne.isLenient()); 
     assertFalse(fieldOne.isSupported()); 
 } 


public void testDelegatedMethods930() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     try { 
         fieldOne.add(System.currentTimeMillis(), 100); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         long currentTime = System.currentTimeMillis(); 
         long firstComputation = hoursDuration.add(currentTime, 100); 
         long secondComputation = fieldTwo.add(currentTime, 100); 
         assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(false); 
     } 
     try { 
         fieldOne.add(System.currentTimeMillis(), 1000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         long currentTime = System.currentTimeMillis(); 
         long firstComputation = hoursDuration.add(currentTime, 1000L); 
         long secondComputation = fieldTwo.add(currentTime, 1000L); 
         assertTrue(firstComputation == secondComputation); 
         assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(false); 
     } 
     try { 
         fieldOne.getDifference(100000L, 1000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(false); 
     } 
     try { 
         fieldOne.getDifferenceAsLong(100000L, 1000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(false); 
     } 
 } 


public void testPublicGetNameMethod931() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName()); 
 } 


public void testUnsupportedMethods932() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     try { 
         fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.addWrapField(100000L, 250); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.get(1000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsShortText(0, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsShortText(100000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsShortText(100000L, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsShortText(localTime, 0, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsShortText(localTime, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsText(0, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsText(1000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsText(1000L, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsText(localTime, 0, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getAsText(localTime, Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getLeapAmount(System.currentTimeMillis()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumShortTextLength(Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumTextLength(Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumValue(); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumValue(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumValue(localTime); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMaximumValue(localTime, new int[] { 0 }); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMinimumValue(); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMinimumValue(10000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMinimumValue(localTime); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.getMinimumValue(localTime, new int[] { 0 }); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.isLeap(System.currentTimeMillis()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.remainder(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.roundCeiling(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.roundFloor(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.roundHalfCeiling(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.roundHalfEven(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.roundHalfFloor(1000000L); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.set(1000000L, 1000); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.set(1000000L, "Unsupported Operation"); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.set(1000000L, "Unsupported Operation", Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.set(localTime, 0, new int[] { 0 }, 10000); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
     try { 
         fieldOne.set(localTime, 0, new int[] { 0 }, "Unsupported Operation", Locale.getDefault()); 
         assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         assertTrue(true); 
     } 
 } 


public void testMethodsThatShouldAlwaysReturnNull933() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     assertNull(fieldOne.getLeapDurationField()); 
     assertNull(fieldOne.getRangeDurationField()); 
 } 


public void testToString934() { 
     DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     String debugMessage = fieldOne.toString(); 
     assertNotNull(debugMessage); 
     assertTrue(debugMessage.length() > 0); 
 } 

    

    /**
     * 
     * This test exercises the logic in UnsupportedDateTimeField.getInstance. If
     * getInstance() is invoked twice with: - the same DateTimeFieldType -
     * different duration fields
     * 
     * Then the field returned in the first invocation should not be equal to
     * the field returned by the second invocation. In otherwords, the generated
     * instance should be the same for a unique pairing of
     * DateTimeFieldType/DurationField
     */
    

    /**
     * The getName() method should return the same value as the getName() method
     * of the DateTimeFieldType that was used to create the instance.
     * 
     */
    

    /**
     * As this is an unsupported date/time field, some normal methods will
     * always return false, as they are not supported. Verify that each method
     * correctly returns null.
     */
    

    /**
     * According to the JavaDocs, there are two methods that should always
     * return null. * getRangeDurationField() * getLeapDurationField()
     * 
     * Ensure that these are in fact null.
     */

    

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported and throw an UnsupportedOperationException. Verify that each
     * method correctly throws this exception. * add(ReadablePartial instant,
     * int fieldIndex, int[] values, int valueToAdd) * addWrapField(long
     * instant, int value) * addWrapField(ReadablePartial instant, int
     * fieldIndex, int[] values, int valueToAdd) *
     * addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int
     * valueToAdd) * get(long instant) * getAsShortText(int fieldValue, Locale
     * locale) * getAsShortText(long instant) * getAsShortText(long instant,
     * Locale locale) * getAsShortText(ReadablePartial partial, int fieldValue,
     * Locale locale) * getAsShortText(ReadablePartial partial, Locale locale) *
     * getAsText(int fieldValue, Locale locale) * getAsText(long instant) *
     * getAsText(long instant, Locale locale) * getAsText(ReadablePartial
     * partial, int fieldValue, Locale locale) * getAsText(ReadablePartial
     * partial, Locale locale) * getLeapAmount(long instant) *
     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
     * locale) * getMaximumValue() * getMaximumValue(long instant) *
     * getMaximumValue(ReadablePartial instant) *
     * getMaximumValue(ReadablePartial instant, int[] values) *
     * getMinimumValue() * getMinimumValue(long instant) *
     * getMinimumValue(ReadablePartial instant) *
     * getMinimumValue(ReadablePartial instant, int[] values) * isLeap(long
     * instant) * remainder(long instant) * roundCeiling(long instant) *
     * roundFloor(long instant) * roundHalfCeiling(long instant) *
     * roundHalfEven(long instant) * roundHalfFloor(long instant) * set(long
     * instant, int value) * set(long instant, String text) * set(long instant,
     * String text, Locale locale) * set(ReadablePartial instant, int
     * fieldIndex, int[] values, int newValue) * set(ReadablePartial instant,
     * int fieldIndex, int[] values, String text, Locale locale)
     */
    

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported. Some delegate and can possibly throw an
     * UnsupportedOperationException or have a valid return. Verify that each
     * method correctly throws this exception when appropriate and delegates
     * correctly based on the Duration used to get the instance.
     */
    

    /**
    * The toString method should return a suitable debug message (not null).
    * Ensure that the toString method returns a string with length greater than
    * 0 (and not null)
    * 
    */
    
}

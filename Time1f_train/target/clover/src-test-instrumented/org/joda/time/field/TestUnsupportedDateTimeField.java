/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_1ubaubalc8axf03{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,39357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_1ubaubalc8axf03.R.inc(39286);
        __CLR4_4_1ubaubalc8axf03.R.inc(39287);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ubaubalc8axf03.R.inc(39288);
        __CLR4_4_1ubaubalc8axf03.R.inc(39289);weeks = DurationFieldType.weeks();
        __CLR4_4_1ubaubalc8axf03.R.inc(39290);months = DurationFieldType.months();
        __CLR4_4_1ubaubalc8axf03.R.inc(39291);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_1ubaubalc8axf03.R.inc(39292);localTime = new LocalTime();
    }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testDelegatedMethods235() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ilbw6ubh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ilbw6ubh(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39293); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39294);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39295);PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39296);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39297);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39298);fieldOne.add(System.currentTimeMillis(), 100); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39299);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39300);assertTrue(true); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39301);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39302);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39303);long firstComputation = hoursDuration.add(currentTime, 100); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39304);long secondComputation = fieldTwo.add(currentTime, 100); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39305);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39306);assertTrue(false); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39307);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39308);fieldOne.add(System.currentTimeMillis(), 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39309);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39310);assertTrue(true); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39311);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39312);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39313);long firstComputation = hoursDuration.add(currentTime, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39314);long secondComputation = fieldTwo.add(currentTime, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39315);assertTrue(firstComputation == secondComputation); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39316);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39317);assertTrue(false); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39318);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39319);fieldOne.getDifference(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39320);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39321);assertTrue(true); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39322);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39323);int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39324);int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39325);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39326);assertTrue(false); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39327);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39328);fieldOne.getDifferenceAsLong(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39329);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39330);assertTrue(true); 
     } 
     __CLR4_4_1ubaubalc8axf03.R.inc(39331);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39332);long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39333);long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39334);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39335);assertTrue(false); 
     } 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 


public void testToString784() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mli9wuco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString784",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mli9wuco(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39336); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39337);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39338);String debugMessage = fieldOne.toString(); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39339);assertNotNull(debugMessage); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39340);assertTrue(debugMessage.length() > 0); 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 


public void testPublicGetNameMethod809() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtgznjuct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod809",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtgznjuct(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39341); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39342);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39343);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName()); 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 


public void testMethodsThatShouldAlwaysReturnNull962() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djcue4ucw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull962",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djcue4ucw(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39344); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39345);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39346);assertNull(fieldOne.getLeapDurationField()); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39347);assertNull(fieldOne.getRangeDurationField()); 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 


public void testAlwaysFalseReturnTypes1031() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1onz4vfud0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes1031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1onz4vfud0(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39348); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39349);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39350);assertFalse(fieldOne.isLenient()); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39351);assertFalse(fieldOne.isSupported()); 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 


public void testNullValuesToGetInstanceThrowsException1353() {__CLR4_4_1ubaubalc8axf03.R.globalSliceStart(getClass().getName(),39352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9gfpwud4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ubaubalc8axf03.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ubaubalc8axf03.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException1353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9gfpwud4(){try{__CLR4_4_1ubaubalc8axf03.R.inc(39352); 
     __CLR4_4_1ubaubalc8axf03.R.inc(39353);try { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39354);UnsupportedDateTimeField.getInstance(null, null); 
         __CLR4_4_1ubaubalc8axf03.R.inc(39355);assertTrue(false); 
     } catch (IllegalArgumentException e) { 
         __CLR4_4_1ubaubalc8axf03.R.inc(39356);assertTrue(true); 
     } 
 }finally{__CLR4_4_1ubaubalc8axf03.R.flushNeeded();}} 

    

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

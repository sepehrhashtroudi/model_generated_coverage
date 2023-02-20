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
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_1sjesjele6rcmz1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,37048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_1sjesjele6rcmz1.R.inc(36986);
        __CLR4_4_1sjesjele6rcmz1.R.inc(36987);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sjesjele6rcmz1.R.inc(36988);
        __CLR4_4_1sjesjele6rcmz1.R.inc(36989);weeks = DurationFieldType.weeks();
        __CLR4_4_1sjesjele6rcmz1.R.inc(36990);months = DurationFieldType.months();
        __CLR4_4_1sjesjele6rcmz1.R.inc(36991);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_1sjesjele6rcmz1.R.inc(36992);localTime = new LocalTime();
    }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testAlwaysFalseReturnTypes920() {__CLR4_4_1sjesjele6rcmz1.R.globalSliceStart(getClass().getName(),36993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j69ftsjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjesjele6rcmz1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjesjele6rcmz1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes920",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j69ftsjl(){try{__CLR4_4_1sjesjele6rcmz1.R.inc(36993); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(36994);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(36995);assertFalse(fieldOne.isLenient()); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(36996);assertFalse(fieldOne.isSupported()); 
 }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}} 


public void testDelegatedMethods921() {__CLR4_4_1sjesjele6rcmz1.R.globalSliceStart(getClass().getName(),36997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvvs4asjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjesjele6rcmz1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjesjele6rcmz1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods921",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvvs4asjp(){try{__CLR4_4_1sjesjele6rcmz1.R.inc(36997); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(36998);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(36999);PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37000);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37001);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37002);fieldOne.add(System.currentTimeMillis(), 100); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37003);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37004);assertTrue(true); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37005);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37006);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37007);long firstComputation = hoursDuration.add(currentTime, 100); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37008);long secondComputation = fieldTwo.add(currentTime, 100); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37009);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37010);assertTrue(false); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37011);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37012);fieldOne.add(System.currentTimeMillis(), 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37013);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37014);assertTrue(true); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37015);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37016);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37017);long firstComputation = hoursDuration.add(currentTime, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37018);long secondComputation = fieldTwo.add(currentTime, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37019);assertTrue(firstComputation == secondComputation); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37020);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37021);assertTrue(false); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37022);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37023);fieldOne.getDifference(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37024);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37025);assertTrue(true); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37026);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37027);int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37028);int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37029);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37030);assertTrue(false); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37031);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37032);fieldOne.getDifferenceAsLong(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37033);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37034);assertTrue(true); 
     } 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37035);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37036);long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37037);long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37038);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37039);assertTrue(false); 
     } 
 }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}} 


public void testNullValuesToGetInstanceThrowsException922() {__CLR4_4_1sjesjele6rcmz1.R.globalSliceStart(getClass().getName(),37040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dy34dskw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjesjele6rcmz1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjesjele6rcmz1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException922",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dy34dskw(){try{__CLR4_4_1sjesjele6rcmz1.R.inc(37040); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37041);try { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37042);UnsupportedDateTimeField.getInstance(null, null); 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37043);assertTrue(false); 
     } catch (IllegalArgumentException e) { 
         __CLR4_4_1sjesjele6rcmz1.R.inc(37044);assertTrue(true); 
     } 
 }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}} 


public void testPublicGetNameMethod923() {__CLR4_4_1sjesjele6rcmz1.R.globalSliceStart(getClass().getName(),37045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzebtmsl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjesjele6rcmz1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjesjele6rcmz1.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod923",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzebtmsl1(){try{__CLR4_4_1sjesjele6rcmz1.R.inc(37045); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37046);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1sjesjele6rcmz1.R.inc(37047);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName()); 
 }finally{__CLR4_4_1sjesjele6rcmz1.R.flushNeeded();}} 

    

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

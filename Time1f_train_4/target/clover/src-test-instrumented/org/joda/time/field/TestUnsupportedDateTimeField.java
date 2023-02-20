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
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_1smusmule6rjdm8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,37331,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_1smusmule6rjdm8.R.inc(37110);
        __CLR4_4_1smusmule6rjdm8.R.inc(37111);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1smusmule6rjdm8.R.inc(37112);
        __CLR4_4_1smusmule6rjdm8.R.inc(37113);weeks = DurationFieldType.weeks();
        __CLR4_4_1smusmule6rjdm8.R.inc(37114);months = DurationFieldType.months();
        __CLR4_4_1smusmule6rjdm8.R.inc(37115);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_1smusmule6rjdm8.R.inc(37116);localTime = new LocalTime();
    }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testDelegatedMethods943() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fshgt6sn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods943",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fshgt6sn1(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37117); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37118);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37119);PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37120);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37121);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37122);fieldOne.add(System.currentTimeMillis(), 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37123);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37124);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37125);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37126);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37127);long firstComputation = hoursDuration.add(currentTime, 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37128);long secondComputation = fieldTwo.add(currentTime, 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37129);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37130);assertTrue(false); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37131);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37132);fieldOne.add(System.currentTimeMillis(), 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37133);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37134);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37135);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37136);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37137);long firstComputation = hoursDuration.add(currentTime, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37138);long secondComputation = fieldTwo.add(currentTime, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37139);assertTrue(firstComputation == secondComputation); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37140);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37141);assertTrue(false); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37142);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37143);fieldOne.getDifference(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37144);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37145);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37146);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37147);int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37148);int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37149);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37150);assertTrue(false); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37151);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37152);fieldOne.getDifferenceAsLong(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37153);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37154);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37155);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37156);long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37157);long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37158);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37159);assertTrue(false); 
     } 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 


public void testNullValuesToGetInstanceThrowsException944() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hcefhso8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException944",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hcefhso8(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37160); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37161);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37162);UnsupportedDateTimeField.getInstance(null, null); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37163);assertTrue(false); 
     } catch (IllegalArgumentException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37164);assertTrue(true); 
     } 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 


public void testPublicGetNameMethod945() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fw00iisod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod945",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fw00iisod(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37165); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37166);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37167);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName()); 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 


public void testUnsupportedMethods946() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14f9b03sog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testUnsupportedMethods946",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14f9b03sog(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37168); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37169);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37170);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37171);fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37172);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37173);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37174);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37175);fieldOne.addWrapField(100000L, 250); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37176);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37177);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37178);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37179);fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37180);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37181);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37182);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37183);fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37184);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37185);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37186);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37187);fieldOne.get(1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37188);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37189);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37190);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37191);fieldOne.getAsShortText(0, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37192);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37193);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37194);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37195);fieldOne.getAsShortText(100000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37196);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37197);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37198);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37199);fieldOne.getAsShortText(100000L, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37200);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37201);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37202);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37203);fieldOne.getAsShortText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37204);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37205);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37206);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37207);fieldOne.getAsShortText(localTime, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37208);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37209);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37210);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37211);fieldOne.getAsText(0, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37212);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37213);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37214);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37215);fieldOne.getAsText(1000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37216);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37217);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37218);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37219);fieldOne.getAsText(1000L, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37220);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37221);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37222);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37223);fieldOne.getAsText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37224);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37225);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37226);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37227);fieldOne.getAsText(localTime, Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37228);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37229);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37230);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37231);fieldOne.getLeapAmount(System.currentTimeMillis()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37232);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37233);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37234);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37235);fieldOne.getMaximumShortTextLength(Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37236);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37237);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37238);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37239);fieldOne.getMaximumTextLength(Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37240);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37241);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37242);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37243);fieldOne.getMaximumValue(); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37244);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37245);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37246);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37247);fieldOne.getMaximumValue(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37248);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37249);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37250);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37251);fieldOne.getMaximumValue(localTime); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37252);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37253);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37254);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37255);fieldOne.getMaximumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37256);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37257);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37258);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37259);fieldOne.getMinimumValue(); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37260);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37261);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37262);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37263);fieldOne.getMinimumValue(10000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37264);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37265);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37266);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37267);fieldOne.getMinimumValue(localTime); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37268);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37269);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37270);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37271);fieldOne.getMinimumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37272);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37273);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37274);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37275);fieldOne.isLeap(System.currentTimeMillis()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37276);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37277);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37278);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37279);fieldOne.remainder(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37280);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37281);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37282);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37283);fieldOne.roundCeiling(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37284);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37285);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37286);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37287);fieldOne.roundFloor(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37288);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37289);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37290);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37291);fieldOne.roundHalfCeiling(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37292);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37293);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37294);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37295);fieldOne.roundHalfEven(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37296);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37297);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37298);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37299);fieldOne.roundHalfFloor(1000000L); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37300);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37301);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37302);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37303);fieldOne.set(1000000L, 1000); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37304);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37305);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37306);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37307);fieldOne.set(1000000L, "Unsupported Operation"); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37308);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37309);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37310);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37311);fieldOne.set(1000000L, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37312);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37313);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37314);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37315);fieldOne.set(localTime, 0, new int[] { 0 }, 10000); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37316);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37317);assertTrue(true); 
     } 
     __CLR4_4_1smusmule6rjdm8.R.inc(37318);try { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37319);fieldOne.set(localTime, 0, new int[] { 0 }, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1smusmule6rjdm8.R.inc(37320);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1smusmule6rjdm8.R.inc(37321);assertTrue(true); 
     } 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 


public void testMethodsThatShouldAlwaysReturnNull947() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnd4qlssq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnd4qlssq(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37322); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37323);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37324);assertNull(fieldOne.getLeapDurationField()); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37325);assertNull(fieldOne.getRangeDurationField()); 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 


public void testToString948() {__CLR4_4_1smusmule6rjdm8.R.globalSliceStart(getClass().getName(),37326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tahgxyssu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smusmule6rjdm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smusmule6rjdm8.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString948",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tahgxyssu(){try{__CLR4_4_1smusmule6rjdm8.R.inc(37326); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37327);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37328);String debugMessage = fieldOne.toString(); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37329);assertNotNull(debugMessage); 
     __CLR4_4_1smusmule6rjdm8.R.inc(37330);assertTrue(debugMessage.length() > 0); 
 }finally{__CLR4_4_1smusmule6rjdm8.R.flushNeeded();}} 

    

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

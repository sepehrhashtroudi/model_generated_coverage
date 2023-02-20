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
public class TestUnsupportedDateTimeField extends TestCase {static class __CLR4_4_1skqskqle6qeano{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,37254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static TestSuite suite() {try{__CLR4_4_1skqskqle6qeano.R.inc(37034);
        __CLR4_4_1skqskqle6qeano.R.inc(37035);return new TestSuite(TestUnsupportedDateTimeField.class);
    }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1skqskqle6qeano.R.inc(37036);
        __CLR4_4_1skqskqle6qeano.R.inc(37037);weeks = DurationFieldType.weeks();
        __CLR4_4_1skqskqle6qeano.R.inc(37038);months = DurationFieldType.months();
        __CLR4_4_1skqskqle6qeano.R.inc(37039);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_1skqskqle6qeano.R.inc(37040);localTime = new LocalTime();
    }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */

public void testAlwaysFalseReturnTypes929() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1optfogskx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes929",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1optfogskx(){try{__CLR4_4_1skqskqle6qeano.R.inc(37041); 
     __CLR4_4_1skqskqle6qeano.R.inc(37042);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37043);assertFalse(fieldOne.isLenient()); 
     __CLR4_4_1skqskqle6qeano.R.inc(37044);assertFalse(fieldOne.isSupported()); 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 


public void testDelegatedMethods930() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nodc3ssl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nodc3ssl1(){try{__CLR4_4_1skqskqle6qeano.R.inc(37045); 
     __CLR4_4_1skqskqle6qeano.R.inc(37046);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37047);PreciseDurationField hoursDuration = new PreciseDurationField(DurationFieldType.hours(), 10L); 
     __CLR4_4_1skqskqle6qeano.R.inc(37048);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, hoursDuration); 
     __CLR4_4_1skqskqle6qeano.R.inc(37049);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37050);fieldOne.add(System.currentTimeMillis(), 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37051);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37052);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37053);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37054);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1skqskqle6qeano.R.inc(37055);long firstComputation = hoursDuration.add(currentTime, 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37056);long secondComputation = fieldTwo.add(currentTime, 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37057);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37058);assertTrue(false); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37059);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37060);fieldOne.add(System.currentTimeMillis(), 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37061);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37062);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37063);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37064);long currentTime = System.currentTimeMillis(); 
         __CLR4_4_1skqskqle6qeano.R.inc(37065);long firstComputation = hoursDuration.add(currentTime, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37066);long secondComputation = fieldTwo.add(currentTime, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37067);assertTrue(firstComputation == secondComputation); 
         __CLR4_4_1skqskqle6qeano.R.inc(37068);assertEquals(firstComputation, secondComputation); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37069);assertTrue(false); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37070);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37071);fieldOne.getDifference(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37072);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37073);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37074);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37075);int firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37076);int secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37077);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37078);assertTrue(false); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37079);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37080);fieldOne.getDifferenceAsLong(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37081);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37082);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37083);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37084);long firstDifference = hoursDuration.getDifference(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37085);long secondDifference = fieldTwo.getDifference(100000L, 1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37086);assertEquals(firstDifference, secondDifference); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37087);assertTrue(false); 
     } 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 


public void testPublicGetNameMethod931() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtur6xsm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod931",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtur6xsm8(){try{__CLR4_4_1skqskqle6qeano.R.inc(37088); 
     __CLR4_4_1skqskqle6qeano.R.inc(37089);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37090);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName()); 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 


public void testUnsupportedMethods932() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqil9ssmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testUnsupportedMethods932",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqil9ssmb(){try{__CLR4_4_1skqskqle6qeano.R.inc(37091); 
     __CLR4_4_1skqskqle6qeano.R.inc(37092);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37093);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37094);fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37095);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37096);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37097);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37098);fieldOne.addWrapField(100000L, 250); 
         __CLR4_4_1skqskqle6qeano.R.inc(37099);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37100);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37101);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37102);fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37103);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37104);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37105);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37106);fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100); 
         __CLR4_4_1skqskqle6qeano.R.inc(37107);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37108);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37109);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37110);fieldOne.get(1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37111);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37112);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37113);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37114);fieldOne.getAsShortText(0, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37115);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37116);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37117);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37118);fieldOne.getAsShortText(100000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37119);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37120);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37121);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37122);fieldOne.getAsShortText(100000L, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37123);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37124);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37125);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37126);fieldOne.getAsShortText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37127);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37128);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37129);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37130);fieldOne.getAsShortText(localTime, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37131);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37132);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37133);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37134);fieldOne.getAsText(0, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37135);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37136);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37137);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37138);fieldOne.getAsText(1000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37139);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37140);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37141);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37142);fieldOne.getAsText(1000L, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37143);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37144);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37145);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37146);fieldOne.getAsText(localTime, 0, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37147);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37148);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37149);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37150);fieldOne.getAsText(localTime, Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37151);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37152);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37153);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37154);fieldOne.getLeapAmount(System.currentTimeMillis()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37155);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37156);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37157);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37158);fieldOne.getMaximumShortTextLength(Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37159);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37160);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37161);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37162);fieldOne.getMaximumTextLength(Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37163);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37164);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37165);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37166);fieldOne.getMaximumValue(); 
         __CLR4_4_1skqskqle6qeano.R.inc(37167);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37168);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37169);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37170);fieldOne.getMaximumValue(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37171);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37172);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37173);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37174);fieldOne.getMaximumValue(localTime); 
         __CLR4_4_1skqskqle6qeano.R.inc(37175);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37176);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37177);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37178);fieldOne.getMaximumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1skqskqle6qeano.R.inc(37179);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37180);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37181);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37182);fieldOne.getMinimumValue(); 
         __CLR4_4_1skqskqle6qeano.R.inc(37183);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37184);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37185);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37186);fieldOne.getMinimumValue(10000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37187);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37188);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37189);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37190);fieldOne.getMinimumValue(localTime); 
         __CLR4_4_1skqskqle6qeano.R.inc(37191);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37192);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37193);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37194);fieldOne.getMinimumValue(localTime, new int[] { 0 }); 
         __CLR4_4_1skqskqle6qeano.R.inc(37195);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37196);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37197);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37198);fieldOne.isLeap(System.currentTimeMillis()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37199);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37200);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37201);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37202);fieldOne.remainder(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37203);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37204);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37205);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37206);fieldOne.roundCeiling(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37207);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37208);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37209);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37210);fieldOne.roundFloor(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37211);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37212);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37213);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37214);fieldOne.roundHalfCeiling(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37215);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37216);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37217);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37218);fieldOne.roundHalfEven(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37219);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37220);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37221);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37222);fieldOne.roundHalfFloor(1000000L); 
         __CLR4_4_1skqskqle6qeano.R.inc(37223);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37224);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37225);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37226);fieldOne.set(1000000L, 1000); 
         __CLR4_4_1skqskqle6qeano.R.inc(37227);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37228);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37229);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37230);fieldOne.set(1000000L, "Unsupported Operation"); 
         __CLR4_4_1skqskqle6qeano.R.inc(37231);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37232);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37233);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37234);fieldOne.set(1000000L, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37235);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37236);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37237);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37238);fieldOne.set(localTime, 0, new int[] { 0 }, 10000); 
         __CLR4_4_1skqskqle6qeano.R.inc(37239);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37240);assertTrue(true); 
     } 
     __CLR4_4_1skqskqle6qeano.R.inc(37241);try { 
         __CLR4_4_1skqskqle6qeano.R.inc(37242);fieldOne.set(localTime, 0, new int[] { 0 }, "Unsupported Operation", Locale.getDefault()); 
         __CLR4_4_1skqskqle6qeano.R.inc(37243);assertTrue(false); 
     } catch (UnsupportedOperationException e) { 
         __CLR4_4_1skqskqle6qeano.R.inc(37244);assertTrue(true); 
     } 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 


public void testMethodsThatShouldAlwaysReturnNull933() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c3ugwsql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull933",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c3ugwsql(){try{__CLR4_4_1skqskqle6qeano.R.inc(37245); 
     __CLR4_4_1skqskqle6qeano.R.inc(37246);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37247);assertNull(fieldOne.getLeapDurationField()); 
     __CLR4_4_1skqskqle6qeano.R.inc(37248);assertNull(fieldOne.getRangeDurationField()); 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 


public void testToString934() {__CLR4_4_1skqskqle6qeano.R.globalSliceStart(getClass().getName(),37249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfdarhsqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1skqskqle6qeano.R.rethrow($CLV_t2$);}finally{__CLR4_4_1skqskqle6qeano.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString934",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfdarhsqp(){try{__CLR4_4_1skqskqle6qeano.R.inc(37249); 
     __CLR4_4_1skqskqle6qeano.R.inc(37250);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(dateTimeFieldTypeOne, UnsupportedDurationField.getInstance(weeks)); 
     __CLR4_4_1skqskqle6qeano.R.inc(37251);String debugMessage = fieldOne.toString(); 
     __CLR4_4_1skqskqle6qeano.R.inc(37252);assertNotNull(debugMessage); 
     __CLR4_4_1skqskqle6qeano.R.inc(37253);assertTrue(debugMessage.length() > 0); 
 }finally{__CLR4_4_1skqskqle6qeano.R.flushNeeded();}} 

    

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

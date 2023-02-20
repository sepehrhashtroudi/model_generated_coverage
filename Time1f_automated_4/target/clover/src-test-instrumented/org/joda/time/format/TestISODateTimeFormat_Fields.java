/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1lz2lz2le6o7agp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28630,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28478);
        __CLR4_4_1lz2lz2le6o7agp.R.inc(28479);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28480);
        __CLR4_4_1lz2lz2le6o7agp.R.inc(28481);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1lz2lz2le6o7agp.R.inc(28483);try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28482);
    }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28484);
    }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28485);
    }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForFields_time_HMm317() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mfagrlza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mfagrlza(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28486); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28487);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28488);int[] values = new int[] { 10, 20, 40 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28489);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28490);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28491);assertEquals("10:20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28492);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28493);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28494);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28495);assertEquals("1020-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28496);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28497);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28498);try { 
         __CLR4_4_1lz2lz2le6o7agp.R.inc(28499);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1lz2lz2le6o7agp.R.inc(28500);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28501);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28502);try { 
         __CLR4_4_1lz2lz2le6o7agp.R.inc(28503);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1lz2lz2le6o7agp.R.inc(28504);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_weekBased_Y318() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvx6lzlzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvx6lzlzt(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28505); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28506);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28507);int[] values = new int[] { 2005 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28508);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28509);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28510);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28511);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28512);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28513);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28514);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28515);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28516);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28517);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28518);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28519);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28520);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28521);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28522);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28523);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_calBased_YMD_unmodifiable319() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1914m4rm0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1914m4rm0c(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28524); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28525);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28526);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28527);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28528);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28529);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28530);assertEquals(3, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28531);types = Arrays.asList(fields); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28532);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28533);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28534);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_year320() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8nlf0m0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_year320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8nlf0m0n(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28535); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28536);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28537);int[] values = new int[] { 2005 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28538);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28539);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28540);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28541);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28542);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28543);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28544);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28545);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28546);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28547);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28548);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28549);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28550);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28551);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28552);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28553);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_datetime_DH321() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbxlc0m16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbxlc0m16(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28554); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28555);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28556);int[] values = new int[] { 25, 12 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28557);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28558);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28559);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28560);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28561);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28562);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28563);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28564);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28565);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28566);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28567);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28568);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28569);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28570);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28571);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28572);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_weekBased_YWD322() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m12tb7m1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m12tb7m1p(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28573); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28574);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28575);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28576);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28577);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28578);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28579);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28580);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28581);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28582);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28583);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28584);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28585);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28586);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28587);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28588);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28589);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28590);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28591);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_weekBased_D323() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chirs6m28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chirs6m28(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28592); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28593);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28594);int[] values = new int[] { 5 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28595);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28596);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28597);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28598);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28599);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28600);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28601);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28602);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28603);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28604);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28605);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28606);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28607);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28608);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28609);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28610);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
public void testForFields_weekBased_YW506() {__CLR4_4_1lz2lz2le6o7agp.R.globalSliceStart(getClass().getName(),28611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq2p8rm2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lz2lz2le6o7agp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lz2lz2le6o7agp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq2p8rm2r(){try{__CLR4_4_1lz2lz2le6o7agp.R.inc(28611); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28612);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28613);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28614);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28615);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28616);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28617);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28618);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28619);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28620);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28621);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28622);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28623);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28624);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28625);assertEquals(0, types.size()); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28626);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28627);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28628);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1lz2lz2le6o7agp.R.inc(28629);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1lz2lz2le6o7agp.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}

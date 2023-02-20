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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1hixhixle6qe98a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22871,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hixhixle6qe98a.R.inc(22713);
        __CLR4_4_1hixhixle6qe98a.R.inc(22714);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hixhixle6qe98a.R.inc(22715);
        __CLR4_4_1hixhixle6qe98a.R.inc(22716);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1hixhixle6qe98a.R.inc(22718);try{__CLR4_4_1hixhixle6qe98a.R.inc(22717);
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hixhixle6qe98a.R.inc(22719);
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hixhixle6qe98a.R.inc(22720);
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_centuryOfEra1371() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z23yxhj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra1371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z23yxhj5() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22721); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22722);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22723);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22724);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22725);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22726);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22727);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22728);assertSerialization(DateTimeFieldType.centuryOfEra()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_era1372() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxp2p7hjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era1372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxp2p7hjd() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22729); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22730);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22731);assertEquals("era", DateTimeFieldType.era().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22732);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22733);assertEquals(null, DateTimeFieldType.era().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22734);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22735);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22736);assertSerialization(DateTimeFieldType.era()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_yearOfEra1373() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhkwvshjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra1373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhkwvshjl() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22737); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22738);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22739);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22740);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22741);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22742);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22743);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22744);assertSerialization(DateTimeFieldType.yearOfEra()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_year1374() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhycgghjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year1374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhycgghjt() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22745); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22746);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22747);assertEquals("year", DateTimeFieldType.year().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22748);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22749);assertEquals(null, DateTimeFieldType.year().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22750);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22751);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22752);assertSerialization(DateTimeFieldType.year()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_dayOfMonth1375() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qct0xrhk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth1375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qct0xrhk1() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22753); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22754);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22755);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22756);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22757);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22758);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22759);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22760);assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_weekyear1376() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wio7xihk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear1376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wio7xihk9() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22761); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22762);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22763);assertEquals("weekyear", DateTimeFieldType.weekyear().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22764);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22765);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22766);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22767);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22768);assertSerialization(DateTimeFieldType.weekyear()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_weekOfWeekyear1377() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_187pd2qhkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear1377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_187pd2qhkh() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22769); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22770);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22771);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22772);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22773);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22774);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22775);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22776);assertSerialization(DateTimeFieldType.weekOfWeekyear()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_halfdayOfDay1378() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9920dhkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay1378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9920dhkp() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22777); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22778);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22779);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22780);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22781);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22782);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22783);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22784);assertSerialization(DateTimeFieldType.halfdayOfDay()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_hourOfHalfday1379() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dl4h8hkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday1379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dl4h8hkx() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22785); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22786);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22787);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22788);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22789);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22790);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22791);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22792);assertSerialization(DateTimeFieldType.hourOfHalfday()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_clockhourOfHalfday1380() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18g26umhl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfHalfday1380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18g26umhl5() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22793); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22794);assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22795);assertEquals("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22796);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22797);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22798);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22799);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22800);assertSerialization(DateTimeFieldType.clockhourOfHalfday()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_hourOfDay1382() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsmle1hld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay1382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsmle1hld() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22801); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22802);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22803);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22804);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22805);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22806);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22807);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22808);assertSerialization(DateTimeFieldType.hourOfDay()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_minuteOfDay1383() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk6re0hll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay1383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk6re0hll() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22809); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22810);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22811);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22812);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22813);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22814);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22815);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22816);assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_minuteOfHour1384() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9xxohhlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour1384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9xxohhlt() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22817); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22818);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22819);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22820);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22821);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22822);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22823);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22824);assertSerialization(DateTimeFieldType.minuteOfHour()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_secondOfDay1385() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uqiruhm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay1385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uqiruhm1() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22825); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22826);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22827);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22828);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22829);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22830);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22831);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22832);assertSerialization(DateTimeFieldType.secondOfDay()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_secondOfMinute1386() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11epkibhm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute1386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11epkibhm9() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22833); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22834);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22835);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22836);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22837);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22838);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22839);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22840);assertSerialization(DateTimeFieldType.secondOfMinute()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_millisOfDay1387() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ax4p2hmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay1387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ax4p2hmh() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22841); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22842);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22843);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22844);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22845);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22846);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22847);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22848);assertSerialization(DateTimeFieldType.millisOfDay()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 


public void test_millisOfSecond1388() throws Exception {__CLR4_4_1hixhixle6qe98a.R.globalSliceStart(getClass().getName(),22849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knw4avhmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hixhixle6qe98a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hixhixle6qe98a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond1388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knw4avhmp() throws Exception{try{__CLR4_4_1hixhixle6qe98a.R.inc(22849); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22850);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22851);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22852);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22853);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType()); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22854);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22855);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hixhixle6qe98a.R.inc(22856);assertSerialization(DateTimeFieldType.millisOfSecond()); 
 }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hixhixle6qe98a.R.inc(22857);
        __CLR4_4_1hixhixle6qe98a.R.inc(22858);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1hixhixle6qe98a.R.inc(22859);assertSame(type, result);
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hixhixle6qe98a.R.inc(22860);
        __CLR4_4_1hixhixle6qe98a.R.inc(22861);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hixhixle6qe98a.R.inc(22862);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hixhixle6qe98a.R.inc(22863);oos.writeObject(type);
        __CLR4_4_1hixhixle6qe98a.R.inc(22864);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hixhixle6qe98a.R.inc(22865);oos.close();
        
        __CLR4_4_1hixhixle6qe98a.R.inc(22866);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hixhixle6qe98a.R.inc(22867);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hixhixle6qe98a.R.inc(22868);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1hixhixle6qe98a.R.inc(22869);ois.close();
        __CLR4_4_1hixhixle6qe98a.R.inc(22870);return result;
    }finally{__CLR4_4_1hixhixle6qe98a.R.flushNeeded();}}

}

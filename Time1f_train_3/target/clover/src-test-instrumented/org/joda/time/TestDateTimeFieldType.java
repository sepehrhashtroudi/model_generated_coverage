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
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1hk7hk7le6rckfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,22925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22759);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22760);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22761);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22762);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1hk7hk7le6rckfw.R.inc(22764);try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22763);
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22765);
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22766);
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_yearOfCentury1370() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehxoa3hkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury1370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehxoa3hkf() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22767); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22768);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22769);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22770);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22771);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22772);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22773);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22774);assertSerialization(DateTimeFieldType.yearOfCentury()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_centuryOfEra1371() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z23yxhkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra1371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z23yxhkn() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22775); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22776);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22777);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22778);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22779);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22780);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22781);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22782);assertSerialization(DateTimeFieldType.centuryOfEra()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_era1372() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxp2p7hkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era1372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxp2p7hkv() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22783); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22784);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22785);assertEquals("era", DateTimeFieldType.era().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22786);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22787);assertEquals(null, DateTimeFieldType.era().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22788);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22789);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22790);assertSerialization(DateTimeFieldType.era()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_yearOfEra1373() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhkwvshl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra1373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhkwvshl3() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22791); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22792);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22793);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22794);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22795);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22796);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22797);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22798);assertSerialization(DateTimeFieldType.yearOfEra()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_year1374() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhycgghlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year1374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhycgghlb() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22799); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22800);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22801);assertEquals("year", DateTimeFieldType.year().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22802);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22803);assertEquals(null, DateTimeFieldType.year().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22804);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22805);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22806);assertSerialization(DateTimeFieldType.year()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_dayOfYear1375() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qs51pmhlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfYear1375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qs51pmhlj() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22807); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22808);assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22809);assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22810);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22811);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22812);assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22813);assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22814);assertSerialization(DateTimeFieldType.dayOfYear()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_monthOfYear1376() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tofl3lhlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear1376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tofl3lhlr() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22815); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22816);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22817);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22818);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22819);assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22820);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22821);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22822);assertSerialization(DateTimeFieldType.monthOfYear()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_weekyearOfCentury1377() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyow3chlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury1377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyow3chlz() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22823); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22824);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22825);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22826);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22827);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22828);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22829);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22830);assertSerialization(DateTimeFieldType.weekyearOfCentury()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_weekyear1378() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0fwgohm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear1378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0fwgohm7() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22831); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22832);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22833);assertEquals("weekyear", DateTimeFieldType.weekyear().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22834);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22835);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22836);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22837);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22838);assertSerialization(DateTimeFieldType.weekyear()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_weekOfWeekyear1379() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eppanohmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear1379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eppanohmf() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22839); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22840);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22841);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22842);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22843);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22844);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22845);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22846);assertSerialization(DateTimeFieldType.weekOfWeekyear()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_dayOfWeek1380() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127mz8lhmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek1380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127mz8lhmn() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22847); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22848);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22849);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22850);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22851);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22852);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22853);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22854);assertSerialization(DateTimeFieldType.dayOfWeek()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_halfdayOfDay1381() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jadx05hmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay1381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jadx05hmv() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22855); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22856);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22857);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22858);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22859);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22860);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22861);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22862);assertSerialization(DateTimeFieldType.halfdayOfDay()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_hourOfHalfday1382() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcg9hghn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday1382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcg9hghn3() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22863); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22864);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22865);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22866);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22867);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22868);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22869);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22870);assertSerialization(DateTimeFieldType.hourOfHalfday()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_hourOfDay1384() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15amnt3hnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay1384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15amnt3hnb() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22871); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22872);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22873);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22874);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22875);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22876);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22877);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22878);assertSerialization(DateTimeFieldType.hourOfDay()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_secondOfDay1385() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uqiruhnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay1385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uqiruhnj() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22879); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22880);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22881);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22882);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22883);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22884);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22885);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22886);assertSerialization(DateTimeFieldType.secondOfDay()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_secondOfMinute1386() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11epkibhnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute1386",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11epkibhnr() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22887); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22888);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22889);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22890);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22891);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22892);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22893);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22894);assertSerialization(DateTimeFieldType.secondOfMinute()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_millisOfDay1387() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ax4p2hnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay1387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ax4p2hnz() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22895); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22896);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22897);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22898);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22899);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22900);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22901);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22902);assertSerialization(DateTimeFieldType.millisOfDay()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 


public void test_millisOfSecond1388() throws Exception {__CLR4_4_1hk7hk7le6rckfw.R.globalSliceStart(getClass().getName(),22903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knw4avho7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hk7hk7le6rckfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hk7hk7le6rckfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond1388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knw4avho7() throws Exception{try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22903); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22904);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22905);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22906);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22907);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType()); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22908);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22909);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hk7hk7le6rckfw.R.inc(22910);assertSerialization(DateTimeFieldType.millisOfSecond()); 
 }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22911);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22912);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22913);assertSame(type, result);
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hk7hk7le6rckfw.R.inc(22914);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22915);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22916);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22917);oos.writeObject(type);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22918);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22919);oos.close();
        
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22920);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22921);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22922);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22923);ois.close();
        __CLR4_4_1hk7hk7le6rckfw.R.inc(22924);return result;
    }finally{__CLR4_4_1hk7hk7le6rckfw.R.flushNeeded();}}

}

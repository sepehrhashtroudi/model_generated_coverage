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
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1hmahmale6rjc50{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,22992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hmahmale6rjc50.R.inc(22834);
        __CLR4_4_1hmahmale6rjc50.R.inc(22835);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hmahmale6rjc50.R.inc(22836);
        __CLR4_4_1hmahmale6rjc50.R.inc(22837);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1hmahmale6rjc50.R.inc(22839);try{__CLR4_4_1hmahmale6rjc50.R.inc(22838);
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hmahmale6rjc50.R.inc(22840);
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hmahmale6rjc50.R.inc(22841);
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_yearOfCentury1369() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eysvpdhmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury1369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eysvpdhmi() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22842); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22843);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22844);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22845);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22846);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22847);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22848);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22849);assertSerialization(DateTimeFieldType.yearOfCentury()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_centuryOfEra1370() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q256ghmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra1370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q256ghmq() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22850); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22851);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22852);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22853);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22854);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22855);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22856);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22857);assertSerialization(DateTimeFieldType.centuryOfEra()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_era1371() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cop3wqhmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era1371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cop3wqhmy() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22858); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22859);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22860);assertEquals("era", DateTimeFieldType.era().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22861);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22862);assertEquals(null, DateTimeFieldType.era().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22863);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22864);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22865);assertSerialization(DateTimeFieldType.era()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_yearOfEra1372() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8ky3bhn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra1372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8ky3bhn6() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22866); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22867);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22868);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22869);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22870);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22871);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22872);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22873);assertSerialization(DateTimeFieldType.yearOfEra()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_dayOfYear1373() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka544ohne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfYear1373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka544ohne() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22874); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22875);assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22876);assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22877);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22878);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22879);assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22880);assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22881);assertSerialization(DateTimeFieldType.dayOfYear()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_monthOfYear1374() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yuojalhnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear1374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yuojalhnm() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22882); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22883);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22884);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22885);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22886);assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22887);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22888);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22889);assertSerialization(DateTimeFieldType.monthOfYear()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_dayOfMonth1375() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qct0xrhnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth1375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qct0xrhnu() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22890); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22891);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22892);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22893);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22894);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22895);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22896);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22897);assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_weekyearOfCentury1376() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtf73bho2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury1376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtf73bho2() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22898); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22899);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22900);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22901);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22902);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22903);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22904);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22905);assertSerialization(DateTimeFieldType.weekyearOfCentury()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_weekyear1377() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9fv95hoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear1377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9fv95hoa() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22906); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22907);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22908);assertEquals("weekyear", DateTimeFieldType.weekyear().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22909);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22910);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22911);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22912);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22913);assertSerialization(DateTimeFieldType.weekyear()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_weekOfWeekyear1378() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgpbv7hoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear1378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgpbv7hoi() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22914); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22915);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22916);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22917);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22918);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22919);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22920);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22921);assertSerialization(DateTimeFieldType.weekOfWeekyear()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_dayOfWeek1379() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12oi6nvhoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek1379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12oi6nvhoq() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22922); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22923);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22924);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22925);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22926);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22927);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22928);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22929);assertSerialization(DateTimeFieldType.dayOfWeek()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_halfdayOfDay1380() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjdvsmhoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay1380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjdvsmhoy() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22930); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22931);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22932);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22933);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22934);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22935);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22936);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22937);assertSerialization(DateTimeFieldType.halfdayOfDay()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_hourOfHalfday1381() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183gaozhp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday1381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183gaozhp6() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22938); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22939);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22940);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22941);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22942);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22943);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22944);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22945);assertSerialization(DateTimeFieldType.hourOfHalfday()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_clockhourOfHalfday1382() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ey24fkhpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfHalfday1382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ey24fkhpe() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22946); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22947);assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22948);assertEquals("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22949);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22950);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22951);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22952);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22953);assertSerialization(DateTimeFieldType.clockhourOfHalfday()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_minuteOfDay1383() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yk6re0hpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay1383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yk6re0hpm() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22954); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22955);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22956);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22957);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22958);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22959);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22960);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22961);assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_minuteOfHour1384() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9xxohhpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour1384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9xxohhpu() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22962); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22963);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22964);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22965);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22966);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22967);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22968);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22969);assertSerialization(DateTimeFieldType.minuteOfHour()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 


public void test_millisOfSecond1385() throws Exception {__CLR4_4_1hmahmale6rjc50.R.globalSliceStart(getClass().getName(),22970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aww7xghq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hmahmale6rjc50.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hmahmale6rjc50.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond1385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aww7xghq2() throws Exception{try{__CLR4_4_1hmahmale6rjc50.R.inc(22970); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22971);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22972);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22973);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22974);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType()); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22975);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22976);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hmahmale6rjc50.R.inc(22977);assertSerialization(DateTimeFieldType.millisOfSecond()); 
 }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hmahmale6rjc50.R.inc(22978);
        __CLR4_4_1hmahmale6rjc50.R.inc(22979);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1hmahmale6rjc50.R.inc(22980);assertSame(type, result);
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hmahmale6rjc50.R.inc(22981);
        __CLR4_4_1hmahmale6rjc50.R.inc(22982);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hmahmale6rjc50.R.inc(22983);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hmahmale6rjc50.R.inc(22984);oos.writeObject(type);
        __CLR4_4_1hmahmale6rjc50.R.inc(22985);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hmahmale6rjc50.R.inc(22986);oos.close();
        
        __CLR4_4_1hmahmale6rjc50.R.inc(22987);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hmahmale6rjc50.R.inc(22988);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hmahmale6rjc50.R.inc(22989);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1hmahmale6rjc50.R.inc(22990);ois.close();
        __CLR4_4_1hmahmale6rjc50.R.inc(22991);return result;
    }finally{__CLR4_4_1hmahmale6rjc50.R.flushNeeded();}}

}

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
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1hokhoklc8axdnw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,23114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hokhoklc8axdnw.R.inc(22916);
        __CLR4_4_1hokhoklc8axdnw.R.inc(22917);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hokhoklc8axdnw.R.inc(22918);
        __CLR4_4_1hokhoklc8axdnw.R.inc(22919);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1hokhoklc8axdnw.R.inc(22921);try{__CLR4_4_1hokhoklc8axdnw.R.inc(22920);
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hokhoklc8axdnw.R.inc(22922);
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hokhoklc8axdnw.R.inc(22923);
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_centuryOfEra172() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oycn1hos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oycn1hos() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22924); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22925);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22926);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22927);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22928);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22929);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22930);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22931);assertSerialization(DateTimeFieldType.centuryOfEra()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_minuteOfHour264() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7z7a3hp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7z7a3hp0() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22932); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22933);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22934);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22935);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22936);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22937);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22938);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22939);assertSerialization(DateTimeFieldType.minuteOfHour()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_era356() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1goiiwkhp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1goiiwkhp8() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22940); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22941);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22942);assertEquals("era", DateTimeFieldType.era().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22943);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22944);assertEquals(null, DateTimeFieldType.era().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22945);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22946);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22947);assertSerialization(DateTimeFieldType.era()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_millisOfSecond489() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wmp6mhpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wmp6mhpg() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22948); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22949);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22950);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22951);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22952);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22953);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22954);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22955);assertSerialization(DateTimeFieldType.millisOfSecond()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_millisOfDay705() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok1hynhpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay705",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok1hynhpo() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22956); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22957);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22958);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22959);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22960);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22961);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22962);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22963);assertSerialization(DateTimeFieldType.millisOfDay()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_halfdayOfDay757() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5dvcnhpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay757",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5dvcnhpw() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22964); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22965);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22966);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22967);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22968);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22969);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22970);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22971);assertSerialization(DateTimeFieldType.halfdayOfDay()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_yearOfCentury845() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylv20jhq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury845",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylv20jhq4() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22972); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22973);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22974);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22975);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22976);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22977);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22978);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22979);assertSerialization(DateTimeFieldType.yearOfCentury()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_weekyearOfCentury1145() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpnydjhqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury1145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpnydjhqc() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22980); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22981);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22982);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22983);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22984);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22985);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22986);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22987);assertSerialization(DateTimeFieldType.weekyearOfCentury()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_weekyear1151() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4s0ldhqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4s0ldhqk() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22988); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22989);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22990);assertEquals("weekyear", DateTimeFieldType.weekyear().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22991);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22992);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22993);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22994);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22995);assertSerialization(DateTimeFieldType.weekyear()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_hourOfHalfday1162() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),22996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7jw3ohqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday1162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7jw3ohqs() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(22996); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22997);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22998);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(22999);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23000);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23001);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23002);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23003);assertSerialization(DateTimeFieldType.hourOfHalfday()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_yearOfEra1263() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wkp7chr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra1263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wkp7chr0() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23004); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23005);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23006);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23007);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23008);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23009);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23010);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23011);assertSerialization(DateTimeFieldType.yearOfEra()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_clockhourOfHalfday1329() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11g4knxhr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfHalfday1329",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11g4knxhr8() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23012); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23013);assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23014);assertEquals("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23015);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23016);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23017);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23018);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23019);assertSerialization(DateTimeFieldType.clockhourOfHalfday()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_secondOfMinute1345() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lci3hyhrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute1345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lci3hyhrg() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23020); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23021);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23022);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23023);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23024);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23025);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23026);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23027);assertSerialization(DateTimeFieldType.secondOfMinute()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_secondOfDay1369() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yg4mtshro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay1369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yg4mtshro() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23028); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23029);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23030);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23031);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23032);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23033);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23034);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23035);assertSerialization(DateTimeFieldType.secondOfDay()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_monthOfYear1604() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xigatzhrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear1604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xigatzhrw() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23036); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23037);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23038);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23039);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23040);assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23041);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23042);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23043);assertSerialization(DateTimeFieldType.monthOfYear()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_hourOfDay1613() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vuv26hs4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay1613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vuv26hs4() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23044); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23045);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23046);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23047);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23048);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23049);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23050);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23051);assertSerialization(DateTimeFieldType.hourOfDay()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_dayOfWeek1620() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5zouchsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek1620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5zouchsc() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23052); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23053);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23054);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23055);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23056);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23057);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23058);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23059);assertSerialization(DateTimeFieldType.dayOfWeek()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_weekOfWeekyear1659() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwjgyhhsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear1659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwjgyhhsk() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23060); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23061);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23062);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23063);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23064);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23065);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23066);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23067);assertSerialization(DateTimeFieldType.weekOfWeekyear()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_dayOfYear1683() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfo3w6hss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfYear1683",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfo3w6hss() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23068); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23069);assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23070);assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23071);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23072);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23073);assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23074);assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23075);assertSerialization(DateTimeFieldType.dayOfYear()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_dayOfMonth1742() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189fpk5ht0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth1742",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189fpk5ht0() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23076); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23077);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23078);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23079);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23080);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23081);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23082);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23083);assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_year1754() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufyv0qht8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year1754",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufyv0qht8() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23084); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23085);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23086);assertEquals("year", DateTimeFieldType.year().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23087);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23088);assertEquals(null, DateTimeFieldType.year().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23089);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23090);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23091);assertSerialization(DateTimeFieldType.year()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 


public void test_minuteOfDay1758() throws Exception {__CLR4_4_1hokhoklc8axdnw.R.globalSliceStart(getClass().getName(),23092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5b68khtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklc8axdnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklc8axdnw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay1758",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5b68khtg() throws Exception{try{__CLR4_4_1hokhoklc8axdnw.R.inc(23092); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23093);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23094);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23095);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23096);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23097);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23098);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hokhoklc8axdnw.R.inc(23099);assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hokhoklc8axdnw.R.inc(23100);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23101);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23102);assertSame(type, result);
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1hokhoklc8axdnw.R.inc(23103);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23104);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hokhoklc8axdnw.R.inc(23105);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23106);oos.writeObject(type);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23107);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hokhoklc8axdnw.R.inc(23108);oos.close();
        
        __CLR4_4_1hokhoklc8axdnw.R.inc(23109);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23110);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hokhoklc8axdnw.R.inc(23111);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1hokhoklc8axdnw.R.inc(23112);ois.close();
        __CLR4_4_1hokhoklc8axdnw.R.inc(23113);return result;
    }finally{__CLR4_4_1hokhoklc8axdnw.R.flushNeeded();}}

}

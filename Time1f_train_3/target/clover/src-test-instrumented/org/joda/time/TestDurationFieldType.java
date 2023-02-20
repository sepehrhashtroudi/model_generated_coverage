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
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1izeizele6rckr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,24684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1izeizele6rckr9.R.inc(24602);
        __CLR4_4_1izeizele6rckr9.R.inc(24603);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1izeizele6rckr9.R.inc(24604);
        __CLR4_4_1izeizele6rckr9.R.inc(24605);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1izeizele6rckr9.R.inc(24607);try{__CLR4_4_1izeizele6rckr9.R.inc(24606);
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1izeizele6rckr9.R.inc(24608);
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1izeizele6rckr9.R.inc(24609);
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_weeks985() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jo4dxxizm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks985",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jo4dxxizm() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24610); 
     __CLR4_4_1izeizele6rckr9.R.inc(24611);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24612);assertEquals("weeks", DurationFieldType.weeks().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24613);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24614);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24615);assertSerialization(DurationFieldType.weeks()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_centuries986() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yg4tgnizs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries986",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yg4tgnizs() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24616); 
     __CLR4_4_1izeizele6rckr9.R.inc(24617);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24618);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24619);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24620);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24621);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_eras987() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e71xxvizy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras987",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e71xxvizy() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24622); 
     __CLR4_4_1izeizele6rckr9.R.inc(24623);assertEquals(DurationFieldType.eras(), DurationFieldType.eras()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24624);assertEquals("eras", DurationFieldType.eras().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24625);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24626);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24627);assertSerialization(DurationFieldType.eras()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_weekyears988() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l116srj04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears988",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l116srj04() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24628); 
     __CLR4_4_1izeizele6rckr9.R.inc(24629);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24630);assertEquals("weekyears", DurationFieldType.weekyears().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24631);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24632);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24633);assertSerialization(DurationFieldType.weekyears()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_years989() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8lh7sj0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years989",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8lh7sj0a() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24634); 
     __CLR4_4_1izeizele6rckr9.R.inc(24635);assertEquals(DurationFieldType.years(), DurationFieldType.years()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24636);assertEquals("years", DurationFieldType.years().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24637);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24638);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24639);assertSerialization(DurationFieldType.years()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_months990() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1psdlj0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months990",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1psdlj0g() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24640); 
     __CLR4_4_1izeizele6rckr9.R.inc(24641);assertEquals(DurationFieldType.months(), DurationFieldType.months()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24642);assertEquals("months", DurationFieldType.months().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24643);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24644);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24645);assertSerialization(DurationFieldType.months()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_days991() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117c76cj0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days991",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117c76cj0m() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24646); 
     __CLR4_4_1izeizele6rckr9.R.inc(24647);assertEquals(DurationFieldType.days(), DurationFieldType.days()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24648);assertEquals("days", DurationFieldType.days().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24649);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24650);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24651);assertSerialization(DurationFieldType.days()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_halfdays992() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9oygyj0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays992",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9oygyj0s() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24652); 
     __CLR4_4_1izeizele6rckr9.R.inc(24653);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24654);assertEquals("halfdays", DurationFieldType.halfdays().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24655);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24656);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24657);assertSerialization(DurationFieldType.halfdays()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_hours993() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ca5mmwj0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours993",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ca5mmwj0y() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24658); 
     __CLR4_4_1izeizele6rckr9.R.inc(24659);assertEquals(DurationFieldType.hours(), DurationFieldType.hours()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24660);assertEquals("hours", DurationFieldType.hours().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24661);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24662);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24663);assertSerialization(DurationFieldType.hours()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 


public void test_seconds994() throws Exception {__CLR4_4_1izeizele6rckr9.R.globalSliceStart(getClass().getName(),24664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fpd9u1j14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izeizele6rckr9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izeizele6rckr9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds994",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fpd9u1j14() throws Exception{try{__CLR4_4_1izeizele6rckr9.R.inc(24664); 
     __CLR4_4_1izeizele6rckr9.R.inc(24665);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24666);assertEquals("seconds", DurationFieldType.seconds().getName()); 
     __CLR4_4_1izeizele6rckr9.R.inc(24667);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24668);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1izeizele6rckr9.R.inc(24669);assertSerialization(DurationFieldType.seconds()); 
 }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1izeizele6rckr9.R.inc(24670);
        __CLR4_4_1izeizele6rckr9.R.inc(24671);DurationFieldType result = doSerialization(type);
        __CLR4_4_1izeizele6rckr9.R.inc(24672);assertSame(type, result);
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1izeizele6rckr9.R.inc(24673);
        __CLR4_4_1izeizele6rckr9.R.inc(24674);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1izeizele6rckr9.R.inc(24675);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1izeizele6rckr9.R.inc(24676);oos.writeObject(type);
        __CLR4_4_1izeizele6rckr9.R.inc(24677);byte[] bytes = baos.toByteArray();
        __CLR4_4_1izeizele6rckr9.R.inc(24678);oos.close();
        
        __CLR4_4_1izeizele6rckr9.R.inc(24679);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1izeizele6rckr9.R.inc(24680);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1izeizele6rckr9.R.inc(24681);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1izeizele6rckr9.R.inc(24682);ois.close();
        __CLR4_4_1izeizele6rckr9.R.inc(24683);return result;
    }finally{__CLR4_4_1izeizele6rckr9.R.flushNeeded();}}

}

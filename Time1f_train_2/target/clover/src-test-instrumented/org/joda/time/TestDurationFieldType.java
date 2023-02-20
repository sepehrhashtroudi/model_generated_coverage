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
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1iz7iz7le6qseth{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24595);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24596);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24597);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24598);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1iz7iz7le6qseth.R.inc(24600);try{__CLR4_4_1iz7iz7le6qseth.R.inc(24599);
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24601);
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24602);
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_centuries989() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op4x38izf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries989",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op4x38izf() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24603); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24604);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24605);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24606);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24607);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24608);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_eras990() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5x2y3izl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras990",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5x2y3izl() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24609); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24610);assertEquals(DurationFieldType.eras(), DurationFieldType.eras()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24611);assertEquals("eras", DurationFieldType.eras().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24612);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24613);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24614);assertSerialization(DurationFieldType.eras()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_weekyears991() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzwbszizr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears991",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzwbszizr() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24615); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24616);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24617);assertEquals("weekyears", DurationFieldType.weekyears().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24618);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24619);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24620);assertSerialization(DurationFieldType.weekyears()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_years992() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9qc7kizx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years992",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9qc7kizx() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24621); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24622);assertEquals(DurationFieldType.years(), DurationFieldType.years()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24623);assertEquals("years", DurationFieldType.years().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24624);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24625);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24626);assertSerialization(DurationFieldType.years()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_months993() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dapw06j03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months993",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dapw06j03() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24627); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24628);assertEquals(DurationFieldType.months(), DurationFieldType.months()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24629);assertEquals("months", DurationFieldType.months().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24630);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24631);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24632);assertSerialization(DurationFieldType.months()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_days994() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ayc3jrj09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days994",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ayc3jrj09() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24633); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24634);assertEquals(DurationFieldType.days(), DurationFieldType.days()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24635);assertEquals("days", DurationFieldType.days().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24636);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24637);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24638);assertSerialization(DurationFieldType.days()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_halfdays995() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0ouudj0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays995",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0ouudj0f() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24639); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24640);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24641);assertEquals("halfdays", DurationFieldType.halfdays().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24642);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24643);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24644);assertSerialization(DurationFieldType.halfdays()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_hours996() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m15j0bj0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours996",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m15j0bj0l() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24645); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24646);assertEquals(DurationFieldType.hours(), DurationFieldType.hours()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24647);assertEquals("hours", DurationFieldType.hours().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24648);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24649);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24650);assertSerialization(DurationFieldType.hours()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_minutes997() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q07s5oj0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_minutes997",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q07s5oj0r() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24651); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24652);assertEquals(DurationFieldType.minutes(), DurationFieldType.minutes()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24653);assertEquals("minutes", DurationFieldType.minutes().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24654);assertEquals(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24655);assertEquals(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24656);assertSerialization(DurationFieldType.minutes()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 


public void test_millis998() throws Exception {__CLR4_4_1iz7iz7le6qseth.R.globalSliceStart(getClass().getName(),24657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qze7qsj0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iz7iz7le6qseth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iz7iz7le6qseth.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_millis998",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qze7qsj0x() throws Exception{try{__CLR4_4_1iz7iz7le6qseth.R.inc(24657); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24658);assertEquals(DurationFieldType.millis(), DurationFieldType.millis()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24659);assertEquals("millis", DurationFieldType.millis().getName()); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24660);assertEquals(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24661);assertEquals(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1iz7iz7le6qseth.R.inc(24662);assertSerialization(DurationFieldType.millis()); 
 }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24663);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24664);DurationFieldType result = doSerialization(type);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24665);assertSame(type, result);
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1iz7iz7le6qseth.R.inc(24666);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24667);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1iz7iz7le6qseth.R.inc(24668);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24669);oos.writeObject(type);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24670);byte[] bytes = baos.toByteArray();
        __CLR4_4_1iz7iz7le6qseth.R.inc(24671);oos.close();
        
        __CLR4_4_1iz7iz7le6qseth.R.inc(24672);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24673);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1iz7iz7le6qseth.R.inc(24674);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1iz7iz7le6qseth.R.inc(24675);ois.close();
        __CLR4_4_1iz7iz7le6qseth.R.inc(24676);return result;
    }finally{__CLR4_4_1iz7iz7le6qseth.R.flushNeeded();}}

}

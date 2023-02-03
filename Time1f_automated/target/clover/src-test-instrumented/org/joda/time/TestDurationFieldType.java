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
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1hbphbplccietkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22506,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hbphbplccietkt.R.inc(22453);
        __CLR4_4_1hbphbplccietkt.R.inc(22454);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hbphbplccietkt.R.inc(22455);
        __CLR4_4_1hbphbplccietkt.R.inc(22456);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1hbphbplccietkt.R.inc(22458);try{__CLR4_4_1hbphbplccietkt.R.inc(22457);
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hbphbplccietkt.R.inc(22459);
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hbphbplccietkt.R.inc(22460);
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithFieldAdded_DurationFieldType_int_854() {__CLR4_4_1hbphbplccietkt.R.globalSliceStart(getClass().getName(),22461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3m74ihbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbphbplccietkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbphbplccietkt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.testWithFieldAdded_DurationFieldType_int_854",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3m74ihbx(){try{__CLR4_4_1hbphbplccietkt.R.inc(22461); 
     __CLR4_4_1hbphbplccietkt.R.inc(22462);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hbphbplccietkt.R.inc(22463);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1hbphbplccietkt.R.inc(22464);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1hbphbplccietkt.R.inc(22465);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hbphbplccietkt.R.inc(22466);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1hbphbplccietkt.R.inc(22467);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1hbphbplccietkt.R.inc(22468);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hbphbplccietkt.R.inc(22469);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1hbphbplccietkt.R.inc(22470);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1hbphbplccietkt.R.inc(22471);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hbphbplccietkt.R.inc(22472);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1hbphbplccietkt.R.inc(22473);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}
public void testForFields4290() throws Exception {__CLR4_4_1hbphbplccietkt.R.globalSliceStart(getClass().getName(),22474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzpzv8hca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbphbplccietkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbphbplccietkt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.testForFields4290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzpzv8hca() throws Exception{try{__CLR4_4_1hbphbplccietkt.R.inc(22474); 
     __CLR4_4_1hbphbplccietkt.R.inc(22475);DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     __CLR4_4_1hbphbplccietkt.R.inc(22476);DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     __CLR4_4_1hbphbplccietkt.R.inc(22477);PeriodType type = PeriodType.forFields(types); 
     __CLR4_4_1hbphbplccietkt.R.inc(22478);PeriodType type2 = PeriodType.forFields(types2); 
     __CLR4_4_1hbphbplccietkt.R.inc(22479);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}
public void test_centuries291() throws Exception {__CLR4_4_1hbphbplccietkt.R.globalSliceStart(getClass().getName(),22480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161awtwhcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbphbplccietkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbphbplccietkt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161awtwhcg() throws Exception{try{__CLR4_4_1hbphbplccietkt.R.inc(22480); 
     __CLR4_4_1hbphbplccietkt.R.inc(22481);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1hbphbplccietkt.R.inc(22482);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1hbphbplccietkt.R.inc(22483);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hbphbplccietkt.R.inc(22484);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hbphbplccietkt.R.inc(22485);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}
public void test_weeks292() throws Exception {__CLR4_4_1hbphbplccietkt.R.globalSliceStart(getClass().getName(),22486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8pg9shcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hbphbplccietkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hbphbplccietkt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8pg9shcm() throws Exception{try{__CLR4_4_1hbphbplccietkt.R.inc(22486); 
     __CLR4_4_1hbphbplccietkt.R.inc(22487);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks()); 
     __CLR4_4_1hbphbplccietkt.R.inc(22488);assertEquals("weeks", DurationFieldType.weeks().getName()); 
     __CLR4_4_1hbphbplccietkt.R.inc(22489);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hbphbplccietkt.R.inc(22490);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hbphbplccietkt.R.inc(22491);assertSerialization(DurationFieldType.weeks()); 
 }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hbphbplccietkt.R.inc(22492);
        __CLR4_4_1hbphbplccietkt.R.inc(22493);DurationFieldType result = doSerialization(type);
        __CLR4_4_1hbphbplccietkt.R.inc(22494);assertSame(type, result);
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hbphbplccietkt.R.inc(22495);
        __CLR4_4_1hbphbplccietkt.R.inc(22496);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hbphbplccietkt.R.inc(22497);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hbphbplccietkt.R.inc(22498);oos.writeObject(type);
        __CLR4_4_1hbphbplccietkt.R.inc(22499);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hbphbplccietkt.R.inc(22500);oos.close();
        
        __CLR4_4_1hbphbplccietkt.R.inc(22501);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hbphbplccietkt.R.inc(22502);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hbphbplccietkt.R.inc(22503);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1hbphbplccietkt.R.inc(22504);ois.close();
        __CLR4_4_1hbphbplccietkt.R.inc(22505);return result;
    }finally{__CLR4_4_1hbphbplccietkt.R.flushNeeded();}}

}

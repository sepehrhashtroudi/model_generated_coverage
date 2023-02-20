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
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1hepheple6nl87a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22625,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1hepheple6nl87a.R.inc(22561);
        __CLR4_4_1hepheple6nl87a.R.inc(22562);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hepheple6nl87a.R.inc(22563);
        __CLR4_4_1hepheple6nl87a.R.inc(22564);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1hepheple6nl87a.R.inc(22566);try{__CLR4_4_1hepheple6nl87a.R.inc(22565);
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hepheple6nl87a.R.inc(22567);
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hepheple6nl87a.R.inc(22568);
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIsSupported_DurationFieldType417() {__CLR4_4_1hepheple6nl87a.R.globalSliceStart(getClass().getName(),22569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dpk4uhex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hepheple6nl87a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hepheple6nl87a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.testIsSupported_DurationFieldType417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dpk4uhex(){try{__CLR4_4_1hepheple6nl87a.R.inc(22569); 
     __CLR4_4_1hepheple6nl87a.R.inc(22570);LocalDate test = new LocalDate(1970, 6, 9); 
     __CLR4_4_1hepheple6nl87a.R.inc(22571);assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22572);assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22573);assertEquals(true, test.isSupported(DurationFieldType.years())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22574);assertEquals(true, test.isSupported(DurationFieldType.months())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22575);assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22576);assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22577);assertEquals(true, test.isSupported(DurationFieldType.days())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22578);assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22579);assertEquals(false, test.isSupported((DurationFieldType) null)); 
 }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}
public void testWithFieldAdded_DurationFieldType_int_8418() {__CLR4_4_1hepheple6nl87a.R.globalSliceStart(getClass().getName(),22580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ch1gkmhf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hepheple6nl87a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hepheple6nl87a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.testWithFieldAdded_DurationFieldType_int_8418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ch1gkmhf8(){try{__CLR4_4_1hepheple6nl87a.R.inc(22580); 
     __CLR4_4_1hepheple6nl87a.R.inc(22581);LocalTime test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hepheple6nl87a.R.inc(22582);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     __CLR4_4_1hepheple6nl87a.R.inc(22583);assertEquals(new LocalTime(23, 59, 59, 999), result); 
     __CLR4_4_1hepheple6nl87a.R.inc(22584);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hepheple6nl87a.R.inc(22585);result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     __CLR4_4_1hepheple6nl87a.R.inc(22586);assertEquals(new LocalTime(23, 59, 59, 0), result); 
     __CLR4_4_1hepheple6nl87a.R.inc(22587);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hepheple6nl87a.R.inc(22588);result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     __CLR4_4_1hepheple6nl87a.R.inc(22589);assertEquals(new LocalTime(23, 59, 0, 0), result); 
     __CLR4_4_1hepheple6nl87a.R.inc(22590);test = new LocalTime(0, 0, 0, 0); 
     __CLR4_4_1hepheple6nl87a.R.inc(22591);result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     __CLR4_4_1hepheple6nl87a.R.inc(22592);assertEquals(new LocalTime(23, 0, 0, 0), result); 
 }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}
public void test_centuries419() throws Exception {__CLR4_4_1hepheple6nl87a.R.globalSliceStart(getClass().getName(),22593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yjmn6hfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hepheple6nl87a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hepheple6nl87a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yjmn6hfl() throws Exception{try{__CLR4_4_1hepheple6nl87a.R.inc(22593); 
     __CLR4_4_1hepheple6nl87a.R.inc(22594);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22595);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22596);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22597);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22598);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}
public void test_weeks420() throws Exception {__CLR4_4_1hepheple6nl87a.R.globalSliceStart(getClass().getName(),22599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jbz3bhfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hepheple6nl87a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hepheple6nl87a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks420",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jbz3bhfr() throws Exception{try{__CLR4_4_1hepheple6nl87a.R.inc(22599); 
     __CLR4_4_1hepheple6nl87a.R.inc(22600);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22601);assertEquals("weeks", DurationFieldType.weeks().getName()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22602);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22603);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22604);assertSerialization(DurationFieldType.weeks()); 
 }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}
public void test_seconds421() throws Exception {__CLR4_4_1hepheple6nl87a.R.globalSliceStart(getClass().getName(),22605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loynwohfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hepheple6nl87a.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hepheple6nl87a.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loynwohfx() throws Exception{try{__CLR4_4_1hepheple6nl87a.R.inc(22605); 
     __CLR4_4_1hepheple6nl87a.R.inc(22606);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22607);assertEquals("seconds", DurationFieldType.seconds().getName()); 
     __CLR4_4_1hepheple6nl87a.R.inc(22608);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22609);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1hepheple6nl87a.R.inc(22610);assertSerialization(DurationFieldType.seconds()); 
 }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hepheple6nl87a.R.inc(22611);
        __CLR4_4_1hepheple6nl87a.R.inc(22612);DurationFieldType result = doSerialization(type);
        __CLR4_4_1hepheple6nl87a.R.inc(22613);assertSame(type, result);
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1hepheple6nl87a.R.inc(22614);
        __CLR4_4_1hepheple6nl87a.R.inc(22615);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1hepheple6nl87a.R.inc(22616);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1hepheple6nl87a.R.inc(22617);oos.writeObject(type);
        __CLR4_4_1hepheple6nl87a.R.inc(22618);byte[] bytes = baos.toByteArray();
        __CLR4_4_1hepheple6nl87a.R.inc(22619);oos.close();
        
        __CLR4_4_1hepheple6nl87a.R.inc(22620);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1hepheple6nl87a.R.inc(22621);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1hepheple6nl87a.R.inc(22622);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1hepheple6nl87a.R.inc(22623);ois.close();
        __CLR4_4_1hepheple6nl87a.R.inc(22624);return result;
    }finally{__CLR4_4_1hepheple6nl87a.R.flushNeeded();}}

}

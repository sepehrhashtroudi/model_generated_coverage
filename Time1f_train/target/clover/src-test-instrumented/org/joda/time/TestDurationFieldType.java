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
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1jebjeblc8axdtb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,25227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25139);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25140);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25141);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25142);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1jebjeblc8axdtb.R.inc(25144);try{__CLR4_4_1jebjeblc8axdtb.R.inc(25143);
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25145);
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25146);
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_halfdays372() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycwpfmjej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycwpfmjej() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25147); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25148);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25149);assertEquals("halfdays", DurationFieldType.halfdays().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25150);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25151);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25152);assertSerialization(DurationFieldType.halfdays()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_years397() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdmxbjep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years397",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdmxbjep() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25153); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25154);assertEquals(DurationFieldType.years(), DurationFieldType.years()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25155);assertEquals("years", DurationFieldType.years().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25156);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25157);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25158);assertSerialization(DurationFieldType.years()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_months458() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7s5xejev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months458",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7s5xejev() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25159); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25160);assertEquals(DurationFieldType.months(), DurationFieldType.months()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25161);assertEquals("months", DurationFieldType.months().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25162);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25163);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25164);assertSerialization(DurationFieldType.months()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_minutes602() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wti3t9jf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_minutes602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wti3t9jf1() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25165); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25166);assertEquals(DurationFieldType.minutes(), DurationFieldType.minutes()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25167);assertEquals("minutes", DurationFieldType.minutes().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25168);assertEquals(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25169);assertEquals(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25170);assertSerialization(DurationFieldType.minutes()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_centuries633() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpgzywjf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpgzywjf7() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25171); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25172);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25173);assertEquals("centuries", DurationFieldType.centuries().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25174);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25175);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25176);assertSerialization(DurationFieldType.centuries()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_hours816() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hiujijfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours816",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hiujijfd() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25177); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25178);assertEquals(DurationFieldType.hours(), DurationFieldType.hours()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25179);assertEquals("hours", DurationFieldType.hours().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25180);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25181);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25182);assertSerialization(DurationFieldType.hours()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_millis1010() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xe0v2gjfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_millis1010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xe0v2gjfj() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25183); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25184);assertEquals(DurationFieldType.millis(), DurationFieldType.millis()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25185);assertEquals("millis", DurationFieldType.millis().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25186);assertEquals(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25187);assertEquals(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25188);assertSerialization(DurationFieldType.millis()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_days1180() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o851dpjfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days1180",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o851dpjfp() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25189); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25190);assertEquals(DurationFieldType.days(), DurationFieldType.days()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25191);assertEquals("days", DurationFieldType.days().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25192);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25193);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25194);assertSerialization(DurationFieldType.days()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_eras1637() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gnd9gjfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras1637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gnd9gjfv() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25195); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25196);assertEquals(DurationFieldType.eras(), DurationFieldType.eras()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25197);assertEquals("eras", DurationFieldType.eras().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25198);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25199);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25200);assertSerialization(DurationFieldType.eras()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_seconds1640() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16htp0mjg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds1640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16htp0mjg1() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25201); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25202);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25203);assertEquals("seconds", DurationFieldType.seconds().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25204);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25205);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25206);assertSerialization(DurationFieldType.seconds()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 


public void test_weekyears1694() throws Exception {__CLR4_4_1jebjeblc8axdtb.R.globalSliceStart(getClass().getName(),25207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyke78jg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jebjeblc8axdtb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jebjeblc8axdtb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears1694",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyke78jg7() throws Exception{try{__CLR4_4_1jebjeblc8axdtb.R.inc(25207); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25208);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25209);assertEquals("weekyears", DurationFieldType.weekyears().getName()); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25210);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25211);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC())); 
     __CLR4_4_1jebjeblc8axdtb.R.inc(25212);assertSerialization(DurationFieldType.weekyears()); 
 }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25213);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25214);DurationFieldType result = doSerialization(type);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25215);assertSame(type, result);
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1jebjeblc8axdtb.R.inc(25216);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25217);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jebjeblc8axdtb.R.inc(25218);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25219);oos.writeObject(type);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25220);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jebjeblc8axdtb.R.inc(25221);oos.close();
        
        __CLR4_4_1jebjeblc8axdtb.R.inc(25222);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25223);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jebjeblc8axdtb.R.inc(25224);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1jebjeblc8axdtb.R.inc(25225);ois.close();
        __CLR4_4_1jebjeblc8axdtb.R.inc(25226);return result;
    }finally{__CLR4_4_1jebjeblc8axdtb.R.flushNeeded();}}

}

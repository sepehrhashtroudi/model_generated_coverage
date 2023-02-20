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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1s6rs6rle6rjdkf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36531);
        __CLR4_4_1s6rs6rle6rjdkf.R.inc(36532);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36533);
        __CLR4_4_1s6rs6rle6rjdkf.R.inc(36534);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1s6rs6rle6rjdkf.R.inc(36536);try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36535);
    }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36537);
    }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36538);
    }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_add_long_int1232() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3ttfis6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3ttfis6z(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36539); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36540);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36541);assertEquals(1001, field.add(1L, 1)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_add_long_long1233() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13phf44s72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long1233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13phf44s72(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36542); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36543);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36544);assertEquals(1001, field.add(1L, 1L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_addWrapField_long_int1234() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxe56gs75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int1234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxe56gs75(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36545); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36546);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36547);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36548);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36549);assertEquals(0L, field.addWrapField(1000L * 29, 31)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_roundFloor_long1235() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ktrwas7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long1235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ktrwas7a(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36550); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36551);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36552);assertEquals(-2000L, field.roundFloor(-1001L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36553);assertEquals(-1000L, field.roundFloor(-1000L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36554);assertEquals(-1000L, field.roundFloor(-999L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36555);assertEquals(-1000L, field.roundFloor(-1L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36556);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36557);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36558);assertEquals(0L, field.roundFloor(499L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36559);assertEquals(0L, field.roundFloor(500L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36560);assertEquals(0L, field.roundFloor(501L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36561);assertEquals(1000L, field.roundFloor(1000L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_roundCeiling_long1236() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tiyp1ys7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tiyp1ys7m(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36562); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36563);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36564);assertEquals(-1000L, field.roundCeiling(-1001L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36565);assertEquals(-1000L, field.roundCeiling(-1000L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36566);assertEquals(0L, field.roundCeiling(-999L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36567);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36568);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36569);assertEquals(1000L, field.roundCeiling(1L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36570);assertEquals(1000L, field.roundCeiling(499L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36571);assertEquals(1000L, field.roundCeiling(500L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36572);assertEquals(1000L, field.roundCeiling(501L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36573);assertEquals(1000L, field.roundCeiling(1000L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_roundHalfFloor_long1237() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ffoups7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long1237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ffoups7y(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36574); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36575);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36576);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36577);assertEquals(0L, field.roundHalfFloor(499L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36578);assertEquals(0L, field.roundHalfFloor(500L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36579);assertEquals(1000L, field.roundHalfFloor(501L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36580);assertEquals(1000L, field.roundHalfFloor(1000L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_roundHalfCeiling_long1238() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d65bfls85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long1238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d65bfls85(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36581); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36582);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36583);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36584);assertEquals(0L, field.roundHalfCeiling(499L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36585);assertEquals(1000L, field.roundHalfCeiling(500L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36586);assertEquals(1000L, field.roundHalfCeiling(501L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36587);assertEquals(1000L, field.roundHalfCeiling(1000L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_remainder_long1239() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8vt69s8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long1239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8vt69s8c(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36588); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36589);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36590);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36591);assertEquals(499L, field.remainder(499L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36592);assertEquals(500L, field.remainder(500L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36593);assertEquals(501L, field.remainder(501L)); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36594);assertEquals(0L, field.remainder(1000L)); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 


public void test_getOffset1240() {__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceStart(getClass().getName(),36595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157hvhcs8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6rs6rle6rjdkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6rs6rle6rjdkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset1240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157hvhcs8j(){try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36595); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36596);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 5); 
     __CLR4_4_1s6rs6rle6rjdkf.R.inc(36597);assertEquals(5, field.getOffset()); 
 }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //------------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockOffsetDateTimeField extends OffsetDateTimeField {
        protected MockOffsetDateTimeField() {
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1s6rs6rle6rjdkf.R.inc(36599);try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36598);
        }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s6rs6rle6rjdkf.R.inc(36601);try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36600);
        }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36602);
            __CLR4_4_1s6rs6rle6rjdkf.R.inc(36603);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s6rs6rle6rjdkf.R.inc(36604);
            __CLR4_4_1s6rs6rle6rjdkf.R.inc(36605);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s6rs6rle6rjdkf.R.flushNeeded();}}
    }

}

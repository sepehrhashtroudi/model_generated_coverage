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

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for BaseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1le8le8le6np4tv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27728);
        __CLR4_4_1le8le8le6np4tv.R.inc(27729);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27730);
        __CLR4_4_1le8le8le6np4tv.R.inc(27731);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1le8le8le6np4tv.R.inc(27733);try{__CLR4_4_1le8le8le6np4tv.R.inc(27732);
    }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1le8le8le6np4tv.R.inc(27734);
    }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1le8le8le6np4tv.R.inc(27735);
    }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getAsShortText_long140() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xq2q87leg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xq2q87leg(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27736); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27737);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27738);assertEquals("29", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_getAsShortText_long141() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y21cyglej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsShortText_long141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y21cyglej(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27739); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27740);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27741);assertEquals("40", field.getAsShortText(60L * 29)); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_add_long_int142() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyb5fjlem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_add_long_int142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyb5fjlem(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27742); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27743);MockCountingDurationField.add_long = 0; 
     __CLR4_4_1le8le8le6np4tv.R.inc(27744);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27745);assertEquals(61, field.add(1L, 1)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27746);assertEquals(1, MockCountingDurationField.add_long); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_getLeapDurationField146() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kuks05ler();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getLeapDurationField146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kuks05ler(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27747); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27748);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27749);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_getMaximumTextLength_Locale147() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utnz10leu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getMaximumTextLength_Locale147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utnz10leu(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27750); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27751);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27752);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_roundCeiling_long148() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hhvvhlex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundCeiling_long148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hhvvhlex(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27753); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27754);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27755);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27756);assertEquals(0L, field.roundCeiling(29L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27757);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27758);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27759);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
public void test_roundHalfFloor_long149() {__CLR4_4_1le8le8le6np4tv.R.globalSliceStart(getClass().getName(),27760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0xfjalf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1le8le8le6np4tv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1le8le8le6np4tv.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfFloor_long149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0xfjalf4(){try{__CLR4_4_1le8le8le6np4tv.R.inc(27760); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27761);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27762);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27763);assertEquals(0L, field.roundHalfFloor(29L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27764);assertEquals(0L, field.roundHalfFloor(30L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27765);assertEquals(60L, field.roundHalfFloor(31L)); 
     __CLR4_4_1le8le8le6np4tv.R.inc(27766);assertEquals(60L, field.roundHalfFloor(60L)); 
 }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
    

    

    

    

    

    

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
    static class MockBaseDateTimeField extends BaseDateTimeField {
        protected MockBaseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1le8le8le6np4tv.R.inc(27768);try{__CLR4_4_1le8le8le6np4tv.R.inc(27767);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1le8le8le6np4tv.R.inc(27770);try{__CLR4_4_1le8le8le6np4tv.R.inc(27769);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27771);
            __CLR4_4_1le8le8le6np4tv.R.inc(27772);return (int) (instant / 60L);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27773);
            __CLR4_4_1le8le8le6np4tv.R.inc(27774);return 1000 + value;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27775);
            __CLR4_4_1le8le8le6np4tv.R.inc(27776);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27777);
            __CLR4_4_1le8le8le6np4tv.R.inc(27778);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27779);
            __CLR4_4_1le8le8le6np4tv.R.inc(27780);return 0;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27781);
            __CLR4_4_1le8le8le6np4tv.R.inc(27782);return 59;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27783);
            __CLR4_4_1le8le8le6np4tv.R.inc(27784);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27785);
            __CLR4_4_1le8le8le6np4tv.R.inc(27786);return false;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1le8le8le6np4tv.R.inc(27788);try{__CLR4_4_1le8le8le6np4tv.R.inc(27787);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27789);
            __CLR4_4_1le8le8le6np4tv.R.inc(27790);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27791);
            __CLR4_4_1le8le8le6np4tv.R.inc(27792);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1le8le8le6np4tv.R.inc(27794);try{__CLR4_4_1le8le8le6np4tv.R.inc(27793);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27795);
            __CLR4_4_1le8le8le6np4tv.R.inc(27796);return false;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27797);
            __CLR4_4_1le8le8le6np4tv.R.inc(27798);return 0;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27799);
            __CLR4_4_1le8le8le6np4tv.R.inc(27800);return 0;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27801);
            __CLR4_4_1le8le8le6np4tv.R.inc(27802);return 0;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27803);
            __CLR4_4_1le8le8le6np4tv.R.inc(27804);return 0;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27805);
            __CLR4_4_1le8le8le6np4tv.R.inc(27806);add_int++;
            __CLR4_4_1le8le8le6np4tv.R.inc(27807);return instant + (value * 60L);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27808);
            __CLR4_4_1le8le8le6np4tv.R.inc(27809);add_long++;
            __CLR4_4_1le8le8le6np4tv.R.inc(27810);return instant + (value * 60L);
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27811);
            __CLR4_4_1le8le8le6np4tv.R.inc(27812);difference_long++;
            __CLR4_4_1le8le8le6np4tv.R.inc(27813);return 30;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1le8le8le6np4tv.R.inc(27814);
            __CLR4_4_1le8le8le6np4tv.R.inc(27815);if ((((index == 0)&&(__CLR4_4_1le8le8le6np4tv.R.iget(27816)!=0|true))||(__CLR4_4_1le8le8le6np4tv.R.iget(27817)==0&false))) {{
                __CLR4_4_1le8le8le6np4tv.R.inc(27818);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1le8le8le6np4tv.R.inc(27819);if ((((index == 1)&&(__CLR4_4_1le8le8le6np4tv.R.iget(27820)!=0|true))||(__CLR4_4_1le8le8le6np4tv.R.iget(27821)==0&false))) {{
                __CLR4_4_1le8le8le6np4tv.R.inc(27822);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1le8le8le6np4tv.R.inc(27823);return null;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1le8le8le6np4tv.R.inc(27824);
            __CLR4_4_1le8le8le6np4tv.R.inc(27825);return 2;
        }finally{__CLR4_4_1le8le8le6np4tv.R.flushNeeded();}}
        
    }
}

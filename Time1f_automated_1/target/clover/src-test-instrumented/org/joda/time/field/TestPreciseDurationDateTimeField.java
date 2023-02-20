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
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1m3fm3fle6ndq44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28635);
        __CLR4_4_1m3fm3fle6ndq44.R.inc(28636);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28637);
        __CLR4_4_1m3fm3fle6ndq44.R.inc(28638);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1m3fm3fle6ndq44.R.inc(28640);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28639);
    }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28641);
    }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28642);
    }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_set_long_String609() {__CLR4_4_1m3fm3fle6ndq44.R.globalSliceStart(getClass().getName(),28643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aa87j8m3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3fm3fle6ndq44.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3fm3fle6ndq44.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_String609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aa87j8m3n(){try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28643); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28644);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28645);assertEquals(0, field.set(0L, "0")); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28646);assertEquals(29 * 60, field.set(0L, "29")); 
 }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
public void test_getDurationField610() {__CLR4_4_1m3fm3fle6ndq44.R.globalSliceStart(getClass().getName(),28647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fh49rm3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3fm3fle6ndq44.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3fm3fle6ndq44.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getDurationField610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fh49rm3r(){try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28647); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28648);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28649);assertEquals(null, field.getDurationField()); 
 }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
public void test_getMinimumValue611() {__CLR4_4_1m3fm3fle6ndq44.R.globalSliceStart(getClass().getName(),28650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13b73vzm3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3fm3fle6ndq44.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3fm3fle6ndq44.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_getMinimumValue611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13b73vzm3u(){try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28650); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28651);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1m3fm3fle6ndq44.R.inc(28652);assertEquals(0, field.getMinimumValue()); 
 }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    

    

    

    

    

    

    

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
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1m3fm3fle6ndq44.R.inc(28654);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28653);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1m3fm3fle6ndq44.R.inc(28656);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28655);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28657);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28658);return (int) (instant / 60L);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28659);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28660);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28661);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28662);return 59;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1m3fm3fle6ndq44.R.inc(28664);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28663);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28665);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28666);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28667);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28668);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1m3fm3fle6ndq44.R.inc(28670);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28669);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28671);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28672);return true;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28673);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28674);return 60;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28675);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28676);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28677);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28678);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28679);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28680);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28681);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28682);add_int++;
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28683);return instant + (value * 60L);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28684);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28685);add_long++;
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28686);return instant + (value * 60L);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28687);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28688);difference_long++;
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28689);return 30;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1m3fm3fle6ndq44.R.inc(28691);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28690);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28692);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28693);return true;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28694);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28695);return 0;  // this is zero
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28696);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28697);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28698);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28699);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28700);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28701);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28702);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28703);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28704);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28705);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28706);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28707);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1m3fm3fle6ndq44.R.inc(28709);try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28708);
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28710);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28711);return false;  // this is false
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28712);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28713);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28714);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28715);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28716);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28717);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28718);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28719);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28720);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28721);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28722);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28723);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m3fm3fle6ndq44.R.inc(28724);
            __CLR4_4_1m3fm3fle6ndq44.R.inc(28725);return 0;
        }finally{__CLR4_4_1m3fm3fle6ndq44.R.flushNeeded();}}
    }

}

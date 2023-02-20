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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1lialiale6np4u7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lialiale6np4u7.R.inc(27874);
        __CLR4_4_1lialiale6np4u7.R.inc(27875);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lialiale6np4u7.R.inc(27876);
        __CLR4_4_1lialiale6np4u7.R.inc(27877);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1lialiale6np4u7.R.inc(27879);try{__CLR4_4_1lialiale6np4u7.R.inc(27878);
    }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lialiale6np4u7.R.inc(27880);
    }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lialiale6np4u7.R.inc(27881);
    }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_addWrapField_long_int404() {__CLR4_4_1lialiale6np4u7.R.globalSliceStart(getClass().getName(),27882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vivdg0lii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lialiale6np4u7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lialiale6np4u7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vivdg0lii(){try{__CLR4_4_1lialiale6np4u7.R.inc(27882); 
     __CLR4_4_1lialiale6np4u7.R.inc(27883);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1lialiale6np4u7.R.inc(27884);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1lialiale6np4u7.R.inc(27885);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1lialiale6np4u7.R.inc(27886);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    

    

    

    

    

    

    

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
    static class MockPreciseDateTimeField extends PreciseDateTimeField {
        protected MockPreciseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds(), 60),
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1lialiale6np4u7.R.inc(27888);try{__CLR4_4_1lialiale6np4u7.R.inc(27887);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1lialiale6np4u7.R.inc(27890);try{__CLR4_4_1lialiale6np4u7.R.inc(27889);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1lialiale6np4u7.R.inc(27892);try{__CLR4_4_1lialiale6np4u7.R.inc(27891);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lialiale6np4u7.R.inc(27893);
            __CLR4_4_1lialiale6np4u7.R.inc(27894);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lialiale6np4u7.R.inc(27895);
            __CLR4_4_1lialiale6np4u7.R.inc(27896);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1lialiale6np4u7.R.inc(27898);try{__CLR4_4_1lialiale6np4u7.R.inc(27897);
            __CLR4_4_1lialiale6np4u7.R.inc(27899);this.unit = unit;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lialiale6np4u7.R.inc(27900);
            __CLR4_4_1lialiale6np4u7.R.inc(27901);return true;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lialiale6np4u7.R.inc(27902);
            __CLR4_4_1lialiale6np4u7.R.inc(27903);return unit;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27904);
            __CLR4_4_1lialiale6np4u7.R.inc(27905);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27906);
            __CLR4_4_1lialiale6np4u7.R.inc(27907);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27908);
            __CLR4_4_1lialiale6np4u7.R.inc(27909);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27910);
            __CLR4_4_1lialiale6np4u7.R.inc(27911);add_int++;
            __CLR4_4_1lialiale6np4u7.R.inc(27912);return instant + (value * 60L);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27913);
            __CLR4_4_1lialiale6np4u7.R.inc(27914);add_long++;
            __CLR4_4_1lialiale6np4u7.R.inc(27915);return instant + (value * 60L);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27916);
            __CLR4_4_1lialiale6np4u7.R.inc(27917);difference_long++;
            __CLR4_4_1lialiale6np4u7.R.inc(27918);return 30;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lialiale6np4u7.R.inc(27920);try{__CLR4_4_1lialiale6np4u7.R.inc(27919);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lialiale6np4u7.R.inc(27921);
            __CLR4_4_1lialiale6np4u7.R.inc(27922);return true;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lialiale6np4u7.R.inc(27923);
            __CLR4_4_1lialiale6np4u7.R.inc(27924);return 0;  // this is zero
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27925);
            __CLR4_4_1lialiale6np4u7.R.inc(27926);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27927);
            __CLR4_4_1lialiale6np4u7.R.inc(27928);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27929);
            __CLR4_4_1lialiale6np4u7.R.inc(27930);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27931);
            __CLR4_4_1lialiale6np4u7.R.inc(27932);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27933);
            __CLR4_4_1lialiale6np4u7.R.inc(27934);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27935);
            __CLR4_4_1lialiale6np4u7.R.inc(27936);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lialiale6np4u7.R.inc(27938);try{__CLR4_4_1lialiale6np4u7.R.inc(27937);
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lialiale6np4u7.R.inc(27939);
            __CLR4_4_1lialiale6np4u7.R.inc(27940);return false;  // this is false
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lialiale6np4u7.R.inc(27941);
            __CLR4_4_1lialiale6np4u7.R.inc(27942);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27943);
            __CLR4_4_1lialiale6np4u7.R.inc(27944);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27945);
            __CLR4_4_1lialiale6np4u7.R.inc(27946);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27947);
            __CLR4_4_1lialiale6np4u7.R.inc(27948);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27949);
            __CLR4_4_1lialiale6np4u7.R.inc(27950);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lialiale6np4u7.R.inc(27951);
            __CLR4_4_1lialiale6np4u7.R.inc(27952);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lialiale6np4u7.R.inc(27953);
            __CLR4_4_1lialiale6np4u7.R.inc(27954);return 0;
        }finally{__CLR4_4_1lialiale6np4u7.R.flushNeeded();}}
    }

}

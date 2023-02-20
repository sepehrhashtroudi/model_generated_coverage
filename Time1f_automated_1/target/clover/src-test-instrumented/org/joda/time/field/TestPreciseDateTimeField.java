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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1m1bm1ble6ndq3y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28559);
        __CLR4_4_1m1bm1ble6ndq3y.R.inc(28560);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28561);
        __CLR4_4_1m1bm1ble6ndq3y.R.inc(28562);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1m1bm1ble6ndq3y.R.inc(28564);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28563);
    }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28565);
    }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28566);
    }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1m1bm1ble6ndq3y.R.inc(28568);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28567);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1m1bm1ble6ndq3y.R.inc(28570);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28569);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1m1bm1ble6ndq3y.R.inc(28572);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28571);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28573);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28574);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28575);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28576);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1m1bm1ble6ndq3y.R.inc(28578);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28577);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28579);this.unit = unit;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28580);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28581);return true;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28582);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28583);return unit;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28584);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28585);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28586);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28587);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28588);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28589);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28590);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28591);add_int++;
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28592);return instant + (value * 60L);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28593);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28594);add_long++;
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28595);return instant + (value * 60L);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28596);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28597);difference_long++;
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28598);return 30;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1m1bm1ble6ndq3y.R.inc(28600);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28599);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28601);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28602);return true;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28603);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28604);return 0;  // this is zero
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28605);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28606);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28607);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28608);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28609);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28610);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28611);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28612);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28613);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28614);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28615);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28616);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1m1bm1ble6ndq3y.R.inc(28618);try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28617);
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28619);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28620);return false;  // this is false
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28621);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28622);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28623);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28624);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28625);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28626);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28627);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28628);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28629);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28630);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28631);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28632);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1m1bm1ble6ndq3y.R.inc(28633);
            __CLR4_4_1m1bm1ble6ndq3y.R.inc(28634);return 0;
        }finally{__CLR4_4_1m1bm1ble6ndq3y.R.flushNeeded();}}
    }

}

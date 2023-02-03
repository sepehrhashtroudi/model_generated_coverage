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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1jg0jg0ldl911l7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,25281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25200);
        __CLR4_4_1jg0jg0ldl911l7.R.inc(25201);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25202);
        __CLR4_4_1jg0jg0ldl911l7.R.inc(25203);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1jg0jg0ldl911l7.R.inc(25205);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25204);
    }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25206);
    }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25207);
    }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}

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
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1jg0jg0ldl911l7.R.inc(25209);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25208);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1jg0jg0ldl911l7.R.inc(25211);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25210);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25212);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25213);return (int) (instant / 60L);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25214);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25215);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25216);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25217);return 59;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1jg0jg0ldl911l7.R.inc(25219);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25218);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25220);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25221);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25222);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25223);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1jg0jg0ldl911l7.R.inc(25225);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25224);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25226);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25227);return true;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25228);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25229);return 60;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25230);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25231);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25232);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25233);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25234);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25235);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25236);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25237);add_int++;
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25238);return instant + (value * 60L);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25239);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25240);add_long++;
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25241);return instant + (value * 60L);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25242);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25243);difference_long++;
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25244);return 30;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1jg0jg0ldl911l7.R.inc(25246);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25245);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25247);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25248);return true;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25249);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25250);return 0;  // this is zero
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25251);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25252);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25253);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25254);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25255);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25256);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25257);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25258);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25259);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25260);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25261);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25262);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1jg0jg0ldl911l7.R.inc(25264);try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25263);
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25265);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25266);return false;  // this is false
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25267);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25268);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25269);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25270);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25271);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25272);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25273);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25274);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25275);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25276);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25277);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25278);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1jg0jg0ldl911l7.R.inc(25279);
            __CLR4_4_1jg0jg0ldl911l7.R.inc(25280);return 0;
        }finally{__CLR4_4_1jg0jg0ldl911l7.R.flushNeeded();}}
    }

}

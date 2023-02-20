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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1lqhlqhle6nl8p9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28169);
        __CLR4_4_1lqhlqhle6nl8p9.R.inc(28170);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28171);
        __CLR4_4_1lqhlqhle6nl8p9.R.inc(28172);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1lqhlqhle6nl8p9.R.inc(28174);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28173);
    }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28175);
    }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28176);
    }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}

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
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1lqhlqhle6nl8p9.R.inc(28178);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28177);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1lqhlqhle6nl8p9.R.inc(28180);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28179);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28181);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28182);return (int) (instant / 60L);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28183);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28184);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28185);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28186);return 59;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1lqhlqhle6nl8p9.R.inc(28188);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28187);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28189);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28190);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28191);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28192);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lqhlqhle6nl8p9.R.inc(28194);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28193);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28195);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28196);return true;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28197);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28198);return 60;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28199);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28200);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28201);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28202);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28203);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28204);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28205);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28206);add_int++;
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28207);return instant + (value * 60L);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28208);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28209);add_long++;
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28210);return instant + (value * 60L);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28211);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28212);difference_long++;
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28213);return 30;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lqhlqhle6nl8p9.R.inc(28215);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28214);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28216);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28217);return true;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28218);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28219);return 0;  // this is zero
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28220);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28221);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28222);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28223);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28224);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28225);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28226);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28227);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28228);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28229);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28230);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28231);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lqhlqhle6nl8p9.R.inc(28233);try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28232);
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28234);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28235);return false;  // this is false
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28236);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28237);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28238);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28239);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28240);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28241);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28242);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28243);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28244);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28245);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28246);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28247);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lqhlqhle6nl8p9.R.inc(28248);
            __CLR4_4_1lqhlqhle6nl8p9.R.inc(28249);return 0;
        }finally{__CLR4_4_1lqhlqhle6nl8p9.R.flushNeeded();}}
    }

}

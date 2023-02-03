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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1k8qk8qlccieu0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26234);
        __CLR4_4_1k8qk8qlccieu0u.R.inc(26235);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26236);
        __CLR4_4_1k8qk8qlccieu0u.R.inc(26237);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1k8qk8qlccieu0u.R.inc(26239);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26238);
    }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26240);
    }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26241);
    }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}

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
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1k8qk8qlccieu0u.R.inc(26243);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26242);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1k8qk8qlccieu0u.R.inc(26245);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26244);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26246);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26247);return (int) (instant / 60L);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26248);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26249);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26250);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26251);return 59;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1k8qk8qlccieu0u.R.inc(26253);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26252);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26254);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26255);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26256);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26257);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1k8qk8qlccieu0u.R.inc(26259);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26258);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26260);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26261);return true;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26262);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26263);return 60;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26264);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26265);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26266);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26267);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26268);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26269);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26270);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26271);add_int++;
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26272);return instant + (value * 60L);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26273);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26274);add_long++;
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26275);return instant + (value * 60L);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26276);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26277);difference_long++;
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26278);return 30;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1k8qk8qlccieu0u.R.inc(26280);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26279);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26281);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26282);return true;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26283);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26284);return 0;  // this is zero
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26285);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26286);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26287);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26288);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26289);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26290);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26291);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26292);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26293);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26294);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26295);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26296);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1k8qk8qlccieu0u.R.inc(26298);try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26297);
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26299);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26300);return false;  // this is false
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26301);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26302);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26303);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26304);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26305);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26306);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26307);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26308);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26309);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26310);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26311);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26312);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1k8qk8qlccieu0u.R.inc(26313);
            __CLR4_4_1k8qk8qlccieu0u.R.inc(26314);return 0;
        }finally{__CLR4_4_1k8qk8qlccieu0u.R.flushNeeded();}}
    }

}

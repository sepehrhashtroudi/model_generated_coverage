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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1loaloale6nl8p5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28090);
        __CLR4_4_1loaloale6nl8p5.R.inc(28091);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28092);
        __CLR4_4_1loaloale6nl8p5.R.inc(28093);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1loaloale6nl8p5.R.inc(28095);try{__CLR4_4_1loaloale6nl8p5.R.inc(28094);
    }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1loaloale6nl8p5.R.inc(28096);
    }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1loaloale6nl8p5.R.inc(28097);
    }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getRangeDurationField395() {__CLR4_4_1loaloale6nl8p5.R.globalSliceStart(getClass().getName(),28098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy2ickloi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1loaloale6nl8p5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1loaloale6nl8p5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRangeDurationField395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy2ickloi(){try{__CLR4_4_1loaloale6nl8p5.R.inc(28098); 
     __CLR4_4_1loaloale6nl8p5.R.inc(28099);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1loaloale6nl8p5.R.inc(28100);assertEquals(null, field.getRangeDurationField()); 
 }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1loaloale6nl8p5.R.inc(28102);try{__CLR4_4_1loaloale6nl8p5.R.inc(28101);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1loaloale6nl8p5.R.inc(28104);try{__CLR4_4_1loaloale6nl8p5.R.inc(28103);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1loaloale6nl8p5.R.inc(28106);try{__CLR4_4_1loaloale6nl8p5.R.inc(28105);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28107);
            __CLR4_4_1loaloale6nl8p5.R.inc(28108);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28109);
            __CLR4_4_1loaloale6nl8p5.R.inc(28110);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1loaloale6nl8p5.R.inc(28112);try{__CLR4_4_1loaloale6nl8p5.R.inc(28111);
            __CLR4_4_1loaloale6nl8p5.R.inc(28113);this.unit = unit;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28114);
            __CLR4_4_1loaloale6nl8p5.R.inc(28115);return true;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28116);
            __CLR4_4_1loaloale6nl8p5.R.inc(28117);return unit;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28118);
            __CLR4_4_1loaloale6nl8p5.R.inc(28119);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28120);
            __CLR4_4_1loaloale6nl8p5.R.inc(28121);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28122);
            __CLR4_4_1loaloale6nl8p5.R.inc(28123);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28124);
            __CLR4_4_1loaloale6nl8p5.R.inc(28125);add_int++;
            __CLR4_4_1loaloale6nl8p5.R.inc(28126);return instant + (value * 60L);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28127);
            __CLR4_4_1loaloale6nl8p5.R.inc(28128);add_long++;
            __CLR4_4_1loaloale6nl8p5.R.inc(28129);return instant + (value * 60L);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28130);
            __CLR4_4_1loaloale6nl8p5.R.inc(28131);difference_long++;
            __CLR4_4_1loaloale6nl8p5.R.inc(28132);return 30;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1loaloale6nl8p5.R.inc(28134);try{__CLR4_4_1loaloale6nl8p5.R.inc(28133);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28135);
            __CLR4_4_1loaloale6nl8p5.R.inc(28136);return true;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28137);
            __CLR4_4_1loaloale6nl8p5.R.inc(28138);return 0;  // this is zero
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28139);
            __CLR4_4_1loaloale6nl8p5.R.inc(28140);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28141);
            __CLR4_4_1loaloale6nl8p5.R.inc(28142);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28143);
            __CLR4_4_1loaloale6nl8p5.R.inc(28144);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28145);
            __CLR4_4_1loaloale6nl8p5.R.inc(28146);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28147);
            __CLR4_4_1loaloale6nl8p5.R.inc(28148);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28149);
            __CLR4_4_1loaloale6nl8p5.R.inc(28150);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1loaloale6nl8p5.R.inc(28152);try{__CLR4_4_1loaloale6nl8p5.R.inc(28151);
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28153);
            __CLR4_4_1loaloale6nl8p5.R.inc(28154);return false;  // this is false
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1loaloale6nl8p5.R.inc(28155);
            __CLR4_4_1loaloale6nl8p5.R.inc(28156);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28157);
            __CLR4_4_1loaloale6nl8p5.R.inc(28158);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28159);
            __CLR4_4_1loaloale6nl8p5.R.inc(28160);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28161);
            __CLR4_4_1loaloale6nl8p5.R.inc(28162);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28163);
            __CLR4_4_1loaloale6nl8p5.R.inc(28164);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28165);
            __CLR4_4_1loaloale6nl8p5.R.inc(28166);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1loaloale6nl8p5.R.inc(28167);
            __CLR4_4_1loaloale6nl8p5.R.inc(28168);return 0;
        }finally{__CLR4_4_1loaloale6nl8p5.R.flushNeeded();}}
    }

}

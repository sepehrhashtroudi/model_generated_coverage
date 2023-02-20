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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1lgrlgrle6o7act{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,27898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27819);
        __CLR4_4_1lgrlgrle6o7act.R.inc(27820);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27821);
        __CLR4_4_1lgrlgrle6o7act.R.inc(27822);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1lgrlgrle6o7act.R.inc(27824);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27823);
    }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27825);
    }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27826);
    }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_getRange362() {__CLR4_4_1lgrlgrle6o7act.R.globalSliceStart(getClass().getName(),27827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13b59mmlgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lgrlgrle6o7act.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lgrlgrle6o7act.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13b59mmlgz(){try{__CLR4_4_1lgrlgrle6o7act.R.inc(27827); 
     __CLR4_4_1lgrlgrle6o7act.R.inc(27828);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1lgrlgrle6o7act.R.inc(27829);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1lgrlgrle6o7act.R.inc(27831);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27830);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1lgrlgrle6o7act.R.inc(27833);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27832);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1lgrlgrle6o7act.R.inc(27835);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27834);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27836);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27837);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27838);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27839);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1lgrlgrle6o7act.R.inc(27841);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27840);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27842);this.unit = unit;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27843);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27844);return true;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27845);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27846);return unit;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27847);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27848);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27849);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27850);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27851);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27852);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27853);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27854);add_int++;
            __CLR4_4_1lgrlgrle6o7act.R.inc(27855);return instant + (value * 60L);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27856);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27857);add_long++;
            __CLR4_4_1lgrlgrle6o7act.R.inc(27858);return instant + (value * 60L);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27859);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27860);difference_long++;
            __CLR4_4_1lgrlgrle6o7act.R.inc(27861);return 30;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lgrlgrle6o7act.R.inc(27863);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27862);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27864);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27865);return true;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27866);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27867);return 0;  // this is zero
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27868);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27869);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27870);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27871);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27872);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27873);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27874);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27875);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27876);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27877);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27878);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27879);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lgrlgrle6o7act.R.inc(27881);try{__CLR4_4_1lgrlgrle6o7act.R.inc(27880);
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27882);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27883);return false;  // this is false
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27884);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27885);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27886);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27887);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27888);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27889);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27890);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27891);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27892);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27893);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27894);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27895);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lgrlgrle6o7act.R.inc(27896);
            __CLR4_4_1lgrlgrle6o7act.R.inc(27897);return 0;
        }finally{__CLR4_4_1lgrlgrle6o7act.R.flushNeeded();}}
    }

}

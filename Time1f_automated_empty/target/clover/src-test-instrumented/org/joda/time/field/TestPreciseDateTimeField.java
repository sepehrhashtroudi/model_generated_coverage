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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1j7pj7pldnipzdn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,24977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24901);
        __CLR4_4_1j7pj7pldnipzdn.R.inc(24902);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24903);
        __CLR4_4_1j7pj7pldnipzdn.R.inc(24904);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1j7pj7pldnipzdn.R.inc(24906);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24905);
    }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24907);
    }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24908);
    }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1j7pj7pldnipzdn.R.inc(24910);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24909);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1j7pj7pldnipzdn.R.inc(24912);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24911);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1j7pj7pldnipzdn.R.inc(24914);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24913);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24915);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24916);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24917);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24918);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1j7pj7pldnipzdn.R.inc(24920);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24919);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24921);this.unit = unit;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24922);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24923);return true;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24924);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24925);return unit;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24926);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24927);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24928);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24929);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24930);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24931);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24932);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24933);add_int++;
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24934);return instant + (value * 60L);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24935);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24936);add_long++;
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24937);return instant + (value * 60L);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24938);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24939);difference_long++;
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24940);return 30;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1j7pj7pldnipzdn.R.inc(24942);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24941);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24943);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24944);return true;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24945);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24946);return 0;  // this is zero
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24947);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24948);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24949);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24950);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24951);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24952);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24953);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24954);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24955);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24956);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24957);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24958);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1j7pj7pldnipzdn.R.inc(24960);try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24959);
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24961);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24962);return false;  // this is false
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24963);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24964);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24965);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24966);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24967);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24968);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24969);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24970);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24971);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24972);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24973);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24974);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1j7pj7pldnipzdn.R.inc(24975);
            __CLR4_4_1j7pj7pldnipzdn.R.inc(24976);return 0;
        }finally{__CLR4_4_1j7pj7pldnipzdn.R.flushNeeded();}}
    }

}

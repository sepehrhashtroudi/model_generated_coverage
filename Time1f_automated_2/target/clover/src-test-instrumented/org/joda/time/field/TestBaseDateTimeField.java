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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1lk4lk4le6nl8or{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27940);
        __CLR4_4_1lk4lk4le6nl8or.R.inc(27941);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27942);
        __CLR4_4_1lk4lk4le6nl8or.R.inc(27943);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1lk4lk4le6nl8or.R.inc(27945);try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27944);
    }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27946);
    }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27947);
    }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_isSupported176() {__CLR4_4_1lk4lk4le6nl8or.R.globalSliceStart(getClass().getName(),27948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udbtslkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lk4lk4le6nl8or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lk4lk4le6nl8or.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_isSupported176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udbtslkc(){try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27948); 
     __CLR4_4_1lk4lk4le6nl8or.R.inc(27949);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lk4lk4le6nl8or.R.inc(27950);assertEquals(true, field.isSupported()); 
 }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
public void test_getAsText_RP_Locale177() {__CLR4_4_1lk4lk4le6nl8or.R.globalSliceStart(getClass().getName(),27951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybvt4clkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lk4lk4le6nl8or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lk4lk4le6nl8or.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_getAsText_RP_Locale177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybvt4clkf(){try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27951); 
     __CLR4_4_1lk4lk4le6nl8or.R.inc(27952);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1lk4lk4le6nl8or.R.inc(27953);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH)); 
     __CLR4_4_1lk4lk4le6nl8or.R.inc(27954);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null)); 
 }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1lk4lk4le6nl8or.R.inc(27956);try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27955);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1lk4lk4le6nl8or.R.inc(27958);try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27957);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27959);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27960);return (int) (instant / 60L);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27961);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27962);return 1000 + value;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27963);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27964);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27965);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27966);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27967);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27968);return 0;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27969);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27970);return 59;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27971);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27972);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27973);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27974);return false;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1lk4lk4le6nl8or.R.inc(27976);try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27975);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27977);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27978);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27979);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27980);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1lk4lk4le6nl8or.R.inc(27982);try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27981);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27983);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27984);return false;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27985);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27986);return 0;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27987);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27988);return 0;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27989);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27990);return 0;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27991);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27992);return 0;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27993);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27994);add_int++;
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27995);return instant + (value * 60L);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27996);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27997);add_long++;
            __CLR4_4_1lk4lk4le6nl8or.R.inc(27998);return instant + (value * 60L);
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(27999);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(28000);difference_long++;
            __CLR4_4_1lk4lk4le6nl8or.R.inc(28001);return 30;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(28002);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(28003);if ((((index == 0)&&(__CLR4_4_1lk4lk4le6nl8or.R.iget(28004)!=0|true))||(__CLR4_4_1lk4lk4le6nl8or.R.iget(28005)==0&false))) {{
                __CLR4_4_1lk4lk4le6nl8or.R.inc(28006);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1lk4lk4le6nl8or.R.inc(28007);if ((((index == 1)&&(__CLR4_4_1lk4lk4le6nl8or.R.iget(28008)!=0|true))||(__CLR4_4_1lk4lk4le6nl8or.R.iget(28009)==0&false))) {{
                __CLR4_4_1lk4lk4le6nl8or.R.inc(28010);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1lk4lk4le6nl8or.R.inc(28011);return null;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1lk4lk4le6nl8or.R.inc(28012);
            __CLR4_4_1lk4lk4le6nl8or.R.inc(28013);return 2;
        }finally{__CLR4_4_1lk4lk4le6nl8or.R.flushNeeded();}}
        
    }
}

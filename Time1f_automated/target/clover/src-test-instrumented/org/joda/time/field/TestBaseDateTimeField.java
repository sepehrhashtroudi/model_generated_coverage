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
public class TestBaseDateTimeField extends TestCase {static class __CLR4_4_1k3dk3dlccieu09{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26041);
        __CLR4_4_1k3dk3dlccieu09.R.inc(26042);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26043);
        __CLR4_4_1k3dk3dlccieu09.R.inc(26044);return new TestSuite(TestBaseDateTimeField.class);
    }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}

    public TestBaseDateTimeField(String name) {
        super(name);__CLR4_4_1k3dk3dlccieu09.R.inc(26046);try{__CLR4_4_1k3dk3dlccieu09.R.inc(26045);
    }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26047);
    }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26048);
    }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_roundHalfEven_long26() {__CLR4_4_1k3dk3dlccieu09.R.globalSliceStart(getClass().getName(),26049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vky6awk3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3dk3dlccieu09.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3dk3dlccieu09.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vky6awk3l(){try{__CLR4_4_1k3dk3dlccieu09.R.inc(26049); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26050);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26051);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26052);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26053);assertEquals(60L, field.roundHalfEven(30L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26054);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26055);assertEquals(60L, field.roundHalfEven(60L)); 
 }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
public void test_roundHalfEven_long189() {__CLR4_4_1k3dk3dlccieu09.R.globalSliceStart(getClass().getName(),26056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fxqfgk3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k3dk3dlccieu09.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k3dk3dlccieu09.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestBaseDateTimeField.test_roundHalfEven_long189",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fxqfgk3s(){try{__CLR4_4_1k3dk3dlccieu09.R.inc(26056); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26057);BaseDateTimeField field = new MockBaseDateTimeField(); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26058);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26059);assertEquals(0L, field.roundHalfEven(29L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26060);assertEquals(0L, field.roundHalfEven(30L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26061);assertEquals(60L, field.roundHalfEven(31L)); 
     __CLR4_4_1k3dk3dlccieu09.R.inc(26062);assertEquals(60L, field.roundHalfEven(60L)); 
 }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
    

    

    

    

    

    

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
            super(DateTimeFieldType.secondOfMinute());__CLR4_4_1k3dk3dlccieu09.R.inc(26064);try{__CLR4_4_1k3dk3dlccieu09.R.inc(26063);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        protected MockBaseDateTimeField(DateTimeFieldType type) {
            super(type);__CLR4_4_1k3dk3dlccieu09.R.inc(26066);try{__CLR4_4_1k3dk3dlccieu09.R.inc(26065);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26067);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26068);return (int) (instant / 60L);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long set(long instant, int value) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26069);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26070);return 1000 + value;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26071);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26072);return new MockCountingDurationField(DurationFieldType.seconds());
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26073);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26074);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public int getMinimumValue() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26075);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26076);return 0;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26077);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26078);return 59;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long roundFloor(long instant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26079);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26080);return (instant / 60L) * 60L;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public boolean isLenient() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26081);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26082);return false;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockBaseDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1k3dk3dlccieu09.R.inc(26084);try{__CLR4_4_1k3dk3dlccieu09.R.inc(26083);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26085);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26086);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26087);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26088);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1k3dk3dlccieu09.R.inc(26090);try{__CLR4_4_1k3dk3dlccieu09.R.inc(26089);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26091);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26092);return false;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26093);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26094);return 0;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26095);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26096);return 0;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26097);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26098);return 0;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26099);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26100);return 0;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26101);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26102);add_int++;
            __CLR4_4_1k3dk3dlccieu09.R.inc(26103);return instant + (value * 60L);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26104);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26105);add_long++;
            __CLR4_4_1k3dk3dlccieu09.R.inc(26106);return instant + (value * 60L);
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26107);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26108);difference_long++;
            __CLR4_4_1k3dk3dlccieu09.R.inc(26109);return 30;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
    }

    static class MockPartial extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26110);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26111);if ((((index == 0)&&(__CLR4_4_1k3dk3dlccieu09.R.iget(26112)!=0|true))||(__CLR4_4_1k3dk3dlccieu09.R.iget(26113)==0&false))) {{
                __CLR4_4_1k3dk3dlccieu09.R.inc(26114);return ISOChronology.getInstanceUTC().minuteOfHour();
            }
            }__CLR4_4_1k3dk3dlccieu09.R.inc(26115);if ((((index == 1)&&(__CLR4_4_1k3dk3dlccieu09.R.iget(26116)!=0|true))||(__CLR4_4_1k3dk3dlccieu09.R.iget(26117)==0&false))) {{
                __CLR4_4_1k3dk3dlccieu09.R.inc(26118);return ISOChronology.getInstanceUTC().millisOfSecond();
            }
            }__CLR4_4_1k3dk3dlccieu09.R.inc(26119);return null;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1k3dk3dlccieu09.R.inc(26120);
            __CLR4_4_1k3dk3dlccieu09.R.inc(26121);return 2;
        }finally{__CLR4_4_1k3dk3dlccieu09.R.flushNeeded();}}
        
    }
}

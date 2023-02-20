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
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1lhglhgle6np4u4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,27874,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27844);
        __CLR4_4_1lhglhgle6np4u4.R.inc(27845);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27846);
        __CLR4_4_1lhglhgle6np4u4.R.inc(27847);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1lhglhgle6np4u4.R.inc(27849);try{__CLR4_4_1lhglhgle6np4u4.R.inc(27848);
    }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27850);
    }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27851);
    }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_roundFloor_long513() {__CLR4_4_1lhglhgle6np4u4.R.globalSliceStart(getClass().getName(),27852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx92vmlho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhglhgle6np4u4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhglhgle6np4u4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx92vmlho(){try{__CLR4_4_1lhglhgle6np4u4.R.inc(27852); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27853);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27854);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27855);assertEquals(0L, field.roundFloor(499L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27856);assertEquals(0L, field.roundFloor(500L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27857);assertEquals(1000L, field.roundFloor(501L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27858);assertEquals(1000L, field.roundFloor(1000L)); 
 }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
public void test_roundCeiling_long514() {__CLR4_4_1lhglhgle6np4u4.R.globalSliceStart(getClass().getName(),27859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6dee8lhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhglhgle6np4u4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhglhgle6np4u4.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long514",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6dee8lhv(){try{__CLR4_4_1lhglhgle6np4u4.R.inc(27859); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27860);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27861);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27862);assertEquals(0L, field.roundCeiling(499L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27863);assertEquals(1000L, field.roundCeiling(500L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27864);assertEquals(1000L, field.roundCeiling(501L)); 
     __CLR4_4_1lhglhgle6np4u4.R.inc(27865);assertEquals(1000L, field.roundCeiling(1000L)); 
 }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

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
    static class MockOffsetDateTimeField extends OffsetDateTimeField {
        protected MockOffsetDateTimeField() {
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1lhglhgle6np4u4.R.inc(27867);try{__CLR4_4_1lhglhgle6np4u4.R.inc(27866);
        }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1lhglhgle6np4u4.R.inc(27869);try{__CLR4_4_1lhglhgle6np4u4.R.inc(27868);
        }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27870);
            __CLR4_4_1lhglhgle6np4u4.R.inc(27871);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1lhglhgle6np4u4.R.inc(27872);
            __CLR4_4_1lhglhgle6np4u4.R.inc(27873);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1lhglhgle6np4u4.R.flushNeeded();}}
    }

}

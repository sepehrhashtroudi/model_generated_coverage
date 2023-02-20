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
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1ln8ln8le6nl8p2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28052);
        __CLR4_4_1ln8ln8le6nl8p2.R.inc(28053);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28054);
        __CLR4_4_1ln8ln8le6nl8p2.R.inc(28055);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1ln8ln8le6nl8p2.R.inc(28057);try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28056);
    }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28058);
    }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28059);
    }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_roundHalfCeiling_long512() {__CLR4_4_1ln8ln8le6nl8p2.R.globalSliceStart(getClass().getName(),28060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5k8fplng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ln8ln8le6nl8p2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ln8ln8le6nl8p2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long512",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5k8fplng(){try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28060); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28061);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28062);assertEquals(-1000L, field.roundHalfCeiling(-1001L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28063);assertEquals(-1000L, field.roundHalfCeiling(-1000L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28064);assertEquals(0L, field.roundHalfCeiling(-999L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28065);assertEquals(0L, field.roundHalfCeiling(-1L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28066);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28067);assertEquals(1000L, field.roundHalfCeiling(1L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28068);assertEquals(1000L, field.roundHalfCeiling(499L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28069);assertEquals(1000L, field.roundHalfCeiling(500L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28070);assertEquals(1000L, field.roundHalfCeiling(501L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28071);assertEquals(1000L, field.roundHalfCeiling(1000L)); 
 }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
public void test_roundHalfEven_long513() {__CLR4_4_1ln8ln8le6nl8p2.R.globalSliceStart(getClass().getName(),28072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mj4zn3lns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ln8ln8le6nl8p2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ln8ln8le6nl8p2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long513",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mj4zn3lns(){try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28072); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28073);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28074);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28075);assertEquals(0L, field.roundHalfEven(499L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28076);assertEquals(0L, field.roundHalfEven(500L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28077);assertEquals(1000L, field.roundHalfEven(501L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28078);assertEquals(1000L, field.roundHalfEven(1000L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28079);assertEquals(1000L, field.roundHalfEven(1499L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28080);assertEquals(2000L, field.roundHalfEven(1500L)); 
     __CLR4_4_1ln8ln8le6nl8p2.R.inc(28081);assertEquals(2000L, field.roundHalfEven(1501L)); 
 }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

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
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1ln8ln8le6nl8p2.R.inc(28083);try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28082);
        }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1ln8ln8le6nl8p2.R.inc(28085);try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28084);
        }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28086);
            __CLR4_4_1ln8ln8le6nl8p2.R.inc(28087);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1ln8ln8le6nl8p2.R.inc(28088);
            __CLR4_4_1ln8ln8le6nl8p2.R.inc(28089);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1ln8ln8le6nl8p2.R.flushNeeded();}}
    }

}

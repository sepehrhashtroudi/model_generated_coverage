/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2007 Stephen Colebourne
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
package org.joda.time.chrono;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

/**
 *
 * @author Brian S O'Neill
 * @author Blair Martin
 */
public class TestLenientChronology extends TestCase {static class __CLR4_4_1qcmqcmle6qsffp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,34174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34150);
        __CLR4_4_1qcmqcmle6qsffp.R.inc(34151);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34152);
        __CLR4_4_1qcmqcmle6qsffp.R.inc(34153);return new TestSuite(TestLenientChronology.class);
    }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}}

    public TestLenientChronology(String name) {
        super(name);__CLR4_4_1qcmqcmle6qsffp.R.inc(34155);try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34154);
    }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34156);
    }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34157);
    }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_setHourOfDay295() {__CLR4_4_1qcmqcmle6qsffp.R.globalSliceStart(getClass().getName(),34158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lhtk1jqcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qcmqcmle6qsffp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qcmqcmle6qsffp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setHourOfDay295",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lhtk1jqcu(){try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34158); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34159);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34160);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34161);assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34162);dt = dt.withHourOfDay(24); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34163);assertEquals("2007-01-02T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34164);dt = dt.withHourOfDay(-1); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34165);assertEquals("2007-01-01T23:00:00.000Z", dt.toString()); 
 }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}} 


public void test_setDayOfMonth381() {__CLR4_4_1qcmqcmle6qsffp.R.globalSliceStart(getClass().getName(),34166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glg0b3qd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qcmqcmle6qsffp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qcmqcmle6qsffp.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestLenientChronology.test_setDayOfMonth381",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glg0b3qd2(){try{__CLR4_4_1qcmqcmle6qsffp.R.inc(34166); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34167);Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34168);DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34169);assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34170);dt = dt.withDayOfMonth(32); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34171);assertEquals("2007-02-01T00:00:00.000Z", dt.toString()); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34172);dt = dt.withDayOfMonth(0); 
     __CLR4_4_1qcmqcmle6qsffp.R.inc(34173);assertEquals("2007-01-31T00:00:00.000Z", dt.toString()); 
 }finally{__CLR4_4_1qcmqcmle6qsffp.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug ------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1755161] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    

    

    

}

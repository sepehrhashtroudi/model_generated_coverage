/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
import org.joda.time.LocalDate;

/**
 * Test.
 */
public class TestGJDate extends TestCase {static class __CLR4_4_1ri7ri7lc8axeq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,35672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35647);
        __CLR4_4_1ri7ri7lc8axeq2.R.inc(35648);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35649);
        __CLR4_4_1ri7ri7lc8axeq2.R.inc(35650);return new TestSuite(TestGJDate.class);
    }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}}

    public TestGJDate(String name) {
        super(name);__CLR4_4_1ri7ri7lc8axeq2.R.inc(35652);try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35651);
    }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35653);
    }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35654);
    }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static final Chronology GJ_CHRONOLOGY = GJChronology.getInstanceUTC();

    //-----------------------------------------------------------------------

public void test_plusYears_positiveToZero_crossCutover153() {__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceStart(getClass().getName(),35655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bdyk3rif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ri7ri7lc8axeq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_positiveToZero_crossCutover153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bdyk3rif(){try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35655); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35656);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35657);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35658);assertEquals(expected, date.plusYears(-2003)); 
 }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}} 


public void test_plusYears_negativeToPositive680() {__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceStart(getClass().getName(),35659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bc1flwrij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ri7ri7lc8axeq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusYears_negativeToPositive680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bc1flwrij(){try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35659); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35660);LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35661);LocalDate expected = new LocalDate(2, 6, 30, GJ_CHRONOLOGY); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35662);assertEquals(expected, date.plusYears(4)); 
 }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}} 


public void test_plusWeekyears_positiveToZero_crossCutover1289() {__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceStart(getClass().getName(),35663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebb5aarin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ri7ri7lc8axeq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_plusWeekyears_positiveToZero_crossCutover1289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebb5aarin(){try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35663); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35664);LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35665);LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek()); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35666);assertEquals(expected, date.weekyear().addToCopy(-2003)); 
 }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}} 


public void test_cutoverPreZero1689() {__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceStart(getClass().getName(),35667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juxlzlrir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ri7ri7lc8axeq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ri7ri7lc8axeq2.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJDate.test_cutoverPreZero1689",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juxlzlrir(){try{__CLR4_4_1ri7ri7lc8axeq2.R.inc(35667); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35668);DateTime cutover = new LocalDate(-2, 6, 30, ISOChronology.getInstanceUTC()).toDateTimeAtStartOfDay(DateTimeZone.UTC); 
     __CLR4_4_1ri7ri7lc8axeq2.R.inc(35669);try { 
         __CLR4_4_1ri7ri7lc8axeq2.R.inc(35670);GJChronology.getInstance(DateTimeZone.UTC, cutover); 
         __CLR4_4_1ri7ri7lc8axeq2.R.inc(35671);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ri7ri7lc8axeq2.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}

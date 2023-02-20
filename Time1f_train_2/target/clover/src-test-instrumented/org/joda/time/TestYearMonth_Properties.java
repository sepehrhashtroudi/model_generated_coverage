/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_1p8vp8vle6qsfcv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32719);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32720);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32721);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32722);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_1p8vp8vle6qsfcv.R.inc(32724);try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32723);
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32725);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32726);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32727);zone = DateTimeZone.getDefault();
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32728);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32729);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32730);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32731);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32732);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32733);DateTimeZone.setDefault(zone);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32734);zone = null;
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32735);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32736);systemDefaultLocale = null;
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertySetTextYear339() {__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceStart(getClass().getName(),32737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqebd1p9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p8vp8vle6qsfcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqebd1p9d(){try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32737); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32738);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32739);YearMonth copy = test.year().setCopy("12"); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32740);check(test, 1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32741);check(copy, 12, 6); 
 }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeLenient343() {__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceStart(getClass().getName(),32742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi8g65p9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p8vp8vle6qsfcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient343",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi8g65p9i(){try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32742); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32743);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32744);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32745);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32746);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32747);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32748);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32749);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32750);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32751);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}} 


public void testPropertyAddMonth344() {__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceStart(getClass().getName(),32752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwrbo4p9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p8vp8vle6qsfcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwrbo4p9s(){try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32752); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32753);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32754);YearMonth copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32755);check(test, 1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32756);check(copy, 1972, 12); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32757);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32758);check(copy, 1973, 1); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32759);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32760);check(copy, 1972, 1); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32761);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32762);check(copy, 1971, 12); 
 }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonth345() {__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceStart(getClass().getName(),32763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdcjdbpa3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p8vp8vle6qsfcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdcjdbpa3(){try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32763); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32764);YearMonth test = new YearMonth(1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32765);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32766);check(test, 1972, 6); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32767);check(copy, 1972, 10); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32768);copy = test.monthOfYear().addWrapFieldToCopy(8); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32769);check(copy, 1972, 2); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32770);copy = test.monthOfYear().addWrapFieldToCopy(-8); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32771);check(copy, 1972, 10); 
 }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}} 


public void testPropertyEquals404() {__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceStart(getClass().getName(),32772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av9is9pac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p8vp8vle6qsfcv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p8vp8vle6qsfcv.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av9is9pac(){try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32772); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32773);YearMonth test1 = new YearMonth(11, 11); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32774);YearMonth test2 = new YearMonth(11, 12); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32775);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC()); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32776);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32777);assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32778);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32779);assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32780);assertEquals(false, test1.year().equals(test1.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32781);assertEquals(true, test1.year().equals(test1.year())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32782);assertEquals(false, test1.year().equals(test2.monthOfYear())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32783);assertEquals(true, test1.year().equals(test2.year())); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32784);assertEquals(false, test1.monthOfYear().equals(null)); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32785);assertEquals(false, test1.monthOfYear().equals("any")); 
     __CLR4_4_1p8vp8vle6qsfcv.R.inc(32786);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear())); 
 }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}} 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p8vp8vle6qsfcv.R.inc(32787);
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32788);assertEquals(year, test.getYear());
        __CLR4_4_1p8vp8vle6qsfcv.R.inc(32789);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p8vp8vle6qsfcv.R.flushNeeded();}}
}

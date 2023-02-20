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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {static class __CLR4_4_1q3aq3ale6qeae1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33814);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33815);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33816);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33817);return new TestSuite(TestGregorianChronology.class);
    }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}}

    public TestGregorianChronology(String name) {
        super(name);__CLR4_4_1q3aq3ale6qeae1.R.inc(33819);try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33818);
    }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33820);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33821);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33822);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33823);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33824);originalLocale = Locale.getDefault();
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33825);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33826);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33827);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33828);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33829);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33830);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33831);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33832);Locale.setDefault(originalLocale);
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33833);originalDateTimeZone = null;
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33834);originalTimeZone = null;
        __CLR4_4_1q3aq3ale6qeae1.R.inc(33835);originalLocale = null;
    }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testEquality909() {__CLR4_4_1q3aq3ale6qeae1.R.globalSliceStart(getClass().getName(),33836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah471fq3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q3aq3ale6qeae1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q3aq3ale6qeae1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality909",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah471fq3w(){try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33836); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33837);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33838);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33839);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33840);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33841);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}} 


public void testFactory_Zone910() {__CLR4_4_1q3aq3ale6qeae1.R.globalSliceStart(getClass().getName(),33842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlxnskq42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q3aq3ale6qeae1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q3aq3ale6qeae1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone910",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlxnskq42(){try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33842); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33843);assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33844);assertEquals(PARIS, GregorianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33845);assertEquals(LONDON, GregorianChronology.getInstance(null).getZone()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33846);assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}} 


public void testFactory_Zone_int911() {__CLR4_4_1q3aq3ale6qeae1.R.globalSliceStart(getClass().getName(),33847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p6utfq47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q3aq3ale6qeae1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q3aq3ale6qeae1.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone_int911",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p6utfq47(){try{__CLR4_4_1q3aq3ale6qeae1.R.inc(33847); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33848);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33849);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33850);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33851);try { 
         __CLR4_4_1q3aq3ale6qeae1.R.inc(33852);GregorianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1q3aq3ale6qeae1.R.inc(33853);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1q3aq3ale6qeae1.R.inc(33854);try { 
         __CLR4_4_1q3aq3ale6qeae1.R.inc(33855);GregorianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1q3aq3ale6qeae1.R.inc(33856);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q3aq3ale6qeae1.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}

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
public class TestGregorianChronology extends TestCase {static class __CLR4_4_1ko0ko0le6ndpwy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26784);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26785);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26786);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26787);return new TestSuite(TestGregorianChronology.class);
    }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}

    public TestGregorianChronology(String name) {
        super(name);__CLR4_4_1ko0ko0le6ndpwy.R.inc(26789);try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26788);
    }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26790);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26791);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26792);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26793);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26794);originalLocale = Locale.getDefault();
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26795);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26796);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26797);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26798);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26799);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26800);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26801);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26802);Locale.setDefault(originalLocale);
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26803);originalDateTimeZone = null;
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26804);originalTimeZone = null;
        __CLR4_4_1ko0ko0le6ndpwy.R.inc(26805);originalLocale = null;
    }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToString334() {__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceStart(getClass().getName(),26806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m95kzkom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ko0ko0le6ndpwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m95kzkom(){try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26806); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26807);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26808);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26809);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26810);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26811);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26812);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26813);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26814);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26815);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26816);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26817);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26818);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26819);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26820);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}
public void testToString335() {__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceStart(getClass().getName(),26821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mqt7ikp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ko0ko0le6ndpwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mqt7ikp1(){try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26821); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26822);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26823);ISOChronology isoParis = ISOChronology.getInstance(paris); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26824);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26825);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26826);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26827);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26828);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26829);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26830);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26831);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26832);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26833);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26834);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit,mdfw=2]", LimitChronology.getInstance(isoParis, null, null).toString()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26835);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString()); 
 }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}
public void testEquality435() {__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceStart(getClass().getName(),26836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bm1rlkpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ko0ko0le6ndpwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bm1rlkpg(){try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26836); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26837);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26838);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26839);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26840);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26841);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}
public void testFactory_Zone_int436() {__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceStart(getClass().getName(),26842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mo6kbkpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ko0ko0le6ndpwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone_int436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mo6kbkpm(){try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26842); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26843);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26844);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26845);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26846);try { 
         __CLR4_4_1ko0ko0le6ndpwy.R.inc(26847);GregorianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1ko0ko0le6ndpwy.R.inc(26848);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26849);try { 
         __CLR4_4_1ko0ko0le6ndpwy.R.inc(26850);GregorianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1ko0ko0le6ndpwy.R.inc(26851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}
public void testWithZone437() {__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceStart(getClass().getName(),26852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwfdd1kpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ko0ko0le6ndpwy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ko0ko0le6ndpwy.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithZone437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwfdd1kpw(){try{__CLR4_4_1ko0ko0le6ndpwy.R.inc(26852); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26853);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26854);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26855);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26856);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26857);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1ko0ko0le6ndpwy.R.inc(26858);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1ko0ko0le6ndpwy.R.flushNeeded();}}
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}

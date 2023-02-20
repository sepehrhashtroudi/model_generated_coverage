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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {static class __CLR4_4_1j3lj3lle6o79yk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24753);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24754);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24755);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24756);return new TestSuite(TestMutablePeriod_Constructors.class);
    }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}

    public TestMutablePeriod_Constructors(String name) {
        super(name);__CLR4_4_1j3lj3lle6o79yk.R.inc(24758);try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24757);
    }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24759);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24760);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24761);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24762);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24763);originalLocale = Locale.getDefault();
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24764);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24765);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24766);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24767);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24768);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24769);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24770);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24771);Locale.setDefault(originalLocale);
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24772);originalDateTimeZone = null;
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24773);originalTimeZone = null;
        __CLR4_4_1j3lj3lle6o79yk.R.inc(24774);originalLocale = null;
    }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSetYears473() {__CLR4_4_1j3lj3lle6o79yk.R.globalSliceStart(getClass().getName(),24775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpqtchj47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3lj3lle6o79yk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3lj3lle6o79yk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testSetYears473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpqtchj47(){try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24775); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24776);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24777);test.setYears(10); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24778);assertEquals(10, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24779);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24780);test.setYears(-10); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24781);assertEquals(-10, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24782);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24783);test.setYears(0); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24784);assertEquals(0, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24785);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24786);test.setYears(1); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24787);assertEquals(1, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24788);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24789);try { 
         __CLR4_4_1j3lj3lle6o79yk.R.inc(24790);test.setYears(1); 
         __CLR4_4_1j3lj3lle6o79yk.R.inc(24791);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}
public void testConstructor_long_Chronology2474() throws Throwable {__CLR4_4_1j3lj3lle6o79yk.R.globalSliceStart(getClass().getName(),24792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zpywaj4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3lj3lle6o79yk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3lj3lle6o79yk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_Chronology2474",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zpywaj4o() throws Throwable{try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24792); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24793);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24794);MutablePeriod test = new MutablePeriod(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24795);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24796);assertEquals(0, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24797);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24798);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24799);assertEquals(4, test.getDays()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24800);assertEquals(5, test.getHours()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24801);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24802);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24803);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}
public void testConstructor_long_long_PeriodType2475() throws Throwable {__CLR4_4_1j3lj3lle6o79yk.R.globalSliceStart(getClass().getName(),24804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uw3qc9j50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3lj3lle6o79yk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3lj3lle6o79yk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType2475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uw3qc9j50() throws Throwable{try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24804); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24805);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24806);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24807);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24808);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24809);assertEquals(0, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24810);assertEquals(0, test.getMonths()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24811);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24812);assertEquals(31, test.getDays()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24813);assertEquals(1, test.getHours()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24814);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24815);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24816);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}
public void testConstructor_long_long_PeriodType_Chronology2476() throws Throwable {__CLR4_4_1j3lj3lle6o79yk.R.globalSliceStart(getClass().getName(),24817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb128dj5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3lj3lle6o79yk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3lj3lle6o79yk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Constructors.testConstructor_long_long_PeriodType_Chronology2476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb128dj5d() throws Throwable{try{__CLR4_4_1j3lj3lle6o79yk.R.inc(24817); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24818);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24819);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24820);MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), CopticChronology.getInstance()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24821);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24822);assertEquals(1, test.getYears()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24823);assertEquals(1, test.getMonths()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24824);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24825);assertEquals(1, test.getDays()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24826);assertEquals(1, test.getHours()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24827);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24828);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1j3lj3lle6o79yk.R.inc(24829);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1j3lj3lle6o79yk.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

}

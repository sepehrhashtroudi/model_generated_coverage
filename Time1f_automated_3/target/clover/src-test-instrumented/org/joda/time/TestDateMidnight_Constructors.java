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
package org.joda.time;

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1h06h06le6np4b3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1h06h06le6np4b3.R.inc(22038);
        __CLR4_4_1h06h06le6np4b3.R.inc(22039);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h06h06le6np4b3.R.inc(22040);
        __CLR4_4_1h06h06le6np4b3.R.inc(22041);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1h06h06le6np4b3.R.inc(22043);try{__CLR4_4_1h06h06le6np4b3.R.inc(22042);
    }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h06h06le6np4b3.R.inc(22044);
        __CLR4_4_1h06h06le6np4b3.R.inc(22045);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h06h06le6np4b3.R.inc(22046);zone = DateTimeZone.getDefault();
        __CLR4_4_1h06h06le6np4b3.R.inc(22047);locale = Locale.getDefault();
        __CLR4_4_1h06h06le6np4b3.R.inc(22048);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h06h06le6np4b3.R.inc(22049);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h06h06le6np4b3.R.inc(22050);
        __CLR4_4_1h06h06le6np4b3.R.inc(22051);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h06h06le6np4b3.R.inc(22052);DateTimeZone.setDefault(zone);
        __CLR4_4_1h06h06le6np4b3.R.inc(22053);Locale.setDefault(locale);
        __CLR4_4_1h06h06le6np4b3.R.inc(22054);zone = null;
    }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_now_nullChronology615() throws Throwable {__CLR4_4_1h06h06le6np4b3.R.globalSliceStart(getClass().getName(),22055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kbfir8h0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h06h06le6np4b3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h06h06le6np4b3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kbfir8h0n() throws Throwable{try{__CLR4_4_1h06h06le6np4b3.R.inc(22055); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22056);try { 
         __CLR4_4_1h06h06le6np4b3.R.inc(22057);DateMidnight.now((Chronology) null); 
         __CLR4_4_1h06h06le6np4b3.R.inc(22058);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}
public void testConstructor_nullObject622() throws Throwable {__CLR4_4_1h06h06le6np4b3.R.globalSliceStart(getClass().getName(),22059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152l45ch0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h06h06le6np4b3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h06h06le6np4b3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152l45ch0r() throws Throwable{try{__CLR4_4_1h06h06le6np4b3.R.inc(22059); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22060);DateMidnight test = new DateMidnight((Object) null); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22061);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22062);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}
public void testPropertySetTextMonthOfYear623() {__CLR4_4_1h06h06le6np4b3.R.globalSliceStart(getClass().getName(),22063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yhmc2h0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h06h06le6np4b3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h06h06le6np4b3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testPropertySetTextMonthOfYear623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yhmc2h0v(){try{__CLR4_4_1h06h06le6np4b3.R.inc(22063); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22064);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22065);DateMidnight copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22066);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22067);assertEquals(8, copy.getMonthOfYear()); 
     __CLR4_4_1h06h06le6np4b3.R.inc(22068);assertEquals(9, copy.getDayOfMonth()); 
 }finally{__CLR4_4_1h06h06le6np4b3.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    

    /**
     * Test now (DateTimeZone)
     */
    

    /**
     * Test now (DateTimeZone=null)
     */
    

    /**
     * Test now (Chronology)
     */
    

    /**
     * Test now (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}

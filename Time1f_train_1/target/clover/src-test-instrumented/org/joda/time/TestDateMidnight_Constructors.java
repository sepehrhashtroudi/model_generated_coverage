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
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1h7xh7xle6qe96v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,22392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22317);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22318);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22319);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22320);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1h7xh7xle6qe96v.R.inc(22322);try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22321);
    }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22323);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22324);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22325);zone = DateTimeZone.getDefault();
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22326);locale = Locale.getDefault();
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22327);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22328);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22329);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22330);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22331);DateTimeZone.setDefault(zone);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22332);Locale.setDefault(locale);
        __CLR4_4_1h7xh7xle6qe96v.R.inc(22333);zone = null;
    }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_DateTimeZone913() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn8tssh8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_DateTimeZone913",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn8tssh8e() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22334); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22335);DateMidnight test = new DateMidnight(PARIS); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22336);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22337);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1100() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxt6p0h8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxt6p0h8i() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22338); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22339);try { 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22340);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22341);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22342);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22343);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     } finally { 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22344);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void test_now1431() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbas4xh8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbas4xh8p() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22345); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22346);DateMidnight test = DateMidnight.now(); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22347);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22348);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22349);assertEquals(2002, test.getYear()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22350);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22351);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void test_now_nullDateTimeZone1432() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j1iabh8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone1432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j1iabh8w() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22352); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22353);try { 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22354);DateMidnight.now((DateTimeZone) null); 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22355);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void test_now_DateTimeZone1433() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wr7yavh90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone1433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wr7yavh90() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22356); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22357);DateMidnight test = DateMidnight.now(PARIS); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22358);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22359);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void test_now_Chronology1434() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yl6pzth94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology1434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yl6pzth94() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22360); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22361);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22362);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22363);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void test_now_nullChronology1435() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4lme7h98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology1435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4lme7h98() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22364); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22365);try { 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22366);DateMidnight.now((Chronology) null); 
         __CLR4_4_1h7xh7xle6qe96v.R.inc(22367);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1437() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lipsb1h9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullDateTimeZone1437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lipsb1h9c() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22368); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22369);DateMidnight test = new DateMidnight((DateTimeZone) null); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22370);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22371);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_nullChronology1438() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1fvhhh9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullChronology1438",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1fvhhh9g() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22372); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22373);DateMidnight test = new DateMidnight((Chronology) null); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22374);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22375);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_nullObject1439() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgw7ozh9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject1439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgw7ozh9k() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22376); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22377);DateMidnight test = new DateMidnight((Object) null); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22378);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22379);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1440() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1228nbmh9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology1440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1228nbmh9o() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22380); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22381);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22382);DateMidnight test = new DateMidnight(date, (Chronology) null); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22383);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22384);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullDateTimeZone1441() throws Throwable {__CLR4_4_1h7xh7xle6qe96v.R.globalSliceStart(getClass().getName(),22385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r91x5wh9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h7xh7xle6qe96v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h7xh7xle6qe96v.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone1441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r91x5wh9t() throws Throwable{try{__CLR4_4_1h7xh7xle6qe96v.R.inc(22385); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22386);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22387);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22388);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22389);assertEquals(2002, test.getYear()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22390);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1h7xh7xle6qe96v.R.inc(22391);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1h7xh7xle6qe96v.R.flushNeeded();}} 

    

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

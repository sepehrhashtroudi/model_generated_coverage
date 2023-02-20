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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1lyblyble6qe9to{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,28655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lyblyble6qe9to.R.inc(28451);
        __CLR4_4_1lyblyble6qe9to.R.inc(28452);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28453);
        __CLR4_4_1lyblyble6qe9to.R.inc(28454);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1lyblyble6qe9to.R.inc(28456);try{__CLR4_4_1lyblyble6qe9to.R.inc(28455);
    }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lyblyble6qe9to.R.inc(28457);
        __CLR4_4_1lyblyble6qe9to.R.inc(28458);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lyblyble6qe9to.R.inc(28459);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lyblyble6qe9to.R.inc(28460);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lyblyble6qe9to.R.inc(28461);originalLocale = Locale.getDefault();
        __CLR4_4_1lyblyble6qe9to.R.inc(28462);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lyblyble6qe9to.R.inc(28463);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lyblyble6qe9to.R.inc(28464);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lyblyble6qe9to.R.inc(28465);
        __CLR4_4_1lyblyble6qe9to.R.inc(28466);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lyblyble6qe9to.R.inc(28467);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lyblyble6qe9to.R.inc(28468);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lyblyble6qe9to.R.inc(28469);Locale.setDefault(originalLocale);
        __CLR4_4_1lyblyble6qe9to.R.inc(28470);originalDateTimeZone = null;
        __CLR4_4_1lyblyble6qe9to.R.inc(28471);originalTimeZone = null;
        __CLR4_4_1lyblyble6qe9to.R.inc(28472);originalLocale = null;
    }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods523() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wlw4xlyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGetMethods523",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wlw4xlyx(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28473); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28474);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28475);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28476);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28477);assertEquals(TEST_TIME_NOW, test.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28478);assertEquals(1, test.getEra()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28479);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28480);assertEquals(2, test.getYearOfCentury()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28481);assertEquals(2002, test.getYearOfEra()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28482);assertEquals(2002, test.getYear()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28483);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28484);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28485);assertEquals(2002, test.getWeekyear()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28486);assertEquals(23, test.getWeekOfWeekyear()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28487);assertEquals(7, test.getDayOfWeek()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28488);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28489);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28490);assertEquals(0, test.getMinuteOfHour()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28491);assertEquals(60, test.getMinuteOfDay()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28492);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28493);assertEquals(60 * 60, test.getSecondOfDay()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28494);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28495);assertEquals(60 * 60 * 1000, test.getMillisOfDay()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testToGregorianCalendar526() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok6xu1lzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToGregorianCalendar526",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok6xu1lzk(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28496); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28497);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28498);GregorianCalendar result = test.toGregorianCalendar(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28499);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28500);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28501);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28502);result = test.toGregorianCalendar(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28503);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28504);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testToString_String527() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evule7lzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String527",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evule7lzt(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28505); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28506);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28507);assertEquals("2002 01", test.toString("yyyy HH")); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28508);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null)); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testRounding8951() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nk21kmlzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8951",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nk21kmlzx(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28509); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28510);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28511);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28512);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28513);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28514);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28515);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28516);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28517);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28518);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28519);test.setRounding(null, -1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28520);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28521);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28522);test.setRounding(ISOChronology.getInstance().hourOfDay()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28523);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28524);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28525);test.setRounding(null); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28526);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28527);assertEquals(null, test.getRoundingField()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone1015() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uzozq0m0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone1015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uzozq0m0g(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28528); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28529);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28530);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28531);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28532);assertEquals(test.getChronology(), result.getChronology()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28533);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28534);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28535);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28536);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28537);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28538);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28539);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28540);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28541);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28542);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28543);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28544);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28545);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28546);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28547);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28548);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28549);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28550);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testRounding71017() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12klootm13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding71017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12klootm13(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28551); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28552);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28553);try { 
         __CLR4_4_1lyblyble6qe9to.R.inc(28554);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1); 
         __CLR4_4_1lyblyble6qe9to.R.inc(28555);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testRounding41018() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9dz45m18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding41018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9dz45m18(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28556); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28557);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28558);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28559);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28560);assertEquals(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28561);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28562);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28563);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28564);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testRounding31019() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oddvutm1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding31019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oddvutm1h(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28565); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28566);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28567);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28568);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28569);assertEquals(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28570);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28571);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28572);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28573);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testRounding51020() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176ixd9m1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding51020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176ixd9m1q(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28574); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28575);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28576);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28577);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28578);assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28579);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28580);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28581);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28582);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28583);test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28584);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28585);assertEquals("2002-06-09T04:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testProperty1054() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12eso18m22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12eso18m22(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28586); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28587);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28588);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28589);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28590);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28591);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28592);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28593); 
             __CLR4_4_1lyblyble6qe9to.R.inc(28594);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28595); 
             __CLR4_4_1lyblyble6qe9to.R.inc(28596);return null; 
         }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lyblyble6qe9to.R.inc(28597); 
             __CLR4_4_1lyblyble6qe9to.R.inc(28598);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lyblyble6qe9to.R.inc(28599);try { 
         __CLR4_4_1lyblyble6qe9to.R.inc(28600);test.property(bad); 
         __CLR4_4_1lyblyble6qe9to.R.inc(28601);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lyblyble6qe9to.R.inc(28602);try { 
         __CLR4_4_1lyblyble6qe9to.R.inc(28603);test.property(null); 
         __CLR4_4_1lyblyble6qe9to.R.inc(28604);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testCopy1068() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ko8x69m2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCopy1068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ko8x69m2l(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28605); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28606);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28607);MutableDateTime result = test.copy(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28608);assertEquals(true, test.equals(result)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28609);assertEquals(true, test != result); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testClone1069() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jsg1gm2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jsg1gm2q(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28610); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28611);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28612);MutableDateTime result = (MutableDateTime) test.clone(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28613);assertEquals(true, test.equals(result)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28614);assertEquals(true, test != result); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testToDateTime1405() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqcnpzm2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime1405",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqcnpzm2v(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28615); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28616);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28617);DateTime result = test.toDateTime(); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28618);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28619);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 


public void testCompareTo1408() {__CLR4_4_1lyblyble6qe9to.R.globalSliceStart(getClass().getName(),28620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6789sm30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lyblyble6qe9to.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lyblyble6qe9to.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCompareTo1408",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6789sm30(){try{__CLR4_4_1lyblyble6qe9to.R.inc(28620); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28621);MutableDateTime test1 = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28622);MutableDateTime test1a = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28623);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28624);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28625);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28626);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28627);MutableDateTime test2 = new MutableDateTime(TEST_TIME2); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28628);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28629);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28630);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28631);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28632);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28633);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28634);assertEquals(+1, test2.compareTo(new MockInstant())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28635);assertEquals(0, test1.compareTo(new MockInstant())); 
     __CLR4_4_1lyblyble6qe9to.R.inc(28636);try { 
         __CLR4_4_1lyblyble6qe9to.R.inc(28637);test1.compareTo(null); 
         __CLR4_4_1lyblyble6qe9to.R.inc(28638);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28639);
            __CLR4_4_1lyblyble6qe9to.R.inc(28640);return null;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28641);
            __CLR4_4_1lyblyble6qe9to.R.inc(28642);return TEST_TIME1;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28643);
            __CLR4_4_1lyblyble6qe9to.R.inc(28644);return ISOChronology.getInstance();
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1lyblyble6qe9to.R.inc(28645);
            __CLR4_4_1lyblyble6qe9to.R.inc(28646);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28647);
            __CLR4_4_1lyblyble6qe9to.R.inc(28648);return null;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28649);
            __CLR4_4_1lyblyble6qe9to.R.inc(28650);return this;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1lyblyble6qe9to.R.inc(28651);
            __CLR4_4_1lyblyble6qe9to.R.inc(28652);return this;
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1lyblyble6qe9to.R.inc(28653);
            __CLR4_4_1lyblyble6qe9to.R.inc(28654);return "";
        }finally{__CLR4_4_1lyblyble6qe9to.R.flushNeeded();}}
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}

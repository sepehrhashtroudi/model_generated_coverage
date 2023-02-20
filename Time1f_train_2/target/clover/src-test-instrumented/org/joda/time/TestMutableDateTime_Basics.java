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
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1lx7lx7le6qsf2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,28617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28411);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28412);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28413);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28414);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1lx7lx7le6qsf2y.R.inc(28416);try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28415);
    }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28417);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28418);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28419);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28420);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28421);originalLocale = Locale.getDefault();
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28422);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28423);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28424);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28425);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28426);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28427);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28428);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28429);Locale.setDefault(originalLocale);
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28430);originalDateTimeZone = null;
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28431);originalTimeZone = null;
        __CLR4_4_1lx7lx7le6qsf2y.R.inc(28432);originalLocale = null;
    }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetMethods503() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11oscr5lxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGetMethods503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11oscr5lxt(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28433); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28434);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28435);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28436);assertEquals(LONDON, test.getZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28437);assertEquals(TEST_TIME_NOW, test.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28438);assertEquals(1, test.getEra()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28439);assertEquals(20, test.getCenturyOfEra()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28440);assertEquals(2, test.getYearOfCentury()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28441);assertEquals(2002, test.getYearOfEra()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28442);assertEquals(2002, test.getYear()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28443);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28444);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28445);assertEquals(2002, test.getWeekyear()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28446);assertEquals(23, test.getWeekOfWeekyear()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28447);assertEquals(7, test.getDayOfWeek()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28448);assertEquals(160, test.getDayOfYear()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28449);assertEquals(1, test.getHourOfDay()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28450);assertEquals(0, test.getMinuteOfHour()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28451);assertEquals(60, test.getMinuteOfDay()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28452);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28453);assertEquals(60 * 60, test.getSecondOfDay()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28454);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28455);assertEquals(60 * 60 * 1000, test.getMillisOfDay()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testToGregorianCalendar506() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yviv91lyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToGregorianCalendar506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yviv91lyg(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28456); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28457);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28458);GregorianCalendar result = test.toGregorianCalendar(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28459);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28460);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28461);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28462);result = test.toGregorianCalendar(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28463);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28464);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testToString_String507() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qh8ua9lyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String507",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qh8ua9lyp(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28465); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28466);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28467);assertEquals("2002 01", test.toString("yyyy HH")); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28468);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null)); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testToString_String_String508() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13msweelyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String_String508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13msweelyt(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28469); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28470);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28471);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28472);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28473);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28474);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28475);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testRounding8936() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ac19tlz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8936",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ac19tlz0(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28476); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28477);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28478);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28479);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28480);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28481);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28482);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28483);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28484);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28485);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28486);test.setRounding(null, -1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28487);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28488);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28489);test.setRounding(ISOChronology.getInstance().hourOfDay()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28490);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28491);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28492);test.setRounding(null); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28493);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28494);assertEquals(null, test.getRoundingField()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone1006() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkk4i2lzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone1006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkk4i2lzj(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28495); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28496);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28497);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28498);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28499);assertEquals(test.getChronology(), result.getChronology()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28500);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28501);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28502);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28503);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28504);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28505);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28506);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28507);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28508);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28509);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28510);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28511);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28512);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28513);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28514);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28515);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28516);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28517);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testRounding71011() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxe421m06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding71011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxe421m06(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28518); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28519);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28520);try { 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28521);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1); 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28522);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testRounding41012() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9qa45m0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding41012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9qa45m0b(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28523); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28524);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28525);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28526);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28527);assertEquals(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28528);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28529);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28530);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28531);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testRounding31013() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5qddhm0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding31013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5qddhm0k(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28532); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28533);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28534);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28535);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28536);assertEquals(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28537);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28538);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28539);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28540);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testRounding51014() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwdyqwm0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding51014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwdyqwm0t(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28541); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28542);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28543);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28544);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28545);assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28546);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28547);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28548);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28549);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28550);test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28551);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28552);assertEquals("2002-06-09T04:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testProperty1050() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1al774om15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty1050",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1al774om15(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28553); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28554);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28555);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28556);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28557);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28558);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28559);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28560); 
             __CLR4_4_1lx7lx7le6qsf2y.R.inc(28561);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28562); 
             __CLR4_4_1lx7lx7le6qsf2y.R.inc(28563);return null; 
         }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28564); 
             __CLR4_4_1lx7lx7le6qsf2y.R.inc(28565);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28566);try { 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28567);test.property(bad); 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28568);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28569);try { 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28570);test.property(null); 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28571);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testClone1060() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kp792tm1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone1060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kp792tm1o(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28572); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28573);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28574);MutableDateTime result = (MutableDateTime) test.clone(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28575);assertEquals(true, test.equals(result)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28576);assertEquals(true, test != result); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testToDateTime1394() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yharwm1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime1394",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yharwm1t(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28577); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28578);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28579);DateTime result = test.toDateTime(); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28580);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28581);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 


public void testCompareTo1399() {__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceStart(getClass().getName(),28582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vg2nmxm1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx7lx7le6qsf2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx7lx7le6qsf2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCompareTo1399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vg2nmxm1y(){try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28582); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28583);MutableDateTime test1 = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28584);MutableDateTime test1a = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28585);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28586);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28587);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28588);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28589);MutableDateTime test2 = new MutableDateTime(TEST_TIME2); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28590);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28591);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28592);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28593);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28594);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28595);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28596);assertEquals(+1, test2.compareTo(new MockInstant())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28597);assertEquals(0, test1.compareTo(new MockInstant())); 
     __CLR4_4_1lx7lx7le6qsf2y.R.inc(28598);try { 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28599);test1.compareTo(null); 
         __CLR4_4_1lx7lx7le6qsf2y.R.inc(28600);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28601);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28602);return null;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28603);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28604);return TEST_TIME1;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28605);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28606);return ISOChronology.getInstance();
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28607);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28608);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28609);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28610);return null;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28611);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28612);return this;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28613);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28614);return this;
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1lx7lx7le6qsf2y.R.inc(28615);
            __CLR4_4_1lx7lx7le6qsf2y.R.inc(28616);return "";
        }finally{__CLR4_4_1lx7lx7le6qsf2y.R.flushNeeded();}}
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}

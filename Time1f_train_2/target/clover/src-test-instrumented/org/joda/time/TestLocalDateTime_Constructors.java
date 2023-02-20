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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1kazkazle6qsexs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,26437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1kazkazle6qsexs.R.inc(26315);
        __CLR4_4_1kazkazle6qsexs.R.inc(26316);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kazkazle6qsexs.R.inc(26317);
        __CLR4_4_1kazkazle6qsexs.R.inc(26318);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1kazkazle6qsexs.R.inc(26320);try{__CLR4_4_1kazkazle6qsexs.R.inc(26319);
    }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kazkazle6qsexs.R.inc(26321);
        __CLR4_4_1kazkazle6qsexs.R.inc(26322);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kazkazle6qsexs.R.inc(26323);zone = DateTimeZone.getDefault();
        __CLR4_4_1kazkazle6qsexs.R.inc(26324);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kazkazle6qsexs.R.inc(26325);
        __CLR4_4_1kazkazle6qsexs.R.inc(26326);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kazkazle6qsexs.R.inc(26327);DateTimeZone.setDefault(zone);
        __CLR4_4_1kazkazle6qsexs.R.inc(26328);zone = null;
    }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_ObjectLocalDate697() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oucsegkbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDate697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oucsegkbd() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26329); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26330);LocalDate date = new LocalDate(1970, 5, 6); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26331);try { 
         __CLR4_4_1kazkazle6qsexs.R.inc(26332);new LocalDateTime(date); 
         __CLR4_4_1kazkazle6qsexs.R.inc(26333);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_ObjectLocalDateTime1228() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xct68ukbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xct68ukbi() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26334); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26335);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26336);LocalDateTime test = new LocalDateTime(dt); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26337);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26338);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26339);assertEquals(5, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26340);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26341);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26342);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26343);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26344);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor1272() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137xcolkbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137xcolkbt() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26345); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26346);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26347);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26348);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26349);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26350);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26351);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26352);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26353);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26354);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26355);assertEquals(test, LocalDateTime.now()); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1273() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7yt1ekc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone1273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7yt1ekc4() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26356); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26357);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26358);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26359);LocalDateTime test = new LocalDateTime(LONDON); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26360);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26361);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26362);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26363);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26364);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26365);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26366);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26367);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26368);assertEquals(test, LocalDateTime.now(LONDON)); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26369);test = new LocalDateTime(PARIS); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26370);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26371);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26372);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26373);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26374);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26375);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26376);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26377);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26378);assertEquals(test, LocalDateTime.now(PARIS)); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_Chronology1274() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbvqt0kcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology1274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbvqt0kcr() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26379); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26380);LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26381);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26382);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26383);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26384);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26385);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26386);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26387);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26388);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26389);assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testParse_noFormatter1275() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9hkr5kd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter1275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9hkr5kd2() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26390); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26391);assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20")); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26392);assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432")); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testFactory_fromCalendarFields_null1276() throws Exception {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahq2tkd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_null1276",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahq2tkd5() throws Exception{try{__CLR4_4_1kazkazle6qsexs.R.inc(26393); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26394);try { 
         __CLR4_4_1kazkazle6qsexs.R.inc(26395);LocalDateTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1kazkazle6qsexs.R.inc(26396);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testFactory_fromDateFields_before19701277() throws Exception {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133jkmpkd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before19701277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133jkmpkd9() throws Exception{try{__CLR4_4_1kazkazle6qsexs.R.inc(26397); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26398);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26399);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26400);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26401);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testFactory_fromDateFields_after19701278() throws Exception {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s91m0vkde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_after19701278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s91m0vkde() throws Exception{try{__CLR4_4_1kazkazle6qsexs.R.inc(26402); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26403);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26404);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26405);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26406);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1279() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxsys1kdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone1279",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxsys1kdj() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26407); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26408);LocalDateTime test = new LocalDateTime((DateTimeZone) null); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26409);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26410);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26411);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26412);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26413);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26414);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26415);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26416);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone1281() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13arrq3kdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone1281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13arrq3kdt() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26417); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26418);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26419);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26420);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26421);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26422);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26423);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26424);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26425);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26426);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 


public void testConstructor_nullObject1283() throws Throwable {__CLR4_4_1kazkazle6qsexs.R.globalSliceStart(getClass().getName(),26427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s647y8ke3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kazkazle6qsexs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kazkazle6qsexs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject1283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s647y8ke3() throws Throwable{try{__CLR4_4_1kazkazle6qsexs.R.inc(26427); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26428);LocalDateTime test = new LocalDateTime((Object) null); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26429);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26430);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26431);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26432);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26433);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26434);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26435);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kazkazle6qsexs.R.inc(26436);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kazkazle6qsexs.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

}

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
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1kdakdale6qe9m5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,26530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kdakdale6qe9m5.R.inc(26398);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26399);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kdakdale6qe9m5.R.inc(26400);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26401);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1kdakdale6qe9m5.R.inc(26403);try{__CLR4_4_1kdakdale6qe9m5.R.inc(26402);
    }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kdakdale6qe9m5.R.inc(26404);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26405);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26406);zone = DateTimeZone.getDefault();
        __CLR4_4_1kdakdale6qe9m5.R.inc(26407);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kdakdale6qe9m5.R.inc(26408);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26409);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kdakdale6qe9m5.R.inc(26410);DateTimeZone.setDefault(zone);
        __CLR4_4_1kdakdale6qe9m5.R.inc(26411);zone = null;
    }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_ObjectLocalDate714() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ndlxakdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDate714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ndlxakdo() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26412); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26413);LocalDate date = new LocalDate(1970, 5, 6); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26414);try { 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26415);new LocalDateTime(date); 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26416);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_ObjectLocalDateTime1234() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kyfucnkdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime1234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kyfucnkdt() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26417); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26418);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26419);LocalDateTime test = new LocalDateTime(dt); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26420);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26421);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26422);assertEquals(5, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26423);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26424);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26425);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26426);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26427);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor1281() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8xl2hke4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor1281",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8xl2hke4() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26428); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26429);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26430);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26431);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26432);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26433);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26434);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26435);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26436);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26437);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26438);assertEquals(test, LocalDateTime.now()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1282() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecab6okef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone1282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecab6okef() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26439); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26440);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26441);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26442);LocalDateTime test = new LocalDateTime(LONDON); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26443);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26444);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26445);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26446);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26447);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26448);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26449);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26450);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26451);assertEquals(test, LocalDateTime.now(LONDON)); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26452);test = new LocalDateTime(PARIS); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26453);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26454);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26455);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26456);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26457);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26458);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26459);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26460);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26461);assertEquals(test, LocalDateTime.now(PARIS)); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testFactory_fromCalendarFields_null1283() throws Exception {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9cq8xkf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields_null1283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9cq8xkf2() throws Exception{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26462); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26463);try { 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26464);LocalDateTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26465);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testFactory_fromDateFields_before19701284() throws Exception {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvbfjfkf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before19701284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvbfjfkf6() throws Exception{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26466); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26467);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26468);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26469);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26470);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testFactory_fromDateFields_null1285() throws Exception {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ck0xfkfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_null1285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ck0xfkfb() throws Exception{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26471); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26472);try { 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26473);LocalDateTime.fromDateFields((Date) null); 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26474);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1286() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyxylxkff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone1286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyxylxkff() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26475); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26476);LocalDateTime test = new LocalDateTime((DateTimeZone) null); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26477);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26478);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26479);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26480);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26481);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26482);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26483);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26484);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone1288() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1rj9ekfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone1288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1rj9ekfp() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26485); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26486);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26487);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26488);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26489);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26490);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26491);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26492);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26493);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26494);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_nullObject1290() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18797s4kfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject1290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18797s4kfz() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26495); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26496);LocalDateTime test = new LocalDateTime((Object) null); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26497);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26498);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26499);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26500);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26501);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26502);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26503);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26504);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_Object_nullDateTimeZone1291() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17os0w9kg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Object_nullDateTimeZone1291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17os0w9kg9() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26505); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26506);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26507);LocalDateTime test = new LocalDateTime(date, (DateTimeZone) null); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26508);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26509);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26510);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26511);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26512);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26513);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26514);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26515);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_ObjectStringEx61292() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcpdtvkgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx61292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcpdtvkgk() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26516); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26517);try { 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26518);new LocalDateTime("10:20:30.040+14:00"); 
         __CLR4_4_1kdakdale6qe9m5.R.inc(26519);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int1293() throws Throwable {__CLR4_4_1kdakdale6qe9m5.R.globalSliceStart(getClass().getName(),26520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11anj7ukgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdakdale6qe9m5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdakdale6qe9m5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int1293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11anj7ukgo() throws Throwable{try{__CLR4_4_1kdakdale6qe9m5.R.inc(26520); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26521);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26522);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26523);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26524);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26525);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26526);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26527);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26528);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kdakdale6qe9m5.R.inc(26529);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kdakdale6qe9m5.R.flushNeeded();}} 

    

    

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

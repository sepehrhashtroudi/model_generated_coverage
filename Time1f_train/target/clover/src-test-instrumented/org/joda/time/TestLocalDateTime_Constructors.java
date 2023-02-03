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
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1kxvkxvlc8axdye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,27275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27139);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27140);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27141);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27142);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1kxvkxvlc8axdye.R.inc(27144);try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27143);
    }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27145);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27146);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27147);zone = DateTimeZone.getDefault();
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27148);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27149);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27150);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27151);DateTimeZone.setDefault(zone);
        __CLR4_4_1kxvkxvlc8axdye.R.inc(27152);zone = null;
    }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_nullDateTimeZone647() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vt06m3ky9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullDateTimeZone647",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vt06m3ky9() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27153); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27154);LocalDateTime test = new LocalDateTime((DateTimeZone) null); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27155);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27156);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27157);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27158);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27159);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27160);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27161);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27162);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testParse_noFormatter769() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nn39mkyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter769",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nn39mkyj() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27163); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27164);assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20")); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27165);assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432")); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor823() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfe8h4kym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor823",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfe8h4kym() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27166); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27167);LocalDateTime test = new LocalDateTime(); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27168);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27169);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27170);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27171);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27172);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27173);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27174);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27175);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27176);assertEquals(test, LocalDateTime.now()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testFactory_fromDateFields_before1970827() throws Exception {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1377btvkyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before1970827",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1377btvkyx() throws Exception{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27177); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27178);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27179);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27180);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27181);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_ObjectStringEx6906() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lojdpmkz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectStringEx6906",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lojdpmkz2() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27182); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27183);try { 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27184);new LocalDateTime("10:20:30.040+14:00"); 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27185);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_nullObject1011() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pc2xodkz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject1011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pc2xodkz6() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27186); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27187);LocalDateTime test = new LocalDateTime((Object) null); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27188);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27189);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27190);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27191);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27192);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27193);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27194);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27195);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_long_nullDateTimeZone1077() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ndycgkzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_long_nullDateTimeZone1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ndycgkzg() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27196); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27197);LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27198);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27199);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27200);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27201);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27202);assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27203);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27204);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27205);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_ObjectLocalDateTime1190() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fcanikzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDateTime1190",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fcanikzq() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27206); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27207);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27208);LocalDateTime test = new LocalDateTime(dt); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27209);assertEquals(BUDDHIST_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27210);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27211);assertEquals(5, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27212);assertEquals(6, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27213);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27214);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27215);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27216);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1223() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nowe9zl01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_DateTimeZone1223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nowe9zl01() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27217); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27218);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27219);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27220);LocalDateTime test = new LocalDateTime(LONDON); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27221);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27222);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27223);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27224);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27225);assertEquals(23, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27226);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27227);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27228);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27229);assertEquals(test, LocalDateTime.now(LONDON)); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27230);test = new LocalDateTime(PARIS); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27231);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27232);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27233);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27234);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27235);assertEquals(0, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27236);assertEquals(59, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27237);assertEquals(0, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27238);assertEquals(0, test.getMillisOfSecond()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27239);assertEquals(test, LocalDateTime.now(PARIS)); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_Chronology1284() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezdemll0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology1284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezdemll0o() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27240); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27241);LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27242);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27243);assertEquals(1970, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27244);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27245);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27246);assertEquals(10 + OFFSET_PARIS, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27247);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27248);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27249);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27250);assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_int_int_int_int_int_int1404() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxo7aul0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_int_int_int_int_int_int1404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxo7aul0z() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27251); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27252);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27253);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27254);assertEquals(2005, test.getYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27255);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27256);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27257);assertEquals(10, test.getHourOfDay()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27258);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27259);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27260);assertEquals(0, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testFactory_fromDateFields_after19701531() throws Exception {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1maa9ofl19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_after19701531",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1maa9ofl19() throws Exception{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27261); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27262);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27263);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27264);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27265);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testConstructor_ObjectLocalDate1728() throws Throwable {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o284eil1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_ObjectLocalDate1728",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o284eil1e() throws Throwable{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27266); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27267);LocalDate date = new LocalDate(1970, 5, 6); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27268);try { 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27269);new LocalDateTime(date); 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27270);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 


public void testFactory_fromDateFields_null1768() throws Exception {__CLR4_4_1kxvkxvlc8axdye.R.globalSliceStart(getClass().getName(),27271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0opvhl1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kxvkxvlc8axdye.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kxvkxvlc8axdye.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_null1768",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0opvhl1j() throws Exception{try{__CLR4_4_1kxvkxvlc8axdye.R.inc(27271); 
     __CLR4_4_1kxvkxvlc8axdye.R.inc(27272);try { 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27273);LocalDateTime.fromDateFields((Date) null); 
         __CLR4_4_1kxvkxvlc8axdye.R.inc(27274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1kxvkxvlc8axdye.R.flushNeeded();}} 

    

    

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

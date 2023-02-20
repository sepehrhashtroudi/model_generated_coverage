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
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1idcidcle6ndpk4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1idcidcle6ndpk4.R.inc(23808);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23809);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1idcidcle6ndpk4.R.inc(23810);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23811);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1idcidcle6ndpk4.R.inc(23813);try{__CLR4_4_1idcidcle6ndpk4.R.inc(23812);
    }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1idcidcle6ndpk4.R.inc(23814);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23815);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23816);zone = DateTimeZone.getDefault();
        __CLR4_4_1idcidcle6ndpk4.R.inc(23817);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1idcidcle6ndpk4.R.inc(23818);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23819);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1idcidcle6ndpk4.R.inc(23820);DateTimeZone.setDefault(zone);
        __CLR4_4_1idcidcle6ndpk4.R.inc(23821);zone = null;
    }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_Chronology641() throws Throwable {__CLR4_4_1idcidcle6ndpk4.R.globalSliceStart(getClass().getName(),23822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haybxxidq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1idcidcle6ndpk4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1idcidcle6ndpk4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_Chronology641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haybxxidq() throws Throwable{try{__CLR4_4_1idcidcle6ndpk4.R.inc(23822); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23823);LocalDateTime test = new LocalDateTime(GregorianChronology.getInstance()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23824);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23825);assertEquals(1970, test.getYear()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23826);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23827);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23828);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23829);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23830);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23831);assertEquals(40, test.getMillisOfSecond()); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23832);assertEquals(test, LocalDateTime.now(GregorianChronology.getInstance())); 
 }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}
public void testParse_noFormatter642() throws Throwable {__CLR4_4_1idcidcle6ndpk4.R.globalSliceStart(getClass().getName(),23833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eodx1sie1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1idcidcle6ndpk4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1idcidcle6ndpk4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testParse_noFormatter642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eodx1sie1() throws Throwable{try{__CLR4_4_1idcidcle6ndpk4.R.inc(23833); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23834);assertEquals(new LocalDateTime(2010, 6, 30, 10, 20, 30, 40), LocalDateTime.parse("2010-06-30T10:20:30Z")); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23835);assertEquals(new LocalDateTime(2010, 1, 2, 10, 20, 30, 40), LocalDateTime.parse("2010-002T10:20:30Z")); 
 }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}
public void testFactory_fromDateFields_before1970644() throws Exception {__CLR4_4_1idcidcle6ndpk4.R.globalSliceStart(getClass().getName(),23836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9w3d6ie4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1idcidcle6ndpk4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1idcidcle6ndpk4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromDateFields_before1970644",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9w3d6ie4() throws Exception{try{__CLR4_4_1idcidcle6ndpk4.R.inc(23836); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23837);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23838);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23839);LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1idcidcle6ndpk4.R.inc(23840);assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1idcidcle6ndpk4.R.flushNeeded();}}
    

    

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

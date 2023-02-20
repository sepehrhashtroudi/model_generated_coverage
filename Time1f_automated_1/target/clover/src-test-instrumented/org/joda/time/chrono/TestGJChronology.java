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

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_1kliklile6ndpwj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,26776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1kliklile6ndpwj.R.inc(26694);
        __CLR4_4_1kliklile6ndpwj.R.inc(26695);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kliklile6ndpwj.R.inc(26696);
        __CLR4_4_1kliklile6ndpwj.R.inc(26697);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1kliklile6ndpwj.R.inc(26699);try{__CLR4_4_1kliklile6ndpwj.R.inc(26698);
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kliklile6ndpwj.R.inc(26700);
        __CLR4_4_1kliklile6ndpwj.R.inc(26701);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kliklile6ndpwj.R.inc(26702);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kliklile6ndpwj.R.inc(26703);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kliklile6ndpwj.R.inc(26704);originalLocale = Locale.getDefault();
        __CLR4_4_1kliklile6ndpwj.R.inc(26705);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kliklile6ndpwj.R.inc(26706);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kliklile6ndpwj.R.inc(26707);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kliklile6ndpwj.R.inc(26708);
        __CLR4_4_1kliklile6ndpwj.R.inc(26709);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kliklile6ndpwj.R.inc(26710);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kliklile6ndpwj.R.inc(26711);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kliklile6ndpwj.R.inc(26712);Locale.setDefault(originalLocale);
        __CLR4_4_1kliklile6ndpwj.R.inc(26713);originalDateTimeZone = null;
        __CLR4_4_1kliklile6ndpwj.R.inc(26714);originalTimeZone = null;
        __CLR4_4_1kliklile6ndpwj.R.inc(26715);originalLocale = null;
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testSubtractDays31() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p9j5ukm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testSubtractDays31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p9j5ukm4(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26716); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26717);DateTime dt = new DateTime(1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin"))); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26718);YearMonthDay ymd = dt.toYearMonthDay(); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26719);while ((((ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY)&&(__CLR4_4_1kliklile6ndpwj.R.iget(26720)!=0|true))||(__CLR4_4_1kliklile6ndpwj.R.iget(26721)==0&false))) {{ 
         __CLR4_4_1kliklile6ndpwj.R.inc(26722);ymd = ymd.minus(Period.days(1)); 
     } 
 }}finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
public void testLeapYearRulesConstruction32() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb9ct3kmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testLeapYearRulesConstruction32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb9ct3kmb(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26723); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26724);DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26725);assertEquals(dt.getYear(), 1500); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26726);assertEquals(dt.getMonthOfYear(), 2); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26727);assertEquals(dt.getDayOfMonth(), 29); 
 }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
public void testMaximumValue36() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzxy43kmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMaximumValue36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzxy43kmg(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26728); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26729);DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26730);while ((((dt.getYear() < 1590)&&(__CLR4_4_1kliklile6ndpwj.R.iget(26731)!=0|true))||(__CLR4_4_1kliklile6ndpwj.R.iget(26732)==0&false))) {{ 
         __CLR4_4_1kliklile6ndpwj.R.inc(26733);dt = dt.plusDays(1); 
         __CLR4_4_1kliklile6ndpwj.R.inc(26734);YearMonthDay ymd = dt.toYearMonthDay(); 
         __CLR4_4_1kliklile6ndpwj.R.inc(26735);assertEquals(dt.year().getMaximumValue(), ymd.year().getMaximumValue()); 
         __CLR4_4_1kliklile6ndpwj.R.inc(26736);assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue()); 
         __CLR4_4_1kliklile6ndpwj.R.inc(26737);assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue()); 
     } 
 }}finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
public void testPlusHours_int565() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wmms8kmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPlusHours_int565",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wmms8kmq(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26738); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26739);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26740);TimeOfDay result = test.plusHours(1); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26741);TimeOfDay expected = new TimeOfDay(2, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26742);assertEquals(expected, result); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26743);result = test.plusHours(0); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26744);assertSame(test, result); 
 }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
public void testPlusMinutes_int566() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yvf0vtkmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testPlusMinutes_int566",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yvf0vtkmx(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26745); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26746);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26747);TimeOfDay result = test.plusMinutes(1); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26748);TimeOfDay expected = new TimeOfDay(1, 3, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26749);assertEquals(expected, result); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26750);result = test.plusMinutes(0); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26751);assertSame(test, result); 
 }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
public void testMinusHours_int567() {__CLR4_4_1kliklile6ndpwj.R.globalSliceStart(getClass().getName(),26752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hpufwkn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kliklile6ndpwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kliklile6ndpwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testMinusHours_int567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hpufwkn4(){try{__CLR4_4_1kliklile6ndpwj.R.inc(26752); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26753);TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26754);TimeOfDay result = test.minusHours(1); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26755);TimeOfDay expected = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26756);assertEquals(expected, result); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26757);result = test.minusHours(0); 
     __CLR4_4_1kliklile6ndpwj.R.inc(26758);assertSame(test, result); 
 }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1kliklile6ndpwj.R.inc(26759);
        __CLR4_4_1kliklile6ndpwj.R.inc(26760);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1kliklile6ndpwj.R.inc(26761);
        __CLR4_4_1kliklile6ndpwj.R.inc(26762);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kliklile6ndpwj.R.inc(26763);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kliklile6ndpwj.R.inc(26764);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1kliklile6ndpwj.R.inc(26765);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1kliklile6ndpwj.R.inc(26766);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1kliklile6ndpwj.R.inc(26767);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1kliklile6ndpwj.R.inc(26768);assertEquals(amt, diff);
        
        __CLR4_4_1kliklile6ndpwj.R.inc(26769);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1kliklile6ndpwj.R.iget(26770)!=0|true))||(__CLR4_4_1kliklile6ndpwj.R.iget(26771)==0&false))) {{
            __CLR4_4_1kliklile6ndpwj.R.inc(26772);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1kliklile6ndpwj.R.inc(26773);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1kliklile6ndpwj.R.inc(26774);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1kliklile6ndpwj.R.inc(26775);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1kliklile6ndpwj.R.flushNeeded();}}

    

    

    

    

    

}

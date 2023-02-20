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
public class TestGJChronology extends TestCase {static class __CLR4_4_1k84k84le6o7a4p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,26286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26212);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26213);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26214);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26215);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1k84k84le6o7a4p.R.inc(26217);try{__CLR4_4_1k84k84le6o7a4p.R.inc(26216);
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26218);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26219);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26220);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1k84k84le6o7a4p.R.inc(26221);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1k84k84le6o7a4p.R.inc(26222);originalLocale = Locale.getDefault();
        __CLR4_4_1k84k84le6o7a4p.R.inc(26223);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26224);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1k84k84le6o7a4p.R.inc(26225);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26226);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26227);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k84k84le6o7a4p.R.inc(26228);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26229);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26230);Locale.setDefault(originalLocale);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26231);originalDateTimeZone = null;
        __CLR4_4_1k84k84le6o7a4p.R.inc(26232);originalTimeZone = null;
        __CLR4_4_1k84k84le6o7a4p.R.inc(26233);originalLocale = null;
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testIllegalDates49() {__CLR4_4_1k84k84le6o7a4p.R.globalSliceStart(getClass().getName(),26234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbggr7k8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k84k84le6o7a4p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k84k84le6o7a4p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testIllegalDates49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbggr7k8q(){try{__CLR4_4_1k84k84le6o7a4p.R.inc(26234); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26235);try { 
         __CLR4_4_1k84k84le6o7a4p.R.inc(26236);new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1k84k84le6o7a4p.R.inc(26237);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26238);try { 
         __CLR4_4_1k84k84le6o7a4p.R.inc(26239);new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC)); 
         __CLR4_4_1k84k84le6o7a4p.R.inc(26240);fail("Constructed illegal date"); 
     } catch (IllegalArgumentException e) { 
     } 
 }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}
public void testCutoverAddWeeks52() {__CLR4_4_1k84k84le6o7a4p.R.globalSliceStart(getClass().getName(),26241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8xbvek8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k84k84le6o7a4p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k84k84le6o7a4p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddWeeks52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8xbvek8x(){try{__CLR4_4_1k84k84le6o7a4p.R.inc(26241); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26242);testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26243);testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26244);testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26245);testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1"); 
 }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}
public void testTimeOfDayAdd53() {__CLR4_4_1k84k84le6o7a4p.R.globalSliceStart(getClass().getName(),26246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xta94wk92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k84k84le6o7a4p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k84k84le6o7a4p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testTimeOfDayAdd53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xta94wk92(){try{__CLR4_4_1k84k84le6o7a4p.R.inc(26246); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26247);TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance()); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26248);TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance()); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26249);assertEquals(end, start.plusHours(22)); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26250);assertEquals(start, end.minusHours(22)); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26251);assertEquals(end, start.plusMinutes(22 * 60)); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26252);assertEquals(start, end.minusMinutes(22 * 60)); 
 }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}
public void testCutoverAddYears55() {__CLR4_4_1k84k84le6o7a4p.R.globalSliceStart(getClass().getName(),26253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsm80k99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k84k84le6o7a4p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k84k84le6o7a4p.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGJChronology.testCutoverAddYears55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsm80k99(){try{__CLR4_4_1k84k84le6o7a4p.R.inc(26253); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26254);testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26255);testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26256);testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26257);testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26258);testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26259);testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26260);testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26261);testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26262);testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26263);testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26264);testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26265);testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26266);testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26267);testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     __CLR4_4_1k84k84le6o7a4p.R.inc(26268);testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26269);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26270);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1k84k84le6o7a4p.R.inc(26271);
        __CLR4_4_1k84k84le6o7a4p.R.inc(26272);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k84k84le6o7a4p.R.inc(26273);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k84k84le6o7a4p.R.inc(26274);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1k84k84le6o7a4p.R.inc(26275);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1k84k84le6o7a4p.R.inc(26276);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1k84k84le6o7a4p.R.inc(26277);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1k84k84le6o7a4p.R.inc(26278);assertEquals(amt, diff);
        
        __CLR4_4_1k84k84le6o7a4p.R.inc(26279);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1k84k84le6o7a4p.R.iget(26280)!=0|true))||(__CLR4_4_1k84k84le6o7a4p.R.iget(26281)==0&false))) {{
            __CLR4_4_1k84k84le6o7a4p.R.inc(26282);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1k84k84le6o7a4p.R.inc(26283);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1k84k84le6o7a4p.R.inc(26284);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1k84k84le6o7a4p.R.inc(26285);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1k84k84le6o7a4p.R.flushNeeded();}}

    

    

    

    

    

}

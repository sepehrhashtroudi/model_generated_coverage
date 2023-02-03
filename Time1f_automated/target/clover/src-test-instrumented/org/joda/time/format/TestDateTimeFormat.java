/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1kcdkcdlccieu1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,26464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

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

    public static void main(String[] args) {try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26365);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26366);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26367);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26368);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1kcdkcdlccieu1q.R.inc(26370);try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26369);
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26371);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26372);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26373);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26374);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26375);originalLocale = Locale.getDefault();
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26376);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26377);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26378);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26379);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26380);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26381);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26382);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26383);Locale.setDefault(originalLocale);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26384);originalDateTimeZone = null;
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26385);originalTimeZone = null;
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26386);originalLocale = null;
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testToString_String_Locale61() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wstufkcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testToString_String_Locale61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wstufkcz(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26387); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26388);DateTime test = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26389);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26390);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26391);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26392);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26393);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testFormat_clockhourOfHalfday92() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g0216kd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_clockhourOfHalfday92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g0216kd6(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26394); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26395);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26396);DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26397);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26398);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26399);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26400);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26401);assertEquals(dt.toString(), "7", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26402);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26403);assertEquals(dt.toString(), "0", f.print(dt)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testFormat_yearOfEra277() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olmydtkdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_yearOfEra277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olmydtkdg(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26404); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26405);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26406);DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26407);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26408);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26409);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26410);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26411);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26412);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26413);assertEquals(dt.toString(), "124", f.print(dt)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testPropertyGetEra307() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hn6pvokdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testPropertyGetEra307",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hn6pvokdq(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26414); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26415);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26416);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26417);assertEquals("era", test.era().getName()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26418);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26419);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26420);assertEquals(1, test.era().get()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26421);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26422);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26423);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26424);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26425);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26426);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26427);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26428);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26429);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26430);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26431);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26432);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26433);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26434);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26435);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault309() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15iznstkec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_textMonthAtEnd_France_withSpecifiedDefault309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15iznstkec(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26436); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26437);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26438);String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26439);assertEquals("23 juin", str); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26440);DateTime date = dateFormatter.parseDateTime(str); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26441);check(date, 1980, 6, 23); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testFormat_dayOfWeekText314() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2idofkei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfWeekText314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2idofkei(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26442); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26443);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26444);DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26445);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26446);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26447);assertEquals(dt.toString(), "3", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26448);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26449);assertEquals(dt.toString(), "3", f.print(dt)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
public void testFormat_monthOfYearText317() {__CLR4_4_1kcdkcdlccieu1q.R.globalSliceStart(getClass().getName(),26450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xg5c51keq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kcdkcdlccieu1q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kcdkcdlccieu1q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_monthOfYearText317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xg5c51keq(){try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26450); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26451);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26452);DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26453);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26454);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26455);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26456);dt = dt.withZone(TOKYO); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26457);assertEquals(dt.toString(), "Jun", f.print(dt)); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26458);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1kcdkcdlccieu1q.R.inc(26459);assertEquals(dt.toString(), "juin", f.print(dt)); 
 }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}
    

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
    
// Defects4J: flaky method
//     public void testFormat_zoneText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "UTC", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "EDT", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "JST", f.print(dt));
//     }

    
// Defects4J: flaky method
//     public void testFormat_zoneLongText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
//     }

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1kcdkcdlccieu1q.R.inc(26460);
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26461);assertEquals(hour, test.getYear());
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26462);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1kcdkcdlccieu1q.R.inc(26463);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1kcdkcdlccieu1q.R.flushNeeded();}}

}

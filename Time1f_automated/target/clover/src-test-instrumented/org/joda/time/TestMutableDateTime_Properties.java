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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1i22i22lccietqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23544,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1i22i22lccietqj.R.inc(23402);
        __CLR4_4_1i22i22lccietqj.R.inc(23403);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i22i22lccietqj.R.inc(23404);
        __CLR4_4_1i22i22lccietqj.R.inc(23405);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1i22i22lccietqj.R.inc(23407);try{__CLR4_4_1i22i22lccietqj.R.inc(23406);
    }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i22i22lccietqj.R.inc(23408);
        __CLR4_4_1i22i22lccietqj.R.inc(23409);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i22i22lccietqj.R.inc(23410);zone = DateTimeZone.getDefault();
        __CLR4_4_1i22i22lccietqj.R.inc(23411);locale = Locale.getDefault();
        __CLR4_4_1i22i22lccietqj.R.inc(23412);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i22i22lccietqj.R.inc(23413);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i22i22lccietqj.R.inc(23414);
        __CLR4_4_1i22i22lccietqj.R.inc(23415);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i22i22lccietqj.R.inc(23416);DateTimeZone.setDefault(zone);
        __CLR4_4_1i22i22lccietqj.R.inc(23417);Locale.setDefault(locale);
        __CLR4_4_1i22i22lccietqj.R.inc(23418);zone = null;
    }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAdd_RInterval139() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116s3o7i2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testAdd_RInterval139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116s3o7i2j(){try{__CLR4_4_1i22i22lccietqj.R.inc(23419); 
     __CLR4_4_1i22i22lccietqj.R.inc(23420);MutablePeriod test = new MutablePeriod(100L); 
     __CLR4_4_1i22i22lccietqj.R.inc(23421);test.add(new Interval(100L, 200L)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23422);assertEquals(0, test.getYears()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23423);assertEquals(0, test.getMonths()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23424);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23425);assertEquals(0, test.getDays()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23426);assertEquals(0, test.getHours()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23427);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23428);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23429);assertEquals(200, test.getMillis()); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertySetMonthOfYear246() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ffs76i2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetMonthOfYear246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ffs76i2u(){try{__CLR4_4_1i22i22lccietqj.R.inc(23430); 
     __CLR4_4_1i22i22lccietqj.R.inc(23431);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23432);test.monthOfYear().set(12); 
     __CLR4_4_1i22i22lccietqj.R.inc(23433);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23434);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23435);test.monthOfYear().set(2); 
     __CLR4_4_1i22i22lccietqj.R.inc(23436);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23437);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23438);test.monthOfYear().set(3); 
     __CLR4_4_1i22i22lccietqj.R.inc(23439);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertyGetEra247() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbzj6fi34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra247",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbzj6fi34(){try{__CLR4_4_1i22i22lccietqj.R.inc(23440); 
     __CLR4_4_1i22i22lccietqj.R.inc(23441);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23442);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23443);assertEquals("era", test.era().getName()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23444);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23445);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23446);assertEquals(1, test.era().get()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23447);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23448);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23449);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23450);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23451);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23452);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23453);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23454);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23455);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23456);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths248() throws Throwable {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17my8l4i3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths248",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17my8l4i3l() throws Throwable{try{__CLR4_4_1i22i22lccietqj.R.inc(23457); 
     __CLR4_4_1i22i22lccietqj.R.inc(23458);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1i22i22lccietqj.R.inc(23459);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1i22i22lccietqj.R.inc(23460);Period test = new Period(dt1, dt2); 
     __CLR4_4_1i22i22lccietqj.R.inc(23461);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23462);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testSetDate_int_int_int1249() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hwtzazi3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testSetDate_int_int_int1249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hwtzazi3r(){try{__CLR4_4_1i22i22lccietqj.R.inc(23463); 
     __CLR4_4_1i22i22lccietqj.R.inc(23464);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1i22i22lccietqj.R.inc(23465);test.setDate(2010, 12, 3); 
     __CLR4_4_1i22i22lccietqj.R.inc(23466);assertEquals(2010, test.getYear()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23467);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23468);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23469);assertEquals(12, test.getHourOfDay()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23470);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23471);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23472);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertyGetHourOfDay250() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8agcei41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetHourOfDay250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8agcei41(){try{__CLR4_4_1i22i22lccietqj.R.inc(23473); 
     __CLR4_4_1i22i22lccietqj.R.inc(23474);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1i22i22lccietqj.R.inc(23475);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23476);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23477);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23478);assertEquals(23, test.hourOfDay().get()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23479);assertEquals("23", test.hourOfDay().getAsText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23480);assertEquals("23", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23481);assertEquals("23", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23482);assertEquals("23", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23483);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23484);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23485);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23486);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertyGetMonthOfYear251() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1x780i4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMonthOfYear251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1x780i4f(){try{__CLR4_4_1i22i22lccietqj.R.inc(23487); 
     __CLR4_4_1i22i22lccietqj.R.inc(23488);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23489);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23490);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23491);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23492);assertSame(test, test.monthOfYear().getMutableDateTime()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23493);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23494);assertEquals("6", test.monthOfYear().getAsText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23495);assertEquals("June", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23496);assertEquals("June", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23497);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23498);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23499);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23500);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23501);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23502);test = new MutableDateTime(2004, 7, 9, 0, 0, 0, 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23503);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23504);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testSetTime_int_int_int2253() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15e5a32i4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testSetTime_int_int_int2253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15e5a32i4x(){try{__CLR4_4_1i22i22lccietqj.R.inc(23505); 
     __CLR4_4_1i22i22lccietqj.R.inc(23506);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1i22i22lccietqj.R.inc(23507);try { 
         __CLR4_4_1i22i22lccietqj.R.inc(23508);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1i22i22lccietqj.R.inc(23509);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i22i22lccietqj.R.inc(23510);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertyCompareToDay254() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abd0gli53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyCompareToDay254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abd0gli53(){try{__CLR4_4_1i22i22lccietqj.R.inc(23511); 
     __CLR4_4_1i22i22lccietqj.R.inc(23512);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1i22i22lccietqj.R.inc(23513);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1i22i22lccietqj.R.inc(23514);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23515);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23516);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23517);try { 
         __CLR4_4_1i22i22lccietqj.R.inc(23518);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1i22i22lccietqj.R.inc(23519);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i22i22lccietqj.R.inc(23520);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i22i22lccietqj.R.inc(23521);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i22i22lccietqj.R.inc(23522);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23523);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23524);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1i22i22lccietqj.R.inc(23525);try { 
         __CLR4_4_1i22i22lccietqj.R.inc(23526);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1i22i22lccietqj.R.inc(23527);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
public void testPropertyGetHourOfDay255() {__CLR4_4_1i22i22lccietqj.R.globalSliceStart(getClass().getName(),23528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zame1i5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i22i22lccietqj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i22i22lccietqj.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetHourOfDay255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zame1i5k(){try{__CLR4_4_1i22i22lccietqj.R.inc(23528); 
     __CLR4_4_1i22i22lccietqj.R.inc(23529);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1i22i22lccietqj.R.inc(23530);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23531);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23532);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23533);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23534);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23535);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23536);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23537);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23538);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23539);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23540);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23541);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1i22i22lccietqj.R.inc(23542);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1i22i22lccietqj.R.inc(23543);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1i22i22lccietqj.R.flushNeeded();}}
    

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
    

    

    

    

    

    

    

    

    

}

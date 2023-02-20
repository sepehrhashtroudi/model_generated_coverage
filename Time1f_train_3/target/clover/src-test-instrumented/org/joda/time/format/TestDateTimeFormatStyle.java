/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1swvswvle6rcn0w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,37602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1swvswvle6rcn0w.R.inc(37471);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37472);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1swvswvle6rcn0w.R.inc(37473);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37474);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1swvswvle6rcn0w.R.inc(37476);try{__CLR4_4_1swvswvle6rcn0w.R.inc(37475);
    }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1swvswvle6rcn0w.R.inc(37477);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37478);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37479);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1swvswvle6rcn0w.R.inc(37480);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1swvswvle6rcn0w.R.inc(37481);originalLocale = Locale.getDefault();
        __CLR4_4_1swvswvle6rcn0w.R.inc(37482);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37483);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1swvswvle6rcn0w.R.inc(37484);Locale.setDefault(UK);
    }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1swvswvle6rcn0w.R.inc(37485);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37486);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1swvswvle6rcn0w.R.inc(37487);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37488);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37489);Locale.setDefault(originalLocale);
        __CLR4_4_1swvswvle6rcn0w.R.inc(37490);originalDateTimeZone = null;
        __CLR4_4_1swvswvle6rcn0w.R.inc(37491);originalTimeZone = null;
        __CLR4_4_1swvswvle6rcn0w.R.inc(37492);originalLocale = null;
    }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForStyle_shortDateTime199() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12e5zzasxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12e5zzasxh() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37493); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37494);DateTimeFormatter f = DateTimeFormat.shortDateTime(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37495);DateTimeFormatter g = DateTimeFormat.forStyle("SS"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37496);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37497);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37498);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37499);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37500);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37501);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37502);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37503);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37504);DateTime date = new DateTime(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37505);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_shortDate200() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erkqi4sxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erkqi4sxu() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37506); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37507);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37508);DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37509);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37510);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37511);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37512);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37513);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37514);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37515);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37516);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37517);DateTime date = new DateTime(DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37518);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_shortTime201() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17njz86sy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17njz86sy7() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37519); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37520);DateTimeFormatter f = DateTimeFormat.shortTime(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37521);DateTimeFormatter g = DateTimeFormat.forStyle("-S"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37522);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37523);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37524);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37525);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37526);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37527);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37528);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37529);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37530);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_1swvswvle6rcn0w.R.iget(37531)!=0|true))||(__CLR4_4_1swvswvle6rcn0w.R.iget(37532)==0&false))) {{ 
     } }else {{ 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37533);DateTime date = new DateTime(DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37534);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }}finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_mediumDate202() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q1umwjsyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate202",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q1umwjsyn() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37535); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37536);DateTimeFormatter f = DateTimeFormat.mediumDate(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37537);DateTimeFormatter g = DateTimeFormat.forStyle("M-"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37538);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37539);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37540);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37541);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37542);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37543);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37544);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37545);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_mediumDateTime203() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oi0ye1syy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oi0ye1syy() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37546); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37547);DateTimeFormatter f = DateTimeFormat.mediumDateTime(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37548);DateTimeFormatter g = DateTimeFormat.forStyle("MM"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37549);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37550);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37551);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37552);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37553);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37554);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37555);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37556);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_longDate204() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty96oisz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty96oisz9() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37557); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37558);DateTimeFormatter f = DateTimeFormat.longDate(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37559);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37560);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37561);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37562);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37563);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37564);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37565);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37566);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37567);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_fullDate205() throws Exception {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpbh6kszk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate205",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpbh6kszk() throws Exception{try{__CLR4_4_1swvswvle6rcn0w.R.inc(37568); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37569);DateTimeFormatter f = DateTimeFormat.fullDate(); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37570);DateTimeFormatter g = DateTimeFormat.forStyle("F-"); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37571);assertSame(g, f); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37572);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37573);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37574);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37575);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37576);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37577);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate()); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37578);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_stringLengths226() {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14zmftmszv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14zmftmszv(){try{__CLR4_4_1swvswvle6rcn0w.R.inc(37579); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37580);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37581);DateTimeFormat.forStyle(null); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37582);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37583);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37584);DateTimeFormat.forStyle(""); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37585);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37586);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37587);DateTimeFormat.forStyle("S"); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37588);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37589);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37590);DateTimeFormat.forStyle("SSS"); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37591);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 


public void testForStyle_invalidStrings227() {__CLR4_4_1swvswvle6rcn0w.R.globalSliceStart(getClass().getName(),37592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gayz1ut08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1swvswvle6rcn0w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1swvswvle6rcn0w.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gayz1ut08(){try{__CLR4_4_1swvswvle6rcn0w.R.inc(37592); 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37593);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37594);DateTimeFormat.forStyle("AA"); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37595);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37596);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37597);DateTimeFormat.forStyle("--"); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37598);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1swvswvle6rcn0w.R.inc(37599);try { 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37600);DateTimeFormat.forStyle("ss"); 
         __CLR4_4_1swvswvle6rcn0w.R.inc(37601);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1swvswvle6rcn0w.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}

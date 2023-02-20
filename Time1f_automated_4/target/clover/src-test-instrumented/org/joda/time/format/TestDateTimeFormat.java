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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1lnzlnzle6o7aee{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,28147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28079);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28080);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28081);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28082);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1lnzlnzle6o7aee.R.inc(28084);try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28083);
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28085);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28086);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28087);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28088);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28089);originalLocale = Locale.getDefault();
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28090);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28091);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28092);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28093);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28094);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28095);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28096);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28097);Locale.setDefault(originalLocale);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28098);originalDateTimeZone = null;
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28099);originalTimeZone = null;
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28100);originalLocale = null;
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void test_parseWrongOffset87() {__CLR4_4_1lnzlnzle6o7aee.R.globalSliceStart(getClass().getName(),28101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1caxeg0lol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnzlnzle6o7aee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnzlnzle6o7aee.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.test_parseWrongOffset87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1caxeg0lol(){try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28101); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28102);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28103);DateTimeFormatter f = bld.toFormatter(); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28104);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28105);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28106);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00")); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28107);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00")); 
 }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}
public void testFormat_hourOfHalfday95() {__CLR4_4_1lnzlnzle6o7aee.R.globalSliceStart(getClass().getName(),28108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp0eitlos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnzlnzle6o7aee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnzlnzle6o7aee.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_hourOfHalfday95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp0eitlos(){try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28108); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28109);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28110);DateTimeFormatter f = DateTimeFormat.forPattern("k").withLocale(Locale.UK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28111);assertEquals(dt.toString(), "10", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28112);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28113);assertEquals(dt.toString(), "6", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28114);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28115);assertEquals(dt.toString(), "19", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28116);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28117);assertEquals(dt.toString(), "24", f.print(dt)); 
 }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}
public void testFormatParse_zoneId_colon96() {__CLR4_4_1lnzlnzle6o7aee.R.globalSliceStart(getClass().getName(),28118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t8a5i8lp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnzlnzle6o7aee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnzlnzle6o7aee.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormatParse_zoneId_colon96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t8a5i8lp2(){try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28118); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28119);DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("HH:mm ZZ").withZoneUTC(); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28120);String str = new DateTime(2007, 6, 23, 1, 2, 0, 0, UTC).toString(dateFormatter); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28121);assertEquals("01:02 +00:00", str); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28122);DateTime parsed = dateFormatter.parseDateTime(str); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28123);assertEquals(1, parsed.getHourOfDay()); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28124);assertEquals(2, parsed.getMinuteOfHour()); 
 }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}
public void testFormat_era445() {__CLR4_4_1lnzlnzle6o7aee.R.globalSliceStart(getClass().getName(),28125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189kt7mlp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnzlnzle6o7aee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnzlnzle6o7aee.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_era445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189kt7mlp9(){try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28125); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28126);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28127);DateTimeFormatter f = DateTimeFormat.forPattern("G").withLocale(Locale.UK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28128);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28129);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28130);assertEquals(dt.toString(), "AD", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28131);dt = dt.withZone(PARIS); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28132);assertEquals(dt.toString(), "AD", f.print(dt)); 
 }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}
public void testFormat_eraText446() {__CLR4_4_1lnzlnzle6o7aee.R.globalSliceStart(getClass().getName(),28133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c34xmalph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lnzlnzle6o7aee.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lnzlnzle6o7aee.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_eraText446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c34xmalph(){try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28133); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28134);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28135);DateTimeFormatter f = DateTimeFormat.forPattern("EEEE").withLocale(Locale.UK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28136);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28137);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28138);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28139);dt = dt.withZone(PARIS); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28140);assertEquals(dt.toString(), "Wednesday", f.print(dt)); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28141);f = f.withLocale(Locale.FRENCH); 
     __CLR4_4_1lnzlnzle6o7aee.R.inc(28142);assertEquals(dt.toString(), "mercredi", f.print(dt)); 
 }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}
    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1lnzlnzle6o7aee.R.inc(28143);
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28144);assertEquals(hour, test.getYear());
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28145);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1lnzlnzle6o7aee.R.inc(28146);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1lnzlnzle6o7aee.R.flushNeeded();}}

}

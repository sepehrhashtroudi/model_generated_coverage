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
public class TestDateTimeFormat extends TestCase {static class __CLR4_4_1lvtlvtle6nl8pr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28361);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28362);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28363);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28364);return new TestSuite(TestDateTimeFormat.class);
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

    public TestDateTimeFormat(String name) {
        super(name);__CLR4_4_1lvtlvtle6nl8pr.R.inc(28366);try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28365);
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28367);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28368);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28369);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28370);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28371);originalLocale = Locale.getDefault();
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28372);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28373);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28374);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28375);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28376);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28377);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28378);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28379);Locale.setDefault(originalLocale);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28380);originalDateTimeZone = null;
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28381);originalTimeZone = null;
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28382);originalLocale = null;
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_weekyear106() {__CLR4_4_1lvtlvtle6nl8pr.R.globalSliceStart(getClass().getName(),28383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xritntlwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvtlvtle6nl8pr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvtlvtle6nl8pr.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_weekyear106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xritntlwf(){try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28383); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28384);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28385);DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28386);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28387);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28388);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28389);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28390);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28391);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28392);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}
public void testFormat_dayOfYear113() {__CLR4_4_1lvtlvtle6nl8pr.R.globalSliceStart(getClass().getName(),28393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qg8pb4lwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvtlvtle6nl8pr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvtlvtle6nl8pr.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormat.testFormat_dayOfYear113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qg8pb4lwp(){try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28393); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28394);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28395);DateTimeFormatter f = DateTimeFormat.forPattern("E").withLocale(Locale.UK); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28396);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28397);dt = dt.withZone(NEWYORK); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28398);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28399);dt = dt.withZone(TOKYO); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28400);assertEquals(dt.toString(), "2004", f.print(dt)); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28401);dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1lvtlvtle6nl8pr.R.inc(28402);assertEquals(dt.toString(), "-123", f.print(dt)); 
 }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}
    

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
    private void check(DateTime test, int hour, int min, int sec) {try{__CLR4_4_1lvtlvtle6nl8pr.R.inc(28403);
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28404);assertEquals(hour, test.getYear());
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28405);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1lvtlvtle6nl8pr.R.inc(28406);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1lvtlvtle6nl8pr.R.flushNeeded();}}

}

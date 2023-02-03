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
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1n5xn5xlc8axe6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30021);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30022);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30023);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30024);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1n5xn5xlc8axe6m.R.inc(30026);try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30025);
    }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30027);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30028);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30029);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30030);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30031);originalLocale = Locale.getDefault();
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30032);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30033);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30034);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30035);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30036);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30037);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30038);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30039);Locale.setDefault(originalLocale);
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30040);originalDateTimeZone = null;
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30041);originalTimeZone = null;
        __CLR4_4_1n5xn5xlc8axe6m.R.inc(30042);originalLocale = null;
    }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetMonthOfYear_int_dstOverlapSummer_addZero59() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1niv7ipn6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1niv7ipn6j(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30043); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30044);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30045);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30046);test.setMonthOfYear(10); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30047);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetWeekyear_int165() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mvr46n6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mvr46n6o(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30048); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30049);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30050);test.setWeekyear(2001); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30051);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMinuteOfHour_int2402() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ushkaun6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int2402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ushkaun6s(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30052); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30053);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30054);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30055);test.setMinuteOfHour(60); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30056);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30057);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetTime_int_int_int2419() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0xmpqn6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0xmpqn6y(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30058); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30059);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30060);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30061);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30062);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30063);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDateTime_int_int_int_int_int_int_int1443() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qip69on74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qip69on74(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30064); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30065);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30066);test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30067);assertEquals(2010, test.getYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30068);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30069);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30070);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30071);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30072);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30073);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDate_int_int_int1495() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176756cn7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176756cn7e(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30074); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30075);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30076);test.setDate(2010, 12, 3); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30077);assertEquals(2010, test.getYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30078);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30079);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30080);assertEquals(12, test.getHourOfDay()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30081);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30082);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30083);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapSummer_addZero567() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11q94b4n7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11q94b4n7o(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30084); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30085);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30086);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30087);test.setDayOfMonth(30); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30088);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDate_RI_same590() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvkw0qn7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvkw0qn7t(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30089); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30090);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30091);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30092);test.setDate(setter); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30093);assertEquals(2010, test.getYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30094);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30095);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30096);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30097);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30098);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30099);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone2635() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13q6qp3n84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone2635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13q6qp3n84(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30100); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30101);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30102);test.setZoneRetainFields(null); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30103);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30104);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDayOfYear_int2713() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qmaamn89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2713",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qmaamn89(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30105); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30106);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30107);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30108);test.setDayOfYear(366); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30109);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30110);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDayOfYear_int_dstOverlapWinter_addZero716() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1u6d9n8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero716",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1u6d9n8f(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30111); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30112);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30113);test.addHours(1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30114);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30115);test.setDayOfYear(303); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30116);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone1779() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwipdxn8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1779",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwipdxn8l(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30117); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30118);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30119);test.setZoneRetainFields(PARIS); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30120);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30121);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDate_int_int_int2788() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecjadin8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int2788",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecjadin8q(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30122); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30123);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30124);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30125);test.setDate(2010, 13, 3); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30126);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30127);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int2985() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1driqd7n8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int2985",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1driqd7n8w(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30128); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30129);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30130);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30131);test.set(null, 0); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30132);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30133);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDayOfWeek_int11014() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nr6tppn92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int11014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nr6tppn92(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30134); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30135);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30136);test.setDayOfWeek(5); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30137);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetTime_int_int_int_int11051() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d2h3qn96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int11051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d2h3qn96(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30138); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30139);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30140);test.setTime(5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30141);assertEquals(2002, test.getYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30142);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30143);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30144);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30145);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30146);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30147);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetYear_int11108() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zge88zn9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int11108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zge88zn9g(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30148); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30149);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30150);test.setYear(2010); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30151);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMilliOfDay_int21181() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdmlmun9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int21181",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdmlmun9k(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30152); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30153);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30154);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30155);test.setMillisOfDay(24 * 60 * 60 * 1000); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30156);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30157);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetHourOfDay_int21208() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18did5rn9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int21208",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18did5rn9q(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30158); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30159);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30160);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30161);test.setHourOfDay(24); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30162);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30163);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMinuteOfDay_int11305() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paxfamn9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int11305",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paxfamn9w(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30164); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30165);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30166);test.setMinuteOfDay(13); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30167);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMonthOfYear_int_dstOverlapWinter_addZero1338() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158sc46na0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero1338",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158sc46na0(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30168); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30169);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30170);test.addHours(1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30171);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30172);test.setMonthOfYear(10); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30173);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetSecondOfDay_int11384() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12wbpr9na6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int11384",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12wbpr9na6(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30174); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30175);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30176);test.setSecondOfDay(13); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30177);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMilliOfSecond_int21494() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17f4fy9naa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int21494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17f4fy9naa(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30178); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30179);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30180);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30181);test.setMillisOfSecond(1000); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30182);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30183);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetMillis_RI11595() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kum6l4nag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI11595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kum6l4nag(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30184); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30185);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30186);test.setMillis(new Instant(TEST_TIME2)); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30187);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30188);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone31596() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w361v5nal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone31596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w361v5nal(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30189); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30190);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30191);test.setZoneRetainFields(null); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30192);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30193);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int31677() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqtjr9naq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int31677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqtjr9naq(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30194); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30195);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30196);try { 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30197);test.set(DateTimeFieldType.monthOfYear(), 13); 
         __CLR4_4_1n5xn5xlc8axe6m.R.inc(30198);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30199);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapWinter_addZero1714() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16faia5naw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero1714",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16faia5naw(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30200); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30201);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30202);test.addHours(1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30203);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30204);test.setDayOfMonth(30); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30205);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetZone_DateTimeZone11739() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze2b3unb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone11739",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze2b3unb2(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30206); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30207);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30208);test.setZone(PARIS); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30209);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30210);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 


public void testSetSecondOfMinute_int11746() {__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceStart(getClass().getName(),30211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6l40xnb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n5xn5xlc8axe6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n5xn5xlc8axe6m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int11746",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6l40xnb7(){try{__CLR4_4_1n5xn5xlc8axe6m.R.inc(30211); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30212);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30213);test.setSecondOfMinute(13); 
     __CLR4_4_1n5xn5xlc8axe6m.R.inc(30214);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1n5xn5xlc8axe6m.R.flushNeeded();}} 

    

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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}

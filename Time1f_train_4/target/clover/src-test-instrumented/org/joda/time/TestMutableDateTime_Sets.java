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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1mclmclle6rjcrf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,29151,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mclmclle6rjcrf.R.inc(28965);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28966);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mclmclle6rjcrf.R.inc(28967);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28968);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1mclmclle6rjcrf.R.inc(28970);try{__CLR4_4_1mclmclle6rjcrf.R.inc(28969);
    }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mclmclle6rjcrf.R.inc(28971);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28972);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28973);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mclmclle6rjcrf.R.inc(28974);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mclmclle6rjcrf.R.inc(28975);originalLocale = Locale.getDefault();
        __CLR4_4_1mclmclle6rjcrf.R.inc(28976);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28977);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mclmclle6rjcrf.R.inc(28978);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mclmclle6rjcrf.R.inc(28979);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28980);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mclmclle6rjcrf.R.inc(28981);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28982);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28983);Locale.setDefault(originalLocale);
        __CLR4_4_1mclmclle6rjcrf.R.inc(28984);originalDateTimeZone = null;
        __CLR4_4_1mclmclle6rjcrf.R.inc(28985);originalTimeZone = null;
        __CLR4_4_1mclmclle6rjcrf.R.inc(28986);originalLocale = null;
    }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetDayOfYear_int2453() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),28987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171m4w9md7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171m4w9md7(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(28987); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28988);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28989);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(28990);test.setDayOfYear(366); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(28991);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28992);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDateTime_int_int_int_int_int_int_int1537() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),28993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnp5gqmdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnp5gqmdd(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(28993); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28994);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28995);test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28996);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28997);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28998);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(28999);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29000);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29001);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29002);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapSummer_addZero641() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brpd0zmdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brpd0zmdn(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29003); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29004);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29005);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29006);test.setDayOfMonth(30); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29007);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone1931() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzfbnrmds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1931",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzfbnrmds(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29008); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29009);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29010);test.setZoneRetainFields(PARIS); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29011);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29012);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDate_int_int_int1956() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxq5fimdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1956",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxq5fimdx(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29013); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29014);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29015);test.setDate(2010, 12, 3); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29016);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29017);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29018);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29019);assertEquals(12, test.getHourOfDay()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29020);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29021);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29022);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetTime_int_int_int2957() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c48yrme7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2957",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c48yrme7(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29023); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29024);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29025);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29026);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29027);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29028);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone31031() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vpotxmed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone31031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vpotxmed(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29029); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29030);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29031);test.setZoneRetainFields(null); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29032);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29033);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMillis_RI11038() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150y7z0mei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI11038",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150y7z0mei(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29034); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29035);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29036);test.setMillis(new Instant(TEST_TIME2)); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29037);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29038);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetZone_DateTimeZone11043() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah7t10men();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone11043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah7t10men(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29039); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29040);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29041);test.setZone(PARIS); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29042);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29043);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone21044() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s858jwmes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone21044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s858jwmes(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29044); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29045);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29046);test.setZoneRetainFields(null); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29047);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29048);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int21045() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kh867mex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int21045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kh867mex(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29049); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29050);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29051);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29052);test.set(null, 0); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29053);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29054);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int31046() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6h2htmf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int31046",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6h2htmf3(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29055); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29056);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29057);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29058);test.set(DateTimeFieldType.monthOfYear(), 13); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29059);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29060);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetWeekyear_int11050() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rhirz3mf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int11050",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rhirz3mf9(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29061); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29062);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29063);test.setWeekyear(2001); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29064);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMonthOfYear_int_dstOverlapWinter_addZero1051() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6m9yamfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero1051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6m9yamfd(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29065); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29066);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29067);test.addHours(1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29068);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29069);test.setMonthOfYear(10); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29070);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetWeekOfWeekyear_int21053() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1118dcqmfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int21053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1118dcqmfj(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29071); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29072);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29073);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29074);test.setWeekOfWeekyear(53); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29075);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29076);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDayOfYear_int_dstOverlapWinter_addZero1055() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1roxcaumfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1roxcaumfp(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29077); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29078);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29079);test.addHours(1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29080);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29081);test.setDayOfYear(303); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29082);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapWinter_addZero1056() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18648fqmfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18648fqmfv(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29083); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29084);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29085);test.addHours(1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29086);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29087);test.setDayOfMonth(30); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29088);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDayOfWeek_int11057() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xu4muqmg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int11057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xu4muqmg1(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29089); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29090);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29091);test.setDayOfWeek(5); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29092);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMinuteOfDay_int11060() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbp2qomg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int11060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbp2qomg5(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29093); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29094);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29095);test.setMinuteOfDay(13); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29096);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMinuteOfHour_int21061() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc1x8cmg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int21061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc1x8cmg9(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29097); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29098);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29099);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29100);test.setMinuteOfHour(60); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29101);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29102);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetSecondOfDay_int11063() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hna2g3mgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int11063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hna2g3mgf(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29103); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29104);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29105);test.setSecondOfDay(13); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29106);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetSecondOfMinute_int11064() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1915rlimgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int11064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1915rlimgj(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29107); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29108);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29109);test.setSecondOfMinute(13); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29110);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMilliOfDay_int21067() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11um4v5mgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int21067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11um4v5mgn(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29111); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29112);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29113);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29114);test.setMillisOfDay(24 * 60 * 60 * 1000); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29115);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29116);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetMilliOfSecond_int21068() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1406gzimgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int21068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1406gzimgt(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29117); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29118);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29119);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29120);test.setMillisOfSecond(1000); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29121);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29122);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDate_RI_same1071() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj7otmgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same1071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj7otmgz(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29123); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29124);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29125);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29126);test.setDate(setter); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29127);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29128);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29129);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29130);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29131);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29132);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29133);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetDate_int_int_int21072() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hkmm1nmha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int21072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hkmm1nmha(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29134); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29135);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29136);try { 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29137);test.setDate(2010, 13, 3); 
         __CLR4_4_1mclmclle6rjcrf.R.inc(29138);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29139);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 


public void testSetTime_RI11073() {__CLR4_4_1mclmclle6rjcrf.R.globalSliceStart(getClass().getName(),29140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iaxh46mhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mclmclle6rjcrf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mclmclle6rjcrf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI11073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iaxh46mhg(){try{__CLR4_4_1mclmclle6rjcrf.R.inc(29140); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29141);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29142);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29143);test.setTime(setter); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29144);assertEquals(2002, test.getYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29145);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29146);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29147);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29148);assertEquals(7, test.getMinuteOfHour()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29149);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1mclmclle6rjcrf.R.inc(29150);assertEquals(11, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mclmclle6rjcrf.R.flushNeeded();}} 

    

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

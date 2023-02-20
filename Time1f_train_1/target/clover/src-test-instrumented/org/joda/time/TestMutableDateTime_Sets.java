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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1mc0mc0le6qe9va{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,29119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28944);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28945);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28946);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28947);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1mc0mc0le6qe9va.R.inc(28949);try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28948);
    }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28950);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28951);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28952);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28953);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28954);originalLocale = Locale.getDefault();
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28955);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28956);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28957);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28958);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28959);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28960);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28961);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28962);Locale.setDefault(originalLocale);
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28963);originalDateTimeZone = null;
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28964);originalTimeZone = null;
        __CLR4_4_1mc0mc0le6qe9va.R.inc(28965);originalLocale = null;
    }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetMonthOfYear_int_dstOverlapSummer_addZero256() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),28966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xafjismcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xafjismcm(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28966); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28967);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28968);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28969);test.setMonthOfYear(10); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28970);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDayOfYear_int2445() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),28971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9h3uumcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2445",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9h3uumcr(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28971); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28972);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28973);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(28974);test.setDayOfYear(366); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(28975);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28976);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDateTime_int_int_int_int_int_int_int1524() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),28977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dt5ng8mcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1524",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dt5ng8mcx(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28977); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28978);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28979);test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28980);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28981);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28982);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28983);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28984);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28985);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28986);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapSummer_addZero625() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),28987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctor0zmd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctor0zmd7(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28987); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28988);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28989);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28990);test.setDayOfMonth(30); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28991);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDate_int_int_int1943() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),28992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gj4nhgmdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1943",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gj4nhgmdc(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(28992); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28993);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28994);test.setDate(2010, 12, 3); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28995);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28996);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28997);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28998);assertEquals(12, test.getHourOfDay()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(28999);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29000);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29001);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetTime_int_int_int2944() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8503fmdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2944",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8503fmdm(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29002); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29003);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29004);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29005);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29006);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29007);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMillis_RI11021() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nl7lvamds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI11021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nl7lvamds(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29008); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29009);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29010);test.setMillis(new Instant(TEST_TIME2)); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29011);assertEquals(TEST_TIME2, test.getMillis()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29012);assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone21026() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opkmy8mdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone21026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opkmy8mdx(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29013); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29014);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29015);test.setZoneRetainFields(null); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29016);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29017);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int31027() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0va6cme2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int31027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0va6cme2(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29018); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29019);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29020);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29021);test.set(DateTimeFieldType.monthOfYear(), 13); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29022);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29023);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetYear_int11030() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tppufrme8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int11030",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tppufrme8(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29024); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29025);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29026);test.setYear(2010); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29027);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetWeekyear_int11031() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cn4kakmec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int11031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cn4kakmec(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29028); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29029);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29030);test.setWeekyear(2001); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29031);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMonthOfYear_int_dstOverlapWinter_addZero1033() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f383hameg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero1033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f383hameg(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29032); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29033);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29034);test.addHours(1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29035);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29036);test.setMonthOfYear(10); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29037);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetWeekOfWeekyear_int21036() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdmim7mem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int21036",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdmim7mem(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29038); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29039);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29040);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29041);test.setWeekOfWeekyear(53); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29042);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29043);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDayOfYear_int_dstOverlapWinter_addZero1039() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iqslmcmes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero1039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iqslmcmes(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29044); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29045);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29046);test.addHours(1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29047);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29048);test.setDayOfYear(303); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29049);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapWinter_addZero1040() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dn5491mey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero1040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dn5491mey(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29050); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29051);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29052);test.addHours(1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29053);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29054);test.setDayOfMonth(30); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29055);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDayOfWeek_int11041() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdq2fnmf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int11041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdq2fnmf4(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29056); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29057);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29058);test.setDayOfWeek(5); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29059);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetHourOfDay_int21042() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8is0lmf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int21042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8is0lmf8(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29060); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29061);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29062);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29063);test.setHourOfDay(24); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29064);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29065);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMinuteOfDay_int11043() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120p2itmfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int11043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120p2itmfe(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29066); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29067);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29068);test.setMinuteOfDay(13); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29069);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMinuteOfHour_int21044() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17znryvmfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int21044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17znryvmfi(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29070); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29071);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29072);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29073);test.setMinuteOfHour(60); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29074);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29075);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetSecondOfMinute_int11045() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvjza1mfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int11045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvjza1mfo(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29076); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29077);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29078);test.setSecondOfMinute(13); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29079);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMilliOfDay_int21048() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gp0cjomfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int21048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gp0cjomfs(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29080); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29081);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29082);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29083);test.setMillisOfDay(24 * 60 * 60 * 1000); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29084);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29085);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetMilliOfSecond_int21049() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1au7qp1mfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int21049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1au7qp1mfy(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29086); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29087);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29088);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29089);test.setMillisOfSecond(1000); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29090);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29091);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDate_RI_same1051() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2xgkvmg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same1051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2xgkvmg4(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29092); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29093);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29094);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29095);test.setDate(setter); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29096);assertEquals(2010, test.getYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29097);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29098);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29099);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29100);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29101);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29102);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetDate_int_int_int21052() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z8d5lmgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int21052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z8d5lmgf(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29103); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29104);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29105);try { 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29106);test.setDate(2010, 13, 3); 
         __CLR4_4_1mc0mc0le6qe9va.R.inc(29107);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29108);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 


public void testSetTime_int_int_int_int11053() {__CLR4_4_1mc0mc0le6qe9va.R.globalSliceStart(getClass().getName(),29109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev2eoomgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mc0mc0le6qe9va.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mc0mc0le6qe9va.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int11053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev2eoomgl(){try{__CLR4_4_1mc0mc0le6qe9va.R.inc(29109); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29110);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29111);test.setTime(5, 6, 7, 8); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29112);assertEquals(2002, test.getYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29113);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29114);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29115);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29116);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29117);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1mc0mc0le6qe9va.R.inc(29118);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1mc0mc0le6qe9va.R.flushNeeded();}} 

    

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

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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1m8am8ale6rclfp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m8am8ale6rclfp.R.inc(28810);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28811);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m8am8ale6rclfp.R.inc(28812);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28813);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1m8am8ale6rclfp.R.inc(28815);try{__CLR4_4_1m8am8ale6rclfp.R.inc(28814);
    }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m8am8ale6rclfp.R.inc(28816);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28817);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28818);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m8am8ale6rclfp.R.inc(28819);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m8am8ale6rclfp.R.inc(28820);originalLocale = Locale.getDefault();
        __CLR4_4_1m8am8ale6rclfp.R.inc(28821);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28822);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m8am8ale6rclfp.R.inc(28823);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m8am8ale6rclfp.R.inc(28824);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28825);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m8am8ale6rclfp.R.inc(28826);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28827);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28828);Locale.setDefault(originalLocale);
        __CLR4_4_1m8am8ale6rclfp.R.inc(28829);originalDateTimeZone = null;
        __CLR4_4_1m8am8ale6rclfp.R.inc(28830);originalTimeZone = null;
        __CLR4_4_1m8am8ale6rclfp.R.inc(28831);originalLocale = null;
    }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetMonthOfYear_int_dstOverlapSummer_addZero264() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eitjhrm8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eitjhrm8w(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28832); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28833);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28834);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28835);test.setMonthOfYear(10); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28836);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDayOfYear_int2451() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djm2h7m91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djm2h7m91(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28837); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28838);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28839);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28840);test.setDayOfYear(366); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28841);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28842);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone1908() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncw7rxm97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1908",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncw7rxm97(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28843); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28844);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28845);test.setZoneRetainFields(PARIS); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28846);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28847);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDate_int_int_int1931() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia4kd7m9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1931",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia4kd7m9c(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28848); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28849);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28850);test.setDate(2010, 12, 3); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28851);assertEquals(2010, test.getYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28852);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28853);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28854);assertEquals(12, test.getHourOfDay()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28855);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28856);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28857);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetTime_int_int_int2932() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzpu12m9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2932",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzpu12m9m(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28858); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28859);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28860);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28861);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28862);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28863);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetZoneRetainFields_DateTimeZone31004() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b96g3zm9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone31004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b96g3zm9s(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28864); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28865);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28866);test.setZoneRetainFields(null); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28867);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28868);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetZone_DateTimeZone11014() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcohw0m9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone11014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcohw0m9x(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28869); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28870);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28871);test.setZone(PARIS); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28872);assertEquals(TEST_TIME1, test.getMillis()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28873);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int21015() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjzfhama2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int21015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjzfhama2(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28874); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28875);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28876);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28877);test.set(null, 0); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28878);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28879);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSet_DateTimeFieldType_int31016() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xzl5oma8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int31016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xzl5oma8(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28880); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28881);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28882);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28883);test.set(DateTimeFieldType.monthOfYear(), 13); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28884);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28885);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetYear_int11018() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13q08bjmae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int11018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13q08bjmae(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28886); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28887);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28888);test.setYear(2010); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28889);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetWeekyear_int11020() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pf4mckmai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int11020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pf4mckmai(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28890); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28891);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28892);test.setWeekyear(2001); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28893);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetWeekOfWeekyear_int21024() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du8biamam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int21024",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du8biamam(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28894); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28895);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28896);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28897);test.setWeekOfWeekyear(53); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28899);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDayOfYear_int_dstOverlapWinter_addZero1027() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2gm8bmas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero1027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2gm8bmas(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28900); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28901);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28902);test.addHours(1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28903);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28904);test.setDayOfYear(303); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28905);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDayOfMonth_int_dstOverlapWinter_addZero1028() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jskyi9may();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero1028",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jskyi9may(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28906); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28907);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28908);test.addHours(1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28909);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28910);test.setDayOfMonth(30); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28911);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetHourOfDay_int21031() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qc3bfmb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int21031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qc3bfmb4(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28912); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28913);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28914);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28915);test.setHourOfDay(24); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28916);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28917);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetMinuteOfDay_int11032() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy5st7mba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int11032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy5st7mba(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28918); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28919);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28920);test.setMinuteOfDay(13); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28921);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetSecondOfDay_int11034() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12rtdl3mbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int11034",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12rtdl3mbe(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28922); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28923);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28924);test.setSecondOfDay(13); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28925);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetMilliOfDay_int21036() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiuhktmbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int21036",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiuhktmbi(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28926); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28927);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28928);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28929);test.setMillisOfDay(24 * 60 * 60 * 1000); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28930);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28931);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetMilliOfSecond_int21037() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdn3fgmbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int21037",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdn3fgmbo(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28932); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28933);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28934);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28935);test.setMillisOfSecond(1000); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28936);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28937);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDate_RI_same1040() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvxer5mbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same1040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvxer5mbu(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28938); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28939);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28940);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28941);test.setDate(setter); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28942);assertEquals(2010, test.getYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28943);assertEquals(12, test.getMonthOfYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28944);assertEquals(3, test.getDayOfMonth()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28945);assertEquals(2, test.getHourOfDay()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28946);assertEquals(24, test.getMinuteOfHour()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28947);assertEquals(48, test.getSecondOfMinute()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28948);assertEquals(501, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetDate_int_int_int21041() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w30thjmc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int21041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w30thjmc5(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28949); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28950);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28951);try { 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28952);test.setDate(2010, 13, 3); 
         __CLR4_4_1m8am8ale6rclfp.R.inc(28953);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28954);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetTime_RI11042() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcpyf0mcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI11042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcpyf0mcb(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28955); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28956);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28957);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28958);test.setTime(setter); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28959);assertEquals(2002, test.getYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28960);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28961);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28962);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28963);assertEquals(7, test.getMinuteOfHour()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28964);assertEquals(9, test.getSecondOfMinute()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28965);assertEquals(11, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 


public void testSetTime_int_int_int_int11043() {__CLR4_4_1m8am8ale6rclfp.R.globalSliceStart(getClass().getName(),28966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eushuvmcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m8am8ale6rclfp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m8am8ale6rclfp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int11043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eushuvmcm(){try{__CLR4_4_1m8am8ale6rclfp.R.inc(28966); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28967);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28968);test.setTime(5, 6, 7, 8); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28969);assertEquals(2002, test.getYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28970);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28971);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28972);assertEquals(5, test.getHourOfDay()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28973);assertEquals(6, test.getMinuteOfHour()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28974);assertEquals(7, test.getSecondOfMinute()); 
     __CLR4_4_1m8am8ale6rclfp.R.inc(28975);assertEquals(8, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1m8am8ale6rclfp.R.flushNeeded();}} 

    

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

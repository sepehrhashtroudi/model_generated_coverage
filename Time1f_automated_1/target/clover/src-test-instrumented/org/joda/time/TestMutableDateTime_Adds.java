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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {static class __CLR4_4_1izuizule6ndpn9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,24676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1izuizule6ndpn9.R.inc(24618);
        __CLR4_4_1izuizule6ndpn9.R.inc(24619);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1izuizule6ndpn9.R.inc(24620);
        __CLR4_4_1izuizule6ndpn9.R.inc(24621);return new TestSuite(TestMutableDateTime_Adds.class);
    }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}

    public TestMutableDateTime_Adds(String name) {
        super(name);__CLR4_4_1izuizule6ndpn9.R.inc(24623);try{__CLR4_4_1izuizule6ndpn9.R.inc(24622);
    }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1izuizule6ndpn9.R.inc(24624);
        __CLR4_4_1izuizule6ndpn9.R.inc(24625);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1izuizule6ndpn9.R.inc(24626);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1izuizule6ndpn9.R.inc(24627);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1izuizule6ndpn9.R.inc(24628);originalLocale = Locale.getDefault();
        __CLR4_4_1izuizule6ndpn9.R.inc(24629);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1izuizule6ndpn9.R.inc(24630);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1izuizule6ndpn9.R.inc(24631);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1izuizule6ndpn9.R.inc(24632);
        __CLR4_4_1izuizule6ndpn9.R.inc(24633);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1izuizule6ndpn9.R.inc(24634);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1izuizule6ndpn9.R.inc(24635);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1izuizule6ndpn9.R.inc(24636);Locale.setDefault(originalLocale);
        __CLR4_4_1izuizule6ndpn9.R.inc(24637);originalDateTimeZone = null;
        __CLR4_4_1izuizule6ndpn9.R.inc(24638);originalTimeZone = null;
        __CLR4_4_1izuizule6ndpn9.R.inc(24639);originalLocale = null;
    }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testAdd_long1488() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156vqhij0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAdd_long1488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156vqhij0g(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24640); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24641);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24642);test.add(123456789L); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24643);assertEquals(TEST_TIME1 + 123456789L, test.getMillis()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddYears_int1492() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knzlmj0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int1492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knzlmj0k(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24644); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24645);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24646);test.addYears(-1); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24647);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddYears_int1493() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tnye3j0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddYears_int1493",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tnye3j0o(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24648); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24649);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24650);test.addYears(13); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24651);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddDays_int_dstOverlapWinter_addZero494() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e75orgj0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int_dstOverlapWinter_addZero494",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e75orgj0s(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24652); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24653);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24654);test.addHours(1); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24655);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24656);test.addDays(0); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24657);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddDays_int1495() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqset8j0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddDays_int1495",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqset8j0y(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24658); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24659);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24660);test.addDays(13); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24661);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddMinutes_int_dstOverlapWinter_addZero496() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h18dkj12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int_dstOverlapWinter_addZero496",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h18dkj12(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24662); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24663);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24664);test.addHours(1); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24665);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24666);test.addMinutes(0); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24667);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddMinutes_int1497() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swq3goj18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMinutes_int1497",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swq3goj18(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24668); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24669);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24670);test.addMinutes(13); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24671);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
public void testAddMillis_int1499() {__CLR4_4_1izuizule6ndpn9.R.globalSliceStart(getClass().getName(),24672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwpanlj1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1izuizule6ndpn9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1izuizule6ndpn9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Adds.testAddMillis_int1499",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwpanlj1c(){try{__CLR4_4_1izuizule6ndpn9.R.inc(24672); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24673);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24674);test.addMillis(13); 
     __CLR4_4_1izuizule6ndpn9.R.inc(24675);assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
 }finally{__CLR4_4_1izuizule6ndpn9.R.flushNeeded();}}
    

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

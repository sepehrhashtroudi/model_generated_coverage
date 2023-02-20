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
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1ivwivwle6o79xk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,24546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ivwivwle6o79xk.R.inc(24476);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24477);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ivwivwle6o79xk.R.inc(24478);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24479);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1ivwivwle6o79xk.R.inc(24481);try{__CLR4_4_1ivwivwle6o79xk.R.inc(24480);
    }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ivwivwle6o79xk.R.inc(24482);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24483);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24484);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ivwivwle6o79xk.R.inc(24485);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ivwivwle6o79xk.R.inc(24486);originalLocale = Locale.getDefault();
        __CLR4_4_1ivwivwle6o79xk.R.inc(24487);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24488);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ivwivwle6o79xk.R.inc(24489);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ivwivwle6o79xk.R.inc(24490);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24491);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ivwivwle6o79xk.R.inc(24492);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24493);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24494);Locale.setDefault(originalLocale);
        __CLR4_4_1ivwivwle6o79xk.R.inc(24495);originalDateTimeZone = null;
        __CLR4_4_1ivwivwle6o79xk.R.inc(24496);originalTimeZone = null;
        __CLR4_4_1ivwivwle6o79xk.R.inc(24497);originalLocale = null;
    }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP127() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0484ciwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testIsContiguous_RP127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0484ciwi(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24498); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24499);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24500);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24501);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24502);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24503);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24504);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24505);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24506);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24507);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24508);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24509);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24510);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24511);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24512);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24513);try { 
         __CLR4_4_1ivwivwle6o79xk.R.inc(24514);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1ivwivwle6o79xk.R.inc(24515);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
public void testPropertyAddWrapFieldYear347() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rgl9yix0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testPropertyAddWrapFieldYear347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rgl9yix0(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24516); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24517);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24518);DateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24519);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24520);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24521);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24522);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24523);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24524);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24525);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24526);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
public void testSetZoneRetainFields_DateTimeZone1349() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhkll2ixb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhkll2ixb(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24527); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24528);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24529);test.setZoneRetainFields(PARIS); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24530);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24531);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
public void testSetYear_int1409() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2hjlcixg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2hjlcixg(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24532); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24533);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24534);test.setYear(2010); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24535);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
public void testSetHourOfDay_int1413() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmpcb7ixk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int1413",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmpcb7ixk(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24536); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24537);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24538);test.setHourOfDay(13); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24539);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
public void testSetTime_int_int_int2414() {__CLR4_4_1ivwivwle6o79xk.R.globalSliceStart(getClass().getName(),24540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grxsrdixo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ivwivwle6o79xk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ivwivwle6o79xk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grxsrdixo(){try{__CLR4_4_1ivwivwle6o79xk.R.inc(24540); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24541);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24542);try { 
         __CLR4_4_1ivwivwle6o79xk.R.inc(24543);test.setTime(60, 6, 7, 8); 
         __CLR4_4_1ivwivwle6o79xk.R.inc(24544);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ivwivwle6o79xk.R.inc(24545);assertEquals(TEST_TIME1, test.getMillis()); 
 }finally{__CLR4_4_1ivwivwle6o79xk.R.flushNeeded();}}
    

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

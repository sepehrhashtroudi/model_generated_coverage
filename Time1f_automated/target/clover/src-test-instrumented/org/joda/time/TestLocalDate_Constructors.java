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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1hqbhqblccieto0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,23024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1hqbhqblccieto0.R.inc(22979);
        __CLR4_4_1hqbhqblccieto0.R.inc(22980);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hqbhqblccieto0.R.inc(22981);
        __CLR4_4_1hqbhqblccieto0.R.inc(22982);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1hqbhqblccieto0.R.inc(22984);try{__CLR4_4_1hqbhqblccieto0.R.inc(22983);
    }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hqbhqblccieto0.R.inc(22985);
        __CLR4_4_1hqbhqblccieto0.R.inc(22986);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hqbhqblccieto0.R.inc(22987);zone = DateTimeZone.getDefault();
        __CLR4_4_1hqbhqblccieto0.R.inc(22988);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hqbhqblccieto0.R.inc(22989);
        __CLR4_4_1hqbhqblccieto0.R.inc(22990);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hqbhqblccieto0.R.inc(22991);DateTimeZone.setDefault(zone);
        __CLR4_4_1hqbhqblccieto0.R.inc(22992);zone = null;
    }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertySetDayOfYear13() {__CLR4_4_1hqbhqblccieto0.R.globalSliceStart(getClass().getName(),22993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryd5emhqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqbhqblccieto0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqbhqblccieto0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testPropertySetDayOfYear13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryd5emhqp(){try{__CLR4_4_1hqbhqblccieto0.R.inc(22993); 
     __CLR4_4_1hqbhqblccieto0.R.inc(22994);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hqbhqblccieto0.R.inc(22995);test.dayOfYear().set(4); 
     __CLR4_4_1hqbhqblccieto0.R.inc(22996);assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}
public void testParse_noFormatter104() throws Throwable {__CLR4_4_1hqbhqblccieto0.R.globalSliceStart(getClass().getName(),22997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ponymphqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqbhqblccieto0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqbhqblccieto0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ponymphqt() throws Throwable{try{__CLR4_4_1hqbhqblccieto0.R.inc(22997); 
     __CLR4_4_1hqbhqblccieto0.R.inc(22998);assertEquals(new LocalDate(2010, 6, 30, ISOChronology.getInstance(LONDON)), LocalDate.parse("2010-06-30")); 
     __CLR4_4_1hqbhqblccieto0.R.inc(22999);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}
public void testSetDayOfYear_int2105() {__CLR4_4_1hqbhqblccieto0.R.globalSliceStart(getClass().getName(),23000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4jhhhqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqbhqblccieto0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqbhqblccieto0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testSetDayOfYear_int2105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4jhhhqw(){try{__CLR4_4_1hqbhqblccieto0.R.inc(23000); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23001);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23002);try { 
         __CLR4_4_1hqbhqblccieto0.R.inc(23003);test.setDayOfYear(366); 
         __CLR4_4_1hqbhqblccieto0.R.inc(23004);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hqbhqblccieto0.R.inc(23005);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}
@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP106() {__CLR4_4_1hqbhqblccieto0.R.globalSliceStart(getClass().getName(),23006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12npy0rhr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqbhqblccieto0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqbhqblccieto0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testIsContiguous_RP106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12npy0rhr2(){try{__CLR4_4_1hqbhqblccieto0.R.inc(23006); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23007);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23008);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23009);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23010);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23011);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23012);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23013);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23014);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23015);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23016);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23017);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23018);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23019);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23020);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hqbhqblccieto0.R.inc(23021);try { 
         __CLR4_4_1hqbhqblccieto0.R.inc(23022);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hqbhqblccieto0.R.inc(23023);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hqbhqblccieto0.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

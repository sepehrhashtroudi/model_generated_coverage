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
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1ifdifdle6np4gt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,23944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ifdifdle6np4gt.R.inc(23881);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23882);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ifdifdle6np4gt.R.inc(23883);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23884);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1ifdifdle6np4gt.R.inc(23886);try{__CLR4_4_1ifdifdle6np4gt.R.inc(23885);
    }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ifdifdle6np4gt.R.inc(23887);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23888);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23889);zone = DateTimeZone.getDefault();
        __CLR4_4_1ifdifdle6np4gt.R.inc(23890);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ifdifdle6np4gt.R.inc(23891);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23892);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ifdifdle6np4gt.R.inc(23893);DateTimeZone.setDefault(zone);
        __CLR4_4_1ifdifdle6np4gt.R.inc(23894);zone = null;
    }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_ObjectStringEx253() throws Throwable {__CLR4_4_1ifdifdle6np4gt.R.globalSliceStart(getClass().getName(),23895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11faue5ifr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifdifdle6np4gt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifdifdle6np4gt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx253",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11faue5ifr() throws Throwable{try{__CLR4_4_1ifdifdle6np4gt.R.inc(23895); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23896);try { 
         __CLR4_4_1ifdifdle6np4gt.R.inc(23897);new YearMonthDay("T10:20:30.040+14:00"); 
         __CLR4_4_1ifdifdle6np4gt.R.inc(23898);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}
public void testConstructor_DateTimeZone287() throws Throwable {__CLR4_4_1ifdifdle6np4gt.R.globalSliceStart(getClass().getName(),23899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlypyifv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifdifdle6np4gt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifdifdle6np4gt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlypyifv() throws Throwable{try{__CLR4_4_1ifdifdle6np4gt.R.inc(23899); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23900);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23901);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23902);LocalDate test = new LocalDate(LONDON); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23903);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23904);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23905);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23906);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23907);assertEquals(test, LocalDate.now(LONDON)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23908);test = new LocalDate(PARIS); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23909);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23910);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23911);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23912);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23913);assertEquals(test, LocalDate.now(PARIS)); 
 }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}
public void testConstructor_Chronology288() throws Throwable {__CLR4_4_1ifdifdle6np4gt.R.globalSliceStart(getClass().getName(),23914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197caqeiga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifdifdle6np4gt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifdifdle6np4gt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197caqeiga() throws Throwable{try{__CLR4_4_1ifdifdle6np4gt.R.inc(23914); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23915);LocalDate test = new LocalDate(GREGORIAN_PARIS); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23916);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23917);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23918);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23919);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23920);assertEquals(test, LocalDate.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}
public void testConstructor_nullObject291() throws Throwable {__CLR4_4_1ifdifdle6np4gt.R.globalSliceStart(getClass().getName(),23921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ui5m4igh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifdifdle6np4gt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifdifdle6np4gt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ui5m4igh() throws Throwable{try{__CLR4_4_1ifdifdle6np4gt.R.inc(23921); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23922);LocalDate test = new LocalDate((Object) null); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23923);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23924);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23925);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23926);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}
public void testIsEqual_LocalDate292() {__CLR4_4_1ifdifdle6np4gt.R.globalSliceStart(getClass().getName(),23927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryrq00ign();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ifdifdle6np4gt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ifdifdle6np4gt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testIsEqual_LocalDate292",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryrq00ign(){try{__CLR4_4_1ifdifdle6np4gt.R.inc(23927); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23928);LocalDate test1 = new LocalDate(2005, 6, 2); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23929);LocalDate test1a = new LocalDate(2005, 6, 2); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23930);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23931);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23932);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23933);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23934);LocalDate test2 = new LocalDate(2005, 7, 2); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23935);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23936);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23937);LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23938);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23939);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23940);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1ifdifdle6np4gt.R.inc(23941);try { 
         __CLR4_4_1ifdifdle6np4gt.R.inc(23942);new LocalDate(2005, 7, 2).isEqual(null); 
         __CLR4_4_1ifdifdle6np4gt.R.inc(23943);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ifdifdle6np4gt.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

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
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1ku0ku0le6qe9o0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,27079,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27000);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27001);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27002);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27003);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1ku0ku0le6qe9o0.R.inc(27005);try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27004);
    }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27006);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27007);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27008);zone = DateTimeZone.getDefault();
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27009);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27010);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27011);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27012);DateTimeZone.setDefault(zone);
        __CLR4_4_1ku0ku0le6qe9o0.R.inc(27013);zone = null;
    }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_ObjectString2144() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1daz7sdkue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString2144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1daz7sdkue() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27014); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27015);LocalDate test = new LocalDate("1972-037"); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27016);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27017);assertEquals(1972, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27018);assertEquals(2, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27019);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testParse_noFormatter443() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175okj5kuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter443",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175okj5kuk() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27020); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27021);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30")); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27022);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testConstructor699() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aq0w4rkun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor699",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aq0w4rkun() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27023); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27024);LocalDate test = new LocalDate(); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27025);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27026);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27027);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27028);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27029);assertEquals(test, LocalDate.now()); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testConstructor_DateTimeZone700() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6pszkkuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone700",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6pszkkuu() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27030); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27031);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27032);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27033);LocalDate test = new LocalDate(LONDON); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27034);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27035);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27036);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27037);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27038);assertEquals(test, LocalDate.now(LONDON)); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27039);test = new LocalDate(PARIS); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27040);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27041);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27042);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27043);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27044);assertEquals(test, LocalDate.now(PARIS)); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testConstructor_Chronology701() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qzgz4kv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology701",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qzgz4kv9() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27045); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27046);LocalDate test = new LocalDate(GREGORIAN_PARIS); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27047);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27048);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27049);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27050);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27051);assertEquals(test, LocalDate.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testFactory_fromCalendarFields702() throws Exception {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1id85hkkvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1id85hkkvg() throws Exception{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27052); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27053);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27054);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27055);LocalDate expected = new LocalDate(1970, 2, 3); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27056);assertEquals(expected, LocalDate.fromCalendarFields(cal)); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testFactory_fromCalendarFields_null703() throws Exception {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knmu0zkvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_null703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knmu0zkvl() throws Exception{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27057); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27058);try { 
         __CLR4_4_1ku0ku0le6qe9o0.R.inc(27059);LocalDate.fromCalendarFields((Calendar) null); 
         __CLR4_4_1ku0ku0le6qe9o0.R.inc(27060);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testFactory_fromDateFields_null705() throws Exception {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1litoejkvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_null705",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1litoejkvp() throws Exception{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27061); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27062);try { 
         __CLR4_4_1ku0ku0le6qe9o0.R.inc(27063);LocalDate.fromDateFields((Date) null); 
         __CLR4_4_1ku0ku0le6qe9o0.R.inc(27064);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone707() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i662g0kvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullDateTimeZone707",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i662g0kvt() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27065); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27066);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27067);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27068);LocalDate test = new LocalDate((DateTimeZone) null); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27069);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27070);assertEquals(2005, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27071);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27072);assertEquals(8, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 


public void testConstructor_nullObject_nullDateTimeZone710() throws Throwable {__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceStart(getClass().getName(),27073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfftcdkw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ku0ku0le6qe9o0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ku0ku0le6qe9o0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullDateTimeZone710",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfftcdkw1() throws Throwable{try{__CLR4_4_1ku0ku0le6qe9o0.R.inc(27073); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27074);LocalDate test = new LocalDate((Object) null, (DateTimeZone) null); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27075);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27076);assertEquals(1970, test.getYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27077);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ku0ku0le6qe9o0.R.inc(27078);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ku0ku0le6qe9o0.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

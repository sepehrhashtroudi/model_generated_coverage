/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1p69p69le6qsfcp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1p69p69le6qsfcp.R.inc(32625);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32626);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p69p69le6qsfcp.R.inc(32627);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32628);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1p69p69le6qsfcp.R.inc(32630);try{__CLR4_4_1p69p69le6qsfcp.R.inc(32629);
    }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p69p69le6qsfcp.R.inc(32631);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32632);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32633);zone = DateTimeZone.getDefault();
        __CLR4_4_1p69p69le6qsfcp.R.inc(32634);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p69p69le6qsfcp.R.inc(32635);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32636);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p69p69le6qsfcp.R.inc(32637);DateTimeZone.setDefault(zone);
        __CLR4_4_1p69p69le6qsfcp.R.inc(32638);zone = null;
    }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor320() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1si4oj4p6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1si4oj4p6n() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32639); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32640);YearMonth test = new YearMonth(); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32641);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32642);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32643);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32644);assertEquals(test, YearMonth.now()); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_DateTimeZone321() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdqacbp6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdqacbp6t() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32645); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32646);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32647);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32648);YearMonth test = new YearMonth(LONDON); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32649);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32650);assertEquals(2005, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32651);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32652);assertEquals(test, YearMonth.now(LONDON)); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32653);test = new YearMonth(PARIS); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32654);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32655);assertEquals(2005, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32656);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32657);assertEquals(test, YearMonth.now(PARIS)); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_Chronology322() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xzybvp76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xzybvp76() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32658); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32659);YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32660);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32661);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32662);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32663);assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testParse_noFormatter323() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kkd80p7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kkd80p7c() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32664); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32665);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32666);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testFactory_FromCalendarFields324() throws Exception {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xmassp7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xmassp7f() throws Exception{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32667); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32668);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32669);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32670);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32671);assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32672);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32673);YearMonth.fromCalendarFields(null); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32674);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testFactory_FromDateFields325() throws Exception {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147h70lp7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromDateFields325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147h70lp7n() throws Exception{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32675); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32676);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32677);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32678);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32679);assertEquals(expected, YearMonth.fromDateFields(cal.getTime())); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32680);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32681);YearMonth.fromDateFields(null); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32682);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_nullChronology326() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqzzuwp7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqzzuwp7v() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32683); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32684);YearMonth test = new YearMonth((Chronology) null); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32685);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32686);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32687);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_long1_Chronology327() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cheuhyp80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cheuhyp80() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32688); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32689);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32690);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32691);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32692);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology328() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ei68u0p85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology328",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ei68u0p85() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32693); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32694);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32695);YearMonth test = new YearMonth(date, null); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32696);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32697);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32698);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testParse_formatter1104() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6cq7rp8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6cq7rp8b() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32699); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32700);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32701);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f)); 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 


public void testConstructor_int_int_Chronology1340() throws Throwable {__CLR4_4_1p69p69le6qsfcp.R.globalSliceStart(getClass().getName(),32702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ca7n2kp8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p69p69le6qsfcp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p69p69le6qsfcp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology1340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ca7n2kp8e() throws Throwable{try{__CLR4_4_1p69p69le6qsfcp.R.inc(32702); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32703);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32704);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32705);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32706);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32707);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32708);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32709);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32710);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32711);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32712);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32713);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32714);new YearMonth(1970, 0, GREGORIAN_PARIS); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32715);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p69p69le6qsfcp.R.inc(32716);try { 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32717);new YearMonth(1970, 13, GREGORIAN_PARIS); 
         __CLR4_4_1p69p69le6qsfcp.R.inc(32718);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p69p69le6qsfcp.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, Chronology=null)
     */
    

}

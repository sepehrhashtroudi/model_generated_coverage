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
public class TestYearMonth_Constructors extends TestCase {static class __CLR4_4_1p70p70le6rcmcr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32744,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1p70p70le6rcmcr.R.inc(32652);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32653);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p70p70le6rcmcr.R.inc(32654);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32655);return new TestSuite(TestYearMonth_Constructors.class);
    }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}}

    public TestYearMonth_Constructors(String name) {
        super(name);__CLR4_4_1p70p70le6rcmcr.R.inc(32657);try{__CLR4_4_1p70p70le6rcmcr.R.inc(32656);
    }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p70p70le6rcmcr.R.inc(32658);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32659);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32660);zone = DateTimeZone.getDefault();
        __CLR4_4_1p70p70le6rcmcr.R.inc(32661);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p70p70le6rcmcr.R.inc(32662);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32663);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p70p70le6rcmcr.R.inc(32664);DateTimeZone.setDefault(zone);
        __CLR4_4_1p70p70le6rcmcr.R.inc(32665);zone = null;
    }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor355() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vbt2qp7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vbt2qp7e() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32666); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32667);YearMonth test = new YearMonth(); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32668);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32669);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32670);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32671);assertEquals(test, YearMonth.now()); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_DateTimeZone356() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9xa0zp7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_DateTimeZone356",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9xa0zp7k() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32672); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32673);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32674);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32675);YearMonth test = new YearMonth(LONDON); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32676);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32677);assertEquals(2005, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32678);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32679);assertEquals(test, YearMonth.now(LONDON)); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32680);test = new YearMonth(PARIS); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32681);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32682);assertEquals(2005, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32683);assertEquals(7, test.getMonthOfYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32684);assertEquals(test, YearMonth.now(PARIS)); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_Chronology357() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpnm1fp7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Chronology357",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpnm1fp7x() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32685); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32686);YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32687);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32688);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32689);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32690);assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testParse_noFormatter358() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3375ap83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_noFormatter358",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3375ap83() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32691); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32692);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32693);assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testFactory_FromCalendarFields359() throws Exception {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfu6t2p86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testFactory_FromCalendarFields359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfu6t2p86() throws Exception{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32694); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32695);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32696);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32697);YearMonth expected = new YearMonth(1970, 2); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32698);assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32699);try { 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32700);YearMonth.fromCalendarFields(null); 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32701);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_nullChronology360() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxsao2p8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_nullChronology360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxsao2p8e() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32702); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32703);YearMonth test = new YearMonth((Chronology) null); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32704);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32705);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32706);assertEquals(6, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_long1_Chronology361() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7dg10p8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_long1_Chronology361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7dg10p8j() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32707); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32708);YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32709);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32710);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32711);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_Object362() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1365xi8p8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1365xi8p8o() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32712); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32713);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32714);YearMonth test = new YearMonth(date); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32715);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32716);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32717);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology363() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxm2whp8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_Object_nullChronology363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxm2whp8u() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32718); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32719);Date date = new Date(TEST_TIME1); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32720);YearMonth test = new YearMonth(date, null); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32721);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32722);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32723);assertEquals(4, test.getMonthOfYear()); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testParse_formatter1105() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfcp08p90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testParse_formatter1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfcp08p90() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32724); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32725);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32726);assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f)); 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 


public void testConstructor_int_int_Chronology1350() throws Throwable {__CLR4_4_1p70p70le6rcmcr.R.globalSliceStart(getClass().getName(),32727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfn9gzp93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p70p70le6rcmcr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p70p70le6rcmcr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Constructors.testConstructor_int_int_Chronology1350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfn9gzp93() throws Throwable{try{__CLR4_4_1p70p70le6rcmcr.R.inc(32727); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32728);YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32729);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32730);assertEquals(1970, test.getYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32731);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32732);try { 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32733);new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32734);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32735);try { 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32736);new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS); 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32737);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32738);try { 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32739);new YearMonth(1970, 0, GREGORIAN_PARIS); 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32740);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p70p70le6rcmcr.R.inc(32741);try { 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32742);new YearMonth(1970, 13, GREGORIAN_PARIS); 
         __CLR4_4_1p70p70le6rcmcr.R.inc(32743);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p70p70le6rcmcr.R.flushNeeded();}} 

    

    

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

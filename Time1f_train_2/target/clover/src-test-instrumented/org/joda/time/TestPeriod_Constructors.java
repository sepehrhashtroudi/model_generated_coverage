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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1nxcnxcle6qsf9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,31214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31008);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31009);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31010);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31011);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1nxcnxcle6qsf9p.R.inc(31013);try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31012);
    }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31014);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31015);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31016);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31017);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31018);originalLocale = Locale.getDefault();
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31019);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31020);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31021);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31022);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31023);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31024);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31025);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31026);Locale.setDefault(originalLocale);
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31027);originalDateTimeZone = null;
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31028);originalTimeZone = null;
        __CLR4_4_1nxcnxcle6qsf9p.R.inc(31029);originalLocale = null;
    }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference252() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18g7zopnxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18g7zopnxy() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31030); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31031);YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31032);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31033);Period.fieldDifference(ymd, (ReadablePartial) null); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31034);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31035);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31036);Period.fieldDifference((ReadablePartial) null, ymd); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31037);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testFactoryFieldDifference553() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bls3hhny6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference553",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bls3hhny6() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31038); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31039);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31040);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31041);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31042);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31043);Period.fieldDifference(start, end); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31044);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference154() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mmrcnyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference154",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mmrcnyd() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31045); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31046);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31047);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31048);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31049);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31050);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31051);assertEquals(-1, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31052);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31053);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31054);assertEquals(-2, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31055);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31056);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31057);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31058);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_long_Chronology257() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sf26rbnyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_Chronology257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sf26rbnyr() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31059); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31060);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31061);Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31062);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31063);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31064);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31065);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31066);assertEquals(4, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31067);assertEquals(5, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31068);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31069);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31070);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_long_long258() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emcljonz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emcljonz3() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31071); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31072);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31073);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31074);Period test = new Period(dt1.getMillis(), dt2.getMillis()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31075);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31076);assertEquals(1, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31077);assertEquals(1, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31078);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31079);assertEquals(1, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31080);assertEquals(1, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31081);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31082);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31083);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_long_long_PeriodType259() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcrl9nnzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_long_long_PeriodType259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcrl9nnzg() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31084); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31085);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31086);DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31087);Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31088);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31089);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31090);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31091);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31092);assertEquals(31, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31093);assertEquals(1, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31094);assertEquals(1, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31095);assertEquals(1, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31096);assertEquals(1, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths61() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13l1ox5nzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13l1ox5nzt() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31097); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31098);DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31099);DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31100);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31101);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31102);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP262() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah9vd9nzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah9vd9nzz() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31103); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31104);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31105);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31106);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31107);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31108);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31109);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31110);assertEquals(1, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31111);assertEquals(1, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31112);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31113);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31114);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31115);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType263() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmbbmko0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmbbmko0c() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31116); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31117);YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31118);YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31119);Period test = new Period(dt1, dt2, PeriodType.yearMonthDay()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31120);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31121);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31122);assertEquals(11, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31123);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31124);assertEquals(8, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31125);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31126);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31127);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31128);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_RI_RD264() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tbjifgo0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RD264",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tbjifgo0p() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31129); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31130);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31131);Duration dur = null; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31132);Period test = new Period(dt1, dur); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31133);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31134);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31135);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31136);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31137);assertEquals(0, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31138);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31139);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31140);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31141);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_RD_RI265() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r074x7o12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r074x7o12() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31142); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31143);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31144);Duration dur = null; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31145);Period test = new Period(dur, dt1); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31146);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31147);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31148);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31149);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31150);assertEquals(0, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31151);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31152);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31153);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31154);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_Object_PeriodType166() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pa5vwo1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pa5vwo1f() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31155); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31156);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31157);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31158);assertEquals(1, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31159);assertEquals(2, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31160);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31161);assertEquals(3, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31162);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31163);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31164);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31165);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_RI_RI4414() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udlcr6o1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RI_RI4414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udlcr6o1q() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31166); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31167);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31168);DateTime dt2 = null; 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31169);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31170);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31171);assertEquals(-3, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31172);assertEquals(-1, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31173);assertEquals(-1, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31174);assertEquals(-1, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31175);assertEquals(0, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31176);assertEquals(-1, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31177);assertEquals(-1, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31178);assertEquals(-1, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths415() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8zvmyo23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths415",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8zvmyo23() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31179); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31180);LocalDate dt1 = new LocalDate(2004, 12, 28); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31181);LocalDate dt2 = new LocalDate(2005, 2, 28); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31182);Period test = new Period(dt1, dt2); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31183);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31184);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_Object3753() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yr2dhbo29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object3753",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yr2dhbo29() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31185); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31186);Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime())); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31187);assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31188);assertEquals(0, test.getYears()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31189);assertEquals(0, test.getMonths()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31190);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31191);assertEquals(0, test.getDays()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31192);assertEquals(1, test.getHours()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31193);assertEquals(2, test.getMinutes()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31194);assertEquals(3, test.getSeconds()); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31195);assertEquals(4, test.getMillis()); 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType8815() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czlp7no2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8815",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czlp7no2k() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31196); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31197);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31198);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31199);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31200);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31201);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType6816() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfz0u8o2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType6816",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfz0u8o2q() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31202); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31203);YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31204);TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31205);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31206);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31207);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 


public void testConstructor_RP_RP_PeriodType7817() throws Throwable {__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceStart(getClass().getName(),31208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcaeu8o2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nxcnxcle6qsf9p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nxcnxcle6qsf9p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType7817",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcaeu8o2w() throws Throwable{try{__CLR4_4_1nxcnxcle6qsf9p.R.inc(31208); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31209);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31210);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1nxcnxcle6qsf9p.R.inc(31211);try { 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31212);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1nxcnxcle6qsf9p.R.inc(31213);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1nxcnxcle6qsf9p.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

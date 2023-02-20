/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for ISOPeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISOPeriodFormat extends TestCase {static class __CLR4_4_1m2hm2hle6np4vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,28636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28601);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28602);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28603);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28604);return new TestSuite(TestISOPeriodFormat.class);
    }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}

    public TestISOPeriodFormat(String name) {
        super(name);__CLR4_4_1m2hm2hle6np4vz.R.inc(28606);try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28605);
    }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28607);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28608);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28609);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28610);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28611);originalLocale = Locale.getDefault();
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28612);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28613);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28614);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28615);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28616);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28617);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28618);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28619);Locale.setDefault(originalLocale);
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28620);originalDateTimeZone = null;
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28621);originalTimeZone = null;
        __CLR4_4_1m2hm2hle6np4vz.R.inc(28622);originalLocale = null;
    }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormatAlternateExtendedWithWeeks89() {__CLR4_4_1m2hm2hle6np4vz.R.globalSliceStart(getClass().getName(),28623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11q0tsnm33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m2hm2hle6np4vz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m2hm2hle6np4vz.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISOPeriodFormat.testFormatAlternateExtendedWithWeeks89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11q0tsnm33(){try{__CLR4_4_1m2hm2hle6np4vz.R.inc(28623); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28624);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28625);assertEquals("P0001-02-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28626);p = new Period(1, 2, 3, 4, 5, 6, 7, 0); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28627);assertEquals("P0001-02-04T05:06:07", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28628);p = new Period(0); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28629);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28630);p = new Period(0, PeriodType.standard().withMillisRemoved().withSecondsRemoved()); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28631);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(p)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28632);assertEquals("P0001-00-04T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(YEAR_DAY_PERIOD)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28633);assertEquals("P0000-00-00T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(EMPTY_YEAR_DAY_PERIOD)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28634);assertEquals("P0001-02-04T00:00:00", ISOPeriodFormat.alternateExtendedWithWeeks().print(DATE_PERIOD)); 
     __CLR4_4_1m2hm2hle6np4vz.R.inc(28635);assertEquals("P0000-00-00T05:06:07.008", ISOPeriodFormat.alternateExtendedWithWeeks().print(TIME_PERIOD)); 
 }finally{__CLR4_4_1m2hm2hle6np4vz.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}

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

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1m1jm1jle6nl8qf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28624,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
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

    public static void main(String[] args) {try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28567);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28568);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28569);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28570);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1m1jm1jle6nl8qf.R.inc(28572);try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28571);
    }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28573);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28574);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28575);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28576);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28577);originalLocale = Locale.getDefault();
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28578);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28579);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28580);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28581);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28582);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28583);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28584);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28585);Locale.setDefault(originalLocale);
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28586);originalDateTimeZone = null;
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28587);originalTimeZone = null;
        __CLR4_4_1m1jm1jle6nl8qf.R.inc(28588);originalLocale = null;
    }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_yearMonthDay376() {__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceStart(getClass().getName(),28589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11edt5im25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m1jm1jle6nl8qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11edt5im25(){try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28589); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28590);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28591);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28592);dt = dt.withZone(LONDON); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28593);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28594);dt = dt.withZone(PARIS); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28595);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
 }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}
public void testFormat_weekyear377() {__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceStart(getClass().getName(),28596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6jz8zm2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m1jm1jle6nl8qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6jz8zm2c(){try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28596); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28597);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28598);assertEquals("2004-W24", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28599);dt = dt.withZone(LONDON); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28600);assertEquals("2004-W24", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28601);dt = dt.withZone(PARIS); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28602);assertEquals("2004-W24", ISODateTimeFormat.weekyear().print(dt)); 
 }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}
public void testFormat_weekyearWeekDay378() {__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceStart(getClass().getName(),28603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9cmp2m2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m1jm1jle6nl8qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9cmp2m2j(){try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28603); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28604);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28605);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28606);dt = dt.withZone(LONDON); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28607);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28608);dt = dt.withZone(PARIS); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28609);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
 }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}
public void testFormat_dateHourMinuteSecondMillis379() {__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceStart(getClass().getName(),28610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ib5tqem2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m1jm1jle6nl8qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ib5tqem2q(){try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28610); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28611);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28612);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28613);dt = dt.withZone(LONDON); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28614);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28615);dt = dt.withZone(PARIS); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28616);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}
public void testFormat_dateHourMinuteSecondFraction380() {__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceStart(getClass().getName(),28617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qus5nkm2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m1jm1jle6nl8qf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m1jm1jle6nl8qf.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction380",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qus5nkm2x(){try{__CLR4_4_1m1jm1jle6nl8qf.R.inc(28617); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28618);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28619);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28620);dt = dt.withZone(LONDON); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28621);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28622);dt = dt.withZone(PARIS); 
     __CLR4_4_1m1jm1jle6nl8qf.R.inc(28623);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1m1jm1jle6nl8qf.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

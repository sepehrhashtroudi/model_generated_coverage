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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1mefmefle6ndq5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,29116,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1mefmefle6ndq5u.R.inc(29031);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29032);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mefmefle6ndq5u.R.inc(29033);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29034);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1mefmefle6ndq5u.R.inc(29036);try{__CLR4_4_1mefmefle6ndq5u.R.inc(29035);
    }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mefmefle6ndq5u.R.inc(29037);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29038);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29039);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mefmefle6ndq5u.R.inc(29040);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mefmefle6ndq5u.R.inc(29041);originalLocale = Locale.getDefault();
        __CLR4_4_1mefmefle6ndq5u.R.inc(29042);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29043);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mefmefle6ndq5u.R.inc(29044);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mefmefle6ndq5u.R.inc(29045);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29046);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mefmefle6ndq5u.R.inc(29047);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29048);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29049);Locale.setDefault(originalLocale);
        __CLR4_4_1mefmefle6ndq5u.R.inc(29050);originalDateTimeZone = null;
        __CLR4_4_1mefmefle6ndq5u.R.inc(29051);originalTimeZone = null;
        __CLR4_4_1mefmefle6ndq5u.R.inc(29052);originalLocale = null;
    }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testFormat_date352() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgh6xfmf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgh6xfmf1(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29053); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29054);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29055);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29056);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29057);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29058);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29059);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_time353() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5i5bfmf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5i5bfmf8(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29060); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29061);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29062);assertEquals("10:20:30", ISODateTimeFormat.time().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29063);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29064);assertEquals("11:20:30", ISODateTimeFormat.time().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29065);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29066);assertEquals("12:20:30", ISODateTimeFormat.time().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_weekDate359() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adqc12mff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adqc12mff(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29067); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29068);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29069);assertEquals("2004-W24", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29070);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29071);assertEquals("2004-W24", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29072);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29073);assertEquals("2004-W24", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_weekDate360() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1auljgcmfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1auljgcmfm(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29074); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29075);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29076);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29077);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29078);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29079);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29080);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_hourMinute362() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1344uqwmft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1344uqwmft(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29081); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29082);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29083);assertEquals("10", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29084);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29085);assertEquals("11", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29086);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29087);assertEquals("12", ISODateTimeFormat.hourMinute().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_hourMinuteSecond363() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u7fclmg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond363",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u7fclmg0(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29088); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29089);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29090);assertEquals("10", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29091);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29092);assertEquals("11", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29093);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29094);assertEquals("12", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_hourMinuteSecondMillis364() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn7tsgmg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis364",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn7tsgmg7(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29095); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29096);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29097);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29098);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29099);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29100);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29101);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_hourMinuteSecondFraction365() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17a2wobmge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17a2wobmge(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29102); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29103);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29104);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29105);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29106);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29107);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29108);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
public void testFormat_dateHourMinute366() {__CLR4_4_1mefmefle6ndq5u.R.globalSliceStart(getClass().getName(),29109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kekulamgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mefmefle6ndq5u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mefmefle6ndq5u.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kekulamgl(){try{__CLR4_4_1mefmefle6ndq5u.R.inc(29109); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29110);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29111);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29112);dt = dt.withZone(LONDON); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29113);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29114);dt = dt.withZone(PARIS); 
     __CLR4_4_1mefmefle6ndq5u.R.inc(29115);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinute().print(dt)); 
 }finally{__CLR4_4_1mefmefle6ndq5u.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

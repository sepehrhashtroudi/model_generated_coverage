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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1tb1tb1le6qsfo3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,38142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(37981);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37982);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(37983);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37984);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1tb1tb1le6qsfo3.R.inc(37986);try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(37985);
    }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(37987);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37988);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37989);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37990);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37991);originalLocale = Locale.getDefault();
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37992);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37993);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37994);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(37995);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37996);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37997);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37998);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(37999);Locale.setDefault(originalLocale);
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(38000);originalDateTimeZone = null;
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(38001);originalTimeZone = null;
        __CLR4_4_1tb1tb1le6qsfo3.R.inc(38002);originalLocale = null;
    }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_weekDateTime811() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z32za2tbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime811",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z32za2tbn(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38003); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38004);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38005);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38006);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38007);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38008);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38009);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_date843() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14on752tbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14on752tbu(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38010); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38011);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38012);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38013);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38014);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38015);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38016);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_time_partial844() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1om40yutc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial844",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1om40yutc1(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38017); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38018);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38019);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_timeNoMillis_partial845() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzg7bgtc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial845",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzg7bgtc4(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38020); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38021);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38022);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_tTimeNoMillis847() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gdnsgtc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gdnsgtc7(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38023); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38024);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38025);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38026);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38027);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38028);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38029);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_weekDate853() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsix17tce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate853",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsix17tce(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38030); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38031);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38032);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38033);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38034);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38035);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38036);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_basicDateTimeNoMillis860() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2o8bjtcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis860",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2o8bjtcl(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38037); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38038);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38039);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38040);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38041);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38042);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38043);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_basicOrdinalDateTimeNoMillis862() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vbcu8tcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis862",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vbcu8tcs(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38044); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38045);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38046);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38047);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38048);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38049);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38050);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_basicWeekDate863() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn6bj2tcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate863",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn6bj2tcz(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38051); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38052);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38053);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38054);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38055);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38056);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38057);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_basicWeekDateTimeNoMillis864() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ufb0vtd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ufb0vtd6(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38058); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38059);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38060);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38061);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38062);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38063);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38064);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_year865() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rz64z9tdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year865",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rz64z9tdd(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38065); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38066);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38067);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38068);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38069);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38070);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38071);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_yearMonth866() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128v66qtdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth866",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128v66qtdk(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38072); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38073);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38074);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38075);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38076);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38077);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38078);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_weekyearWeek867() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdk58ltdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek867",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdk58ltdr(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38079); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38080);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38081);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38082);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38083);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38084);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38085);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_hour868() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urs20ptdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour868",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urs20ptdy(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38086); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38087);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38088);assertEquals("10", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38089);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38090);assertEquals("11", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38091);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38092);assertEquals("12", ISODateTimeFormat.hour().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_hourMinute869() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6v5yste5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute869",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6v5yste5(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38093); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38094);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38095);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38096);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38097);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38098);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38099);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_hourMinuteSecond870() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4sz7atec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond870",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4sz7atec(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38100); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38101);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38102);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38103);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38104);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38105);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38106);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondMillis871() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcm9xrtej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis871",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcm9xrtej(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38107); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38108);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38109);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38110);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38111);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38112);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38113);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondFraction872() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120in6eteq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction872",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120in6eteq(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38114); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38115);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38116);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38117);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38118);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38119);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38120);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_dateHour873() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vtxkdtex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour873",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vtxkdtex(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38121); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38122);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38123);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38124);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38125);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38126);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38127);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_dateHourMinute874() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy6d8gtf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute874",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy6d8gtf4(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38128); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38129);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38130);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38131);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38132);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38133);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38134);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecond875() {__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceStart(getClass().getName(),38135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b14to3tfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tb1tb1le6qsfo3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tb1tb1le6qsfo3.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond875",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b14to3tfb(){try{__CLR4_4_1tb1tb1le6qsfo3.R.inc(38135); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38136);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38137);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38138);dt = dt.withZone(LONDON); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38139);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38140);dt = dt.withZone(PARIS); 
     __CLR4_4_1tb1tb1le6qsfo3.R.inc(38141);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tb1tb1le6qsfo3.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

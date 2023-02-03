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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1v5yv5ylc8axf3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,40596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40390);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40391);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40392);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40393);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1v5yv5ylc8axf3g.R.inc(40395);try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40394);
    }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40396);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40397);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40398);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40399);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40400);originalLocale = Locale.getDefault();
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40401);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40402);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40403);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40404);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40405);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40406);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40407);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40408);Locale.setDefault(originalLocale);
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40409);originalDateTimeZone = null;
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40410);originalTimeZone = null;
        __CLR4_4_1v5yv5ylc8axf3g.R.inc(40411);originalLocale = null;
    }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_weekyearWeekDay66() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13snh08v6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay66",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13snh08v6k(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40412); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40413);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40414);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40415);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40416);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40417);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40418);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_basicTTime334() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcwc5qv6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcwc5qv6r(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40419); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40420);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40421);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40422);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40423);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40424);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40425);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_dateHourMinute342() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izz8bgv6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute342",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izz8bgv6y(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40426); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40427);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40428);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40429);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40430);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40431);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40432);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_weekDateTime406() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5mo58v75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5mo58v75(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40433); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40434);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40435);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40436);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40437);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40438);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40439);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_yearMonth433() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h36mduv7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h36mduv7c(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40440); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40441);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40442);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40443);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40444);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40445);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40446);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_date449() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncrd24v7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncrd24v7j(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40447); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40448);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40449);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40450);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40451);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40452);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40453);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_basicDateTimeNoMillis595() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6f9giv7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6f9giv7q(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40454); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40455);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40456);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40457);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40458);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40459);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40460);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_time_partial721() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmuzl4v7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial721",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmuzl4v7x(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40461); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40462);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40463);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_weekyear830() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ky396dv80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear830",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ky396dv80(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40464); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40465);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40466);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40467);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40468);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40469);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40470);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondFraction902() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xzsfyv87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction902",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xzsfyv87(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40471); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40472);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40473);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40474);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40475);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40476);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40477);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_weekyearWeek905() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fi7siev8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek905",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fi7siev8e(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40478); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40479);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40480);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40481);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40482);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40483);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40484);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_timeNoMillis_partial1163() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3p4vkv8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial1163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3p4vkv8l(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40485); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40486);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40487);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_basicOrdinalDateTimeNoMillis1188() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcacg2v8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis1188",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcacg2v8o(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40488); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40489);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40490);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40491);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40492);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40493);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40494);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_hourMinuteSecond1221() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjku95v8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjku95v8v(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40495); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40496);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40497);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40498);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40499);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40500);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40501);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondMillis1266() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x14a0yv92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis1266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x14a0yv92(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40502); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40503);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40504);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40505);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40506);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40507);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40508);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_weekDate1268() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ja8wyv99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate1268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ja8wyv99(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40509); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40510);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40511);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40512);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40513);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40514);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40515);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondFraction1320() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pi21ifv9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction1320",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pi21ifv9g(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40516); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40517);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40518);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40519);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40520);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40521);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40522);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_dateHour1402() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137olikv9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour1402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137olikv9n(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40523); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40524);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40525);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40526);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40527);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40528);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40529);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_basicWeekDate1549() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru9te2v9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate1549",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru9te2v9u(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40530); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40531);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40532);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40533);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40534);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40535);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40536);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecond1555() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z0cbl1va1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond1555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z0cbl1va1(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40537); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40538);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40539);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40540);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40541);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40542);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40543);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_tTimeNoMillis1614() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6aavzva8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis1614",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6aavzva8(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40544); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40545);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40546);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40547);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40548);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40549);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40550);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_basicWeekDateTimeNoMillis1631() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0val4vaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis1631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0val4vaf(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40551); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40552);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40553);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40554);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40555);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40556);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40557);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_yearMonthDay1650() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnar6evam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay1650",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnar6evam(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40558); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40559);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40560);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40561);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40562);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40563);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40564);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondMillis1651() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6wbqovat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis1651",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6wbqovat(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40565); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40566);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40567);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40568);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40569);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40570);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40571);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_year1670() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6o2ywvb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year1670",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6o2ywvb0(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40572); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40573);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40574);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40575);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40576);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40577);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40578);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testSubclassableConstructor1676() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xgv8fvb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor1676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xgv8fvb7(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40579); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40580);ISODateTimeFormat f = new ISODateTimeFormat() { 
     }; 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40581);assertNotNull(f); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_hour1720() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gatglvba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour1720",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gatglvba(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40582); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40583);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40584);assertEquals("10", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40585);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40586);assertEquals("11", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40587);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40588);assertEquals("12", ISODateTimeFormat.hour().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 


public void testFormat_hourMinute1722() {__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceStart(getClass().getName(),40589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejtdglvbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v5yv5ylc8axf3g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v5yv5ylc8axf3g.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute1722",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejtdglvbh(){try{__CLR4_4_1v5yv5ylc8axf3g.R.inc(40589); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40590);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40591);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40592);dt = dt.withZone(LONDON); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40593);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40594);dt = dt.withZone(PARIS); 
     __CLR4_4_1v5yv5ylc8axf3g.R.inc(40595);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt)); 
 }finally{__CLR4_4_1v5yv5ylc8axf3g.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

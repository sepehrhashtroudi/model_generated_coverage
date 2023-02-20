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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1tgttgtle6rjdpv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,38364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38189);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38190);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38191);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38192);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1tgttgtle6rjdpv.R.inc(38194);try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38193);
    }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38195);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38196);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38197);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38198);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38199);originalLocale = Locale.getDefault();
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38200);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38201);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38202);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38203);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38204);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38205);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38206);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38207);Locale.setDefault(originalLocale);
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38208);originalDateTimeZone = null;
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38209);originalTimeZone = null;
        __CLR4_4_1tgttgtle6rjdpv.R.inc(38210);originalLocale = null;
    }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSubclassableConstructor852() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0oae2thf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor852",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0oae2thf(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38211); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38212);ISODateTimeFormat f = new ISODateTimeFormat() { 
     }; 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38213);assertNotNull(f); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_date874() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gotfawthi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date874",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gotfawthi(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38214); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38215);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38216);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38217);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38218);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38219);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38220);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_time_partial875() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138neiwthp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial875",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138neiwthp(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38221); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38222);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38223);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_tTimeNoMillis877() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18o2zv1ths();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis877",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18o2zv1ths(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38224); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38225);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38226);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38227);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38228);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38229);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38230);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_weekDate882() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x2867thz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate882",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x2867thz(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38231); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38232);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38233);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38234);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38235);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38236);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38237);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_basicTTime886() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d03g4sti6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime886",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d03g4sti6(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38238); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38239);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38240);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38241);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38242);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38243);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38244);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_basicDateTimeNoMillis889() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq9ojqtid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis889",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq9ojqtid(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38245); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38246);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38247);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38248);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38249);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38250);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38251);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_basicOrdinalDateTimeNoMillis891() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1905c0stik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis891",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1905c0stik(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38252); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38253);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38254);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38255);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38256);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38257);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38258);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_basicWeekDateTimeNoMillis893() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipvzvvtir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis893",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipvzvvtir(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38259); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38260);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38261);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38262);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38263);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38264);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38265);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_year894() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3pg49tiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year894",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3pg49tiy(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38266); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38267);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38268);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38269);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38270);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38271);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38272);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_yearMonth895() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4bv1qtj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth895",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4bv1qtj5(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38273); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38274);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38275);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38276);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38277);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38278);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38279);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_yearMonthDay896() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1no1icztjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay896",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1no1icztjc(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38280); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38281);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38282);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38283);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38284);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38285);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38286);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_weekyear897() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wwa1itjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear897",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wwa1itjj(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38287); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38288);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38289);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38290);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38291);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38292);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38293);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_weekyearWeek898() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka3aaltjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek898",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka3aaltjq(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38294); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38295);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38296);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38297);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38298);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38299);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38300);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_weekyearWeekDay899() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wr3ov2tjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay899",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wr3ov2tjx(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38301); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38302);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38303);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38304);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38305);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38306);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38307);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_hourMinute900() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1il7inmtk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute900",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1il7inmtk4(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38308); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38309);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38310);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38311);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38312);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38313);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38314);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_hourMinuteSecond901() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pba39btkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond901",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pba39btkb(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38315); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38316);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38317);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38318);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38319);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38320);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38321);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondMillis902() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15655vqtki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis902",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15655vqtki(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38322); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38323);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38324);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38325);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38326);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38327);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38328);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondFraction903() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186zr8ftkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction903",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186zr8ftkp(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38329); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38330);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38331);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38332);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38333);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38334);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38335);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_dateHourMinute904() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5gjh4tkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute904",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5gjh4tkw(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38336); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38337);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38338);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38339);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38340);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38341);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38342);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecond905() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183noejtl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond905",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183noejtl3(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38343); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38344);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38345);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38346);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38347);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38348);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38349);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondMillis906() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdmb4tla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis906",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdmb4tla(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38350); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38351);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38352);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38353);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38354);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38355);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38356);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondFraction907() {__CLR4_4_1tgttgtle6rjdpv.R.globalSliceStart(getClass().getName(),38357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgog9htlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgttgtle6rjdpv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgttgtle6rjdpv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction907",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgog9htlh(){try{__CLR4_4_1tgttgtle6rjdpv.R.inc(38357); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38358);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38359);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38360);dt = dt.withZone(LONDON); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38361);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38362);dt = dt.withZone(PARIS); 
     __CLR4_4_1tgttgtle6rjdpv.R.inc(38363);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tgttgtle6rjdpv.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

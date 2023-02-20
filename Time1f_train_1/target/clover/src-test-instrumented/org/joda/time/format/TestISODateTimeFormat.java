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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1tiytiyle6qearv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,38420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1tiytiyle6qearv.R.inc(38266);
        __CLR4_4_1tiytiyle6qearv.R.inc(38267);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tiytiyle6qearv.R.inc(38268);
        __CLR4_4_1tiytiyle6qearv.R.inc(38269);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1tiytiyle6qearv.R.inc(38271);try{__CLR4_4_1tiytiyle6qearv.R.inc(38270);
    }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tiytiyle6qearv.R.inc(38272);
        __CLR4_4_1tiytiyle6qearv.R.inc(38273);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tiytiyle6qearv.R.inc(38274);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tiytiyle6qearv.R.inc(38275);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tiytiyle6qearv.R.inc(38276);originalLocale = Locale.getDefault();
        __CLR4_4_1tiytiyle6qearv.R.inc(38277);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tiytiyle6qearv.R.inc(38278);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tiytiyle6qearv.R.inc(38279);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tiytiyle6qearv.R.inc(38280);
        __CLR4_4_1tiytiyle6qearv.R.inc(38281);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tiytiyle6qearv.R.inc(38282);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tiytiyle6qearv.R.inc(38283);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tiytiyle6qearv.R.inc(38284);Locale.setDefault(originalLocale);
        __CLR4_4_1tiytiyle6qearv.R.inc(38285);originalDateTimeZone = null;
        __CLR4_4_1tiytiyle6qearv.R.inc(38286);originalTimeZone = null;
        __CLR4_4_1tiytiyle6qearv.R.inc(38287);originalLocale = null;
    }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_weekDateTime821() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168665jtjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime821",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168665jtjk(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38288); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38289);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38290);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38291);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38292);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38293);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38294);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testSubclassableConstructor837() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156a7jntjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor837",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156a7jntjr(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38295); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38296);ISODateTimeFormat f = new ISODateTimeFormat() { 
     }; 
     __CLR4_4_1tiytiyle6qearv.R.inc(38297);assertNotNull(f); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_timeNoMillis_partial862() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gp9pe7tju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial862",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gp9pe7tju(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38298); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38299);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38300);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_tTimeNoMillis864() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1usrt1xtjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1usrt1xtjx(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38301); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38302);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38303);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38304);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38305);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38306);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38307);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_basicTTime870() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18t5wjztk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime870",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18t5wjztk4(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38308); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38309);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38310);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38311);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38312);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38313);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38314);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_basicDateTimeNoMillis873() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihl0qntkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis873",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihl0qntkb(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38315); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38316);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38317);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38318);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38319);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38320);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38321);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_basicOrdinalDateTimeNoMillis875() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xljg2qtki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis875",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xljg2qtki(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38322); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38323);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38324);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38325);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38326);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38327);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38328);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_basicWeekDate876() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atohdwtkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate876",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atohdwtkp(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38329); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38330);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38331);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38332);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38333);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38334);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38335);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_basicWeekDateTimeNoMillis878() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogtz8utkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis878",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogtz8utkw(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38336); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38337);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38338);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38339);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38340);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38341);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38342);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_year879() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqomq6tl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year879",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqomq6tl3(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38343); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38344);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38345);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38346);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38347);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38348);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38349);assertEquals("2004", ISODateTimeFormat.year().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_yearMonth880() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suivg6tla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth880",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suivg6tla(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38350); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38351);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38352);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38353);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38354);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38355);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38356);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_yearMonthDay881() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11e7t49tlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay881",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11e7t49tlh(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38357); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38358);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38359);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38360);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38361);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38362);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38363);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_weekyear882() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz5liqtlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear882",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz5liqtlo(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38364); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38365);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38366);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38367);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38368);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38369);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38370);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_weekyearWeek883() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14s616ntlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek883",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14s616ntlv(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38371); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38372);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38373);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38374);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38375);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38376);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38377);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_weekyearWeekDay884() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7r1mutm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay884",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7r1mutm2(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38378); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38379);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38380);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38381);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38382);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38383);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38384);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_hour885() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwxuoytm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour885",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwxuoytm9(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38385); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38386);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38387);assertEquals("10", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38388);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38389);assertEquals("11", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38390);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38391);assertEquals("12", ISODateTimeFormat.hour().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_dateHour886() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wl0vcltmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour886",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wl0vcltmg(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38392); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38393);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38394);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38395);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38396);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38397);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38398);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecond887() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6q0getmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond887",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6q0getmn(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38399); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38400);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38401);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38402);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38403);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38404);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38405);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondMillis888() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3rb61tmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis888",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3rb61tmu(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38406); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38407);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38408);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38409);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38410);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38411);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38412);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondFraction889() {__CLR4_4_1tiytiyle6qearv.R.globalSliceStart(getClass().getName(),38413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18a1wuqtn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tiytiyle6qearv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tiytiyle6qearv.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction889",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18a1wuqtn1(){try{__CLR4_4_1tiytiyle6qearv.R.inc(38413); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38414);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38415);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38416);dt = dt.withZone(LONDON); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38417);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38418);dt = dt.withZone(PARIS); 
     __CLR4_4_1tiytiyle6qearv.R.inc(38419);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tiytiyle6qearv.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

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
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_1tamtamle6rcn2t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,38144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1tamtamle6rcn2t.R.inc(37966);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37967);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tamtamle6rcn2t.R.inc(37968);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37969);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_1tamtamle6rcn2t.R.inc(37971);try{__CLR4_4_1tamtamle6rcn2t.R.inc(37970);
    }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tamtamle6rcn2t.R.inc(37972);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37973);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37974);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1tamtamle6rcn2t.R.inc(37975);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1tamtamle6rcn2t.R.inc(37976);originalLocale = Locale.getDefault();
        __CLR4_4_1tamtamle6rcn2t.R.inc(37977);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37978);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1tamtamle6rcn2t.R.inc(37979);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tamtamle6rcn2t.R.inc(37980);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37981);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tamtamle6rcn2t.R.inc(37982);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37983);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37984);Locale.setDefault(originalLocale);
        __CLR4_4_1tamtamle6rcn2t.R.inc(37985);originalDateTimeZone = null;
        __CLR4_4_1tamtamle6rcn2t.R.inc(37986);originalTimeZone = null;
        __CLR4_4_1tamtamle6rcn2t.R.inc(37987);originalLocale = null;
    }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFormat_weekDateTime818() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),37988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d71b5rtb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime818",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d71b5rtb8(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(37988); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37989);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37990);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37991);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37992);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37993);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37994);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testSubclassableConstructor831() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),37995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ooa0ahtbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor831",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ooa0ahtbf(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(37995); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37996);ISODateTimeFormat f = new ISODateTimeFormat() { 
     }; 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37997);assertNotNull(f); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_date852() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),37998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls7qm0tbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date852",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls7qm0tbi(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(37998); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(37999);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38000);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38001);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38002);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38003);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38004);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_time_partial853() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11uqws8tbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial853",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11uqws8tbp(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38005); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38006);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38007);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_timeNoMillis_partial854() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16il9ketbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial854",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16il9ketbs(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38008); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38009);Partial dt = new Partial(new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }, new int[] { 10, 20, 30, 40 }); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38010);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_tTimeNoMillis855() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drhb65tbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drhb65tbv(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38011); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38012);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38013);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38014);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38015);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38016);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38017);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_weekDate860() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16c34xtc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate860",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16c34xtc2(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38018); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38019);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38020);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38021);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38022);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38023);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38024);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_basicTTime864() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wp4totc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wp4totc9(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38025); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38026);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38027);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38028);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38029);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38030);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38031);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_basicOrdinalDateTimeNoMillis867() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adoh45tcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis867",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adoh45tcg(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38032); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38033);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38034);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38035);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38036);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38037);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38038);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_basicWeekDate868() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ce6hkptcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate868",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ce6hkptcn(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38039); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38040);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38041);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38042);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38043);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38044);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38045);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_yearMonthDay870() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkn27rtcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay870",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkn27rtcu(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38046); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38047);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38048);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38049);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38050);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38051);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38052);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_weekyear871() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110aq6qtd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear871",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110aq6qtd1(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38053); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38054);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38055);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38056);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38057);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38058);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38059);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_weekyearWeek872() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6ou5dtd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek872",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6ou5dtd8(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38060); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38061);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38062);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38063);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38064);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38065);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38066);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_weekyearWeekDay873() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oui50atdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay873",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oui50atdf(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38067); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38068);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38069);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38070);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38071);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38072);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38073);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_hour874() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1x0n2tdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour874",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1x0n2tdm(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38074); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38075);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38076);assertEquals("10", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38077);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38078);assertEquals("11", ISODateTimeFormat.hour().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38079);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38080);assertEquals("12", ISODateTimeFormat.hour().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_hourMinute875() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwq7cftdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute875",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwq7cftdt(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38081); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38082);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38083);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38084);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38085);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38086);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38087);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_hourMinuteSecond876() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1weba10te0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond876",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1weba10te0(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38088); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38089);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38090);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38091);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38092);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38093);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38094);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondMillis877() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185dit3te7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis877",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185dit3te7(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38095); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38096);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38097);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38098);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38099);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38100);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38101);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_hourMinuteSecondFraction878() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liifx8tee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction878",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liifx8tee(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38102); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38103);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38104);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38105);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38106);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38107);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38108);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_dateHour879() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cm5v6htel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour879",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cm5v6htel(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38109); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38110);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38111);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38112);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38113);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38114);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38115);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_dateHourMinute880() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld2nd1tes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute880",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld2nd1tes(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38116); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38117);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38118);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38119);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38120);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38121);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38122);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecond881() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oq7pktez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond881",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oq7pktez(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38123); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38124);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38125);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38126);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38127);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38128);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38129);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondMillis882() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elrif7tf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis882",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elrif7tf6(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38130); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38131);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38132);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38133);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38134);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38135);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38136);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 


public void testFormat_dateHourMinuteSecondFraction883() {__CLR4_4_1tamtamle6rcn2t.R.globalSliceStart(getClass().getName(),38137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs1plktfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tamtamle6rcn2t.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tamtamle6rcn2t.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction883",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs1plktfd(){try{__CLR4_4_1tamtamle6rcn2t.R.inc(38137); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38138);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38139);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38140);dt = dt.withZone(LONDON); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38141);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38142);dt = dt.withZone(PARIS); 
     __CLR4_4_1tamtamle6rcn2t.R.inc(38143);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt)); 
 }finally{__CLR4_4_1tamtamle6rcn2t.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

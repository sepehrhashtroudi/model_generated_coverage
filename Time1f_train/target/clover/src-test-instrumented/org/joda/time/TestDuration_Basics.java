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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1jgrjgrlc8axdu3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,25596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25227);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25228);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25229);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25230);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1jgrjgrlc8axdu3.R.inc(25232);try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25231);
    }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25233);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25234);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25235);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25236);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25237);originalLocale = Locale.getDefault();
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25238);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25239);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25240);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25241);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25242);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25243);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25244);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25245);Locale.setDefault(originalLocale);
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25246);originalDateTimeZone = null;
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25247);originalTimeZone = null;
        __CLR4_4_1jgrjgrlc8axdu3.R.inc(25248);originalLocale = null;
    }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString32() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgxxusjhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgxxusjhd(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25249); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25250);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25251);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25252);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25253);assertEquals("PT0S", new Duration(0L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25254);assertEquals("PT10S", new Duration(10000L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25255);assertEquals("PT1S", new Duration(1000L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25256);assertEquals("PT12.345S", new Duration(12345L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25257);assertEquals("PT-12.345S", new Duration(-12345L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25258);assertEquals("PT-1.123S", new Duration(-1123L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25259);assertEquals("PT-0.123S", new Duration(-123L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25260);assertEquals("PT-0.012S", new Duration(-12L).toString()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25261);assertEquals("PT-0.001S", new Duration(-1L).toString()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToStandardMinutes96() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ieihzjhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes96",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ieihzjhq(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25262); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25263);Duration test = new Duration(0L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25264);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25265);test = new Duration(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25266);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25267);test = new Duration(60000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25268);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25269);test = new Duration(60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25270);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25271);test = new Duration(60000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25272);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25273);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25274);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25275);test = new Duration(2 * 60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25276);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25277);test = new Duration(-1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25278);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25279);test = new Duration(-60000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25280);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25281);test = new Duration(-60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25282);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMinus_RD2302() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rz47xjib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2302",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rz47xjib(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25283); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25284);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25285);Duration result = test.minus(new Duration(0L)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25286);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriodFrom_PeriodType303() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15z177pjif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType303",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15z177pjif(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25287); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25288);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25289);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25290);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25291);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25292);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int3361() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184r4ghjil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3361",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184r4ghjil(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25293); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25294);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25295);Duration result = test.withDurationAdded(new Duration(8000L), -1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25296);assertEquals((123L - 8000L), result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToStandardSeconds368() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsjt1jjip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsjt1jjip(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25297); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25298);Duration test = new Duration(0L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25299);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25300);test = new Duration(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25301);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25302);test = new Duration(999L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25303);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25304);test = new Duration(1000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25305);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25306);test = new Duration(1001L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25307);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25308);test = new Duration(1999L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25309);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25310);test = new Duration(2000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25311);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25312);test = new Duration(-1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25313);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25314);test = new Duration(-999L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25315);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25316);test = new Duration(-1000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25317);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriodTo455() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3bk1ejja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3bk1ejja(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25318); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25319);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25320);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25321);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25322);Period result = test.toPeriodTo(dt); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25323);assertEquals(new Period(test, dt), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testEqualsHashCode529() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oub847jjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode529",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oub847jjg(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25324); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25325);Duration test1 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25326);Duration test2 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25327);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25328);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25329);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25330);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25331);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25332);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25333);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25334);Duration test3 = new Duration(321L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25335);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25336);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25337);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25338);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25339);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25340);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25341);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25342);assertEquals(true, test1.equals(new MockDuration(123L))); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testCompareTo536() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ymnjjjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ymnjjjz(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25343); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25344);Duration test1 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25345);Duration test1a = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25346);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25347);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25348);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25349);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25350);Duration test2 = new Duration(321L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25351);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25352);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25353);assertEquals(+1, test2.compareTo(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25354);assertEquals(0, test1.compareTo(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25355);try { 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25356);test1.compareTo(null); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25357);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testPlus_RD1558() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qb7llfjke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1558",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qb7llfjke(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25358); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25359);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25360);Duration result = test.plus(new Duration(8000L)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25361);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriodFrom571() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ofvz2jki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom571",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ofvz2jki(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25362); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25363);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25364);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25365);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25366);Period result = test.toPeriodFrom(dt); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25367);assertEquals(new Period(dt, test), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToStandardHours589() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbjntkjko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbjntkjko(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25368); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25369);Duration test = new Duration(0L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25370);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25371);test = new Duration(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25372);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25373);test = new Duration(3600000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25374);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25375);test = new Duration(3600000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25376);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25377);test = new Duration(3600000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25378);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25379);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25380);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25381);test = new Duration(2 * 3600000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25382);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25383);test = new Duration(-1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25384);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25385);test = new Duration(-3600000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25386);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25387);test = new Duration(-3600000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25388);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriod_Chronology608() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f51jk4jl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f51jk4jl9(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25389); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25390);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25391);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25392);Period result = test.toPeriod(ISOChronology.getInstanceUTC()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25393);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25394);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testNegated_long3620() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfuqeljlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3620",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfuqeljlf(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25395); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25396);Duration test = new Duration(Long.MIN_VALUE); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25397);try { 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25398);test.negated(); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25399);fail(); 
     } catch (ArithmeticException e) { 
     } 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMinus_long1638() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18aondajlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18aondajlk(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25400); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25401);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25402);Duration result = test.minus(8000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25403);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMinus_RD1655() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csspjzjlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csspjzjlo(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25404); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25405);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25406);Duration result = test.minus(new Duration(8000L)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25407);assertEquals(123L - 8000L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMultipliedBy_long1667() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqd4dwjls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqd4dwjls(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25408); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25409);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25410);Duration result = test.multipliedBy(2L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25411);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMutableDuration668() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4rtjlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4rtjlw(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25412); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25413);MockMutableDuration test = new MockMutableDuration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25414);assertEquals(123L, test.getMillis()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25415);test.setMillis(2345L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25416);assertEquals(2345L, test.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testWithMillis1703() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvf5lejm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvf5lejm1(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25417); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25418);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25419);Duration result = test.withMillis(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25420);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testPlus_RD3710() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxo9qnjm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3710",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxo9qnjm5(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25421); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25422);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25423);Duration result = test.plus(null); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25424);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriod_PeriodType_Chronology740() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yww74fjm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology740",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yww74fjm9(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25425); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25426);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25427);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25428);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25429);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25430);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriod_PeriodType750() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0mi7njmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType750",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0mi7njmf(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25431); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25432);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25433);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25434);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25435);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25436);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testDividedBy_long2802() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ucbtq2jml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2802",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ucbtq2jml(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25437); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25438);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25439);Duration result = test.dividedBy(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25440);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMultipliedBy_long2825() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jepanjmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2825",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jepanjmp(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25441); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25442);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25443);Duration result = test.multipliedBy(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25444);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToIntervalTo876() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4k1g1jmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo876",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4k1g1jmt(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25445); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25446);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25447);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25448);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25449);Interval result = test.toIntervalTo(dt); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25450);assertEquals(new Interval(test, dt), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testIsEqual925() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11eofudjmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual925",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11eofudjmz(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25451); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25452);Duration test1 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25453);Duration test1a = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25454);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25455);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25456);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25457);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25458);Duration test2 = new Duration(321L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25459);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25460);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25461);assertEquals(false, test2.isEqual(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25462);assertEquals(true, test1.isEqual(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25463);assertEquals(false, test1.isEqual(null)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25464);assertEquals(true, new Duration(0L).isEqual(null)); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testSerialization928() throws Exception {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujs920jnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization928",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujs920jnd() throws Exception{try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25465); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25466);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25467);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25468);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25469);oos.writeObject(test); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25470);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25471);oos.close(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25472);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25473);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25474);Duration result = (Duration) ois.readObject(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25475);ois.close(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25476);assertEquals(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testPlus_long1975() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue8m6cjnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1975",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue8m6cjnp(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25477); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25478);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25479);Duration result = test.plus(8000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25480);assertEquals(8123L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriod986() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gtjlcjnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod986",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gtjlcjnt(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25481); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25482);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25483);try { 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25484);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25485);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25486);Duration dur = new Duration(length); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25487);Period test = dur.toPeriod(); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25488);assertEquals(0, test.getYears()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25489);assertEquals(0, test.getMonths()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25490);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25491);assertEquals(0, test.getDays()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25492);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25493);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25494);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25495);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1jgrjgrlc8axdu3.R.inc(25496);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToPeriodTo_PeriodType1002() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsvt53jo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType1002",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsvt53jo9(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25497); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25498);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25499);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25500);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25501);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25502);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToDuration21038() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tuqvh8jof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration21038",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tuqvh8jof(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25503); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25504);MockDuration test = new MockDuration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25505);Duration result = test.toDuration(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25506);assertNotSame(test, result); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25507);assertEquals(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testIsBefore1068() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ou18bnjok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore1068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ou18bnjok(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25508); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25509);Duration test1 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25510);Duration test1a = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25511);assertEquals(false, test1.isShorterThan(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25512);assertEquals(false, test1a.isShorterThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25513);assertEquals(false, test1.isShorterThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25514);assertEquals(false, test1a.isShorterThan(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25515);Duration test2 = new Duration(321L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25516);assertEquals(true, test1.isShorterThan(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25517);assertEquals(false, test2.isShorterThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25518);assertEquals(false, test2.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25519);assertEquals(false, test1.isShorterThan(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25520);assertEquals(false, test1.isShorterThan(null)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25521);assertEquals(false, new Duration(0L).isShorterThan(null)); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToIntervalFrom1075() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12p2fr4joy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12p2fr4joy(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25522); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25523);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25524);Duration test = new Duration(length); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25525);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25526);Interval result = test.toIntervalFrom(dt); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25527);assertEquals(new Interval(dt, test), result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testWithDurationAdded_RD_int51085() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sau8ffjp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int51085",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sau8ffjp4(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25528); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25529);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25530);Duration result = test.withDurationAdded(new Duration(8000L), 0); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25531);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testMinus_RD31106() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvenu5jp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD31106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvenu5jp8(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25532); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25533);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25534);Duration result = test.minus(null); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25535);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testNegated_long21133() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mvohejpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long21133",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mvohejpc(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25536); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25537);Duration test = new Duration(-246L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25538);Duration result = test.negated(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25539);assertEquals(246L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToStandardDays1282() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1955f4tjpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays1282",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1955f4tjpg(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25540); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25541);Duration test = new Duration(0L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25542);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25543);test = new Duration(1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25544);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25545);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25546);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25547);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25548);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25549);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25550);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25551);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25552);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25553);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25554);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25555);test = new Duration(-1L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25556);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25557);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25558);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25559);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25560);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testIsAfter1533() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jywgtnjq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter1533",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jywgtnjq1(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25561); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25562);Duration test1 = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25563);Duration test1a = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25564);assertEquals(false, test1.isLongerThan(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25565);assertEquals(false, test1a.isLongerThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25566);assertEquals(false, test1.isLongerThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25567);assertEquals(false, test1a.isLongerThan(test1a)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25568);Duration test2 = new Duration(321L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25569);assertEquals(false, test1.isLongerThan(test2)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25570);assertEquals(true, test2.isLongerThan(test1)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25571);assertEquals(true, test2.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25572);assertEquals(false, test1.isLongerThan(new MockDuration(123L))); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25573);assertEquals(true, test1.isLongerThan(null)); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25574);assertEquals(false, new Duration(0L).isLongerThan(null)); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testDividedBy_long11574() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k16memjqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long11574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k16memjqf(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25575); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25576);Duration test = new Duration(246L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25577);Duration result = test.dividedBy(2L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25578);assertEquals(123L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testToDuration11660() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3s3ajqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration11660",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3s3ajqj(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25579); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25580);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25581);Duration result = test.toDuration(); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25582);assertSame(test, result); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 


public void testWithMillis21690() {__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceStart(getClass().getName(),25583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2nxw7jqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jgrjgrlc8axdu3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jgrjgrlc8axdu3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis21690",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2nxw7jqn(){try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25583); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25584);Duration test = new Duration(123L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25585);Duration result = test.withMillis(1234567890L); 
     __CLR4_4_1jgrjgrlc8axdu3.R.inc(25586);assertEquals(1234567890L, result.getMillis()); 
 }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1jgrjgrlc8axdu3.R.inc(25588);try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25587);
            __CLR4_4_1jgrjgrlc8axdu3.R.inc(25589);iValue = value;
        }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25590);
            __CLR4_4_1jgrjgrlc8axdu3.R.inc(25591);return iValue;
        }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}
    }

    

    
    
    
    
    
    
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
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1jgrjgrlc8axdu3.R.inc(25593);try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25592);
        }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1jgrjgrlc8axdu3.R.inc(25594);
            __CLR4_4_1jgrjgrlc8axdu3.R.inc(25595);super.setMillis(duration);
        }finally{__CLR4_4_1jgrjgrlc8axdu3.R.flushNeeded();}}
    }

}

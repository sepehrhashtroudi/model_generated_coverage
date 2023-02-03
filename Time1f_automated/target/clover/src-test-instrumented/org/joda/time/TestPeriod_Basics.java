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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1ikzikzlcciettl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,24299,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1ikzikzlcciettl.R.inc(24083);
        __CLR4_4_1ikzikzlcciettl.R.inc(24084);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ikzikzlcciettl.R.inc(24085);
        __CLR4_4_1ikzikzlcciettl.R.inc(24086);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1ikzikzlcciettl.R.inc(24088);try{__CLR4_4_1ikzikzlcciettl.R.inc(24087);
    }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ikzikzlcciettl.R.inc(24089);
        __CLR4_4_1ikzikzlcciettl.R.inc(24090);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ikzikzlcciettl.R.inc(24091);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ikzikzlcciettl.R.inc(24092);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ikzikzlcciettl.R.inc(24093);originalLocale = Locale.getDefault();
        __CLR4_4_1ikzikzlcciettl.R.inc(24094);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ikzikzlcciettl.R.inc(24095);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ikzikzlcciettl.R.inc(24096);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ikzikzlcciettl.R.inc(24097);
        __CLR4_4_1ikzikzlcciettl.R.inc(24098);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ikzikzlcciettl.R.inc(24099);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ikzikzlcciettl.R.inc(24100);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ikzikzlcciettl.R.inc(24101);Locale.setDefault(originalLocale);
        __CLR4_4_1ikzikzlcciettl.R.inc(24102);originalDateTimeZone = null;
        __CLR4_4_1ikzikzlcciettl.R.inc(24103);originalTimeZone = null;
        __CLR4_4_1ikzikzlcciettl.R.inc(24104);originalLocale = null;
    }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPlusFieldsZero20() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqdxeaill();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFieldsZero20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqdxeaill(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24105); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24106);Period test, result; 
     __CLR4_4_1ikzikzlcciettl.R.inc(24107);test = Period.years(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24108);result = test.plusYears(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24109);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24110);test = Period.months(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24111);result = test.plusMonths(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24112);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24113);test = Period.weeks(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24114);result = test.plusWeeks(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24115);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24116);test = Period.days(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24117);result = test.plusDays(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24118);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24119);test = Period.hours(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24120);result = test.plusHours(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24121);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24122);test = Period.minutes(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24123);result = test.plusMinutes(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24124);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24125);test = Period.seconds(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24126);result = test.plusSeconds(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24127);assertSame(test, result); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24128);test = Period.millis(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24129);result = test.plusMillis(0); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24130);assertSame(test, result); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testToStandardHours167() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yycql0imb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yycql0imb(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24131); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24132);Duration test = new Duration(0L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24133);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24134);test = new Duration(1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24135);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24136);test = new Duration(3600000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24137);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24138);test = new Duration(3600000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24139);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24140);test = new Duration(3600000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24141);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24142);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24143);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24144);test = new Duration(2 * 3600000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24145);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24146);test = new Duration(-1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24147);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24148);test = new Duration(-3600000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24149);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24150);test = new Duration(-3600000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24151);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testConstructor_long_PeriodType2169() throws Throwable {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abx828imw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testConstructor_long_PeriodType2169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abx828imw() throws Throwable{try{__CLR4_4_1ikzikzlcciettl.R.inc(24152); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24153);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1ikzikzlcciettl.R.inc(24154);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24155);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24156);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24157);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24158);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24159);assertEquals(0, test.getDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24160);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24161);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24162);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24163);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testConstructor_long_PeriodType_Chronology4170() throws Throwable {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itt1v1in8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testConstructor_long_PeriodType_Chronology4170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itt1v1in8() throws Throwable{try{__CLR4_4_1ikzikzlcciettl.R.inc(24164); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24165);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1ikzikzlcciettl.R.inc(24166);Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24167);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24168);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24169);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24170);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24171);assertEquals(0, test.getDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24172);assertEquals((4 * 24) + 5, test.getHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24173);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24174);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24175);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testToStandardMinutes172() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w755giink();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes172",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w755giink(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24176); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24177);Duration test = new Duration(0L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24178);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24179);test = new Duration(1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24180);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24181);test = new Duration(60000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24182);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24183);test = new Duration(60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24184);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24185);test = new Duration(60000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24186);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24187);test = new Duration(2 * 60000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24188);assertEquals(Minutes.minutes(1), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24189);test = new Duration(2 * 60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24190);assertEquals(Minutes.minutes(2), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24191);test = new Duration(-1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24192);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24193);test = new Duration(-60000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24194);assertEquals(Minutes.minutes(0), test.toStandardMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24195);test = new Duration(-60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24196);assertEquals(Minutes.minutes(-1), test.toStandardMinutes()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testWith173() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2xpmkio5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWith173",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2xpmkio5(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24197); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24198);Period test; 
     __CLR4_4_1ikzikzlcciettl.R.inc(24199);test = Period.years(5).withYears(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24200);assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24201);test = Period.months(5).withMonths(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24202);assertEquals(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24203);test = Period.weeks(5).withWeeks(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24204);assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24205);test = Period.days(5).withDays(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24206);assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24207);test = Period.hours(5).withHours(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24208);assertEquals(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24209);test = Period.minutes(5).withMinutes(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24210);assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24211);test = Period.seconds(5).withSeconds(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24212);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24213);test = Period.millis(5).withMillis(1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24214);assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard())); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24215);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24216);try { 
         __CLR4_4_1ikzikzlcciettl.R.inc(24217);test.withYears(1); 
         __CLR4_4_1ikzikzlcciettl.R.inc(24218);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testFactory_weeks_int174() throws Throwable {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181ype5ior();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testFactory_weeks_int174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181ype5ior() throws Throwable{try{__CLR4_4_1ikzikzlcciettl.R.inc(24219); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24220);Period test = Period.weeks(2); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24221);assertEquals(PeriodType.weeks(), test.getPeriodType()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24222);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24223);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24224);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24225);assertEquals(0, test.getDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24226);assertEquals(0, test.getHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24227);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24228);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24229);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testToStandardSeconds175() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzzv1bip2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzzv1bip2(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24230); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24231);Duration test = new Duration(0L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24232);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24233);test = new Duration(1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24234);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24235);test = new Duration(999L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24236);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24237);test = new Duration(1000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24238);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24239);test = new Duration(1001L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24240);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24241);test = new Duration(1999L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24242);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24243);test = new Duration(2000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24244);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24245);test = new Duration(-1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24246);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24247);test = new Duration(-999L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24248);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24249);test = new Duration(-1000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24250);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testYears176() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqc6dpipn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testYears176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqc6dpipn(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24251); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24252);Period test; 
     __CLR4_4_1ikzikzlcciettl.R.inc(24253);test = Period.years(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24254);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24255);test = Period.months(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24256);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24257);test = Period.weeks(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24258);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24259);test = Period.days(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24260);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24261);test = Period.hours(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24262);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24263);test = Period.minutes(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24264);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24265);test = Period.seconds(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24266);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24267);test = Period.millis(5); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24268);assertEquals(0, test.getYears()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24269);assertEquals(0, test.getMonths()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24270);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24271);assertEquals(0, test.getDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24272);assertEquals(0, test.getHours()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24273);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24274);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24275);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
public void testToStandardDays177() {__CLR4_4_1ikzikzlcciettl.R.globalSliceStart(getClass().getName(),24276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrjyixiqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ikzikzlcciettl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ikzikzlcciettl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardDays177",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrjyixiqc(){try{__CLR4_4_1ikzikzlcciettl.R.inc(24276); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24277);Duration test = new Duration(0L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24278);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24279);test = new Duration(1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24280);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24281);test = new Duration(24 * 60 * 60000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24282);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24283);test = new Duration(24 * 60 * 60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24284);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24285);test = new Duration(24 * 60 * 60000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24286);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24287);test = new Duration(2 * 24 * 60 * 60000L - 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24288);assertEquals(Days.days(1), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24289);test = new Duration(2 * 24 * 60 * 60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24290);assertEquals(Days.days(2), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24291);test = new Duration(-1L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24292);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24293);test = new Duration(-24 * 60 * 60000L + 1); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24294);assertEquals(Days.days(0), test.toStandardDays()); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24295);test = new Duration(-24 * 60 * 60000L); 
     __CLR4_4_1ikzikzlcciettl.R.inc(24296);assertEquals(Days.days(-1), test.toStandardDays()); 
 }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1ikzikzlcciettl.R.inc(24298);try{__CLR4_4_1ikzikzlcciettl.R.inc(24297);
        }finally{__CLR4_4_1ikzikzlcciettl.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

//    //-----------------------------------------------------------------------
//    public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
//    public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    

    

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
    

    

    

    

    

    

    

    

    

    

    

    

    

}

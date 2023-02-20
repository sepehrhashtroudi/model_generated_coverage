/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology extends TestCase {static class __CLR4_4_1pkwpkwle6rcmgd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,33294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33152);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33153);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33154);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33155);SKIP = 1 * MILLIS_PER_DAY;
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33156);return new TestSuite(TestCopticChronology.class);
    }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}}

    public TestCopticChronology(String name) {
        super(name);__CLR4_4_1pkwpkwle6rcmgd.R.inc(33158);try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33157);
    }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33159);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33160);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33161);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33162);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33163);originalLocale = Locale.getDefault();
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33164);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33165);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33166);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33167);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33168);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33169);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33170);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33171);Locale.setDefault(originalLocale);
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33172);originalDateTimeZone = null;
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33173);originalTimeZone = null;
        __CLR4_4_1pkwpkwle6rcmgd.R.inc(33174);originalLocale = null;
    }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC309() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qws0nplj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testFactoryUTC309",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qws0nplj(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33175); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33176);assertEquals(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33177);assertSame(CopticChronology.class, CopticChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 


public void testEquality310() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sv5kdplm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEquality310",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sv5kdplm(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33178); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33179);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33180);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33181);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33182);assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33183);assertSame(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON)); 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 


public void testWithZone312() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yf69k9pls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testWithZone312",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yf69k9pls(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33184); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33185);assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33186);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33187);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33188);assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33189);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33190);assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 


public void testEra313() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18voxqyplz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testEra313",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18voxqyplz(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33191); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33192);assertEquals(1, CopticChronology.AM); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33193);try { 
         __CLR4_4_1pkwpkwle6rcmgd.R.inc(33194);new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         __CLR4_4_1pkwpkwle6rcmgd.R.inc(33195);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 


public void testSampleDate314() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uphzt9pm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testSampleDate314",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uphzt9pm4(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33196); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33197);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33198);assertEquals(CopticChronology.AM, dt.getEra()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33199);assertEquals(18, dt.getCenturyOfEra()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33200);assertEquals(20, dt.getYearOfCentury()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33201);assertEquals(1720, dt.getYearOfEra()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33202);assertEquals(1720, dt.getYear()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33203);Property fld = dt.year(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33204);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33205);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33206);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33207);assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33208);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33209);fld = dt.monthOfYear(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33210);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33211);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33212);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33213);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33214);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33215);assertEquals(13, fld.getMaximumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33216);assertEquals(13, fld.getMaximumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33217);assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33218);assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33219);assertEquals(2, dt.getDayOfMonth()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33220);fld = dt.dayOfMonth(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33221);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33222);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33223);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33224);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33225);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33226);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33227);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33228);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33229);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33230);fld = dt.dayOfWeek(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33231);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33232);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33233);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33234);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33235);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33236);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33237);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33238);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33239);assertEquals(9 * 30 + 2, dt.getDayOfYear()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33240);fld = dt.dayOfYear(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33241);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33242);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33243);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33244);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33245);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33246);assertEquals(365, fld.getMaximumValue()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33247);assertEquals(366, fld.getMaximumValueOverall()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33248);assertEquals(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33249);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33250);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33251);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33252);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 


public void testDurationYear546() {__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceStart(getClass().getName(),33253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12j83lxpnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pkwpkwle6rcmgd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pkwpkwle6rcmgd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestCopticChronology.testDurationYear546",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12j83lxpnp(){try{__CLR4_4_1pkwpkwle6rcmgd.R.inc(33253); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33254);DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33255);DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33256);DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33257);DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33258);DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33259);DurationField fld = dt20.year().getDurationField(); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33260);assertEquals(COPTIC_UTC.years(), fld); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33261);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33262);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33263);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33264);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33265);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33266);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33267);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33268);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33269);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33270);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33271);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33272);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33273);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis()); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33274);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33275);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33276);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33277);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33278);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33279);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33280);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33281);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33282);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33283);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33284);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33285);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis())); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33286);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33287);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33288);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33289);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33290);assertEquals(dt21.getMillis(), fld.add(dt20.getMillis(), 1L)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33291);assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2L)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33292);assertEquals(dt23.getMillis(), fld.add(dt20.getMillis(), 3L)); 
     __CLR4_4_1pkwpkwle6rcmgd.R.inc(33293);assertEquals(dt24.getMillis(), fld.add(dt20.getMillis(), 4L)); 
 }finally{__CLR4_4_1pkwpkwle6rcmgd.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}

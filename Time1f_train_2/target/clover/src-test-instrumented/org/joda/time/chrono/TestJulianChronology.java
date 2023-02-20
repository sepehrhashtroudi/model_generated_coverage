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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {static class __CLR4_4_1q9oq9ole6qsffm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,34150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34044);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34045);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34046);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34047);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1q9oq9ole6qsffm.R.inc(34049);try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34048);
    }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34050);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34051);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34052);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34053);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34054);originalLocale = Locale.getDefault();
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34055);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34056);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34057);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34058);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34059);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34060);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34061);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34062);Locale.setDefault(originalLocale);
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34063);originalDateTimeZone = null;
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34064);originalTimeZone = null;
        __CLR4_4_1q9oq9ole6qsffm.R.inc(34065);originalLocale = null;
    }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationFields234() {__CLR4_4_1q9oq9ole6qsffm.R.globalSliceStart(getClass().getName(),34066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qamfobqaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6qsffm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6qsffm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qamfobqaa(){try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34066); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34067);final JulianChronology julian = JulianChronology.getInstance(); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34068);assertEquals("eras", julian.eras().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34069);assertEquals("centuries", julian.centuries().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34070);assertEquals("years", julian.years().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34071);assertEquals("weekyears", julian.weekyears().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34072);assertEquals("months", julian.months().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34073);assertEquals("weeks", julian.weeks().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34074);assertEquals("days", julian.days().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34075);assertEquals("halfdays", julian.halfdays().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34076);assertEquals("hours", julian.hours().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34077);assertEquals("minutes", julian.minutes().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34078);assertEquals("seconds", julian.seconds().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34079);assertEquals("millis", julian.millis().getName()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34080);assertEquals(false, julian.eras().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34081);assertEquals(true, julian.centuries().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34082);assertEquals(true, julian.years().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34083);assertEquals(true, julian.weekyears().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34084);assertEquals(true, julian.months().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34085);assertEquals(true, julian.weeks().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34086);assertEquals(true, julian.days().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34087);assertEquals(true, julian.halfdays().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34088);assertEquals(true, julian.hours().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34089);assertEquals(true, julian.minutes().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34090);assertEquals(true, julian.seconds().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34091);assertEquals(true, julian.millis().isSupported()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34092);assertEquals(false, julian.centuries().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34093);assertEquals(false, julian.years().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34094);assertEquals(false, julian.weekyears().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34095);assertEquals(false, julian.months().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34096);assertEquals(false, julian.weeks().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34097);assertEquals(false, julian.days().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34098);assertEquals(false, julian.halfdays().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34099);assertEquals(true, julian.hours().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34100);assertEquals(true, julian.minutes().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34101);assertEquals(true, julian.seconds().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34102);assertEquals(true, julian.millis().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34103);final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34104);assertEquals(false, julianUTC.centuries().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34105);assertEquals(false, julianUTC.years().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34106);assertEquals(false, julianUTC.weekyears().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34107);assertEquals(false, julianUTC.months().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34108);assertEquals(true, julianUTC.weeks().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34109);assertEquals(true, julianUTC.days().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34110);assertEquals(true, julianUTC.halfdays().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34111);assertEquals(true, julianUTC.hours().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34112);assertEquals(true, julianUTC.minutes().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34113);assertEquals(true, julianUTC.seconds().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34114);assertEquals(true, julianUTC.millis().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34115);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34116);final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34117);assertEquals(false, julianGMT.centuries().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34118);assertEquals(false, julianGMT.years().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34119);assertEquals(false, julianGMT.weekyears().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34120);assertEquals(false, julianGMT.months().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34121);assertEquals(true, julianGMT.weeks().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34122);assertEquals(true, julianGMT.days().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34123);assertEquals(true, julianGMT.halfdays().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34124);assertEquals(true, julianGMT.hours().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34125);assertEquals(true, julianGMT.minutes().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34126);assertEquals(true, julianGMT.seconds().isPrecise()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34127);assertEquals(true, julianGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}} 


public void testFactory_Zone387() {__CLR4_4_1q9oq9ole6qsffm.R.globalSliceStart(getClass().getName(),34128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuesmqc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6qsffm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6qsffm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuesmqc0(){try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34128); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34129);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34130);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34131);assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34132);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}} 


public void testFactory_Zone_int388() {__CLR4_4_1q9oq9ole6qsffm.R.globalSliceStart(getClass().getName(),34133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsl7rrqc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6qsffm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6qsffm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsl7rrqc5(){try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34133); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34134);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34135);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34136);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34137);try { 
         __CLR4_4_1q9oq9ole6qsffm.R.inc(34138);JulianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1q9oq9ole6qsffm.R.inc(34139);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34140);try { 
         __CLR4_4_1q9oq9ole6qsffm.R.inc(34141);JulianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1q9oq9ole6qsffm.R.inc(34142);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}} 


public void testWithZone390() {__CLR4_4_1q9oq9ole6qsffm.R.globalSliceStart(getClass().getName(),34143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9n4qbqcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q9oq9ole6qsffm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q9oq9ole6qsffm.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testWithZone390",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9n4qbqcf(){try{__CLR4_4_1q9oq9ole6qsffm.R.inc(34143); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34144);assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34145);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34146);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34147);assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34148);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q9oq9ole6qsffm.R.inc(34149);assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q9oq9ole6qsffm.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

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
public class TestJulianChronology extends TestCase {static class __CLR4_4_1qacqacle6rcmll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,34173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1qacqacle6rcmll.R.inc(34068);
        __CLR4_4_1qacqacle6rcmll.R.inc(34069);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qacqacle6rcmll.R.inc(34070);
        __CLR4_4_1qacqacle6rcmll.R.inc(34071);return new TestSuite(TestJulianChronology.class);
    }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}}

    public TestJulianChronology(String name) {
        super(name);__CLR4_4_1qacqacle6rcmll.R.inc(34073);try{__CLR4_4_1qacqacle6rcmll.R.inc(34072);
    }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qacqacle6rcmll.R.inc(34074);
        __CLR4_4_1qacqacle6rcmll.R.inc(34075);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qacqacle6rcmll.R.inc(34076);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1qacqacle6rcmll.R.inc(34077);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1qacqacle6rcmll.R.inc(34078);originalLocale = Locale.getDefault();
        __CLR4_4_1qacqacle6rcmll.R.inc(34079);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1qacqacle6rcmll.R.inc(34080);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1qacqacle6rcmll.R.inc(34081);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qacqacle6rcmll.R.inc(34082);
        __CLR4_4_1qacqacle6rcmll.R.inc(34083);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qacqacle6rcmll.R.inc(34084);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1qacqacle6rcmll.R.inc(34085);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1qacqacle6rcmll.R.inc(34086);Locale.setDefault(originalLocale);
        __CLR4_4_1qacqacle6rcmll.R.inc(34087);originalDateTimeZone = null;
        __CLR4_4_1qacqacle6rcmll.R.inc(34088);originalTimeZone = null;
        __CLR4_4_1qacqacle6rcmll.R.inc(34089);originalLocale = null;
    }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testDurationFields263() {__CLR4_4_1qacqacle6rcmll.R.globalSliceStart(getClass().getName(),34090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv0xftqay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qacqacle6rcmll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qacqacle6rcmll.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testDurationFields263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv0xftqay(){try{__CLR4_4_1qacqacle6rcmll.R.inc(34090); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34091);final JulianChronology julian = JulianChronology.getInstance(); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34092);assertEquals("eras", julian.eras().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34093);assertEquals("centuries", julian.centuries().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34094);assertEquals("years", julian.years().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34095);assertEquals("weekyears", julian.weekyears().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34096);assertEquals("months", julian.months().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34097);assertEquals("weeks", julian.weeks().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34098);assertEquals("days", julian.days().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34099);assertEquals("halfdays", julian.halfdays().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34100);assertEquals("hours", julian.hours().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34101);assertEquals("minutes", julian.minutes().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34102);assertEquals("seconds", julian.seconds().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34103);assertEquals("millis", julian.millis().getName()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34104);assertEquals(false, julian.eras().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34105);assertEquals(true, julian.centuries().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34106);assertEquals(true, julian.years().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34107);assertEquals(true, julian.weekyears().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34108);assertEquals(true, julian.months().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34109);assertEquals(true, julian.weeks().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34110);assertEquals(true, julian.days().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34111);assertEquals(true, julian.halfdays().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34112);assertEquals(true, julian.hours().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34113);assertEquals(true, julian.minutes().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34114);assertEquals(true, julian.seconds().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34115);assertEquals(true, julian.millis().isSupported()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34116);assertEquals(false, julian.centuries().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34117);assertEquals(false, julian.years().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34118);assertEquals(false, julian.weekyears().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34119);assertEquals(false, julian.months().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34120);assertEquals(false, julian.weeks().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34121);assertEquals(false, julian.days().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34122);assertEquals(false, julian.halfdays().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34123);assertEquals(true, julian.hours().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34124);assertEquals(true, julian.minutes().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34125);assertEquals(true, julian.seconds().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34126);assertEquals(true, julian.millis().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34127);final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34128);assertEquals(false, julianUTC.centuries().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34129);assertEquals(false, julianUTC.years().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34130);assertEquals(false, julianUTC.weekyears().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34131);assertEquals(false, julianUTC.months().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34132);assertEquals(true, julianUTC.weeks().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34133);assertEquals(true, julianUTC.days().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34134);assertEquals(true, julianUTC.halfdays().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34135);assertEquals(true, julianUTC.hours().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34136);assertEquals(true, julianUTC.minutes().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34137);assertEquals(true, julianUTC.seconds().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34138);assertEquals(true, julianUTC.millis().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34139);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34140);final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34141);assertEquals(false, julianGMT.centuries().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34142);assertEquals(false, julianGMT.years().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34143);assertEquals(false, julianGMT.weekyears().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34144);assertEquals(false, julianGMT.months().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34145);assertEquals(true, julianGMT.weeks().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34146);assertEquals(true, julianGMT.days().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34147);assertEquals(true, julianGMT.halfdays().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34148);assertEquals(true, julianGMT.hours().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34149);assertEquals(true, julianGMT.minutes().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34150);assertEquals(true, julianGMT.seconds().isPrecise()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34151);assertEquals(true, julianGMT.millis().isPrecise()); 
 }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}} 


public void testToString417() {__CLR4_4_1qacqacle6rcmll.R.globalSliceStart(getClass().getName(),34152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilaatfqco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qacqacle6rcmll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qacqacle6rcmll.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testToString417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilaatfqco(){try{__CLR4_4_1qacqacle6rcmll.R.inc(34152); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34153);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34154);assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34155);assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34156);assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34157);assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}} 


public void testFactory_Zone418() {__CLR4_4_1qacqacle6rcmll.R.globalSliceStart(getClass().getName(),34158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2biunqcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qacqacle6rcmll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qacqacle6rcmll.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2biunqcu(){try{__CLR4_4_1qacqacle6rcmll.R.inc(34158); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34159);assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34160);assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34161);assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34162);assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}} 


public void testFactory_Zone_int419() {__CLR4_4_1qacqacle6rcmll.R.globalSliceStart(getClass().getName(),34163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz2btsqcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qacqacle6rcmll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qacqacle6rcmll.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestJulianChronology.testFactory_Zone_int419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz2btsqcz(){try{__CLR4_4_1qacqacle6rcmll.R.inc(34163); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34164);JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34165);assertEquals(TOKYO, chrono.getZone()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34166);assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     __CLR4_4_1qacqacle6rcmll.R.inc(34167);try { 
         __CLR4_4_1qacqacle6rcmll.R.inc(34168);JulianChronology.getInstance(TOKYO, 0); 
         __CLR4_4_1qacqacle6rcmll.R.inc(34169);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1qacqacle6rcmll.R.inc(34170);try { 
         __CLR4_4_1qacqacle6rcmll.R.inc(34171);JulianChronology.getInstance(TOKYO, 8); 
         __CLR4_4_1qacqacle6rcmll.R.inc(34172);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1qacqacle6rcmll.R.flushNeeded();}} 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

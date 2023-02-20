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
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestIslamicChronology extends TestCase {static class __CLR4_4_1q2sq2sle6qsffe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,34044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

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

    public static void main(String[] args) {try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33796);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33797);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33798);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33799);SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33800);return new TestSuite(TestIslamicChronology.class);
    }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}}

    public TestIslamicChronology(String name) {
        super(name);__CLR4_4_1q2sq2sle6qsffe.R.inc(33802);try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33801);
    }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33803);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33804);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33805);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33806);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33807);originalLocale = Locale.getDefault();
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33808);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33809);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33810);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33811);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33812);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33813);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33814);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33815);Locale.setDefault(originalLocale);
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33816);originalDateTimeZone = null;
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33817);originalTimeZone = null;
        __CLR4_4_1q2sq2sle6qsffe.R.inc(33818);originalLocale = null;
    }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactoryUTC88() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t07op9q3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactoryUTC88",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t07op9q3f(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33819); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33820);assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33821);assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testWithUTC89() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy8z3oq3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithUTC89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy8z3oq3i(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33822); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33823);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33824);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33825);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33826);assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testFactory_Zone90() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1yp69q3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testFactory_Zone90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1yp69q3n(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33827); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33828);assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33829);assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33830);assertEquals(LONDON, IslamicChronology.getInstance(null).getZone()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33831);assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testToString91() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok8rlvq3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testToString91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok8rlvq3s(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33832); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33833);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33834);assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33835);assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33836);assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testWithZone92() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iocxdwq3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testWithZone92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iocxdwq3x(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33837); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33838);assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33839);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33840);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33841);assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33842);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33843);assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testSampleDateWithZone93() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op1on1q44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDateWithZone93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op1on1q44(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33844); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33845);DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33846);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33847);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33848);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33849);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33850);assertEquals(11, dt.getHourOfDay()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33851);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33852);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33853);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testEpoch94() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yverdq4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testEpoch94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yverdq4e(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33854); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33855);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33856);DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33857);assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testCalendar95() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cv2lsjq4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testCalendar95",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cv2lsjq4i(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33858); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33859);if ((((TestAll.FAST)&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33860)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33861)==0&false))) {{ 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33862);return; 
     } 
     }__CLR4_4_1q2sq2sle6qsffe.R.inc(33863);System.out.println("\nTestIslamicChronology.testCalendar"); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33864);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33865);long millis = epoch.getMillis(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33866);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33867);DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33868);DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33869);DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33870);DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33871);DateTimeField year = ISLAMIC_UTC.year(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33872);DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33873);DateTimeField era = ISLAMIC_UTC.era(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33874);int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33875);int expectedDOY = 1; 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33876);int expectedDay = 1; 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33877);int expectedMonth = 1; 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33878);int expectedYear = 1; 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33879);while ((((millis < end)&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33880)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33881)==0&false))) {{ 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33882);int dowValue = dayOfWeek.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33883);int doyValue = dayOfYear.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33884);int dayValue = dayOfMonth.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33885);int monthValue = monthOfYear.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33886);int yearValue = year.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33887);int yearOfEraValue = yearOfEra.get(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33888);int dayOfYearLen = dayOfYear.getMaximumValue(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33889);int monthLen = dayOfMonth.getMaximumValue(millis); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33890);if ((((monthValue < 1 || monthValue > 12)&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33891)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33892)==0&false))) {{ 
             __CLR4_4_1q2sq2sle6qsffe.R.inc(33893);fail("Bad month: " + millis); 
         } 
         }__CLR4_4_1q2sq2sle6qsffe.R.inc(33894);assertEquals(1, era.get(millis)); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33895);assertEquals("AH", era.getAsText(millis)); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33896);assertEquals("AH", era.getAsShortText(millis)); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33897);assertEquals(expectedDOY, doyValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33898);assertEquals(expectedMonth, monthValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33899);assertEquals(expectedDay, dayValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33900);assertEquals(expectedDOW, dowValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33901);assertEquals(expectedYear, yearValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33902);assertEquals(expectedYear, yearOfEraValue); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33903);boolean leap = ((11 * yearValue + 14) % 30) < 11; 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33904);assertEquals(leap, year.isLeap(millis)); 
         boolean __CLB4_4_1_bool0=false;__CLR4_4_1q2sq2sle6qsffe.R.inc(33905);switch(monthValue) { 
             case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33906);__CLB4_4_1_bool0=true;} 
             case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33907);__CLB4_4_1_bool0=true;} 
             case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33908);__CLB4_4_1_bool0=true;} 
             case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33909);__CLB4_4_1_bool0=true;} 
             case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33910);__CLB4_4_1_bool0=true;} 
             case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33911);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33912);assertEquals(30, monthLen); 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33913);break; 
             case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33914);__CLB4_4_1_bool0=true;} 
             case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33915);__CLB4_4_1_bool0=true;} 
             case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33916);__CLB4_4_1_bool0=true;} 
             case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33917);__CLB4_4_1_bool0=true;} 
             case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33918);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33919);assertEquals(29, monthLen); 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33920);break; 
             case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_1q2sq2sle6qsffe.R.inc(33921);__CLB4_4_1_bool0=true;} 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33922);assertEquals(((((leap )&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33923)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33924)==0&false))? 30 : 29), monthLen); 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33925);break; 
         } 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33926);assertEquals(((((leap )&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33927)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33928)==0&false))? 355 : 354), dayOfYearLen); 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33929);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33930);expectedDay++; 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33931);expectedDOY++; 
         __CLR4_4_1q2sq2sle6qsffe.R.inc(33932);if ((((expectedDay > monthLen)&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33933)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33934)==0&false))) {{ 
             __CLR4_4_1q2sq2sle6qsffe.R.inc(33935);expectedDay = 1; 
             __CLR4_4_1q2sq2sle6qsffe.R.inc(33936);expectedMonth++; 
             __CLR4_4_1q2sq2sle6qsffe.R.inc(33937);if ((((expectedMonth == 13)&&(__CLR4_4_1q2sq2sle6qsffe.R.iget(33938)!=0|true))||(__CLR4_4_1q2sq2sle6qsffe.R.iget(33939)==0&false))) {{ 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33940);expectedMonth = 1; 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33941);expectedDOY = 1; 
                 __CLR4_4_1q2sq2sle6qsffe.R.inc(33942);expectedYear++; 
             } 
         }} 
         }__CLR4_4_1q2sq2sle6qsffe.R.inc(33943);millis += SKIP; 
     } 
 }}finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testSampleDate296() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12kvp1oq6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12kvp1oq6w(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33944); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33945);DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33946);dt = dt.withChronology(ISLAMIC_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33947);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33948);assertEquals(15, dt.getCenturyOfEra()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33949);assertEquals(26, dt.getYearOfCentury()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33950);assertEquals(1426, dt.getYearOfEra()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33951);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33952);Property fld = dt.year(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33953);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33954);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33955);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33956);assertEquals(10, dt.getMonthOfYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33957);fld = dt.monthOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33958);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33959);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33960);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33961);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33962);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33963);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33964);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33965);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33966);fld = dt.dayOfMonth(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33967);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33968);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33969);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33970);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33971);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33972);assertEquals(29, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33973);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33974);assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33975);fld = dt.dayOfWeek(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33976);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33977);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33978);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33979);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33980);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33981);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33982);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33983);assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33984);fld = dt.dayOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33985);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33986);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33987);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33988);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33989);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33990);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33991);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33992);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33993);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33994);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33995);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 


public void testSampleDate3417() {__CLR4_4_1q2sq2sle6qsffe.R.globalSliceStart(getClass().getName(),33996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ye7tkq8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q2sq2sle6qsffe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q2sq2sle6qsffe.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestIslamicChronology.testSampleDate3417",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ye7tkq8c(){try{__CLR4_4_1q2sq2sle6qsffe.R.inc(33996); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33997);DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33998);assertEquals(IslamicChronology.AH, dt.getEra()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(33999);assertEquals(1426, dt.getYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34000);Property fld = dt.year(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34001);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34002);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34003);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34004);assertEquals(12, dt.getMonthOfYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34005);fld = dt.monthOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34006);assertEquals(true, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34007);assertEquals(1, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34008);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34009);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34010);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34011);assertEquals(12, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34012);assertEquals(12, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34013);assertEquals(24, dt.getDayOfMonth()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34014);fld = dt.dayOfMonth(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34015);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34016);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34017);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34018);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34019);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34020);assertEquals(30, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34021);assertEquals(30, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34022);assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34023);fld = dt.dayOfWeek(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34024);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34025);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34026);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34027);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34028);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34029);assertEquals(7, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34030);assertEquals(7, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34031);assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34032);fld = dt.dayOfYear(); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34033);assertEquals(false, fld.isLeap()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34034);assertEquals(0, fld.getLeapAmount()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34035);assertEquals(null, fld.getLeapDurationField()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34036);assertEquals(1, fld.getMinimumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34037);assertEquals(1, fld.getMinimumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34038);assertEquals(355, fld.getMaximumValue()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34039);assertEquals(355, fld.getMaximumValueOverall()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34040);assertEquals(0, dt.getHourOfDay()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34041);assertEquals(0, dt.getMinuteOfHour()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34042);assertEquals(0, dt.getSecondOfMinute()); 
     __CLR4_4_1q2sq2sle6qsffe.R.inc(34043);assertEquals(0, dt.getMillisOfSecond()); 
 }finally{__CLR4_4_1q2sq2sle6qsffe.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}

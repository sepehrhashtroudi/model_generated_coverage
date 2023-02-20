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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1hkzhkzle6ndpga{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,22914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22787);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22788);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22789);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22790);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1hkzhkzle6ndpga.R.inc(22792);try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22791);
    }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22793);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22794);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22795);zone = DateTimeZone.getDefault();
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22796);locale = Locale.getDefault();
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22797);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22798);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22799);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22800);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22801);DateTimeZone.setDefault(zone);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22802);Locale.setDefault(locale);
        __CLR4_4_1hkzhkzle6ndpga.R.inc(22803);zone = null;
    }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetYearOfEra243() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm8z89hlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfEra243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm8z89hlg(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22804); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22805);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22806);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22807);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22808);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22809);assertSame(test, test.yearOfEra().getDateTime()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22810);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22811);assertEquals("2004", test.yearOfEra().getAsString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22812);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22813);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22814);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22815);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22816);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22817);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22818);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22819);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertySetCopyYear244() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18540lwhlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetCopyYear244",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18540lwhlw(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22820); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22821);DateTime test = new DateTime(1972, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22822);DateTime copy = test.year().setCopy(12); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22823);assertEquals("1972-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22824);assertEquals("1972-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22825);try { 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22826);test.year().setCopy(13); 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22827);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22828);try { 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22829);test.year().setCopy(0); 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22830);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyGetMinuteOfDay246() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2cr7rhm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2cr7rhm7(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22831); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22832);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22833);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22834);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22835);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22836);assertSame(test, test.minuteOfDay().getDateTime()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22837);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22838);assertEquals("803", test.minuteOfDay().getAsString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22839);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22840);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22841);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22842);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22843);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22844);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22845);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22846);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertySetTextMonthOfYear256() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnr45uhmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextMonthOfYear256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnr45uhmn(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22847); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22848);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22849);DateTime copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22850);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22851);assertEquals("2004-08-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22852);copy = test.monthOfYear().setCopy("December"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22853);assertEquals("2004-08-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22854);copy = test.monthOfYear().setCopy("Dec"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22855);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22856);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22857);copy = test.monthOfYear().setCopy("1"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22858);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22859);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22860);copy = test.monthOfYear().setCopy("2"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22861);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22862);copy = test.monthOfYear().setCopy("3"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22863);assertEquals("2004-04-30T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22864);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22865);copy = test.monthOfYear().setCopy("4"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22866);assertEquals("2003-02-28T00:00:00.000Z", copy.toString());
}finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}

public void testPropertySetTextMonthOfYear257() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oer5ddhn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextMonthOfYear257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oer5ddhn7(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22867); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22868);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22869);DateTime copy = test.monthOfYear().setCopy("8"); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22870);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22871);assertEquals("2004-08-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22872);try { 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22873);test.monthOfYear().setCopy("December"); 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22874);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22875);try { 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22876);test.monthOfYear().setCopy("Dec"); 
         __CLR4_4_1hkzhkzle6ndpga.R.inc(22877);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyRoundHalfFloorHourOfDay258() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwksibhni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwksibhni(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22878); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22879);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22880);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22881);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22882);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22883);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22884);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22885);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22886);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22887);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyRoundHalfCeilingHourOfDay259() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19x9s69hns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19x9s69hns(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22888); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22889);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22890);DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22891);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22892);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22893);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22894);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22895);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22896);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22897);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyGetDifferenceMonthOfYear444() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ncuh9ho2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceMonthOfYear444",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ncuh9ho2(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22898); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22899);DateMidnight test1 = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22900);DateMidnight test2 = new DateMidnight(2004, 8, 9); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22901);assertEquals(-2, test1.monthOfYear().getDifference(test2)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22902);assertEquals(2, test2.monthOfYear().getDifference(test1)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22903);assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2)); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22904);assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1)); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyAddWrapFieldMonthOfYear448() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bctulbho9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldMonthOfYear448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bctulbho9(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22905); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22906);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22907);test.monthOfYear().addWrapField(8); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22908);assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
public void testPropertyToIntervalMillisOfSecond450() {__CLR4_4_1hkzhkzle6ndpga.R.globalSliceStart(getClass().getName(),22909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yoekxqhod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hkzhkzle6ndpga.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hkzhkzle6ndpga.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yoekxqhod(){try{__CLR4_4_1hkzhkzle6ndpga.R.inc(22909); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22910);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22911);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22912);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1hkzhkzle6ndpga.R.inc(22913);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1hkzhkzle6ndpga.R.flushNeeded();}}
    

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

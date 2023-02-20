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
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1hilhille6np4dd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hilhille6np4dd.R.inc(22701);
        __CLR4_4_1hilhille6np4dd.R.inc(22702);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hilhille6np4dd.R.inc(22703);
        __CLR4_4_1hilhille6np4dd.R.inc(22704);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1hilhille6np4dd.R.inc(22706);try{__CLR4_4_1hilhille6np4dd.R.inc(22705);
    }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hilhille6np4dd.R.inc(22707);
        __CLR4_4_1hilhille6np4dd.R.inc(22708);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hilhille6np4dd.R.inc(22709);zone = DateTimeZone.getDefault();
        __CLR4_4_1hilhille6np4dd.R.inc(22710);locale = Locale.getDefault();
        __CLR4_4_1hilhille6np4dd.R.inc(22711);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hilhille6np4dd.R.inc(22712);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hilhille6np4dd.R.inc(22713);
        __CLR4_4_1hilhille6np4dd.R.inc(22714);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hilhille6np4dd.R.inc(22715);DateTimeZone.setDefault(zone);
        __CLR4_4_1hilhille6np4dd.R.inc(22716);Locale.setDefault(locale);
        __CLR4_4_1hilhille6np4dd.R.inc(22717);zone = null;
    }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyEqualsHashCodeLenient77() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112xc3hj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient77",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112xc3hj2(){try{__CLR4_4_1hilhille6np4dd.R.inc(22718); 
     __CLR4_4_1hilhille6np4dd.R.inc(22719);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22720);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22721);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hilhille6np4dd.R.inc(22722);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hilhille6np4dd.R.inc(22723);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1hilhille6np4dd.R.inc(22724);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1hilhille6np4dd.R.inc(22725);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22726);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22727);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyGetEra243() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbzo0jhjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbzo0jhjc(){try{__CLR4_4_1hilhille6np4dd.R.inc(22728); 
     __CLR4_4_1hilhille6np4dd.R.inc(22729);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1hilhille6np4dd.R.inc(22730);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22731);assertEquals("era", test.era().getName()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22732);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22733);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22734);assertEquals(1, test.era().get()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22735);assertEquals("AD", test.era().getAsString()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22736);assertEquals("ap. J.-C.", test.era().getAsText()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22737);assertEquals("AD", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22738);assertEquals("ap. J.-C.", test.era().getAsShortText()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22739);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22740);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22741);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22742);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22743);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22744);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22745);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyGetMillisOfDay245() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0ybahju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMillisOfDay245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0ybahju(){try{__CLR4_4_1hilhille6np4dd.R.inc(22746); 
     __CLR4_4_1hilhille6np4dd.R.inc(22747);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hilhille6np4dd.R.inc(22748);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22749);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22750);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22751);assertSame(test, test.millisOfDay().getDateTime()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22752);assertEquals(48223053, test.millisOfDay().get()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22753);assertEquals("48223053", test.millisOfDay().getAsString()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22754);assertEquals("48223053", test.millisOfDay().getAsText()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22755);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22756);assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22757);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22758);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22759);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22760);assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22761);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyWithMinimumValueMillisOfDayDSTGap246() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180ddphhka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180ddphhka(){try{__CLR4_4_1hilhille6np4dd.R.inc(22762); 
     __CLR4_4_1hilhille6np4dd.R.inc(22763);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hilhille6np4dd.R.inc(22764);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     __CLR4_4_1hilhille6np4dd.R.inc(22765);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1hilhille6np4dd.R.inc(22766);assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyToIntervalMillisOfSecond398() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1venjmnhkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1venjmnhkf(){try{__CLR4_4_1hilhille6np4dd.R.inc(22767); 
     __CLR4_4_1hilhille6np4dd.R.inc(22768);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hilhille6np4dd.R.inc(22769);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1hilhille6np4dd.R.inc(22770);assertEquals(new Interval(test, new DateTime(2004, 6, 9, 13, 23, 43, 53)), testInterval.getStart()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22771);assertEquals(new Interval(test, new DateTime(2004, 6, 9, 13, 23, 43, 54)), testInterval.getEnd()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyToIntervalMillisOfSecond399() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5nku6hkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5nku6hkk(){try{__CLR4_4_1hilhille6np4dd.R.inc(22772); 
     __CLR4_4_1hilhille6np4dd.R.inc(22773);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hilhille6np4dd.R.inc(22774);Interval expected = new Interval(new DateTime(2004, 6, 9, 13, 23, 43, 53), new DateTime(2004, 6, 9, 13, 23, 43, 54)); 
     __CLR4_4_1hilhille6np4dd.R.inc(22775);assertEquals(expected, test.millisOfSecond().toInterval()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testPropertyToIntervalYearOfEra491() {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qz3ejehko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra491",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qz3ejehko(){try{__CLR4_4_1hilhille6np4dd.R.inc(22776); 
     __CLR4_4_1hilhille6np4dd.R.inc(22777);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1hilhille6np4dd.R.inc(22778);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1hilhille6np4dd.R.inc(22779);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22780);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
public void testConstructor_RP_RI5492() throws Throwable {__CLR4_4_1hilhille6np4dd.R.globalSliceStart(getClass().getName(),22781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w95ocghkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hilhille6np4dd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hilhille6np4dd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testConstructor_RP_RI5492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w95ocghkt() throws Throwable{try{__CLR4_4_1hilhille6np4dd.R.inc(22781); 
     __CLR4_4_1hilhille6np4dd.R.inc(22782);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null); 
     __CLR4_4_1hilhille6np4dd.R.inc(22783);assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     __CLR4_4_1hilhille6np4dd.R.inc(22784);assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 }finally{__CLR4_4_1hilhille6np4dd.R.flushNeeded();}}
    

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

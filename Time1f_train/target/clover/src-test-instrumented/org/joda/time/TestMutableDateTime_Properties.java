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

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1mydmydlc8axe5y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,30021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mydmydlc8axe5y.R.inc(29749);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29750);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mydmydlc8axe5y.R.inc(29751);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29752);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1mydmydlc8axe5y.R.inc(29754);try{__CLR4_4_1mydmydlc8axe5y.R.inc(29753);
    }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mydmydlc8axe5y.R.inc(29755);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29756);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29757);zone = DateTimeZone.getDefault();
        __CLR4_4_1mydmydlc8axe5y.R.inc(29758);locale = Locale.getDefault();
        __CLR4_4_1mydmydlc8axe5y.R.inc(29759);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29760);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mydmydlc8axe5y.R.inc(29761);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29762);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mydmydlc8axe5y.R.inc(29763);DateTimeZone.setDefault(zone);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29764);Locale.setDefault(locale);
        __CLR4_4_1mydmydlc8axe5y.R.inc(29765);zone = null;
    }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertySetTextMonthOfYear234() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkcsuqmyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear234",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkcsuqmyu(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29766); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29767);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29768);test.monthOfYear().set("12"); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29769);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29770);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29771);test.monthOfYear().set("December"); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29772);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29773);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29774);test.monthOfYear().set("Dec"); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29775);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyRoundCeilingHourOfDay250() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xrkvrmz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay250",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xrkvrmz4(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29776); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29777);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29778);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29779);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyToIntervalMonthOfYear288() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqcspgmz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqcspgmz8(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29780); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29781);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29782);Interval testInterval = test.monthOfYear().toInterval(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29783);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29784);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29785);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertySetDayOfWeek353() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzliy4mze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfWeek353",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzliy4mze(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29786); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29787);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29788);test.dayOfWeek().set(4); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29789);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyAddWeekOfWeekyear385() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h70apmzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h70apmzi(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29790); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29791);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29792);test.weekOfWeekyear().add(1); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29793);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay448() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu27czmzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu27czmzm(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29794); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29795);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29796);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29797);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29798);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29799);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29800);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29801);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29802);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29803);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29804);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29805);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29806);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29807);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertySetDayOfMonth548() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14n7wson00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14n7wson00(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29808); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29809);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29810);test.dayOfMonth().set(12); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29811);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay685() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2isoln04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay685",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2isoln04(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29812); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29813);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29814);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29815);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29816);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29817);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29818);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29819);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29820);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29821);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetEra711() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyqdjbn0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra711",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyqdjbn0e(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29822); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29823);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29824);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29825);assertEquals("era", test.era().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29826);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29827);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29828);assertEquals(1, test.era().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29829);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29830);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29831);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29832);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29833);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29834);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29835);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29836);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29837);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29838);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek717() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7c9fxn0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek717",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7c9fxn0v(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29839); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29840);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29841);test.dayOfWeek().add(1L); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29842);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetMillisOfSecond748() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ifx7in0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfSecond748",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ifx7in0z(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29843); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29844);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29845);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29846);assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29847);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29848);assertEquals(53, test.millisOfSecond().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29849);assertEquals("53", test.millisOfSecond().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29850);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29851);assertEquals("53", test.millisOfSecond().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29852);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29853);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29854);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29855);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29856);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek781() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grx8nzn1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grx8nzn1d(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29857); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29858);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29859);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29860);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29861);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29862);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29863);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29864);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29865);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29866);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29867);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29868);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29869);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29870);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29871);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29872);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29873);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29874);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29875);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29876);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29877);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29878);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29879);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay805() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srnup2n20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay805",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srnup2n20(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29880); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29881);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29882);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29883);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29884);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29885);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29886);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29887);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29888);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29889);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra919() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkdmtsn2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra919",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkdmtsn2a(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29890); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29891);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29892);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29893);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29894);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29895);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29896);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29897);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29898);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29899);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29900);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29901);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29902);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29903);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyRoundFloorHourOfDay936() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lq41rbn2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay936",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lq41rbn2o(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29904); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29905);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29906);test.hourOfDay().roundFloor(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29907);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetMillisOfDay967() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kze3nzn2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay967",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kze3nzn2s(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29908); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29909);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29910);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29911);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29912);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29913);assertEquals(48223053, test.millisOfDay().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29914);assertEquals("48223053", test.millisOfDay().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29915);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29916);assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29917);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29918);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29919);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29920);assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29921);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetMinuteOfHour977() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5xh1en36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour977",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5xh1en36(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29922); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29923);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29924);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29925);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29926);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29927);assertEquals(23, test.minuteOfHour().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29928);assertEquals("23", test.minuteOfHour().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29929);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29930);assertEquals("23", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29931);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29932);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29933);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29934);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29935);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear1100() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vclhmmn3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vclhmmn3k(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29936); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29937);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29938);test.weekOfWeekyear().set(4); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29939);assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetWeekyear1165() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8t692n3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear1165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8t692n3o(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29940); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29941);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29942);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29943);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29944);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29945);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29946);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29947);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29948);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29949);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29950);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29951);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29952);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29953);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertySetTextYear1171() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tcsd6n42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextYear1171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tcsd6n42(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29954); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29955);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29956);test.year().set("1960"); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29957);assertEquals("1960-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear1229() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m412h9n46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear1229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m412h9n46(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29958); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29959);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29960);test.monthOfYear().addWrapField(8); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29961);assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury1374() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pg8vwpn4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury1374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pg8vwpn4a(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29962); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29963);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29964);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29965);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29966);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29967);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29968);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29969);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29970);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29971);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29972);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29973);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29974);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29975);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay1460() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lj5gxn4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay1460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lj5gxn4o(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29976); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29977);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29978);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29979);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29980);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29981);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29982);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29983);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29984);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29985);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29986);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29987);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29988);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetYearOfEra1473() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),29989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13umpxln51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra1473",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13umpxln51(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(29989); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29990);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29991);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29992);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29993);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29994);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29995);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29996);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29997);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29998);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(29999);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30000);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30001);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30002);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay1508() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),30003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwfq3vn5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay1508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwfq3vn5f(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(30003); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30004);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30005);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30006);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30007);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30008);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30009);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30010);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30011);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30012);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30013);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30014);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30015);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30016);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 


public void testPropertySetTextDayOfYear1668() {__CLR4_4_1mydmydlc8axe5y.R.globalSliceStart(getClass().getName(),30017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1562b4an5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mydmydlc8axe5y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mydmydlc8axe5y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear1668",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1562b4an5t(){try{__CLR4_4_1mydmydlc8axe5y.R.inc(30017); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30018);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30019);test.dayOfYear().set("12"); 
     __CLR4_4_1mydmydlc8axe5y.R.inc(30020);assertEquals("2004-01-12T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1mydmydlc8axe5y.R.flushNeeded();}} 

    

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

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
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1m5km5kle6rjcqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,28965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28712);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28713);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28714);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28715);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1m5km5kle6rjcqh.R.inc(28717);try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28716);
    }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28718);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28719);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28720);zone = DateTimeZone.getDefault();
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28721);locale = Locale.getDefault();
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28722);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28723);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28724);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28725);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28726);DateTimeZone.setDefault(zone);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28727);Locale.setDefault(locale);
        __CLR4_4_1m5km5kle6rjcqh.R.inc(28728);zone = null;
    }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyRemainderHourOfDay266() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v340am61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRemainderHourOfDay266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v340am61(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28729); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28730);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28731);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyAddWrapFieldMonthOfYear446() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huts69m64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldMonthOfYear446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huts69m64(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28732); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28733);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28734);test.monthOfYear().addWrapField(8); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28735);assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyToIntervalMonthOfYear450() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wlhk9m68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyToIntervalMonthOfYear450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wlhk9m68(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28736); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28737);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28738);Interval testInterval = test.monthOfYear().toInterval(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28739);assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28740);assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28741);assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetDayOfWeek965() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxi2zdm6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetDayOfWeek965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxi2zdm6e(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28742); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28743);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28744);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28745);assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28746);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28747);assertEquals(3, test.dayOfWeek().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28748);assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28749);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28750);assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28751);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28752);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28753);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28754);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28755);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28756);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28757);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28758);assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28759);assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28760);assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28761);assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28762);assertEquals(false, test.dayOfWeek().isLeap()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28763);assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28764);assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetEra1075() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wx1vbm71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetEra1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wx1vbm71(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28765); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28766);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28767);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28768);assertEquals("era", test.era().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28769);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28770);assertSame(test, test.era().getMutableDateTime()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28771);assertEquals(1, test.era().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28772);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28773);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28774);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28775);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28776);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28777);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28778);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28779);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28780);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28781);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra1076() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etdrulm7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetCenturyOfEra1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etdrulm7i(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28782); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28783);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28784);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28785);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28786);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28787);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28788);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28789);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28790);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28791);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28792);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28793);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28794);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28795);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury1077() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aowy1m7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aowy1m7w(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28796); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28797);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28798);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28799);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28800);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28801);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28802);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28803);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28804);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28805);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28806);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28807);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28808);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28809);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetYearOfEra1078() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxrvh4m8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfEra1078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxrvh4m8a(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28810); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28811);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28812);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28813);assertEquals("yearOfEra", test.yearOfEra().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28814);assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28815);assertEquals(2004, test.yearOfEra().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28816);assertEquals("2004", test.yearOfEra().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28817);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28818);assertEquals("2004", test.yearOfEra().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28819);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28820);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28821);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28822);assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28823);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetWeekyear1079() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142ekugm8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetWeekyear1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142ekugm8o(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28824); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28825);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28826);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28827);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28828);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28829);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28830);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28831);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28832);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28833);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28834);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28835);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28836);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28837);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyAddWeekOfWeekyear1080() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kaeesm92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWeekOfWeekyear1080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kaeesm92(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28838); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28839);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28840);test.weekOfWeekyear().add(1); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28841);assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertySetTextDayOfYear1081() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpc6d5m96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextDayOfYear1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpc6d5m96(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28842); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28843);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28844);test.dayOfYear().set("12"); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28845);assertEquals("2004-01-12T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertySetDayOfMonth1082() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzjai0m9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetDayOfMonth1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzjai0m9a(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28846); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28847);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28848);test.dayOfMonth().set(12); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28849);assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay1083() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odt4v7m9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odt4v7m9e(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28850); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28851);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28852);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28853);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28854);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28855);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28856);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28857);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28858);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28859);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28860);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28861);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28862);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28863);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetMinuteOfHour1084() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv9rlsm9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv9rlsm9s(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28864); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28865);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28866);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28867);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28868);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28869);assertEquals(23, test.minuteOfHour().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28870);assertEquals("23", test.minuteOfHour().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28871);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28872);assertEquals("23", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28873);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28874);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28875);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28876);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28877);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay1085() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn3qzma6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay1085",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn3qzma6(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28878); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28879);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28880);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28881);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28882);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28883);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28884);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28885);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28886);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28887);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28888);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28889);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28890);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28891);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyGetMillisOfDay1086() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqaq0cmak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMillisOfDay1086",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqaq0cmak(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28892); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28893);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28894);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28895);assertEquals("millisOfDay", test.millisOfDay().getName()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28896);assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28897);assertEquals(48223053, test.millisOfDay().get()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28898);assertEquals("48223053", test.millisOfDay().getAsText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28899);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28900);assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28901);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28902);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28903);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28904);assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28905);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek1090() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm14vimay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddLongDayOfWeek1090",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm14vimay(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28906); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28907);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28908);test.dayOfWeek().add(1L); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28909);assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertySetTextMonthOfYear1091() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmm8pimb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetTextMonthOfYear1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmm8pimb2(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28910); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28911);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28912);test.monthOfYear().set("12"); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28913);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28914);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28915);test.monthOfYear().set("December"); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28916);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28917);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28918);test.monthOfYear().set("Dec"); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28919);assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyRoundFloorHourOfDay1092() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bn81xmbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundFloorHourOfDay1092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bn81xmbc(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28920); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28921);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28922);test.hourOfDay().roundFloor(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28923);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyRoundCeilingHourOfDay1093() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6s23vmbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay1093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6s23vmbg(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28924); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28925);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28926);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28927);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay1094() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z08a34mbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z08a34mbk(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28928); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28929);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28930);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28931);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28932);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28933);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28934);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28935);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28936);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28937);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay1095() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu1wm8mbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay1095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu1wm8mbu(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28938); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28939);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28940);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28941);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28942);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28943);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28944);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28945);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28946);test.hourOfDay().roundHalfCeiling(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28947);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay1096() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9ponkmc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfEvenHourOfDay1096",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9ponkmc4(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28948); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28949);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28950);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28951);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28952);test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28953);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28954);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28955);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28956);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28957);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28958);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28959);test.hourOfDay().roundHalfEven(); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28960);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear1241() {__CLR4_4_1m5km5kle6rjcqh.R.globalSliceStart(getClass().getName(),28961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199y9rwmch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m5km5kle6rjcqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m5km5kle6rjcqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear1241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199y9rwmch(){try{__CLR4_4_1m5km5kle6rjcqh.R.inc(28961); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28962);MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28963);test.weekOfWeekyear().set(4); 
     __CLR4_4_1m5km5kle6rjcqh.R.inc(28964);assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }finally{__CLR4_4_1m5km5kle6rjcqh.R.flushNeeded();}} 

    

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

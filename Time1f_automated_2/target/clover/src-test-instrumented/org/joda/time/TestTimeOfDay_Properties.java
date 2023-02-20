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
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1jsvjsvle6nl8hb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25663);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25664);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25665);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25666);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1jsvjsvle6nl8hb.R.inc(25668);try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25667);
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25669);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25670);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25671);zone = DateTimeZone.getDefault();
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25672);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25673);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25674);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25675);DateTimeZone.setDefault(zone);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25676);zone = null;
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetHourOfDay193() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhvp34jt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetHourOfDay193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhvp34jt9(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25677); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25678);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25679);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25680);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25681);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25682);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25683);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25684);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25685);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25686);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25687);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25688);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25689);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25690);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25691);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25692);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
public void testPropertyGetMaxMinValuesDay194() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174192ujtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesDay194",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174192ujtp(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25693); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25694);YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25695);assertEquals(1, test.dayOfMonth().getMinimumValue()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25696);assertEquals(1, test.dayOfMonth().getMinimumValueOverall()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25697);assertEquals(30, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25698);assertEquals(31, test.dayOfMonth().getMaximumValueOverall()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25699);test = new YearMonthDay(1972, 7, 9); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25700);assertEquals(31, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25701);test = new YearMonthDay(1972, 2, 9); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25702);assertEquals(29, test.dayOfMonth().getMaximumValue()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25703);test = new YearMonthDay(1971, 2, 9); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25704);assertEquals(28, test.dayOfMonth().getMaximumValue()); 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
public void testPropertySetMinute475() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zfc1iju1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute475",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zfc1iju1(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25705); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25706);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25707);TimeOfDay copy = test.minuteOfHour().setCopy(12); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25708);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25709);check(copy, 10, 12, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25710);try { 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25711);test.minuteOfHour().setCopy(60); 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25712);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25713);try { 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25714);test.minuteOfHour().setCopy(-1); 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25715);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
public void testPropertySetMilli480() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q4vlq9juc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli480",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q4vlq9juc(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25716); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25717);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25718);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25719);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25720);check(copy, 10, 20, 30, 49); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25721);try { 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25722);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25723);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25724);try { 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25725);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1jsvjsvle6nl8hb.R.inc(25726);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
public void testPropertyGetMinute481() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icojqnjun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute481",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icojqnjun(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25727); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25728);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25729);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25730);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25731);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25732);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25733);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25734);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25735);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25736);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25737);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25738);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25739);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25740);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25741);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25742);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
public void testPropertyAddWrapFieldHour482() {__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceStart(getClass().getName(),25743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5emorjv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsvjsvle6nl8hb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsvjsvle6nl8hb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour482",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5emorjv3(){try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25743); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25744);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25745);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25746);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25747);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25748);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25749);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25750);copy = test.hourOfDay().addWrapFieldToCopy(18); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25751);check(copy, 4, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25752);copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25753);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25754);copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     __CLR4_4_1jsvjsvle6nl8hb.R.inc(25755);check(copy, 19, 20, 30, 40); 
 }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1jsvjsvle6nl8hb.R.inc(25756);
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25757);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25758);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25759);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1jsvjsvle6nl8hb.R.inc(25760);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1jsvjsvle6nl8hb.R.flushNeeded();}}
}

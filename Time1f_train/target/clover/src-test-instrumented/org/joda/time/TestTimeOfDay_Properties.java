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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1puspuslc8axeju{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,33657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1puspuslc8axeju.R.inc(33508);
        __CLR4_4_1puspuslc8axeju.R.inc(33509);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1puspuslc8axeju.R.inc(33510);
        __CLR4_4_1puspuslc8axeju.R.inc(33511);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1puspuslc8axeju.R.inc(33513);try{__CLR4_4_1puspuslc8axeju.R.inc(33512);
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1puspuslc8axeju.R.inc(33514);
        __CLR4_4_1puspuslc8axeju.R.inc(33515);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1puspuslc8axeju.R.inc(33516);zone = DateTimeZone.getDefault();
        __CLR4_4_1puspuslc8axeju.R.inc(33517);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1puspuslc8axeju.R.inc(33518);
        __CLR4_4_1puspuslc8axeju.R.inc(33519);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1puspuslc8axeju.R.inc(33520);DateTimeZone.setDefault(zone);
        __CLR4_4_1puspuslc8axeju.R.inc(33521);zone = null;
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertySetMinute83() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1hi1dpv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute83",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1hi1dpv6(){try{__CLR4_4_1puspuslc8axeju.R.inc(33522); 
     __CLR4_4_1puspuslc8axeju.R.inc(33523);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33524);TimeOfDay copy = test.minuteOfHour().setCopy(12); 
     __CLR4_4_1puspuslc8axeju.R.inc(33525);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33526);check(copy, 10, 12, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33527);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33528);test.minuteOfHour().setCopy(60); 
         __CLR4_4_1puspuslc8axeju.R.inc(33529);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1puspuslc8axeju.R.inc(33530);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33531);test.minuteOfHour().setCopy(-1); 
         __CLR4_4_1puspuslc8axeju.R.inc(33532);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyAddNoWrapMilli91() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6xh2xpvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli91",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6xh2xpvh(){try{__CLR4_4_1puspuslc8axeju.R.inc(33533); 
     __CLR4_4_1puspuslc8axeju.R.inc(33534);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33535);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9); 
     __CLR4_4_1puspuslc8axeju.R.inc(33536);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33537);check(copy, 10, 20, 30, 49); 
     __CLR4_4_1puspuslc8axeju.R.inc(33538);copy = test.millisOfSecond().addNoWrapToCopy(959); 
     __CLR4_4_1puspuslc8axeju.R.inc(33539);check(copy, 10, 20, 30, 999); 
     __CLR4_4_1puspuslc8axeju.R.inc(33540);copy = test.millisOfSecond().addNoWrapToCopy(960); 
     __CLR4_4_1puspuslc8axeju.R.inc(33541);check(copy, 10, 20, 31, 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33542);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959); 
     __CLR4_4_1puspuslc8axeju.R.inc(33543);check(copy, 23, 59, 59, 999); 
     __CLR4_4_1puspuslc8axeju.R.inc(33544);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33545);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960); 
         __CLR4_4_1puspuslc8axeju.R.inc(33546);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1puspuslc8axeju.R.inc(33547);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33548);copy = test.millisOfSecond().addNoWrapToCopy(-9); 
     __CLR4_4_1puspuslc8axeju.R.inc(33549);check(copy, 10, 20, 30, 31); 
     __CLR4_4_1puspuslc8axeju.R.inc(33550);copy = test.millisOfSecond().addNoWrapToCopy(-40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33551);check(copy, 10, 20, 30, 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33552);copy = test.millisOfSecond().addNoWrapToCopy(-41); 
     __CLR4_4_1puspuslc8axeju.R.inc(33553);check(copy, 10, 20, 29, 999); 
     __CLR4_4_1puspuslc8axeju.R.inc(33554);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40)); 
     __CLR4_4_1puspuslc8axeju.R.inc(33555);check(copy, 0, 0, 0, 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33556);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33557);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41)); 
         __CLR4_4_1puspuslc8axeju.R.inc(33558);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1puspuslc8axeju.R.inc(33559);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyAddHour127() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvw7vlpw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvw7vlpw8(){try{__CLR4_4_1puspuslc8axeju.R.inc(33560); 
     __CLR4_4_1puspuslc8axeju.R.inc(33561);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33562);TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     __CLR4_4_1puspuslc8axeju.R.inc(33563);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33564);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33565);copy = test.hourOfDay().addToCopy(0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33566);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33567);copy = test.hourOfDay().addToCopy(13); 
     __CLR4_4_1puspuslc8axeju.R.inc(33568);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33569);copy = test.hourOfDay().addToCopy(14); 
     __CLR4_4_1puspuslc8axeju.R.inc(33570);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33571);copy = test.hourOfDay().addToCopy(-10); 
     __CLR4_4_1puspuslc8axeju.R.inc(33572);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33573);copy = test.hourOfDay().addToCopy(-11); 
     __CLR4_4_1puspuslc8axeju.R.inc(33574);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour204() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n51ffpwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour204",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n51ffpwn(){try{__CLR4_4_1puspuslc8axeju.R.inc(33575); 
     __CLR4_4_1puspuslc8axeju.R.inc(33576);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33577);TimeOfDay copy = test.hourOfDay().withMaximumValue(); 
     __CLR4_4_1puspuslc8axeju.R.inc(33578);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33579);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyGetMinute435() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvr3c6pws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvr3c6pws(){try{__CLR4_4_1puspuslc8axeju.R.inc(33580); 
     __CLR4_4_1puspuslc8axeju.R.inc(33581);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33582);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33583);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33584);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33585);assertSame(test, test.minuteOfHour().getReadablePartial()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33586);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33587);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33588);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33589);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33590);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1puspuslc8axeju.R.inc(33591);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33592);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1puspuslc8axeju.R.inc(33593);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33594);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33595);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1puspuslc8axeju.R.inc(33596);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyWithMinimumValueHour831() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h68kuhpx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour831",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h68kuhpx9(){try{__CLR4_4_1puspuslc8axeju.R.inc(33597); 
     __CLR4_4_1puspuslc8axeju.R.inc(33598);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33599);TimeOfDay copy = test.hourOfDay().withMinimumValue(); 
     __CLR4_4_1puspuslc8axeju.R.inc(33600);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33601);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertySetTextHour887() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u3wy2apxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour887",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u3wy2apxe(){try{__CLR4_4_1puspuslc8axeju.R.inc(33602); 
     __CLR4_4_1puspuslc8axeju.R.inc(33603);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33604);TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     __CLR4_4_1puspuslc8axeju.R.inc(33605);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33606);check(copy, 12, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertySetMilli1183() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swr850pxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli1183",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swr850pxj(){try{__CLR4_4_1puspuslc8axeju.R.inc(33607); 
     __CLR4_4_1puspuslc8axeju.R.inc(33608);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33609);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1puspuslc8axeju.R.inc(33610);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33611);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1puspuslc8axeju.R.inc(33612);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33613);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1puspuslc8axeju.R.inc(33614);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1puspuslc8axeju.R.inc(33615);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33616);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1puspuslc8axeju.R.inc(33617);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesSecond1209() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u46i5gpxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesSecond1209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u46i5gpxu(){try{__CLR4_4_1puspuslc8axeju.R.inc(33618); 
     __CLR4_4_1puspuslc8axeju.R.inc(33619);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33620);assertEquals(0, test.secondOfMinute().getMinimumValue()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33621);assertEquals(0, test.secondOfMinute().getMinimumValueOverall()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33622);assertEquals(59, test.secondOfMinute().getMaximumValue()); 
     __CLR4_4_1puspuslc8axeju.R.inc(33623);assertEquals(59, test.secondOfMinute().getMaximumValueOverall()); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyAddWrapFieldHour1389() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmhye4py0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour1389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmhye4py0(){try{__CLR4_4_1puspuslc8axeju.R.inc(33624); 
     __CLR4_4_1puspuslc8axeju.R.inc(33625);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33626);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1puspuslc8axeju.R.inc(33627);check(test, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33628);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33629);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33630);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33631);copy = test.hourOfDay().addWrapFieldToCopy(18); 
     __CLR4_4_1puspuslc8axeju.R.inc(33632);check(copy, 4, 20, 30, 40); 
     __CLR4_4_1puspuslc8axeju.R.inc(33633);copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     __CLR4_4_1puspuslc8axeju.R.inc(33634);check(copy, 19, 20, 30, 40); 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 


public void testPropertyCompareToSecond1612() {__CLR4_4_1puspuslc8axeju.R.globalSliceStart(getClass().getName(),33635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cofupyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1puspuslc8axeju.R.rethrow($CLV_t2$);}finally{__CLR4_4_1puspuslc8axeju.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond1612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cofupyb(){try{__CLR4_4_1puspuslc8axeju.R.inc(33635); 
     __CLR4_4_1puspuslc8axeju.R.inc(33636);TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     __CLR4_4_1puspuslc8axeju.R.inc(33637);TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     __CLR4_4_1puspuslc8axeju.R.inc(33638);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33639);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33640);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33641);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33642);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1puspuslc8axeju.R.inc(33643);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1puspuslc8axeju.R.inc(33644);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1puspuslc8axeju.R.inc(33645);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1puspuslc8axeju.R.inc(33646);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33647);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33648);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1puspuslc8axeju.R.inc(33649);try { 
         __CLR4_4_1puspuslc8axeju.R.inc(33650);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1puspuslc8axeju.R.inc(33651);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1puspuslc8axeju.R.inc(33652);
        __CLR4_4_1puspuslc8axeju.R.inc(33653);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1puspuslc8axeju.R.inc(33654);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1puspuslc8axeju.R.inc(33655);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1puspuslc8axeju.R.inc(33656);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1puspuslc8axeju.R.flushNeeded();}}
}

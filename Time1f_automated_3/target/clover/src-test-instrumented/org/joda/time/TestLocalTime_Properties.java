/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1imximxle6np4hk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1imximxle6np4hk.R.inc(24153);
        __CLR4_4_1imximxle6np4hk.R.inc(24154);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1imximxle6np4hk.R.inc(24155);
        __CLR4_4_1imximxle6np4hk.R.inc(24156);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1imximxle6np4hk.R.inc(24158);try{__CLR4_4_1imximxle6np4hk.R.inc(24157);
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1imximxle6np4hk.R.inc(24159);
        __CLR4_4_1imximxle6np4hk.R.inc(24160);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1imximxle6np4hk.R.inc(24161);zone = DateTimeZone.getDefault();
        __CLR4_4_1imximxle6np4hk.R.inc(24162);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1imximxle6np4hk.R.inc(24163);
        __CLR4_4_1imximxle6np4hk.R.inc(24164);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1imximxle6np4hk.R.inc(24165);DateTimeZone.setDefault(zone);
        __CLR4_4_1imximxle6np4hk.R.inc(24166);zone = null;
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testProperty434() {__CLR4_4_1imximxle6np4hk.R.globalSliceStart(getClass().getName(),24167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjfv3pinb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imximxle6np4hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imximxle6np4hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testProperty434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjfv3pinb(){try{__CLR4_4_1imximxle6np4hk.R.inc(24167); 
     __CLR4_4_1imximxle6np4hk.R.inc(24168);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24169);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1imximxle6np4hk.R.inc(24170);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1imximxle6np4hk.R.inc(24171);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1imximxle6np4hk.R.inc(24172);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1imximxle6np4hk.R.inc(24173);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1imximxle6np4hk.R.inc(24174);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24175);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24176);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24177);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24178);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24179);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24180);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     __CLR4_4_1imximxle6np4hk.R.inc(24181);try { 
         __CLR4_4_1imximxle6np4hk.R.inc(24182);test.property(DateTimeFieldType.dayOfWeek()); 
         __CLR4_4_1imximxle6np4hk.R.inc(24183);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1imximxle6np4hk.R.inc(24184);try { 
         __CLR4_4_1imximxle6np4hk.R.inc(24185);test.property(null); 
         __CLR4_4_1imximxle6np4hk.R.inc(24186);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}
public void testPropertyAddWrapFieldHour435() {__CLR4_4_1imximxle6np4hk.R.globalSliceStart(getClass().getName(),24187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddc4arinv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imximxle6np4hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imximxle6np4hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyAddWrapFieldHour435",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddc4arinv(){try{__CLR4_4_1imximxle6np4hk.R.inc(24187); 
     __CLR4_4_1imximxle6np4hk.R.inc(24188);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24189);LocalTime copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1imximxle6np4hk.R.inc(24190);check(test, 10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24191);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24192);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1imximxle6np4hk.R.inc(24193);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24194);copy = test.hourOfDay().addWrapFieldToCopy(13); 
     __CLR4_4_1imximxle6np4hk.R.inc(24195);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24196);copy = test.hourOfDay().addWrapFieldToCopy(14); 
     __CLR4_4_1imximxle6np4hk.R.inc(24197);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24198);copy = test.hourOfDay().addWrapFieldToCopy(-10); 
     __CLR4_4_1imximxle6np4hk.R.inc(24199);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24200);copy = test.hourOfDay().addWrapFieldToCopy(-11); 
     __CLR4_4_1imximxle6np4hk.R.inc(24201);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}
public void testPropertyRoundHour436() {__CLR4_4_1imximxle6np4hk.R.globalSliceStart(getClass().getName(),24202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi94tvioa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imximxle6np4hk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imximxle6np4hk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour436",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi94tvioa(){try{__CLR4_4_1imximxle6np4hk.R.inc(24202); 
     __CLR4_4_1imximxle6np4hk.R.inc(24203);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24204);check(test.hourOfDay().roundCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24205);check(test.hourOfDay().roundFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24206);check(test.hourOfDay().roundHalfCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24207);check(test.hourOfDay().roundHalfFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24208);check(test.hourOfDay().roundHalfEvenCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24209);test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24210);check(test.hourOfDay().roundCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24211);check(test.hourOfDay().roundFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24212);check(test.hourOfDay().roundHalfCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24213);check(test.hourOfDay().roundHalfFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24214);check(test.hourOfDay().roundHalfEvenCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24215);test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24216);check(test.hourOfDay().roundCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24217);check(test.hourOfDay().roundFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24218);check(test.hourOfDay().roundHalfCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24219);check(test.hourOfDay().roundHalfFloorCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24220);check(test.hourOfDay().roundHalfEvenCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24221);test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24222);check(test.hourOfDay().roundCeilingCopy(), 0, 20, 30, 40); 
     __CLR4_4_1imximxle6np4hk.R.inc(24223);check(test.hourOfDay().roundFloorCopy(), 0, 20, 30, 40);
}finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1imximxle6np4hk.R.inc(24224);
        __CLR4_4_1imximxle6np4hk.R.inc(24225);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1imximxle6np4hk.R.inc(24226);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1imximxle6np4hk.R.inc(24227);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1imximxle6np4hk.R.inc(24228);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1imximxle6np4hk.R.flushNeeded();}}
}

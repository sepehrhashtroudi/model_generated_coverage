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
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1m0tm0tlc8axe2d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,28711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28541);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28542);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28543);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28544);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1m0tm0tlc8axe2d.R.inc(28546);try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28545);
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28547);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28548);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28549);zone = DateTimeZone.getDefault();
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28550);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28551);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28552);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28553);DateTimeZone.setDefault(zone);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28554);zone = null;
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyPlusHour160() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhlt83m17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhlt83m17(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28555); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28556);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28557);LocalTime copy = test.hourOfDay().addCopy(9); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28558);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28559);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28560);copy = test.hourOfDay().addCopy(0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28561);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28562);copy = test.hourOfDay().addCopy(13); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28563);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28564);copy = test.hourOfDay().addCopy(14); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28565);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28566);copy = test.hourOfDay().addCopy(-10); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28567);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28568);copy = test.hourOfDay().addCopy(-11); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28569);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertySetTextSecond207() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apfz8km1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond207",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apfz8km1m(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28570); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28571);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28572);LocalTime copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28573);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28574);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyCompareToMinute263() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18g4zo7m1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18g4zo7m1r(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28575); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28576);LocalTime test1 = new LocalTime(TEST_TIME1); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28577);LocalTime test2 = new LocalTime(TEST_TIME2); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28578);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28579);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28580);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28581);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28582);test1.minuteOfHour().compareTo((ReadablePartial) null); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28583);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28584);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28585);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28586);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28587);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28588);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28589);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28590);test1.minuteOfHour().compareTo((ReadableInstant) null); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28591);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertySetSecond659() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18l95n2m28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond659",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18l95n2m28(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28592); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28593);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28594);LocalTime copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28595);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28596);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28597);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28598);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28599);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28600);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28601);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28602);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyRoundHour836() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyuddjm2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour836",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyuddjm2j(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28603); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28604);LocalTime test = new LocalTime(10, 20); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28605);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28606);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28607);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28608);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28609);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28610);test = new LocalTime(10, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28611);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28612);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28613);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28614);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28615);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28616);test = new LocalTime(10, 30); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28617);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28618);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28619);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28620);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28621);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28622);test = new LocalTime(11, 30); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28623);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28624);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28625);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28626);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28627);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyWithMaxMinValueHour1081() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxsagpm38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxsagpm38(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28628); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28629);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28630);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28631);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertySetMilli1259() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5fodam3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli1259",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5fodam3c(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28632); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28633);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28634);LocalTime copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28635);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28636);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28637);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28638);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28639);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28640);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28641);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28642);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyPlusNoWrapMinute1348() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g43vxm3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute1348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g43vxm3n(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28643); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28644);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28645);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28646);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28647);check(copy, 10, 29, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28648);copy = test.minuteOfHour().addNoWrapToCopy(39); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28649);check(copy, 10, 59, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28650);copy = test.minuteOfHour().addNoWrapToCopy(40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28651);check(copy, 11, 0, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28652);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28653);check(copy, 12, 5, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28654);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28655);check(copy, 23, 59, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28656);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28657);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28658);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28659);check(test, 10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28660);copy = test.minuteOfHour().addNoWrapToCopy(-9); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28661);check(copy, 10, 11, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28662);copy = test.minuteOfHour().addNoWrapToCopy(-19); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28663);check(copy, 10, 1, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28664);copy = test.minuteOfHour().addNoWrapToCopy(-20); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28665);check(copy, 10, 0, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28666);copy = test.minuteOfHour().addNoWrapToCopy(-21); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28667);check(copy, 9, 59, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28668);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28669);check(copy, 0, 0, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28670);try { 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28671);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21)); 
         __CLR4_4_1m0tm0tlc8axe2d.R.inc(28672);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28673);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyGetMinute1539() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwspvwm4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute1539",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwspvwm4i(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28674); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28675);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28676);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28677);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28678);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28679);assertSame(test, test.minuteOfHour().getLocalTime()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28680);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28681);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28682);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28683);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28684);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28685);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28686);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28687);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28688);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28689);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 


public void testPropertyGetHour1635() {__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceStart(getClass().getName(),28690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7txnlm4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m0tm0tlc8axe2d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m0tm0tlc8axe2d.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour1635",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7txnlm4y(){try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28690); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28691);LocalTime test = new LocalTime(10, 20, 30, 40); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28692);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28693);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28694);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28695);assertSame(test, test.hourOfDay().getLocalTime()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28696);assertEquals(10, test.hourOfDay().get()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28697);assertEquals("10", test.hourOfDay().getAsString()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28698);assertEquals("10", test.hourOfDay().getAsText()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28699);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28700);assertEquals("10", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28701);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28702);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28703);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28704);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1m0tm0tlc8axe2d.R.inc(28705);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1m0tm0tlc8axe2d.R.inc(28706);
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28707);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28708);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28709);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1m0tm0tlc8axe2d.R.inc(28710);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1m0tm0tlc8axe2d.R.flushNeeded();}}
}

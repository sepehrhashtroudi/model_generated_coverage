/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1i4zi4zle6o79st{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,23587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1i4zi4zle6o79st.R.inc(23507);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23508);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i4zi4zle6o79st.R.inc(23509);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23510);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1i4zi4zle6o79st.R.inc(23512);try{__CLR4_4_1i4zi4zle6o79st.R.inc(23511);
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i4zi4zle6o79st.R.inc(23513);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23514);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23515);zone = DateTimeZone.getDefault();
        __CLR4_4_1i4zi4zle6o79st.R.inc(23516);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23517);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1i4zi4zle6o79st.R.inc(23518);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i4zi4zle6o79st.R.inc(23519);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23520);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i4zi4zle6o79st.R.inc(23521);DateTimeZone.setDefault(zone);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23522);zone = null;
        __CLR4_4_1i4zi4zle6o79st.R.inc(23523);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23524);systemDefaultLocale = null;
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyCompareToDay536() {__CLR4_4_1i4zi4zle6o79st.R.globalSliceStart(getClass().getName(),23525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m074cci5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4zi4zle6o79st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4zi4zle6o79st.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay536",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m074cci5h(){try{__CLR4_4_1i4zi4zle6o79st.R.inc(23525); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23526);LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23527);LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23528);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23529);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23530);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23531);try { 
         __CLR4_4_1i4zi4zle6o79st.R.inc(23532);test1.dayOfMonth().compareTo((ReadablePartial) null); 
         __CLR4_4_1i4zi4zle6o79st.R.inc(23533);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23534);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23535);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23536);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23537);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23538);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23539);try { 
         __CLR4_4_1i4zi4zle6o79st.R.inc(23540);test1.dayOfMonth().compareTo((ReadableInstant) null); 
         __CLR4_4_1i4zi4zle6o79st.R.inc(23541);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
public void testPropertyWithMaxMinValueHour537() {__CLR4_4_1i4zi4zle6o79st.R.globalSliceStart(getClass().getName(),23542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6s4iui5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4zi4zle6o79st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4zi4zle6o79st.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6s4iui5y(){try{__CLR4_4_1i4zi4zle6o79st.R.inc(23542); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23543);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23544);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23545);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
public void testPropertyAddToCopyYear540() {__CLR4_4_1i4zi4zle6o79st.R.globalSliceStart(getClass().getName(),23546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9c0fi62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4zi4zle6o79st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4zi4zle6o79st.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyYear540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9c0fi62(){try{__CLR4_4_1i4zi4zle6o79st.R.inc(23546); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23547);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23548);LocalDateTime copy = test.year().addToCopy(9); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23549);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23550);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23551);copy = test.year().addToCopy(0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23552);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23553);copy = test.year().addToCopy(292278993 - 2005 + 1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23554);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23555);copy = test.year().addToCopy(-292275054 - 2005 - 1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23556);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23557);copy = test.year().addToCopy(-292275054 - 2005 - 1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23558);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
public void testPropertyAddWrapFieldLocalDateTime542() {__CLR4_4_1i4zi4zle6o79st.R.globalSliceStart(getClass().getName(),23559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t6o0mi6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4zi4zle6o79st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4zi4zle6o79st.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldLocalDateTime542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t6o0mi6f(){try{__CLR4_4_1i4zi4zle6o79st.R.inc(23559); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23560);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23561);LocalDateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23562);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23563);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23564);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23565);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23566);copy = test.year().addWrapFieldToCopy(292278993 - 2005 + 1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23567);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23568);copy = test.year().addWrapFieldToCopy(-292275054 - 2005 - 1); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23569);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
public void testPropertyAddWrapFieldToCopyDay543() {__CLR4_4_1i4zi4zle6o79st.R.globalSliceStart(getClass().getName(),23570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_168ghrvi6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i4zi4zle6o79st.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i4zi4zle6o79st.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyDay543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_168ghrvi6q(){try{__CLR4_4_1i4zi4zle6o79st.R.inc(23570); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23571);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23572);LocalDateTime copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23573);check(test, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23574);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23575);copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23576);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23577);copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     __CLR4_4_1i4zi4zle6o79st.R.inc(23578);check(copy, 2005, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1i4zi4zle6o79st.R.inc(23579);
        __CLR4_4_1i4zi4zle6o79st.R.inc(23580);assertEquals(year, test.getYear());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23581);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23582);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23583);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23584);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23585);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1i4zi4zle6o79st.R.inc(23586);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1i4zi4zle6o79st.R.flushNeeded();}}
}

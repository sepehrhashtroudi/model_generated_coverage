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
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1ie9ie9le6ndpkf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23841);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23842);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23843);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23844);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1ie9ie9le6ndpkf.R.inc(23846);try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23845);
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23847);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23848);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23849);zone = DateTimeZone.getDefault();
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23850);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23851);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23852);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23853);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23854);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23855);DateTimeZone.setDefault(zone);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23856);zone = null;
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23857);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23858);systemDefaultLocale = null;
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyRoundHour667() {__CLR4_4_1ie9ie9le6ndpkf.R.globalSliceStart(getClass().getName(),23859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vf3ofhier();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie9ie9le6ndpkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie9ie9le6ndpkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour667",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vf3ofhier(){try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23859); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23860);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23861);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23862);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23863);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23864);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23865);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23866);test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23867);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23868);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23869);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23870);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23871);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23872);test = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23873);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23874);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23875);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40);
}finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}

public void testPropertyRoundHalfCeilingHourOfDay669() {__CLR4_4_1ie9ie9le6ndpkf.R.globalSliceStart(getClass().getName(),23876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b96cwyif8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ie9ie9le6ndpkf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ie9ie9le6ndpkf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b96cwyif8(){try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23876); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23877);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23878);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23879);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23880);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23881);test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23882);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23883);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1ie9ie9le6ndpkf.R.inc(23884);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 20, 30, 40); 
 }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1ie9ie9le6ndpkf.R.inc(23885);
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23886);assertEquals(year, test.getYear());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23887);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23888);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23889);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23890);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23891);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ie9ie9le6ndpkf.R.inc(23892);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1ie9ie9le6ndpkf.R.flushNeeded();}}
}

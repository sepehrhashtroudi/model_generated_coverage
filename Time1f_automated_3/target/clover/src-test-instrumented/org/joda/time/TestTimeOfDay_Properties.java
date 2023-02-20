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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1jtdjtdle6np4mn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25736,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25681);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25682);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25683);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25684);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1jtdjtdle6np4mn.R.inc(25686);try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25685);
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25687);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25688);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25689);zone = DateTimeZone.getDefault();
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25690);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25691);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25692);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25693);DateTimeZone.setDefault(zone);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25694);zone = null;
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyAddWrapFieldHour488() {__CLR4_4_1jtdjtdle6np4mn.R.globalSliceStart(getClass().getName(),25695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tneffljtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtdjtdle6np4mn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtdjtdle6np4mn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour488",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tneffljtr(){try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25695); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25696);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25697);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25698);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25699);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25700);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25701);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25702);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25703);copy = test.hourOfDay().addWrapFieldToCopy(13); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25704);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25705);copy = test.hourOfDay().addWrapFieldToCopy(14); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25706);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25707);copy = test.hourOfDay().addWrapFieldToCopy(-10); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25708);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25709);copy = test.hourOfDay().addWrapFieldToCopy(-11); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25710);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}
public void testPropertyAddWrapFieldHour489() {__CLR4_4_1jtdjtdle6np4mn.R.globalSliceStart(getClass().getName(),25711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwee82ju7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtdjtdle6np4mn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtdjtdle6np4mn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour489",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwee82ju7(){try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25711); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25712);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25713);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25714);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25715);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25716);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25717);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25718);copy = test.hourOfDay().addWrapFieldToCopy(13); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25719);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25720);copy = test.hourOfDay().addWrapFieldToCopy(14); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25721);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25722);copy = test.hourOfDay().addWrapFieldToCopy(-10); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25723);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25724);copy = test.hourOfDay().addWrapFieldToCopy(-11); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25725);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}
public void testPropertyWithMinimumValueHour490() {__CLR4_4_1jtdjtdle6np4mn.R.globalSliceStart(getClass().getName(),25726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cbjd5ujum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtdjtdle6np4mn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtdjtdle6np4mn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour490",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cbjd5ujum(){try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25726); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25727);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25728);TimeOfDay copy = test.hourOfDay().withMinimumValue(); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25729);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtdjtdle6np4mn.R.inc(25730);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1jtdjtdle6np4mn.R.inc(25731);
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25732);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25733);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25734);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1jtdjtdle6np4mn.R.inc(25735);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1jtdjtdle6np4mn.R.flushNeeded();}}
}

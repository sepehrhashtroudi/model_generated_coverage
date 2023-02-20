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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1jtrjtrle6o7a2b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25775,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25695);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25696);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25697);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25698);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1jtrjtrle6o7a2b.R.inc(25700);try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25699);
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25701);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25702);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25703);zone = DateTimeZone.getDefault();
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25704);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25705);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25706);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25707);DateTimeZone.setDefault(zone);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25708);zone = null;
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithers453() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145olqtju5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testWithers453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145olqtju5(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25709); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25710);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25711);check(test.withHourOfDay(6), 6, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25712);check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25713);check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25714);check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25715);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25716);test.withHourOfDay(-1); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25717);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25718);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25719);test.withHourOfDay(24); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25720);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
public void testPropertySetTextHour460() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rhq6vdjuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour460",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rhq6vdjuh(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25721); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25722);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25723);TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25724);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25725);check(copy, 12, 20, 30, 40); 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
public void testSetMilliOfSecond462() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiiqwfjum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testSetMilliOfSecond462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiiqwfjum(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25726); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25727);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25728);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25729);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25730);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25731);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25732);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25733);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25734);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25735);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25736);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
public void testPropertySetTextSecond463() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1too1ngjux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextSecond463",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1too1ngjux(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25737); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25738);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25739);TimeOfDay copy = test.secondOfMinute().setCopy("12"); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25740);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25741);check(copy, 10, 20, 12, 40); 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
public void testPropertyCompareToSecond465() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5czqrjv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5czqrjv2(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25742); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25743);TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25744);TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25745);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25746);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25747);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25748);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25749);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25750);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25751);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25752);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25753);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25754);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25755);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25756);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25757);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25758);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
public void testPropertySetSecond466() {__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceStart(getClass().getName(),25759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnb898jvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jtrjtrle6o7a2b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jtrjtrle6o7a2b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetSecond466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnb898jvj(){try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25759); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25760);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25761);TimeOfDay copy = test.secondOfMinute().setCopy(12); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25762);check(test, 10, 20, 30, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25763);check(copy, 10, 20, 12, 40); 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25764);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25765);test.secondOfMinute().setCopy(60); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25766);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jtrjtrle6o7a2b.R.inc(25767);try { 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25768);test.secondOfMinute().setCopy(-1); 
         __CLR4_4_1jtrjtrle6o7a2b.R.inc(25769);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1jtrjtrle6o7a2b.R.inc(25770);
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25771);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25772);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25773);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1jtrjtrle6o7a2b.R.inc(25774);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1jtrjtrle6o7a2b.R.flushNeeded();}}
}

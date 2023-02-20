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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1oixoixle6rcm5b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,31918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oixoixle6rcm5b.R.inc(31785);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31786);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oixoixle6rcm5b.R.inc(31787);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31788);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1oixoixle6rcm5b.R.inc(31790);try{__CLR4_4_1oixoixle6rcm5b.R.inc(31789);
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oixoixle6rcm5b.R.inc(31791);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31792);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31793);zone = DateTimeZone.getDefault();
        __CLR4_4_1oixoixle6rcm5b.R.inc(31794);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oixoixle6rcm5b.R.inc(31795);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31796);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oixoixle6rcm5b.R.inc(31797);DateTimeZone.setDefault(zone);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31798);zone = null;
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddHour395() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb6onsojb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour395",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb6onsojb(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31799); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31800);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31801);TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31802);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31803);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31804);copy = test.hourOfDay().addToCopy(0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31805);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31806);copy = test.hourOfDay().addToCopy(13); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31807);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31808);copy = test.hourOfDay().addToCopy(14); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31809);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31810);copy = test.hourOfDay().addToCopy(-10); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31811);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31812);copy = test.hourOfDay().addToCopy(-11); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31813);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertyGetMinute430() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4qxajojq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4qxajojq(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31814); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31815);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31816);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31817);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31818);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31819);assertSame(test, test.minuteOfHour().getReadablePartial()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31820);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31821);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31822);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31823);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31824);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31825);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31826);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31827);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31828);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31829);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31830);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertyCompareToSecond1125() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kpn4axok7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond1125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kpn4axok7(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31831); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31832);TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31833);TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31834);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31835);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31836);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31837);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31838);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31839);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31840);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31841);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31842);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31843);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31844);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31845);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31846);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31847);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertySetMinute1131() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xxgxgoko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute1131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xxgxgoko(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31848); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31849);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31850);TimeOfDay copy = test.minuteOfHour().setCopy(12); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31851);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31852);check(copy, 10, 12, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31853);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31854);test.minuteOfHour().setCopy(60); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31855);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31856);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31857);test.minuteOfHour().setCopy(-1); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31858);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertySetTextHour1146() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm2dzpokz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour1146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm2dzpokz(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31859); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31860);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31861);TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31862);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31863);check(copy, 12, 20, 30, 40); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesSecond1147() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12k8rnhol4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesSecond1147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12k8rnhol4(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31864); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31865);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31866);assertEquals(0, test.secondOfMinute().getMinimumValue()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31867);assertEquals(0, test.secondOfMinute().getMinimumValueOverall()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31868);assertEquals(59, test.secondOfMinute().getMaximumValue()); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31869);assertEquals(59, test.secondOfMinute().getMaximumValueOverall()); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertySetMilli1148() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12oki3nola();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli1148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12oki3nola(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31870); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31871);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31872);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31873);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31874);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31875);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31876);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31877);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31878);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31879);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31880);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertyAddNoWrapMilli1150() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ulbqoll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli1150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ulbqoll(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31881); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31882);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31883);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31884);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31885);check(copy, 10, 20, 30, 49); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31886);copy = test.millisOfSecond().addNoWrapToCopy(959); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31887);check(copy, 10, 20, 30, 999); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31888);copy = test.millisOfSecond().addNoWrapToCopy(960); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31889);check(copy, 10, 20, 31, 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31890);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31891);check(copy, 23, 59, 59, 999); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31892);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31893);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31894);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31895);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31896);copy = test.millisOfSecond().addNoWrapToCopy(-9); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31897);check(copy, 10, 20, 30, 31); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31898);copy = test.millisOfSecond().addNoWrapToCopy(-40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31899);check(copy, 10, 20, 30, 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31900);copy = test.millisOfSecond().addNoWrapToCopy(-41); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31901);check(copy, 10, 20, 29, 999); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31902);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40)); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31903);check(copy, 0, 0, 0, 0); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31904);try { 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31905);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41)); 
         __CLR4_4_1oixoixle6rcm5b.R.inc(31906);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31907);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour1151() {__CLR4_4_1oixoixle6rcm5b.R.globalSliceStart(getClass().getName(),31908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv41dnomc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oixoixle6rcm5b.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oixoixle6rcm5b.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour1151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv41dnomc(){try{__CLR4_4_1oixoixle6rcm5b.R.inc(31908); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31909);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31910);TimeOfDay copy = test.hourOfDay().withMaximumValue(); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31911);check(test, 10, 20, 30, 40); 
     __CLR4_4_1oixoixle6rcm5b.R.inc(31912);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1oixoixle6rcm5b.R.inc(31913);
        __CLR4_4_1oixoixle6rcm5b.R.inc(31914);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1oixoixle6rcm5b.R.inc(31915);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1oixoixle6rcm5b.R.inc(31916);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1oixoixle6rcm5b.R.inc(31917);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1oixoixle6rcm5b.R.flushNeeded();}}
}

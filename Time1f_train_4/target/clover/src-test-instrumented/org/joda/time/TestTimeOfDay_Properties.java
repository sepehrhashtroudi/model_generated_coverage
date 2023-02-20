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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1olrolrle6rjd5s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,32019,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1olrolrle6rjd5s.R.inc(31887);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31888);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1olrolrle6rjd5s.R.inc(31889);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31890);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1olrolrle6rjd5s.R.inc(31892);try{__CLR4_4_1olrolrle6rjd5s.R.inc(31891);
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1olrolrle6rjd5s.R.inc(31893);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31894);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31895);zone = DateTimeZone.getDefault();
        __CLR4_4_1olrolrle6rjd5s.R.inc(31896);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1olrolrle6rjd5s.R.inc(31897);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31898);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1olrolrle6rjd5s.R.inc(31899);DateTimeZone.setDefault(zone);
        __CLR4_4_1olrolrle6rjd5s.R.inc(31900);zone = null;
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddHour391() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb6thwom5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour391",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb6thwom5(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31901); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31902);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31903);TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31904);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31905);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31906);copy = test.hourOfDay().addToCopy(0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31907);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31908);copy = test.hourOfDay().addToCopy(13); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31909);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31910);copy = test.hourOfDay().addToCopy(14); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31911);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31912);copy = test.hourOfDay().addToCopy(-10); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31913);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31914);copy = test.hourOfDay().addToCopy(-11); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31915);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyGetMinute430() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4qxajomk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4qxajomk(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31916); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31917);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31918);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31919);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31920);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31921);assertSame(test, test.minuteOfHour().getReadablePartial()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31922);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31923);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31924);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31925);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31926);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31927);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31928);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31929);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31930);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31931);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31932);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyCompareToSecond1148() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mk1gtkon1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond1148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mk1gtkon1(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31933); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31934);TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31935);TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31936);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31937);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31938);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31939);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31940);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31941);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31942);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31943);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31944);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31945);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31946);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31947);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31948);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31949);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertySetTextHour1165() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dro6b6oni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour1165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dro6b6oni(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31950); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31951);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31952);TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31953);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31954);check(copy, 12, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertySetMilli1166() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kryoknonn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli1166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kryoknonn(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31955); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31956);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31957);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31958);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31959);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31960);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31961);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31962);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31963);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31964);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31965);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyAddNoWrapMilli1167() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1io3z80ony();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli1167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1io3z80ony(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31966); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31967);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31968);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31969);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31970);check(copy, 10, 20, 30, 49); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31971);copy = test.millisOfSecond().addNoWrapToCopy(959); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31972);check(copy, 10, 20, 30, 999); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31973);copy = test.millisOfSecond().addNoWrapToCopy(960); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31974);check(copy, 10, 20, 31, 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31975);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31976);check(copy, 23, 59, 59, 999); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31977);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31978);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31979);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31980);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31981);copy = test.millisOfSecond().addNoWrapToCopy(-9); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31982);check(copy, 10, 20, 30, 31); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31983);copy = test.millisOfSecond().addNoWrapToCopy(-40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31984);check(copy, 10, 20, 30, 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31985);copy = test.millisOfSecond().addNoWrapToCopy(-41); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31986);check(copy, 10, 20, 29, 999); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31987);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40)); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31988);check(copy, 0, 0, 0, 0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31989);try { 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31990);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41)); 
         __CLR4_4_1olrolrle6rjd5s.R.inc(31991);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31992);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyAddWrapFieldHour1168() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),31993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110eakdoop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour1168",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110eakdoop(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(31993); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31994);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31995);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31996);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31997);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31998);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(31999);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32000);copy = test.hourOfDay().addWrapFieldToCopy(18); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32001);check(copy, 4, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32002);copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32003);check(copy, 19, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour1169() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),32004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1quqlhoop0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour1169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1quqlhoop0(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(32004); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32005);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32006);TimeOfDay copy = test.hourOfDay().withMaximumValue(); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32007);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32008);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 


public void testPropertyWithMinimumValueHour1170() {__CLR4_4_1olrolrle6rjd5s.R.globalSliceStart(getClass().getName(),32009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ys01gop5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1olrolrle6rjd5s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1olrolrle6rjd5s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour1170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ys01gop5(){try{__CLR4_4_1olrolrle6rjd5s.R.inc(32009); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32010);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32011);TimeOfDay copy = test.hourOfDay().withMinimumValue(); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32012);check(test, 10, 20, 30, 40); 
     __CLR4_4_1olrolrle6rjd5s.R.inc(32013);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1olrolrle6rjd5s.R.inc(32014);
        __CLR4_4_1olrolrle6rjd5s.R.inc(32015);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1olrolrle6rjd5s.R.inc(32016);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1olrolrle6rjd5s.R.inc(32017);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1olrolrle6rjd5s.R.inc(32018);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1olrolrle6rjd5s.R.flushNeeded();}}
}

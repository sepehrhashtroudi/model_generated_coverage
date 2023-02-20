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
public class TestTimeOfDay_Properties extends TestCase {static class __CLR4_4_1omxomxle6qea7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1omxomxle6qea7p.R.inc(31929);
        __CLR4_4_1omxomxle6qea7p.R.inc(31930);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1omxomxle6qea7p.R.inc(31931);
        __CLR4_4_1omxomxle6qea7p.R.inc(31932);return new TestSuite(TestTimeOfDay_Properties.class);
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}

    public TestTimeOfDay_Properties(String name) {
        super(name);__CLR4_4_1omxomxle6qea7p.R.inc(31934);try{__CLR4_4_1omxomxle6qea7p.R.inc(31933);
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1omxomxle6qea7p.R.inc(31935);
        __CLR4_4_1omxomxle6qea7p.R.inc(31936);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1omxomxle6qea7p.R.inc(31937);zone = DateTimeZone.getDefault();
        __CLR4_4_1omxomxle6qea7p.R.inc(31938);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1omxomxle6qea7p.R.inc(31939);
        __CLR4_4_1omxomxle6qea7p.R.inc(31940);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1omxomxle6qea7p.R.inc(31941);DateTimeZone.setDefault(zone);
        __CLR4_4_1omxomxle6qea7p.R.inc(31942);zone = null;
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyAddHour387() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),31943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3bpp7onb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddHour387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3bpp7onb(){try{__CLR4_4_1omxomxle6qea7p.R.inc(31943); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31944);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31945);TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31946);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31947);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31948);copy = test.hourOfDay().addToCopy(0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31949);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31950);copy = test.hourOfDay().addToCopy(13); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31951);check(copy, 23, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31952);copy = test.hourOfDay().addToCopy(14); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31953);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31954);copy = test.hourOfDay().addToCopy(-10); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31955);check(copy, 0, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31956);copy = test.hourOfDay().addToCopy(-11); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31957);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyGetMinute424() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),31958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6i3ayonq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMinute424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6i3ayonq(){try{__CLR4_4_1omxomxle6qea7p.R.inc(31958); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31959);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31960);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31961);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31962);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31963);assertSame(test, test.minuteOfHour().getReadablePartial()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31964);assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31965);assertEquals(20, test.minuteOfHour().get()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31966);assertEquals("20", test.minuteOfHour().getAsString()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31967);assertEquals("20", test.minuteOfHour().getAsText()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31968);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31969);assertEquals("20", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31970);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31971);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31972);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31973);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31974);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyCompareToSecond1135() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),31975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1907s8moo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyCompareToSecond1135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1907s8moo7(){try{__CLR4_4_1omxomxle6qea7p.R.inc(31975); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31976);TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31977);TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31978);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31979);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31980);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31981);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(31982);test1.secondOfMinute().compareTo((ReadablePartial) null); 
         __CLR4_4_1omxomxle6qea7p.R.inc(31983);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1omxomxle6qea7p.R.inc(31984);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31985);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31986);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31987);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31988);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31989);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(31990);test1.secondOfMinute().compareTo((ReadableInstant) null); 
         __CLR4_4_1omxomxle6qea7p.R.inc(31991);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertySetMinute1141() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),31992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdboi5ooo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMinute1141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdboi5ooo(){try{__CLR4_4_1omxomxle6qea7p.R.inc(31992); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31993);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31994);TimeOfDay copy = test.minuteOfHour().setCopy(12); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31995);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31996);check(copy, 10, 12, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(31997);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(31998);test.minuteOfHour().setCopy(60); 
         __CLR4_4_1omxomxle6qea7p.R.inc(31999);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1omxomxle6qea7p.R.inc(32000);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(32001);test.minuteOfHour().setCopy(-1); 
         __CLR4_4_1omxomxle6qea7p.R.inc(32002);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertySetTextHour1155() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fy6q8dooz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetTextHour1155",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fy6q8dooz(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32003); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32004);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32005);TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32006);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32007);check(copy, 12, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesSecond1156() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t13pejop4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyGetMaxMinValuesSecond1156",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t13pejop4(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32008); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32009);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32010);assertEquals(0, test.secondOfMinute().getMinimumValue()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32011);assertEquals(0, test.secondOfMinute().getMinimumValueOverall()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32012);assertEquals(59, test.secondOfMinute().getMaximumValue()); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32013);assertEquals(59, test.secondOfMinute().getMaximumValueOverall()); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertySetMilli1157() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsafnfopa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertySetMilli1157",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsafnfopa(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32014); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32015);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32016);TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32017);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32018);check(copy, 10, 20, 30, 12); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32019);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(32020);test.millisOfSecond().setCopy(1000); 
         __CLR4_4_1omxomxle6qea7p.R.inc(32021);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1omxomxle6qea7p.R.inc(32022);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(32023);test.millisOfSecond().setCopy(-1); 
         __CLR4_4_1omxomxle6qea7p.R.inc(32024);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyAddNoWrapMilli1159() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t553sjopl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddNoWrapMilli1159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t553sjopl(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32025); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32026);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32027);TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32028);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32029);check(copy, 10, 20, 30, 49); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32030);copy = test.millisOfSecond().addNoWrapToCopy(959); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32031);check(copy, 10, 20, 30, 999); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32032);copy = test.millisOfSecond().addNoWrapToCopy(960); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32033);check(copy, 10, 20, 31, 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32034);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32035);check(copy, 23, 59, 59, 999); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32036);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(32037);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960); 
         __CLR4_4_1omxomxle6qea7p.R.inc(32038);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1omxomxle6qea7p.R.inc(32039);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32040);copy = test.millisOfSecond().addNoWrapToCopy(-9); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32041);check(copy, 10, 20, 30, 31); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32042);copy = test.millisOfSecond().addNoWrapToCopy(-40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32043);check(copy, 10, 20, 30, 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32044);copy = test.millisOfSecond().addNoWrapToCopy(-41); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32045);check(copy, 10, 20, 29, 999); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32046);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40)); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32047);check(copy, 0, 0, 0, 0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32048);try { 
         __CLR4_4_1omxomxle6qea7p.R.inc(32049);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41)); 
         __CLR4_4_1omxomxle6qea7p.R.inc(32050);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1omxomxle6qea7p.R.inc(32051);check(test, 10, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyAddWrapFieldHour1160() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0e0w5oqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyAddWrapFieldHour1160",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0e0w5oqc(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32052); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32053);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32054);TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32055);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32056);check(copy, 19, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32057);copy = test.hourOfDay().addWrapFieldToCopy(0); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32058);check(copy, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32059);copy = test.hourOfDay().addWrapFieldToCopy(18); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32060);check(copy, 4, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32061);copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32062);check(copy, 19, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyWithMaximumValueHour1161() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqv5woqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMaximumValueHour1161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqv5woqn(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32063); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32064);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32065);TimeOfDay copy = test.hourOfDay().withMaximumValue(); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32066);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32067);check(copy, 23, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 


public void testPropertyWithMinimumValueHour1162() {__CLR4_4_1omxomxle6qea7p.R.globalSliceStart(getClass().getName(),32068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g92yx5oqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1omxomxle6qea7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_1omxomxle6qea7p.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Properties.testPropertyWithMinimumValueHour1162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g92yx5oqs(){try{__CLR4_4_1omxomxle6qea7p.R.inc(32068); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32069);TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32070);TimeOfDay copy = test.hourOfDay().withMinimumValue(); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32071);check(test, 10, 20, 30, 40); 
     __CLR4_4_1omxomxle6qea7p.R.inc(32072);check(copy, 0, 20, 30, 40); 
 }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {try{__CLR4_4_1omxomxle6qea7p.R.inc(32073);
        __CLR4_4_1omxomxle6qea7p.R.inc(32074);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1omxomxle6qea7p.R.inc(32075);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1omxomxle6qea7p.R.inc(32076);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1omxomxle6qea7p.R.inc(32077);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1omxomxle6qea7p.R.flushNeeded();}}
}

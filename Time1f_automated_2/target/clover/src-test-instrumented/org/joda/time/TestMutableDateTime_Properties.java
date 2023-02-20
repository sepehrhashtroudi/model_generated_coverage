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
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {static class __CLR4_4_1imwimwle6nl8cn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,24300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1imwimwle6nl8cn.R.inc(24152);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24153);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1imwimwle6nl8cn.R.inc(24154);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24155);return new TestSuite(TestMutableDateTime_Properties.class);
    }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}

    public TestMutableDateTime_Properties(String name) {
        super(name);__CLR4_4_1imwimwle6nl8cn.R.inc(24157);try{__CLR4_4_1imwimwle6nl8cn.R.inc(24156);
    }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1imwimwle6nl8cn.R.inc(24158);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24159);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24160);zone = DateTimeZone.getDefault();
        __CLR4_4_1imwimwle6nl8cn.R.inc(24161);locale = Locale.getDefault();
        __CLR4_4_1imwimwle6nl8cn.R.inc(24162);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24163);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1imwimwle6nl8cn.R.inc(24164);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24165);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1imwimwle6nl8cn.R.inc(24166);DateTimeZone.setDefault(zone);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24167);Locale.setDefault(locale);
        __CLR4_4_1imwimwle6nl8cn.R.inc(24168);zone = null;
    }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetYearOfCentury437() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xkjseind();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetYearOfCentury437",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xkjseind(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24169); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24170);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24171);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24172);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24173);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24174);assertEquals(2004, test.yearOfCentury().get()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24175);assertEquals("2004", test.yearOfCentury().getAsText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24176);assertEquals("2004", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24177);assertEquals("2004", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24178);assertEquals("2004", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24179);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24180);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24181);assertEquals(9, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24182);assertEquals(9, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyCompareToDayOfYear439() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a2treinr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyCompareToDayOfYear439",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a2treinr(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24183); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24184);MutableDateTime test1 = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24185);MutableDateTime test2 = new MutableDateTime(TEST_TIME2); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24186);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24187);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24188);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24189);try { 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24190);test1.dayOfYear().compareTo((ReadablePartial) null); 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24191);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24192);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24193);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24194);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24195);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24196);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24197);try { 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24198);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24199);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyGetMinuteOfDay440() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q724adio8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfDay440",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q724adio8(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24200); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24201);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24202);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24203);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24204);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24205);assertSame(test, test.minuteOfDay().getMutableDateTime()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24206);assertEquals(53, test.minuteOfDay().get()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24207);assertEquals("53", test.minuteOfDay().getAsString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24208);assertEquals("53", test.minuteOfDay().getAsText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24209);assertEquals("53", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24210);assertEquals("53", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24211);assertEquals("53", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24212);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24213);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24214);assertEquals(3, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24215);assertEquals(3, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyGetMinuteOfHour441() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9j1iioo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetMinuteOfHour441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9j1iioo(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24216); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24217);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24218);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24219);assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24220);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24221);assertSame(test, test.minuteOfHour().getMutableDateTime()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24222);assertEquals(53, test.minuteOfHour().get()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24223);assertEquals("53", test.minuteOfHour().getAsString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24224);assertEquals("53", test.minuteOfHour().getAsText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24225);assertEquals("53", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24226);assertEquals("53", test.minuteOfHour().getAsShortText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24227);assertEquals("53", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24228);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24229);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24230);assertEquals(3, test.minuteOfHour().getMaximumTextLength(null)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24231);assertEquals(3, test.minuteOfHour().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyGetSecondOfDay442() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3uatzip4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyGetSecondOfDay442",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3uatzip4(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24232); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24233);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24234);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24235);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24236);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24237);assertSame(test, test.secondOfDay().getMutableDateTime()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24238);assertEquals(53, test.secondOfDay().get()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24239);assertEquals("53", test.secondOfDay().getAsString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24240);assertEquals("53", test.secondOfDay().getAsText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24241);assertEquals("53", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24242);assertEquals("53", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24243);assertEquals("53", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24244);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24245);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24246);assertEquals(3, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24247);assertEquals(3, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyAddWrapFieldYear447() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wba51ipk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldYear447",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wba51ipk(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24248); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24249);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24250);test.year().addWrapField(1); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24251);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24252);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24253);test.year().addWrapField(2); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24254);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24255);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24256);test.year().addWrapField(3); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24257);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24258);test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24259);test.year().addWrapField(4); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24260);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyAddWrapFieldYear448() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nbbckipx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyAddWrapFieldYear448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nbbckipx(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24261); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24262);MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24263);test.year().addWrapField(4); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24264);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyRoundCeilingHourOfDay449() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oc617iq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay449",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oc617iq1(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24265); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24266);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24267);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24268);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyRoundCeilingHourOfDay450() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197gylxiq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundCeilingHourOfDay450",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197gylxiq5(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24269); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24270);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24271);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24272);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24273);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24274);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24275);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24276);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24277);test.hourOfDay().roundCeiling(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24278);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertyRoundHalfFloorHourOfDay451() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3u47ciqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertyRoundHalfFloorHourOfDay451",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3u47ciqf(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24279); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24280);MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24281);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24282);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24283);test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24284);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24285);assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24286);test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24287);test.hourOfDay().roundHalfFloor(); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24288);assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
public void testPropertySetWeekOfWeekyear516() {__CLR4_4_1imwimwle6nl8cn.R.globalSliceStart(getClass().getName(),24289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1puyb4miqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1imwimwle6nl8cn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1imwimwle6nl8cn.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Properties.testPropertySetWeekOfWeekyear516",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1puyb4miqp(){try{__CLR4_4_1imwimwle6nl8cn.R.inc(24289); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24290);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24291);DateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24292);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24293);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24294);try { 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24295);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24296);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1imwimwle6nl8cn.R.inc(24297);try { 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24298);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1imwimwle6nl8cn.R.inc(24299);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1imwimwle6nl8cn.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

}

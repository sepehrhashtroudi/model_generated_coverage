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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1iwyiwylc8axdsm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,24911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    public static void main(String[] args) {try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24514);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24515);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24516);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24517);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1iwyiwylc8axdsm.R.inc(24519);try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24518);
    }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24520);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24521);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24522);zone = DateTimeZone.getDefault();
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24523);locale = Locale.getDefault();
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24524);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24525);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24526);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24527);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24528);DateTimeZone.setDefault(zone);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24529);Locale.setDefault(locale);
        __CLR4_4_1iwyiwylc8axdsm.R.inc(24530);zone = null;
    }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyGetHourOfDay10() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y67l6wixf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y67l6wixf(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24531); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24532);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24533);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24534);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24535);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24536);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24537);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24538);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24539);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24540);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24541);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24542);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24543);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24544);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24545);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24546);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeLenient33() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ppa5ixv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ppa5ixv(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24547); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24548);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24549);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24550);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24551);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24552);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24553);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24554);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24555);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24556);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury40() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxrjl0iy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxrjl0iy5(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24557); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24558);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24559);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24560);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24561);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetCenturyOfEra92() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcayx4iya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra92",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcayx4iya(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24562); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24563);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24564);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24565);assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24566);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24567);assertSame(test, test.centuryOfEra().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24568);assertEquals(20, test.centuryOfEra().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24569);assertEquals("20", test.centuryOfEra().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24570);assertEquals("20", test.centuryOfEra().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24571);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24572);assertEquals("20", test.centuryOfEra().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24573);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24574);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24575);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24576);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24577);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay109() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vfflgiyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vfflgiyq(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24578); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24579);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24580);DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24581);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24582);test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24583);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24584);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24585);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24586);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24587);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24588);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24589);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24590);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetMonthOfYear122() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abb783iz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abb783iz3(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24591); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24592);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24593);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24594);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24595);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24596);assertSame(test, test.monthOfYear().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24597);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24598);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24599);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24600);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24601);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24602);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24603);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24604);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24605);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24606);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24607);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24608);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24609);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24610);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24611);test = new DateTime(2004, 7, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24612);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24613);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24614);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24615);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24616);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24617);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24618);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24619);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24620);assertEquals(1, test.monthOfYear().getMinimumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24621);assertEquals(1, test.monthOfYear().getMinimumValueOverall()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24622);assertEquals(12, test.monthOfYear().getMaximumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24623);assertEquals(12, test.monthOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyWithMinimumValueMillisOfDayDSTGap175() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zy00mj00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap175",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zy00mj00(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24624); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24625);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24626);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24627);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24628);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear243() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmlrkrj05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmlrkrj05(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24629); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24630);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24631);DateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24632);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24633);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24634);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24635);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24636);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24637);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24638);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24639);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyAddDayOfMonth266() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1masijyj0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1masijyj0g(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24640); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24641);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24642);DateTime copy = test.dayOfMonth().addToCopy(9); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24643);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24644);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24645);copy = test.dayOfMonth().addToCopy(21); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24646);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24647);copy = test.dayOfMonth().addToCopy(22); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24648);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24649);copy = test.dayOfMonth().addToCopy(22 + 30); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24650);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24651);copy = test.dayOfMonth().addToCopy(22 + 31); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24652);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24653);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24654);assertEquals("2004-12-31T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24655);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24656);assertEquals("2005-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24657);copy = test.dayOfMonth().addToCopy(-8); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24658);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24659);copy = test.dayOfMonth().addToCopy(-9); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24660);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24661);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24662);assertEquals("2004-01-01T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24663);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24664);assertEquals("2003-12-31T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetEra287() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19571ebj15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19571ebj15(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24665); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24666);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24667);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24668);assertEquals("era", test.era().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24669);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24670);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24671);assertEquals(1, test.era().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24672);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24673);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24674);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24675);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24676);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24677);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24678);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24679);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24680);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24681);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24682);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24683);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24684);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24685);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24686);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyToIntervalMillisOfSecond318() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eyxfxlj1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond318",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eyxfxlj1r(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24687); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24688);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24689);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24690);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24691);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyLeapYear400() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evaxddj1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evaxddj1w(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24692); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24693);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24694);assertEquals(true, test.year().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24695);assertEquals(1, test.year().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24696);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24697);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24698);assertEquals(false, test.year().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24699);assertEquals(0, test.year().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24700);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyWithMaximumValueDayOfMonth412() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzncsvj25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzncsvj25(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24701); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24702);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24703);DateTime copy = test.dayOfMonth().withMaximumValue(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24704);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24705);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyAddLongDayOfWeek425() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ef2s3xj2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ef2s3xj2a(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24706); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24707);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24708);DateTime copy = test.dayOfWeek().addToCopy(1L); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24709);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24710);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay586() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdeqe0j2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay586",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdeqe0j2f(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24711); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24712);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24713);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24714);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24715);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24716);assertSame(test, test.minuteOfDay().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24717);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24718);assertEquals("803", test.minuteOfDay().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24719);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24720);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24721);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24722);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24723);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24724);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24725);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24726);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyWithMaximumValueMillisOfDayDSTGap794() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ru7nvdj2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap794",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ru7nvdj2v(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24727); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24728);DateTimeZone paris = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24729);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24730);DateTime test = dt.millisOfDay().withMaximumValue(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24731);assertEquals("1926-04-17T22:59:59.999Z", test.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetDifferenceHourOfDay884() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kkqpyj30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay884",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kkqpyj30(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24732); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24733);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24734);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24735);assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24736);assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24737);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24738);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24739);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24740);assertEquals(13, test.hourOfDay().getDifference(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24741);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra912() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153p5egj3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra912",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153p5egj3a(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24742); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24743);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24744);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24745);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24746);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth916() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rk2eoj3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth916",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rk2eoj3f(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24747); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24748);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24749);DateTime copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24750);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24751);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay958() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15doi67j3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay958",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15doi67j3k(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24752); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24753);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24754);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24755);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24756);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24757);assertSame(test, test.secondOfDay().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24758);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24759);assertEquals("48223", test.secondOfDay().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24760);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24761);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24762);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24763);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24764);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24765);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24766);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24767);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyCompareToDayOfYear973() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ly54w5j40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear973",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ly54w5j40(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24768); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24769);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24770);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24771);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24772);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24773);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24774);try { 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24775);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24776);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24777);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24778);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24779);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24780);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24781);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24782);try { 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24783);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24784);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict1024() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8y39uj4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict1024",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8y39uj4h(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24785); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24786);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24787);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24788);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24789);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24790);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24791);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24792);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24793);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24794);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay1026() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfwidjj4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay1026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfwidjj4r(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24795); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24796);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24797);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24798);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24799);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24800);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24801);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24802);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24803);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24804);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyLeapMonthOfYear1144() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwptysj51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear1144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwptysj51(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24805); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24806);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24807);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24808);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24809);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24810);test = new DateTime(2004, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24811);assertEquals(true, test.monthOfYear().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24812);assertEquals(1, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24813);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24814);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24815);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24816);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24817);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24818);test = new DateTime(2003, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24819);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24820);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24821);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetMaxMinValuesDayOfYear1203() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fht9dwj5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear1203",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fht9dwj5i(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24822); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24823);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24824);assertEquals(1, test.dayOfYear().getMinimumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24825);assertEquals(1, test.dayOfYear().getMinimumValueOverall()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24826);assertEquals(366, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24827);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24828);test = new DateTime(2002, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24829);assertEquals(365, test.dayOfYear().getMaximumValue()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24830);assertEquals(366, test.dayOfYear().getMaximumValueOverall()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetWeekyear1232() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hxd3j5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hxd3j5r(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24831); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24832);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24833);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24834);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24835);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24836);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24837);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24838);assertEquals("2004", test.weekyear().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24839);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24840);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24841);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24842);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24843);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24844);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24845);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24846);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertySetYear1272() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdphl1j67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdphl1j67(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24847); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24848);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24849);DateTime copy = test.year().setCopy(1960); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24850);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24851);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear1455() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nb0e7zj6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear1455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nb0e7zj6c(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24852); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24853);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24854);DateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24855);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24856);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24857);try { 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24858);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24859);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24860);try { 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24861);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1iwyiwylc8axdsm.R.inc(24862);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear1506() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yu3zpj6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear1506",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yu3zpj6n(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24863); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24864);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24865);DateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24866);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24867);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24868);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24869);assertEquals("2005-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24870);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24871);assertEquals("2004-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24872);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24873);assertEquals("2003-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24874);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24875);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24876);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24877);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24878);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24879);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24880);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24881);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24882);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24883);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24884);assertEquals("2003-02-28T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay1606() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t3g8q8j79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay1606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t3g8q8j79(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24885); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24886);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24887);DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24888);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24889);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24890);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24891);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24892);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24893);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24894);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury1684() {__CLR4_4_1iwyiwylc8axdsm.R.globalSliceStart(getClass().getName(),24895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124y1yfj7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwyiwylc8axdsm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwyiwylc8axdsm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury1684",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124y1yfj7j(){try{__CLR4_4_1iwyiwylc8axdsm.R.inc(24895); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24896);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24897);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24898);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24899);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24900);assertSame(test, test.yearOfCentury().getDateTime()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24901);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24902);assertEquals("4", test.yearOfCentury().getAsString()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24903);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24904);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24905);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24906);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24907);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24908);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24909);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1iwyiwylc8axdsm.R.inc(24910);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1iwyiwylc8axdsm.R.flushNeeded();}} 

    

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

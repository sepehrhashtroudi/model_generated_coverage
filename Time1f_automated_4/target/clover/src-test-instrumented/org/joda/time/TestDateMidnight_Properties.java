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
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties extends TestCase {static class __CLR4_4_1gx5gx5le6o79l9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21929);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21930);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21931);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21932);return new TestSuite(TestDateMidnight_Properties.class);
    }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}

    public TestDateMidnight_Properties(String name) {
        super(name);__CLR4_4_1gx5gx5le6o79l9.R.inc(21934);try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21933);
    }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21935);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21936);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21937);zone = DateTimeZone.getDefault();
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21938);locale = Locale.getDefault();
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21939);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21940);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21941);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21942);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21943);DateTimeZone.setDefault(zone);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21944);Locale.setDefault(locale);
        __CLR4_4_1gx5gx5le6o79l9.R.inc(21945);zone = null;
    }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPropertyGetMonth573() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9r0ftgxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetMonth573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9r0ftgxm(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21946); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21947);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21948);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21949);assertEquals("monthOfYear", test.monthOfYear().getName()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21950);assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21951);assertSame(test, test.monthOfYear().getLocalDateTime()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21952);assertEquals(6, test.monthOfYear().get()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21953);assertEquals("6", test.monthOfYear().getAsString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21954);assertEquals("June", test.monthOfYear().getAsText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21955);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21956);assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21957);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21958);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21959);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21960);assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21961);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21962);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21963);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21964);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyToIntervalYearOfCentury588() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5zbhfgy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfCentury588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5zbhfgy5(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21965); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21966);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21967);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21968);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21969);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyGetYearOfCentury589() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fts79ogya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetYearOfCentury589",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fts79ogya(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21970); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21971);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21972);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21973);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21974);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21975);assertSame(test, test.yearOfCentury().getDateMidnight()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21976);assertEquals(20, test.yearOfCentury().get()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21977);assertEquals("20", test.yearOfCentury().getAsText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21978);assertEquals("20", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21979);assertEquals("20", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21980);assertEquals("20", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21981);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21982);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21983);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21984);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyToIntervalYearOfEra590() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ll8qvugyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalYearOfEra590",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ll8qvugyp(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21985); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21986);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21987);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21988);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21989);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyToIntervalMonthOfYear591() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h61qahgyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyToIntervalMonthOfYear591",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h61qahgyu(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21990); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21991);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21992);Interval testInterval = test.monthOfYear().toInterval(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21993);assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21994);assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd()); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyGetEra593() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),21995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgi06pgyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyGetEra593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),21995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgi06pgyz(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(21995); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21996);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21997);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21998);assertEquals("era", test.era().getName()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(21999);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22000);assertSame(test, test.era().getDateMidnight()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22001);assertEquals(1, test.era().get()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22002);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22003);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22004);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22005);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22006);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22007);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22008);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22009);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22010);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22011);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertySetTextMonthOfYear594() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),22012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17a0fuzgzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertySetTextMonthOfYear594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17a0fuzgzg(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(22012); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22013);DateMidnight test = new DateMidnight(2004, 6, 9); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22014);DateMidnight copy = test.monthOfYear().setCopy("12"); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22015);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22016);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
public void testPropertyRoundHalfCeilingMonthOfYear595() {__CLR4_4_1gx5gx5le6o79l9.R.globalSliceStart(getClass().getName(),22017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166opjtgzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gx5gx5le6o79l9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gx5gx5le6o79l9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Properties.testPropertyRoundHalfCeilingMonthOfYear595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166opjtgzl(){try{__CLR4_4_1gx5gx5le6o79l9.R.inc(22017); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22018);DateMidnight test = new DateMidnight(2004, 6, 16); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22019);DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22020);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22021);test = new DateMidnight(2004, 9, 16); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22022);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22023);assertEquals("2004-10-01T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22024);test = new DateMidnight(2004, 6, 17); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22025);copy = test.monthOfYear().roundHalfCeilingCopy(); 
     __CLR4_4_1gx5gx5le6o79l9.R.inc(22026);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1gx5gx5le6o79l9.R.flushNeeded();}}
    

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

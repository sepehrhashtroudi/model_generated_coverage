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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1h8nh8nle6nl86m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,22438,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);
    
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22343);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22344);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22345);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22346);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1h8nh8nle6nl86m.R.inc(22348);try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22347);
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22349);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22350);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22351);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22352);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22353);originalLocale = Locale.getDefault();
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22354);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22355);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22356);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22357);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22358);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22359);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22360);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22361);Locale.setDefault(originalLocale);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22362);originalDateTimeZone = null;
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22363);originalTimeZone = null;
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22364);originalLocale = null;
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithDate_int_int251() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxhkxbh99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxhkxbh99(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22365); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22366);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22367);DateTime result = test.withDate(12, 24, 0); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22368);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22369);assertEquals(BUDDHIST_UTC, result.getChronology()); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22370);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22371);try { 
         __CLR4_4_1h8nh8nle6nl86m.R.inc(22372);test.withDate(25, 1, 1); 
         __CLR4_4_1h8nh8nle6nl86m.R.inc(22373);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
public void testWithFields_RPartial252() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19etgl5h9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19etgl5h9i(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22374); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22375);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22376);DateTime result = test.withFields(new YearMonthDay(2003, 4, 3)); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22377);DateTime expected = new DateTime(2003, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22378);assertEquals(expected, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22379);test = new DateTime(2003, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22380);result = test.withFields(null); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22381);assertSame(test, result); 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
public void testWithField1254() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc0lwph9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField1254",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc0lwph9q(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22382); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22383);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22384);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22385);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22386);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
public void testWithDurationAdded_RD_int255() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dhez0h9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int255",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dhez0h9v(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22387); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22388);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22389);DateTime result = test.withDurationAdded(new Duration(123456789L), 1); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22390);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22391);assertEquals(expected, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22392);result = test.withDurationAdded(null, 1); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22393);assertSame(test, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22394);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22395);assertSame(test, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22396);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22397);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22398);assertEquals(expected, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22399);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22400);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22401);assertEquals(expected, result); 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
public void testPlus_RP257() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vn8olmhaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP257",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vn8olmhaa(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22402); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22403);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22404);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22405);DateTime expected = new DateTime(2003, 7, 28, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22406);assertEquals(expected, result); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22407);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22408);assertSame(test, result); 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
public void testMinus_long260() {__CLR4_4_1h8nh8nle6nl86m.R.globalSliceStart(getClass().getName(),22409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19abn2uhah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h8nh8nle6nl86m.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h8nh8nle6nl86m.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long260",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19abn2uhah(){try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22409); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22410);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22411);DateTime result = test.minus(123456789L); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22412);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1h8nh8nle6nl86m.R.inc(22413);assertEquals(expected, result); 
 }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22414);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22415);return null;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22416);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22417);return TEST_TIME1;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22418);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22419);return ISO_DEFAULT;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22420);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22421);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22422);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22423);return null;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22424);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22425);return this;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22426);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22427);return this;
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22428);
            __CLR4_4_1h8nh8nle6nl86m.R.inc(22429);return "";
        }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}
    }

    
    
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1h8nh8nle6nl86m.R.inc(22430);
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22431);assertEquals(year, test.getYear());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22432);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22433);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22434);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22435);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22436);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1h8nh8nle6nl86m.R.inc(22437);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1h8nh8nle6nl86m.R.flushNeeded();}}

}

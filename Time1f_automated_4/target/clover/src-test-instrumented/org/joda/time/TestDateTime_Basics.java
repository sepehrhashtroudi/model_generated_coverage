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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1ha4ha4le6o79nh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,22512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22396);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22397);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22398);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22399);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1ha4ha4le6o79nh.R.inc(22401);try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22400);
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22402);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22403);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22404);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22405);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22406);originalLocale = Locale.getDefault();
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22407);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22408);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22409);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22410);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22411);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22412);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22413);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22414);Locale.setDefault(originalLocale);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22415);originalDateTimeZone = null;
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22416);originalTimeZone = null;
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22417);originalLocale = null;
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testWithFieldAdded1227() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqec0lhaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqec0lhaq(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22418); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22419);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22420);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22421);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22422);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testWithFieldAdded4228() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162nkehhav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded4228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162nkehhav(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22423); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22424);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22425);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22426);assertSame(test, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testWithFieldAdded2229() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpr84haz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded2229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpr84haz(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22427); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22428);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22429);try { 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22430);test.withFieldAdded(null, 0); 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22431);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testPlus_long230() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfrrmhhb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfrrmhhb4(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22432); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22433);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22434);DateTime result = test.plus(123456789L); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22435);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22436);assertEquals(expected, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testMinusWeeks_int232() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1it8dwnhb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1it8dwnhb9(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22437); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22438);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22439);DateTime result = test.minusWeeks(1); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22440);DateTime expected = new DateTime(2002, 4, 26, 0, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22441);assertEquals(expected, result); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22442);result = test.minusWeeks(0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22443);assertSame(test, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testMinusSeconds_int233() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zefh6ghbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zefh6ghbg(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22444); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22445);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22446);DateTime result = test.minusSeconds(1); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22447);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22448);assertEquals(expected, result); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22449);result = test.minusSeconds(0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22450);assertSame(test, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testMinusMillis_int235() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l1whzhbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l1whzhbn(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22451); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22452);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22453);DateTime result = test.minusMillis(1); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22454);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22455);assertEquals(expected, result); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22456);result = test.minusMillis(0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22457);assertSame(test, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testMinusMillis_int236() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u1vaghbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u1vaghbu(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22458); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22459);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22460);DateTime result = test.minusMillis(1); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22461);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22462);assertEquals(expected, result); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22463);result = test.minusMillis(0); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22464);assertSame(test, result); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testProperty237() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk557ahc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty237",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk557ahc1(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22465); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22466);DateTime test = new DateTime(); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22467);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22468);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22469);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22470);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22471);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22472); 
             __CLR4_4_1ha4ha4le6o79nh.R.inc(22473);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22474); 
             __CLR4_4_1ha4ha4le6o79nh.R.inc(22475);return null; 
         }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22476); 
             __CLR4_4_1ha4ha4le6o79nh.R.inc(22477);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}} 
     }; 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22478);try { 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22479);test.property(bad); 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22480);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22481);try { 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22482);test.property(null); 
         __CLR4_4_1ha4ha4le6o79nh.R.inc(22483);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
public void testToTimeOfDay239() {__CLR4_4_1ha4ha4le6o79nh.R.globalSliceStart(getClass().getName(),22484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnqy6shck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha4ha4le6o79nh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha4ha4le6o79nh.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay239",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnqy6shck(){try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22484); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22485);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22486);TimeOfDay test = base.toTimeOfDay(); 
     __CLR4_4_1ha4ha4le6o79nh.R.inc(22487);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22488);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22489);return null;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22490);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22491);return TEST_TIME1;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22492);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22493);return ISO_DEFAULT;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22494);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22495);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22496);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22497);return null;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22498);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22499);return this;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22500);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22501);return this;
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22502);
            __CLR4_4_1ha4ha4le6o79nh.R.inc(22503);return "";
        }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1ha4ha4le6o79nh.R.inc(22504);
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22505);assertEquals(year, test.getYear());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22506);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22507);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22508);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22509);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22510);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1ha4ha4le6o79nh.R.inc(22511);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1ha4ha4le6o79nh.R.flushNeeded();}}

}

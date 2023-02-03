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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1mrrmrrlc8axe4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,29680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29511);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29512);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29513);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29514);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1mrrmrrlc8axe4u.R.inc(29516);try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29515);
    }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29517);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29518);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29519);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29520);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29521);originalLocale = Locale.getDefault();
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29522);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29523);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29524);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29525);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29526);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29527);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29528);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29529);Locale.setDefault(originalLocale);
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29530);originalDateTimeZone = null;
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29531);originalTimeZone = null;
        __CLR4_4_1mrrmrrlc8axe4u.R.inc(29532);originalLocale = null;
    }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString_String_String41() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr9dvmmsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String_String41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr9dvmmsd(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29533); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29534);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29535);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29536);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29537);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29538);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29539);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testClone622() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bwh2wemsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bwh2wemsk(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29540); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29541);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29542);MutableDateTime result = (MutableDateTime) test.clone(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29543);assertEquals(true, test.equals(result)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29544);assertEquals(true, test != result); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testRounding8676() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chwdx2msp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chwdx2msp(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29545); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29546);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29547);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29548);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29549);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29550);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29551);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29552);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29553);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29554);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29555);test.setRounding(null, -1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29556);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29557);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29558);test.setRounding(ISOChronology.getInstance().hourOfDay()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29559);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29560);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29561);test.setRounding(null); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29562);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29563);assertEquals(null, test.getRoundingField()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testRounding3787() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xbfhsmt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding3787",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xbfhsmt8(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29564); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29565);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29566);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29567);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29568);assertEquals(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29569);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29570);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29571);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29572);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testToGregorianCalendar797() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ih5orpmth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToGregorianCalendar797",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ih5orpmth(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29573); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29574);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29575);GregorianCalendar result = test.toGregorianCalendar(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29576);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29577);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29578);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29579);result = test.toGregorianCalendar(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29580);assertEquals(test.getMillis(), result.getTime().getTime()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29581);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testProperty817() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocf8wumtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty817",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocf8wumtq(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29582); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29583);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29584);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29585);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29586);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29587);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29588);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29589); 
             __CLR4_4_1mrrmrrlc8axe4u.R.inc(29590);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29591); 
             __CLR4_4_1mrrmrrlc8axe4u.R.inc(29592);return null; 
         }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29593); 
             __CLR4_4_1mrrmrrlc8axe4u.R.inc(29594);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 
     }; 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29595);try { 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29596);test.property(bad); 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29597);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29598);try { 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29599);test.property(null); 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29600);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testRounding4838() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hjx4amu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding4838",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hjx4amu9(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29601); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29602);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29603);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29604);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29605);assertEquals(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29606);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29607);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29608);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29609);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testToString_String929() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cufritmui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String929",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cufritmui(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29610); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29611);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29612);assertEquals("2002 01", test.toString("yyyy HH")); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29613);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null)); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testToDateTime1215() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb73zgmum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime1215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb73zgmum(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29614); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29615);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29616);DateTime result = test.toDateTime(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29617);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29618);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone1219() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9eiaamur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9eiaamur(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29619); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29620);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29621);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29622);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29623);assertEquals(test.getChronology(), result.getChronology()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29624);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29625);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29626);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29627);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29628);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29629);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29630);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29631);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29632);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29633);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29634);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29635);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29636);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29637);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29638);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29639);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29640);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29641);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testRounding71352() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrdcc7mve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding71352",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrdcc7mve(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29642); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29643);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29644);try { 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29645);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1); 
         __CLR4_4_1mrrmrrlc8axe4u.R.inc(29646);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testCopy1393() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7c62emvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCopy1393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7c62emvj(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29647); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29648);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29649);MutableDateTime result = test.copy(); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29650);assertEquals(true, test.equals(result)); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29651);assertEquals(true, test != result); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 


public void testRounding51633() {__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceStart(getClass().getName(),29652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh7qd7mvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrrmrrlc8axe4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrrmrrlc8axe4u.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding51633",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh7qd7mvo(){try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29652); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29653);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29654);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29655);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29656);assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29657);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29658);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29659);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29660);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString()); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29661);test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29662);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN); 
     __CLR4_4_1mrrmrrlc8axe4u.R.inc(29663);assertEquals("2002-06-09T04:00:00.000+01:00", test.toString()); 
 }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29664);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29665);return null;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29666);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29667);return TEST_TIME1;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29668);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29669);return ISOChronology.getInstance();
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29670);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29671);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29672);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29673);return null;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29674);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29675);return this;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29676);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29677);return this;
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1mrrmrrlc8axe4u.R.inc(29678);
            __CLR4_4_1mrrmrrlc8axe4u.R.inc(29679);return "";
        }finally{__CLR4_4_1mrrmrrlc8axe4u.R.flushNeeded();}}
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}

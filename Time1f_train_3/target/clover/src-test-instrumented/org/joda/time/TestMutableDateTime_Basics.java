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
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1lvelvele6rclct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,28490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1lvelvele6rclct.R.inc(28346);
        __CLR4_4_1lvelvele6rclct.R.inc(28347);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lvelvele6rclct.R.inc(28348);
        __CLR4_4_1lvelvele6rclct.R.inc(28349);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1lvelvele6rclct.R.inc(28351);try{__CLR4_4_1lvelvele6rclct.R.inc(28350);
    }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lvelvele6rclct.R.inc(28352);
        __CLR4_4_1lvelvele6rclct.R.inc(28353);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lvelvele6rclct.R.inc(28354);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lvelvele6rclct.R.inc(28355);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lvelvele6rclct.R.inc(28356);originalLocale = Locale.getDefault();
        __CLR4_4_1lvelvele6rclct.R.inc(28357);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lvelvele6rclct.R.inc(28358);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lvelvele6rclct.R.inc(28359);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lvelvele6rclct.R.inc(28360);
        __CLR4_4_1lvelvele6rclct.R.inc(28361);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lvelvele6rclct.R.inc(28362);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lvelvele6rclct.R.inc(28363);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lvelvele6rclct.R.inc(28364);Locale.setDefault(originalLocale);
        __CLR4_4_1lvelvele6rclct.R.inc(28365);originalDateTimeZone = null;
        __CLR4_4_1lvelvele6rclct.R.inc(28366);originalTimeZone = null;
        __CLR4_4_1lvelvele6rclct.R.inc(28367);originalLocale = null;
    }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToString_String542() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyjhg8lw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String542",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyjhg8lw0(){try{__CLR4_4_1lvelvele6rclct.R.inc(28368); 
     __CLR4_4_1lvelvele6rclct.R.inc(28369);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1lvelvele6rclct.R.inc(28370);assertEquals("2002 01", test.toString("yyyy HH")); 
     __CLR4_4_1lvelvele6rclct.R.inc(28371);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null)); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testToString_String_String543() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z84mn1lw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String_String543",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z84mn1lw4(){try{__CLR4_4_1lvelvele6rclct.R.inc(28372); 
     __CLR4_4_1lvelvele6rclct.R.inc(28373);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW); 
     __CLR4_4_1lvelvele6rclct.R.inc(28374);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28375);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28376);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28377);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28378);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testRounding8939() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1bxn8lwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8939",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1bxn8lwb(){try{__CLR4_4_1lvelvele6rclct.R.inc(28379); 
     __CLR4_4_1lvelvele6rclct.R.inc(28380);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lvelvele6rclct.R.inc(28381);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28382);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28383);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING); 
     __CLR4_4_1lvelvele6rclct.R.inc(28384);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28385);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28386);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE); 
     __CLR4_4_1lvelvele6rclct.R.inc(28387);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28388);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28389);test.setRounding(null, -1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28390);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28391);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28392);test.setRounding(ISOChronology.getInstance().hourOfDay()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28393);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28394);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28395);test.setRounding(null); 
     __CLR4_4_1lvelvele6rclct.R.inc(28396);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28397);assertEquals(null, test.getRoundingField()); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone1003() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tk84nlwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone1003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tk84nlwu(){try{__CLR4_4_1lvelvele6rclct.R.inc(28398); 
     __CLR4_4_1lvelvele6rclct.R.inc(28399);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28400);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1lvelvele6rclct.R.inc(28401);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28402);assertEquals(test.getChronology(), result.getChronology()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28403);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28404);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28405);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1lvelvele6rclct.R.inc(28406);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28407);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28408);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28409);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lvelvele6rclct.R.inc(28410);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28411);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28412);test = new MutableDateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1lvelvele6rclct.R.inc(28413);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lvelvele6rclct.R.inc(28414);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28415);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28416);test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28417);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1lvelvele6rclct.R.inc(28418);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28419);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1lvelvele6rclct.R.inc(28420);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testRounding71008() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw9929lxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding71008",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw9929lxh(){try{__CLR4_4_1lvelvele6rclct.R.inc(28421); 
     __CLR4_4_1lvelvele6rclct.R.inc(28422);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1lvelvele6rclct.R.inc(28423);try { 
         __CLR4_4_1lvelvele6rclct.R.inc(28424);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1); 
         __CLR4_4_1lvelvele6rclct.R.inc(28425);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testProperty1044() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rb28iblxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty1044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rb28iblxm(){try{__CLR4_4_1lvelvele6rclct.R.inc(28426); 
     __CLR4_4_1lvelvele6rclct.R.inc(28427);MutableDateTime test = new MutableDateTime(); 
     __CLR4_4_1lvelvele6rclct.R.inc(28428);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28429);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28430);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28431);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28432);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1lvelvele6rclct.R.inc(28433); 
             __CLR4_4_1lvelvele6rclct.R.inc(28434);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1lvelvele6rclct.R.inc(28435); 
             __CLR4_4_1lvelvele6rclct.R.inc(28436);return null; 
         }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1lvelvele6rclct.R.inc(28437); 
             __CLR4_4_1lvelvele6rclct.R.inc(28438);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 
     }; 
     __CLR4_4_1lvelvele6rclct.R.inc(28439);try { 
         __CLR4_4_1lvelvele6rclct.R.inc(28440);test.property(bad); 
         __CLR4_4_1lvelvele6rclct.R.inc(28441);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lvelvele6rclct.R.inc(28442);try { 
         __CLR4_4_1lvelvele6rclct.R.inc(28443);test.property(null); 
         __CLR4_4_1lvelvele6rclct.R.inc(28444);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testCopy1059() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw071tly5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCopy1059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw071tly5(){try{__CLR4_4_1lvelvele6rclct.R.inc(28445); 
     __CLR4_4_1lvelvele6rclct.R.inc(28446);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28447);MutableDateTime result = test.copy(); 
     __CLR4_4_1lvelvele6rclct.R.inc(28448);assertEquals(true, test.equals(result)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28449);assertEquals(true, test != result); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testClone1060() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kp792tlya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone1060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kp792tlya(){try{__CLR4_4_1lvelvele6rclct.R.inc(28450); 
     __CLR4_4_1lvelvele6rclct.R.inc(28451);MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28452);MutableDateTime result = (MutableDateTime) test.clone(); 
     __CLR4_4_1lvelvele6rclct.R.inc(28453);assertEquals(true, test.equals(result)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28454);assertEquals(true, test != result); 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 


public void testCompareTo1409() {__CLR4_4_1lvelvele6rclct.R.globalSliceStart(getClass().getName(),28455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx79hblyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvelvele6rclct.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvelvele6rclct.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCompareTo1409",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx79hblyf(){try{__CLR4_4_1lvelvele6rclct.R.inc(28455); 
     __CLR4_4_1lvelvele6rclct.R.inc(28456);MutableDateTime test1 = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28457);MutableDateTime test1a = new MutableDateTime(TEST_TIME1); 
     __CLR4_4_1lvelvele6rclct.R.inc(28458);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28459);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28460);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28461);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28462);MutableDateTime test2 = new MutableDateTime(TEST_TIME2); 
     __CLR4_4_1lvelvele6rclct.R.inc(28463);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28464);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28465);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28466);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28467);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28468);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1lvelvele6rclct.R.inc(28469);assertEquals(+1, test2.compareTo(new MockInstant())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28470);assertEquals(0, test1.compareTo(new MockInstant())); 
     __CLR4_4_1lvelvele6rclct.R.inc(28471);try { 
         __CLR4_4_1lvelvele6rclct.R.inc(28472);test1.compareTo(null); 
         __CLR4_4_1lvelvele6rclct.R.inc(28473);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1lvelvele6rclct.R.inc(28474);
            __CLR4_4_1lvelvele6rclct.R.inc(28475);return null;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1lvelvele6rclct.R.inc(28476);
            __CLR4_4_1lvelvele6rclct.R.inc(28477);return TEST_TIME1;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1lvelvele6rclct.R.inc(28478);
            __CLR4_4_1lvelvele6rclct.R.inc(28479);return ISOChronology.getInstance();
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1lvelvele6rclct.R.inc(28480);
            __CLR4_4_1lvelvele6rclct.R.inc(28481);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1lvelvele6rclct.R.inc(28482);
            __CLR4_4_1lvelvele6rclct.R.inc(28483);return null;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1lvelvele6rclct.R.inc(28484);
            __CLR4_4_1lvelvele6rclct.R.inc(28485);return this;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1lvelvele6rclct.R.inc(28486);
            __CLR4_4_1lvelvele6rclct.R.inc(28487);return this;
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1lvelvele6rclct.R.inc(28488);
            __CLR4_4_1lvelvele6rclct.R.inc(28489);return "";
        }finally{__CLR4_4_1lvelvele6rclct.R.flushNeeded();}}
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}

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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1igrigrlc8axdrb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,24424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23931);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23932);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23933);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23934);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1igrigrlc8axdrb.R.inc(23936);try{__CLR4_4_1igrigrlc8axdrb.R.inc(23935);
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23937);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23938);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23939);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1igrigrlc8axdrb.R.inc(23940);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1igrigrlc8axdrb.R.inc(23941);originalLocale = Locale.getDefault();
        __CLR4_4_1igrigrlc8axdrb.R.inc(23942);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23943);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1igrigrlc8axdrb.R.inc(23944);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23945);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23946);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1igrigrlc8axdrb.R.inc(23947);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23948);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23949);Locale.setDefault(originalLocale);
        __CLR4_4_1igrigrlc8axdrb.R.inc(23950);originalDateTimeZone = null;
        __CLR4_4_1igrigrlc8axdrb.R.inc(23951);originalTimeZone = null;
        __CLR4_4_1igrigrlc8axdrb.R.inc(23952);originalLocale = null;
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testWithDurationAdded_RD_int13() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),23953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aeroyeihd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_RD_int13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aeroyeihd(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(23953); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23954);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23955);DateTime result = test.withDurationAdded(new Duration(123456789L), 1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23956);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23957);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23958);result = test.withDurationAdded(null, 1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23959);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23960);result = test.withDurationAdded(new Duration(123456789L), 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23961);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23962);result = test.withDurationAdded(new Duration(123456789L), 2); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23963);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23964);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23965);result = test.withDurationAdded(new Duration(123456789L), -3); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23966);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23967);assertEquals(expected, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testProperty16() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),23968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmpt8tihs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testProperty16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmpt8tihs(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(23968); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23969);DateTime test = new DateTime(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23970);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23971);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23972);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23973);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23974);DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23975); 
             __CLR4_4_1igrigrlc8axdrb.R.inc(23976);return DurationFieldType.weeks(); 
         }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 
  
         public DurationFieldType getRangeDurationType() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23977); 
             __CLR4_4_1igrigrlc8axdrb.R.inc(23978);return null; 
         }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 
  
         public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1igrigrlc8axdrb.R.inc(23979); 
             __CLR4_4_1igrigrlc8axdrb.R.inc(23980);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 
     }; 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23981);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(23982);test.property(bad); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(23983);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23984);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(23985);test.property(null); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(23986);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusYears_int50() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),23987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8fp5wiib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusYears_int50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8fp5wiib(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(23987); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23988);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23989);DateTime result = test.plusYears(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23990);DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23991);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23992);result = test.plusYears(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23993);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusDays_int94() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),23994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tebwe1iii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusDays_int94",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tebwe1iii(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(23994); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23995);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23996);DateTime result = test.minusDays(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23997);DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23998);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(23999);result = test.minusDays(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24000);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusWeeks_int107() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a69pfgiip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusWeeks_int107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a69pfgiip(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24001); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24002);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24003);DateTime result = test.plusWeeks(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24004);DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24005);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24006);result = test.plusWeeks(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24007);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithers112() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6nzu3iiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithers112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6nzu3iiw(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24008); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24009);DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24010);check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24011);check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24012);check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24013);check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24014);check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24015);check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24016);check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24017);check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24018);check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24019);check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24020);check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24021);check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24022);check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24023);check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24024);check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24025);check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24026);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24027);test.withMonthOfYear(0); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24028);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24029);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24030);test.withMonthOfYear(13); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24031);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusMonths_int124() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ho7frijk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMonths_int124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ho7frijk(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24032); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24033);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24034);DateTime result = test.minusMonths(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24035);DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24036);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24037);result = test.minusMonths(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24038);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusDays_int142() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4vsbhijr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusDays_int142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4vsbhijr(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24039); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24040);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24041);DateTime result = test.plusDays(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24042);DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24043);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24044);result = test.plusDays(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24045);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusWeeks_int256() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7u06hijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusWeeks_int256",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7u06hijy(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24046); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24047);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24048);DateTime result = test.minusWeeks(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24049);DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24050);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24051);result = test.minusWeeks(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24052);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToDateTimeISO270() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie86phik5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTimeISO270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie86phik5(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24053); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24054);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24055);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24056);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24057);test = new DateTime(TEST_TIME1, ISO_PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24058);result = test.toDateTimeISO(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24059);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24060);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24061);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24062);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24063);assertNotSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24064);test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24065);result = test.toDateTimeISO(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24066);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24067);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24068);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24069);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24070);assertNotSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24071);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24072);result = test.toDateTimeISO(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24073);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24074);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24075);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24076);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24077);assertNotSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusSeconds_int297() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duhpaeiku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusSeconds_int297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duhpaeiku(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24078); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24079);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24080);DateTime result = test.minusSeconds(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24081);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24082);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24083);result = test.minusSeconds(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24084);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToLocalDateTime300() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155xdb3il1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalDateTime300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155xdb3il1(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24085); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24086);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24087);LocalDateTime test = base.toLocalDateTime(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24088);assertEquals(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusMonths_int306() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1clnw9dil5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMonths_int306",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1clnw9dil5(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24089); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24090);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24091);DateTime result = test.plusMonths(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24092);DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24093);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24094);result = test.plusMonths(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24095);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusMillis_int322() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0ggp2ilc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMillis_int322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0ggp2ilc(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24096); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24097);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24098);DateTime result = test.minusMillis(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24099);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24100);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24101);result = test.minusMillis(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24102);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithTime_int_int_int335() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eehsopilj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithTime_int_int_int335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eehsopilj(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24103); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24104);DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24105);DateTime result = test.withTime(12, 24, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24106);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24107);assertEquals(BUDDHIST_UTC, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24108);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24109);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24110);test.withTime(25, 1, 1, 1); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24111);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testIsSupported_DateTimeFieldType341() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6ti23ils();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsSupported_DateTimeFieldType341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6ti23ils(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24112); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24113);DateTime test = new DateTime(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24114);assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24115);assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24116);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24117);assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24118);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24119);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24120);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24121);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24122);assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24123);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24124);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24125);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24126);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24127);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24128);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24129);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24130);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24131);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24132);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24133);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24134);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24135);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24136);assertEquals(false, test.isSupported(null)); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithDate_int_int_int389() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oa0m3imh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDate_int_int_int389",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oa0m3imh(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24137); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24138);DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24139);DateTime result = test.withDate(2003, 5, 6); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24140);DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24141);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24142);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24143);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24144);test.withDate(2003, 13, 1); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24145);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testWithFields_RPartial578() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awuxuoimq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFields_RPartial578",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awuxuoimq(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24146); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24147);DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24148);DateTime result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24149);DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24150);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24151);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24152);result = test.withFields(null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24153);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToLocalTime631() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1belff4imy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToLocalTime631",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1belff4imy(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24154); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24155);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24156);LocalTime test = base.toLocalTime(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24157);assertEquals(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusMinutes_int808() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjbcyein2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusMinutes_int808",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjbcyein2(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24158); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24159);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24160);DateTime result = test.minusMinutes(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24161);DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24162);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24163);result = test.minusMinutes(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24164);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusYears_int833() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_197cma1in9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusYears_int833",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_197cma1in9(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24165); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24166);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24167);DateTime result = test.minusYears(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24168);DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24169);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24170);result = test.minusYears(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24171);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToDateTime_Chronology869() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9qp59ing();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_Chronology869",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9qp59ing(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24172); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24173);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24174);DateTime result = test.toDateTime(ISO_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24175);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24176);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24177);result = test.toDateTime(GREGORIAN_PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24178);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24179);assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24180);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24181);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24182);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24183);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24184);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24185);result = test.toDateTime((Chronology) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24186);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testIsAfterNow871() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjnjctinv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfterNow871",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjnjctinv(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24187); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24188);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24189);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfterNow()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24190);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow()); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinus_long926() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzyyexinz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_long926",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzyyexinz(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24191); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24192);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24193);DateTime result = test.minus(123456789L); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24194);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24195);assertEquals(expected, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinusHours_int927() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53kroio4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinusHours_int927",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53kroio4(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24196); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24197);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24198);DateTime result = test.minusHours(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24199);DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24200);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24201);result = test.minusHours(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24202);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToString_DTFormatter930() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4mi3giob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_DTFormatter930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4mi3giob(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24203); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24204);DateMidnight test = new DateMidnight(TEST_TIME_NOW); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24205);assertEquals("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24206);assertEquals("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null)); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlus_RP941() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wikuqciof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RP941",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wikuqciof(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24207); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24208);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24209);DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24210);DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24211);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24212);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24213);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinus_RP950() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1noq858iom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RP950",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1noq858iom(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24214); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24215);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24216);DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24217);DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24218);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24219);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24220);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToMutableDateTimeISO963() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tu6ngsiot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTimeISO963",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tu6ngsiot(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24221); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24222);DateTime test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24223);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24224);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24225);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24226);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24227);assertEquals(ISO_PARIS, result.getChronology()); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithFieldAdded41094() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hetu6hip0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded41094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hetu6hip0(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24228); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24229);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24230);DateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24231);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToInstant1105() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1z5c0ip4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToInstant1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1z5c0ip4(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24232); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24233);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24234);Instant result = test.toInstant(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24235);assertEquals(TEST_TIME1, result.getMillis()); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithZoneRetainFields_DateTimeZone1107() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv12ryip8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithZoneRetainFields_DateTimeZone1107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv12ryip8(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24236); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24237);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24238);DateTime result = test.withZoneRetainFields(PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24239);assertEquals(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24240);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24241);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24242);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24243);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24244);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24245);result = test.withZoneRetainFields(null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24246);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24247);test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24248);result = test.withZoneRetainFields(null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24249);assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24250);assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24251);test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24252);result = test.withZoneRetainFields(LONDON); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24253);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlus_long1153() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1880rykipq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_long1153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1880rykipq(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24254); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24255);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24256);DateTime result = test.plus(123456789L); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24257);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24258);assertEquals(expected, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToString_String_Locale1170() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15oalrbipv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToString_String_Locale1170",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15oalrbipv(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24259); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24260);DateTime test = new DateTime(TEST_TIME_NOW); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24261);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24262);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24263);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24264);assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24265);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testIsAfter_RI1176() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzlyskiq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testIsAfter_RI1176",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzlyskiq2(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24266); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24267);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24268);DateTime test1a = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24269);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24270);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24271);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24272);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24273);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24274);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24275);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24276);DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24277);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24278);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24279);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24280);assertEquals(true, test2.isAfter(new MockInstant())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24281);assertEquals(false, test1.isAfter(new MockInstant())); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24282);assertEquals(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24283);assertEquals(false, new DateTime(TEST_TIME_NOW).isAfter(null)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24284);assertEquals(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null)); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithFieldAdded21216() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh1y69iql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded21216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh1y69iql(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24285); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24286);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24287);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24288);test.withFieldAdded(null, 0); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24289);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone1220() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsjav0iqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateTime_DateTimeZone1220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsjav0iqq(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24290); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24291);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24292);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24293);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24294);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24295);result = test.toDateTime(PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24296);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24297);assertEquals(PARIS, result.getZone()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24298);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24299);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24300);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24301);assertEquals(LONDON, result.getZone()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24302);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24303);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24304);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testMinus_RD1274() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ht9bsir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testMinus_RD1274",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ht9bsir5(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24305); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24306);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24307);DateTime result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24308);DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24309);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24310);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24311);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusMinutes_int1315() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfnw8girc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMinutes_int1315",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfnw8girc(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24312); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24313);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24314);DateTime result = test.plusMinutes(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24315);DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24316);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24317);result = test.plusMinutes(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24318);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight1334() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1846m0lirj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToDateMidnight1334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1846m0lirj(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24319); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24320);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24321);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24322);assertEquals(new DateMidnight(base, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithField21372() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4e6kirn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField21372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4e6kirn(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24323); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24324);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24325);try { 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24326);test.withField(null, 6); 
         __CLR4_4_1igrigrlc8axdrb.R.inc(24327);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlus_RD1383() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgdt0pirs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlus_RD1383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgdt0pirs(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24328); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24329);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24330);DateTime result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24331);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24332);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24333);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24334);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusMillis_int1400() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z4cnoirz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusMillis_int1400",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z4cnoirz(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24335); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24336);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24337);DateTime result = test.plusMillis(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24338);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24339);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24340);result = test.plusMillis(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24341);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithField11472() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvyyksis6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithField11472",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvyyksis6(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24342); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24343);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24344);DateTime result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24345);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24346);assertEquals(new DateTime(2006, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testToMutableDateTime_DateTimeZone1476() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrtzp7isb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToMutableDateTime_DateTimeZone1476",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrtzp7isb(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24347); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24348);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24349);MutableDateTime result = test.toMutableDateTime(LONDON); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24350);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24351);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24352);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24353);result = test.toMutableDateTime(PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24354);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24355);assertEquals(ISO_PARIS, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24356);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24357);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24358);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24359);assertEquals(ISO_DEFAULT, result.getChronology()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24360);test = new DateTime(TEST_TIME1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24361);result = test.toMutableDateTime((DateTimeZone) null); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24362);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24363);assertEquals(ISO_DEFAULT, result.getChronology()); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithDurationAdded_long_int1492() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tb6s6yiss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithDurationAdded_long_int1492",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tb6s6yiss(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24364); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24365);DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24366);DateTime result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24367);DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24368);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24369);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24370);assertSame(test, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24371);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24372);expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24373);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24374);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24375);expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24376);assertEquals(expected, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusHours_int1632() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xyygamit5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusHours_int1632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xyygamit5(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24377); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24378);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24379);DateTime result = test.plusHours(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24380);DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24381);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24382);result = test.plusHours(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24383);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testPlusSeconds_int1663() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0ie4sitc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testPlusSeconds_int1663",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0ie4sitc(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24384); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24385);DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24386);DateTime result = test.plusSeconds(1); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24387);DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24388);assertEquals(expected, result); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24389);result = test.plusSeconds(0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24390);assertSame(test, result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testToTimeOfDay1692() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19iq50witj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testToTimeOfDay1692",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19iq50witj(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24391); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24392);DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24393);TimeOfDay test = base.toTimeOfDay(); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24394);assertEquals(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 


public void testWithFieldAdded11730() {__CLR4_4_1igrigrlc8axdrb.R.globalSliceStart(getClass().getName(),24395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdimnxitn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igrigrlc8axdrb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igrigrlc8axdrb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Basics.testWithFieldAdded11730",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdimnxitn(){try{__CLR4_4_1igrigrlc8axdrb.R.inc(24395); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24396);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24397);DateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24398);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), test); 
     __CLR4_4_1igrigrlc8axdrb.R.inc(24399);assertEquals(new DateTime(2010, 6, 9, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24400);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24401);return null;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24402);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24403);return TEST_TIME1;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24404);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24405);return ISO_DEFAULT;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24406);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24407);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24408);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24409);return null;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24410);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24411);return this;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24412);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24413);return this;
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24414);
            __CLR4_4_1igrigrlc8axdrb.R.inc(24415);return "";
        }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1igrigrlc8axdrb.R.inc(24416);
        __CLR4_4_1igrigrlc8axdrb.R.inc(24417);assertEquals(year, test.getYear());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24418);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24419);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24420);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24421);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24422);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1igrigrlc8axdrb.R.inc(24423);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1igrigrlc8axdrb.R.flushNeeded();}}

}

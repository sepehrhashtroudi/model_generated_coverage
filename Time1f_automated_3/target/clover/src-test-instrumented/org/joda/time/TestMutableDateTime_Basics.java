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
public class TestMutableDateTime_Basics extends TestCase {static class __CLR4_4_1iwhiwhle6np4im{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,24584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24497);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24498);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24499);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24500);return new TestSuite(TestMutableDateTime_Basics.class);
    }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}

    public TestMutableDateTime_Basics(String name) {
        super(name);__CLR4_4_1iwhiwhle6np4im.R.inc(24502);try{__CLR4_4_1iwhiwhle6np4im.R.inc(24501);
    }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24503);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24504);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24505);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iwhiwhle6np4im.R.inc(24506);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iwhiwhle6np4im.R.inc(24507);originalLocale = Locale.getDefault();
        __CLR4_4_1iwhiwhle6np4im.R.inc(24508);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24509);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iwhiwhle6np4im.R.inc(24510);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24511);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24512);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iwhiwhle6np4im.R.inc(24513);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24514);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24515);Locale.setDefault(originalLocale);
        __CLR4_4_1iwhiwhle6np4im.R.inc(24516);originalDateTimeZone = null;
        __CLR4_4_1iwhiwhle6np4im.R.inc(24517);originalTimeZone = null;
        __CLR4_4_1iwhiwhle6np4im.R.inc(24518);originalLocale = null;
    }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testRounding8448() {__CLR4_4_1iwhiwhle6np4im.R.globalSliceStart(getClass().getName(),24519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1junq9fix3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwhiwhle6np4im.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwhiwhle6np4im.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8448",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1junq9fix3(){try{__CLR4_4_1iwhiwhle6np4im.R.inc(24519); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24520);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24521);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24522);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24523);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24524);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24525);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24526);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24527);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24528);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24529);test.setRounding(null, -1); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24530);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24531);assertEquals(null, test.getRoundingField()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24532);test.setRounding(ISOChronology.getInstance().hourOfDay()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24533);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24534);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24535);test.setRounding(null); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24536);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24537);assertEquals(null, test.getRoundingField()); 
 }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
public void testToDateTime605() {__CLR4_4_1iwhiwhle6np4im.R.globalSliceStart(getClass().getName(),24538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brhueyixm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwhiwhle6np4im.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwhiwhle6np4im.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime605",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brhueyixm(){try{__CLR4_4_1iwhiwhle6np4im.R.inc(24538); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24539);DateTime test = new DateTime(TEST_TIME1); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24540);DateTime result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24541);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24542);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24543);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24544);result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24545);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24546);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24547);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24548);result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24549);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24550);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24551);test = new DateTime(TEST_TIME1, PARIS); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24552);result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24553);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24554);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
public void testToDateTime606() {__CLR4_4_1iwhiwhle6np4im.R.globalSliceStart(getClass().getName(),24555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0ht7fiy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iwhiwhle6np4im.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iwhiwhle6np4im.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0ht7fiy3(){try{__CLR4_4_1iwhiwhle6np4im.R.inc(24555); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24556);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24557);DateTime result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24558);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24559);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24560);test = new Instant(TEST_TIME1); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24561);result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24562);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24563);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24564);test = new Instant(TEST_TIME1); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24565);result = test.toDateTime(); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24566);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1iwhiwhle6np4im.R.inc(24567);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
 }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24568);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24569);return null;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24570);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24571);return TEST_TIME1;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24572);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24573);return ISOChronology.getInstance();
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24574);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24575);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24576);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24577);return null;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24578);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24579);return this;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24580);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24581);return this;
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1iwhiwhle6np4im.R.inc(24582);
            __CLR4_4_1iwhiwhle6np4im.R.inc(24583);return "";
        }finally{__CLR4_4_1iwhiwhle6np4im.R.flushNeeded();}}
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}

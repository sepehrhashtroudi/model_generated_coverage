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
public class TestDateTime_Basics extends TestCase {static class __CLR4_4_1h3th3tldnipyyj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,22215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22169);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22170);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22171);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22172);return new TestSuite(TestDateTime_Basics.class);
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

    public TestDateTime_Basics(String name) {
        super(name);__CLR4_4_1h3th3tldnipyyj.R.inc(22174);try{__CLR4_4_1h3th3tldnipyyj.R.inc(22173);
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22175);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22176);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22177);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1h3th3tldnipyyj.R.inc(22178);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1h3th3tldnipyyj.R.inc(22179);originalLocale = Locale.getDefault();
        __CLR4_4_1h3th3tldnipyyj.R.inc(22180);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22181);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1h3th3tldnipyyj.R.inc(22182);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22183);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22184);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h3th3tldnipyyj.R.inc(22185);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22186);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22187);Locale.setDefault(originalLocale);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22188);originalDateTimeZone = null;
        __CLR4_4_1h3th3tldnipyyj.R.inc(22189);originalTimeZone = null;
        __CLR4_4_1h3th3tldnipyyj.R.inc(22190);originalLocale = null;
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22191);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22192);return null;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22193);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22194);return TEST_TIME1;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22195);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22196);return ISO_DEFAULT;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22197);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22198);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public DateTimeZone getZone() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22199);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22200);return null;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public Chronology withUTC() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22201);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22202);return this;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22203);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22204);return this;
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
        public String toString() {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22205);
            __CLR4_4_1h3th3tldnipyyj.R.inc(22206);return "";
        }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}
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
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1h3th3tldnipyyj.R.inc(22207);
        __CLR4_4_1h3th3tldnipyyj.R.inc(22208);assertEquals(year, test.getYear());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22209);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22210);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22211);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22212);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22213);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1h3th3tldnipyyj.R.inc(22214);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1h3th3tldnipyyj.R.flushNeeded();}}

}

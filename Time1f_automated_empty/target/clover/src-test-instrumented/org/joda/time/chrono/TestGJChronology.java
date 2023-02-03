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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology extends TestCase {static class __CLR4_4_1i74i74ldnipz7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,23623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23584);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23585);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23586);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23587);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1i74i74ldnipz7v.R.inc(23589);try{__CLR4_4_1i74i74ldnipz7v.R.inc(23588);
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23590);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23591);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23592);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1i74i74ldnipz7v.R.inc(23593);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1i74i74ldnipz7v.R.inc(23594);originalLocale = Locale.getDefault();
        __CLR4_4_1i74i74ldnipz7v.R.inc(23595);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23596);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1i74i74ldnipz7v.R.inc(23597);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23598);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23599);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1i74i74ldnipz7v.R.inc(23600);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23601);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23602);Locale.setDefault(originalLocale);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23603);originalDateTimeZone = null;
        __CLR4_4_1i74i74ldnipz7v.R.inc(23604);originalTimeZone = null;
        __CLR4_4_1i74i74ldnipz7v.R.inc(23605);originalLocale = null;
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23606);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23607);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1i74i74ldnipz7v.R.inc(23608);
        __CLR4_4_1i74i74ldnipz7v.R.inc(23609);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1i74i74ldnipz7v.R.inc(23610);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1i74i74ldnipz7v.R.inc(23611);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1i74i74ldnipz7v.R.inc(23612);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1i74i74ldnipz7v.R.inc(23613);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1i74i74ldnipz7v.R.inc(23614);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1i74i74ldnipz7v.R.inc(23615);assertEquals(amt, diff);
        
        __CLR4_4_1i74i74ldnipz7v.R.inc(23616);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1i74i74ldnipz7v.R.iget(23617)!=0|true))||(__CLR4_4_1i74i74ldnipz7v.R.iget(23618)==0&false))) {{
            __CLR4_4_1i74i74ldnipz7v.R.inc(23619);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1i74i74ldnipz7v.R.inc(23620);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1i74i74ldnipz7v.R.inc(23621);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1i74i74ldnipz7v.R.inc(23622);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1i74i74ldnipz7v.R.flushNeeded();}}

    

    

    

    

    

}

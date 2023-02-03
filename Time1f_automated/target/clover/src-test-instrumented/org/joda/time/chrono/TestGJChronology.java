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
public class TestGJChronology extends TestCase {static class __CLR4_4_1j3uj3ulccietvo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,24801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24762);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24763);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24764);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24765);return new TestSuite(TestGJChronology.class);
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    public TestGJChronology(String name) {
        super(name);__CLR4_4_1j3uj3ulccietvo.R.inc(24767);try{__CLR4_4_1j3uj3ulccietvo.R.inc(24766);
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24768);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24769);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24770);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1j3uj3ulccietvo.R.inc(24771);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1j3uj3ulccietvo.R.inc(24772);originalLocale = Locale.getDefault();
        __CLR4_4_1j3uj3ulccietvo.R.inc(24773);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24774);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1j3uj3ulccietvo.R.inc(24775);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24776);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24777);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1j3uj3ulccietvo.R.inc(24778);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24779);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24780);Locale.setDefault(originalLocale);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24781);originalDateTimeZone = null;
        __CLR4_4_1j3uj3ulccietvo.R.inc(24782);originalTimeZone = null;
        __CLR4_4_1j3uj3ulccietvo.R.inc(24783);originalLocale = null;
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24784);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24785);assertEquals(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                     new DateTime(year, month, day, hour, minute, second, millis,
                                  GJChronology.getInstance(DateTimeZone.UTC)));
    }finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1j3uj3ulccietvo.R.inc(24786);
        __CLR4_4_1j3uj3ulccietvo.R.inc(24787);DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1j3uj3ulccietvo.R.inc(24788);DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1j3uj3ulccietvo.R.inc(24789);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1j3uj3ulccietvo.R.inc(24790);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1j3uj3ulccietvo.R.inc(24791);DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        __CLR4_4_1j3uj3ulccietvo.R.inc(24792);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1j3uj3ulccietvo.R.inc(24793);assertEquals(amt, diff);
        
        __CLR4_4_1j3uj3ulccietvo.R.inc(24794);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1j3uj3ulccietvo.R.iget(24795)!=0|true))||(__CLR4_4_1j3uj3ulccietvo.R.iget(24796)==0&false))) {{
            __CLR4_4_1j3uj3ulccietvo.R.inc(24797);YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1j3uj3ulccietvo.R.inc(24798);YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            __CLR4_4_1j3uj3ulccietvo.R.inc(24799);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1j3uj3ulccietvo.R.inc(24800);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1j3uj3ulccietvo.R.flushNeeded();}}

    

    

    

    

    

}

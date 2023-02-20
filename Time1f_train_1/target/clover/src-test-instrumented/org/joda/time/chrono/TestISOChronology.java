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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {static class __CLR4_4_1q4hq4hle6qeaec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,33929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33857);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33858);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33859);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33860);return new TestSuite(TestISOChronology.class);
    }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    public TestISOChronology(String name) {
        super(name);__CLR4_4_1q4hq4hle6qeaec.R.inc(33862);try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33861);
    }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33863);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33864);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33865);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33866);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33867);originalLocale = Locale.getDefault();
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33868);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33869);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33870);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33871);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33872);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33873);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33874);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33875);Locale.setDefault(originalLocale);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33876);originalDateTimeZone = null;
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33877);originalTimeZone = null;
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33878);originalLocale = null;
    }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testFactory_Zone286() {__CLR4_4_1q4hq4hle6qeaec.R.globalSliceStart(getClass().getName(),33879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rp4v8q53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q4hq4hle6qeaec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q4hq4hle6qeaec.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testFactory_Zone286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rp4v8q53(){try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33879); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33880);assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33881);assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33882);assertEquals(LONDON, ISOChronology.getInstance(null).getZone()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33883);assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass()); 
 }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}} 


public void testWithZone288() {__CLR4_4_1q4hq4hle6qeaec.R.globalSliceStart(getClass().getName(),33884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hunm2zq58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q4hq4hle6qeaec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q4hq4hle6qeaec.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testWithZone288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hunm2zq58(){try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33884); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33885);assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33886);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33887);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33888);assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33889);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33890);assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS)); 
 }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}} 


public void testMinYear1122() {__CLR4_4_1q4hq4hle6qeaec.R.globalSliceStart(getClass().getName(),33891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yehdbwq5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1q4hq4hle6qeaec.R.rethrow($CLV_t2$);}finally{__CLR4_4_1q4hq4hle6qeaec.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestISOChronology.testMinYear1122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yehdbwq5f(){try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33891); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33892);final ISOChronology chrono = ISOChronology.getInstanceUTC(); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33893);final int minYear = chrono.year().getMinimumValue(); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33894);DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33895);DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33896);assertTrue(start.getMillis() < 0); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33897);assertTrue(end.getMillis() > start.getMillis()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33898);assertEquals(minYear, start.getYear()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33899);assertEquals(minYear, end.getYear()); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33900);long delta = end.getMillis() - start.getMillis(); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33901);long expectedDelta = ((((start.year().isLeap() )&&(__CLR4_4_1q4hq4hle6qeaec.R.iget(33902)!=0|true))||(__CLR4_4_1q4hq4hle6qeaec.R.iget(33903)==0&false))? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1; 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33904);assertEquals(expectedDelta, delta); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33905);assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33906);assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono)); 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33907);try { 
         __CLR4_4_1q4hq4hle6qeaec.R.inc(33908);start.minusYears(1); 
         __CLR4_4_1q4hq4hle6qeaec.R.inc(33909);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33910);try { 
         __CLR4_4_1q4hq4hle6qeaec.R.inc(33911);end.minusYears(1); 
         __CLR4_4_1q4hq4hle6qeaec.R.inc(33912);fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     __CLR4_4_1q4hq4hle6qeaec.R.inc(33913);assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE)); 
 }finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}} 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {try{__CLR4_4_1q4hq4hle6qeaec.R.inc(33914);
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33915);DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33916);DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33917);assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33918);assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        __CLR4_4_1q4hq4hle6qeaec.R.inc(33919);DurationField field = type.getField(ISOChronology.getInstanceUTC());
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33920);int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33921);assertEquals(amt, diff);
        
        __CLR4_4_1q4hq4hle6qeaec.R.inc(33922);if ((((type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days())&&(__CLR4_4_1q4hq4hle6qeaec.R.iget(33923)!=0|true))||(__CLR4_4_1q4hq4hle6qeaec.R.iget(33924)==0&false))) {{
            __CLR4_4_1q4hq4hle6qeaec.R.inc(33925);YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            __CLR4_4_1q4hq4hle6qeaec.R.inc(33926);YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            __CLR4_4_1q4hq4hle6qeaec.R.inc(33927);assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            __CLR4_4_1q4hq4hle6qeaec.R.inc(33928);assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }}finally{__CLR4_4_1q4hq4hle6qeaec.R.flushNeeded();}}

    

    

    

}

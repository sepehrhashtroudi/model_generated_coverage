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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {static class __CLR4_4_1lhylhylc8axe0c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,27949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1lhylhylc8axe0c.R.inc(27862);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27863);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lhylhylc8axe0c.R.inc(27864);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27865);return new TestSuite(TestLocalDate_Constructors.class);
    }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}}

    public TestLocalDate_Constructors(String name) {
        super(name);__CLR4_4_1lhylhylc8axe0c.R.inc(27867);try{__CLR4_4_1lhylhylc8axe0c.R.inc(27866);
    }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lhylhylc8axe0c.R.inc(27868);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27869);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27870);zone = DateTimeZone.getDefault();
        __CLR4_4_1lhylhylc8axe0c.R.inc(27871);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lhylhylc8axe0c.R.inc(27872);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27873);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lhylhylc8axe0c.R.inc(27874);DateTimeZone.setDefault(zone);
        __CLR4_4_1lhylhylc8axe0c.R.inc(27875);zone = null;
    }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_long1_Chronology210() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6ix9blic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_Chronology210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6ix9blic() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27876); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27877);LocalDate test = new LocalDate(TEST_TIME1, GREGORIAN_PARIS); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27878);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27879);assertEquals(1970, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27880);assertEquals(4, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27881);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor_nullObject_nullDateTimeZone299() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rz3z7tlii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullDateTimeZone299",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rz3z7tlii() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27882); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27883);LocalDate test = new LocalDate((Object) null, (DateTimeZone) null); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27884);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27885);assertEquals(1970, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27886);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27887);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor_ObjectString2453() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xda2y6lio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString2453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xda2y6lio() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27888); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27889);LocalDate test = new LocalDate("1972-037"); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27890);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27891);assertEquals(1972, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27892);assertEquals(2, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27893);assertEquals(6, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testFactory_fromCalendarFields771() throws Exception {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qojyeoliu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields771",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qojyeoliu() throws Exception{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27894); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27895);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27896);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27897);LocalDate expected = new LocalDate(1970, 2, 3); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27898);assertEquals(expected, LocalDate.fromCalendarFields(cal)); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testFactory_fromDateFields_before1970924() throws Exception {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f31x2dliz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_before1970924",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f31x2dliz() throws Exception{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27899); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27900);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27901);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27902);LocalDate expected = new LocalDate(1969, 2, 3); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27903);assertEquals(expected, LocalDate.fromDateFields(cal.getTime())); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1201() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssapl3lj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone1201",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssapl3lj4() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27904); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27905);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27906);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27907);LocalDate test = new LocalDate(LONDON); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27908);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27909);assertEquals(2005, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27910);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27911);assertEquals(8, test.getDayOfMonth()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27912);assertEquals(test, LocalDate.now(LONDON)); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27913);test = new LocalDate(PARIS); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27914);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27915);assertEquals(2005, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27916);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27917);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27918);assertEquals(test, LocalDate.now(PARIS)); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1231() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya3unfljj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullDateTimeZone1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya3unfljj() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27919); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27920);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27921);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27922);LocalDate test = new LocalDate((DateTimeZone) null); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27923);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27924);assertEquals(2005, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27925);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27926);assertEquals(8, test.getDayOfMonth()); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor_Chronology1269() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cv0o7uljr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology1269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cv0o7uljr() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27927); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27928);LocalDate test = new LocalDate(GREGORIAN_PARIS); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27929);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27930);assertEquals(1970, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27931);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27932);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27933);assertEquals(test, LocalDate.now(GREGORIAN_PARIS)); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testFactory_fromDateFields_null1337() throws Exception {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176muvvljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_null1337",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176muvvljy() throws Exception{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27934); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27935);try { 
         __CLR4_4_1lhylhylc8axe0c.R.inc(27936);LocalDate.fromDateFields((Date) null); 
         __CLR4_4_1lhylhylc8axe0c.R.inc(27937);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testConstructor1639() throws Throwable {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6g56ilk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor1639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6g56ilk2() throws Throwable{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27938); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27939);LocalDate test = new LocalDate(); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27940);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27941);assertEquals(1970, test.getYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27942);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27943);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27944);assertEquals(test, LocalDate.now()); 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 


public void testFactory_fromCalendarFields_null1745() throws Exception {__CLR4_4_1lhylhylc8axe0c.R.globalSliceStart(getClass().getName(),27945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr8coklk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lhylhylc8axe0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lhylhylc8axe0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_null1745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr8coklk9() throws Exception{try{__CLR4_4_1lhylhylc8axe0c.R.inc(27945); 
     __CLR4_4_1lhylhylc8axe0c.R.inc(27946);try { 
         __CLR4_4_1lhylhylc8axe0c.R.inc(27947);LocalDate.fromCalendarFields((Calendar) null); 
         __CLR4_4_1lhylhylc8axe0c.R.inc(27948);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lhylhylc8axe0c.R.flushNeeded();}} 

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}

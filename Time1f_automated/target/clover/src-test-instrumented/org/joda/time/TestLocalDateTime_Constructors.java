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
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors extends TestCase {static class __CLR4_4_1hnahnalccietnb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,22902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1hnahnalccietnb.R.inc(22870);
        __CLR4_4_1hnahnalccietnb.R.inc(22871);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hnahnalccietnb.R.inc(22872);
        __CLR4_4_1hnahnalccietnb.R.inc(22873);return new TestSuite(TestLocalDateTime_Constructors.class);
    }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}

    public TestLocalDateTime_Constructors(String name) {
        super(name);__CLR4_4_1hnahnalccietnb.R.inc(22875);try{__CLR4_4_1hnahnalccietnb.R.inc(22874);
    }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hnahnalccietnb.R.inc(22876);
        __CLR4_4_1hnahnalccietnb.R.inc(22877);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hnahnalccietnb.R.inc(22878);zone = DateTimeZone.getDefault();
        __CLR4_4_1hnahnalccietnb.R.inc(22879);DateTimeZone.setDefault(MOSCOW);
    }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hnahnalccietnb.R.inc(22880);
        __CLR4_4_1hnahnalccietnb.R.inc(22881);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hnahnalccietnb.R.inc(22882);DateTimeZone.setDefault(zone);
        __CLR4_4_1hnahnalccietnb.R.inc(22883);zone = null;
    }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor_nullObject_nullDateTimeZone45() throws Throwable {__CLR4_4_1hnahnalccietnb.R.globalSliceStart(getClass().getName(),22884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woh7rchno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnahnalccietnb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnahnalccietnb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woh7rchno() throws Throwable{try{__CLR4_4_1hnahnalccietnb.R.inc(22884); 
     __CLR4_4_1hnahnalccietnb.R.inc(22885);LocalDateTime test = new LocalDateTime((Object) null, (DateTimeZone) null); 
     __CLR4_4_1hnahnalccietnb.R.inc(22886);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22887);assertEquals(1970, test.getYear()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22888);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22889);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22890);assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22891);assertEquals(20, test.getMinuteOfHour()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22892);assertEquals(30, test.getSecondOfMinute()); 
     __CLR4_4_1hnahnalccietnb.R.inc(22893);assertEquals(40, test.getMillisOfSecond()); 
 }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}
public void testFactory_fromCalendarFields48() throws Exception {__CLR4_4_1hnahnalccietnb.R.globalSliceStart(getClass().getName(),22894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llcbbhhny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hnahnalccietnb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hnahnalccietnb.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Constructors.testFactory_fromCalendarFields48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llcbbhhny() throws Exception{try{__CLR4_4_1hnahnalccietnb.R.inc(22894); 
     __CLR4_4_1hnahnalccietnb.R.inc(22895);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     __CLR4_4_1hnahnalccietnb.R.inc(22896);cal.set(Calendar.MILLISECOND, 7); 
     __CLR4_4_1hnahnalccietnb.R.inc(22897);LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     __CLR4_4_1hnahnalccietnb.R.inc(22898);assertEquals(expected, LocalDateTime.fromCalendarFields(cal)); 
     __CLR4_4_1hnahnalccietnb.R.inc(22899);try { 
         __CLR4_4_1hnahnalccietnb.R.inc(22900);LocalDateTime.fromCalendarFields((Calendar) null); 
         __CLR4_4_1hnahnalccietnb.R.inc(22901);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hnahnalccietnb.R.flushNeeded();}}
    

    

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
    

    

    

}

/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for StringConverter.
 *
 * @author Stephen Colebourne
 */
public class TestStringConverter extends TestCase {static class __CLR4_4_1t8jt8jlc8axeww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ONE_HOUR = DateTimeZone.forOffsetHours(1);
    private static final DateTimeZone SIX = DateTimeZone.forOffsetHours(6);
    private static final DateTimeZone SEVEN = DateTimeZone.forOffsetHours(7);
    private static final DateTimeZone EIGHT = DateTimeZone.forOffsetHours(8);
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_EIGHT = ISOChronology.getInstance(EIGHT);
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37891);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37892);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37893);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37894);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1t8jt8jlc8axeww.R.inc(37896);try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37895);
    }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37897);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37898);zone = DateTimeZone.getDefault();
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37899);locale = Locale.getDefault();
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37900);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37901);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37902);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37903);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37904);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37905);DateTimeZone.setDefault(zone);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37906);Locale.setDefault(locale);
        __CLR4_4_1t8jt8jlc8axeww.R.inc(37907);zone = null;
    }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testSetIntoPeriod_Object4147() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b96v04t90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b96v04t90() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37908); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37909);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37910);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37911);assertEquals(2, m.getYears()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37912);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37913);assertEquals(3, m.getDays()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37914);assertEquals(12, m.getHours()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37915);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37916);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37917);assertEquals(56, m.getMillis()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoPeriod_Object6163() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mtymst9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mtymst9a() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37918); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37919);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37920);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37921);assertEquals(2, m.getYears()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37922);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37923);assertEquals(3, m.getDays()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37924);assertEquals(12, m.getHours()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37925);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37926);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37927);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testGetDurationMillis_Object1221() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1er7rkpt9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1er7rkpt9k() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37928); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37929);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37930);assertEquals(12345, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37931);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37932);assertEquals(12345, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37933);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37934);assertEquals(12000, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37935);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37936);assertEquals(12000, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37937);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37938);assertEquals(-12320, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37939);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37940);assertEquals(-320, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37941);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37942);assertEquals(0, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37943);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37944);assertEquals(0, millis); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37945);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37946);assertEquals(12345, millis); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testIsReadableInterval_Object_Chronology574() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qt3lbta3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology574",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qt3lbta3() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37947); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37948);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology5580() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gcmq5ta5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5580",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gcmq5ta5() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37949); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37950);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37951);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37952);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37953);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37954);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testToString604() {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p59vtptab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p59vtptab(){try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37955); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37956);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology5697() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8h153tad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8h153tad() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37957); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37958);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37959);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37960);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37961);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoPeriod_Object3775() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157usomtai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3775",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157usomtai() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37962); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37963);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37964);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37965);assertEquals(2, m.getYears()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37966);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37967);assertEquals(3, m.getDays()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37968);assertEquals(12, m.getHours()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37969);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37970);assertEquals(48, m.getSeconds()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37971);assertEquals(34, m.getMillis()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology4874() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yhcq1tas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4874",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yhcq1tas() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37972); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37973);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37974);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37975);StringConverter.INSTANCE.setInto(m, "/P1Y", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37976);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testGetPartialValues1047() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lstzsotax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues1047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lstzsotax() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37977); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37978);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37979);int[] expected = new int[] { 3, 4, 5, 6 }; 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37980);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37981);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology11199() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syi2sqtb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology11199",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syi2sqtb2() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37982); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37983);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37984);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37985);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37986);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37987);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoPeriod_Object81355() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),37988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfwy44tb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object81355",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfwy44tb8() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(37988); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37989);MutablePeriod m = new MutablePeriod(); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37990);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37991);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37992);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37993);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37994);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37995);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37996);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37997);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(37998);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(37999);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38000);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38001);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology11478() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),38002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18eeh0btbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology11478",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18eeh0btbm() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(38002); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38003);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38004);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38005);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38006);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testGetDurationMillis_Object21504() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),38007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eknzkvtbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object21504",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eknzkvtbr() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(38007); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38008);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38009);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38010);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38011);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38012);StringConverter.INSTANCE.getDurationMillis("PTS"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38013);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38014);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38015);StringConverter.INSTANCE.getDurationMillis("XT0S"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38016);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38017);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38018);StringConverter.INSTANCE.getDurationMillis("PX0S"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38019);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38020);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38021);StringConverter.INSTANCE.getDurationMillis("PT0X"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38022);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38023);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38024);StringConverter.INSTANCE.getDurationMillis("PTXS"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38025);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38026);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38027);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38028);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38029);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38030);StringConverter.INSTANCE.getDurationMillis("PT0-00S"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38031);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38032);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38033);StringConverter.INSTANCE.getDurationMillis("PT-.001S"); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38034);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology31552() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),38035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2xzcqtcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology31552",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2xzcqtcj() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(38035); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38036);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38037);try { 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38038);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1t8jt8jlc8axeww.R.inc(38039);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 


public void testSetIntoPeriod_Object51748() throws Exception {__CLR4_4_1t8jt8jlc8axeww.R.globalSliceStart(getClass().getName(),38040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5cg3rtco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t8jt8jlc8axeww.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t8jt8jlc8axeww.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object51748",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5cg3rtco() throws Exception{try{__CLR4_4_1t8jt8jlc8axeww.R.inc(38040); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38041);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38042);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38043);assertEquals(2, m.getYears()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38044);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38045);assertEquals(3, m.getDays()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38046);assertEquals(12, m.getHours()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38047);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38048);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1t8jt8jlc8axeww.R.inc(38049);assertEquals(0, m.getMillis()); 
 }finally{__CLR4_4_1t8jt8jlc8axeww.R.flushNeeded();}} 

    

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

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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for CalendarConverter.
 *
 * @author Stephen Colebourne
 */
public class TestCalendarConverter extends TestCase {static class __CLR4_4_1r7hr7hle6qeaia{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static Chronology JULIAN;
    private static Chronology ISO;

    public static void main(String[] args) {try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35261);
        __CLR4_4_1r7hr7hle6qeaia.R.inc(35262);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35263);
        __CLR4_4_1r7hr7hle6qeaia.R.inc(35264);return new TestSuite(TestCalendarConverter.class);
    }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}}

    public TestCalendarConverter(String name) {
        super(name);__CLR4_4_1r7hr7hle6qeaia.R.inc(35266);try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35265);
    }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35267);
        __CLR4_4_1r7hr7hle6qeaia.R.inc(35268);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1r7hr7hle6qeaia.R.inc(35269);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetChronology_Object_nullChronology120() throws Exception {__CLR4_4_1r7hr7hle6qeaia.R.globalSliceStart(getClass().getName(),35270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfrmnar7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7hr7hle6qeaia.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7hr7hle6qeaia.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_nullChronology120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfrmnar7q() throws Exception{try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35270); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35271);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35272);assertEquals(GJChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35273);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35274);cal.setGregorianChange(new Date(0L)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35275);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35276);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35277);cal.setGregorianChange(new Date(Long.MAX_VALUE)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35278);assertEquals(JulianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35279);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35280);cal.setGregorianChange(new Date(Long.MIN_VALUE)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35281);assertEquals(GregorianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35282);cal = new GregorianCalendar(new MockUnknownTimeZone()); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35283);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35284);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35285);assertEquals(ISOChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(uc, (Chronology) null)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35286);try { 
         __CLR4_4_1r7hr7hle6qeaia.R.inc(35287);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance(); 
         __CLR4_4_1r7hr7hle6qeaia.R.inc(35288);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow")); 
         __CLR4_4_1r7hr7hle6qeaia.R.inc(35289);assertEquals(BuddhistChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(bc, (Chronology) null)); 
     } catch (ClassNotFoundException ex) { 
     } 
 }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}} 


public void testGetChronology_Object_Chronology1334() throws Exception {__CLR4_4_1r7hr7hle6qeaia.R.globalSliceStart(getClass().getName(),35290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1snotc1r8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7hr7hle6qeaia.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7hr7hle6qeaia.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_Chronology1334",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1snotc1r8a() throws Exception{try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35290); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35291);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris")); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35292);assertEquals(JULIAN, CalendarConverter.INSTANCE.getChronology(cal, JULIAN)); 
 }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}} 


public void testGetPartialValues1335() throws Exception {__CLR4_4_1r7hr7hle6qeaia.R.globalSliceStart(getClass().getName(),35293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lv5gqr8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7hr7hle6qeaia.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7hr7hle6qeaia.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetPartialValues1335",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lv5gqr8d() throws Exception{try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35293); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35294);GregorianCalendar cal = new GregorianCalendar(); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35295);cal.setTime(new Date(12345678L)); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35296);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35297);int[] expected = ISO.get(tod, 12345678L); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35298);int[] actual = CalendarConverter.INSTANCE.getPartialValues(tod, cal, ISO); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35299);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}} 


public void testToString1336() {__CLR4_4_1r7hr7hle6qeaia.R.globalSliceStart(getClass().getName(),35300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12snw8mr8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r7hr7hle6qeaia.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r7hr7hle6qeaia.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testToString1336",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12snw8mr8k(){try{__CLR4_4_1r7hr7hle6qeaia.R.inc(35300); 
     __CLR4_4_1r7hr7hle6qeaia.R.inc(35301);assertEquals("Converter[java.util.Calendar]", CalendarConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1r7hr7hle6qeaia.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}

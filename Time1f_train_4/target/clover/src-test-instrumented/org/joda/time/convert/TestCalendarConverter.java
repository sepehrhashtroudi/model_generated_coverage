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
public class TestCalendarConverter extends TestCase {static class __CLR4_4_1r8rr8rle6rjdgp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,35345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static Chronology JULIAN;
    private static Chronology ISO;

    public static void main(String[] args) {try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35307);
        __CLR4_4_1r8rr8rle6rjdgp.R.inc(35308);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35309);
        __CLR4_4_1r8rr8rle6rjdgp.R.inc(35310);return new TestSuite(TestCalendarConverter.class);
    }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}}

    public TestCalendarConverter(String name) {
        super(name);__CLR4_4_1r8rr8rle6rjdgp.R.inc(35312);try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35311);
    }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35313);
        __CLR4_4_1r8rr8rle6rjdgp.R.inc(35314);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1r8rr8rle6rjdgp.R.inc(35315);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetChronology_Object_nullChronology121() throws Exception {__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceStart(getClass().getName(),35316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6rnutr90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8rr8rle6rjdgp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_nullChronology121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6rnutr90() throws Exception{try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35316); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35317);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris")); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35318);assertEquals(GJChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35319);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35320);cal.setGregorianChange(new Date(0L)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35321);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35322);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35323);cal.setGregorianChange(new Date(Long.MAX_VALUE)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35324);assertEquals(JulianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35325);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35326);cal.setGregorianChange(new Date(Long.MIN_VALUE)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35327);assertEquals(GregorianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35328);cal = new GregorianCalendar(new MockUnknownTimeZone()); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35329);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35330);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35331);assertEquals(ISOChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(uc, (Chronology) null)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35332);try { 
         __CLR4_4_1r8rr8rle6rjdgp.R.inc(35333);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance(); 
         __CLR4_4_1r8rr8rle6rjdgp.R.inc(35334);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow")); 
         __CLR4_4_1r8rr8rle6rjdgp.R.inc(35335);assertEquals(BuddhistChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(bc, (Chronology) null)); 
     } catch (ClassNotFoundException ex) { 
     } 
 }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}} 


public void testGetPartialValues1339() throws Exception {__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceStart(getClass().getName(),35336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlv0mmr9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8rr8rle6rjdgp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetPartialValues1339",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlv0mmr9k() throws Exception{try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35336); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35337);GregorianCalendar cal = new GregorianCalendar(); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35338);cal.setTime(new Date(12345678L)); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35339);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35340);int[] expected = ISO.get(tod, 12345678L); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35341);int[] actual = CalendarConverter.INSTANCE.getPartialValues(tod, cal, ISO); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35342);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}} 


public void testToString1340() {__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceStart(getClass().getName(),35343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17f77k3r9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1r8rr8rle6rjdgp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1r8rr8rle6rjdgp.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testToString1340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17f77k3r9r(){try{__CLR4_4_1r8rr8rle6rjdgp.R.inc(35343); 
     __CLR4_4_1r8rr8rle6rjdgp.R.inc(35344);assertEquals("Converter[java.util.Calendar]", CalendarConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1r8rr8rle6rjdgp.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}

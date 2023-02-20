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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePartialConverter.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestReadablePartialConverter extends TestCase {static class __CLR4_4_1rfwrfwle6qsfj2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,35606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    private static Chronology BUDDHIST;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35564);
        __CLR4_4_1rfwrfwle6qsfj2.R.inc(35565);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35566);
        __CLR4_4_1rfwrfwle6qsfj2.R.inc(35567);return new TestSuite(TestReadablePartialConverter.class);
    }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}

    public TestReadablePartialConverter(String name) {
        super(name);__CLR4_4_1rfwrfwle6qsfj2.R.inc(35569);try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35568);
    }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35570);
        __CLR4_4_1rfwrfwle6qsfj2.R.inc(35571);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rfwrfwle6qsfj2.R.inc(35572);ISO = ISOChronology.getInstance();
        __CLR4_4_1rfwrfwle6qsfj2.R.inc(35573);BUDDHIST = BuddhistChronology.getInstance();
    }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetChronology_Object_Zone45() throws Exception {__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceStart(getClass().getName(),35574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172uwz3rg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rfwrfwle6qsfj2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Zone45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172uwz3rg6() throws Exception{try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35574); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35575);assertEquals(ISO_PARIS, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), PARIS)); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35576);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), DateTimeZone.getDefault())); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35577);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (DateTimeZone) null)); 
 }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}} 


public void testGetChronology_Object_Chronology46() throws Exception {__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceStart(getClass().getName(),35578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug304erga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rfwrfwle6qsfj2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug304erga() throws Exception{try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35578); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35579);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), JULIAN)); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35580);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN)); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35581);assertEquals(BUDDHIST.withUTC(), ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), (Chronology) null)); 
 }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}} 


public void testGetPartialValues47() throws Exception {__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceStart(getClass().getName(),35582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nyyifrge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rfwrfwle6qsfj2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rfwrfwle6qsfj2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetPartialValues47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nyyifrge() throws Exception{try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35582); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35583);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35584);int[] expected = new int[] { 1, 2, 3, 4 }; 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35585);int[] actual = ReadablePartialConverter.INSTANCE.getPartialValues(tod, new TimeOfDay(1, 2, 3, 4), ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35586);assertEquals(true, Arrays.equals(expected, actual)); 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35587);try { 
         __CLR4_4_1rfwrfwle6qsfj2.R.inc(35588);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new YearMonthDay(2005, 6, 9), JULIAN); 
         __CLR4_4_1rfwrfwle6qsfj2.R.inc(35589);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rfwrfwle6qsfj2.R.inc(35590);try { 
         __CLR4_4_1rfwrfwle6qsfj2.R.inc(35591);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new MockTOD(), JULIAN); 
         __CLR4_4_1rfwrfwle6qsfj2.R.inc(35592);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    static class MockTOD extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35593);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1rfwrfwle6qsfj2.R.inc(35594);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1rfwrfwle6qsfj2.R.inc(35595);__CLB4_4_1_bool0=true;}
                __CLR4_4_1rfwrfwle6qsfj2.R.inc(35596);return chrono.hourOfDay();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1rfwrfwle6qsfj2.R.inc(35597);__CLB4_4_1_bool0=true;}
                __CLR4_4_1rfwrfwle6qsfj2.R.inc(35598);return chrono.minuteOfHour();
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1rfwrfwle6qsfj2.R.inc(35599);__CLB4_4_1_bool0=true;}
                __CLR4_4_1rfwrfwle6qsfj2.R.inc(35600);return chrono.year();
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1rfwrfwle6qsfj2.R.inc(35601);__CLB4_4_1_bool0=true;}
                __CLR4_4_1rfwrfwle6qsfj2.R.inc(35602);return chrono.era();
            }
            __CLR4_4_1rfwrfwle6qsfj2.R.inc(35603);return null;
        }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1rfwrfwle6qsfj2.R.inc(35604);
            __CLR4_4_1rfwrfwle6qsfj2.R.inc(35605);return 4;
        }finally{__CLR4_4_1rfwrfwle6qsfj2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

}

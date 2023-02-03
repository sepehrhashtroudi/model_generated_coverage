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
@java.lang.SuppressWarnings({"fallthrough"}) public class TestReadablePartialConverter extends TestCase {static class __CLR4_4_1t6mt6mlc8axewf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,37866,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    private static Chronology BUDDHIST;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37822);
        __CLR4_4_1t6mt6mlc8axewf.R.inc(37823);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37824);
        __CLR4_4_1t6mt6mlc8axewf.R.inc(37825);return new TestSuite(TestReadablePartialConverter.class);
    }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}

    public TestReadablePartialConverter(String name) {
        super(name);__CLR4_4_1t6mt6mlc8axewf.R.inc(37827);try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37826);
    }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37828);
        __CLR4_4_1t6mt6mlc8axewf.R.inc(37829);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1t6mt6mlc8axewf.R.inc(37830);ISO = ISOChronology.getInstance();
        __CLR4_4_1t6mt6mlc8axewf.R.inc(37831);BUDDHIST = BuddhistChronology.getInstance();
    }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGetPartialValues1() throws Exception {__CLR4_4_1t6mt6mlc8axewf.R.globalSliceStart(getClass().getName(),37832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dd80t5t6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mlc8axewf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mlc8axewf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetPartialValues1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dd80t5t6w() throws Exception{try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37832); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37833);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37834);int[] expected = new int[] { 1, 2, 3, 4 }; 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37835);int[] actual = ReadablePartialConverter.INSTANCE.getPartialValues(tod, new TimeOfDay(1, 2, 3, 4), ISOChronology.getInstance(PARIS)); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37836);assertEquals(true, Arrays.equals(expected, actual)); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37837);try { 
         __CLR4_4_1t6mt6mlc8axewf.R.inc(37838);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new YearMonthDay(2005, 6, 9), JULIAN); 
         __CLR4_4_1t6mt6mlc8axewf.R.inc(37839);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37840);try { 
         __CLR4_4_1t6mt6mlc8axewf.R.inc(37841);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new MockTOD(), JULIAN); 
         __CLR4_4_1t6mt6mlc8axewf.R.inc(37842);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}} 


public void testGetChronology_Object_Zone104() throws Exception {__CLR4_4_1t6mt6mlc8axewf.R.globalSliceStart(getClass().getName(),37843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8gg8dt77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mlc8axewf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mlc8axewf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Zone104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8gg8dt77() throws Exception{try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37843); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37844);assertEquals(ISO_PARIS, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), PARIS)); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37845);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), DateTimeZone.getDefault())); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37846);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (DateTimeZone) null)); 
 }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}} 


public void testGetChronology_Object_Chronology609() throws Exception {__CLR4_4_1t6mt6mlc8axewf.R.globalSliceStart(getClass().getName(),37847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk6cr3t7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mlc8axewf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mlc8axewf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology609",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk6cr3t7b() throws Exception{try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37847); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37848);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), JULIAN)); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37849);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN)); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37850);assertEquals(BUDDHIST.withUTC(), ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), (Chronology) null)); 
 }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}} 


public void testSupportedType1567() throws Exception {__CLR4_4_1t6mt6mlc8axewf.R.globalSliceStart(getClass().getName(),37851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2eteqt7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t6mt6mlc8axewf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t6mt6mlc8axewf.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testSupportedType1567",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2eteqt7f() throws Exception{try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37851); 
     __CLR4_4_1t6mt6mlc8axewf.R.inc(37852);assertEquals(ReadablePartial.class, ReadablePartialConverter.INSTANCE.getSupportedType()); 
 }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    static class MockTOD extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37853);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1t6mt6mlc8axewf.R.inc(37854);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1t6mt6mlc8axewf.R.inc(37855);__CLB4_4_1_bool0=true;}
                __CLR4_4_1t6mt6mlc8axewf.R.inc(37856);return chrono.hourOfDay();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1t6mt6mlc8axewf.R.inc(37857);__CLB4_4_1_bool0=true;}
                __CLR4_4_1t6mt6mlc8axewf.R.inc(37858);return chrono.minuteOfHour();
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1t6mt6mlc8axewf.R.inc(37859);__CLB4_4_1_bool0=true;}
                __CLR4_4_1t6mt6mlc8axewf.R.inc(37860);return chrono.year();
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1t6mt6mlc8axewf.R.inc(37861);__CLB4_4_1_bool0=true;}
                __CLR4_4_1t6mt6mlc8axewf.R.inc(37862);return chrono.era();
            }
            __CLR4_4_1t6mt6mlc8axewf.R.inc(37863);return null;
        }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}
        public int size() {try{__CLR4_4_1t6mt6mlc8axewf.R.inc(37864);
            __CLR4_4_1t6mt6mlc8axewf.R.inc(37865);return 4;
        }finally{__CLR4_4_1t6mt6mlc8axewf.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

}

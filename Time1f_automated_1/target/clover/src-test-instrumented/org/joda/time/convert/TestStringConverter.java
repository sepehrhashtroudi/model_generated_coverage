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
public class TestStringConverter extends TestCase {static class __CLR4_4_1lqvlqvle6ndq2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,28298,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28183);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28184);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28185);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28186);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1lqvlqvle6ndq2y.R.inc(28188);try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28187);
    }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28189);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28190);zone = DateTimeZone.getDefault();
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28191);locale = Locale.getDefault();
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28192);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28193);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28194);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28195);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28196);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28197);DateTimeZone.setDefault(zone);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28198);Locale.setDefault(locale);
        __CLR4_4_1lqvlqvle6ndq2y.R.inc(28199);zone = null;
    }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetInstantMillis_Object_Chronology38() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fm8q08lrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Chronology38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fm8q08lrc() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28200); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28201);assertEquals(123L, StringConverter.INSTANCE.getInstantMillis("PT12.345S", JULIAN)); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28202);assertEquals(123L, StringConverter.INSTANCE.getInstantMillis("PT12.345s", (Chronology) null)); 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testGetInstantMillis_Object_Chronology39() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iv8osplrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Chronology39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iv8osplrf() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28203); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28204);long millis = StringConverter.INSTANCE.getInstantMillis("PT12.345S", JULIAN); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28205);assertEquals(12345, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28206);millis = StringConverter.INSTANCE.getInstantMillis("PT12.345s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28207);assertEquals(12345, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28208);millis = StringConverter.INSTANCE.getInstantMillis("PT12s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28209);assertEquals(12000, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28210);millis = StringConverter.INSTANCE.getInstantMillis("PT12.s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28211);assertEquals(12000, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28212);millis = StringConverter.INSTANCE.getInstantMillis("PT-12.32s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28213);assertEquals(-12320, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28214);millis = StringConverter.INSTANCE.getInstantMillis("PT-0.32s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28215);assertEquals(-320, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28216);millis = StringConverter.INSTANCE.getInstantMillis("PT-0.0s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28217);assertEquals(0, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28218);millis = StringConverter.INSTANCE.getInstantMillis("PT0.0s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28219);assertEquals(0, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28220);millis = StringConverter.INSTANCE.getInstantMillis("PT12.3456s", (Chronology) null); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28221);assertEquals(12345, millis); 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testGetDurationMillis_Object141() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fhy6jlry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fhy6jlry() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28222); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28223);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28224);assertEquals(12345, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28225);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28226);assertEquals(12345, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28227);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28228);assertEquals(12000, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28229);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28230);assertEquals(12000, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28231);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28232);assertEquals(-12320, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28233);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28234);assertEquals(-320, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28235);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28236);assertEquals(0, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28237);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28238);assertEquals(0, millis); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28239);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28240);assertEquals(12345, millis); 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoPeriod_Object842() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13u1smolsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object842",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13u1smolsh() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28241); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28242);MutablePeriod m = new MutablePeriod(); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28243);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28244);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28245);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28246);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28247);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28248);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28249);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28250);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28251);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28252);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28253);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28254);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoIntervalEx_Object_Chronology143() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cd537ulsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cd537ulsv() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28255); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28256);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28257);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28258);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28259);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoIntervalEx_Object_Chronology144() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19454fdlt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19454fdlt0() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28260); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28261);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28262);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28263);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28264);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoIntervalEx_Object_Chronology345() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4ujd2lt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4ujd2lt5() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28265); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28266);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28267);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28268);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28269);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoInterval_Object846() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pd8i0olta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object846",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pd8i0olta() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28270); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28271);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28272);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28273);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28275);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28276);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28277);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28278);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28279);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28280);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28281);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28282);StringConverter.INSTANCE.setInto(m, "P1MT0H0M", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28283);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
public void testSetIntoInterval_Object847() throws Exception {__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceStart(getClass().getName(),28284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm8gt5lto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lqvlqvle6ndq2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lqvlqvle6ndq2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm8gt5lto() throws Exception{try{__CLR4_4_1lqvlqvle6ndq2y.R.inc(28284); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28285);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28286);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28287);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28289);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28290);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28291);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28292);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28293);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28294);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1lqvlqvle6ndq2y.R.inc(28295);try { 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28296);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1lqvlqvle6ndq2y.R.inc(28297);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1lqvlqvle6ndq2y.R.flushNeeded();}}
    

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

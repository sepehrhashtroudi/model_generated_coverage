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
public class TestStringConverter extends TestCase {static class __CLR4_4_1rnmrnmle6qeake{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,35936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rnmrnmle6qeake.R.inc(35842);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35843);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rnmrnmle6qeake.R.inc(35844);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35845);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1rnmrnmle6qeake.R.inc(35847);try{__CLR4_4_1rnmrnmle6qeake.R.inc(35846);
    }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rnmrnmle6qeake.R.inc(35848);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35849);zone = DateTimeZone.getDefault();
        __CLR4_4_1rnmrnmle6qeake.R.inc(35850);locale = Locale.getDefault();
        __CLR4_4_1rnmrnmle6qeake.R.inc(35851);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35852);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1rnmrnmle6qeake.R.inc(35853);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rnmrnmle6qeake.R.inc(35854);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rnmrnmle6qeake.R.inc(35855);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35856);DateTimeZone.setDefault(zone);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35857);Locale.setDefault(locale);
        __CLR4_4_1rnmrnmle6qeake.R.inc(35858);zone = null;
    }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology141() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gl8oz9ro3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gl8oz9ro3() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35859); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35860);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testToString142() {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvb73sro5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvb73sro5(){try{__CLR4_4_1rnmrnmle6qeake.R.inc(35861); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35862);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testGetDurationMillis_Object1145() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7rgfsro7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7rgfsro7() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35863); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35864);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35865);assertEquals(12345, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35866);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35867);assertEquals(12345, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35868);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35869);assertEquals(12000, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35870);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35871);assertEquals(12000, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35872);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35873);assertEquals(-12320, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35874);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35875);assertEquals(-320, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35876);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35877);assertEquals(0, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35878);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35879);assertEquals(0, millis); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35880);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35881);assertEquals(12345, millis); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoPeriod_Object8146() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rexh1rroq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object8146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rexh1rroq() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35882); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35883);MutablePeriod m = new MutablePeriod(); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35884);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35885);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35886);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35887);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35888);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35889);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35890);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35891);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35892);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35893);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35894);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35895);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology1147() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1412i51rp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology1147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1412i51rp4() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35896); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35897);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35898);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35899);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35900);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology3148() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xar2irp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology3148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xar2irp9() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35901); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35902);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35903);try { 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35904);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1rnmrnmle6qeake.R.inc(35905);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoPeriod_Object6185() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q89xwrpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q89xwrpe() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35906); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35907);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35908);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35909);assertEquals(2, m.getYears()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35910);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35911);assertEquals(3, m.getDays()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35912);assertEquals(12, m.getHours()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35913);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35914);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35915);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoPeriod_Object5186() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abwycyrpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object5186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abwycyrpo() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35916); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35917);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35918);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35919);assertEquals(2, m.getYears()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35920);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35921);assertEquals(3, m.getDays()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35922);assertEquals(12, m.getHours()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35923);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35924);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35925);assertEquals(0, m.getMillis()); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 


public void testSetIntoPeriod_Object4187() throws Exception {__CLR4_4_1rnmrnmle6qeake.R.globalSliceStart(getClass().getName(),35926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxlms0rpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rnmrnmle6qeake.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rnmrnmle6qeake.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxlms0rpy() throws Exception{try{__CLR4_4_1rnmrnmle6qeake.R.inc(35926); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35927);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35928);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35929);assertEquals(2, m.getYears()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35930);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35931);assertEquals(3, m.getDays()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35932);assertEquals(12, m.getHours()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35933);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35934);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rnmrnmle6qeake.R.inc(35935);assertEquals(56, m.getMillis()); 
 }finally{__CLR4_4_1rnmrnmle6qeake.R.flushNeeded();}} 

    

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

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
public class TestStringConverter extends TestCase {static class __CLR4_4_1rp1rp1le6rjdit{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36042,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35893);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35894);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35895);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35896);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1rp1rp1le6rjdit.R.inc(35898);try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35897);
    }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35899);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35900);zone = DateTimeZone.getDefault();
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35901);locale = Locale.getDefault();
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35902);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35903);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35904);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35905);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35906);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35907);DateTimeZone.setDefault(zone);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35908);Locale.setDefault(locale);
        __CLR4_4_1rp1rp1le6rjdit.R.inc(35909);zone = null;
    }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology139() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb3v70rpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb3v70rpi() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35910); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35911);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testToString140() {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdb9iurpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdb9iurpk(){try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35912); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35913);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testGetPartialValues141() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rbx56rpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rbx56rpm() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35914); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35915);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35916);int[] expected = new int[] { 3, 4, 5, 6 }; 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35917);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35918);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testGetDurationMillis_Object1144() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egrf89rpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egrf89rpr() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35919); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35920);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35921);assertEquals(12345, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35922);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35923);assertEquals(12345, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35924);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35925);assertEquals(12000, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35926);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35927);assertEquals(12000, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35928);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35929);assertEquals(-12320, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35930);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35931);assertEquals(-320, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35932);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35933);assertEquals(0, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35934);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35935);assertEquals(0, millis); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35936);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35937);assertEquals(12345, millis); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testGetDurationMillis_Object2145() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16d2t89rqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object2145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16d2t89rqa() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35938); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35939);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35940);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35941);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35942);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35943);StringConverter.INSTANCE.getDurationMillis("PTS"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35944);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35945);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35946);StringConverter.INSTANCE.getDurationMillis("XT0S"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35947);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35948);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35949);StringConverter.INSTANCE.getDurationMillis("PX0S"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35950);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35951);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35952);StringConverter.INSTANCE.getDurationMillis("PT0X"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35953);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35954);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35955);StringConverter.INSTANCE.getDurationMillis("PTXS"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35956);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35957);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35958);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35959);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35960);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35961);StringConverter.INSTANCE.getDurationMillis("PT0-00S"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35962);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35963);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35964);StringConverter.INSTANCE.getDurationMillis("PT-.001S"); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35965);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoPeriod_Object3146() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135i904rr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3146",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135i904rr2() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35966); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35967);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35968);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35969);assertEquals(2, m.getYears()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35970);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35971);assertEquals(3, m.getDays()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35972);assertEquals(12, m.getHours()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35973);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35974);assertEquals(48, m.getSeconds()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35975);assertEquals(34, m.getMillis()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoPeriod_Object8147() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unxfu8rrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object8147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unxfu8rrc() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35976); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35977);MutablePeriod m = new MutablePeriod(); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35978);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35979);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35980);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35981);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35982);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35983);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35984);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35985);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35986);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35987);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35988);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35989);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology4148() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drzea1rrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4148",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drzea1rrq() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35990); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35991);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35992);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35993);StringConverter.INSTANCE.setInto(m, "/P1Y", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35994);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology1149() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),35995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gxffxrrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology1149",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gxffxrrv() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(35995); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35996);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(35997);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35998);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(35999);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology5150() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124p9h0rs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5150",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124p9h0rs0() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36000); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36001);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36002);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36003);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36004);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36005);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology3151() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fw5w2qrs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology3151",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fw5w2qrs6() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36006); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36007);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36008);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(36009);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(36010);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology1152() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1fwq6rsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology1152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1fwq6rsb() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36011); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36012);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36013);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36014);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36015);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36016);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology5153() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3j42qrsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5153",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3j42qrsh() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36017); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36018);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36019);try { 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(36020);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null); 
         __CLR4_4_1rp1rp1le6rjdit.R.inc(36021);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoPeriod_Object5185() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkwx5frsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object5185",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkwx5frsm() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36022); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36023);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36024);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36025);assertEquals(2, m.getYears()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36026);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36027);assertEquals(3, m.getDays()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36028);assertEquals(12, m.getHours()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36029);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36030);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36031);assertEquals(0, m.getMillis()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 


public void testSetIntoPeriod_Object4186() throws Exception {__CLR4_4_1rp1rp1le6rjdit.R.globalSliceStart(getClass().getName(),36032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6llkhrsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rp1rp1le6rjdit.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rp1rp1le6rjdit.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6llkhrsw() throws Exception{try{__CLR4_4_1rp1rp1le6rjdit.R.inc(36032); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36033);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36034);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36035);assertEquals(2, m.getYears()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36036);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36037);assertEquals(3, m.getDays()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36038);assertEquals(12, m.getHours()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36039);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36040);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rp1rp1le6rjdit.R.inc(36041);assertEquals(56, m.getMillis()); 
 }finally{__CLR4_4_1rp1rp1le6rjdit.R.flushNeeded();}} 

    

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

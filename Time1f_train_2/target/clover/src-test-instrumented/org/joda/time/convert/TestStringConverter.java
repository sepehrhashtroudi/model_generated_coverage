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
public class TestStringConverter extends TestCase {static class __CLR4_4_1rhgrhgle6qsfjg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,35754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35620);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35621);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35622);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35623);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1rhgrhgle6qsfjg.R.inc(35625);try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35624);
    }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35626);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35627);zone = DateTimeZone.getDefault();
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35628);locale = Locale.getDefault();
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35629);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35630);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35631);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35632);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35633);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35634);DateTimeZone.setDefault(zone);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35635);Locale.setDefault(locale);
        __CLR4_4_1rhgrhgle6qsfjg.R.inc(35636);zone = null;
    }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology119() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ppmayrhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ppmayrhx() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35637); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35638);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testToString120() {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vypiewrhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vypiewrhz(){try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35639); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35640);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testGetPartialValues121() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u2bqwri1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u2bqwri1() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35641); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35642);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35643);int[] expected = new int[] { 3, 4, 5, 6 }; 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35644);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35645);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testGetDurationMillis_Object1123() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164d54ori6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164d54ori6() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35646); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35647);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35648);assertEquals(12345, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35649);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35650);assertEquals(12345, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35651);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35652);assertEquals(12000, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35653);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35654);assertEquals(12000, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35655);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35656);assertEquals(-12320, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35657);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35658);assertEquals(-320, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35659);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35660);assertEquals(0, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35661);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35662);assertEquals(0, millis); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35663);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35664);assertEquals(12345, millis); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testGetDurationMillis_Object2124() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zbgvcrip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object2124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zbgvcrip() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35665); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35666);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35667);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35668);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35669);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35670);StringConverter.INSTANCE.getDurationMillis("PTS"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35671);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35672);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35673);StringConverter.INSTANCE.getDurationMillis("XT0S"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35674);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35675);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35676);StringConverter.INSTANCE.getDurationMillis("PX0S"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35677);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35678);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35679);StringConverter.INSTANCE.getDurationMillis("PT0X"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35680);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35681);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35682);StringConverter.INSTANCE.getDurationMillis("PTXS"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35683);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35684);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35685);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35686);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35687);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35688);StringConverter.INSTANCE.getDurationMillis("PT0-00S"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35689);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35690);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35691);StringConverter.INSTANCE.getDurationMillis("PT-.001S"); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35692);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoPeriod_Object3125() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhwj3prjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhwj3prjh() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35693); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35694);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35695);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35696);assertEquals(2, m.getYears()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35697);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35698);assertEquals(3, m.getDays()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35699);assertEquals(12, m.getHours()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35700);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35701);assertEquals(48, m.getSeconds()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35702);assertEquals(34, m.getMillis()); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoPeriod_Object8126() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0sc1brjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object8126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0sc1brjr() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35703); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35704);MutablePeriod m = new MutablePeriod(); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35705);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35706);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35707);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35708);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35709);StringConverter.INSTANCE.setInto(m, "PXY", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35710);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35711);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35712);StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35713);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35714);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35715);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35716);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology4127() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m4dodmrk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m4dodmrk5() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35717); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35718);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35719);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35720);StringConverter.INSTANCE.setInto(m, "/P1Y", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35721);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology5128() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qtt7brka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qtt7brka() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35722); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35723);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35724);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35725);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35726);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35727);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology3129() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nroyr1rkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology3129",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nroyr1rkg() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35728); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35729);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35730);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35731);StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35732);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology1130() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19y1lf2rkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology1130",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19y1lf2rkl() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35733); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35734);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35735);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35736);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35737);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35738);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology5131() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xu6mlarkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5131",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xu6mlarkr() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35739); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35740);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35741);try { 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35742);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null); 
         __CLR4_4_1rhgrhgle6qsfjg.R.inc(35743);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 


public void testSetIntoPeriod_Object6165() throws Exception {__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceStart(getClass().getName(),35744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v5yy6rkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rhgrhgle6qsfjg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rhgrhgle6qsfjg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v5yy6rkw() throws Exception{try{__CLR4_4_1rhgrhgle6qsfjg.R.inc(35744); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35745);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35746);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35747);assertEquals(2, m.getYears()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35748);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35749);assertEquals(3, m.getDays()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35750);assertEquals(12, m.getHours()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35751);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35752);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rhgrhgle6qsfjg.R.inc(35753);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1rhgrhgle6qsfjg.R.flushNeeded();}} 

    

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

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
public class TestStringConverter extends TestCase {static class __CLR4_4_1rk5rk5le6rcmvi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,35855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35717);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35718);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35719);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35720);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_1rk5rk5le6rcmvi.R.inc(35722);try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35721);
    }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35723);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35724);zone = DateTimeZone.getDefault();
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35725);locale = Locale.getDefault();
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35726);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35727);Locale.setDefault(Locale.UK);
        
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35728);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35729);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35730);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35731);DateTimeZone.setDefault(zone);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35732);Locale.setDefault(locale);
        __CLR4_4_1rk5rk5le6rcmvi.R.inc(35733);zone = null;
    }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology135() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xb3qcwrkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xb3qcwrkm() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35734); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35735);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testGetPartialValues136() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j86zqcrko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j86zqcrko() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35736); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35737);TimeOfDay tod = new TimeOfDay(); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35738);int[] expected = new int[] { 3, 4, 5, 6 }; 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35739);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35740);assertEquals(true, Arrays.equals(expected, actual)); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testGetDurationMillis_Object1138() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6mglwrkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1138",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6mglwrkt() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35741); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35742);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35743);assertEquals(12345, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35744);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35745);assertEquals(12345, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35746);millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35747);assertEquals(12000, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35748);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35749);assertEquals(12000, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35750);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35751);assertEquals(-12320, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35752);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35753);assertEquals(-320, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35754);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35755);assertEquals(0, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35756);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35757);assertEquals(0, millis); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35758);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35759);assertEquals(12345, millis); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testGetDurationMillis_Object2139() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2xulwrlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object2139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2xulwrlc() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35760); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35761);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35762);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35763);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35764);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35765);StringConverter.INSTANCE.getDurationMillis("PTS"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35766);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35767);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35768);StringConverter.INSTANCE.getDurationMillis("XT0S"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35769);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35770);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35771);StringConverter.INSTANCE.getDurationMillis("PX0S"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35772);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35773);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35774);StringConverter.INSTANCE.getDurationMillis("PT0X"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35775);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35776);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35777);StringConverter.INSTANCE.getDurationMillis("PTXS"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35778);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35779);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35780);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35781);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35782);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35783);StringConverter.INSTANCE.getDurationMillis("PT0-00S"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35784);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35785);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35786);StringConverter.INSTANCE.getDurationMillis("PT-.001S"); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35787);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoPeriod_Object3140() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gchjqqrm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3140",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gchjqqrm4() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35788); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35789);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35790);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35791);assertEquals(2, m.getYears()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35792);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35793);assertEquals(3, m.getDays()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35794);assertEquals(12, m.getHours()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35795);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35796);assertEquals(48, m.getSeconds()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35797);assertEquals(34, m.getMillis()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology4141() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z0d9arme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4141",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z0d9arme() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35798); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35799);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35800);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35801);StringConverter.INSTANCE.setInto(m, "/P1Y", null); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35802);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology1142() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ka2c3ermj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology1142",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ka2c3ermj() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35803); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35804);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35805);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35806);StringConverter.INSTANCE.setInto(m, "", null); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35807);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology5143() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3k9n4rmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3k9n4rmo() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35808); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35809);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35810);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35811);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35812);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35813);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoInterval_Object_Chronology1144() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrt6adrmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology1144",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrt6adrmu() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35814); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35815);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35816);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35817);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35818);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35819);assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoIntervalEx_Object_Chronology5145() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vo545rn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vo545rn0() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35820); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35821);MutableInterval m = new MutableInterval(-1000L, 1000L); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35822);try { 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35823);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null); 
         __CLR4_4_1rk5rk5le6rcmvi.R.inc(35824);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoPeriod_Object6184() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bz88qdrn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6184",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bz88qdrn5() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35825); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35826);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35827);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35828);assertEquals(2, m.getYears()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35829);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35830);assertEquals(3, m.getDays()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35831);assertEquals(12, m.getHours()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35832);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35833);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35834);assertEquals(123, m.getMillis()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoPeriod_Object5186() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abwycyrnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object5186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abwycyrnf() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35835); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35836);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35837);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35838);assertEquals(2, m.getYears()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35839);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35840);assertEquals(3, m.getDays()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35841);assertEquals(12, m.getHours()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35842);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35843);assertEquals(56, m.getSeconds()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35844);assertEquals(0, m.getMillis()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 


public void testSetIntoPeriod_Object4187() throws Exception {__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceStart(getClass().getName(),35845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxlms0rnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rk5rk5le6rcmvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rk5rk5le6rcmvi.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxlms0rnp() throws Exception{try{__CLR4_4_1rk5rk5le6rcmvi.R.inc(35845); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35846);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35847);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35848);assertEquals(2, m.getYears()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35849);assertEquals(4, m.getWeeks()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35850);assertEquals(3, m.getDays()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35851);assertEquals(12, m.getHours()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35852);assertEquals(24, m.getMinutes()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35853);assertEquals(0, m.getSeconds()); 
     __CLR4_4_1rk5rk5le6rcmvi.R.inc(35854);assertEquals(56, m.getMillis()); 
 }finally{__CLR4_4_1rk5rk5le6rcmvi.R.flushNeeded();}} 

    

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

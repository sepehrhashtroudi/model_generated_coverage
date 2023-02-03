/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1o8oo8olc8axebw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,31570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31416);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31417);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31418);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31419);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1o8oo8olc8axebw.R.inc(31421);try{__CLR4_4_1o8oo8olc8axebw.R.inc(31420);
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31422);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31423);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31424);zone = DateTimeZone.getDefault();
        __CLR4_4_1o8oo8olc8axebw.R.inc(31425);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31426);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31427);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1o8oo8olc8axebw.R.inc(31428);DateTimeZone.setDefault(zone);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31429);zone = null;
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */

@SuppressWarnings("deprecation") 
 public void testConstructor_Partial35() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmwqb1o92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Partial35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmwqb1o92() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31430); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31431);YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31432);Partial test = new Partial(ymd); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31433);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31434);assertEquals(3, test.size()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31435);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31436);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31437);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31438);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31439);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31440);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31441);assertEquals(25, test.getValue(2)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31442);assertEquals(25, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31443);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructor2_TypeArray_intArray143() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwzg7co9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor2_TypeArray_intArray143",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwzg7co9g() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31444); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31445);DateTimeFieldType[] types = new DateTimeFieldType[0]; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31446);int[] values = new int[0]; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31447);Partial test = new Partial(types, values); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31448);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31449);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx8_TypeArray_intArray503() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6ti2bo9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray503",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6ti2bo9m() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31450); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31451);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31452);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31453);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31454);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31455);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31456);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31457);types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31458);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31459);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31460);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31461);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31462);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31463);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31464);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31465);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31466);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31467);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31468);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31469);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31470);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31471);assertMessageContains(ex, "must not", "duplicate"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructor_Type_int525() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qr3m72oa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int525",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qr3m72oa8() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31472); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31473);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31474);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31475);assertEquals(1, test.size()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31476);assertEquals(4, test.getValue(0)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31477);assertEquals(4, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31478);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructor_Chrono734() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnggudoaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Chrono734",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnggudoaf() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31479); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31480);Partial test = new Partial((Chronology) null); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31481);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31482);assertEquals(0, test.size()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31483);test = new Partial(GREGORIAN_PARIS); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31484);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31485);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx7_TypeArray_intArray835() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165yinooam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx7_TypeArray_intArray835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165yinooam() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31486); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31487);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31488);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31489);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31490);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31491);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31492);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31493);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31494);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31495);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31496);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31497);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31498);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31499);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31500);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31501);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31502);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31503);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31504);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31505);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31506);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31507);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31508);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31509);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31510);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31511);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31512);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31513);types = new DateTimeFieldType[] { DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31514);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31515);new Partial(types, values); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31516);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31517);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx_Partial889() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x282xvobi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Partial889",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x282xvobi() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31518); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31519);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31520);new Partial((ReadablePartial) null); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31521);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31522);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructor_TypeArray_intArray_Chrono890() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16x52qzobn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_Chrono890",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16x52qzobn() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31523); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31524);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31525);int[] values = new int[] { 2005, 33 }; 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31526);Partial test = new Partial(types, values, GREGORIAN_PARIS); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31527);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31528);assertEquals(2, test.size()); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31529);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31530);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31531);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31532);assertEquals(33, test.getValue(1)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31533);assertEquals(33, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31534);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31535);assertEquals(true, Arrays.equals(test.getFieldTypes(), types)); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31536);assertEquals(true, Arrays.equals(test.getValues(), values)); 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx5_TypeArray_intArray947() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8kc6koc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx5_TypeArray_intArray947",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8kc6koc1() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31537); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31538);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31539);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31540);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31541);assertMessageContains(ex, "same length"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx6_TypeArray_intArray1421() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11q9emhoc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray1421",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11q9emhoc6() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31542); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31543);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31544);new Partial(new DateTimeFieldType[] { null, DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31545);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31546);assertMessageContains(ex, "contain null"); 
     } 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31547);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31548);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), null }, new int[2]); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31549);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31550);assertMessageContains(ex, "contain null"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx3_TypeArray_intArray1702() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulmj9cocf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray1702",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulmj9cocf() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31551); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31552);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31553);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31554);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31555);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx_Type_int_Chrono1712() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bc2lpeock();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Type_int_Chrono1712",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bc2lpeock() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31556); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31557);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31558);new Partial(null, 4, ISO_UTC); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31559);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31560);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 


public void testConstructorEx1_TypeArray_intArray1724() throws Throwable {__CLR4_4_1o8oo8olc8axebw.R.globalSliceStart(getClass().getName(),31561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4zpkyocp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1o8oo8olc8axebw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1o8oo8olc8axebw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_TypeArray_intArray1724",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4zpkyocp() throws Throwable{try{__CLR4_4_1o8oo8olc8axebw.R.inc(31561); 
     __CLR4_4_1o8oo8olc8axebw.R.inc(31562);try { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31563);new Partial((DateTimeFieldType[]) null, new int[] { 1 }); 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31564);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1o8oo8olc8axebw.R.inc(31565);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31566);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31567);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1o8oo8olc8axebw.R.inc(31568);
        __CLR4_4_1o8oo8olc8axebw.R.inc(31569);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1o8oo8olc8axebw.R.flushNeeded();}}

}

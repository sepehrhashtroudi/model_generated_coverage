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
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1n9rn9rle6rjcxf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,30264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30159);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30160);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30161);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30162);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1n9rn9rle6rjcxf.R.inc(30164);try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30163);
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30165);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30166);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30167);zone = DateTimeZone.getDefault();
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30168);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30169);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30170);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30171);DateTimeZone.setDefault(zone);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30172);zone = null;
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */

public void testConstructor_Type_int454() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9p21zna5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int454",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9p21zna5() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30173); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30174);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30175);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30176);assertEquals(1, test.size()); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30177);assertEquals(4, test.getValue(0)); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30178);assertEquals(4, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30179);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructor_Chrono649() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q1u88nac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Chrono649",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q1u88nac() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30180); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30181);Partial test = new Partial((Chronology) null); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30182);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30183);assertEquals(0, test.size()); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30184);test = new Partial(GREGORIAN_PARIS); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30185);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30186);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructorEx3_TypeArray_intArray651() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152k3x4naj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray651",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152k3x4naj() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30187); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30188);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30189);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30190);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30191);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructorEx5_TypeArray_intArray652() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16d5705nao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx5_TypeArray_intArray652",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16d5705nao() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30192); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30193);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30194);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30195);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30196);assertMessageContains(ex, "same length"); 
     } 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructorEx6_TypeArray_intArray653() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4m9u5nat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray653",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4m9u5nat() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30197); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30198);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30199);new Partial(new DateTimeFieldType[] { null, DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30200);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30201);assertMessageContains(ex, "contain null"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30202);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30203);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), null }, new int[2]); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30204);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30205);assertMessageContains(ex, "contain null"); 
     } 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructorEx8_TypeArray_intArray654() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1su16r4nb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray654",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1su16r4nb2() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30206); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30207);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30208);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30209);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30210);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30211);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30212);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30213);types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30214);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30215);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30216);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30217);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30218);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30219);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30220);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30221);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30222);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30223);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30224);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30225);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30226);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30227);assertMessageContains(ex, "must not", "duplicate"); 
     } 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 


public void testConstructorEx7_TypeArray_intArray655() throws Throwable {__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceStart(getClass().getName(),30228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115qci8nbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n9rn9rle6rjcxf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n9rn9rle6rjcxf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx7_TypeArray_intArray655",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115qci8nbo() throws Throwable{try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30228); 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30229);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30230);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30231);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30232);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30233);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30234);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30235);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30236);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30237);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30238);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30239);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30240);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30241);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30242);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30243);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30244);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30245);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30246);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30247);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30248);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30249);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30250);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30251);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30252);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30253);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30254);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30255);types = new DateTimeFieldType[] { DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n9rn9rle6rjcxf.R.inc(30256);try { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30257);new Partial(types, values); 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30258);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n9rn9rle6rjcxf.R.inc(30259);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
 }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}} 

    

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
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30260);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30261);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1n9rn9rle6rjcxf.R.inc(30262);
        __CLR4_4_1n9rn9rle6rjcxf.R.inc(30263);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1n9rn9rle6rjcxf.R.flushNeeded();}}

}

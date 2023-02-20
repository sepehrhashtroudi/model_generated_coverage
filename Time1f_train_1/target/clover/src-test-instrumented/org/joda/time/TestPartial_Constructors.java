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
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1n8en8ele6qe9zt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,30235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30110);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30111);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30112);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30113);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1n8en8ele6qe9zt.R.inc(30115);try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30114);
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30116);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30117);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30118);zone = DateTimeZone.getDefault();
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30119);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30120);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30121);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30122);DateTimeZone.setDefault(zone);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30123);zone = null;
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */

public void testConstructor_TypeArray_intArray_Chrono446() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1el72osn8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_Chrono446",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1el72osn8s() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30124); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30125);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30126);int[] values = new int[] { 2005, 33 }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30127);Partial test = new Partial(types, values, GREGORIAN_PARIS); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30128);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30129);assertEquals(2, test.size()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30130);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30131);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30132);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30133);assertEquals(33, test.getValue(1)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30134);assertEquals(33, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30135);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30136);assertEquals(true, Arrays.equals(test.getFieldTypes(), types)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30137);assertEquals(true, Arrays.equals(test.getValues(), values)); 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructor_Chrono632() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nab84in96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Chrono632",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nab84in96() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30138); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30139);Partial test = new Partial((Chronology) null); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30140);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30141);assertEquals(0, test.size()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30142);test = new Partial(GREGORIAN_PARIS); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30143);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30144);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx_Type_int_Chrono634() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyidain9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Type_int_Chrono634",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyidain9d() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30145); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30146);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30147);new Partial(null, 4, ISO_UTC); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30148);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30149);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx1_TypeArray_intArray636() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbf0stn9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_TypeArray_intArray636",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbf0stn9i() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30150); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30151);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30152);new Partial((DateTimeFieldType[]) null, new int[] { 1 }); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30153);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30154);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx3_TypeArray_intArray637() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0txpsn9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray637",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0txpsn9n() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30155); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30156);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30157);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30158);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30159);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx5_TypeArray_intArray638() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oq8umrn9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx5_TypeArray_intArray638",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oq8umrn9s() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30160); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30161);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30162);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30163);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30164);assertMessageContains(ex, "same length"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructor2_TypeArray_intArray639() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o801non9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor2_TypeArray_intArray639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o801non9x() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30165); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30166);DateTimeFieldType[] types = new DateTimeFieldType[0]; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30167);int[] values = new int[0]; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30168);Partial test = new Partial(types, values); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30169);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30170);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx6_TypeArray_intArray640() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19c8j2tna3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19c8j2tna3() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30171); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30172);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30173);new Partial(new DateTimeFieldType[] { null, DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30174);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30175);assertMessageContains(ex, "contain null"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30176);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30177);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), null }, new int[2]); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30178);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30179);assertMessageContains(ex, "contain null"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx7_TypeArray_intArray641() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5ixrhnac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx7_TypeArray_intArray641",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5ixrhnac() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30180); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30181);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30182);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30183);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30184);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30185);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30186);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30187);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30188);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30189);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30190);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30191);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30192);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30193);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30194);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30195);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30196);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30197);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30198);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30199);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30200);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30201);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30202);types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30203);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30204);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30205);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30206);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30207);types = new DateTimeFieldType[] { DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30208);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30209);new Partial(types, values); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30210);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30211);assertMessageContains(ex, "must be in order", "largest-smallest"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


public void testConstructorEx_Partial642() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9dv2anb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Partial642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9dv2anb8() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30212); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30213);try { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30214);new Partial((ReadablePartial) null); 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30215);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n8en8ele6qe9zt.R.inc(30216);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_Partial643() throws Throwable {__CLR4_4_1n8en8ele6qe9zt.R.globalSliceStart(getClass().getName(),30217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ld1e6nbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n8en8ele6qe9zt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n8en8ele6qe9zt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Partial643",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ld1e6nbd() throws Throwable{try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30217); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30218);YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30219);Partial test = new Partial(ymd); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30220);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30221);assertEquals(3, test.size()); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30222);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30223);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30224);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30225);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30226);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30227);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30228);assertEquals(25, test.getValue(2)); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30229);assertEquals(25, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1n8en8ele6qe9zt.R.inc(30230);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
 }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}} 

    

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
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30231);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30232);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1n8en8ele6qe9zt.R.inc(30233);
        __CLR4_4_1n8en8ele6qe9zt.R.inc(30234);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1n8en8ele6qe9zt.R.flushNeeded();}}

}

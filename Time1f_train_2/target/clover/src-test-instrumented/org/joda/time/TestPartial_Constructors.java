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
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1n6an6ale6qsf7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,30144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30034);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30035);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30036);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30037);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1n6an6ale6qsf7j.R.inc(30039);try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30038);
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30040);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30041);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30042);zone = DateTimeZone.getDefault();
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30043);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30044);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30045);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30046);DateTimeZone.setDefault(zone);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30047);zone = null;
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */

public void testConstructor_TypeArray_intArray_Chrono418() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yqcm9n6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_Chrono418",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yqcm9n6o() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30048); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30049);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30050);int[] values = new int[] { 2005, 33 }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30051);Partial test = new Partial(types, values, GREGORIAN_PARIS); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30052);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30053);assertEquals(2, test.size()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30054);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30055);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30056);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30057);assertEquals(33, test.getValue(1)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30058);assertEquals(33, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30059);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30060);assertEquals(true, Arrays.equals(test.getFieldTypes(), types)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30061);assertEquals(true, Arrays.equals(test.getValues(), values)); 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructor_Type_int419() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c639oin72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int419",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c639oin72() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30062); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30063);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30064);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30065);assertEquals(1, test.size()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30066);assertEquals(4, test.getValue(0)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30067);assertEquals(4, test.get(DateTimeFieldType.dayOfYear())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30068);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx_Type_int_Chrono622() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9cgtzn79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Type_int_Chrono622",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9cgtzn79() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30069); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30070);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30071);new Partial(null, 4, ISO_UTC); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30072);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30073);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx1_TypeArray_intArray623() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5fs45n7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_TypeArray_intArray623",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5fs45n7e() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30074); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30075);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30076);new Partial((DateTimeFieldType[]) null, new int[] { 1 }); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30077);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30078);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx3_TypeArray_intArray624() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg0v76n7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg0v76n7j() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30079); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30080);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30081);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }, null); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30082);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30083);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructor2_TypeArray_intArray625() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ihuq1rn7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor2_TypeArray_intArray625",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ihuq1rn7o() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30084); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30085);DateTimeFieldType[] types = new DateTimeFieldType[0]; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30086);int[] values = new int[0]; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30087);Partial test = new Partial(types, values); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30088);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30089);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx6_TypeArray_intArray626() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr5ik3n7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr5ik3n7u() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30090); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30091);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30092);new Partial(new DateTimeFieldType[] { null, DateTimeFieldType.dayOfYear() }, new int[2]); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30093);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30094);assertMessageContains(ex, "contain null"); 
     } 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30095);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30096);new Partial(new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), null }, new int[2]); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30097);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30098);assertMessageContains(ex, "contain null"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx8_TypeArray_intArray627() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgkfh2n83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgkfh2n83() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30099); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30100);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30101);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year() }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30102);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30103);new Partial(types, values); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30104);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30105);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30106);types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30107);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30108);new Partial(types, values); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30109);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30110);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30111);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30112);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30113);new Partial(types, values); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30114);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30115);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30116);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30117);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30118);new Partial(types, values); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30119);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30120);assertMessageContains(ex, "must not", "duplicate"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


public void testConstructorEx_Partial628() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_125ztfen8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Partial628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_125ztfen8p() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30121); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30122);try { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30123);new Partial((ReadablePartial) null); 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30124);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1n6an6ale6qsf7j.R.inc(30125);assertMessageContains(ex, "must not be null"); 
     } 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testConstructor_Partial629() throws Throwable {__CLR4_4_1n6an6ale6qsf7j.R.globalSliceStart(getClass().getName(),30126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi108qn8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n6an6ale6qsf7j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n6an6ale6qsf7j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Partial629",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi108qn8u() throws Throwable{try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30126); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30127);YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30128);Partial test = new Partial(ymd); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30129);assertEquals(GREGORIAN_UTC, test.getChronology()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30130);assertEquals(3, test.size()); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30131);assertEquals(2005, test.getValue(0)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30132);assertEquals(2005, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30133);assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30134);assertEquals(6, test.getValue(1)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30135);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30136);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30137);assertEquals(25, test.getValue(2)); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30138);assertEquals(25, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1n6an6ale6qsf7j.R.inc(30139);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
 }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}} 

    

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
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30140);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30141);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1n6an6ale6qsf7j.R.inc(30142);
        __CLR4_4_1n6an6ale6qsf7j.R.inc(30143);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1n6an6ale6qsf7j.R.flushNeeded();}}

}

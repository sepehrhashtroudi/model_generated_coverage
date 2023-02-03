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
package org.joda.time.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1vopvoplc8axf5q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,41468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1vopvoplc8axf5q.R.inc(41065);
        __CLR4_4_1vopvoplc8axf5q.R.inc(41066);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1vopvoplc8axf5q.R.inc(41067);
        __CLR4_4_1vopvoplc8axf5q.R.inc(41068);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1vopvoplc8axf5q.R.inc(41070);try{__CLR4_4_1vopvoplc8axf5q.R.inc(41069);
    }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1vopvoplc8axf5q.R.inc(41071);
    }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1vopvoplc8axf5q.R.inc(41072);
    }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields_weekBased_YWD78() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpx38fvox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD78",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpx38fvox(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41073); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41074);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41075);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41076);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41077);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41078);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41079);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41080);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41081);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41082);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41083);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41084);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41085);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41086);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41087);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41088);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41089);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41090);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41091);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_datetime_YH85() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179a8rcvpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH85",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179a8rcvpg(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41092); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41093);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41094);int[] values = new int[] { 2005, 12 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41095);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41096);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41097);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41098);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41099);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41100);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41101);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41102);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41103);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41104);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41105);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41106);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41107);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41108);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41109);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41110);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_calBased_YD136() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143qvz9vpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143qvz9vpz(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41111); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41112);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41113);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41114);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41115);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41116);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41117);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41118);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41119);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41120);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41121);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41122);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41123);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41124);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41125);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41126);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41127);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41128);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41129);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_WD145() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12irpjxvqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD145",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12irpjxvqi(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41130); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41131);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41132);int[] values = new int[] { 8, 5 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41133);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41134);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41135);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41136);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41137);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41138);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41139);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41140);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41141);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41142);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41143);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41144);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41145);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41146);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41147);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41148);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_time_Mm245() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u55wcpvr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm245",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u55wcpvr1(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41149); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41150);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41151);int[] values = new int[] { 20, 40 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41152);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41153);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41154);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41155);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41156);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41157);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41158);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41159);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41160);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41161);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41162);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41163);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41164);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41165);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41166);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41167);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_calBased_YMD_unmodifiable319() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1914m4rvrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable319",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1914m4rvrk(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41168); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41169);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41170);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41171);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41172);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41173);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41174);assertEquals(3, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41175);types = Arrays.asList(fields); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41176);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41177);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41178);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_D333() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stqdnfvrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D333",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stqdnfvrv(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41179); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41180);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41181);int[] values = new int[] { 5 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41182);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41183);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41184);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41185);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41186);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41187);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41188);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41189);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41190);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41191);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41192);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41193);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41194);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41195);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41196);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41197);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_time_HMm344() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzw1qtvse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzw1qtvse(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41198); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41199);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41200);int[] values = new int[] { 10, 20, 40 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41201);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41202);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41203);assertEquals("10:20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41204);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41205);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41206);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41207);assertEquals("1020-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41208);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41209);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41210);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41211);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41212);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41213);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41214);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41215);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41216);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_datetime_DH349() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112nw3qvsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112nw3qvsx(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41217); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41218);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41219);int[] values = new int[] { 25, 12 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41220);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41221);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41222);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41223);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41224);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41225);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41226);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41227);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41228);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41229);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41230);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41231);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41232);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41233);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41234);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41235);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_ordinalBased_D457() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162fv6vvtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162fv6vvtg(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41236); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41237);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41238);int[] values = new int[] { 177 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41239);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41240);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41241);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41242);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41243);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41244);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41245);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41246);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41247);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41248);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41249);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41250);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41251);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41252);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41253);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41254);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_calBased_M723() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kr72gzvtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M723",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kr72gzvtz(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41255); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41256);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41257);int[] values = new int[] { 6 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41258);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41259);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41260);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41261);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41262);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41263);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41264);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41265);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41266);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41267);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41268);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41269);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41270);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41271);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41272);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41273);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_time_HSm953() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14si1j3vui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm953",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14si1j3vui(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41274); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41275);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41276);int[] values = new int[] { 10, 30, 40 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41277);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41278);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41279);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41280);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41281);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41282);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41283);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41284);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41285);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41286);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41287);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41289);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41290);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41291);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41292);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_ordinalBased_YD955() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1at6zdvv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1at6zdvv1(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41293); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41294);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41295);int[] values = new int[] { 2005, 177 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41296);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41297);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41298);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41299);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41300);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41301);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41302);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41303);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41304);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41305);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41306);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41307);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41308);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41309);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41310);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41311);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_YD960() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pog54wvvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pog54wvvk(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41312); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41313);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41314);int[] values = new int[] { 2005, 5 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41315);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41316);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41317);assertEquals("2005-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41318);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41319);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41320);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41321);assertEquals("2005W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41322);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41323);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41324);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41325);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41326);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41327);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41328);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41329);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41330);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_null999() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ufnavw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null999",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ufnavw3(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41331); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41332);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41333);ISODateTimeFormat.forFields((Collection) null, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41334);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_YW1200() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183fmhhvw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW1200",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183fmhhvw7(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41335); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41336);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41337);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41338);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41339);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41340);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41341);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41342);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41343);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41344);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41345);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41346);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41347);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41348);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41349);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41350);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41351);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41352);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41353);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_calBased_YM1236() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6me7evwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM1236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6me7evwq(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41354); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41355);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41356);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41357);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41358);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41359);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41360);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41361);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41362);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41363);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41364);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41365);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41366);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41367);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41368);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41369);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41370);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41371);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41372);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_W1325() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbfma4vx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W1325",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbfma4vx9(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41373); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41374);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41375);int[] values = new int[] { 8 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41376);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41377);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41378);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41379);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41380);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41381);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41382);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41383);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41384);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41385);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41386);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41387);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41388);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41389);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41390);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41391);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_calBased_MD1499() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aq3xikvxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD1499",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aq3xikvxs(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41392); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41393);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41394);int[] values = new int[] { 6, 25 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41395);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41396);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41397);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41398);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41399);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41400);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41401);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41402);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41403);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41404);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41405);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41406);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41407);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41408);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41409);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41410);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_time_MS1521() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqh1pvyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS1521",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqh1pvyb(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41411); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41412);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41413);int[] values = new int[] { 20, 30 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41414);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41415);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41416);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41417);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41418);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41419);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41420);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41421);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41422);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41423);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41424);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41425);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41426);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41427);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41428);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41429);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_weekBased_Y1573() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115x88hvyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y1573",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115x88hvyu(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41430); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41431);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41432);int[] values = new int[] { 2005 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41433);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41434);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41435);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41436);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41437);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41438);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41439);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41440);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41441);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41442);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41443);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41444);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41445);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41446);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41447);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41448);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 


public void testForFields_datetime_DM1764() {__CLR4_4_1vopvoplc8axf5q.R.globalSliceStart(getClass().getName(),41449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4i4fdvzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vopvoplc8axf5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vopvoplc8axf5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM1764",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4i4fdvzd(){try{__CLR4_4_1vopvoplc8axf5q.R.inc(41449); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41450);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.minuteOfHour() }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41451);int[] values = new int[] { 25, 20 }; 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41452);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41453);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41454);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41455);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41456);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41457);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41458);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41459);assertEquals(0, types.size()); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41460);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41461);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41462);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41463);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41464);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1vopvoplc8axf5q.R.inc(41465);try { 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41466);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1vopvoplc8axf5q.R.inc(41467);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1vopvoplc8axf5q.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

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

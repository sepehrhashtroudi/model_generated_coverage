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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1mhwmhwle6ndq6k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,29308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29156);
        __CLR4_4_1mhwmhwle6ndq6k.R.inc(29157);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29158);
        __CLR4_4_1mhwmhwle6ndq6k.R.inc(29159);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1mhwmhwle6ndq6k.R.inc(29161);try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29160);
    }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29162);
    }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29163);
    }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForFields_datetime_YH344() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icdcd2mi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH344",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icdcd2mi4(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29164); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29165);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29166);int[] values = new int[] { 2005, 12 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29167);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29168);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29169);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29170);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29171);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29172);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29173);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29174);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29175);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29176);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29177);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29178);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29179);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29180);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29181);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29182);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_calBased_YMD_unmodifiable345() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e5lemcmin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable345",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e5lemcmin(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29183); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29184);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29185);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29186);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29187);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29188);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29189);assertEquals(3, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29190);types = Arrays.asList(fields); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29191);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29192);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29193);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_calBased_YD346() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjwesmmiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD346",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjwesmmiy(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29194); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29195);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29196);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29197);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29198);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29199);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29200);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29201);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29202);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29203);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29204);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29205);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29206);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29207);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29208);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29209);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29210);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29211);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29212);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_calBased_YM347() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fy4hqmjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM347",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fy4hqmjh(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29213); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29214);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29215);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29216);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29217);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29218);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29219);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29220);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29221);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29222);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29223);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29224);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29225);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29226);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29227);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29228);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29229);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29230);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29231);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_weekBased_YWD348() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txod5zmk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD348",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txod5zmk0(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29232); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29233);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29234);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29235);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29236);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29237);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29238);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29239);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29240);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29241);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29242);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29243);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29244);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29245);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29246);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29247);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29248);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29249);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29250);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_time_MS349() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13dldjemkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS349",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13dldjemkj(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29251); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29252);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29253);int[] values = new int[] { 20, 30 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29254);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29255);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29256);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29257);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29258);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29259);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29260);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29261);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29262);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29263);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29264);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29265);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29266);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29267);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29268);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29269);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_time_HSm350() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17umac6ml2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17umac6ml2(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29270); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29271);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29272);int[] values = new int[] { 10, 30, 40 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29273);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29274);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29275);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29276);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29277);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29278);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29279);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29280);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29281);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29282);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29283);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29284);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29285);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29286);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29287);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29288);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
public void testForFields_time_Mm351() {__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceStart(getClass().getName(),29289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fk5ju5mll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mhwmhwle6ndq6k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mhwmhwle6ndq6k.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm351",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fk5ju5mll(){try{__CLR4_4_1mhwmhwle6ndq6k.R.inc(29289); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29290);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29291);int[] values = new int[] { 20, 40 }; 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29292);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29293);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29294);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29295);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29296);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29297);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29298);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29299);assertEquals(0, types.size()); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29300);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29301);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29302);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29303);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29304);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1mhwmhwle6ndq6k.R.inc(29305);try { 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29306);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1mhwmhwle6ndq6k.R.inc(29307);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1mhwmhwle6ndq6k.R.flushNeeded();}}
    

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

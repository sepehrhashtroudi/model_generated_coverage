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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1m3zm3zle6nl8qq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28655);
        __CLR4_4_1m3zm3zle6nl8qq.R.inc(28656);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28657);
        __CLR4_4_1m3zm3zle6nl8qq.R.inc(28658);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1m3zm3zle6nl8qq.R.inc(28660);try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28659);
    }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28661);
    }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28662);
    }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForFields_weekBased_Y366() {__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceStart(getClass().getName(),28663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twznsgm47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3zm3zle6nl8qq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twznsgm47(){try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28663); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28664);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28665);int[] values = new int[] { 2005 }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28666);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28667);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28668);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28669);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28670);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28671);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28672);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28673);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28674);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28675);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28676);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28677);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28678);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28679);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28680);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28681);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}
public void testForFields_calBased_YD367() {__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceStart(getClass().getName(),28682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7i4p1m4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3zm3zle6nl8qq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7i4p1m4q(){try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28682); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28683);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28684);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28685);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28686);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28687);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28688);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28689);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28690);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28691);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28692);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28693);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28694);try { 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28695);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28696);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28697);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28698);try { 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28699);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28700);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}
public void testForFields_ordinalBased_D368() {__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceStart(getClass().getName(),28701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tuyml6m59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3zm3zle6nl8qq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tuyml6m59(){try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28701); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28702);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28703);int[] values = new int[] { 177 }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28704);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28705);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28706);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28707);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28708);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28709);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28710);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28711);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28712);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28713);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28714);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28715);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28716);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28717);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28718);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28719);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}
public void testForFields_weekBased_YD369() {__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceStart(getClass().getName(),28720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdnp5vm5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3zm3zle6nl8qq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdnp5vm5s(){try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28720); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28721);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28722);int[] values = new int[] { 2005, 5 }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28723);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28724);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28725);assertEquals("2005-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28726);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28727);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28728);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28729);assertEquals("2005W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28730);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28731);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28732);try { 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28733);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28734);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28735);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28736);try { 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28737);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1m3zm3zle6nl8qq.R.inc(28738);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}
public void testForFields_weekBased_WD370() {__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceStart(getClass().getName(),28739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14j5ivm6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m3zm3zle6nl8qq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m3zm3zle6nl8qq.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14j5ivm6b(){try{__CLR4_4_1m3zm3zle6nl8qq.R.inc(28739); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28740);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28741);int[] values = new int[] { 8, 5 }; 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28742);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28743);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28744);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28745);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28746);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28747);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28748);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28749);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28750);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28751);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28752);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28753);assertEquals(0, types.size()); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28754);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28755);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28756);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1m3zm3zle6nl8qq.R.inc(28757);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1m3zm3zle6nl8qq.R.flushNeeded();}}
    

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

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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1txytxyle6qeau5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,39133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1txytxyle6qeau5.R.inc(38806);
        __CLR4_4_1txytxyle6qeau5.R.inc(38807);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1txytxyle6qeau5.R.inc(38808);
        __CLR4_4_1txytxyle6qeau5.R.inc(38809);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1txytxyle6qeau5.R.inc(38811);try{__CLR4_4_1txytxyle6qeau5.R.inc(38810);
    }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1txytxyle6qeau5.R.inc(38812);
    }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1txytxyle6qeau5.R.inc(38813);
    }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields_weekBased_YW196() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kue0t4ty6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW196",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kue0t4ty6(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38814); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38815);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38816);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38817);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38818);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38819);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38820);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38821);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38822);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38823);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38824);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38825);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38826);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38827);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38828);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38829);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38830);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38831);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38832);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_datetime_YH530() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn6t2jtyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH530",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn6t2jtyp(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38833); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38834);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38835);int[] values = new int[] { 2005, 12 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38836);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38837);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38838);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38839);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38840);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38841);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38842);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38843);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38844);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38845);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(38846);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(38847);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(38848);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38849);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(38850);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(38851);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_null838() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hsywitz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null838",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hsywitz8(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38852); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38853);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(38854);ISODateTimeFormat.forFields((Collection) null, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(38855);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_calBased_YMD_unmodifiable839() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8j32qtzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable839",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8j32qtzc(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38856); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38857);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38858);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38859);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38860);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38861);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38862);assertEquals(3, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38863);types = Arrays.asList(fields); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38864);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38865);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38866);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_ordinalBased_D840() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3ahmttzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D840",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3ahmttzn(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38867); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38868);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38869);int[] values = new int[] { 177 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38870);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38871);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38872);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38873);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38874);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38875);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38876);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38877);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38878);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38879);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38880);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38881);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38882);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38883);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38884);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38885);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_weekBased_YWD841() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hkuoru06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD841",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hkuoru06(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38886); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38887);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38888);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38889);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38890);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38891);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38892);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38893);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38894);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38895);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38896);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38897);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38898);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38899);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38900);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38901);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38902);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38903);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38904);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_calBased_YD842() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vn3bbu0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD842",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vn3bbu0p(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38905); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38906);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38907);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38908);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38909);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38910);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38911);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38912);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38913);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38914);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38915);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38916);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38917);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(38918);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(38919);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(38920);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38921);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(38922);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(38923);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_weekBased_D843() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19s4xfbu18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19s4xfbu18(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38924); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38925);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38926);int[] values = new int[] { 5 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38927);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38928);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38929);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38930);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38931);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38932);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38933);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38934);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38935);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38936);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38937);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38938);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38939);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38940);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38941);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38942);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_weekBased_Y844() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc4is5u1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y844",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc4is5u1r(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38943); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38944);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38945);int[] values = new int[] { 2005 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38946);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38947);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38948);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38949);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38950);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38951);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38952);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38953);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38954);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38955);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38956);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38957);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38958);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38959);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38960);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38961);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_calBased_YM845() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bqb9enu2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM845",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bqb9enu2a(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38962); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38963);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38964);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38965);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38966);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38967);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38968);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38969);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38970);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38971);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38972);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38973);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38974);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38975);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38976);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38977);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38978);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38979);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38980);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_calBased_MD846() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),38981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1af7hxdu2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD846",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1af7hxdu2t(){try{__CLR4_4_1txytxyle6qeau5.R.inc(38981); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38982);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38983);int[] values = new int[] { 6, 25 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(38984);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38985);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38986);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38987);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38988);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38989);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38990);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38991);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38992);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38993);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38994);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38995);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38996);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38997);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38998);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(38999);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_ordinalBased_YD847() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldth2vu3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldth2vu3c(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39000); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39001);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39002);int[] values = new int[] { 2005, 177 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39003);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39004);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39005);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39006);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39007);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39008);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39009);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39010);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39011);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39012);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39013);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39014);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39015);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39016);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39017);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39018);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_weekBased_YD848() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1siy1u3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD848",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1siy1u3v(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39019); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39020);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39021);int[] values = new int[] { 2005, 5 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39022);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39023);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39024);assertEquals("2005-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39025);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39026);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39027);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39028);assertEquals("2005W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39029);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39030);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39031);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39032);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39033);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(39034);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39035);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39036);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39037);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_weekBased_WD849() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ksqo8u4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD849",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ksqo8u4e(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39038); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39039);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39040);int[] values = new int[] { 8, 5 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39041);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39042);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39043);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39044);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39045);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39046);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39047);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39048);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39049);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39050);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39051);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39052);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39053);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39054);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39055);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39056);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_datetime_DM850() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4ov98u4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM850",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4ov98u4x(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39057); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39058);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.minuteOfHour() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39059);int[] values = new int[] { 25, 20 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39060);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39061);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39062);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39063);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39064);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39065);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39066);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39067);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39068);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39069);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39070);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39071);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(39072);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39073);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39074);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39075);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_time_Mm851() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8f05ku5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm851",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8f05ku5g(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39076); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39077);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39078);int[] values = new int[] { 20, 40 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39079);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39080);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39081);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39082);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39083);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39084);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39085);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39086);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39087);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39088);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39089);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39090);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(39091);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39092);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39093);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39094);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_time_HSm852() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ocrlpu5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm852",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ocrlpu5z(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39095); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39096);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39097);int[] values = new int[] { 10, 30, 40 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39098);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39099);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39100);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39101);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39102);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39103);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39104);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39105);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39106);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39107);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39108);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39109);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txytxyle6qeau5.R.inc(39110);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39111);try { 
         __CLR4_4_1txytxyle6qeau5.R.inc(39112);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txytxyle6qeau5.R.inc(39113);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 


public void testForFields_time_MS853() {__CLR4_4_1txytxyle6qeau5.R.globalSliceStart(getClass().getName(),39114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tzq24u6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txytxyle6qeau5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txytxyle6qeau5.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS853",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tzq24u6i(){try{__CLR4_4_1txytxyle6qeau5.R.inc(39114); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39115);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39116);int[] values = new int[] { 20, 30 }; 
     __CLR4_4_1txytxyle6qeau5.R.inc(39117);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39118);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39119);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39120);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39121);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39122);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39123);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39124);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39125);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39126);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39127);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39128);assertEquals(0, types.size()); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39129);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39130);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39131);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1txytxyle6qeau5.R.inc(39132);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txytxyle6qeau5.R.flushNeeded();}} 

    

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

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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1txgtxgle6rjds0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,39077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1txgtxgle6rjds0.R.inc(38788);
        __CLR4_4_1txgtxgle6rjds0.R.inc(38789);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1txgtxgle6rjds0.R.inc(38790);
        __CLR4_4_1txgtxgle6rjds0.R.inc(38791);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1txgtxgle6rjds0.R.inc(38793);try{__CLR4_4_1txgtxgle6rjds0.R.inc(38792);
    }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1txgtxgle6rjds0.R.inc(38794);
    }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1txgtxgle6rjds0.R.inc(38795);
    }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields_weekBased_YW195() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3dzlltxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW195",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3dzlltxo(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38796); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38797);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38798);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38799);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38800);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38801);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38802);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38803);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38804);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38805);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38806);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38807);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38808);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38809);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38810);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38811);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38812);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38813);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38814);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_time_HMm411() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0f756ty7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm411",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0f756ty7(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38815); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38816);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38817);int[] values = new int[] { 10, 20, 40 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38818);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38819);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38820);assertEquals("10:20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38821);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38822);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38823);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38824);assertEquals("1020-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38825);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38826);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38827);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38828);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38829);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38830);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38831);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38832);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38833);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_null853() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc71qxtyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null853",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc71qxtyq(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38834); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38835);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38836);ISODateTimeFormat.forFields((Collection) null, true, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(38837);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_calBased_YMD_unmodifiable854() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty6w1ztyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable854",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty6w1ztyu(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38838); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38839);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38840);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38841);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38842);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38843);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38844);assertEquals(3, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38845);types = Arrays.asList(fields); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38846);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38847);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38848);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_ordinalBased_D855() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yytuftz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yytuftz5(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38849); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38850);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38851);int[] values = new int[] { 177 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38852);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38853);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38854);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38855);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38856);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38857);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38858);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38859);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38860);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38861);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38862);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38863);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38864);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38865);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38866);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38867);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_weekBased_YWD856() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sju65ztzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD856",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sju65ztzo(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38868); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38869);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38870);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38871);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38872);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38873);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38874);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38875);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38876);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38877);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38878);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38879);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38880);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38881);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38882);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38883);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38884);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38885);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38886);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_weekBased_D857() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxpua4u07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D857",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxpua4u07(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38887); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38888);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38889);int[] values = new int[] { 5 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38890);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38891);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38892);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38893);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38894);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38895);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38896);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38897);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38898);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38899);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38900);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38901);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38902);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38903);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38904);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38905);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_weekBased_Y858() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z4rhku0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y858",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z4rhku0q(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38906); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38907);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38908);int[] values = new int[] { 2005 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38909);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38910);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38911);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38912);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38913);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38914);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38915);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38916);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38917);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38918);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38919);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38920);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38921);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38922);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38923);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38924);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_calBased_YM859() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uzjiasu19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uzjiasu19(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38925); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38926);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38927);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38928);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38929);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38930);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38931);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38932);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38933);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38934);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38935);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38936);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38937);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38938);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38939);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38940);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38941);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38942);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38943);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_calBased_M860() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f79whju1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M860",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f79whju1s(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38944); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38945);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38946);int[] values = new int[] { 6 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38947);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38948);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38949);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38950);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38951);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38952);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38953);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38954);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38955);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38956);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38957);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38958);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38959);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38960);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38961);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38962);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_datetime_DH861() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nu4ijlu2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH861",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nu4ijlu2b(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38963); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38964);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38965);int[] values = new int[] { 25, 12 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38966);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38967);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38968);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38969);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38970);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38971);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38972);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38973);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38974);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38975);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38976);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38977);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38978);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38979);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38980);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38981);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_ordinalBased_YD862() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),38982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lswi1uu2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD862",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lswi1uu2u(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(38982); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38983);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38984);int[] values = new int[] { 2005, 177 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38985);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38986);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38987);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38988);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38989);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38990);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38991);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38992);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38993);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38994);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38995);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38996);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38997);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38998);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(38999);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39000);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_weekBased_W863() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),39001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mzbgu3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W863",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mzbgu3d(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(39001); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39002);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39003);int[] values = new int[] { 8 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39004);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39005);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39006);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39007);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39008);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39009);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39010);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39011);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39012);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39013);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39014);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39015);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39016);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39017);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39018);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39019);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_datetime_DM864() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),39020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6kf0hu3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM864",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6kf0hu3w(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(39020); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39021);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.minuteOfHour() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39022);int[] values = new int[] { 25, 20 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39023);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39024);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39025);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39026);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39027);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39028);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39029);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39030);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39031);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39032);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39033);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39034);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39035);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39036);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39037);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39038);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_time_Mm865() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),39039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghfrjvu4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm865",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghfrjvu4f(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(39039); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39040);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39041);int[] values = new int[] { 20, 40 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39042);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39043);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39044);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39045);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39046);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39047);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39048);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39049);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39050);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39051);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39052);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39053);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39054);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39055);try { 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39056);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1txgtxgle6rjds0.R.inc(39057);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 


public void testForFields_time_MS866() {__CLR4_4_1txgtxgle6rjds0.R.globalSliceStart(getClass().getName(),39058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze8z4au4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1txgtxgle6rjds0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1txgtxgle6rjds0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS866",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze8z4au4y(){try{__CLR4_4_1txgtxgle6rjds0.R.inc(39058); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39059);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39060);int[] values = new int[] { 20, 30 }; 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39061);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39062);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39063);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39064);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39065);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39066);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39067);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39068);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39069);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39070);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39071);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39072);assertEquals(0, types.size()); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39073);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39074);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39075);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1txgtxgle6rjds0.R.inc(39076);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1txgtxgle6rjds0.R.flushNeeded();}} 

    

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

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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1tqgtqgle6qsfpe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,38840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38536);
        __CLR4_4_1tqgtqgle6qsfpe.R.inc(38537);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38538);
        __CLR4_4_1tqgtqgle6qsfpe.R.inc(38539);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1tqgtqgle6qsfpe.R.inc(38541);try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38540);
    }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38542);
    }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38543);
    }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields_weekBased_YW174() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqzpi0tqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW174",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqzpi0tqo(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38544); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38545);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38546);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38547);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38548);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38549);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38550);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38551);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38552);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38553);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38554);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38555);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38556);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38557);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38558);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38559);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38560);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38561);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38562);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_time_HMm382() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1howdm9tr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm382",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1howdm9tr7(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38563); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38564);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38565);int[] values = new int[] { 10, 20, 40 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38566);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38567);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38568);assertEquals("10:20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38569);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38570);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38571);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38572);assertEquals("1020-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38573);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38574);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38575);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38576);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38577);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38578);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38579);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38580);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38581);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_datetime_YH510() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1sk6htrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH510",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1sk6htrq(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38582); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38583);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38584);int[] values = new int[] { 2005, 12 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38585);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38586);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38587);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38588);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38589);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38590);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38591);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38592);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38593);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38594);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38595);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38596);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38597);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38598);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38599);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38600);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_calBased_YMD_unmodifiable824() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btq8eits9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable824",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btq8eits9(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38601); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38602);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38603);int[] values = new int[] { 2005, 6, 25 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38604);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38605);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38606);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38607);assertEquals(3, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38608);types = Arrays.asList(fields); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38609);f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38610);assertEquals("2005-06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38611);assertEquals(3, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_ordinalBased_D825() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3fhhwtsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D825",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3fhhwtsk(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38612); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38613);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38614);int[] values = new int[] { 177 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38615);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38616);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38617);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38618);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38619);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38620);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38621);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38622);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38623);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38624);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38625);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38626);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38627);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38628);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38629);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38630);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_calBased_YD826() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uh17d9tt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD826",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uh17d9tt3(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38631); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38632);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38633);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38634);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38635);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38636);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38637);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38638);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38639);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38640);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38641);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38642);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38643);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38644);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38645);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38646);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38647);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38648);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38649);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_weekBased_Y827() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcldxittm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y827",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcldxittm(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38650); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38651);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38652);int[] values = new int[] { 2005 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38653);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38654);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38655);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38656);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38657);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38658);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38659);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38660);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38661);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38662);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38663);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38664);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38665);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38666);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38667);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38668);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_calBased_M828() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n1xdptu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n1xdptu5(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38669); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38670);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38671);int[] values = new int[] { 6 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38672);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38673);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38674);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38675);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38676);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38677);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38678);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38679);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38680);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38681);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38682);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38683);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38684);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38685);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38686);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38687);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_calBased_MD829() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax6nc4tuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD829",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax6nc4tuo(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38688); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38689);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38690);int[] values = new int[] { 6, 25 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38691);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38692);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38693);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38694);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38695);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38696);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38697);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38698);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38699);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38700);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38701);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38702);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38703);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38704);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38705);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38706);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_datetime_DH830() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gnw3ntv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH830",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gnw3ntv7(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38707); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38708);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38709);int[] values = new int[] { 25, 12 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38710);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38711);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38712);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38713);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38714);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38715);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38716);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38717);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38718);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38719);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38720);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38721);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38722);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38723);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38724);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38725);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_weekBased_YD831() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wm1wubtvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD831",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wm1wubtvq(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38726); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38727);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38728);int[] values = new int[] { 2005, 5 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38729);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38730);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38731);assertEquals("2005-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38732);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38733);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38734);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38735);assertEquals("2005W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38736);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38737);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38738);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38739);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38740);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38741);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38742);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38743);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38744);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_weekBased_WD832() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j524kitw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j524kitw9(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38745); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38746);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38747);int[] values = new int[] { 8, 5 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38748);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38749);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38750);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38751);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38752);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38753);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38754);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38755);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38756);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38757);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38758);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38759);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38760);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38761);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38762);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38763);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_weekBased_W833() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ic3myxtws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W833",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ic3myxtws(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38764); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38765);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38766);int[] values = new int[] { 8 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38767);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38768);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38769);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38770);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38771);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38772);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38773);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38774);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38775);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38776);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38777);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38778);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38779);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38780);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38781);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38782);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_datetime_DM834() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vb12nytxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM834",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vb12nytxb(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38783); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38784);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.minuteOfHour() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38785);int[] values = new int[] { 25, 20 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38786);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38787);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38788);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38789);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38790);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38791);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38792);assertEquals("---25T-20", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38793);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38794);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38795);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38796);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38797);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38798);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38799);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38800);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38801);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_time_HSm835() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0qwv6txu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0qwv6txu(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38802); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38803);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38804);int[] values = new int[] { 10, 30, 40 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38805);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38806);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38807);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38808);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38809);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38810);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38811);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38812);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38813);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38814);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38815);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38816);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38817);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38818);try { 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38819);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tqgtqgle6qsfpe.R.inc(38820);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 


public void testForFields_time_MS836() {__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceStart(getClass().getName(),38821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hief7dtyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tqgtqgle6qsfpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tqgtqgle6qsfpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS836",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hief7dtyd(){try{__CLR4_4_1tqgtqgle6qsfpe.R.inc(38821); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38822);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38823);int[] values = new int[] { 20, 30 }; 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38824);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38825);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38826);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38827);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38828);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38829);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38830);assertEquals("-20:30", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38831);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38832);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38833);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38834);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38835);assertEquals(0, types.size()); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38836);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38837);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38838);assertEquals("-2030", f.print(new Partial(fields, values))); 
     __CLR4_4_1tqgtqgle6qsfpe.R.inc(38839);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tqgtqgle6qsfpe.R.flushNeeded();}} 

    

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

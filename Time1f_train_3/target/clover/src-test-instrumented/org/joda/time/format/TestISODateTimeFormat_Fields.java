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
public class TestISODateTimeFormat_Fields extends TestCase {static class __CLR4_4_1tp2tp2le6rcn51{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,38840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38486);
        __CLR4_4_1tp2tp2le6rcn51.R.inc(38487);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38488);
        __CLR4_4_1tp2tp2le6rcn51.R.inc(38489);return new TestSuite(TestISODateTimeFormat_Fields.class);
    }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}}

    public TestISODateTimeFormat_Fields(String name) {
        super(name);__CLR4_4_1tp2tp2le6rcn51.R.inc(38491);try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38490);
    }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38492);
    }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38493);
    }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForFields_weekBased_YW197() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hle20ntpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW197",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hle20ntpa(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38494); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38495);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38496);int[] values = new int[] { 2005, 8 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38497);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38498);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38499);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38500);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38501);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38502);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38503);assertEquals("2005-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38504);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38505);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38506);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38507);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38508);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38509);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38510);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38511);assertEquals("2005W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38512);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_time_HMm412() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erf8cptpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm412",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erf8cptpt(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38513); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38514);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38515);int[] values = new int[] { 10, 20, 40 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38516);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38517);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38518);assertEquals("10:20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38519);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38520);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38521);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38522);assertEquals("1020-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38523);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38524);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38525);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38526);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38527);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38528);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38529);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38530);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38531);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_datetime_YH545() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbnxfdtqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH545",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbnxfdtqc(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38532); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38533);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38534);int[] values = new int[] { 2005, 12 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38535);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38536);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38537);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38538);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38539);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38540);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38541);assertEquals("2005T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38542);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38543);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38544);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38545);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38546);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38547);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38548);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38549);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38550);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_null832() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzsrnctqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzsrnctqv(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38551); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38552);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38553);ISODateTimeFormat.forFields((Collection) null, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38554);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_ordinalBased_D833() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vkijbtqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D833",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vkijbtqz(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38555); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38556);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38557);int[] values = new int[] { 177 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38558);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38559);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38560);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38561);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38562);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38563);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38564);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38565);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38566);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38567);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38568);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38569);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38570);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38571);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38572);assertEquals("-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38573);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_YWD834() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngfuuvtri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD834",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngfuuvtri(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38574); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38575);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38576);int[] values = new int[] { 2005, 8, 5 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38577);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38578);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38579);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38580);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38581);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38582);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38583);assertEquals("2005-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38584);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38585);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38586);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38587);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38588);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38589);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38590);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38591);assertEquals("2005W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38592);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_calBased_YD835() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e37wutts1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e37wutts1(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38593); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38594);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38595);int[] values = new int[] { 2005, 25 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38596);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38597);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38598);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38599);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38600);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38601);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38602);assertEquals("2005--25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38603);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38604);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38605);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38606);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38607);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38608);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38609);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38610);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38611);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_D836() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqzxlftsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D836",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqzxlftsk(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38612); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38613);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38614);int[] values = new int[] { 5 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38615);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38616);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38617);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38618);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38619);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38620);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38621);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38622);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38623);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38624);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38625);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38626);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38627);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38628);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38629);assertEquals("-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38630);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_Y837() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14d9im1tt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y837",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14d9im1tt3(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38631); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38632);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38633);int[] values = new int[] { 2005 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38634);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38635);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38636);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38637);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38638);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38639);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38640);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38641);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38642);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38643);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38644);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38645);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38646);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38647);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38648);assertEquals("2005", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38649);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_calBased_YM838() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vp69krttm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM838",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vp69krttm(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38650); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38651);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38652);int[] values = new int[] { 2005, 6 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38653);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38654);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38655);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38656);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38657);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38658);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38659);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38660);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38661);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38662);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38663);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38664);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38665);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38666);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38667);assertEquals("2005-06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38668);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_calBased_M839() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbsxybtu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M839",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbsxybtu5(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38669); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38670);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38671);int[] values = new int[] { 6 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38672);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38673);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38674);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38675);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38676);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38677);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38678);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38679);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38680);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38681);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38682);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38683);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38684);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38685);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38686);assertEquals("--06", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38687);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_calBased_MD840() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tx7ao7tuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD840",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tx7ao7tuo(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38688); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38689);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38690);int[] values = new int[] { 6, 25 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38691);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38692);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38693);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38694);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38695);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38696);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38697);assertEquals("--06-25", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38698);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38699);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38700);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38701);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38702);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38703);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38704);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38705);assertEquals("--0625", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38706);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_datetime_DH841() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfirfntv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH841",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfirfntv7(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38707); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38708);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38709);int[] values = new int[] { 25, 12 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38710);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38711);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38712);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38713);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38714);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38715);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38716);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38717);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38718);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38719);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38720);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38721);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38722);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38723);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38724);assertEquals("---25T12", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38725);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_ordinalBased_YD842() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xeaqxwtvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD842",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xeaqxwtvq(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38726); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38727);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38728);int[] values = new int[] { 2005, 177 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38729);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38730);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38731);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38732);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38733);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38734);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38735);assertEquals("2005-177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38736);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38737);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38738);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38739);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38740);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38741);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38742);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38743);assertEquals("2005177", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38744);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_YD843() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1277b0ctw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD843",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1277b0ctw9(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38745); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38746);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38747);int[] values = new int[] { 2005, 5 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38748);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38749);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38750);assertEquals("2005-W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38751);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38752);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38753);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38754);assertEquals("2005W-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38755);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38756);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38757);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38758);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38759);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38760);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38761);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38762);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38763);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_WD844() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fo73a5tws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD844",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fo73a5tws(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38764); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38765);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.dayOfWeek() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38766);int[] values = new int[] { 8, 5 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38767);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38768);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38769);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38770);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38771);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38772);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38773);assertEquals("-W08-5", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38774);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38775);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38776);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38777);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38778);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38779);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38780);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38781);assertEquals("-W085", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38782);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_weekBased_W845() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvr75ktxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W845",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvr75ktxb(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38783); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38784);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.weekOfWeekyear() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38785);int[] values = new int[] { 8 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38786);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38787);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38788);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38789);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38790);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38791);f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38792);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38793);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38794);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38795);f = ISODateTimeFormat.forFields(types, false, true); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38796);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38797);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38798);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38799);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38800);assertEquals("-W08", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38801);assertEquals(0, types.size()); 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_time_Mm846() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbtz8etxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm846",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbtz8etxu(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38802); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38803);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38804);int[] values = new int[] { 20, 40 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38805);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38806);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38807);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38808);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38809);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38810);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38811);assertEquals("-20-.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38812);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38813);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38814);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38815);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38816);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38817);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38818);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38819);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38820);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 


public void testForFields_time_HSm847() {__CLR4_4_1tp2tp2le6rcn51.R.globalSliceStart(getClass().getName(),38821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19siazhtyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tp2tp2le6rcn51.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tp2tp2le6rcn51.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm847",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19siazhtyd(){try{__CLR4_4_1tp2tp2le6rcn51.R.inc(38821); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38822);DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38823);int[] values = new int[] { 10, 30, 40 }; 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38824);List types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38825);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38826);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38827);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38828);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38829);f = ISODateTimeFormat.forFields(types, false, false); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38830);assertEquals("10-30.040", f.print(new Partial(fields, values))); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38831);assertEquals(0, types.size()); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38832);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38833);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38834);ISODateTimeFormat.forFields(types, true, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38835);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38836);types = new ArrayList(Arrays.asList(fields)); 
     __CLR4_4_1tp2tp2le6rcn51.R.inc(38837);try { 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38838);ISODateTimeFormat.forFields(types, false, true); 
         __CLR4_4_1tp2tp2le6rcn51.R.inc(38839);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tp2tp2le6rcn51.R.flushNeeded();}} 

    

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

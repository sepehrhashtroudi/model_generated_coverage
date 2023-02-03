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
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1tsatsalc8axeyn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38602);
        __CLR4_4_1tsatsalc8axeyn.R.inc(38603);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38604);
        __CLR4_4_1tsatsalc8axeyn.R.inc(38605);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1tsatsalc8axeyn.R.inc(38607);try{__CLR4_4_1tsatsalc8axeyn.R.inc(38606);
    }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38608);
    }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38609);
    }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_add_long_int37() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1az1db6tsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1az1db6tsi(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38610); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38611);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38612);assertEquals(1001, field.add(1L, 1)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getMaximumShortTextLength_Locale360() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11lqpsjtsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale360",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11lqpsjtsl(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38613); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38614);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38615);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_roundHalfEven_long669() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d2j03tso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long669",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d2j03tso(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38616); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38617);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38618);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38619);assertEquals(0L, field.roundHalfEven(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38620);assertEquals(0L, field.roundHalfEven(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38621);assertEquals(1000L, field.roundHalfEven(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38622);assertEquals(1000L, field.roundHalfEven(1000L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38623);assertEquals(1000L, field.roundHalfEven(1499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38624);assertEquals(2000L, field.roundHalfEven(1500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38625);assertEquals(2000L, field.roundHalfEven(1501L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getOffset855() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7qi9vtsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset855",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7qi9vtsy(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38626); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38627);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 5); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38628);assertEquals(5, field.getOffset()); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getMinimumValue_RP_intarray870() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkqfeott1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray870",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkqfeott1(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38629); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38630);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38631);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getLeapAmount_long996() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohszuztt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long996",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohszuztt4(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38632); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38633);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38634);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_addWrapField_long_int1039() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wl0p45tt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int1039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wl0p45tt7(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38635); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38636);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38637);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38638);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38639);assertEquals(0L, field.addWrapField(1000L * 29, 31)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_roundHalfCeiling_long1050() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oja51vttc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long1050",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oja51vttc(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38640); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38641);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38642);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38643);assertEquals(0L, field.roundHalfCeiling(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38644);assertEquals(1000L, field.roundHalfCeiling(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38645);assertEquals(1000L, field.roundHalfCeiling(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38646);assertEquals(1000L, field.roundHalfCeiling(1000L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_constructor11187() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s8w362ttj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor11187",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s8w362ttj(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38647); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38648);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 3); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38649);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38650);assertEquals(3, field.getOffset()); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38651);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38652);field = new OffsetDateTimeField(null, 3); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38653);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38654);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38655);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38656);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38657);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38658);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38659);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_constructor21278() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1806c32ttw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor21278",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1806c32ttw(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38660); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38661);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38662);assertEquals(DateTimeFieldType.secondOfDay(), field.getType()); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38663);assertEquals(3, field.getOffset()); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38664);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38665);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38666);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38667);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38668);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38669);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38670);try { 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38671);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0); 
         __CLR4_4_1tsatsalc8axeyn.R.inc(38672);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_remainder_long1290() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8tfcytu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long1290",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8tfcytu9(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38673); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38674);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38675);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38676);assertEquals(499L, field.remainder(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38677);assertEquals(500L, field.remainder(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38678);assertEquals(501L, field.remainder(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38679);assertEquals(0L, field.remainder(1000L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_roundCeiling_long1550() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14078p1tug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long1550",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14078p1tug(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38680); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38681);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38682);assertEquals(-1000L, field.roundCeiling(-1001L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38683);assertEquals(-1000L, field.roundCeiling(-1000L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38684);assertEquals(0L, field.roundCeiling(-999L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38685);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38686);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38687);assertEquals(1000L, field.roundCeiling(1L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38688);assertEquals(1000L, field.roundCeiling(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38689);assertEquals(1000L, field.roundCeiling(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38690);assertEquals(1000L, field.roundCeiling(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38691);assertEquals(1000L, field.roundCeiling(1000L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_roundHalfFloor_long1561() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7iwjbtus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long1561",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7iwjbtus(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38692); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38693);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38694);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38695);assertEquals(0L, field.roundHalfFloor(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38696);assertEquals(0L, field.roundHalfFloor(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38697);assertEquals(1000L, field.roundHalfFloor(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38698);assertEquals(1000L, field.roundHalfFloor(1000L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_roundFloor_long1688() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbhbkstuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long1688",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbhbkstuz(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38699); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38700);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38701);assertEquals(-2000L, field.roundFloor(-1001L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38702);assertEquals(-1000L, field.roundFloor(-1000L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38703);assertEquals(-1000L, field.roundFloor(-999L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38704);assertEquals(-1000L, field.roundFloor(-1L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38705);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38706);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38707);assertEquals(0L, field.roundFloor(499L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38708);assertEquals(0L, field.roundFloor(500L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38709);assertEquals(0L, field.roundFloor(501L)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38710);assertEquals(1000L, field.roundFloor(1000L)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getLeapDurationField1715() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oderzutvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField1715",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oderzutvb(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38711); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38712);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38713);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale1760() {__CLR4_4_1tsatsalc8axeyn.R.globalSliceStart(getClass().getName(),38714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tmngsztve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tsatsalc8axeyn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tsatsalc8axeyn.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale1760",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tmngsztve(){try{__CLR4_4_1tsatsalc8axeyn.R.inc(38714); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38715);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38716);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH)); 
     __CLR4_4_1tsatsalc8axeyn.R.inc(38717);assertEquals("32", field.getAsShortText(1000L * 29, null)); 
 }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //------------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockOffsetDateTimeField extends OffsetDateTimeField {
        protected MockOffsetDateTimeField() {
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1tsatsalc8axeyn.R.inc(38719);try{__CLR4_4_1tsatsalc8axeyn.R.inc(38718);
        }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1tsatsalc8axeyn.R.inc(38721);try{__CLR4_4_1tsatsalc8axeyn.R.inc(38720);
        }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38722);
            __CLR4_4_1tsatsalc8axeyn.R.inc(38723);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tsatsalc8axeyn.R.inc(38724);
            __CLR4_4_1tsatsalc8axeyn.R.inc(38725);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1tsatsalc8axeyn.R.flushNeeded();}}
    }

}

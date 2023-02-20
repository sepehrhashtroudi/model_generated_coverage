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
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1s20s20le6rcmxg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36360);
        __CLR4_4_1s20s20le6rcmxg.R.inc(36361);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36362);
        __CLR4_4_1s20s20le6rcmxg.R.inc(36363);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1s20s20le6rcmxg.R.inc(36365);try{__CLR4_4_1s20s20le6rcmxg.R.inc(36364);
    }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36366);
    }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36367);
    }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumShortTextLength_Locale464() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgvw3cs28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale464",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgvw3cs28(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36368); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36369);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36370);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_constructor2465() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfss45s2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor2465",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfss45s2b(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36371); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36372);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36373);assertEquals(DateTimeFieldType.secondOfDay(), field.getType()); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36374);assertEquals(3, field.getOffset()); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36375);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36376);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36377);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36378);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36379);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36380);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36381);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36382);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36383);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_constructor1466() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu43p3s2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor1466",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu43p3s2o(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36384); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36385);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 3); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36386);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36387);assertEquals(3, field.getOffset()); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36388);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36389);field = new OffsetDateTimeField(null, 3); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36391);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36392);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36393);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36394);try { 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36395);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0); 
         __CLR4_4_1s20s20le6rcmxg.R.inc(36396);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_roundHalfEven_long1221() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tygks31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tygks31(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36397); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36398);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36399);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36400);assertEquals(0L, field.roundHalfEven(499L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36401);assertEquals(0L, field.roundHalfEven(500L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36402);assertEquals(1000L, field.roundHalfEven(501L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36403);assertEquals(1000L, field.roundHalfEven(1000L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36404);assertEquals(1000L, field.roundHalfEven(1499L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36405);assertEquals(2000L, field.roundHalfEven(1500L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36406);assertEquals(2000L, field.roundHalfEven(1501L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale1222() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111ephos3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111ephos3b(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36407); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36408);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36409);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36410);assertEquals("32", field.getAsShortText(1000L * 29, null)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_add_long_int1223() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ed14bks3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int1223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ed14bks3f(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36411); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36412);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36413);assertEquals(1001, field.add(1L, 1)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_add_long_long1224() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6ccv6s3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long1224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6ccv6s3i(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36414); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36415);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36416);assertEquals(1001, field.add(1L, 1L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_addWrapField_long_int1225() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jgskms3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int1225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jgskms3l(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36417); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36418);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36419);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36420);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36421);assertEquals(0L, field.addWrapField(1000L * 29, 31)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_isLeap_long1226() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjqvpks3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLeap_long1226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjqvpks3q(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36422); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36423);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36424);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_getLeapAmount_long1227() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yonjb5s3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yonjb5s3t(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36425); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36426);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36427);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_getLeapDurationField1228() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prph8js3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prph8js3w(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36428); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36429);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36430);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_getMinimumValue_RP_intarray1229() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2p73bs3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray1229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2p73bs3z(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36431); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36432);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36433);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_roundHalfFloor_long1230() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6fge0s42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long1230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6fge0s42(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36434); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36435);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36436);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36437);assertEquals(0L, field.roundHalfFloor(499L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36438);assertEquals(0L, field.roundHalfFloor(500L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36439);assertEquals(1000L, field.roundHalfFloor(501L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36440);assertEquals(1000L, field.roundHalfFloor(1000L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_roundHalfCeiling_long1231() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3yz08s49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3yz08s49(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36441); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36442);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36443);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36444);assertEquals(0L, field.roundHalfCeiling(499L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36445);assertEquals(1000L, field.roundHalfCeiling(500L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36446);assertEquals(1000L, field.roundHalfCeiling(501L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36447);assertEquals(1000L, field.roundHalfCeiling(1000L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_remainder_long1232() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17i3yd2s4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17i3yd2s4g(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36448); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36449);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36450);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36451);assertEquals(499L, field.remainder(499L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36452);assertEquals(500L, field.remainder(500L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36453);assertEquals(501L, field.remainder(501L)); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36454);assertEquals(0L, field.remainder(1000L)); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 


public void test_getOffset1233() {__CLR4_4_1s20s20le6rcmxg.R.globalSliceStart(getClass().getName(),36455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erd4oss4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s20s20le6rcmxg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s20s20le6rcmxg.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset1233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erd4oss4n(){try{__CLR4_4_1s20s20le6rcmxg.R.inc(36455); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36456);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 5); 
     __CLR4_4_1s20s20le6rcmxg.R.inc(36457);assertEquals(5, field.getOffset()); 
 }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1s20s20le6rcmxg.R.inc(36459);try{__CLR4_4_1s20s20le6rcmxg.R.inc(36458);
        }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s20s20le6rcmxg.R.inc(36461);try{__CLR4_4_1s20s20le6rcmxg.R.inc(36460);
        }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36462);
            __CLR4_4_1s20s20le6rcmxg.R.inc(36463);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s20s20le6rcmxg.R.inc(36464);
            __CLR4_4_1s20s20le6rcmxg.R.inc(36465);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s20s20le6rcmxg.R.flushNeeded();}}
    }

}

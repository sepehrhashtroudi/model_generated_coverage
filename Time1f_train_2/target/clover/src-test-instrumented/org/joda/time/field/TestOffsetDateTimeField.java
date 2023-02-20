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
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1rz2rz2le6qsfkm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36254);
        __CLR4_4_1rz2rz2le6qsfkm.R.inc(36255);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36256);
        __CLR4_4_1rz2rz2le6qsfkm.R.inc(36257);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1rz2rz2le6qsfkm.R.inc(36259);try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36258);
    }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36260);
    }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36261);
    }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumShortTextLength_Locale429() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j4fu5brza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j4fu5brza(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36262); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36263);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36264);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_constructor2430() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1exnphprzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor2430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1exnphprzd(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36265); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36266);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36267);assertEquals(DateTimeFieldType.secondOfDay(), field.getType()); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36268);assertEquals(3, field.getOffset()); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36269);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36270);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36271);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36272);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36273);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36274);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36275);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36276);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36277);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_constructor1431() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjcdwrrzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjcdwrrzq(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36278); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36279);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 3); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36280);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36281);assertEquals(3, field.getOffset()); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36282);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36283);field = new OffsetDateTimeField(null, 3); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36284);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36285);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36286);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36287);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36288);try { 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36289);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0); 
         __CLR4_4_1rz2rz2le6qsfkm.R.inc(36290);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_roundHalfEven_long1215() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm12x3s03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long1215",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm12x3s03(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36291); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36292);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36293);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36294);assertEquals(0L, field.roundHalfEven(499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36295);assertEquals(0L, field.roundHalfEven(500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36296);assertEquals(1000L, field.roundHalfEven(501L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36297);assertEquals(1000L, field.roundHalfEven(1000L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36298);assertEquals(1000L, field.roundHalfEven(1499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36299);assertEquals(2000L, field.roundHalfEven(1500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36300);assertEquals(2000L, field.roundHalfEven(1501L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale1216() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hr9qvbs0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale1216",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hr9qvbs0d(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36301); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36302);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36303);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36304);assertEquals("32", field.getAsShortText(1000L * 29, null)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_add_long_int1217() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2w5p7s0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int1217",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2w5p7s0h(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36305); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36306);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36307);assertEquals(1001, field.add(1L, 1)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_add_long_long1218() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4wnqbs0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long1218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4wnqbs0k(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36308); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36309);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36310);assertEquals(1001, field.add(1L, 1L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_addWrapField_long_int1219() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9bty9s0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9bty9s0n(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36311); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36312);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36313);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36314);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36315);assertEquals(0L, field.addWrapField(1000L * 29, 31)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_isLeap_long1220() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c1r2yqs0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLeap_long1220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c1r2yqs0s(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36316); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36317);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36318);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_getLeapAmount_long1221() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gugpx5s0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gugpx5s0v(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36319); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36320);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36321);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_getLeapDurationField1222() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169pohps0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169pohps0y(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36322); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36323);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36324);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_getMinimumValue_RP_intarray1223() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14falnjs11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray1223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14falnjs11(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36325); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36326);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36327);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_roundFloor_long1224() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1te13fqs14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long1224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1te13fqs14(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36328); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36329);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36330);assertEquals(-2000L, field.roundFloor(-1001L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36331);assertEquals(-1000L, field.roundFloor(-1000L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36332);assertEquals(-1000L, field.roundFloor(-999L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36333);assertEquals(-1000L, field.roundFloor(-1L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36334);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36335);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36336);assertEquals(0L, field.roundFloor(499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36337);assertEquals(0L, field.roundFloor(500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36338);assertEquals(0L, field.roundFloor(501L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36339);assertEquals(1000L, field.roundFloor(1000L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_roundCeiling_long1225() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jahl6s1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long1225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jahl6s1g(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36340); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36341);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36342);assertEquals(-1000L, field.roundCeiling(-1001L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36343);assertEquals(-1000L, field.roundCeiling(-1000L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36344);assertEquals(0L, field.roundCeiling(-999L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36345);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36346);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36347);assertEquals(1000L, field.roundCeiling(1L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36348);assertEquals(1000L, field.roundCeiling(499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36349);assertEquals(1000L, field.roundCeiling(500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36350);assertEquals(1000L, field.roundCeiling(501L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36351);assertEquals(1000L, field.roundCeiling(1000L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_roundHalfFloor_long1226() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umthsfs1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long1226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umthsfs1s(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36352); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36353);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36354);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36355);assertEquals(0L, field.roundHalfFloor(499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36356);assertEquals(0L, field.roundHalfFloor(500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36357);assertEquals(1000L, field.roundHalfFloor(501L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36358);assertEquals(1000L, field.roundHalfFloor(1000L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 


public void test_remainder_long1227() {__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceStart(getClass().getName(),36359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kyz0y8s1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rz2rz2le6qsfkm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rz2rz2le6qsfkm.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kyz0y8s1z(){try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36359); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36360);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36361);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36362);assertEquals(499L, field.remainder(499L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36363);assertEquals(500L, field.remainder(500L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36364);assertEquals(501L, field.remainder(501L)); 
     __CLR4_4_1rz2rz2le6qsfkm.R.inc(36365);assertEquals(0L, field.remainder(1000L)); 
 }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1rz2rz2le6qsfkm.R.inc(36367);try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36366);
        }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1rz2rz2le6qsfkm.R.inc(36369);try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36368);
        }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36370);
            __CLR4_4_1rz2rz2le6qsfkm.R.inc(36371);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1rz2rz2le6qsfkm.R.inc(36372);
            __CLR4_4_1rz2rz2le6qsfkm.R.inc(36373);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1rz2rz2le6qsfkm.R.flushNeeded();}}
    }

}

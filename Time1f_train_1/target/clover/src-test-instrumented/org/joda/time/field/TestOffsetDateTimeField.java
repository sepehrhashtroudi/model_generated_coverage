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
public class TestOffsetDateTimeField extends TestCase {static class __CLR4_4_1s36s36le6qealy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s36s36le6qealy.R.inc(36402);
        __CLR4_4_1s36s36le6qealy.R.inc(36403);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s36s36le6qealy.R.inc(36404);
        __CLR4_4_1s36s36le6qealy.R.inc(36405);return new TestSuite(TestOffsetDateTimeField.class);
    }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}

    public TestOffsetDateTimeField(String name) {
        super(name);__CLR4_4_1s36s36le6qealy.R.inc(36407);try{__CLR4_4_1s36s36le6qealy.R.inc(36406);
    }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s36s36le6qealy.R.inc(36408);
    }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s36s36le6qealy.R.inc(36409);
    }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getMaximumShortTextLength_Locale455() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dzz1nqs3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale455",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dzz1nqs3e(){try{__CLR4_4_1s36s36le6qealy.R.inc(36410); 
     __CLR4_4_1s36s36le6qealy.R.inc(36411);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36412);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_constructor2456() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17125mxs3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor2456",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17125mxs3h(){try{__CLR4_4_1s36s36le6qealy.R.inc(36413); 
     __CLR4_4_1s36s36le6qealy.R.inc(36414);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3); 
     __CLR4_4_1s36s36le6qealy.R.inc(36415);assertEquals(DateTimeFieldType.secondOfDay(), field.getType()); 
     __CLR4_4_1s36s36le6qealy.R.inc(36416);assertEquals(3, field.getOffset()); 
     __CLR4_4_1s36s36le6qealy.R.inc(36417);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36418);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3); 
         __CLR4_4_1s36s36le6qealy.R.inc(36419);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s36s36le6qealy.R.inc(36420);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36421);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3); 
         __CLR4_4_1s36s36le6qealy.R.inc(36422);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s36s36le6qealy.R.inc(36423);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36424);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0); 
         __CLR4_4_1s36s36le6qealy.R.inc(36425);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_constructor1457() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mqu1zs3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor1457",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mqu1zs3u(){try{__CLR4_4_1s36s36le6qealy.R.inc(36426); 
     __CLR4_4_1s36s36le6qealy.R.inc(36427);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 3); 
     __CLR4_4_1s36s36le6qealy.R.inc(36428);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s36s36le6qealy.R.inc(36429);assertEquals(3, field.getOffset()); 
     __CLR4_4_1s36s36le6qealy.R.inc(36430);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36431);field = new OffsetDateTimeField(null, 3); 
         __CLR4_4_1s36s36le6qealy.R.inc(36432);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s36s36le6qealy.R.inc(36433);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36434);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0); 
         __CLR4_4_1s36s36le6qealy.R.inc(36435);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s36s36le6qealy.R.inc(36436);try { 
         __CLR4_4_1s36s36le6qealy.R.inc(36437);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0); 
         __CLR4_4_1s36s36le6qealy.R.inc(36438);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_roundHalfEven_long1218() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16v16jos47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long1218",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16v16jos47(){try{__CLR4_4_1s36s36le6qealy.R.inc(36439); 
     __CLR4_4_1s36s36le6qealy.R.inc(36440);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36441);assertEquals(0L, field.roundHalfEven(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36442);assertEquals(0L, field.roundHalfEven(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36443);assertEquals(0L, field.roundHalfEven(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36444);assertEquals(1000L, field.roundHalfEven(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36445);assertEquals(1000L, field.roundHalfEven(1000L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36446);assertEquals(1000L, field.roundHalfEven(1499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36447);assertEquals(2000L, field.roundHalfEven(1500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36448);assertEquals(2000L, field.roundHalfEven(1501L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale1219() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1809uhws4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale1219",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1809uhws4h(){try{__CLR4_4_1s36s36le6qealy.R.inc(36449); 
     __CLR4_4_1s36s36le6qealy.R.inc(36450);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36451);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36452);assertEquals("32", field.getAsShortText(1000L * 29, null)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_add_long_int1220() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o410ozs4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int1220",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o410ozs4l(){try{__CLR4_4_1s36s36le6qealy.R.inc(36453); 
     __CLR4_4_1s36s36le6qealy.R.inc(36454);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36455);assertEquals(1001, field.add(1L, 1)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_add_long_long1221() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3rsqjs4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long1221",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3rsqjs4o(){try{__CLR4_4_1s36s36le6qealy.R.inc(36456); 
     __CLR4_4_1s36s36le6qealy.R.inc(36457);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36458);assertEquals(1001, field.add(1L, 1L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_addWrapField_long_int1222() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iagoy1s4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iagoy1s4r(){try{__CLR4_4_1s36s36le6qealy.R.inc(36459); 
     __CLR4_4_1s36s36le6qealy.R.inc(36460);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36461);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36462);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36463);assertEquals(0L, field.addWrapField(1000L * 29, 31)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_isLeap_long1223() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lsqzc5s4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLeap_long1223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lsqzc5s4w(){try{__CLR4_4_1s36s36le6qealy.R.inc(36464); 
     __CLR4_4_1s36s36le6qealy.R.inc(36465);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36466);assertEquals(false, field.isLeap(0L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_getLeapAmount_long1224() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qlgmaks4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long1224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qlgmaks4z(){try{__CLR4_4_1s36s36le6qealy.R.inc(36467); 
     __CLR4_4_1s36s36le6qealy.R.inc(36468);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36469);assertEquals(0, field.getLeapAmount(0L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_getLeapDurationField1225() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0pkv4s52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField1225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0pkv4s52(){try{__CLR4_4_1s36s36le6qealy.R.inc(36470); 
     __CLR4_4_1s36s36le6qealy.R.inc(36471);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36472);assertEquals(null, field.getLeapDurationField()); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_getMinimumValue_RP_intarray1226() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bpapws55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray1226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bpapws55(){try{__CLR4_4_1s36s36le6qealy.R.inc(36473); 
     __CLR4_4_1s36s36le6qealy.R.inc(36474);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36475);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4])); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_roundFloor_long1227() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn172bs58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn172bs58(){try{__CLR4_4_1s36s36le6qealy.R.inc(36476); 
     __CLR4_4_1s36s36le6qealy.R.inc(36477);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36478);assertEquals(-2000L, field.roundFloor(-1001L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36479);assertEquals(-1000L, field.roundFloor(-1000L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36480);assertEquals(-1000L, field.roundFloor(-999L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36481);assertEquals(-1000L, field.roundFloor(-1L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36482);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36483);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36484);assertEquals(0L, field.roundFloor(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36485);assertEquals(0L, field.roundFloor(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36486);assertEquals(0L, field.roundFloor(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36487);assertEquals(1000L, field.roundFloor(1000L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_roundCeiling_long1228() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iaadyls5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iaadyls5k(){try{__CLR4_4_1s36s36le6qealy.R.inc(36488); 
     __CLR4_4_1s36s36le6qealy.R.inc(36489);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36490);assertEquals(-1000L, field.roundCeiling(-1001L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36491);assertEquals(-1000L, field.roundCeiling(-1000L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36492);assertEquals(0L, field.roundCeiling(-999L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36493);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36494);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36495);assertEquals(1000L, field.roundCeiling(1L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36496);assertEquals(1000L, field.roundCeiling(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36497);assertEquals(1000L, field.roundCeiling(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36498);assertEquals(1000L, field.roundCeiling(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36499);assertEquals(1000L, field.roundCeiling(1000L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_roundHalfFloor_long1229() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unantas5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long1229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unantas5w(){try{__CLR4_4_1s36s36le6qealy.R.inc(36500); 
     __CLR4_4_1s36s36le6qealy.R.inc(36501);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36502);assertEquals(0L, field.roundHalfFloor(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36503);assertEquals(0L, field.roundHalfFloor(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36504);assertEquals(0L, field.roundHalfFloor(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36505);assertEquals(1000L, field.roundHalfFloor(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36506);assertEquals(1000L, field.roundHalfFloor(1000L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_roundHalfCeiling_long1230() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuz07rs63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long1230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuz07rs63(){try{__CLR4_4_1s36s36le6qealy.R.inc(36507); 
     __CLR4_4_1s36s36le6qealy.R.inc(36508);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36509);assertEquals(0L, field.roundHalfCeiling(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36510);assertEquals(0L, field.roundHalfCeiling(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36511);assertEquals(1000L, field.roundHalfCeiling(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36512);assertEquals(1000L, field.roundHalfCeiling(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36513);assertEquals(1000L, field.roundHalfCeiling(1000L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_remainder_long1231() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar3x5js6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long1231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar3x5js6a(){try{__CLR4_4_1s36s36le6qealy.R.inc(36514); 
     __CLR4_4_1s36s36le6qealy.R.inc(36515);OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     __CLR4_4_1s36s36le6qealy.R.inc(36516);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36517);assertEquals(499L, field.remainder(499L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36518);assertEquals(500L, field.remainder(500L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36519);assertEquals(501L, field.remainder(501L)); 
     __CLR4_4_1s36s36le6qealy.R.inc(36520);assertEquals(0L, field.remainder(1000L)); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 


public void test_getOffset1232() {__CLR4_4_1s36s36le6qealy.R.globalSliceStart(getClass().getName(),36521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0d3h9s6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s36s36le6qealy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s36s36le6qealy.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset1232",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0d3h9s6h(){try{__CLR4_4_1s36s36le6qealy.R.inc(36521); 
     __CLR4_4_1s36s36le6qealy.R.inc(36522);OffsetDateTimeField field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 5); 
     __CLR4_4_1s36s36le6qealy.R.inc(36523);assertEquals(5, field.getOffset()); 
 }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

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
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_1s36s36le6qealy.R.inc(36525);try{__CLR4_4_1s36s36le6qealy.R.inc(36524);
        }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s36s36le6qealy.R.inc(36527);try{__CLR4_4_1s36s36le6qealy.R.inc(36526);
        }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s36s36le6qealy.R.inc(36528);
            __CLR4_4_1s36s36le6qealy.R.inc(36529);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s36s36le6qealy.R.inc(36530);
            __CLR4_4_1s36s36le6qealy.R.inc(36531);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s36s36le6qealy.R.flushNeeded();}}
    }

}

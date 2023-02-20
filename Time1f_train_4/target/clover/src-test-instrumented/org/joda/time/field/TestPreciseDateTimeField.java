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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1s8us8ule6rjdkq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36606);
        __CLR4_4_1s8us8ule6rjdkq.R.inc(36607);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36608);
        __CLR4_4_1s8us8ule6rjdkq.R.inc(36609);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1s8us8ule6rjdkq.R.inc(36611);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36610);
    }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36612);
    }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36613);
    }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getRange950() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iozt1js92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange950",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iozt1js92(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36614); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36615);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36616);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale951() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypwuos95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale951",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypwuos95(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36617); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36618);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36619);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36620);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 


public void test_addWrapField_long_int952() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv1pe6s99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int952",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv1pe6s99(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36621); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36622);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36623);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36624);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36625);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 


public void test_set_long_String953() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnpo3ws9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String953",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnpo3ws9e(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36626); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36627);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36628);assertEquals(0, field.set(0L, "0")); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36629);assertEquals(29 * 60, field.set(0L, "29")); 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int954() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9k2yns9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int954",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9k2yns9i(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36630); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36631);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36632);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36633);BaseDateTimeField field = new MockStandardDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36634);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36635);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36636);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36637);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36638);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36639);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36640);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36641);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36642);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36643);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36644);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36645);try { 
         __CLR4_4_1s8us8ule6rjdkq.R.inc(36646);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1s8us8ule6rjdkq.R.inc(36647);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36648);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36649);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36650);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36651);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36652);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36653);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36654);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36655);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36656);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36657);try { 
         __CLR4_4_1s8us8ule6rjdkq.R.inc(36658);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1s8us8ule6rjdkq.R.inc(36659);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 


public void test_getMaximumValue955() {__CLR4_4_1s8us8ule6rjdkq.R.globalSliceStart(getClass().getName(),36660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fdh0l6sac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s8us8ule6rjdkq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s8us8ule6rjdkq.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue955",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fdh0l6sac(){try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36660); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36661);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s8us8ule6rjdkq.R.inc(36662);assertEquals(59, field.getMaximumValue()); 
 }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
    static class MockPreciseDateTimeField extends PreciseDateTimeField {
        protected MockPreciseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds(), 60),
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1s8us8ule6rjdkq.R.inc(36664);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36663);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1s8us8ule6rjdkq.R.inc(36666);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36665);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s8us8ule6rjdkq.R.inc(36668);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36667);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36669);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36670);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36671);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36672);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1s8us8ule6rjdkq.R.inc(36674);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36673);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36675);this.unit = unit;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36676);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36677);return true;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36678);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36679);return unit;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36680);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36681);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36682);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36683);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36684);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36685);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36686);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36687);add_int++;
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36688);return instant + (value * 60L);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36689);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36690);add_long++;
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36691);return instant + (value * 60L);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36692);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36693);difference_long++;
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36694);return 30;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s8us8ule6rjdkq.R.inc(36696);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36695);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36697);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36698);return true;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36699);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36700);return 0;  // this is zero
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36701);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36702);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36703);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36704);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36705);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36706);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36707);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36708);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36709);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36710);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36711);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36712);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s8us8ule6rjdkq.R.inc(36714);try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36713);
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36715);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36716);return false;  // this is false
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36717);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36718);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36719);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36720);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36721);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36722);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36723);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36724);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36725);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36726);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36727);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36728);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s8us8ule6rjdkq.R.inc(36729);
            __CLR4_4_1s8us8ule6rjdkq.R.inc(36730);return 0;
        }finally{__CLR4_4_1s8us8ule6rjdkq.R.flushNeeded();}}
    }

}

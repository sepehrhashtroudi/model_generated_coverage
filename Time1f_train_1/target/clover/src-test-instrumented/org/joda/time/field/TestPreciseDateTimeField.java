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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1s6ss6sle6qeama{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36532);
        __CLR4_4_1s6ss6sle6qeama.R.inc(36533);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36534);
        __CLR4_4_1s6ss6sle6qeama.R.inc(36535);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1s6ss6sle6qeama.R.inc(36537);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36536);
    }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36538);
    }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36539);
    }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getRange936() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8q7aps70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange936",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8q7aps70(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36540); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36541);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36542);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_constructor937() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cifkxjs73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor937",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cifkxjs73(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36543); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36544);BaseDateTimeField field = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), ISOChronology.getInstanceUTC().millis(), ISOChronology.getInstanceUTC().hours()); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36545);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36546);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36547);field = new PreciseDateTimeField(null, null, null); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36548);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36549);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36550);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36551);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36552);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36553);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36554);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36555);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36556);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36557);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36558);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36559);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36560);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale938() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb3xa1s7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale938",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb3xa1s7l(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36561); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36562);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36563);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36564);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_addWrapField_long_int939() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17toc5ls7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int939",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17toc5ls7p(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36565); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36566);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36567);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36568);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36569);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_set_long_String940() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wjkyas7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String940",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wjkyas7u(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36570); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36571);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36572);assertEquals(0, field.set(0L, "0")); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36573);assertEquals(29 * 60, field.set(0L, "29")); 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int941() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7apybs7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int941",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7apybs7y(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36574); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36575);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36576);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36577);BaseDateTimeField field = new MockStandardDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36578);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36579);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36580);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36581);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36582);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36583);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36584);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36585);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36586);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36587);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36588);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36589);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36590);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36591);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36592);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36593);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36594);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36595);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36596);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36597);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36598);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36599);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36600);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36601);try { 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36602);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1s6ss6sle6qeama.R.inc(36603);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 


public void test_getMaximumValue942() {__CLR4_4_1s6ss6sle6qeama.R.globalSliceStart(getClass().getName(),36604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6s8h0s8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6ss6sle6qeama.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6ss6sle6qeama.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue942",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6s8h0s8s(){try{__CLR4_4_1s6ss6sle6qeama.R.inc(36604); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36605);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s6ss6sle6qeama.R.inc(36606);assertEquals(59, field.getMaximumValue()); 
 }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1s6ss6sle6qeama.R.inc(36608);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36607);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1s6ss6sle6qeama.R.inc(36610);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36609);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s6ss6sle6qeama.R.inc(36612);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36611);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36613);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36614);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36615);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36616);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1s6ss6sle6qeama.R.inc(36618);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36617);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36619);this.unit = unit;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36620);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36621);return true;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36622);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36623);return unit;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36624);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36625);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36626);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36627);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36628);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36629);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36630);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36631);add_int++;
            __CLR4_4_1s6ss6sle6qeama.R.inc(36632);return instant + (value * 60L);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36633);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36634);add_long++;
            __CLR4_4_1s6ss6sle6qeama.R.inc(36635);return instant + (value * 60L);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36636);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36637);difference_long++;
            __CLR4_4_1s6ss6sle6qeama.R.inc(36638);return 30;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s6ss6sle6qeama.R.inc(36640);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36639);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36641);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36642);return true;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36643);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36644);return 0;  // this is zero
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36645);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36646);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36647);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36648);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36649);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36650);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36651);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36652);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36653);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36654);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36655);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36656);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s6ss6sle6qeama.R.inc(36658);try{__CLR4_4_1s6ss6sle6qeama.R.inc(36657);
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36659);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36660);return false;  // this is false
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36661);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36662);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36663);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36664);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36665);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36666);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36667);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36668);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36669);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36670);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36671);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36672);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s6ss6sle6qeama.R.inc(36673);
            __CLR4_4_1s6ss6sle6qeama.R.inc(36674);return 0;
        }finally{__CLR4_4_1s6ss6sle6qeama.R.flushNeeded();}}
    }

}

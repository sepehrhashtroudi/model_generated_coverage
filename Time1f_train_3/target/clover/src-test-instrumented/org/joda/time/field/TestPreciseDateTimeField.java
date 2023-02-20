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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1s4ys4yle6rcmxs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,36605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36466);
        __CLR4_4_1s4ys4yle6rcmxs.R.inc(36467);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36468);
        __CLR4_4_1s4ys4yle6rcmxs.R.inc(36469);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1s4ys4yle6rcmxs.R.inc(36471);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36470);
    }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36472);
    }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36473);
    }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getRange925() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtizcfs56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange925",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtizcfs56(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36474); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36475);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36476);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 


public void test_constructor926() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgfaehs59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor926",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgfaehs59(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36477); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36478);BaseDateTimeField field = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), ISOChronology.getInstanceUTC().millis(), ISOChronology.getInstanceUTC().hours()); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36479);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36480);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36481);field = new PreciseDateTimeField(null, null, null); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36482);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36483);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36484);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36485);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36486);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36487);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36488);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36489);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36490);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36491);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36492);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36493);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36494);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale927() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12c91y1s5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale927",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12c91y1s5r(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36495); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36496);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36497);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36498);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 


public void test_addWrapField_long_int928() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8kuhjs5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int928",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8kuhjs5v(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36499); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36500);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36501);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36502);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36503);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int929() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1re399js60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int929",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1re399js60(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36504); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36505);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36506);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36507);BaseDateTimeField field = new MockStandardDateTimeField(); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36508);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36509);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36510);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36511);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36512);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36513);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36514);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36515);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36516);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36517);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36518);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36519);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36520);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36521);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36522);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36523);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36524);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36525);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36526);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36527);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36528);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36529);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36530);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36531);try { 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36532);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1s4ys4yle6rcmxs.R.inc(36533);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 


public void test_getMaximumValue930() {__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceStart(getClass().getName(),36534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k12lnhs6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4ys4yle6rcmxs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4ys4yle6rcmxs.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k12lnhs6u(){try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36534); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36535);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s4ys4yle6rcmxs.R.inc(36536);assertEquals(59, field.getMaximumValue()); 
 }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1s4ys4yle6rcmxs.R.inc(36538);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36537);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1s4ys4yle6rcmxs.R.inc(36540);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36539);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s4ys4yle6rcmxs.R.inc(36542);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36541);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36543);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36544);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36545);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36546);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1s4ys4yle6rcmxs.R.inc(36548);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36547);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36549);this.unit = unit;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36550);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36551);return true;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36552);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36553);return unit;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36554);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36555);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36556);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36557);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36558);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36559);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36560);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36561);add_int++;
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36562);return instant + (value * 60L);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36563);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36564);add_long++;
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36565);return instant + (value * 60L);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36566);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36567);difference_long++;
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36568);return 30;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s4ys4yle6rcmxs.R.inc(36570);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36569);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36571);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36572);return true;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36573);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36574);return 0;  // this is zero
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36575);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36576);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36577);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36578);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36579);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36580);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36581);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36582);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36583);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36584);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36585);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36586);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s4ys4yle6rcmxs.R.inc(36588);try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36587);
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36589);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36590);return false;  // this is false
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36591);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36592);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36593);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36594);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36595);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36596);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36597);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36598);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36599);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36600);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36601);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36602);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s4ys4yle6rcmxs.R.inc(36603);
            __CLR4_4_1s4ys4yle6rcmxs.R.inc(36604);return 0;
        }finally{__CLR4_4_1s4ys4yle6rcmxs.R.flushNeeded();}}
    }

}

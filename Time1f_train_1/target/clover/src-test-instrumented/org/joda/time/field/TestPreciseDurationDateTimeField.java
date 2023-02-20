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
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1sarsarle6qeamk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,36812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36675);
        __CLR4_4_1sarsarle6qeamk.R.inc(36676);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36677);
        __CLR4_4_1sarsarle6qeamk.R.inc(36678);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1sarsarle6qeamk.R.inc(36680);try{__CLR4_4_1sarsarle6qeamk.R.inc(36679);
    }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1sarsarle6qeamk.R.inc(36681);
    }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1sarsarle6qeamk.R.inc(36682);
    }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_convertText1209() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoevz8saz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText1209",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoevz8saz(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36683); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36684);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36685);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36686);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36687);try { 
         __CLR4_4_1sarsarle6qeamk.R.inc(36688);field.convertText("2A", null); 
         __CLR4_4_1sarsarle6qeamk.R.inc(36689);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sarsarle6qeamk.R.inc(36690);try { 
         __CLR4_4_1sarsarle6qeamk.R.inc(36691);field.convertText(null, null); 
         __CLR4_4_1sarsarle6qeamk.R.inc(36692);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 


public void test_constructor1210() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13x8q30sb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor1210",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13x8q30sb9(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36693); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36694);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36695);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36696);try { 
         __CLR4_4_1sarsarle6qeamk.R.inc(36697);field = new MockPreciseDurationDateTimeField(null, null); 
         __CLR4_4_1sarsarle6qeamk.R.inc(36698);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sarsarle6qeamk.R.inc(36699);try { 
         __CLR4_4_1sarsarle6qeamk.R.inc(36700);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1sarsarle6qeamk.R.inc(36701);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1sarsarle6qeamk.R.inc(36702);try { 
         __CLR4_4_1sarsarle6qeamk.R.inc(36703);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1sarsarle6qeamk.R.inc(36704);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 


public void test_isLenient1211() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j43crcsbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient1211",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j43crcsbl(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36705); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36706);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36707);assertEquals(false, field.isLenient()); 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 


public void test_roundFloor_long1212() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15f84exsbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundFloor_long1212",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15f84exsbo(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36708); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36709);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36710);assertEquals(-120L, field.roundFloor(-61L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36711);assertEquals(-60L, field.roundFloor(-60L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36712);assertEquals(-60L, field.roundFloor(-59L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36713);assertEquals(-60L, field.roundFloor(-1L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36714);assertEquals(0L, field.roundFloor(0L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36715);assertEquals(0L, field.roundFloor(1L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36716);assertEquals(0L, field.roundFloor(29L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36717);assertEquals(0L, field.roundFloor(30L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36718);assertEquals(0L, field.roundFloor(31L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36719);assertEquals(60L, field.roundFloor(60L)); 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 


public void test_roundCeiling_long1213() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rokcjbsc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long1213",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rokcjbsc0(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36720); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36721);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36722);assertEquals(-60L, field.roundCeiling(-61L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36723);assertEquals(-60L, field.roundCeiling(-60L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36724);assertEquals(0L, field.roundCeiling(-59L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36725);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36726);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36727);assertEquals(60L, field.roundCeiling(1L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36728);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36729);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36730);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36731);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 


public void test_remainder_long1214() {__CLR4_4_1sarsarle6qeamk.R.globalSliceStart(getClass().getName(),36732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ala83yscc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sarsarle6qeamk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sarsarle6qeamk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_remainder_long1214",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ala83yscc(){try{__CLR4_4_1sarsarle6qeamk.R.inc(36732); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36733);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36734);assertEquals(0L, field.remainder(0L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36735);assertEquals(29L, field.remainder(29L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36736);assertEquals(30L, field.remainder(30L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36737);assertEquals(31L, field.remainder(31L)); 
     __CLR4_4_1sarsarle6qeamk.R.inc(36738);assertEquals(0L, field.remainder(60L)); 
 }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1sarsarle6qeamk.R.inc(36740);try{__CLR4_4_1sarsarle6qeamk.R.inc(36739);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1sarsarle6qeamk.R.inc(36742);try{__CLR4_4_1sarsarle6qeamk.R.inc(36741);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36743);
            __CLR4_4_1sarsarle6qeamk.R.inc(36744);return (int) (instant / 60L);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36745);
            __CLR4_4_1sarsarle6qeamk.R.inc(36746);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36747);
            __CLR4_4_1sarsarle6qeamk.R.inc(36748);return 59;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1sarsarle6qeamk.R.inc(36750);try{__CLR4_4_1sarsarle6qeamk.R.inc(36749);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36751);
            __CLR4_4_1sarsarle6qeamk.R.inc(36752);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36753);
            __CLR4_4_1sarsarle6qeamk.R.inc(36754);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1sarsarle6qeamk.R.inc(36756);try{__CLR4_4_1sarsarle6qeamk.R.inc(36755);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36757);
            __CLR4_4_1sarsarle6qeamk.R.inc(36758);return true;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36759);
            __CLR4_4_1sarsarle6qeamk.R.inc(36760);return 60;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36761);
            __CLR4_4_1sarsarle6qeamk.R.inc(36762);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36763);
            __CLR4_4_1sarsarle6qeamk.R.inc(36764);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36765);
            __CLR4_4_1sarsarle6qeamk.R.inc(36766);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36767);
            __CLR4_4_1sarsarle6qeamk.R.inc(36768);add_int++;
            __CLR4_4_1sarsarle6qeamk.R.inc(36769);return instant + (value * 60L);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36770);
            __CLR4_4_1sarsarle6qeamk.R.inc(36771);add_long++;
            __CLR4_4_1sarsarle6qeamk.R.inc(36772);return instant + (value * 60L);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36773);
            __CLR4_4_1sarsarle6qeamk.R.inc(36774);difference_long++;
            __CLR4_4_1sarsarle6qeamk.R.inc(36775);return 30;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1sarsarle6qeamk.R.inc(36777);try{__CLR4_4_1sarsarle6qeamk.R.inc(36776);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36778);
            __CLR4_4_1sarsarle6qeamk.R.inc(36779);return true;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36780);
            __CLR4_4_1sarsarle6qeamk.R.inc(36781);return 0;  // this is zero
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36782);
            __CLR4_4_1sarsarle6qeamk.R.inc(36783);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36784);
            __CLR4_4_1sarsarle6qeamk.R.inc(36785);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36786);
            __CLR4_4_1sarsarle6qeamk.R.inc(36787);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36788);
            __CLR4_4_1sarsarle6qeamk.R.inc(36789);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36790);
            __CLR4_4_1sarsarle6qeamk.R.inc(36791);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36792);
            __CLR4_4_1sarsarle6qeamk.R.inc(36793);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1sarsarle6qeamk.R.inc(36795);try{__CLR4_4_1sarsarle6qeamk.R.inc(36794);
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36796);
            __CLR4_4_1sarsarle6qeamk.R.inc(36797);return false;  // this is false
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1sarsarle6qeamk.R.inc(36798);
            __CLR4_4_1sarsarle6qeamk.R.inc(36799);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36800);
            __CLR4_4_1sarsarle6qeamk.R.inc(36801);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36802);
            __CLR4_4_1sarsarle6qeamk.R.inc(36803);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36804);
            __CLR4_4_1sarsarle6qeamk.R.inc(36805);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36806);
            __CLR4_4_1sarsarle6qeamk.R.inc(36807);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36808);
            __CLR4_4_1sarsarle6qeamk.R.inc(36809);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1sarsarle6qeamk.R.inc(36810);
            __CLR4_4_1sarsarle6qeamk.R.inc(36811);return 0;
        }finally{__CLR4_4_1sarsarle6qeamk.R.flushNeeded();}}
    }

}

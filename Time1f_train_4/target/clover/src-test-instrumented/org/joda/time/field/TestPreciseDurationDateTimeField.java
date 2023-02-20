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
public class TestPreciseDurationDateTimeField extends TestCase {static class __CLR4_4_1scbscble6rjdl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,36880,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36731);
        __CLR4_4_1scbscble6rjdl2.R.inc(36732);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36733);
        __CLR4_4_1scbscble6rjdl2.R.inc(36734);return new TestSuite(TestPreciseDurationDateTimeField.class);
    }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}

    public TestPreciseDurationDateTimeField(String name) {
        super(name);__CLR4_4_1scbscble6rjdl2.R.inc(36736);try{__CLR4_4_1scbscble6rjdl2.R.inc(36735);
    }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1scbscble6rjdl2.R.inc(36737);
    }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1scbscble6rjdl2.R.inc(36738);
    }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_convertText1222() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnz4g5scj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_convertText1222",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnz4g5scj(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36739); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36740);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36741);assertEquals(0, field.convertText("0", null)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36742);assertEquals(29, field.convertText("29", null)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36743);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36744);field.convertText("2A", null); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36745);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1scbscble6rjdl2.R.inc(36746);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36747);field.convertText(null, null); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36748);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_constructor1223() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhhz56sct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_constructor1223",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhhz56sct(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36749); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36750);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36751);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36752);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36753);field = new MockPreciseDurationDateTimeField(null, null); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36754);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1scbscble6rjdl2.R.inc(36755);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36756);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36757);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1scbscble6rjdl2.R.inc(36758);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36759);field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36760);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_isLenient1224() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kcrg5msd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_isLenient1224",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kcrg5msd5(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36761); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36762);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36763);assertEquals(false, field.isLenient()); 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_set_long_int1225() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11waov3sd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_long_int1225",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11waov3sd8(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36764); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36765);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36766);assertEquals(0, field.set(120L, 0)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36767);assertEquals(29 * 60, field.set(120L, 29)); 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_roundCeiling_long1226() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bsagdnsdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_roundCeiling_long1226",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bsagdnsdc(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36768); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36769);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36770);assertEquals(-60L, field.roundCeiling(-61L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36771);assertEquals(-60L, field.roundCeiling(-60L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36772);assertEquals(0L, field.roundCeiling(-59L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36773);assertEquals(0L, field.roundCeiling(-1L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36774);assertEquals(0L, field.roundCeiling(0L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36775);assertEquals(60L, field.roundCeiling(1L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36776);assertEquals(60L, field.roundCeiling(29L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36777);assertEquals(60L, field.roundCeiling(30L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36778);assertEquals(60L, field.roundCeiling(31L)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36779);assertEquals(60L, field.roundCeiling(60L)); 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_add_long_int1227() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d195osdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_add_long_int1227",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d195osdo(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36780); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36781);MockCountingDurationField.add_int = 0; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36782);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36783);assertEquals(61, field.add(1L, 1)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36784);assertEquals(1, MockCountingDurationField.add_int); 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 


public void test_set_RP_int_intarray_int1228() {__CLR4_4_1scbscble6rjdl2.R.globalSliceStart(getClass().getName(),36785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12svn5dsdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1scbscble6rjdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1scbscble6rjdl2.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationDateTimeField.test_set_RP_int_intarray_int1228",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12svn5dsdt(){try{__CLR4_4_1scbscble6rjdl2.R.inc(36785); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36786);BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36787);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36788);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36789);int[] result = field.set(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36790);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36791);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36792);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36793);result = field.set(new TimeOfDay(), 2, values, 29); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36794);assertEquals(true, Arrays.equals(result, expected)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36795);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36796);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36797);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36798);field.set(new TimeOfDay(), 2, values, 60); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36799);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1scbscble6rjdl2.R.inc(36800);assertEquals(true, Arrays.equals(values, expected)); 
     __CLR4_4_1scbscble6rjdl2.R.inc(36801);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36802);expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1scbscble6rjdl2.R.inc(36803);try { 
         __CLR4_4_1scbscble6rjdl2.R.inc(36804);field.set(new TimeOfDay(), 2, values, -1); 
         __CLR4_4_1scbscble6rjdl2.R.inc(36805);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1scbscble6rjdl2.R.inc(36806);assertEquals(true, Arrays.equals(values, expected)); 
 }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.seconds()));__CLR4_4_1scbscble6rjdl2.R.inc(36808);try{__CLR4_4_1scbscble6rjdl2.R.inc(36807);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);__CLR4_4_1scbscble6rjdl2.R.inc(36810);try{__CLR4_4_1scbscble6rjdl2.R.inc(36809);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public int get(long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36811);
            __CLR4_4_1scbscble6rjdl2.R.inc(36812);return (int) (instant / 60L);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36813);
            __CLR4_4_1scbscble6rjdl2.R.inc(36814);return new MockCountingDurationField(DurationFieldType.minutes());
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public int getMaximumValue() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36815);
            __CLR4_4_1scbscble6rjdl2.R.inc(36816);return 59;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();__CLR4_4_1scbscble6rjdl2.R.inc(36818);try{__CLR4_4_1scbscble6rjdl2.R.inc(36817);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36819);
            __CLR4_4_1scbscble6rjdl2.R.inc(36820);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36821);
            __CLR4_4_1scbscble6rjdl2.R.inc(36822);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1scbscble6rjdl2.R.inc(36824);try{__CLR4_4_1scbscble6rjdl2.R.inc(36823);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36825);
            __CLR4_4_1scbscble6rjdl2.R.inc(36826);return true;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36827);
            __CLR4_4_1scbscble6rjdl2.R.inc(36828);return 60;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36829);
            __CLR4_4_1scbscble6rjdl2.R.inc(36830);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36831);
            __CLR4_4_1scbscble6rjdl2.R.inc(36832);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36833);
            __CLR4_4_1scbscble6rjdl2.R.inc(36834);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36835);
            __CLR4_4_1scbscble6rjdl2.R.inc(36836);add_int++;
            __CLR4_4_1scbscble6rjdl2.R.inc(36837);return instant + (value * 60L);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36838);
            __CLR4_4_1scbscble6rjdl2.R.inc(36839);add_long++;
            __CLR4_4_1scbscble6rjdl2.R.inc(36840);return instant + (value * 60L);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36841);
            __CLR4_4_1scbscble6rjdl2.R.inc(36842);difference_long++;
            __CLR4_4_1scbscble6rjdl2.R.inc(36843);return 30;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1scbscble6rjdl2.R.inc(36845);try{__CLR4_4_1scbscble6rjdl2.R.inc(36844);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36846);
            __CLR4_4_1scbscble6rjdl2.R.inc(36847);return true;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36848);
            __CLR4_4_1scbscble6rjdl2.R.inc(36849);return 0;  // this is zero
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36850);
            __CLR4_4_1scbscble6rjdl2.R.inc(36851);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36852);
            __CLR4_4_1scbscble6rjdl2.R.inc(36853);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36854);
            __CLR4_4_1scbscble6rjdl2.R.inc(36855);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36856);
            __CLR4_4_1scbscble6rjdl2.R.inc(36857);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36858);
            __CLR4_4_1scbscble6rjdl2.R.inc(36859);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36860);
            __CLR4_4_1scbscble6rjdl2.R.inc(36861);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1scbscble6rjdl2.R.inc(36863);try{__CLR4_4_1scbscble6rjdl2.R.inc(36862);
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36864);
            __CLR4_4_1scbscble6rjdl2.R.inc(36865);return false;  // this is false
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1scbscble6rjdl2.R.inc(36866);
            __CLR4_4_1scbscble6rjdl2.R.inc(36867);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36868);
            __CLR4_4_1scbscble6rjdl2.R.inc(36869);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36870);
            __CLR4_4_1scbscble6rjdl2.R.inc(36871);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36872);
            __CLR4_4_1scbscble6rjdl2.R.inc(36873);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36874);
            __CLR4_4_1scbscble6rjdl2.R.inc(36875);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36876);
            __CLR4_4_1scbscble6rjdl2.R.inc(36877);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1scbscble6rjdl2.R.inc(36878);
            __CLR4_4_1scbscble6rjdl2.R.inc(36879);return 0;
        }finally{__CLR4_4_1scbscble6rjdl2.R.flushNeeded();}}
    }

}

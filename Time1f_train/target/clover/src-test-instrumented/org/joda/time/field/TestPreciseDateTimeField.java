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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1tvqtvqlc8axeyx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,38869,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38726);
        __CLR4_4_1tvqtvqlc8axeyx.R.inc(38727);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38728);
        __CLR4_4_1tvqtvqlc8axeyx.R.inc(38729);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1tvqtvqlc8axeyx.R.inc(38731);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38730);
    }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38732);
    }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38733);
    }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_constructor193() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i6xhzvtvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor193",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i6xhzvtvy(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38734); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38735);BaseDateTimeField field = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), ISOChronology.getInstanceUTC().millis(), ISOChronology.getInstanceUTC().hours()); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38736);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38737);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38738);field = new PreciseDateTimeField(null, null, null); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38739);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38740);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38741);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38742);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38743);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38744);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38745);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38746);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38747);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38748);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38749);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38750);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38751);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_getMaximumValue601() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shz7x8twg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shz7x8twg(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38752); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38753);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38754);assertEquals(59, field.getMaximumValue()); 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_addWrapField_long_int1066() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7jxu3twj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int1066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7jxu3twj(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38755); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38756);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38757);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38758);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38759);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_getRange1083() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7ewzvtwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7ewzvtwo(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38760); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38761);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38762);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_set_long_String1115() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6z3zftwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String1115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6z3zftwr(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38763); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38764);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38765);assertEquals(0, field.set(0L, "0")); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38766);assertEquals(29 * 60, field.set(0L, "29")); 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale1275() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8nln6twv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale1275",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8nln6twv(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38767); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38768);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38769);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38770);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 


public void test_add_RP_int_intarray_int1703() {__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceStart(getClass().getName(),38771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19yvzxstwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tvqtvqlc8axeyx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tvqtvqlc8axeyx.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_add_RP_int_intarray_int1703",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19yvzxstwz(){try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38771); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38772);int[] values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38773);int[] expected = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38774);BaseDateTimeField field = new MockStandardDateTimeField(); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38775);int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38776);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38777);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38778);expected = new int[] { 10, 20, 31, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38779);result = field.add(new TimeOfDay(), 2, values, 1); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38780);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38781);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38782);expected = new int[] { 10, 21, 0, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38783);result = field.add(new TimeOfDay(), 2, values, 30); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38784);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38785);values = new int[] { 23, 59, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38786);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38787);field.add(new TimeOfDay(), 2, values, 30); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38788);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38789);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38790);expected = new int[] { 10, 20, 29, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38791);result = field.add(new TimeOfDay(), 2, values, -1); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38792);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38793);values = new int[] { 10, 20, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38794);expected = new int[] { 10, 19, 59, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38795);result = field.add(new TimeOfDay(), 2, values, -31); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38796);assertEquals(true, Arrays.equals(expected, result)); 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38797);values = new int[] { 0, 0, 30, 40 }; 
     __CLR4_4_1tvqtvqlc8axeyx.R.inc(38798);try { 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38799);field.add(new TimeOfDay(), 2, values, -31); 
         __CLR4_4_1tvqtvqlc8axeyx.R.inc(38800);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1tvqtvqlc8axeyx.R.inc(38802);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38801);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1tvqtvqlc8axeyx.R.inc(38804);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38803);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1tvqtvqlc8axeyx.R.inc(38806);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38805);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38807);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38808);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38809);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38810);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1tvqtvqlc8axeyx.R.inc(38812);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38811);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38813);this.unit = unit;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38814);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38815);return true;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38816);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38817);return unit;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38818);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38819);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38820);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38821);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38822);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38823);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38824);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38825);add_int++;
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38826);return instant + (value * 60L);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38827);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38828);add_long++;
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38829);return instant + (value * 60L);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38830);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38831);difference_long++;
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38832);return 30;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tvqtvqlc8axeyx.R.inc(38834);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38833);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38835);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38836);return true;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38837);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38838);return 0;  // this is zero
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38839);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38840);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38841);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38842);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38843);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38844);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38845);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38846);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38847);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38848);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38849);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38850);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1tvqtvqlc8axeyx.R.inc(38852);try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38851);
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38853);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38854);return false;  // this is false
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38855);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38856);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38857);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38858);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38859);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38860);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38861);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38862);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38863);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38864);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38865);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38866);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1tvqtvqlc8axeyx.R.inc(38867);
            __CLR4_4_1tvqtvqlc8axeyx.R.inc(38868);return 0;
        }finally{__CLR4_4_1tvqtvqlc8axeyx.R.flushNeeded();}}
    }

}

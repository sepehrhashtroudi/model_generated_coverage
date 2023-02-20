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
public class TestPreciseDateTimeField extends TestCase {static class __CLR4_4_1s2es2ele6qsfks{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,36487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36374);
        __CLR4_4_1s2es2ele6qsfks.R.inc(36375);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36376);
        __CLR4_4_1s2es2ele6qsfks.R.inc(36377);return new TestSuite(TestPreciseDateTimeField.class);
    }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}

    public TestPreciseDateTimeField(String name) {
        super(name);__CLR4_4_1s2es2ele6qsfks.R.inc(36379);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36378);
    }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36380);
    }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36381);
    }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_getRange923() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abj1rhs2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getRange923",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abj1rhs2m(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36382); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36383);PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36384);assertEquals(60, field.getRange()); 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 


public void test_constructor924() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyf7zfs2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_constructor924",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyf7zfs2p(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36385); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36386);BaseDateTimeField field = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), ISOChronology.getInstanceUTC().millis(), ISOChronology.getInstanceUTC().hours()); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36387);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36388);try { 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36389);field = new PreciseDateTimeField(null, null, null); 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36391);try { 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36392);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36393);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36394);try { 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36395);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36396);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36397);try { 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36398);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36399);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36400);try { 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36401);field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         __CLR4_4_1s2es2ele6qsfks.R.inc(36402);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 


public void test_getAsShortText_long_Locale925() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145qvmxs37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getAsShortText_long_Locale925",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145qvmxs37(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36403); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36404);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36405);assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36406);assertEquals("29", field.getAsShortText(60L * 29, null)); 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 


public void test_addWrapField_long_int926() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqkwwls3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_addWrapField_long_int926",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqkwwls3b(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36407); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36408);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36409);assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36410);assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36411);assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 


public void test_set_long_String927() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys6glhs3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_set_long_String927",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys6glhs3g(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36412); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36413);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36414);assertEquals(0, field.set(0L, "0")); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36415);assertEquals(29 * 60, field.set(0L, "29")); 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 


public void test_getMaximumValue928() {__CLR4_4_1s2es2ele6qsfks.R.globalSliceStart(getClass().getName(),36416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqxrv8s3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s2es2ele6qsfks.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s2es2ele6qsfks.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDateTimeField.test_getMaximumValue928",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqxrv8s3k(){try{__CLR4_4_1s2es2ele6qsfks.R.inc(36416); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36417);BaseDateTimeField field = new MockPreciseDateTimeField(); 
     __CLR4_4_1s2es2ele6qsfks.R.inc(36418);assertEquals(59, field.getMaximumValue()); 
 }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}} 

    

    

    

    

    

    

    

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
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));__CLR4_4_1s2es2ele6qsfks.R.inc(36420);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36419);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);__CLR4_4_1s2es2ele6qsfks.R.inc(36422);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36421);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_1s2es2ele6qsfks.R.inc(36424);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36423);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public DurationField getDurationField() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36425);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36426);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public DurationField getRangeDurationField() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36427);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36428);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);__CLR4_4_1s2es2ele6qsfks.R.inc(36430);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36429);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36431);this.unit = unit;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36432);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36433);return true;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36434);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36435);return unit;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36436);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36437);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36438);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36439);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36440);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36441);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36442);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36443);add_int++;
            __CLR4_4_1s2es2ele6qsfks.R.inc(36444);return instant + (value * 60L);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36445);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36446);add_long++;
            __CLR4_4_1s2es2ele6qsfks.R.inc(36447);return instant + (value * 60L);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36448);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36449);difference_long++;
            __CLR4_4_1s2es2ele6qsfks.R.inc(36450);return 30;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s2es2ele6qsfks.R.inc(36452);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36451);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36453);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36454);return true;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36455);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36456);return 0;  // this is zero
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36457);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36458);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36459);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36460);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36461);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36462);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36463);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36464);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36465);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36466);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36467);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36468);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1s2es2ele6qsfks.R.inc(36470);try{__CLR4_4_1s2es2ele6qsfks.R.inc(36469);
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public boolean isPrecise() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36471);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36472);return false;  // this is false
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getUnitMillis() {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36473);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36474);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36475);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36476);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(int value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36477);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36478);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getMillis(long value, long instant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36479);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36480);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, int value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36481);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36482);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long add(long instant, long value) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36483);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36484);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1s2es2ele6qsfks.R.inc(36485);
            __CLR4_4_1s2es2ele6qsfks.R.inc(36486);return 0;
        }finally{__CLR4_4_1s2es2ele6qsfks.R.flushNeeded();}}
    }

}

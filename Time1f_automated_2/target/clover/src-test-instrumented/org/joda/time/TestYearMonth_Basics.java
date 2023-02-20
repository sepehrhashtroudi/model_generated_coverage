/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1k46k46le6nl8ic{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26070);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26071);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26072);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26073);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1k46k46le6nl8ic.R.inc(26075);try{__CLR4_4_1k46k46le6nl8ic.R.inc(26074);
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26076);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26077);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26078);zone = DateTimeZone.getDefault();
        __CLR4_4_1k46k46le6nl8ic.R.inc(26079);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26080);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26081);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k46k46le6nl8ic.R.inc(26082);DateTimeZone.setDefault(zone);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26083);zone = null;
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testGetFieldTypes161() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivbxsk4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes161",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivbxsk4k(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26084); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26085);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26086);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26087);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26088);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26089);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testWithChronologyRetainFields_invalidInNewChrono162() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fg3w7wk4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono162",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fg3w7wk4q(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26090); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26091);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26092);try { 
         __CLR4_4_1k46k46le6nl8ic.R.inc(26093);base.withChronologyRetainFields(ISO_UTC); 
         __CLR4_4_1k46k46le6nl8ic.R.inc(26094);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testMinusMonths_int163() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3ndysk4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int163",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3ndysk4v(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26095); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26096);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26097);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26098);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26099);assertEquals(expected, result); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26100);result = test.minusMonths(0); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26101);assertSame(test, result); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testMinus_RP164() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgags7k52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP164",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgags7k52(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26102); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26103);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26104);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26105);YearMonth expected = new YearMonth(2001, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26106);assertEquals(expected, result); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26107);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26108);assertSame(test, result); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testPlus_RP165() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e15pjuk59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP165",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e15pjuk59(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26109); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26110);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26111);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26112);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26113);assertEquals(expected, result); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26114);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26115);assertSame(test, result); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testPlusYears_int166() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opq85ak5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int166",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opq85ak5g(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26116); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26117);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26118);YearMonth result = test.plusYears(1); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26119);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26120);assertEquals(expected, result); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26121);result = test.plusYears(0); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26122);assertSame(test, result); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testPlusMonths_int167() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1enthw6k5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusMonths_int167",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1enthw6k5n(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26123); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26124);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26125);YearMonth result = test.plusMonths(1); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26126);YearMonth expected = new YearMonth(2002, 6, BuddhistChronology.getInstance()); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26127);assertEquals(expected, result); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26128);result = test.plusMonths(0); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26129);assertSame(test, result); 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
public void testToLocalDate169() {__CLR4_4_1k46k46le6nl8ic.R.globalSliceStart(getClass().getName(),26130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7znxrk5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k46k46le6nl8ic.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k46k46le6nl8ic.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToLocalDate169",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7znxrk5u(){try{__CLR4_4_1k46k46le6nl8ic.R.inc(26130); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26131);YearMonth base = new YearMonth(2005, 6, COPTIC_UTC); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26132);LocalDate test = base.toLocalDate(2009); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26133);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); 
     __CLR4_4_1k46k46le6nl8ic.R.inc(26134);try { 
         __CLR4_4_1k46k46le6nl8ic.R.inc(26135);base.toLocalDate(0); 
         __CLR4_4_1k46k46le6nl8ic.R.inc(26136);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26137);
            __CLR4_4_1k46k46le6nl8ic.R.inc(26138);return COPTIC_UTC;
        }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26139);
            __CLR4_4_1k46k46le6nl8ic.R.inc(26140);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26141);
            __CLR4_4_1k46k46le6nl8ic.R.inc(26142);return new int[] {1970, 6};
        }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1k46k46le6nl8ic.R.inc(26143);
        __CLR4_4_1k46k46le6nl8ic.R.inc(26144);assertEquals(year, test.getYear());
        __CLR4_4_1k46k46le6nl8ic.R.inc(26145);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1k46k46le6nl8ic.R.flushNeeded();}}
}

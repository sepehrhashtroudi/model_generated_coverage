/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1ovtovtle6qea92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,32483,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1ovtovtle6qea92.R.inc(32249);
        __CLR4_4_1ovtovtle6qea92.R.inc(32250);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ovtovtle6qea92.R.inc(32251);
        __CLR4_4_1ovtovtle6qea92.R.inc(32252);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1ovtovtle6qea92.R.inc(32254);try{__CLR4_4_1ovtovtle6qea92.R.inc(32253);
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ovtovtle6qea92.R.inc(32255);
        __CLR4_4_1ovtovtle6qea92.R.inc(32256);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ovtovtle6qea92.R.inc(32257);zone = DateTimeZone.getDefault();
        __CLR4_4_1ovtovtle6qea92.R.inc(32258);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ovtovtle6qea92.R.inc(32259);
        __CLR4_4_1ovtovtle6qea92.R.inc(32260);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ovtovtle6qea92.R.inc(32261);DateTimeZone.setDefault(zone);
        __CLR4_4_1ovtovtle6qea92.R.inc(32262);zone = null;
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet9() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17wfm6cow7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17wfm6cow7(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32263); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32264);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32265);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32266);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32267);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32268);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32269);test.get(null); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32270);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32271);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32272);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32273);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testEqualsHashCode13() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ieqfqjowi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ieqfqjowi(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32274); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32275);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32276);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32277);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32278);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32279);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32280);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32281);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32282);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32283);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32284);YearMonthDay test3 = new YearMonthDay(1971, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32285);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32286);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32287);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32288);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32289);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32290);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32291);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32292);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32293);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testGetField24() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gz4uf5ox2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gz4uf5ox2(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32294); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32295);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32296);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32297);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32298);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32299);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32300);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32301);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32302);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono30() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r4zo67oxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r4zo67oxb(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32303); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32304);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32305);YearMonthDay test = base.withChronologyRetainFields(null); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32306);check(base, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32307);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32308);check(test, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32309);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testGetFieldTypes31() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9t2i0oxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9t2i0oxi(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32310); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32311);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32312);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32313);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32314);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32315);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32316);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono32() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fjo68oxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fjo68oxp(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32317); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32318);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32319);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32320);assertSame(base, test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testWithField433() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1918gljoxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1918gljoxt(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32321); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32322);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32323);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32324);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32325);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testWithField134() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbks7oxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField134",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbks7oxy(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32326); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32327);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32328);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32329);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32330);assertEquals(new YearMonthDay(2006, 6, 9), result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testMinusMonths_int35() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15faf62oy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15faf62oy3(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32331); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32332);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32333);YearMonthDay result = test.minusMonths(1); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32334);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32335);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32336);result = test.minusMonths(0); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32337);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testMinus_RP36() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1kp8poya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1kp8poya(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32338); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32339);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32340);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32341);YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32342);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32343);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32344);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testPlus_RP37() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvltcsoyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvltcsoyh(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32345); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32346);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32347);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32348);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32349);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32350);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32351);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testPlusYears_int38() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cya1yoyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cya1yoyo(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32352); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32353);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32354);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32355);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32356);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32357);result = test.plusYears(0); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32358);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testPlusMonths_int39() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ixqosoyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ixqosoyv(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32359); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32360);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32361);YearMonthDay result = test.plusMonths(1); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32362);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32363);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32364);result = test.plusMonths(0); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32365);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testMinusYears_int40() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n42rqjoz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n42rqjoz2(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32366); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32367);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32368);YearMonthDay result = test.minusYears(1); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32369);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32370);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32371);result = test.minusYears(0); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32372);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testMinusDays_int41() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcpug9oz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcpug9oz9(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32373); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32374);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32375);YearMonthDay result = test.minusDays(1); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32376);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32377);assertEquals(expected, result); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32378);result = test.minusDays(0); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32379);assertSame(test, result); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testProperty42() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ki90r8ozg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ki90r8ozg(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32380); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32381);YearMonthDay test = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32382);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32383);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32384);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32385);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32386);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32387);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32388);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32389);test.property(null); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToLocalDate43() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbtuz2ozr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbtuz2ozr(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32391); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32392);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32393);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32394);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToDateTimeAtMidnight_nullZone44() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dd982ozv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dd982ozv(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32395); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32396);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32397);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32398);check(base, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32399);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime45() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsxupfp00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsxupfp00(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32400); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32401);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32402);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32403);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32404);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32405);check(base, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32406);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32407);expected = expected.year().setCopy(2005); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32408);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32409);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32410);assertEquals(expected, test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToDateMidnight46() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1okwecsp0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1okwecsp0b(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32411); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32412);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32413);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32414);check(base, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32415);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToInterval47() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zfqv8p0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zfqv8p0g(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32416); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32417);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32418);Interval test = base.toInterval(); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32419);check(base, 2005, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32420);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32421);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32422);Interval expected = new Interval(start, end); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32423);assertEquals(expected, test); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testWithers48() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13bqghzp0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13bqghzp0o(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32424); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32425);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32426);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32427);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32428);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32429);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32430);test.withMonthOfYear(0); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32431);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32432);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32433);test.withMonthOfYear(13); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32434);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToString49() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153bg1ip0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153bg1ip0z(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32435); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32436);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32437);assertEquals("2002-06-09", test.toString()); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testToString_String_Locale1124() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5825sp12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5825sp12(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32438); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32439);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32440);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32441);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32442);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32443);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32444);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 


public void testCompareTo1414() {__CLR4_4_1ovtovtle6qea92.R.globalSliceStart(getClass().getName(),32445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gc6w5p19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovtovtle6qea92.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovtovtle6qea92.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo1414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gc6w5p19(){try{__CLR4_4_1ovtovtle6qea92.R.inc(32445); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32446);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32447);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32448);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32449);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32450);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32451);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32452);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32453);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32454);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32455);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32456);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32457);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32458);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32459);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1ovtovtle6qea92.R.inc(32460);int[] values = new int[] { 2005, 6, 2 }; 
     __CLR4_4_1ovtovtle6qea92.R.inc(32461);Partial p = new Partial(types, values); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32462);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32463);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32464);test1.compareTo(null); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32465);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32466);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32467);test1.compareTo(new TimeOfDay()); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32468);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1ovtovtle6qea92.R.inc(32469);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1ovtovtle6qea92.R.inc(32470);try { 
         __CLR4_4_1ovtovtle6qea92.R.inc(32471);new YearMonthDay(1970, 6, 9).compareTo(partial); 
         __CLR4_4_1ovtovtle6qea92.R.inc(32472);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1ovtovtle6qea92.R.inc(32473);
            __CLR4_4_1ovtovtle6qea92.R.inc(32474);return COPTIC_UTC;
        }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1ovtovtle6qea92.R.inc(32475);
            __CLR4_4_1ovtovtle6qea92.R.inc(32476);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1ovtovtle6qea92.R.inc(32477);
            __CLR4_4_1ovtovtle6qea92.R.inc(32478);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}
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
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1ovtovtle6qea92.R.inc(32479);
        __CLR4_4_1ovtovtle6qea92.R.inc(32480);assertEquals(hour, test.getYear());
        __CLR4_4_1ovtovtle6qea92.R.inc(32481);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1ovtovtle6qea92.R.inc(32482);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1ovtovtle6qea92.R.flushNeeded();}}
}

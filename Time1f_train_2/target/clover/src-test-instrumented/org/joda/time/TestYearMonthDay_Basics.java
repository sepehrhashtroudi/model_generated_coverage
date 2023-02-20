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
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1oqpoqple6qsfbt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,32283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32065);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32066);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32067);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32068);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1oqpoqple6qsfbt.R.inc(32070);try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32069);
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32071);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32072);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32073);zone = DateTimeZone.getDefault();
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32074);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32075);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32076);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32077);DateTimeZone.setDefault(zone);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32078);zone = null;
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet3() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1refex6or3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1refex6or3(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32079); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32080);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32081);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32082);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32083);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32084);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32085);test.get(null); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32086);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32087);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32088);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32089);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testEqualsHashCode7() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hf5e2aore();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hf5e2aore(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32090); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32091);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32092);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32093);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32094);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32095);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32096);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32097);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32098);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32099);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32100);YearMonthDay test3 = new YearMonthDay(1971, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32101);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32102);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32103);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32104);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32105);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32106);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32107);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32108);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32109);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testIsBefore_YMD9() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqejg4ory();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqejg4ory(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32110); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32111);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32112);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32113);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32114);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32115);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32116);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32117);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32118);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32119);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32120);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32121);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32122);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32123);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32124);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32125);new YearMonthDay(2005, 7, 2).isBefore(null); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32126);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testGetField18() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xozvssosf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xozvssosf(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32127); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32128);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32129);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32130);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32131);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32132);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32133);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32134);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32135);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testWithField322() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5vewooso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5vewooso(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32136); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32137);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32138);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32139);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32140);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testGetFieldTypes24() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ay2bwost();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ay2bwost(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32141); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32142);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32143);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32144);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32145);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32146);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32147);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono25() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1reeoccot0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1reeoccot0(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32148); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32149);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32150);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32151);assertSame(base, test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testWithField426() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t03grnot4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t03grnot4(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32152); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32153);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32154);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32155);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32156);assertSame(test, result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testWithField127() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcjfdxot9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcjfdxot9(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32157); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32158);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32159);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32160);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32161);assertEquals(new YearMonthDay(2006, 6, 9), result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testMinusMonths_int28() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejkl02ote();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejkl02ote(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32162); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32163);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32164);YearMonthDay result = test.minusMonths(1); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32165);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32166);assertEquals(expected, result); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32167);result = test.minusMonths(0); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32168);assertSame(test, result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testPlus_RP29() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nque7otl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nque7otl(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32169); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32170);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32171);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32172);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32173);assertEquals(expected, result); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32174);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32175);assertSame(test, result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testPlusDays_int30() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjy6afots();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjy6afots(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32176); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32177);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32178);YearMonthDay result = test.plusDays(1); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32179);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32180);assertEquals(expected, result); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32181);result = test.plusDays(0); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32182);assertSame(test, result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testMinusYears_int31() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cs60jotz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cs60jotz(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32183); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32184);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32185);YearMonthDay result = test.minusYears(1); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32186);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32187);assertEquals(expected, result); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32188);result = test.minusYears(0); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32189);assertSame(test, result); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testProperty32() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt04odou6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt04odou6(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32190); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32191);YearMonthDay test = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32192);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32193);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32194);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32195);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32196);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32197);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32198);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32199);test.property(null); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32200);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testToDateTimeAtMidnight33() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxsegiouh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxsegiouh(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32201); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32202);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32203);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32204);check(base, 2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32205);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testToDateTimeAtMidnight_nullZone34() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v385rloum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v385rloum(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32206); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32207);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32208);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32209);check(base, 2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32210);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testToDateTimeAtCurrentTime35() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1332y5wour();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1332y5wour(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32211); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32212);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32213);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32214);DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32215);DateTime test = base.toDateTimeAtCurrentTime(); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32216);check(base, 2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32217);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32218);expected = expected.year().setCopy(2005); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32219);expected = expected.monthOfYear().setCopy(6); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32220);expected = expected.dayOfMonth().setCopy(9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32221);assertEquals(expected, test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testToDateMidnight36() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqcr2tov2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqcr2tov2(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32222); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32223);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32224);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32225);check(base, 2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32226);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testWithers37() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqiq55ov7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqiq55ov7(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32227); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32228);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32229);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32230);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32231);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32232);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32233);test.withMonthOfYear(0); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32234);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32235);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32236);test.withMonthOfYear(13); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32237);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testToDateTime_TOD_nullZone812() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180fhnkovi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone812",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180fhnkovi(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32238); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32239);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32240);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32241);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32242);check(base, 2005, 6, 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32243);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32244);assertEquals(expected, test); 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 


public void testCompareTo1406() {__CLR4_4_1oqpoqple6qsfbt.R.globalSliceStart(getClass().getName(),32245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qo75uqovp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1oqpoqple6qsfbt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1oqpoqple6qsfbt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo1406",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qo75uqovp(){try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32245); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32246);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32247);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32248);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32249);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32250);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32251);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32252);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32253);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32254);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32255);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32256);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32257);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32258);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32259);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32260);int[] values = new int[] { 2005, 6, 2 }; 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32261);Partial p = new Partial(types, values); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32262);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32263);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32264);test1.compareTo(null); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32265);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32266);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32267);test1.compareTo(new TimeOfDay()); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32268);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32269);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1oqpoqple6qsfbt.R.inc(32270);try { 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32271);new YearMonthDay(1970, 6, 9).compareTo(partial); 
         __CLR4_4_1oqpoqple6qsfbt.R.inc(32272);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32273);
            __CLR4_4_1oqpoqple6qsfbt.R.inc(32274);return COPTIC_UTC;
        }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32275);
            __CLR4_4_1oqpoqple6qsfbt.R.inc(32276);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32277);
            __CLR4_4_1oqpoqple6qsfbt.R.inc(32278);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}
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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1oqpoqple6qsfbt.R.inc(32279);
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32280);assertEquals(hour, test.getYear());
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32281);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1oqpoqple6qsfbt.R.inc(32282);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1oqpoqple6qsfbt.R.flushNeeded();}}
}

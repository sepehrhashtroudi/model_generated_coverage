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
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_1or4or4le6rcm93{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1or4or4le6rcm93.R.inc(32080);
        __CLR4_4_1or4or4le6rcm93.R.inc(32081);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1or4or4le6rcm93.R.inc(32082);
        __CLR4_4_1or4or4le6rcm93.R.inc(32083);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_1or4or4le6rcm93.R.inc(32085);try{__CLR4_4_1or4or4le6rcm93.R.inc(32084);
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1or4or4le6rcm93.R.inc(32086);
        __CLR4_4_1or4or4le6rcm93.R.inc(32087);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1or4or4le6rcm93.R.inc(32088);zone = DateTimeZone.getDefault();
        __CLR4_4_1or4or4le6rcm93.R.inc(32089);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1or4or4le6rcm93.R.inc(32090);
        __CLR4_4_1or4or4le6rcm93.R.inc(32091);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1or4or4le6rcm93.R.inc(32092);DateTimeZone.setDefault(zone);
        __CLR4_4_1or4or4le6rcm93.R.inc(32093);zone = null;
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testGet8() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5fkytori();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5fkytori(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32094); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32095);YearMonthDay test = new YearMonthDay(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32096);assertEquals(1970, test.get(DateTimeFieldType.year())); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32097);assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32098);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32099);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32100);test.get(null); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32101);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1or4or4le6rcm93.R.inc(32102);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32103);test.get(DateTimeFieldType.hourOfDay()); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32104);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testEqualsHashCode11() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owqdbhort();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owqdbhort(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32105); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32106);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32107);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32108);assertEquals(true, test1.equals(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32109);assertEquals(true, test2.equals(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32110);assertEquals(true, test1.equals(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32111);assertEquals(true, test2.equals(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32112);assertEquals(true, test1.hashCode() == test2.hashCode()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32113);assertEquals(true, test1.hashCode() == test1.hashCode()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32114);assertEquals(true, test2.hashCode() == test2.hashCode()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32115);YearMonthDay test3 = new YearMonthDay(1971, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32116);assertEquals(false, test1.equals(test3)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32117);assertEquals(false, test2.equals(test3)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32118);assertEquals(false, test3.equals(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32119);assertEquals(false, test3.equals(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32120);assertEquals(false, test1.hashCode() == test3.hashCode()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32121);assertEquals(false, test2.hashCode() == test3.hashCode()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32122);assertEquals(false, test1.equals("Hello")); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32123);assertEquals(true, test1.equals(new MockInstant())); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32124);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testIsBefore_YMD13() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6onvvosd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6onvvosd(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32125); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32126);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32127);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32128);assertEquals(false, test1.isBefore(test1a)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32129);assertEquals(false, test1a.isBefore(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32130);assertEquals(false, test1.isBefore(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32131);assertEquals(false, test1a.isBefore(test1a)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32132);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32133);assertEquals(true, test1.isBefore(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32134);assertEquals(false, test2.isBefore(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32135);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32136);assertEquals(true, test1.isBefore(test3)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32137);assertEquals(false, test3.isBefore(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32138);assertEquals(false, test3.isBefore(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32139);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32140);new YearMonthDay(2005, 7, 2).isBefore(null); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32141);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testGetField20() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz4pl1osu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz4pl1osu(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32142); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32143);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32144);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32145);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32146);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32147);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32148);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1or4or4le6rcm93.R.inc(32149);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32150);test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testWithField324() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xd8phiot3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField324",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xd8phiot3(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32151); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32152);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32153);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32154);test.withField(DateTimeFieldType.hourOfDay(), 6); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32155);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono26() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx4kdiot8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx4kdiot8(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32156); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32157);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32158);YearMonthDay test = base.withChronologyRetainFields(null); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32159);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32160);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32161);check(test, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32162);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testGetFieldTypes27() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1xypbotf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1xypbotf(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32163); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32164);YearMonthDay test = new YearMonthDay(COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32165);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32166);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32167);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32168);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32169);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testWithField128() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3jglgotm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField128",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3jglgotm(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32170); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32171);YearMonthDay test = new YearMonthDay(2004, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32172);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32173);assertEquals(new YearMonthDay(2004, 6, 9), test); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32174);assertEquals(new YearMonthDay(2006, 6, 9), result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testMinus_RP29() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2pp2lotr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2pp2lotr(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32175); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32176);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32177);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32178);YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32179);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32180);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32181);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testPlus_RP30() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114m1thoty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114m1thoty(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32182); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32183);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32184);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32185);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32186);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32187);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32188);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testPlusYears_int31() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he1hhdou5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he1hhdou5(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32189); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32190);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32191);YearMonthDay result = test.plusYears(1); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32192);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32193);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32194);result = test.plusYears(0); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32195);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testPlusMonths_int32() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d820ujouc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d820ujouc(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32196); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32197);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32198);YearMonthDay result = test.plusMonths(1); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32199);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32200);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32201);result = test.plusMonths(0); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32202);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testPlusDays_int33() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1may2nuouj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1may2nuouj(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32203); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32204);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32205);YearMonthDay result = test.plusDays(1); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32206);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32207);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32208);result = test.plusDays(0); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32209);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testMinusYears_int34() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16e7qcwouq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16e7qcwouq(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32210); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32211);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32212);YearMonthDay result = test.minusYears(1); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32213);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32214);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32215);result = test.minusYears(0); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32216);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testMinusDays_int35() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mut2moux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mut2moux(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32217); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32218);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32219);YearMonthDay result = test.minusDays(1); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32220);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32221);assertEquals(expected, result); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32222);result = test.minusDays(0); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32223);assertSame(test, result); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToLocalDate36() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqf6tyov4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqf6tyov4(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32224); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32225);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32226);LocalDate test = base.toLocalDate(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32227);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToDateTimeAtMidnight37() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txs9meov8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txs9meov8(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32228); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32229);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32230);DateTime test = base.toDateTimeAtMidnight(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32231);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32232);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToDateTimeAtMidnight_nullZone38() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i38alpovd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i38alpovd(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32233); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32234);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32235);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32236);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32237);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToDateMidnight39() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhcng8ovi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhcng8ovi(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32238); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32239);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32240);DateMidnight test = base.toDateMidnight(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32241);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32242);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToInterval40() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uqfiejovn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uqfiejovn(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32243); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32244);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32245);Interval test = base.toInterval(); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32246);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32247);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32248);DateTime end = start.plus(Period.days(1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32249);Interval expected = new Interval(start, end); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32250);assertEquals(expected, test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testWithers41() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2q81aovv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2q81aovv(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32251); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32252);YearMonthDay test = new YearMonthDay(1970, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32253);check(test.withYear(2000), 2000, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32254);check(test.withMonthOfYear(2), 1970, 2, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32255);check(test.withDayOfMonth(2), 1970, 6, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32256);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32257);test.withMonthOfYear(0); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32258);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1or4or4le6rcm93.R.inc(32259);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32260);test.withMonthOfYear(13); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32261);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToString43() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1olb8scow6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1olb8scow6(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32262); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32263);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32264);assertEquals("2002-06-09", test.toString()); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToDateTime_TOD_nullZone820() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7fhb1ow9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7fhb1ow9(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32265); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32266);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32267);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32268);DateTime test = base.toDateTime(tod, null); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32269);check(base, 2005, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32270);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32271);assertEquals(expected, test); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testToString_String_Locale1113() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ktmt68owg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ktmt68owg(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32272); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32273);YearMonthDay test = new YearMonthDay(2002, 6, 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32274);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32275);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32276);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32277);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32278);assertEquals("2002-06-09", test.toString(null, null)); 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 


public void testCompareTo1414() {__CLR4_4_1or4or4le6rcm93.R.globalSliceStart(getClass().getName(),32279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13gc6w5own();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1or4or4le6rcm93.R.rethrow($CLV_t2$);}finally{__CLR4_4_1or4or4le6rcm93.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo1414",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13gc6w5own(){try{__CLR4_4_1or4or4le6rcm93.R.inc(32279); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32280);YearMonthDay test1 = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32281);YearMonthDay test1a = new YearMonthDay(2005, 6, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32282);assertEquals(0, test1.compareTo(test1a)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32283);assertEquals(0, test1a.compareTo(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32284);assertEquals(0, test1.compareTo(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32285);assertEquals(0, test1a.compareTo(test1a)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32286);YearMonthDay test2 = new YearMonthDay(2005, 7, 2); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32287);assertEquals(-1, test1.compareTo(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32288);assertEquals(+1, test2.compareTo(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32289);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32290);assertEquals(-1, test1.compareTo(test3)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32291);assertEquals(+1, test3.compareTo(test1)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32292);assertEquals(0, test3.compareTo(test2)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32293);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1or4or4le6rcm93.R.inc(32294);int[] values = new int[] { 2005, 6, 2 }; 
     __CLR4_4_1or4or4le6rcm93.R.inc(32295);Partial p = new Partial(types, values); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32296);assertEquals(0, test1.compareTo(p)); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32297);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32298);test1.compareTo(null); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32299);fail(); 
     } catch (NullPointerException ex) { 
     } 
     __CLR4_4_1or4or4le6rcm93.R.inc(32300);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32301);test1.compareTo(new TimeOfDay()); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32302);fail(); 
     } catch (ClassCastException ex) { 
     } 
     __CLR4_4_1or4or4le6rcm93.R.inc(32303);Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     __CLR4_4_1or4or4le6rcm93.R.inc(32304);try { 
         __CLR4_4_1or4or4le6rcm93.R.inc(32305);new YearMonthDay(1970, 6, 9).compareTo(partial); 
         __CLR4_4_1or4or4le6rcm93.R.inc(32306);fail(); 
     } catch (ClassCastException ex) { 
     } 
 }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1or4or4le6rcm93.R.inc(32307);
            __CLR4_4_1or4or4le6rcm93.R.inc(32308);return COPTIC_UTC;
        }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1or4or4le6rcm93.R.inc(32309);
            __CLR4_4_1or4or4le6rcm93.R.inc(32310);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1or4or4le6rcm93.R.inc(32311);
            __CLR4_4_1or4or4le6rcm93.R.inc(32312);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}
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
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_1or4or4le6rcm93.R.inc(32313);
        __CLR4_4_1or4or4le6rcm93.R.inc(32314);assertEquals(hour, test.getYear());
        __CLR4_4_1or4or4le6rcm93.R.inc(32315);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_1or4or4le6rcm93.R.inc(32316);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_1or4or4le6rcm93.R.flushNeeded();}}
}

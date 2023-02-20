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
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_1p2yp2yle6rcmc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,32652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32506);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32507);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32508);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32509);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_1p2yp2yle6rcmc6.R.inc(32511);try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32510);
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32512);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32513);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32514);zone = DateTimeZone.getDefault();
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32515);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32516);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32517);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32518);DateTimeZone.setDefault(zone);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32519);zone = null;
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testIsAfter_YM14() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsshfnp3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsshfnp3c(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32520); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32521);YearMonth test1 = new YearMonth(2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32522);YearMonth test1a = new YearMonth(2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32523);assertEquals(false, test1.isAfter(test1a)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32524);assertEquals(false, test1a.isAfter(test1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32525);assertEquals(false, test1.isAfter(test1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32526);assertEquals(false, test1a.isAfter(test1a)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32527);YearMonth test2 = new YearMonth(2005, 7); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32528);assertEquals(false, test1.isAfter(test2)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32529);assertEquals(true, test2.isAfter(test1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32530);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32531);assertEquals(false, test1.isAfter(test3)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32532);assertEquals(true, test3.isAfter(test1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32533);assertEquals(false, test3.isAfter(test2)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32534);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32535);new YearMonth(2005, 7).isAfter(null); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32536);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testWithChronologyRetainFields_invalidInNewChrono365() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxeev5p3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono365",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxeev5p3t(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32537); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32538);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32539);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32540);base.withChronologyRetainFields(ISO_UTC); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32541);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testSerialization366() throws Exception {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlniqkp3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization366",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlniqkp3y() throws Exception{try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32542); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32543);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32544);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32545);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32546);oos.writeObject(test); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32547);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32548);oos.close(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32549);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32550);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32551);YearMonth result = (YearMonth) ois.readObject(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32552);ois.close(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32553);assertEquals(test, result); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32554);assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32555);assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32556);assertEquals(test.getChronology(), result.getChronology()); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testGetField367() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9tblxp4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField367",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9tblxp4d(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32557); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32558);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32559);assertSame(COPTIC_UTC.year(), test.getField(0)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32560);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32561);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32562);test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32563);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32564);test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testGetFieldTypes368() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyf1vdp4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes368",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyf1vdp4l(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32565); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32566);YearMonth test = new YearMonth(COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32567);DateTimeFieldType[] fields = test.getFieldTypes(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32568);assertEquals(2, fields.length); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32569);assertSame(DateTimeFieldType.year(), fields[0]); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32570);assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32571);assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testWithChronologyRetainFields_sameChrono369() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p21uxvp4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono369",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p21uxvp4s(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32572); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32573);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32574);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32575);assertSame(base, test); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testWithChronologyRetainFields_nullChrono370() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k5hmjcp4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono370",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k5hmjcp4w(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32576); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32577);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32578);YearMonth test = base.withChronologyRetainFields(null); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32579);check(base, 2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32580);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32581);check(test, 2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32582);assertEquals(ISO_UTC, test.getChronology()); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testPlusYears_int371() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwvx0ap53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int371",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwvx0ap53(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32583); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32584);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32585);YearMonth result = test.plusYears(1); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32586);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32587);assertEquals(expected, result); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32588);result = test.plusYears(0); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32589);assertSame(test, result); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testMinus_RP372() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1veg20mp5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP372",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1veg20mp5a(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32590); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32591);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32592);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32593);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32594);assertEquals(expected, result); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32595);result = test.minus((ReadablePeriod) null); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32596);assertSame(test, result); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testPlus_RP373() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wzvolp5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP373",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wzvolp5h(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32597); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32598);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32599);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32600);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32601);assertEquals(expected, result); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32602);result = test.plus((ReadablePeriod) null); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32603);assertSame(test, result); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testToInterval374() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h02w3pp5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval374",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h02w3pp5o(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32604); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32605);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32606);Interval test = base.toInterval(); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32607);check(base, 2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32608);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32609);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32610);Interval expected = new Interval(start, end); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32611);assertEquals(expected, test); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testMinusMonths_int375() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zb7m1p5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int375",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zb7m1p5w(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32612); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32613);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32614);YearMonth result = test.minusMonths(1); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32615);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32616);assertEquals(expected, result); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32617);result = test.minusMonths(0); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32618);assertSame(test, result); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testWithers376() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v89edp63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v89edp63(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32619); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32620);YearMonth test = new YearMonth(1970, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32621);check(test.withYear(2000), 2000, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32622);check(test.withMonthOfYear(2), 1970, 2); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32623);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32624);test.withMonthOfYear(0); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32625);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32626);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32627);test.withMonthOfYear(13); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32628);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testProperty377() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18hyk3p6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty377",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18hyk3p6d(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32629); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32630);YearMonth test = new YearMonth(2005, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32631);assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32632);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32633);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32634);test.property(DateTimeFieldType.millisOfDay()); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32635);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32636);try { 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32637);test.property(null); 
         __CLR4_4_1p2yp2yle6rcmc6.R.inc(32638);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 


public void testToString_String379() {__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceStart(getClass().getName(),32639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6mbgqp6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2yp2yle6rcmc6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2yp2yle6rcmc6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6mbgqp6n(){try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32639); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32640);YearMonth test = new YearMonth(2002, 6); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32641);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     __CLR4_4_1p2yp2yle6rcmc6.R.inc(32642);assertEquals("2002-06", test.toString((String) null)); 
 }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}} 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32643);
            __CLR4_4_1p2yp2yle6rcmc6.R.inc(32644);return COPTIC_UTC;
        }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32645);
            __CLR4_4_1p2yp2yle6rcmc6.R.inc(32646);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32647);
            __CLR4_4_1p2yp2yle6rcmc6.R.inc(32648);return new int[] {1970, 6};
        }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}
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
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_1p2yp2yle6rcmc6.R.inc(32649);
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32650);assertEquals(year, test.getYear());
        __CLR4_4_1p2yp2yle6rcmc6.R.inc(32651);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_1p2yp2yle6rcmc6.R.flushNeeded();}}
}

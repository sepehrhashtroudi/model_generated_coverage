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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1jkdjkdle6ndpqq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25438,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25357);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25358);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25359);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25360);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1jkdjkdle6ndpqq.R.inc(25362);try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25361);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25363);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25364);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25365);zone = DateTimeZone.getDefault();
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25366);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25367);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25368);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25369);DateTimeZone.setDefault(zone);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25370);zone = null;
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testConstructor2262() throws Throwable {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s33m0ljkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testConstructor2262",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s33m0ljkr() throws Throwable{try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25371); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25372);Partial test = new Partial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25373);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25374);assertEquals(0, test.size()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25375);test = new Partial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25376);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25377);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testConstructor263() throws Throwable {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v81gwejky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testConstructor263",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v81gwejky() throws Throwable{try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25378); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25379);Partial test = new Partial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25380);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25381);assertEquals(0, test.size()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25382);test = new Partial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25383);assertEquals(ISO_UTC, test.getChronology()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25384);assertEquals(0, test.size()); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testWithChronologyRetainFields_Chrono266() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1becirpjl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono266",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1becirpjl5(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25385); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25386);Partial base = createHourMinPartial(COPTIC_PARIS); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25387);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25388);check(base, 10, 20); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25389);assertEquals(COPTIC_UTC, base.getChronology()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25390);check(test, 10, 20); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25391);assertEquals(BUDDHIST_UTC, test.getChronology()); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testWith3f267() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j719tjlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f267",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j719tjlc(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25392); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25393);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25394);Partial result = test.with(DateTimeFieldType.era(), 1); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25395);assertEquals(2, result.size()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25396);assertEquals(1, result.get(DateTimeFieldType.era())); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25397);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25398);assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25399);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testGetFormatter3268() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ro8lqjlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ro8lqjlk(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25400); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25401);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25402);assertEquals("-W-5", test.getFormatter().print(test)); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25403);test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25404);assertEquals("---13", test.getFormatter().print(test)); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testWithFieldAdded4269() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv4yl6jlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4269",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv4yl6jlp(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25405); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25406);Partial test = createHourMinPartial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25407);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25408);assertSame(test, result); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testWithFieldAddWrapped5270() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1er2zq5jlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1er2zq5jlt(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25409); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25410);Partial test = createHourMinPartial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25411);try { 
         __CLR4_4_1jkdjkdle6ndpqq.R.inc(25412);test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         __CLR4_4_1jkdjkdle6ndpqq.R.inc(25413);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25414);check(test, 10, 20); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testWith1272() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgpnujjlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith1272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgpnujjlz(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25415); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25416);Partial test = createHourMinPartial(); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25417);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25418);check(test, 10, 20); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25419);check(result, 15, 20); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
public void testToString5273() {__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceStart(getClass().getName(),25420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6v0oyjm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jkdjkdle6ndpqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jkdjkdle6ndpqq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6v0oyjm4(){try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25420); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25421);Partial test = new Partial(DateTimeFieldType.era(), 1); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25422);assertEquals("[era=1]", test.toString()); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25423);test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     __CLR4_4_1jkdjkdle6ndpqq.R.inc(25424);assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
    

    

    

    

    

    

    

    

    

    

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
    private Partial createHourMinPartial() {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25425);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25426);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25427);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25428);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25429);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25430);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25431);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25432);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25433);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25434);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1jkdjkdle6ndpqq.R.inc(25435);
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25436);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1jkdjkdle6ndpqq.R.inc(25437);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1jkdjkdle6ndpqq.R.flushNeeded();}}
}

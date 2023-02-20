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
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1jlvjlvle6qsevc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,25575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25411);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25412);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25413);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25414);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1jlvjlvle6qsevc.R.inc(25416);try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25415);
    }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25417);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25418);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25419);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25420);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25421);originalLocale = Locale.getDefault();
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25422);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25423);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25424);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25425);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25426);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25427);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25428);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25429);Locale.setDefault(originalLocale);
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25430);originalDateTimeZone = null;
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25431);originalTimeZone = null;
        __CLR4_4_1jlvjlvle6qsevc.R.inc(25432);originalLocale = null;
    }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testToDateTime_DateTimeZone674() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxse7wjmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone674",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxse7wjmh(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25433); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25434);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25435);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25436);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25437);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25438);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25439);result = test.toDateTime(PARIS); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25440);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25441);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25442);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25443);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25444);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25445);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testPlus_long675() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q44v2kjmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long675",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q44v2kjmu(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25446); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25447);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25448);Instant result = test.plus(123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25449);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25450);assertEquals(expected, result); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testWithDurationAdded_long_int676() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvxq3pjmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int676",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvxq3pjmz(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25451); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25452);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25453);Instant result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25454);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25455);assertEquals(expected, result); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25456);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25457);assertSame(test, result); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25458);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25459);expected = new Instant(TEST_TIME1 + (2L * 123456789L)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25460);assertEquals(expected, result); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25461);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25462);expected = new Instant(TEST_TIME1 - (3L * 123456789L)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25463);assertEquals(expected, result); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testMinus_RD677() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzbx4mjnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD677",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzbx4mjnc(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25464); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25465);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25466);Instant result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25467);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25468);assertEquals(expected, result); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25469);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25470);assertSame(test, result); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testPlus_RD678() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkbyihjnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD678",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkbyihjnj(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25471); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25472);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25473);Instant result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25474);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25475);assertEquals(expected, result); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25476);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25477);assertSame(test, result); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testMinus_long679() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbckoujnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long679",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbckoujnq(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25478); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25479);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25480);Instant result = test.minus(123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25481);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25482);assertEquals(expected, result); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testToDateTime680() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k612vhjnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime680",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k612vhjnv(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25483); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25484);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25485);DateTime result = test.toDateTime(); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25486);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25487);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testToDateTimeISO681() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7frdzjo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO681",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7frdzjo0(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25488); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25489);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25490);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25491);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25492);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25493);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25494);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testToMutableDateTimeISO682() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lecidijo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lecidijo7(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25495); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25496);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25497);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25498);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25499);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25500);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25501);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testGet_DateTimeField1392() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6yg7ajoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField1392",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6yg7ajoe(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25502); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25503);Instant test = new Instant(); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25504);assertEquals(1, test.get(ISOChronology.getInstance().era())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25505);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25506);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25507);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25508);assertEquals(2002, test.get(ISOChronology.getInstance().year())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25509);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25510);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25511);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25512);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25513);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25514);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25515);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25516);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25517);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25518);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25519);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25520);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25521);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25522);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25523);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25524);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25525);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25526);try { 
         __CLR4_4_1jlvjlvle6qsevc.R.inc(25527);test.get((DateTimeField) null); 
         __CLR4_4_1jlvjlvle6qsevc.R.inc(25528);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testToMutableDateTime_Chronology1398() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omild7jp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology1398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omild7jp5(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25529); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25530);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25531);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25532);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25533);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25534);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25535);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25536);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25537);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25538);test = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25539);result = test.toMutableDateTime((Chronology) null); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25540);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25541);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testIsBeforeNow1402() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7660pjpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow1402",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7660pjpi(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25542); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25543);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25544);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25545);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testIsEqualNow1403() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l76onpjpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow1403",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l76onpjpm(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25546); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25547);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25548);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25549);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 


public void testIsEqual_RI1404() {__CLR4_4_1jlvjlvle6qsevc.R.globalSliceStart(getClass().getName(),25550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7cm6sjpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jlvjlvle6qsevc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jlvjlvle6qsevc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI1404",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7cm6sjpq(){try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25550); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25551);Instant test1 = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25552);Instant test1a = new Instant(TEST_TIME1); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25553);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25554);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25555);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25556);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25557);Instant test2 = new Instant(TEST_TIME2); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25558);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25559);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25560);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25561);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25562);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25563);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25564);assertEquals(false, test2.isEqual(new MockInstant())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25565);assertEquals(true, test1.isEqual(new MockInstant())); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25566);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25567);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null)); 
     __CLR4_4_1jlvjlvle6qsevc.R.inc(25568);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null)); 
 }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25569);
            __CLR4_4_1jlvjlvle6qsevc.R.inc(25570);return null;
        }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25571);
            __CLR4_4_1jlvjlvle6qsevc.R.inc(25572);return TEST_TIME1;
        }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1jlvjlvle6qsevc.R.inc(25573);
            __CLR4_4_1jlvjlvle6qsevc.R.inc(25574);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1jlvjlvle6qsevc.R.flushNeeded();}}
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
    

}

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
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1hy9hy9le6ndpi3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,23321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23265);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23266);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23267);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23268);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1hy9hy9le6ndpi3.R.inc(23270);try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23269);
    }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23271);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23272);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23273);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23274);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23275);originalLocale = Locale.getDefault();
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23276);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23277);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23278);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23279);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23280);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23281);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23282);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23283);Locale.setDefault(originalLocale);
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23284);originalDateTimeZone = null;
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23285);originalTimeZone = null;
        __CLR4_4_1hy9hy9le6ndpi3.R.inc(23286);originalLocale = null;
    }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPlus_long285() {__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceStart(getClass().getName(),23287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16npiwphyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hy9hy9le6ndpi3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long285",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16npiwphyv(){try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23287); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23288);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23289);Instant result = test.plus(123456789L); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23290);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23291);assertEquals(expected, result); 
 }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
public void testPlus_RD286() {__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceStart(getClass().getName(),23292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpid1qhz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hy9hy9le6ndpi3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpid1qhz0(){try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23292); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23293);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23294);Instant result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23295);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23296);assertEquals(expected, result); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23297);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23298);assertSame(test, result); 
 }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
public void testToMutableDateTime287() {__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceStart(getClass().getName(),23299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ve0kkhz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hy9hy9le6ndpi3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime287",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ve0kkhz7(){try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23299); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23300);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23301);MutableDateTime result = test.toMutableDateTime(); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23302);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23303);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
public void testToMutableDateTimeISO288() {__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceStart(getClass().getName(),23304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llczeghzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hy9hy9le6ndpi3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llczeghzc(){try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23304); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23305);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23306);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23307);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23308);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23309);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23310);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
public void testIsEqualNow706() {__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceStart(getClass().getName(),23311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ku4fqehzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hy9hy9le6ndpi3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hy9hy9le6ndpi3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow706",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ku4fqehzj(){try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23311); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23312);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23313);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1hy9hy9le6ndpi3.R.inc(23314);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23315);
            __CLR4_4_1hy9hy9le6ndpi3.R.inc(23316);return null;
        }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23317);
            __CLR4_4_1hy9hy9le6ndpi3.R.inc(23318);return TEST_TIME1;
        }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1hy9hy9le6ndpi3.R.inc(23319);
            __CLR4_4_1hy9hy9le6ndpi3.R.inc(23320);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1hy9hy9le6ndpi3.R.flushNeeded();}}
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

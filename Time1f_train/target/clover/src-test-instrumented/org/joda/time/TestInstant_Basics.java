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
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1k4ok4olc8axdvm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,26256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26088);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26089);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26090);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26091);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1k4ok4olc8axdvm.R.inc(26093);try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26092);
    }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26094);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26095);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26096);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26097);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26098);originalLocale = Locale.getDefault();
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26099);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26100);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26101);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26102);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26103);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26104);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26105);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26106);Locale.setDefault(originalLocale);
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26107);originalDateTimeZone = null;
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26108);originalTimeZone = null;
        __CLR4_4_1k4ok4olc8axdvm.R.inc(26109);originalLocale = null;
    }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPlus_long68() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlo9mgk5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long68",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlo9mgk5a(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26110); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26111);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26112);Instant result = test.plus(123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26113);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26114);assertEquals(expected, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToMutableDateTimeISO87() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nrvk9k5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO87",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nrvk9k5f(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26115); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26116);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26117);MutableDateTime result = test.toMutableDateTimeISO(); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26118);assertSame(MutableDateTime.class, result.getClass()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26119);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26120);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26121);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToDateTime_DateTimeZone393() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hy94mk5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone393",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hy94mk5m(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26122); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26123);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26124);DateTime result = test.toDateTime(LONDON); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26125);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26126);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26127);test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26128);result = test.toDateTime(PARIS); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26129);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26130);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26131);test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26132);result = test.toDateTime((DateTimeZone) null); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26133);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26134);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testIsEqual_RI416() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt0vduk5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI416",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt0vduk5z(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26135); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26136);Instant test1 = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26137);Instant test1a = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26138);assertEquals(true, test1.isEqual(test1a)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26139);assertEquals(true, test1a.isEqual(test1)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26140);assertEquals(true, test1.isEqual(test1)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26141);assertEquals(true, test1a.isEqual(test1a)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26142);Instant test2 = new Instant(TEST_TIME2); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26143);assertEquals(false, test1.isEqual(test2)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26144);assertEquals(false, test2.isEqual(test1)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26145);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26146);assertEquals(false, test1.isEqual(test3)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26147);assertEquals(false, test3.isEqual(test1)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26148);assertEquals(true, test3.isEqual(test2)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26149);assertEquals(false, test2.isEqual(new MockInstant())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26150);assertEquals(true, test1.isEqual(new MockInstant())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26151);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26152);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26153);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null)); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testMinus_RD485() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai8fk5k6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD485",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai8fk5k6i(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26154); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26155);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26156);Instant result = test.minus(new Duration(123456789L)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26157);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26158);assertEquals(expected, result); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26159);result = test.minus((ReadableDuration) null); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26160);assertSame(test, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testGet_DateTimeField587() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vqj6xk6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField587",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vqj6xk6p(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26161); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26162);Instant test = new Instant(); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26163);assertEquals(1, test.get(ISOChronology.getInstance().era())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26164);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26165);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26166);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26167);assertEquals(2002, test.get(ISOChronology.getInstance().year())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26168);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26169);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26170);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26171);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26172);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26173);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26174);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26175);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26176);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26177);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26178);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26179);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26180);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26181);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26182);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26183);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26184);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay())); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26185);try { 
         __CLR4_4_1k4ok4olc8axdvm.R.inc(26186);test.get((DateTimeField) null); 
         __CLR4_4_1k4ok4olc8axdvm.R.inc(26187);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testIsBeforeNow657() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrd9hgk7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow657",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrd9hgk7g(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26188); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26189);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26190);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26191);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToMutableDateTime_Chronology756() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7fdx8k7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology756",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7fdx8k7k(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26192); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26193);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26194);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26195);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26196);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26197);test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26198);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26199);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26200);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26201);test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26202);result = test.toMutableDateTime((Chronology) null); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26203);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26204);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testPlus_RD1064() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbryonk7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD1064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbryonk7x(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26205); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26206);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26207);Instant result = test.plus(new Duration(123456789L)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26208);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26209);assertEquals(expected, result); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26210);result = test.plus((ReadableDuration) null); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26211);assertSame(test, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testMinus_long1092() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6dqv8k84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long1092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6dqv8k84(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26212); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26213);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26214);Instant result = test.minus(123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26215);Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26216);assertEquals(expected, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testIsEqualNow1379() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mo16fk89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow1379",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mo16fk89(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26217); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26218);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26219);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26220);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToInstant1385() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilb7yek8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant1385",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilb7yek8d(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26221); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26222);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26223);Instant result = test.toInstant(); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26224);assertSame(test, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testWithDurationAdded_long_int1541() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he9przk8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int1541",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he9przk8h(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26225); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26226);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26227);Instant result = test.withDurationAdded(123456789L, 1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26228);Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26229);assertEquals(expected, result); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26230);result = test.withDurationAdded(123456789L, 0); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26231);assertSame(test, result); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26232);result = test.withDurationAdded(123456789L, 2); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26233);expected = new Instant(TEST_TIME1 + (2L * 123456789L)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26234);assertEquals(expected, result); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26235);result = test.withDurationAdded(123456789L, -3); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26236);expected = new Instant(TEST_TIME1 - (3L * 123456789L)); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26237);assertEquals(expected, result); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToDateTimeISO1569() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w6fc4rk8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO1569",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w6fc4rk8u(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26238); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26239);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26240);DateTime result = test.toDateTimeISO(); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26241);assertSame(DateTime.class, result.getClass()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26242);assertSame(ISOChronology.class, result.getChronology().getClass()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26243);assertEquals(test.getMillis(), result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26244);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 


public void testToDateTime1693() {__CLR4_4_1k4ok4olc8axdvm.R.globalSliceStart(getClass().getName(),26245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14p2qluk91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k4ok4olc8axdvm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k4ok4olc8axdvm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime1693",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14p2qluk91(){try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26245); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26246);Instant test = new Instant(TEST_TIME1); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26247);DateTime result = test.toDateTime(); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26248);assertEquals(TEST_TIME1, result.getMillis()); 
     __CLR4_4_1k4ok4olc8axdvm.R.inc(26249);assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26250);
            __CLR4_4_1k4ok4olc8axdvm.R.inc(26251);return null;
        }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26252);
            __CLR4_4_1k4ok4olc8axdvm.R.inc(26253);return TEST_TIME1;
        }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1k4ok4olc8axdvm.R.inc(26254);
            __CLR4_4_1k4ok4olc8axdvm.R.inc(26255);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1k4ok4olc8axdvm.R.flushNeeded();}}
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

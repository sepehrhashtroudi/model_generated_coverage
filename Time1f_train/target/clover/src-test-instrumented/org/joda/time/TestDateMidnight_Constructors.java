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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1haghaglc8axdmo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,22519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1haghaglc8axdmo.R.inc(22408);
        __CLR4_4_1haghaglc8axdmo.R.inc(22409);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1haghaglc8axdmo.R.inc(22410);
        __CLR4_4_1haghaglc8axdmo.R.inc(22411);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1haghaglc8axdmo.R.inc(22413);try{__CLR4_4_1haghaglc8axdmo.R.inc(22412);
    }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1haghaglc8axdmo.R.inc(22414);
        __CLR4_4_1haghaglc8axdmo.R.inc(22415);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1haghaglc8axdmo.R.inc(22416);zone = DateTimeZone.getDefault();
        __CLR4_4_1haghaglc8axdmo.R.inc(22417);locale = Locale.getDefault();
        __CLR4_4_1haghaglc8axdmo.R.inc(22418);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1haghaglc8axdmo.R.inc(22419);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1haghaglc8axdmo.R.inc(22420);
        __CLR4_4_1haghaglc8axdmo.R.inc(22421);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1haghaglc8axdmo.R.inc(22422);DateTimeZone.setDefault(zone);
        __CLR4_4_1haghaglc8axdmo.R.inc(22423);Locale.setDefault(locale);
        __CLR4_4_1haghaglc8axdmo.R.inc(22424);zone = null;
    }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void test_now_Chronology3() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxtprohax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxtprohax() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22425); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22426);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22427);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22428);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone24() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrlr0ihb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrlr0ihb1() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22429); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22430);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22431);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22432);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22433);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22434);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     } finally { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22435);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void test_now171() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17jw41jhb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17jw41jhb8() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22436); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22437);DateMidnight test = DateMidnight.now(); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22438);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22439);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22440);assertEquals(2002, test.getYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22441);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22442);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone745() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n65k62hbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullDateTimeZone745",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n65k62hbf() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22443); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22444);DateMidnight test = new DateMidnight((DateTimeZone) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22445);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22446);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_Object_nullDateTimeZone789() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zwsjchbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullDateTimeZone789",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zwsjchbj() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22447); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22448);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22449);DateMidnight test = new DateMidnight(date, (DateTimeZone) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22450);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22451);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_int_int_int_Chronology883() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fm2s2jhbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_Chronology883",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fm2s2jhbo() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22452); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22453);DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22454);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22455);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22456);assertEquals(2002, test.getYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22457);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22458);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22459);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22460);new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22461);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22462);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22463);new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22464);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22465);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22466);new DateMidnight(2002, 0, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22467);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22468);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22469);new DateMidnight(2002, 13, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22470);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22471);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22472);new DateMidnight(2002, 6, 0, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22473);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22474);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22475);new DateMidnight(2002, 6, 31, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22476);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1haghaglc8axdmo.R.inc(22477);new DateMidnight(2002, 7, 31, GregorianChronology.getInstance()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22478);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22479);new DateMidnight(2002, 7, 32, GregorianChronology.getInstance()); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22480);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void test_now_nullDateTimeZone969() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t12mhthch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone969",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t12mhthch() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22481); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22482);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22483);DateMidnight.now((DateTimeZone) null); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22484);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testParse_formatter978() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elr991hcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_formatter978",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elr991hcl() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22485); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22486);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullDateTimeZone1423() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195nqowhcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone1423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195nqowhcn() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22487); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22488);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22489);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22490);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22491);assertEquals(2002, test.getYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22492);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22493);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void test_now_DateTimeZone1441() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f214pohcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone1441",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f214pohcu() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22494); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22495);DateMidnight test = DateMidnight.now(PARIS); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22496);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22497);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_DateTimeZone1548() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxxwr1hcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_DateTimeZone1548",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxxwr1hcy() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22498); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22499);DateMidnight test = new DateMidnight(PARIS); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22500);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22501);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void test_now_nullChronology1645() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12og3kuhd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology1645",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12og3kuhd2() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22502); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22503);try { 
         __CLR4_4_1haghaglc8axdmo.R.inc(22504);DateMidnight.now((Chronology) null); 
         __CLR4_4_1haghaglc8axdmo.R.inc(22505);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_nullChronology1697() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9g7pchd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullChronology1697",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9g7pchd6() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22506); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22507);DateMidnight test = new DateMidnight((Chronology) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22508);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22509);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_nullObject1708() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ns758yhda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject1708",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ns758yhda() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22510); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22511);DateMidnight test = new DateMidnight((Object) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22512);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22513);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1735() throws Throwable {__CLR4_4_1haghaglc8axdmo.R.globalSliceStart(getClass().getName(),22514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxnsi1hde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1haghaglc8axdmo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1haghaglc8axdmo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology1735",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxnsi1hde() throws Throwable{try{__CLR4_4_1haghaglc8axdmo.R.inc(22514); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22515);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22516);DateMidnight test = new DateMidnight(date, (Chronology) null); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22517);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1haghaglc8axdmo.R.inc(22518);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1haghaglc8axdmo.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    

    /**
     * Test now (DateTimeZone)
     */
    

    /**
     * Test now (DateTimeZone=null)
     */
    

    /**
     * Test now (Chronology)
     */
    

    /**
     * Test now (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}

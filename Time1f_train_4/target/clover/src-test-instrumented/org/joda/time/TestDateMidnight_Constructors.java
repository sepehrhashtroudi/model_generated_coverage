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
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1ha8ha8le6rjc3k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,22488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22400);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22401);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22402);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22403);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1ha8ha8le6rjc3k.R.inc(22405);try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22404);
    }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22406);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22407);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22408);zone = DateTimeZone.getDefault();
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22409);locale = Locale.getDefault();
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22410);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22411);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22412);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22413);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22414);DateTimeZone.setDefault(zone);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22415);Locale.setDefault(locale);
        __CLR4_4_1ha8ha8le6rjc3k.R.inc(22416);zone = null;
    }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_int_int_int_Chronology462() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whvtmghap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_Chronology462",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whvtmghap() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22417); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22418);DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22419);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22420);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22421);assertEquals(2002, test.getYear()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22422);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22423);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22424);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22425);new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22426);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22427);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22428);new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22429);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22430);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22431);new DateMidnight(2002, 0, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22432);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22433);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22434);new DateMidnight(2002, 13, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22435);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22436);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22437);new DateMidnight(2002, 6, 0, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22438);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22439);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22440);new DateMidnight(2002, 6, 31, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22441);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22442);new DateMidnight(2002, 7, 31, GregorianChronology.getInstance()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22443);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22444);new DateMidnight(2002, 7, 32, GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22445);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testConstructor_Object_nullDateTimeZone930() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzfrtyhbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullDateTimeZone930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzfrtyhbi() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22446); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22447);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22448);DateMidnight test = new DateMidnight(date, (DateTimeZone) null); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22449);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22450);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1119() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x02n0chbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone1119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x02n0chbn() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22451); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22452);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22453);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22454);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22455);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22456);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     } finally { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22457);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void test_now_nullDateTimeZone1426() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8wjnyhbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone1426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8wjnyhbu() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22458); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22459);try { 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22460);DateMidnight.now((DateTimeZone) null); 
         __CLR4_4_1ha8ha8le6rjc3k.R.inc(22461);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void test_now_DateTimeZone1427() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g1cwx8hby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone1427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g1cwx8hby() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22462); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22463);DateMidnight test = DateMidnight.now(PARIS); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22464);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22465);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void test_now_Chronology1428() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvbom6hc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology1428",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvbom6hc2() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22466); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22467);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22468);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22469);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testParse_formatter1430() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw9g43hc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_formatter1430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw9g43hc6() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22470); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22471);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testConstructor_nullObject1431() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk83ydhc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk83ydhc8() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22472); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22473);DateMidnight test = new DateMidnight((Object) null); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22474);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22475);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1432() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pa3ma7hcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology1432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pa3ma7hcc() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22476); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22477);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22478);DateMidnight test = new DateMidnight(date, (Chronology) null); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22479);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22480);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullDateTimeZone1433() throws Throwable {__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceStart(getClass().getName(),22481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk75unhch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ha8ha8le6rjc3k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ha8ha8le6rjc3k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone1433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk75unhch() throws Throwable{try{__CLR4_4_1ha8ha8le6rjc3k.R.inc(22481); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22482);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22483);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22484);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22485);assertEquals(2002, test.getYear()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22486);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1ha8ha8le6rjc3k.R.inc(22487);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1ha8ha8le6rjc3k.R.flushNeeded();}} 

    

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

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
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1h6wh6wle6qseni{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,22391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1h6wh6wle6qseni.R.inc(22280);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22281);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h6wh6wle6qseni.R.inc(22282);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22283);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1h6wh6wle6qseni.R.inc(22285);try{__CLR4_4_1h6wh6wle6qseni.R.inc(22284);
    }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h6wh6wle6qseni.R.inc(22286);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22287);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22288);zone = DateTimeZone.getDefault();
        __CLR4_4_1h6wh6wle6qseni.R.inc(22289);locale = Locale.getDefault();
        __CLR4_4_1h6wh6wle6qseni.R.inc(22290);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22291);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h6wh6wle6qseni.R.inc(22292);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22293);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1h6wh6wle6qseni.R.inc(22294);DateTimeZone.setDefault(zone);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22295);Locale.setDefault(locale);
        __CLR4_4_1h6wh6wle6qseni.R.inc(22296);zone = null;
    }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testConstructor_int_int_int_Chronology426() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12cfveoh7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_Chronology426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12cfveoh7d() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22297); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22298);DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22299);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22300);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22301);assertEquals(2002, test.getYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22302);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22303);assertEquals(9, test.getDayOfMonth()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22304);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22305);new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22306);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22307);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22308);new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22309);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22310);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22311);new DateMidnight(2002, 0, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22312);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22313);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22314);new DateMidnight(2002, 13, 9, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22315);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22316);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22317);new DateMidnight(2002, 6, 0, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22318);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22319);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22320);new DateMidnight(2002, 6, 31, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22321);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22322);new DateMidnight(2002, 7, 31, GregorianChronology.getInstance()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22323);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22324);new DateMidnight(2002, 7, 32, GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22325);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_DateTimeZone900() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17x0f9eh86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_DateTimeZone900",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17x0f9eh86() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22326); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22327);DateMidnight test = new DateMidnight(PARIS); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22328);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22329);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_Object_nullDateTimeZone901() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3z2yyh8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullDateTimeZone901",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3z2yyh8a() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22330); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22331);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22332);DateMidnight test = new DateMidnight(date, (DateTimeZone) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22333);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22334);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_badconverterObject_DateTimeZone1091() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w7om25h8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w7om25h8f() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22335); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22336);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22337);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22338);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22339);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22340);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     } finally { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22341);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void test_now1423() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wk6toh8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now1423",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wk6toh8m() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22342); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22343);DateMidnight test = DateMidnight.now(); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22344);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22345);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22346);assertEquals(2002, test.getYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22347);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22348);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void test_now_nullDateTimeZone1424() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqwh8wh8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone1424",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqwh8wh8t() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22349); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22350);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22351);DateMidnight.now((DateTimeZone) null); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22352);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void test_now_DateTimeZone1425() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jczcah8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone1425",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jczcah8x() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22353); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22354);DateMidnight test = DateMidnight.now(PARIS); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22355);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22356);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void test_now_Chronology1426() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdbr18h91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology1426",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdbr18h91() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22357); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22358);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22359);assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22360);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void test_now_nullChronology1427() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jongmch95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology1427",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jongmch95() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22361); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22362);try { 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22363);DateMidnight.now((Chronology) null); 
         __CLR4_4_1h6wh6wle6qseni.R.inc(22364);fail(); 
     } catch (NullPointerException ex) { 
     } 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testParse_formatter1429() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfe8oth99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_formatter1429",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfe8oth99() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22365); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22366);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_nullDateTimeZone1430() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrei4sh9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullDateTimeZone1430",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrei4sh9b() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22367); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22368);DateMidnight test = new DateMidnight((DateTimeZone) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22369);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22370);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_nullChronology1431() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ag3y6h9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullChronology1431",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ag3y6h9f() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22371); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22372);DateMidnight test = new DateMidnight((Chronology) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22373);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22374);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_nullObject1432() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1st82quh9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject1432",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1st82quh9j() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22375); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22376);DateMidnight test = new DateMidnight((Object) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22377);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22378);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_Object_nullChronology1433() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m13nhqh9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology1433",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m13nhqh9n() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22379); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22380);Date date = new Date(TEST_TIME1_UTC); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22381);DateMidnight test = new DateMidnight(date, (Chronology) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22382);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22383);assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 


public void testConstructor_int_int_int_nullDateTimeZone1434() throws Throwable {__CLR4_4_1h6wh6wle6qseni.R.globalSliceStart(getClass().getName(),22384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nt74n4h9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6wh6wle6qseni.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6wh6wle6qseni.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone1434",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nt74n4h9s() throws Throwable{try{__CLR4_4_1h6wh6wle6qseni.R.inc(22384); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22385);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22386);assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22387);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22388);assertEquals(2002, test.getYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22389);assertEquals(6, test.getMonthOfYear()); 
     __CLR4_4_1h6wh6wle6qseni.R.inc(22390);assertEquals(9, test.getDayOfMonth()); 
 }finally{__CLR4_4_1h6wh6wle6qseni.R.flushNeeded();}} 

    

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

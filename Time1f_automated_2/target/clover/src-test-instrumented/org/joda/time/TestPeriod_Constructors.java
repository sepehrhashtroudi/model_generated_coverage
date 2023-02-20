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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {static class __CLR4_4_1jj5jj5le6nl8g3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25313);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25314);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25315);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25316);return new TestSuite(TestPeriod_Constructors.class);
    }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}

    public TestPeriod_Constructors(String name) {
        super(name);__CLR4_4_1jj5jj5le6nl8g3.R.inc(25318);try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25317);
    }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25319);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25320);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25321);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25322);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25323);originalLocale = Locale.getDefault();
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25324);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25325);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25326);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25327);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25328);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25329);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25330);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25331);Locale.setDefault(originalLocale);
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25332);originalDateTimeZone = null;
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25333);originalTimeZone = null;
        __CLR4_4_1jj5jj5le6nl8g3.R.inc(25334);originalLocale = null;
    }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference136() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ia0t8cjjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ia0t8cjjr() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25335); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25336);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25337);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25338);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25339);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25340);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25341);assertEquals(-1, test.getYears()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25342);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25343);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25344);assertEquals(-2, test.getDays()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25345);assertEquals(0, test.getHours()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25346);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25347);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25348);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testFactoryFieldDifference537() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czm0khjk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference537",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czm0khjk5() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25349); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25350);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25351);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25352);Partial end1 = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25353);Partial end2 = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25354);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25355);Period.fieldDifference(start, end1); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25356);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25357);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25358);Period.fieldDifference(start, start); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25359);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25360);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25361);Period.fieldDifference(end1, end1); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25362);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25363);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25364);Period.fieldDifference(end1, start); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25365);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25366);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25367);Period.fieldDifference(start, end2); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25368);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testFactoryFieldDifference139() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s10plrjkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference139",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s10plrjkp() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25369); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25370);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25371);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25372);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25373);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25374);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25375);assertEquals(-1, test.getYears()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25376);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25377);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25378);assertEquals(-2, test.getDays()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25379);assertEquals(0, test.getHours()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25380);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25381);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25382);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testFactoryFieldDifference540() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyh5kpjl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testFactoryFieldDifference540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyh5kpjl3() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25383); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25384);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() }; 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25385);Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25386);Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25387);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25388);Period.fieldDifference(start, end); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25389);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25390);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25391);Period.fieldDifference(start, null); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25392);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25393);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25394);Period.fieldDifference((ReadablePartial) null, end); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25395);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25396);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25397);Period.fieldDifference(start, new LocalTime()); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25398);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25399);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25400);Period.fieldDifference(new Partial(types, new int[] { 1, 2, 3 }), new Partial(types, new int[] { 1, 2, 3 })); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25401);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testConstructor_RD_RI246() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6ipdejlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RD_RI246",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6ipdejlm() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25402); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25403);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25404);Duration dur = null; 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25405);Period test = new Period(dur, dt1); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25406);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25407);assertEquals(0, test.getYears()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25408);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25409);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25410);assertEquals(0, test.getDays()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25411);assertEquals(0, test.getHours()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25412);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25413);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25414);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testNormalizedStandard_yearMonth147() {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hwftbjlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testNormalizedStandard_yearMonth147",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hwftbjlz(){try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25415); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25416);Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25417);Period result = test.normalizedStandard(); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25418);assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25419);assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result); 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testConstructor_Object_PeriodType1322() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdy9gzjm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_Object_PeriodType1322",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdy9gzjm4() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25420); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25421);Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25422);assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25423);assertEquals(1, test.getYears()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25424);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25425);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25426);assertEquals(3, test.getDays()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25427);assertEquals(0, test.getHours()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25428);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25429);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25430);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
public void testConstructor_RP_RP_PeriodType8362() throws Throwable {__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceStart(getClass().getName(),25431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j9qi8jmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jj5jj5le6nl8g3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jj5jj5le6nl8g3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Constructors.testConstructor_RP_RP_PeriodType8362",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j9qi8jmf() throws Throwable{try{__CLR4_4_1jj5jj5le6nl8g3.R.inc(25431); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25432);Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25433);Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     __CLR4_4_1jj5jj5le6nl8g3.R.inc(25434);try { 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25435);new Period(dt1, dt2, PeriodType.standard()); 
         __CLR4_4_1jj5jj5le6nl8g3.R.inc(25436);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jj5jj5le6nl8g3.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}

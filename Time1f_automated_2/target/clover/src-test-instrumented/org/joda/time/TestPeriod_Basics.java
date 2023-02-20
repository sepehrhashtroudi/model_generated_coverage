/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics extends TestCase {static class __CLR4_4_1jepjeple6nl8fr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,25313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) {try{__CLR4_4_1jepjeple6nl8fr.R.inc(25153);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25154);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jepjeple6nl8fr.R.inc(25155);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25156);return new TestSuite(TestPeriod_Basics.class);
    }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}

    public TestPeriod_Basics(String name) {
        super(name);__CLR4_4_1jepjeple6nl8fr.R.inc(25158);try{__CLR4_4_1jepjeple6nl8fr.R.inc(25157);
    }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jepjeple6nl8fr.R.inc(25159);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25160);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25161);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jepjeple6nl8fr.R.inc(25162);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jepjeple6nl8fr.R.inc(25163);originalLocale = Locale.getDefault();
        __CLR4_4_1jepjeple6nl8fr.R.inc(25164);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25165);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jepjeple6nl8fr.R.inc(25166);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jepjeple6nl8fr.R.inc(25167);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25168);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jepjeple6nl8fr.R.inc(25169);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25170);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25171);Locale.setDefault(originalLocale);
        __CLR4_4_1jepjeple6nl8fr.R.inc(25172);originalDateTimeZone = null;
        __CLR4_4_1jepjeple6nl8fr.R.inc(25173);originalTimeZone = null;
        __CLR4_4_1jepjeple6nl8fr.R.inc(25174);originalLocale = null;
    }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testPlusFields42() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0jstyjfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testPlusFields42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0jstyjfb(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25175); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25176);Period test; 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25177);test = Period.years(1).plusYears(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25178);assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25179);test = Period.months(1).plusMonths(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25180);assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25181);test = Period.weeks(1).plusWeeks(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25182);assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25183);test = Period.days(1).plusDays(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25184);assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25185);test = Period.hours(1).plusHours(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25186);assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25187);test = Period.minutes(1).plusMinutes(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25188);assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25189);test = Period.seconds(1).plusSeconds(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25190);assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25191);test = Period.millis(1).plusMillis(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25192);assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25193);test = new Period(0L, PeriodType.millis()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25194);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25195);test.plusYears(1); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25196);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testWithFields249() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j186r7jfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFields249",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j186r7jfx(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25197); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25198);Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25199);Period test2 = null; 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25200);Period result = test1.withFields(test2); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25201);assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25202);assertSame(test1, result); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testWithFieldAdded350() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gj0b13jg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testWithFieldAdded350",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gj0b13jg3(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25203); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25204);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.time()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25205);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25206);test.withFieldAdded(DurationFieldType.years(), 6); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25207);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToStandardWeeks_months51() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18m7ko0jg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardWeeks_months51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18m7ko0jg8(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25208); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25209);Period test = Period.months(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25210);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25211);test.toStandardWeeks(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25212);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25213);test = Period.months(-1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25214);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25215);test.toStandardWeeks(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25216);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25217);test = Period.months(0); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25218);assertEquals(0, test.toStandardWeeks().getWeeks()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToStandardMinutes_months52() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liq7mnjgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardMinutes_months52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liq7mnjgj(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25219); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25220);Period test = Period.months(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25221);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25222);test.toStandardMinutes(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25223);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25224);test = Period.months(-1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25225);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25226);test.toStandardMinutes(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25227);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25228);test = Period.months(0); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25229);assertEquals(0, test.toStandardMinutes().getMinutes()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToStandardSeconds_months53() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qx6oyjgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds_months53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qx6oyjgu(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25230); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25231);Period test = Period.months(1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25232);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25233);test.toStandardSeconds(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25234);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25235);test = Period.months(-1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25236);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25237);test.toStandardSeconds(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25238);fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25239);test = Period.months(0); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25240);assertEquals(0, test.toStandardSeconds().getSeconds()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToStandardSeconds321() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o8cjacjh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardSeconds321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o8cjacjh5(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25241); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25242);Duration test = new Duration(0L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25243);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25244);test = new Duration(1L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25245);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25246);test = new Duration(999L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25247);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25248);test = new Duration(1000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25249);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25250);test = new Duration(1001L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25251);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25252);test = new Duration(1999L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25253);assertEquals(Seconds.seconds(1), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25254);test = new Duration(2000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25255);assertEquals(Seconds.seconds(2), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25256);test = new Duration(-1L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25257);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25258);test = new Duration(-999L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25259);assertEquals(Seconds.seconds(0), test.toStandardSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25260);test = new Duration(-1000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25261);assertEquals(Seconds.seconds(-1), test.toStandardSeconds()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToPeriod323() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdhfvxjhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToPeriod323",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdhfvxjhq(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25262); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25263);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25264);try { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25265);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris")); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25266);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25267);Duration dur = new Duration(length); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25268);Period test = dur.toPeriod(); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25269);assertEquals(0, test.getYears()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25270);assertEquals(0, test.getMonths()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25271);assertEquals(0, test.getWeeks()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25272);assertEquals(0, test.getDays()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25273);assertEquals((450 * 24) + 5, test.getHours()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25274);assertEquals(6, test.getMinutes()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25275);assertEquals(7, test.getSeconds()); 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25276);assertEquals(8, test.getMillis()); 
     } finally { 
         __CLR4_4_1jepjeple6nl8fr.R.inc(25277);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testToStandardHours330() {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a6t2byji6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testToStandardHours330",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a6t2byji6(){try{__CLR4_4_1jepjeple6nl8fr.R.inc(25278); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25279);Duration test = new Duration(0L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25280);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25281);test = new Duration(1L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25282);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25283);test = new Duration(3600000L - 1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25284);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25285);test = new Duration(3600000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25286);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25287);test = new Duration(3600000L + 1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25288);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25289);test = new Duration(2 * 3600000L - 1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25290);assertEquals(Hours.hours(1), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25291);test = new Duration(2 * 3600000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25292);assertEquals(Hours.hours(2), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25293);test = new Duration(-1L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25294);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25295);test = new Duration(-3600000L + 1); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25296);assertEquals(Hours.hours(0), test.toStandardHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25297);test = new Duration(-3600000L); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25298);assertEquals(Hours.hours(-1), test.toStandardHours()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
public void testConstructor_Object3498() throws Throwable {__CLR4_4_1jepjeple6nl8fr.R.globalSliceStart(getClass().getName(),25299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7ts8tjir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jepjeple6nl8fr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jepjeple6nl8fr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriod_Basics.testConstructor_Object3498",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7ts8tjir() throws Throwable{try{__CLR4_4_1jepjeple6nl8fr.R.inc(25299); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25300);long length = (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L; 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25301);MutablePeriod test = new MutablePeriod(new Duration(length)); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25302);assertEquals(PeriodType.standard(), test.getPeriodType()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25303);assertEquals(0, test.getYears()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25304);assertEquals(0, test.getMonths()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25305);assertEquals(64, test.getWeeks()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25306);assertEquals(2, test.getDays()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25307);assertEquals(5, test.getHours()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25308);assertEquals(6, test.getMinutes()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25309);assertEquals(7, test.getSeconds()); 
     __CLR4_4_1jepjeple6nl8fr.R.inc(25310);assertEquals(8, test.getMillis()); 
 }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    

    

    

    

            

    

    

    
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);__CLR4_4_1jepjeple6nl8fr.R.inc(25312);try{__CLR4_4_1jepjeple6nl8fr.R.inc(25311);
        }finally{__CLR4_4_1jepjeple6nl8fr.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

//    //-----------------------------------------------------------------------
//    public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
//    public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    

    

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
    

    

    

    

    

    

    

    

    

    

    

    

    

}

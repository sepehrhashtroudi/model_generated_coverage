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
package org.joda.time.format;

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {static class __CLR4_4_1lx3lx3le6nl8py{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,28458,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28407);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28408);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28409);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28410);return new TestSuite(TestDateTimeFormatStyle.class);
    }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}

    public TestDateTimeFormatStyle(String name) {
        super(name);__CLR4_4_1lx3lx3le6nl8py.R.inc(28412);try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28411);
    }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28413);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28414);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28415);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28416);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28417);originalLocale = Locale.getDefault();
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28418);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28419);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28420);Locale.setDefault(UK);
    }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28421);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28422);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28423);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28424);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28425);Locale.setDefault(originalLocale);
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28426);originalDateTimeZone = null;
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28427);originalTimeZone = null;
        __CLR4_4_1lx3lx3le6nl8py.R.inc(28428);originalLocale = null;
    }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testForStyle_shortDate102() throws Exception {__CLR4_4_1lx3lx3le6nl8py.R.globalSliceStart(getClass().getName(),28429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164q423lxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx3lx3le6nl8py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx3lx3le6nl8py.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164q423lxp() throws Exception{try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28429); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28430);DateTimeFormatter f = DateTimeFormat.shortDate(); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28431);DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28432);assertSame(g, f); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28433);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28434);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28435);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28436);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28437);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28438);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28439);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28440);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_1lx3lx3le6nl8py.R.iget(28441)!=0|true))||(__CLR4_4_1lx3lx3le6nl8py.R.iget(28442)==0&false))) {{ 
     } }else {{ 
         __CLR4_4_1lx3lx3le6nl8py.R.inc(28443);DateTime date = new DateTime(DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         __CLR4_4_1lx3lx3le6nl8py.R.inc(28444);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }}finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}
public void testForStyle_shortDateTime103() throws Exception {__CLR4_4_1lx3lx3le6nl8py.R.globalSliceStart(getClass().getName(),28445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3pqvly5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lx3lx3le6nl8py.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lx3lx3le6nl8py.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3pqvly5() throws Exception{try{__CLR4_4_1lx3lx3le6nl8py.R.inc(28445); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28446);DateTimeFormatter f = DateTimeFormat.shortDateTime(); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28447);DateTimeFormatter g = DateTimeFormat.forStyle("SS"); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28448);assertSame(g, f); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28449);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28450);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28451);assertEquals(expect, f.print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28452);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28453);assertEquals(expect, f.withLocale(US).print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28454);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28455);assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28456);DateTime date = new DateTime(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect)); 
     __CLR4_4_1lx3lx3le6nl8py.R.inc(28457);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
 }finally{__CLR4_4_1lx3lx3le6nl8py.R.flushNeeded();}}
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}

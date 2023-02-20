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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties extends TestCase {static class __CLR4_4_1ileilele6qsesu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,24397,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1ileilele6qsesu.R.inc(24098);
        __CLR4_4_1ileilele6qsesu.R.inc(24099);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ileilele6qsesu.R.inc(24100);
        __CLR4_4_1ileilele6qsesu.R.inc(24101);return new TestSuite(TestDateTime_Properties.class);
    }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}}

    public TestDateTime_Properties(String name) {
        super(name);__CLR4_4_1ileilele6qsesu.R.inc(24103);try{__CLR4_4_1ileilele6qsesu.R.inc(24102);
    }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ileilele6qsesu.R.inc(24104);
        __CLR4_4_1ileilele6qsesu.R.inc(24105);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ileilele6qsesu.R.inc(24106);zone = DateTimeZone.getDefault();
        __CLR4_4_1ileilele6qsesu.R.inc(24107);locale = Locale.getDefault();
        __CLR4_4_1ileilele6qsesu.R.inc(24108);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ileilele6qsesu.R.inc(24109);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ileilele6qsesu.R.inc(24110);
        __CLR4_4_1ileilele6qsesu.R.inc(24111);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ileilele6qsesu.R.inc(24112);DateTimeZone.setDefault(zone);
        __CLR4_4_1ileilele6qsesu.R.inc(24113);Locale.setDefault(locale);
        __CLR4_4_1ileilele6qsesu.R.inc(24114);zone = null;
    }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPropertyEqualsHashCodeLenient171() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jm2cdgilv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient171",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jm2cdgilv(){try{__CLR4_4_1ileilele6qsesu.R.inc(24115); 
     __CLR4_4_1ileilele6qsesu.R.inc(24116);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24117);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24118);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24119);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24120);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24121);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24122);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24123);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24124);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyAddWrapFieldYear241() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4lp5pim5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear241",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4lp5pim5(){try{__CLR4_4_1ileilele6qsesu.R.inc(24125); 
     __CLR4_4_1ileilele6qsesu.R.inc(24126);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24127);DateTime copy = test.year().addWrapFieldToCopy(9); 
     __CLR4_4_1ileilele6qsesu.R.inc(24128);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24129);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24130);copy = test.year().addWrapFieldToCopy(0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24131);assertEquals(2004, copy.getYear()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24132);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24133);assertEquals(-292275054, copy.getYear()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24134);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24135);assertEquals(292278993, copy.getYear()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfCentury378() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ptso2img();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury378",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ptso2img(){try{__CLR4_4_1ileilele6qsesu.R.inc(24136); 
     __CLR4_4_1ileilele6qsesu.R.inc(24137);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24138);Interval testInterval = test.yearOfCentury().toInterval(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24139);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24140);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyEqualsHashCodeStrict547() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8rdbpiml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict547",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8rdbpiml(){try{__CLR4_4_1ileilele6qsesu.R.inc(24141); 
     __CLR4_4_1ileilele6qsesu.R.inc(24142);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24143);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24144);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24145);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24146);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24147);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     __CLR4_4_1ileilele6qsesu.R.inc(24148);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24149);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24150);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetEra594() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mphyz6imv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra594",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mphyz6imv(){try{__CLR4_4_1ileilele6qsesu.R.inc(24151); 
     __CLR4_4_1ileilele6qsesu.R.inc(24152);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24153);assertSame(test.getChronology().era(), test.era().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24154);assertEquals("era", test.era().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24155);assertEquals("Property[era]", test.era().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24156);assertSame(test, test.era().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24157);assertEquals(1, test.era().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24158);assertEquals("1", test.era().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24159);assertEquals("AD", test.era().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24160);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24161);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24162);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24163);assertEquals("AD", test.era().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24164);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24165);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24166);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24167);assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24168);assertEquals(null, test.era().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24169);assertEquals(2, test.era().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24170);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24171);assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24172);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetYearOfCentury595() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wjn8nbinh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury595",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wjn8nbinh(){try{__CLR4_4_1ileilele6qsesu.R.inc(24173); 
     __CLR4_4_1ileilele6qsesu.R.inc(24174);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24175);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24176);assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24177);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24178);assertSame(test, test.yearOfCentury().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24179);assertEquals(4, test.yearOfCentury().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24180);assertEquals("4", test.yearOfCentury().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24181);assertEquals("4", test.yearOfCentury().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24182);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24183);assertEquals("4", test.yearOfCentury().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24184);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24185);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24186);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24187);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24188);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyToIntervalYearOfEra596() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txvicginx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txvicginx(){try{__CLR4_4_1ileilele6qsesu.R.inc(24189); 
     __CLR4_4_1ileilele6qsesu.R.inc(24190);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24191);Interval testInterval = test.yearOfEra().toInterval(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24192);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24193);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertySetYear597() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tw76puio2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear597",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tw76puio2(){try{__CLR4_4_1ileilele6qsesu.R.inc(24194); 
     __CLR4_4_1ileilele6qsesu.R.inc(24195);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24196);DateTime copy = test.year().setCopy(1960); 
     __CLR4_4_1ileilele6qsesu.R.inc(24197);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24198);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetWeekyear598() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afse2jio7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear598",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afse2jio7(){try{__CLR4_4_1ileilele6qsesu.R.inc(24199); 
     __CLR4_4_1ileilele6qsesu.R.inc(24200);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24201);assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24202);assertEquals("weekyear", test.weekyear().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24203);assertEquals("Property[weekyear]", test.weekyear().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24204);assertSame(test, test.weekyear().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24205);assertEquals(2004, test.weekyear().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24206);assertEquals("2004", test.weekyear().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24207);assertEquals("2004", test.weekyear().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24208);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24209);assertEquals("2004", test.weekyear().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24210);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24211);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24212);assertEquals(null, test.weekyear().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24213);assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24214);assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertySetWeekOfWeekyear600() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166jnayion();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear600",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166jnayion(){try{__CLR4_4_1ileilele6qsesu.R.inc(24215); 
     __CLR4_4_1ileilele6qsesu.R.inc(24216);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24217);DateTime copy = test.weekOfWeekyear().setCopy(4); 
     __CLR4_4_1ileilele6qsesu.R.inc(24218);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24219);assertEquals("2004-01-19T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24220);try { 
         __CLR4_4_1ileilele6qsesu.R.inc(24221);test.weekOfWeekyear().setCopy(54); 
         __CLR4_4_1ileilele6qsesu.R.inc(24222);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ileilele6qsesu.R.inc(24223);try { 
         __CLR4_4_1ileilele6qsesu.R.inc(24224);test.weekOfWeekyear().setCopy(0); 
         __CLR4_4_1ileilele6qsesu.R.inc(24225);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyCompareToDayOfYear601() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qx1413ioy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear601",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qx1413ioy(){try{__CLR4_4_1ileilele6qsesu.R.inc(24226); 
     __CLR4_4_1ileilele6qsesu.R.inc(24227);DateTime test1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24228);DateTime test2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ileilele6qsesu.R.inc(24229);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24230);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24231);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24232);try { 
         __CLR4_4_1ileilele6qsesu.R.inc(24233);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ileilele6qsesu.R.inc(24234);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ileilele6qsesu.R.inc(24235);DateTime dt1 = new DateTime(TEST_TIME1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24236);DateTime dt2 = new DateTime(TEST_TIME2); 
     __CLR4_4_1ileilele6qsesu.R.inc(24237);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24238);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24239);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24240);try { 
         __CLR4_4_1ileilele6qsesu.R.inc(24241);test1.dayOfYear().compareTo((ReadableInstant) null); 
         __CLR4_4_1ileilele6qsesu.R.inc(24242);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetMinuteOfDay602() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jeyw1vipf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay602",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jeyw1vipf(){try{__CLR4_4_1ileilele6qsesu.R.inc(24243); 
     __CLR4_4_1ileilele6qsesu.R.inc(24244);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24245);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24246);assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24247);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24248);assertSame(test, test.minuteOfDay().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24249);assertEquals(803, test.minuteOfDay().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24250);assertEquals("803", test.minuteOfDay().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24251);assertEquals("803", test.minuteOfDay().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24252);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24253);assertEquals("803", test.minuteOfDay().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24254);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24255);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24256);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24257);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24258);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetSecondOfDay603() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr6oaqipv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay603",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr6oaqipv(){try{__CLR4_4_1ileilele6qsesu.R.inc(24259); 
     __CLR4_4_1ileilele6qsesu.R.inc(24260);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24261);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24262);assertEquals("secondOfDay", test.secondOfDay().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24263);assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24264);assertSame(test, test.secondOfDay().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24265);assertEquals(48223, test.secondOfDay().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24266);assertEquals("48223", test.secondOfDay().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24267);assertEquals("48223", test.secondOfDay().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24268);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24269);assertEquals("48223", test.secondOfDay().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24270);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24271);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24272);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24273);assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24274);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyWithMinimumValueMillisOfDayDSTGap604() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150f1diqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap604",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150f1diqb(){try{__CLR4_4_1ileilele6qsesu.R.inc(24275); 
     __CLR4_4_1ileilele6qsesu.R.inc(24276);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza"); 
     __CLR4_4_1ileilele6qsesu.R.inc(24277);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza); 
     __CLR4_4_1ileilele6qsesu.R.inc(24278);DateTime test = dt.millisOfDay().withMinimumValue(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24279);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetHourOfDay606() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsrttbiqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay606",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsrttbiqg(){try{__CLR4_4_1ileilele6qsesu.R.inc(24280); 
     __CLR4_4_1ileilele6qsesu.R.inc(24281);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24282);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24283);assertEquals("hourOfDay", test.hourOfDay().getName()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24284);assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24285);assertSame(test, test.hourOfDay().getDateTime()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24286);assertEquals(13, test.hourOfDay().get()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24287);assertEquals("13", test.hourOfDay().getAsString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24288);assertEquals("13", test.hourOfDay().getAsText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24289);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24290);assertEquals("13", test.hourOfDay().getAsShortText()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24291);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24292);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24293);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24294);assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24295);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyAddMonthOfYear607() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lirsvqiqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear607",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lirsvqiqw(){try{__CLR4_4_1ileilele6qsesu.R.inc(24296); 
     __CLR4_4_1ileilele6qsesu.R.inc(24297);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24298);DateTime copy = test.monthOfYear().addToCopy(6); 
     __CLR4_4_1ileilele6qsesu.R.inc(24299);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24300);assertEquals("2004-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24301);copy = test.monthOfYear().addToCopy(7); 
     __CLR4_4_1ileilele6qsesu.R.inc(24302);assertEquals("2005-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24303);copy = test.monthOfYear().addToCopy(-5); 
     __CLR4_4_1ileilele6qsesu.R.inc(24304);assertEquals("2004-01-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24305);copy = test.monthOfYear().addToCopy(-6); 
     __CLR4_4_1ileilele6qsesu.R.inc(24306);assertEquals("2003-12-09T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24307);test = new DateTime(2004, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24308);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24309);assertEquals("2004-01-31T00:00:00.000Z", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24310);assertEquals("2004-02-29T00:00:00.000Z", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24311);copy = test.monthOfYear().addToCopy(2); 
     __CLR4_4_1ileilele6qsesu.R.inc(24312);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24313);copy = test.monthOfYear().addToCopy(3); 
     __CLR4_4_1ileilele6qsesu.R.inc(24314);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24315);test = new DateTime(2003, 1, 31, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24316);copy = test.monthOfYear().addToCopy(1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24317);assertEquals("2003-02-28T00:00:00.000Z", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertySetTextDayOfMonth608() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d1qtyoiri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth608",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d1qtyoiri(){try{__CLR4_4_1ileilele6qsesu.R.inc(24318); 
     __CLR4_4_1ileilele6qsesu.R.inc(24319);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24320);DateTime copy = test.dayOfMonth().setCopy("12"); 
     __CLR4_4_1ileilele6qsesu.R.inc(24321);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24322);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyRoundHalfFloorHourOfDay610() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v96sibirn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay610",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v96sibirn(){try{__CLR4_4_1ileilele6qsesu.R.inc(24323); 
     __CLR4_4_1ileilele6qsesu.R.inc(24324);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24325);DateTime copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24326);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24327);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24328);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24329);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24330);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ileilele6qsesu.R.inc(24331);copy = test.hourOfDay().roundHalfFloorCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24332);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyRoundHalfCeilingHourOfDay611() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9vs69irx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay611",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9vs69irx(){try{__CLR4_4_1ileilele6qsesu.R.inc(24333); 
     __CLR4_4_1ileilele6qsesu.R.inc(24334);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24335);DateTime copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24336);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24337);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24338);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24339);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24340);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ileilele6qsesu.R.inc(24341);copy = test.hourOfDay().roundHalfCeilingCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24342);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyRoundHalfEvenHourOfDay612() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13614a9is7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay612",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13614a9is7(){try{__CLR4_4_1ileilele6qsesu.R.inc(24343); 
     __CLR4_4_1ileilele6qsesu.R.inc(24344);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24345);DateTime copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24346);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24347);test = new DateTime(2004, 6, 9, 14, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24348);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24349);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24350);test = new DateTime(2004, 6, 9, 13, 30, 0, 1); 
     __CLR4_4_1ileilele6qsesu.R.inc(24351);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24352);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24353);test = new DateTime(2004, 6, 9, 13, 29, 59, 999); 
     __CLR4_4_1ileilele6qsesu.R.inc(24354);copy = test.hourOfDay().roundHalfEvenCopy(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24355);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyGetDifferenceHourOfDay914() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i1vziisk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay914",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i1vziisk(){try{__CLR4_4_1ileilele6qsesu.R.inc(24356); 
     __CLR4_4_1ileilele6qsesu.R.inc(24357);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24358);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24359);assertEquals(-2, test1.hourOfDay().getDifference(test2)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24360);assertEquals(2, test2.hourOfDay().getDifference(test1)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24361);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24362);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24363);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24364);assertEquals(13, test.hourOfDay().getDifference(null)); 
     __CLR4_4_1ileilele6qsesu.R.inc(24365);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null)); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyLeapMonthOfYear915() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzxhxdisu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear915",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzxhxdisu(){try{__CLR4_4_1ileilele6qsesu.R.inc(24366); 
     __CLR4_4_1ileilele6qsesu.R.inc(24367);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24368);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24369);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24370);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24371);test = new DateTime(2004, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24372);assertEquals(true, test.monthOfYear().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24373);assertEquals(1, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24374);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24375);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24376);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24377);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24378);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24379);test = new DateTime(2003, 2, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24380);assertEquals(false, test.monthOfYear().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24381);assertEquals(0, test.monthOfYear().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24382);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyToIntervalMillisOfSecond932() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxkqvtitb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond932",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxkqvtitb(){try{__CLR4_4_1ileilele6qsesu.R.inc(24383); 
     __CLR4_4_1ileilele6qsesu.R.inc(24384);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     __CLR4_4_1ileilele6qsesu.R.inc(24385);Interval testInterval = test.millisOfSecond().toInterval(); 
     __CLR4_4_1ileilele6qsesu.R.inc(24386);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24387);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 


public void testPropertyLeapYear934() {__CLR4_4_1ileilele6qsesu.R.globalSliceStart(getClass().getName(),24388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kw54litg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ileilele6qsesu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ileilele6qsesu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear934",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kw54litg(){try{__CLR4_4_1ileilele6qsesu.R.inc(24388); 
     __CLR4_4_1ileilele6qsesu.R.inc(24389);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24390);assertEquals(true, test.year().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24391);assertEquals(1, test.year().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24392);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24393);test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1ileilele6qsesu.R.inc(24394);assertEquals(false, test.year().isLeap()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24395);assertEquals(0, test.year().getLeapAmount()); 
     __CLR4_4_1ileilele6qsesu.R.inc(24396);assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
 }finally{__CLR4_4_1ileilele6qsesu.R.flushNeeded();}} 

    

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

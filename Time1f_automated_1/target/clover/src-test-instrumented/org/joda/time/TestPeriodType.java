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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {static class __CLR4_4_1jp2jp2le6ndprs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524466257L,8589935092L,25605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25526);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25527);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25528);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25529);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1jp2jp2le6ndprs.R.inc(25531);try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25530);
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25532);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25533);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25534);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25535);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25536);originalLocale = Locale.getDefault();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25537);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25538);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25539);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25540);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25541);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25542);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25543);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25544);Locale.setDefault(originalLocale);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25545);originalDateTimeZone = null;
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25546);originalTimeZone = null;
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25547);originalLocale = null;
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testDays317() throws Exception {__CLR4_4_1jp2jp2le6ndprs.R.globalSliceStart(getClass().getName(),25548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aa630pjpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jp2jp2le6ndprs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jp2jp2le6ndprs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aa630pjpo() throws Exception{try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25548); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25549);PeriodType type = PeriodType.days(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25550);assertEquals(2, type.size()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25551);assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25552);assertEquals("Days", type.getName()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25553);assertEquals("PeriodType[Days]", type.toString()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25554);assertEquals(true, type.equals(type)); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25555);assertEquals(true, type == PeriodType.days()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25556);assertEquals(false, type.equals(PeriodType.standard())); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25557);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25558);assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25559);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25560);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}
public void testMaskTwice2321() throws Exception {__CLR4_4_1jp2jp2le6ndprs.R.globalSliceStart(getClass().getName(),25561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epfz4fjq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jp2jp2le6ndprs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jp2jp2le6ndprs.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2321",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epfz4fjq1() throws Exception{try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25561); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25562);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25563);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25564);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25565);type = PeriodType.dayTime(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25566);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25567);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25568);type = PeriodType.dayTime(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25569);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25570);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25571);type = PeriodType.millis(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25572);type2 = type.withDaysRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25573);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25574);type = PeriodType.millis(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25575);type2 = type.withHoursRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25576);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25577);type = PeriodType.millis(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25578);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25579);assertEquals(true, type == type2); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25580);type = PeriodType.millis(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25581);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1jp2jp2le6ndprs.R.inc(25582);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25583);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25584);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25585);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25586);oos.writeObject(type);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25587);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25588);oos.close();
        
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25589);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25590);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25591);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25592);ois.close();
        
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25593);assertEquals(type, result);
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1jp2jp2le6ndprs.R.inc(25594);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25595);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25596);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25597);oos.writeObject(type);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25598);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25599);oos.close();
        
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25600);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25601);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25602);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25603);ois.close();
        
        __CLR4_4_1jp2jp2le6ndprs.R.inc(25604);assertEquals(type, result);
    }finally{__CLR4_4_1jp2jp2le6ndprs.R.flushNeeded();}}

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
    

    

    

    

    

    

    // ensure hash key distribution
    

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

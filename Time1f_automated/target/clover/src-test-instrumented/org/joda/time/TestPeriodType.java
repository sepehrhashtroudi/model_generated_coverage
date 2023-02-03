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
public class TestPeriodType extends TestCase {static class __CLR4_4_1iidiidlccietsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,24083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1iidiidlccietsz.R.inc(23989);
        __CLR4_4_1iidiidlccietsz.R.inc(23990);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1iidiidlccietsz.R.inc(23991);
        __CLR4_4_1iidiidlccietsz.R.inc(23992);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1iidiidlccietsz.R.inc(23994);try{__CLR4_4_1iidiidlccietsz.R.inc(23993);
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1iidiidlccietsz.R.inc(23995);
        __CLR4_4_1iidiidlccietsz.R.inc(23996);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1iidiidlccietsz.R.inc(23997);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1iidiidlccietsz.R.inc(23998);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1iidiidlccietsz.R.inc(23999);originalLocale = Locale.getDefault();
        __CLR4_4_1iidiidlccietsz.R.inc(24000);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1iidiidlccietsz.R.inc(24001);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1iidiidlccietsz.R.inc(24002);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1iidiidlccietsz.R.inc(24003);
        __CLR4_4_1iidiidlccietsz.R.inc(24004);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1iidiidlccietsz.R.inc(24005);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1iidiidlccietsz.R.inc(24006);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1iidiidlccietsz.R.inc(24007);Locale.setDefault(originalLocale);
        __CLR4_4_1iidiidlccietsz.R.inc(24008);originalDateTimeZone = null;
        __CLR4_4_1iidiidlccietsz.R.inc(24009);originalTimeZone = null;
        __CLR4_4_1iidiidlccietsz.R.inc(24010);originalLocale = null;
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference123() throws Throwable {__CLR4_4_1iidiidlccietsz.R.globalSliceStart(getClass().getName(),24011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l6tzomiiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iidiidlccietsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iidiidlccietsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testFactoryFieldDifference123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l6tzomiiz() throws Throwable{try{__CLR4_4_1iidiidlccietsz.R.inc(24011); 
     __CLR4_4_1iidiidlccietsz.R.inc(24012);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1iidiidlccietsz.R.inc(24013);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1iidiidlccietsz.R.inc(24014);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1iidiidlccietsz.R.inc(24015);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1iidiidlccietsz.R.inc(24016);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24017);assertEquals(-1, test.getYears()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24018);assertEquals(2, test.getMonths()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24019);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24020);assertEquals(-2, test.getDays()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24021);assertEquals(0, test.getHours()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24022);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24023);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24024);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}
public void testMaskTwice2300() throws Exception {__CLR4_4_1iidiidlccietsz.R.globalSliceStart(getClass().getName(),24025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16d1p0uijd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iidiidlccietsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iidiidlccietsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2300",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16d1p0uijd() throws Exception{try{__CLR4_4_1iidiidlccietsz.R.inc(24025); 
     __CLR4_4_1iidiidlccietsz.R.inc(24026);PeriodType type = PeriodType.dayTime(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24027);PeriodType type2 = type.withYearsRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24028);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24029);type = PeriodType.dayTime(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24030);type2 = type.withMonthsRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24031);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24032);type = PeriodType.dayTime(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24033);type2 = type.withWeeksRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24034);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24035);type = PeriodType.millis(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24036);type2 = type.withDaysRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24037);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24038);type = PeriodType.millis(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24039);type2 = type.withHoursRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24040);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24041);type = PeriodType.millis(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24042);type2 = type.withMinutesRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24043);assertEquals(true, type == type2); 
     __CLR4_4_1iidiidlccietsz.R.inc(24044);type = PeriodType.millis(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24045);type2 = type.withSecondsRemoved(); 
     __CLR4_4_1iidiidlccietsz.R.inc(24046);assertEquals(true, type == type2); 
 }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}
public void testFactoryFieldDifference1301() throws Throwable {__CLR4_4_1iidiidlccietsz.R.globalSliceStart(getClass().getName(),24047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11obow9ijz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iidiidlccietsz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iidiidlccietsz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testFactoryFieldDifference1301",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11obow9ijz() throws Throwable{try{__CLR4_4_1iidiidlccietsz.R.inc(24047); 
     __CLR4_4_1iidiidlccietsz.R.inc(24048);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1iidiidlccietsz.R.inc(24049);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1iidiidlccietsz.R.inc(24050);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1iidiidlccietsz.R.inc(24051);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1iidiidlccietsz.R.inc(24052);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24053);assertEquals(-1, test.getYears()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24054);assertEquals(2, test.getMonths()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24055);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24056);assertEquals(-2, test.getDays()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24057);assertEquals(0, test.getHours()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24058);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24059);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1iidiidlccietsz.R.inc(24060);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1iidiidlccietsz.R.inc(24061);
        __CLR4_4_1iidiidlccietsz.R.inc(24062);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1iidiidlccietsz.R.inc(24063);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1iidiidlccietsz.R.inc(24064);oos.writeObject(type);
        __CLR4_4_1iidiidlccietsz.R.inc(24065);byte[] bytes = baos.toByteArray();
        __CLR4_4_1iidiidlccietsz.R.inc(24066);oos.close();
        
        __CLR4_4_1iidiidlccietsz.R.inc(24067);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1iidiidlccietsz.R.inc(24068);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1iidiidlccietsz.R.inc(24069);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1iidiidlccietsz.R.inc(24070);ois.close();
        
        __CLR4_4_1iidiidlccietsz.R.inc(24071);assertEquals(type, result);
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1iidiidlccietsz.R.inc(24072);
        __CLR4_4_1iidiidlccietsz.R.inc(24073);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1iidiidlccietsz.R.inc(24074);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1iidiidlccietsz.R.inc(24075);oos.writeObject(type);
        __CLR4_4_1iidiidlccietsz.R.inc(24076);byte[] bytes = baos.toByteArray();
        __CLR4_4_1iidiidlccietsz.R.inc(24077);oos.close();
        
        __CLR4_4_1iidiidlccietsz.R.inc(24078);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1iidiidlccietsz.R.inc(24079);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1iidiidlccietsz.R.inc(24080);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1iidiidlccietsz.R.inc(24081);ois.close();
        
        __CLR4_4_1iidiidlccietsz.R.inc(24082);assertEquals(type, result);
    }finally{__CLR4_4_1iidiidlccietsz.R.flushNeeded();}}

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

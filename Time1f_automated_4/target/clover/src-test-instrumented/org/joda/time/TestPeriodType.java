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
public class TestPeriodType extends TestCase {static class __CLR4_4_1jcujcule6o79zu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676525845518L,8589935092L,25186,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jcujcule6o79zu.R.inc(25086);
        __CLR4_4_1jcujcule6o79zu.R.inc(25087);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jcujcule6o79zu.R.inc(25088);
        __CLR4_4_1jcujcule6o79zu.R.inc(25089);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1jcujcule6o79zu.R.inc(25091);try{__CLR4_4_1jcujcule6o79zu.R.inc(25090);
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jcujcule6o79zu.R.inc(25092);
        __CLR4_4_1jcujcule6o79zu.R.inc(25093);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jcujcule6o79zu.R.inc(25094);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jcujcule6o79zu.R.inc(25095);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jcujcule6o79zu.R.inc(25096);originalLocale = Locale.getDefault();
        __CLR4_4_1jcujcule6o79zu.R.inc(25097);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jcujcule6o79zu.R.inc(25098);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jcujcule6o79zu.R.inc(25099);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jcujcule6o79zu.R.inc(25100);
        __CLR4_4_1jcujcule6o79zu.R.inc(25101);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jcujcule6o79zu.R.inc(25102);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jcujcule6o79zu.R.inc(25103);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jcujcule6o79zu.R.inc(25104);Locale.setDefault(originalLocale);
        __CLR4_4_1jcujcule6o79zu.R.inc(25105);originalDateTimeZone = null;
        __CLR4_4_1jcujcule6o79zu.R.inc(25106);originalTimeZone = null;
        __CLR4_4_1jcujcule6o79zu.R.inc(25107);originalLocale = null;
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference1288() throws Throwable {__CLR4_4_1jcujcule6o79zu.R.globalSliceStart(getClass().getName(),25108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jteu9ljdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcujcule6o79zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcujcule6o79zu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testFactoryFieldDifference1288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jteu9ljdg() throws Throwable{try{__CLR4_4_1jcujcule6o79zu.R.inc(25108); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25109);YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25110);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1jcujcule6o79zu.R.inc(25111);Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25112);Period test = Period.fieldDifference(start, end); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25113);assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25114);assertEquals(-1, test.getYears()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25115);assertEquals(2, test.getMonths()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25116);assertEquals(0, test.getWeeks()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25117);assertEquals(-2, test.getDays()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25118);assertEquals(0, test.getHours()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25119);assertEquals(0, test.getMinutes()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25120);assertEquals(0, test.getSeconds()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25121);assertEquals(0, test.getMillis()); 
 }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}
public void testYearDayTime289() throws Exception {__CLR4_4_1jcujcule6o79zu.R.globalSliceStart(getClass().getName(),25122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6fk00jdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcujcule6o79zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcujcule6o79zu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6fk00jdu() throws Exception{try{__CLR4_4_1jcujcule6o79zu.R.inc(25122); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25123);PeriodType type = PeriodType.yearDayTime(); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25124);assertEquals(7, type.size()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25125);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25126);assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25127);assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25128);assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25129);assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25130);assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25131);assertEquals("YearDayTime", type.getName()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25132);assertEquals("PeriodType[YearDayTime]", type.toString()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25133);assertEquals(true, type.equals(type)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25134);assertEquals(true, type == PeriodType.yearDayTime()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25135);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25136);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25137);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25138);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25139);assertSameAfterSerialization(type); 
 }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}
public void testWithPeriodType3296() {__CLR4_4_1jcujcule6o79zu.R.globalSliceStart(getClass().getName(),25140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fabhsmjec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcujcule6o79zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcujcule6o79zu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWithPeriodType3296",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fabhsmjec(){try{__CLR4_4_1jcujcule6o79zu.R.inc(25140); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25141);Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25142);try { 
         __CLR4_4_1jcujcule6o79zu.R.inc(25143);test.withPeriodType(PeriodType.dayTime()); 
         __CLR4_4_1jcujcule6o79zu.R.inc(25144);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}
public void testMaskMinutes297() throws Exception {__CLR4_4_1jcujcule6o79zu.R.globalSliceStart(getClass().getName(),25145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnp2h6jeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcujcule6o79zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcujcule6o79zu.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes297",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnp2h6jeh() throws Exception{try{__CLR4_4_1jcujcule6o79zu.R.inc(25145); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25146);PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25147);assertEquals(7, type.size()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25148);assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25149);assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25150);assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25151);assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25152);assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25153);assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25154);assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25155);assertEquals(true, type.equals(type)); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25156);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25157);assertEquals(false, type.equals(PeriodType.millis())); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25158);assertEquals(true, type.hashCode() == type.hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25159);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25160);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25161);assertEquals("StandardNoMinutes", type.getName()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25162);assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     __CLR4_4_1jcujcule6o79zu.R.inc(25163);assertEqualsAfterSerialization(type); 
 }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1jcujcule6o79zu.R.inc(25164);
        __CLR4_4_1jcujcule6o79zu.R.inc(25165);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jcujcule6o79zu.R.inc(25166);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jcujcule6o79zu.R.inc(25167);oos.writeObject(type);
        __CLR4_4_1jcujcule6o79zu.R.inc(25168);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jcujcule6o79zu.R.inc(25169);oos.close();
        
        __CLR4_4_1jcujcule6o79zu.R.inc(25170);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jcujcule6o79zu.R.inc(25171);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jcujcule6o79zu.R.inc(25172);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1jcujcule6o79zu.R.inc(25173);ois.close();
        
        __CLR4_4_1jcujcule6o79zu.R.inc(25174);assertEquals(type, result);
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1jcujcule6o79zu.R.inc(25175);
        __CLR4_4_1jcujcule6o79zu.R.inc(25176);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1jcujcule6o79zu.R.inc(25177);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1jcujcule6o79zu.R.inc(25178);oos.writeObject(type);
        __CLR4_4_1jcujcule6o79zu.R.inc(25179);byte[] bytes = baos.toByteArray();
        __CLR4_4_1jcujcule6o79zu.R.inc(25180);oos.close();
        
        __CLR4_4_1jcujcule6o79zu.R.inc(25181);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1jcujcule6o79zu.R.inc(25182);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1jcujcule6o79zu.R.inc(25183);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1jcujcule6o79zu.R.inc(25184);ois.close();
        
        __CLR4_4_1jcujcule6o79zu.R.inc(25185);assertEquals(type, result);
    }finally{__CLR4_4_1jcujcule6o79zu.R.flushNeeded();}}

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

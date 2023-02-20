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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Constructors extends TestCase {static class __CLR4_4_1jb7jb7le6rcktz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531131361L,8589935092L,25092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25027);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25028);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25029);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25030);return new TestSuite(TestDuration_Constructors.class);
    }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}}

    public TestDuration_Constructors(String name) {
        super(name);__CLR4_4_1jb7jb7le6rcktz.R.inc(25032);try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25031);
    }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25033);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25034);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25035);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25036);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25037);originalLocale = Locale.getDefault();
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25038);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25039);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25040);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25041);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25042);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25043);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25044);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25045);Locale.setDefault(originalLocale);
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25046);originalDateTimeZone = null;
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25047);originalTimeZone = null;
        __CLR4_4_1jb7jb7le6rcktz.R.inc(25048);originalLocale = null;
    }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testFactory_standardDays_long229() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gh1nkjbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardDays_long229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gh1nkjbt() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25049); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25050);Duration test = Duration.standardDays(1); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25051);assertEquals(24L * 60L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25052);test = Duration.standardDays(2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25053);assertEquals(2L * 24L * 60L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25054);test = Duration.standardDays(0); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25055);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testFactory_standardMinutes_long230() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163dbpmjc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardMinutes_long230",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163dbpmjc0() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25056); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25057);Duration test = Duration.standardMinutes(1); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25058);assertEquals(60L * 1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25059);test = Duration.standardMinutes(2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25060);assertEquals(2L * 60L * 1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25061);test = Duration.standardMinutes(0); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25062);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testFactory_standardSeconds_long231() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1tj49jc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardSeconds_long231",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1tj49jc7() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25063); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25064);Duration test = Duration.standardSeconds(1); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25065);assertEquals(1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25066);test = Duration.standardSeconds(2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25067);assertEquals(2L * 1000L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25068);test = Duration.standardSeconds(0); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25069);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testFactory_millis_long233() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x9iazjce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_millis_long233",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x9iazjce() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25070); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25071);Duration test = Duration.millis(1); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25072);assertEquals(1L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25073);test = Duration.millis(2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25074);assertEquals(2L, test.getMillis()); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25075);test = Duration.millis(0); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25076);assertSame(Duration.ZERO, test); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testConstructor_RI_RI1235() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bquir6jcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI1235",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bquir6jcl() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25077); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25078);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25079);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25080);Duration test = new Duration(dt1, dt2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25081);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis()); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testConstructor_Object3236() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149e2wxjcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object3236",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149e2wxjcq() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25082); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25083);long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25084);Long base = new Long(length); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25085);Duration test = new Duration(base); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25086);assertEquals(length, test.getMillis()); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 


public void testConstructor_RI_RI4672() throws Throwable {__CLR4_4_1jb7jb7le6rcktz.R.globalSliceStart(getClass().getName(),25087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6ap84jcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jb7jb7le6rcktz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jb7jb7le6rcktz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI4672",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6ap84jcv() throws Throwable{try{__CLR4_4_1jb7jb7le6rcktz.R.inc(25087); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25088);DateTime dt1 = null; 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25089);DateTime dt2 = null; 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25090);Duration test = new Duration(dt1, dt2); 
     __CLR4_4_1jb7jb7le6rcktz.R.inc(25091);assertEquals(0L, test.getMillis()); 
 }finally{__CLR4_4_1jb7jb7le6rcktz.R.flushNeeded();}} 

    

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
    

    

    

    

    

}

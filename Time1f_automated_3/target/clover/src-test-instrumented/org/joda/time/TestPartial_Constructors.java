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

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1jfljflle6np4kt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,25225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1jfljflle6np4kt.R.inc(25185);
        __CLR4_4_1jfljflle6np4kt.R.inc(25186);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jfljflle6np4kt.R.inc(25187);
        __CLR4_4_1jfljflle6np4kt.R.inc(25188);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1jfljflle6np4kt.R.inc(25190);try{__CLR4_4_1jfljflle6np4kt.R.inc(25189);
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jfljflle6np4kt.R.inc(25191);
        __CLR4_4_1jfljflle6np4kt.R.inc(25192);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1jfljflle6np4kt.R.inc(25193);zone = DateTimeZone.getDefault();
        __CLR4_4_1jfljflle6np4kt.R.inc(25194);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jfljflle6np4kt.R.inc(25195);
        __CLR4_4_1jfljflle6np4kt.R.inc(25196);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1jfljflle6np4kt.R.inc(25197);DateTimeZone.setDefault(zone);
        __CLR4_4_1jfljflle6np4kt.R.inc(25198);zone = null;
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
public void testConstructorEx8_TypeArray_intArray252() throws Throwable {__CLR4_4_1jfljflle6np4kt.R.globalSliceStart(getClass().getName(),25199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvg0mijfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jfljflle6np4kt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jfljflle6np4kt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvg0mijfz() throws Throwable{try{__CLR4_4_1jfljflle6np4kt.R.inc(25199); 
     __CLR4_4_1jfljflle6np4kt.R.inc(25200);int[] values = new int[] { 1, 1, 1 }; 
     __CLR4_4_1jfljflle6np4kt.R.inc(25201);DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year() }; 
     __CLR4_4_1jfljflle6np4kt.R.inc(25202);try { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25203);new Partial(types, values); 
         __CLR4_4_1jfljflle6np4kt.R.inc(25204);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25205);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1jfljflle6np4kt.R.inc(25206);types = new DateTimeFieldType[] { DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() }; 
     __CLR4_4_1jfljflle6np4kt.R.inc(25207);try { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25208);new Partial(types, values); 
         __CLR4_4_1jfljflle6np4kt.R.inc(25209);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25210);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1jfljflle6np4kt.R.inc(25211);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth() }; 
     __CLR4_4_1jfljflle6np4kt.R.inc(25212);try { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25213);new Partial(types, values); 
         __CLR4_4_1jfljflle6np4kt.R.inc(25214);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25215);assertMessageContains(ex, "must not", "duplicate"); 
     } 
     __CLR4_4_1jfljflle6np4kt.R.inc(25216);types = new DateTimeFieldType[] { DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay() }; 
     __CLR4_4_1jfljflle6np4kt.R.inc(25217);try { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25218);new Partial(types, values); 
         __CLR4_4_1jfljflle6np4kt.R.inc(25219);fail(); 
     } catch (IllegalArgumentException ex) { 
         __CLR4_4_1jfljflle6np4kt.R.inc(25220);assertMessageContains(ex, "must not", "duplicate"); 
     } 
 }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    

    /**
     * Test constructor
     */
    

    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1jfljflle6np4kt.R.inc(25221);
        __CLR4_4_1jfljflle6np4kt.R.inc(25222);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1jfljflle6np4kt.R.inc(25223);
        __CLR4_4_1jfljflle6np4kt.R.inc(25224);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1jfljflle6np4kt.R.flushNeeded();}}

}

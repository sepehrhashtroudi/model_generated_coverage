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

import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1hu2hu2lc8axdod{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,23285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23114);
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23115);String str = System.getProperty("java.version");
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23116);boolean old = true;
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23117);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hu2hu2lc8axdod.R.iget(23118)!=0|true))||(__CLR4_4_1hu2hu2lc8axdod.R.iget(23119)==0&false))) {{
            __CLR4_4_1hu2hu2lc8axdod.R.inc(23120);old = false;
        }
        }__CLR4_4_1hu2hu2lc8axdod.R.inc(23121);OLD_JDK = old;
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
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
        
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23122);
        // don't call Policy.getPolicy()
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23123);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23124);
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23125);Permissions p = new Permissions();
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23126);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23127);return p;
            }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23128);
            }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23129);
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23130);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hu2hu2lc8axdod.R.iget(23131)!=0|true))||(__CLR4_4_1hu2hu2lc8axdod.R.iget(23132)==0&false))) {{
                    __CLR4_4_1hu2hu2lc8axdod.R.inc(23133);return false;
                }
                }__CLR4_4_1hu2hu2lc8axdod.R.inc(23134);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
        };
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23135);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23136);
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23137);Permissions p = new Permissions();
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23138);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hu2hu2lc8axdod.R.inc(23139);return p;
            }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23140);
            }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23141);
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23142);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23143);
        __CLR4_4_1hu2hu2lc8axdod.R.inc(23144);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1hu2hu2lc8axdod.R.inc(23146);try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23145);
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23147);
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23148);
    }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testMillisProvider89() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aujrddhv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider89",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aujrddhv1(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23149); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23150);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23151);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() { 
  
             public long getMillis() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23152); 
                 __CLR4_4_1hu2hu2lc8axdod.R.inc(23153);return 1L; 
             }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 
         }); 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23154);assertEquals(1L, DateTimeUtils.currentTimeMillis()); 
     } finally { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23155);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetInstantChronology_RI108() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eauiynhv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eauiynhv8(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23156); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23157);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23158);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23159);Instant i = new Instant(123L); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23160);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23161);AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23162); 
             __CLR4_4_1hu2hu2lc8axdod.R.inc(23163);return 0L; 
         }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 
  
         public Chronology getChronology() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23164); 
             __CLR4_4_1hu2hu2lc8axdod.R.inc(23165);return null; 
         }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23166);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23167);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetInstantMillis_RI152() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvw1eqhvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI152",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvw1eqhvk(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23168); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23169);Instant i = new Instant(123L); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23170);assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23171);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23172);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23173);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null)); 
     } finally { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23174);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetReadableInterval_ReadableInterval376() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fst6m6hvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval376",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fst6m6hvr(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23175); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23176);ReadableInterval input = new Interval(0, 100L); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23177);assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23178);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23179);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23180);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23181);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP459() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177saiuhvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP459",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177saiuhvy(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23182); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23183);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23184);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23185);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23186);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23187);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23188);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23189);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23190);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23191);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23192);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23193);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23194);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23195);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23196);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23197);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23198);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23199);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testMillisProvider_null508() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ym55lzhwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null508",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ym55lzhwg(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23200); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23201);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23202);DateTimeUtils.setCurrentMillisProvider(null); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetIntervalChronology_RInterval593() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3ssjhhwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval593",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3ssjhhwj(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23203); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23204);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23205);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23206);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23207);MutableInterval ai = new MutableInterval() { 
  
         private static final long serialVersionUID = 1L; 
  
         public Chronology getChronology() {try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23208); 
             __CLR4_4_1hu2hu2lc8axdod.R.inc(23209);return null; 
         }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23210);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP_GJChronology682() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rq5ulyhwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology682",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rq5ulyhwr(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23211); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23212);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23213);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23214);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23215);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23216);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23217);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23218);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23219);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23220);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23221);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23222);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23223);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23224);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23225);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23226);try { 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23227);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hu2hu2lc8axdod.R.inc(23228);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testClass961() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c54lfvhx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass961",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c54lfvhx9(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23229); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23230);Class<?> cls = DateTimeUtils.class; 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23231);assertEquals(true, Modifier.isPublic(cls.getModifiers())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23232);assertEquals(false, Modifier.isFinal(cls.getModifiers())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23233);assertEquals(1, cls.getDeclaredConstructors().length); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23234);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23235);new DateTimeUtils() { 
     }; 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetIntervalChronology_RI_RI1009() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kiaankhxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI1009",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kiaankhxg(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23236); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23237);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23238);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23239);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23240);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23241);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23242);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void test_julianDay1159() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8n56jhxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay1159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8n56jhxn(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23243); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23244);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23245);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23246);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23247);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23248);base = base.plusHours(6); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23249);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23250);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23251);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23252);base = base.plusHours(6); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23253);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23254);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23255);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23256);base = base.plusHours(6); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23257);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23258);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23259);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23260);base = base.plusHours(6); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23261);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23262);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23263);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23264);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23265);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23266);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23267);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23268);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23269);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23270);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23271);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23272);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23273);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23274);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetDurationMillis_RI1251() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tg3kg4hyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI1251",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tg3kg4hyj(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23275); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23276);Duration dur = new Duration(123L); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23277);assertEquals(123L, DateTimeUtils.getDurationMillis(dur)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23278);assertEquals(0L, DateTimeUtils.getDurationMillis(null)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetPeriodType_PeriodType1410() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14m95z0hyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType1410",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14m95z0hyn(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23279); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23280);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime())); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23281);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 


public void testGetZone_Zone1759() {__CLR4_4_1hu2hu2lc8axdod.R.globalSliceStart(getClass().getName(),23282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmaub0hyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hu2hu2lc8axdod.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hu2hu2lc8axdod.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone1759",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmaub0hyq(){try{__CLR4_4_1hu2hu2lc8axdod.R.inc(23282); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23283);assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     __CLR4_4_1hu2hu2lc8axdod.R.inc(23284);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 }finally{__CLR4_4_1hu2hu2lc8axdod.R.flushNeeded();}} 

    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void testOffsetMillisToZero() {
//         long now1 = 0L;
//         try {
//             // set time to one day ago
//             DateTimeUtils.setCurrentMillisOffset(0);
//             now1 = DateTimeUtils.currentTimeMillis();
//         } finally {
//             DateTimeUtils.setCurrentMillisSystem();
//         }
//         long now2 = DateTimeUtils.currentTimeMillis();
//         assertEquals(now1, now2);
//     }

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

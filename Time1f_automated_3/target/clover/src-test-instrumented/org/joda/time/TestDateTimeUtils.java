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
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1h6gh6gle6np4br{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,22325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22264);
        __CLR4_4_1h6gh6gle6np4br.R.inc(22265);String str = System.getProperty("java.version");
        __CLR4_4_1h6gh6gle6np4br.R.inc(22266);boolean old = true;
        __CLR4_4_1h6gh6gle6np4br.R.inc(22267);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1h6gh6gle6np4br.R.iget(22268)!=0|true))||(__CLR4_4_1h6gh6gle6np4br.R.iget(22269)==0&false))) {{
            __CLR4_4_1h6gh6gle6np4br.R.inc(22270);old = false;
        }
        }__CLR4_4_1h6gh6gle6np4br.R.inc(22271);OLD_JDK = old;
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

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
    static {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22272);
        // don't call Policy.getPolicy()
        __CLR4_4_1h6gh6gle6np4br.R.inc(22273);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22274);
                __CLR4_4_1h6gh6gle6np4br.R.inc(22275);Permissions p = new Permissions();
                __CLR4_4_1h6gh6gle6np4br.R.inc(22276);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h6gh6gle6np4br.R.inc(22277);return p;
            }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22278);
            }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22279);
                __CLR4_4_1h6gh6gle6np4br.R.inc(22280);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1h6gh6gle6np4br.R.iget(22281)!=0|true))||(__CLR4_4_1h6gh6gle6np4br.R.iget(22282)==0&false))) {{
                    __CLR4_4_1h6gh6gle6np4br.R.inc(22283);return false;
                }
                }__CLR4_4_1h6gh6gle6np4br.R.inc(22284);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
        };
        __CLR4_4_1h6gh6gle6np4br.R.inc(22285);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22286);
                __CLR4_4_1h6gh6gle6np4br.R.inc(22287);Permissions p = new Permissions();
                __CLR4_4_1h6gh6gle6np4br.R.inc(22288);p.add(new AllPermission());  // enable everything
                __CLR4_4_1h6gh6gle6np4br.R.inc(22289);return p;
            }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22290);
            }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22291);
        __CLR4_4_1h6gh6gle6np4br.R.inc(22292);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22293);
        __CLR4_4_1h6gh6gle6np4br.R.inc(22294);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1h6gh6gle6np4br.R.inc(22296);try{__CLR4_4_1h6gh6gle6np4br.R.inc(22295);
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22297);
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22298);
    }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testOffsetMillis326() {__CLR4_4_1h6gh6gle6np4br.R.globalSliceStart(getClass().getName(),22299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8s3ebh7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6gh6gle6np4br.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6gh6gle6np4br.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis326",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8s3ebh7f(){try{__CLR4_4_1h6gh6gle6np4br.R.inc(22299); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22300);try { 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22301);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22302);long nowSystem = System.currentTimeMillis(); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22303);long now = DateTimeUtils.currentTimeMillis(); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22304);long nowAdjustDay = now + (24 * 60 * 60 * 1000); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22305);assertTrue((now < nowSystem)); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22306);assertTrue((nowAdjustDay >= nowSystem)); 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22307);assertTrue((nowAdjustDay - nowSystem) < 10000L); 
     } finally { 
         __CLR4_4_1h6gh6gle6np4br.R.inc(22308);DateTimeUtils.setCurrentMillisSystem(); 
     } 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22309);long nowSystem = System.currentTimeMillis(); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22310);long now = DateTimeUtils.currentTimeMillis(); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22311);assertTrue((now >= nowSystem)); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22312);assertTrue((now - nowSystem) < 10000L); 
 }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
public void testGetInstantMillis_RI327() {__CLR4_4_1h6gh6gle6np4br.R.globalSliceStart(getClass().getName(),22313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqptzgh7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h6gh6gle6np4br.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h6gh6gle6np4br.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI327",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqptzgh7t(){try{__CLR4_4_1h6gh6gle6np4br.R.inc(22313); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22314);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22315);assertEquals(123L, DateTimeUtils.getInstantMillis(dt)); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22316);Instant i = new Instant(123L); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22317);assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22318);AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22319); 
             __CLR4_4_1h6gh6gle6np4br.R.inc(22320);return 0L; 
         }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}} 
  
         public Chronology getChronology() {try{__CLR4_4_1h6gh6gle6np4br.R.inc(22321); 
             __CLR4_4_1h6gh6gle6np4br.R.inc(22322);return null; 
         }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}} 
     }; 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22323);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantMillis(ai)); 
     __CLR4_4_1h6gh6gle6np4br.R.inc(22324);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantMillis(null)); 
 }finally{__CLR4_4_1h6gh6gle6np4br.R.flushNeeded();}}
    

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

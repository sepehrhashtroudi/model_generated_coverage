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
public class TestDateTimeUtils extends TestCase {static class __CLR4_4_1hqohqole6rjc5q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,23166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hqohqole6rjc5q.R.inc(22992);
        __CLR4_4_1hqohqole6rjc5q.R.inc(22993);String str = System.getProperty("java.version");
        __CLR4_4_1hqohqole6rjc5q.R.inc(22994);boolean old = true;
        __CLR4_4_1hqohqole6rjc5q.R.inc(22995);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hqohqole6rjc5q.R.iget(22996)!=0|true))||(__CLR4_4_1hqohqole6rjc5q.R.iget(22997)==0&false))) {{
            __CLR4_4_1hqohqole6rjc5q.R.inc(22998);old = false;
        }
        }__CLR4_4_1hqohqole6rjc5q.R.inc(22999);OLD_JDK = old;
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

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
    static {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23000);
        // don't call Policy.getPolicy()
        __CLR4_4_1hqohqole6rjc5q.R.inc(23001);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23002);
                __CLR4_4_1hqohqole6rjc5q.R.inc(23003);Permissions p = new Permissions();
                __CLR4_4_1hqohqole6rjc5q.R.inc(23004);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hqohqole6rjc5q.R.inc(23005);return p;
            }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23006);
            }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23007);
                __CLR4_4_1hqohqole6rjc5q.R.inc(23008);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hqohqole6rjc5q.R.iget(23009)!=0|true))||(__CLR4_4_1hqohqole6rjc5q.R.iget(23010)==0&false))) {{
                    __CLR4_4_1hqohqole6rjc5q.R.inc(23011);return false;
                }
                }__CLR4_4_1hqohqole6rjc5q.R.inc(23012);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
        };
        __CLR4_4_1hqohqole6rjc5q.R.inc(23013);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23014);
                __CLR4_4_1hqohqole6rjc5q.R.inc(23015);Permissions p = new Permissions();
                __CLR4_4_1hqohqole6rjc5q.R.inc(23016);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hqohqole6rjc5q.R.inc(23017);return p;
            }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23018);
            }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}
    
    public static void main(String[] args) {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23019);
        __CLR4_4_1hqohqole6rjc5q.R.inc(23020);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23021);
        __CLR4_4_1hqohqole6rjc5q.R.inc(23022);return new TestSuite(TestDateTimeUtils.class);
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

    public TestDateTimeUtils(String name) {
        super(name);__CLR4_4_1hqohqole6rjc5q.R.inc(23024);try{__CLR4_4_1hqohqole6rjc5q.R.inc(23023);
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23025);
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23026);
    }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}}

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP7() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwiglhhrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwiglhhrn(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23027); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23028);YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23029);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23030);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23031);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23032);Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23033);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23034);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23035);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23036);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23037);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23038);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23039);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23040);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23041);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23042);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23043);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23044);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP_GJChronology135() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ter9frhs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology135",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ter9frhs5(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23045); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23046);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23047);assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23048);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23049);assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23050);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23051);assertEquals(true, DateTimeUtils.isContiguous(year)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23052);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23053);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23054);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23055);assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23056);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23057);assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23058);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23059);assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23060);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23061);DateTimeUtils.isContiguous((ReadablePartial) null); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23062);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testClass798() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x017h3hsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x017h3hsn(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23063); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23064);Class<?> cls = DateTimeUtils.class; 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23065);assertEquals(true, Modifier.isPublic(cls.getModifiers())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23066);assertEquals(false, Modifier.isFinal(cls.getModifiers())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23067);assertEquals(1, cls.getDeclaredConstructors().length); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23068);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23069);new DateTimeUtils() { 
     }; 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testOffsetMillis799() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le1e6rhsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis799",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le1e6rhsu(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23070); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23071);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23072);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23073);long nowSystem = System.currentTimeMillis(); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23074);long now = DateTimeUtils.currentTimeMillis(); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23075);long nowAdjustDay = now + (24 * 60 * 60 * 1000); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23076);assertTrue((now < nowSystem)); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23077);assertTrue((nowAdjustDay >= nowSystem)); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23078);assertTrue((nowAdjustDay - nowSystem) < 10000L); 
     } finally { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23079);DateTimeUtils.setCurrentMillisSystem(); 
     } 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23080);long nowSystem = System.currentTimeMillis(); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23081);long now = DateTimeUtils.currentTimeMillis(); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23082);assertTrue((now >= nowSystem)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23083);assertTrue((now - nowSystem) < 10000L); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetInstantMillis_RI800() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wuv0sht8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI800",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wuv0sht8(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23084); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23085);Instant i = new Instant(123L); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23086);assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23087);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23088);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23089);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null)); 
     } finally { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23090);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testMillisProvider801() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xohei1htf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xohei1htf(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23091); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23092);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23093);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() { 
  
             public long getMillis() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23094); 
                 __CLR4_4_1hqohqole6rjc5q.R.inc(23095);return 1L; 
             }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 
         }); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23096);assertEquals(1L, DateTimeUtils.currentTimeMillis()); 
     } finally { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23097);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetInstantChronology_RI802() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k543tshtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI802",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k543tshtm(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23098); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23099);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23100);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23101);Instant i = new Instant(123L); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23102);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23103);AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23104); 
             __CLR4_4_1hqohqole6rjc5q.R.inc(23105);return 0L; 
         }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 
  
         public Chronology getChronology() {try{__CLR4_4_1hqohqole6rjc5q.R.inc(23106); 
             __CLR4_4_1hqohqole6rjc5q.R.inc(23107);return null; 
         }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 
     }; 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23108);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23109);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetIntervalChronology_RI_RI803() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uze1whhty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI803",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uze1whhty(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23110); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23111);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23112);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23113);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23114);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23115);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23116);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetReadableInterval_ReadableInterval804() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ovmughu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval804",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ovmughu5(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23117); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23118);ReadableInterval input = new Interval(0, 100L); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23119);assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23120);try { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23121);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23122);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         __CLR4_4_1hqohqole6rjc5q.R.inc(23123);DateTimeUtils.setCurrentMillisSystem(); 
     } 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetZone_Zone805() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kz5dk9huc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone805",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kz5dk9huc(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23124); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23125);assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23126);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetPeriodType_PeriodType806() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rracmihuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType806",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rracmihuf(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23127); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23128);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23129);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void testGetDurationMillis_RI807() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13nnvn6hui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13nnvn6hui(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23130); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23131);Duration dur = new Duration(123L); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23132);assertEquals(123L, DateTimeUtils.getDurationMillis(dur)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23133);assertEquals(0L, DateTimeUtils.getDurationMillis(null)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 


public void test_julianDay809() {__CLR4_4_1hqohqole6rjc5q.R.globalSliceStart(getClass().getName(),23134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moxokuhum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hqohqole6rjc5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hqohqole6rjc5q.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay809",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moxokuhum(){try{__CLR4_4_1hqohqole6rjc5q.R.inc(23134); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23135);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23136);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23137);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23138);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23139);base = base.plusHours(6); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23140);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23141);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23142);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23143);base = base.plusHours(6); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23144);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23145);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23146);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23147);base = base.plusHours(6); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23148);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23149);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23150);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23151);base = base.plusHours(6); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23152);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23153);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23154);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23155);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23156);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23157);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23158);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23159);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23160);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23161);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23162);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23163);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23164);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     __CLR4_4_1hqohqole6rjc5q.R.inc(23165);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 }finally{__CLR4_4_1hqohqole6rjc5q.R.flushNeeded();}} 

    

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

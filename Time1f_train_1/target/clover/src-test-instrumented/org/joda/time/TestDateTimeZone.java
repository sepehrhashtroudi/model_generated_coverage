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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.text.DateFormatSymbols;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1hrkhrkle6qe9a4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676529530800L,8589935092L,23408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23024);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23025);String str = System.getProperty("java.version");
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23026);boolean old = true;
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23027);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hrkhrkle6qe9a4.R.iget(23028)!=0|true))||(__CLR4_4_1hrkhrkle6qe9a4.R.iget(23029)==0&false))) {{
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23030);old = false;
        }
        }__CLR4_4_1hrkhrkle6qe9a4.R.inc(23031);OLD_JDK = old;
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    
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
    private long TEST_TIME_SUMMER =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-01-09
    private long TEST_TIME_WINTER =
            (y2002days + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    // 2002-04-05 Fri
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06 Tue
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23032);
        // don't call Policy.getPolicy()
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23033);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23034);
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23035);Permissions p = new Permissions();
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23036);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23037);return p;
            }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23038);
            }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23039);
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23040);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hrkhrkle6qe9a4.R.iget(23041)!=0|true))||(__CLR4_4_1hrkhrkle6qe9a4.R.iget(23042)==0&false))) {{
                    __CLR4_4_1hrkhrkle6qe9a4.R.inc(23043);return false;
                }
                }__CLR4_4_1hrkhrkle6qe9a4.R.inc(23044);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        };
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23045);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23046);
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23047);Permissions p = new Permissions();
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23048);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hrkhrkle6qe9a4.R.inc(23049);return p;
            }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23050);
            }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23051);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23052);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23053);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23054);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1hrkhrkle6qe9a4.R.inc(23056);try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23055);
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23057);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23058);locale = Locale.getDefault();
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23059);zone = DateTimeZone.getDefault();
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23060);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23061);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23062);Locale.setDefault(locale);
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23063);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForID_String_old258() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fplcahso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old258",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fplcahso(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23064); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23065);Map<String, String> map = new LinkedHashMap<String, String>(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23066);map.put("GMT", "UTC"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23067);map.put("WET", "WET"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23068);map.put("CET", "CET"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23069);map.put("MET", "CET"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23070);map.put("ECT", "CET"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23071);map.put("EET", "EET"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23072);map.put("MIT", "Pacific/Apia"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23073);map.put("HST", "Pacific/Honolulu"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23074);map.put("AST", "America/Anchorage"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23075);map.put("PST", "America/Los_Angeles"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23076);map.put("MST", "America/Denver"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23077);map.put("PNT", "America/Phoenix"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23078);map.put("CST", "America/Chicago"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23079);map.put("EST", "America/New_York"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23080);map.put("IET", "America/Indiana/Indianapolis"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23081);map.put("PRT", "America/Puerto_Rico"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23082);map.put("CNT", "America/St_Johns"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23083);map.put("AGT", "America/Argentina/Buenos_Aires"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23084);map.put("BET", "America/Sao_Paulo"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23085);map.put("ART", "Africa/Cairo"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23086);map.put("CAT", "Africa/Harare"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23087);map.put("EAT", "Africa/Addis_Ababa"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23088);map.put("NET", "Asia/Yerevan"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23089);map.put("PLT", "Asia/Karachi"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23090);map.put("IST", "Asia/Kolkata"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23091);map.put("BST", "Asia/Dhaka"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23092);map.put("VST", "Asia/Ho_Chi_Minh"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23093);map.put("CTT", "Asia/Shanghai"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23094);map.put("JST", "Asia/Tokyo"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23095);map.put("ACT", "Australia/Darwin"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23096);map.put("AET", "Australia/Sydney"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23097);map.put("SST", "Pacific/Guadalcanal"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23098);map.put("NST", "Pacific/Auckland"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23099);for (String key : map.keySet()) {{ 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23100);String value = map.get(key); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23101);TimeZone juZone = TimeZone.getTimeZone(key); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23102);DateTimeZone zone = DateTimeZone.forTimeZone(juZone); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23103);assertEquals(value, zone.getID()); 
     } 
 }}finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testIsFixed265() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc9xk0hts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed265",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc9xk0hts(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23104); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23105);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23106);assertEquals(false, zone.isFixed()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23107);assertEquals(true, DateTimeZone.UTC.isFixed()); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testEqualsHashCode270() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18iy0cmhtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode270",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18iy0cmhtw(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23108); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23109);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23110);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23111);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23112);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23113);assertEquals(true, zone2.equals(zone1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23114);assertEquals(true, zone2.equals(zone2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23115);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23116);DateTimeZone zone3 = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23117);assertEquals(true, zone3.equals(zone3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23118);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23119);assertEquals(false, zone2.equals(zone3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23120);assertEquals(false, zone3.equals(zone1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23121);assertEquals(false, zone3.equals(zone2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23122);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23123);assertEquals(true, zone3.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23124);DateTimeZone zone4 = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23125);assertEquals(true, zone4.equals(zone4)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23126);assertEquals(false, zone1.equals(zone4)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23127);assertEquals(false, zone2.equals(zone4)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23128);assertEquals(false, zone3.equals(zone4)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23129);assertEquals(false, zone4.equals(zone1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23130);assertEquals(false, zone4.equals(zone2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23131);assertEquals(false, zone4.equals(zone3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23132);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23133);assertEquals(true, zone4.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23134);DateTimeZone zone5 = DateTimeZone.forID("+02:00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23135);assertEquals(true, zone5.equals(zone5)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23136);assertEquals(false, zone1.equals(zone5)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23137);assertEquals(false, zone2.equals(zone5)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23138);assertEquals(false, zone3.equals(zone5)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23139);assertEquals(false, zone4.equals(zone5)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23140);assertEquals(false, zone5.equals(zone1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23141);assertEquals(false, zone5.equals(zone2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23142);assertEquals(false, zone5.equals(zone3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23143);assertEquals(false, zone5.equals(zone4)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23144);assertEquals(false, zone1.hashCode() == zone5.hashCode()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23145);assertEquals(true, zone5.hashCode() == zone5.hashCode()); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testProvider_badClassName624() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfred7huy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName624",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfred7huy(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23146); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23147);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23148);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23149);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23150);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23151);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23152);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testSerialization2626() throws Exception {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofkhhphv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2626",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofkhhphv5() throws Exception{try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23153); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23154);DateTimeZone zone = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23155);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23156);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23157);oos.writeObject(zone); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23158);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23159);oos.close(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23160);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23161);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23162);DateTimeZone result = (DateTimeZone) ois.readObject(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23163);ois.close(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23164);assertSame(zone, result); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testIsLocalDateTimeGap_Berlin627() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s0f5fhvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin627",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s0f5fhvh(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23165); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23166);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23167);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23168);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23169);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23170);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23171);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23172);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23173);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23174);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23175);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23176);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23177);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testDefault804() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyouushvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault804",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyouushvu(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23178); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23179);assertNotNull(DateTimeZone.getDefault()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23180);DateTimeZone.setDefault(PARIS); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23181);assertSame(PARIS, DateTimeZone.getDefault()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23182);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23183);DateTimeZone.setDefault(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23184);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testForOffsetHours_int805() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jxxp2phw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int805",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jxxp2phw1(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23185); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23186);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23187);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23188);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23189);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23190);DateTimeZone.forOffsetHours(999999); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23191);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testForID_String806() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udl2jdhw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String806",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udl2jdhw8(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23192); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23193);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23194);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23195);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23196);zone = DateTimeZone.forID("UTC"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23197);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23198);zone = DateTimeZone.forID("+00:00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23199);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23200);zone = DateTimeZone.forID("+00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23201);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23202);zone = DateTimeZone.forID("+01:23"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23203);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23204);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23205);zone = DateTimeZone.forID("-02:00"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23206);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23207);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23208);zone = DateTimeZone.forID("-07:05:34.0"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23209);assertEquals("-07:05:34", zone.getID()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23210);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23211);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23212);DateTimeZone.forID("SST"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23213);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23214);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23215);DateTimeZone.forID("europe/london"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23216);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23217);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23218);DateTimeZone.forID("Europe/UK"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23219);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23220);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23221);DateTimeZone.forID("+"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23222);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23223);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23224);DateTimeZone.forID("+0"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23225);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testForOffsetHoursMinutes_int_int807() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lxfxwhx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lxfxwhx6(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23226); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23227);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23228);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23229);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23230);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23231);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23232);DateTimeZone.forOffsetHoursMinutes(2, -15); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23233);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23234);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23235);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23236);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23237);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23238);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23239);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23240);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23241);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23242);DateTimeZone.forOffsetHoursMinutes(2, 60); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23243);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23244);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23245);DateTimeZone.forOffsetHoursMinutes(-2, 60); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23246);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23247);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23248);DateTimeZone.forOffsetHoursMinutes(24, 0); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23249);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23250);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23251);DateTimeZone.forOffsetHoursMinutes(-24, 0); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23252);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testForOffsetMillis_int808() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmwezdhxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int808",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmwezdhxx(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23253); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23254);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23255);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23256);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23257);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23258);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23259);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testGetAvailableIDs809() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjcidxhy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs809",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjcidxhy4(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23260); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23261);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testProvider810() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpv1y3hy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider810",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpv1y3hy6(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23262); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23263);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23264);assertNotNull(DateTimeZone.getProvider()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23265);Provider provider = DateTimeZone.getProvider(); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23266);DateTimeZone.setProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23267);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23268);try { 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23269);DateTimeZone.setProvider(new MockNullIDSProvider()); 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23270);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23271);try { 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23272);DateTimeZone.setProvider(new MockEmptyIDSProvider()); 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23273);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23274);try { 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23275);DateTimeZone.setProvider(new MockNoUTCProvider()); 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23276);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23277);try { 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23278);DateTimeZone.setProvider(new MockBadUTCProvider()); 
             __CLR4_4_1hrkhrkle6qe9a4.R.inc(23279);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23280);Provider prov = new MockOKProvider(); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23281);DateTimeZone.setProvider(prov); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23282);assertSame(prov, DateTimeZone.getProvider()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23283);assertEquals(2, DateTimeZone.getAvailableIDs().size()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23284);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23285);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London")); 
     } finally { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23286);DateTimeZone.setProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23287);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23288);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23289);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23290);DateTimeZone.setProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23291);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23292);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23293);DateTimeZone.setProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23294);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testNameProvider811() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mnsci9hz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider811",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mnsci9hz3(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23295); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23296);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23297);assertNotNull(DateTimeZone.getNameProvider()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23298);NameProvider provider = DateTimeZone.getNameProvider(); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23299);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23300);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23301);provider = new MockOKButNullNameProvider(); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23302);DateTimeZone.setNameProvider(provider); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23303);assertSame(provider, DateTimeZone.getNameProvider()); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23304);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23305);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23306);DateTimeZone.setNameProvider(null); 
     } 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23307);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23308);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23309);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23310);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23311);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23312);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23313);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testConstructor812() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18muy60hzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor812",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18muy60hzm(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23314); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23315);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23316);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23317);try { 
         __CLR4_4_1hrkhrkle6qe9a4.R.inc(23318);new DateTimeZone(null) { 
  
             public String getNameKey(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23319); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23320);return null; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public int getOffset(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23321); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23322);return 0; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public int getStandardOffset(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23323); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23324);return 0; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public boolean isFixed() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23325); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23326);return false; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public long nextTransition(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23327); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23328);return 0; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public long previousTransition(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23329); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23330);return 0; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
  
             public boolean equals(Object object) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23331); 
                 __CLR4_4_1hrkhrkle6qe9a4.R.inc(23332);return false; 
             }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 
         }; 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testGetShortNameNullKey813() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5s1f0i05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey813",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5s1f0i05(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23333); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23334);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23335);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testGetNameNullKey814() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm2mivi08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey814",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm2mivi08(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23336); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23337);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23338);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testToTimeZone819() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16wt83ji0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone819",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16wt83ji0b(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23339); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23340);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23341);TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23342);assertEquals("Europe/Paris", tz.getID()); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testGetShortNameProviderName1398() {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yv9ndi0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName1398",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yv9ndi0f(){try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23343); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23344);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23345);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23346);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23347);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 


public void testPatchedNameKeysSydneyHistoric1399() throws Exception {__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceStart(getClass().getName(),23348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lny080i0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hrkhrkle6qe9a4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hrkhrkle6qe9a4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric1399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lny080i0k() throws Exception{try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23348); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23349);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23350);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23351);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23352);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1hrkhrkle6qe9a4.R.inc(23353);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}} 

    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23354);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23355);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23356);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23357);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23358);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23359);return new HashSet();
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23360);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23361);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23362);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23363);Set set = new HashSet();
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23364);set.add("Europe/London");
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23365);return set;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23366);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23367);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23368);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23369);Set set = new HashSet();
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23370);set.add("UTC");
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23371);set.add("Europe/London");
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23372);return set;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23373);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23374);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23375);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23376);Set set = new HashSet();
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23377);set.add("UTC");
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23378);set.add("Europe/London");
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23379);return set;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23380);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23381);return DateTimeZone.UTC;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23382);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23383);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23384);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23385);return null;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23386);
      __CLR4_4_1hrkhrkle6qe9a4.R.inc(23387);boolean jdk6 = true;
      __CLR4_4_1hrkhrkle6qe9a4.R.inc(23388);try {
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23389);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1hrkhrkle6qe9a4.R.inc(23390);jdk6 = false;
      } 
      __CLR4_4_1hrkhrkle6qe9a4.R.inc(23391);JDK6 = jdk6;
    }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}

    
// Defects4J: flaky method
//     public void testGetShortName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER));
//         assertEquals("GMT", zone.getShortName(TEST_TIME_WINTER));
//         assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    
// Defects4J: flaky method
//     public void testGetShortName_berlin() {
//         DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//         assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.ENGLISH));
//         assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
//         if (JDK6) {
//           assertEquals("MEZ", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("MESZ", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         } else {
//           assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
//           assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
//         }
//     }

    

    

    
// Defects4J: flaky method
//     public void testGetName() {
//         DateTimeZone zone = DateTimeZone.forID("Europe/London");
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER));
//         assertEquals("Greenwich Mean Time", zone.getName(TEST_TIME_WINTER));
//         assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//     }

    
// Defects4J: flaky method
//     public void testGetName_berlin() {
//       DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
//       assertEquals("Central European Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
//       assertEquals("Central European Summer Time", berlin.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
//       if (JDK6) {
//         assertEquals("Mitteleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       } else {
//         assertEquals("Zentraleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
//         assertEquals("Zentraleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
//       }
//   }

    

    

    static class MockDateTimeZone extends DateTimeZone {
        public MockDateTimeZone(String id) {
            super(id);__CLR4_4_1hrkhrkle6qe9a4.R.inc(23393);try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23392);
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23394);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23395);return null;  // null
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23396);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23397);return 0;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23398);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23399);return 0;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23400);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23401);return false;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23402);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23403);return 0;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23404);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23405);return 0;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1hrkhrkle6qe9a4.R.inc(23406);
            __CLR4_4_1hrkhrkle6qe9a4.R.inc(23407);return false;
        }finally{__CLR4_4_1hrkhrkle6qe9a4.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_Berlin() {
//        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 3, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 4, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }
//
//    //-----------------------------------------------------------------------
//    public void testIsLocalDateTimeOverlap_NewYork() {
//        DateTimeZone zone = DateTimeZone.forID("America/New_York");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 2, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 3, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}

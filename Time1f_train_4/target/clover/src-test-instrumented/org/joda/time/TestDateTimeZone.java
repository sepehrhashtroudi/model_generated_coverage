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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1hvihvile6rjc6s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676531447425L,8589935092L,23536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23166);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23167);String str = System.getProperty("java.version");
        __CLR4_4_1hvihvile6rjc6s.R.inc(23168);boolean old = true;
        __CLR4_4_1hvihvile6rjc6s.R.inc(23169);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hvihvile6rjc6s.R.iget(23170)!=0|true))||(__CLR4_4_1hvihvile6rjc6s.R.iget(23171)==0&false))) {{
            __CLR4_4_1hvihvile6rjc6s.R.inc(23172);old = false;
        }
        }__CLR4_4_1hvihvile6rjc6s.R.inc(23173);OLD_JDK = old;
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23174);
        // don't call Policy.getPolicy()
        __CLR4_4_1hvihvile6rjc6s.R.inc(23175);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23176);
                __CLR4_4_1hvihvile6rjc6s.R.inc(23177);Permissions p = new Permissions();
                __CLR4_4_1hvihvile6rjc6s.R.inc(23178);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hvihvile6rjc6s.R.inc(23179);return p;
            }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23180);
            }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23181);
                __CLR4_4_1hvihvile6rjc6s.R.inc(23182);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hvihvile6rjc6s.R.iget(23183)!=0|true))||(__CLR4_4_1hvihvile6rjc6s.R.iget(23184)==0&false))) {{
                    __CLR4_4_1hvihvile6rjc6s.R.inc(23185);return false;
                }
                }__CLR4_4_1hvihvile6rjc6s.R.inc(23186);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        };
        __CLR4_4_1hvihvile6rjc6s.R.inc(23187);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23188);
                __CLR4_4_1hvihvile6rjc6s.R.inc(23189);Permissions p = new Permissions();
                __CLR4_4_1hvihvile6rjc6s.R.inc(23190);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hvihvile6rjc6s.R.inc(23191);return p;
            }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23192);
            }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23193);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23194);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23195);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23196);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1hvihvile6rjc6s.R.inc(23198);try{__CLR4_4_1hvihvile6rjc6s.R.inc(23197);
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23199);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23200);locale = Locale.getDefault();
        __CLR4_4_1hvihvile6rjc6s.R.inc(23201);zone = DateTimeZone.getDefault();
        __CLR4_4_1hvihvile6rjc6s.R.inc(23202);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23203);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23204);Locale.setDefault(locale);
        __CLR4_4_1hvihvile6rjc6s.R.inc(23205);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForID_String_old261() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gugc2hwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old261",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gugc2hwm(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23206); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23207);Map<String, String> map = new LinkedHashMap<String, String>(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23208);map.put("GMT", "UTC"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23209);map.put("WET", "WET"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23210);map.put("CET", "CET"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23211);map.put("MET", "CET"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23212);map.put("ECT", "CET"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23213);map.put("EET", "EET"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23214);map.put("MIT", "Pacific/Apia"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23215);map.put("HST", "Pacific/Honolulu"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23216);map.put("AST", "America/Anchorage"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23217);map.put("PST", "America/Los_Angeles"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23218);map.put("MST", "America/Denver"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23219);map.put("PNT", "America/Phoenix"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23220);map.put("CST", "America/Chicago"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23221);map.put("EST", "America/New_York"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23222);map.put("IET", "America/Indiana/Indianapolis"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23223);map.put("PRT", "America/Puerto_Rico"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23224);map.put("CNT", "America/St_Johns"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23225);map.put("AGT", "America/Argentina/Buenos_Aires"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23226);map.put("BET", "America/Sao_Paulo"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23227);map.put("ART", "Africa/Cairo"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23228);map.put("CAT", "Africa/Harare"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23229);map.put("EAT", "Africa/Addis_Ababa"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23230);map.put("NET", "Asia/Yerevan"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23231);map.put("PLT", "Asia/Karachi"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23232);map.put("IST", "Asia/Kolkata"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23233);map.put("BST", "Asia/Dhaka"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23234);map.put("VST", "Asia/Ho_Chi_Minh"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23235);map.put("CTT", "Asia/Shanghai"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23236);map.put("JST", "Asia/Tokyo"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23237);map.put("ACT", "Australia/Darwin"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23238);map.put("AET", "Australia/Sydney"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23239);map.put("SST", "Pacific/Guadalcanal"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23240);map.put("NST", "Pacific/Auckland"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23241);for (String key : map.keySet()) {{ 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23242);String value = map.get(key); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23243);TimeZone juZone = TimeZone.getTimeZone(key); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23244);DateTimeZone zone = DateTimeZone.forTimeZone(juZone); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23245);assertEquals(value, zone.getID()); 
     } 
 }}finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testPatchedNameKeysLondon268() throws Exception {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kqcb3hxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon268",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kqcb3hxq() throws Exception{try{__CLR4_4_1hvihvile6rjc6s.R.inc(23246); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23247);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23248);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23249);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23250);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23251);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testEqualsHashCode277() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9xrvxhxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode277",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9xrvxhxw(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23252); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23253);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23254);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23255);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23256);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23257);assertEquals(true, zone2.equals(zone1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23258);assertEquals(true, zone2.equals(zone2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23259);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23260);DateTimeZone zone3 = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23261);assertEquals(true, zone3.equals(zone3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23262);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23263);assertEquals(false, zone2.equals(zone3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23264);assertEquals(false, zone3.equals(zone1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23265);assertEquals(false, zone3.equals(zone2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23266);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23267);assertEquals(true, zone3.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23268);DateTimeZone zone4 = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23269);assertEquals(true, zone4.equals(zone4)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23270);assertEquals(false, zone1.equals(zone4)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23271);assertEquals(false, zone2.equals(zone4)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23272);assertEquals(false, zone3.equals(zone4)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23273);assertEquals(false, zone4.equals(zone1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23274);assertEquals(false, zone4.equals(zone2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23275);assertEquals(false, zone4.equals(zone3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23276);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23277);assertEquals(true, zone4.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23278);DateTimeZone zone5 = DateTimeZone.forID("+02:00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23279);assertEquals(true, zone5.equals(zone5)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23280);assertEquals(false, zone1.equals(zone5)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23281);assertEquals(false, zone2.equals(zone5)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23282);assertEquals(false, zone3.equals(zone5)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23283);assertEquals(false, zone4.equals(zone5)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23284);assertEquals(false, zone5.equals(zone1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23285);assertEquals(false, zone5.equals(zone2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23286);assertEquals(false, zone5.equals(zone3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23287);assertEquals(false, zone5.equals(zone4)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23288);assertEquals(false, zone1.hashCode() == zone5.hashCode()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23289);assertEquals(true, zone5.hashCode() == zone5.hashCode()); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testProvider_badClassName640() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzyjjzhyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName640",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzyjjzhyy(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23290); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23291);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23292);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23293);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23294);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23295);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23296);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testSerialization2642() throws Exception {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tmk9hz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2642",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tmk9hz5() throws Exception{try{__CLR4_4_1hvihvile6rjc6s.R.inc(23297); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23298);DateTimeZone zone = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23299);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23300);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23301);oos.writeObject(zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23302);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23303);oos.close(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23304);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23305);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23306);DateTimeZone result = (DateTimeZone) ois.readObject(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23307);ois.close(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23308);assertSame(zone, result); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testIsLocalDateTimeGap_Berlin643() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdej7dhzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin643",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdej7dhzh(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23309); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23310);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23311);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23312);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23313);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23314);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23315);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23316);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23317);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23318);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23319);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23320);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23321);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testDefault823() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4an69hzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault823",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4an69hzu(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23322); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23323);assertNotNull(DateTimeZone.getDefault()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23324);DateTimeZone.setDefault(PARIS); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23325);assertSame(PARIS, DateTimeZone.getDefault()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23326);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23327);DateTimeZone.setDefault(null); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23328);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testForOffsetHours_int824() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysbwr8i01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int824",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysbwr8i01(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23329); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23330);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23331);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23332);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23333);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23334);DateTimeZone.forOffsetHours(999999); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23335);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testForID_String825() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4rr8i08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String825",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4rr8i08(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23336); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23337);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23338);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23339);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23340);zone = DateTimeZone.forID("UTC"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23341);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23342);zone = DateTimeZone.forID("+00:00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23343);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23344);zone = DateTimeZone.forID("+00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23345);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23346);zone = DateTimeZone.forID("+01:23"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23347);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23348);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23349);zone = DateTimeZone.forID("-02:00"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23350);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23351);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23352);zone = DateTimeZone.forID("-07:05:34.0"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23353);assertEquals("-07:05:34", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23354);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23355);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23356);DateTimeZone.forID("SST"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23357);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23358);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23359);DateTimeZone.forID("europe/london"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23360);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23361);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23362);DateTimeZone.forID("Europe/UK"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23363);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23364);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23365);DateTimeZone.forID("+"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23366);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23367);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23368);DateTimeZone.forID("+0"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23369);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testForOffsetHoursMinutes_int_int826() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igbnmfi16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int826",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igbnmfi16(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23370); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23371);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23372);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23373);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23374);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23375);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23376);DateTimeZone.forOffsetHoursMinutes(2, -15); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23377);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23378);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23379);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23380);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23381);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23382);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23383);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23384);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23385);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23386);DateTimeZone.forOffsetHoursMinutes(2, 60); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23387);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23388);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23389);DateTimeZone.forOffsetHoursMinutes(-2, 60); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23390);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23391);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23392);DateTimeZone.forOffsetHoursMinutes(24, 0); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23393);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23394);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23395);DateTimeZone.forOffsetHoursMinutes(-24, 0); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23396);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testForTimeZone_TimeZone827() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2e10ci1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone827",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2e10ci1x(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23397); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23398);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23399);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23400);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23401);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23402);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23403);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23404);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23405);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23406);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23407);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23408);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23409);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23410);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23411);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23412);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23413);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23414);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23415);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23416);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23417);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23418);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23419);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23420);assertEquals("+02:00", zone.getID()); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23421);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23422);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23423);assertEquals("America/New_York", zone.getID()); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testForOffsetMillis_int828() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8anvfi2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8anvfi2o(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23424); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23425);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23426);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23427);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23428);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23429);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23430);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testGetAvailableIDs829() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xy9hvi2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs829",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xy9hvi2v(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23431); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23432);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testNameProvider_badClassName830() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173jrv1i2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName830",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173jrv1i2x(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23433); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23434);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23435);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23436);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23437);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23438);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23439);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testConstructor831() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167j9iji34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor831",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167j9iji34(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23440); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23441);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23442);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23443);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23444);new DateTimeZone(null) { 
  
             public String getNameKey(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23445); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23446);return null; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public int getOffset(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23447); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23448);return 0; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public int getStandardOffset(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23449); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23450);return 0; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public boolean isFixed() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23451); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23452);return false; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public long nextTransition(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23453); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23454);return 0; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public long previousTransition(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23455); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23456);return 0; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
  
             public boolean equals(Object object) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23457); 
                 __CLR4_4_1hvihvile6rjc6s.R.inc(23458);return false; 
             }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 
         }; 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testGetOffset_RI832() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5uqlbi3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI832",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5uqlbi3n(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23459); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23460);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23461);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23462);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23463);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testGetMillisKeepLocal833() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1krlgt9i3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal833",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1krlgt9i3s(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23464); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23465);long millisLondon = TEST_TIME_SUMMER; 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23466);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR; 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23467);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23468);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23469);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23470);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23471);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23472);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23473);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23474);try { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23475);DateTimeZone.setDefault(LONDON); 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23476);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis)); 
     } finally { 
         __CLR4_4_1hvihvile6rjc6s.R.inc(23477);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 


public void testToTimeZone835() {__CLR4_4_1hvihvile6rjc6s.R.globalSliceStart(getClass().getName(),23478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vi7c5hi46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hvihvile6rjc6s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hvihvile6rjc6s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone835",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vi7c5hi46(){try{__CLR4_4_1hvihvile6rjc6s.R.inc(23478); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23479);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23480);TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1hvihvile6rjc6s.R.inc(23481);assertEquals("Europe/Paris", tz.getID()); 
 }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}} 

    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23482);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23483);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23484);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23485);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23486);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23487);return new HashSet();
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23488);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23489);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23490);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23491);Set set = new HashSet();
            __CLR4_4_1hvihvile6rjc6s.R.inc(23492);set.add("Europe/London");
            __CLR4_4_1hvihvile6rjc6s.R.inc(23493);return set;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23494);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23495);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23496);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23497);Set set = new HashSet();
            __CLR4_4_1hvihvile6rjc6s.R.inc(23498);set.add("UTC");
            __CLR4_4_1hvihvile6rjc6s.R.inc(23499);set.add("Europe/London");
            __CLR4_4_1hvihvile6rjc6s.R.inc(23500);return set;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23501);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23502);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23503);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23504);Set set = new HashSet();
            __CLR4_4_1hvihvile6rjc6s.R.inc(23505);set.add("UTC");
            __CLR4_4_1hvihvile6rjc6s.R.inc(23506);set.add("Europe/London");
            __CLR4_4_1hvihvile6rjc6s.R.inc(23507);return set;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23508);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23509);return DateTimeZone.UTC;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23510);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23511);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23512);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23513);return null;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23514);
      __CLR4_4_1hvihvile6rjc6s.R.inc(23515);boolean jdk6 = true;
      __CLR4_4_1hvihvile6rjc6s.R.inc(23516);try {
        __CLR4_4_1hvihvile6rjc6s.R.inc(23517);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1hvihvile6rjc6s.R.inc(23518);jdk6 = false;
      } 
      __CLR4_4_1hvihvile6rjc6s.R.inc(23519);JDK6 = jdk6;
    }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1hvihvile6rjc6s.R.inc(23521);try{__CLR4_4_1hvihvile6rjc6s.R.inc(23520);
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23522);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23523);return null;  // null
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23524);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23525);return 0;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23526);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23527);return 0;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23528);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23529);return false;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23530);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23531);return 0;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23532);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23533);return 0;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1hvihvile6rjc6s.R.inc(23534);
            __CLR4_4_1hvihvile6rjc6s.R.inc(23535);return false;
        }finally{__CLR4_4_1hvihvile6rjc6s.R.flushNeeded();}}
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

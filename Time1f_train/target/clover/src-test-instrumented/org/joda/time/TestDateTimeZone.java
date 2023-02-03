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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1hythytlc8axdpe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672270916832L,8589935092L,23721,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1hythytlc8axdpe.R.inc(23285);
        __CLR4_4_1hythytlc8axdpe.R.inc(23286);String str = System.getProperty("java.version");
        __CLR4_4_1hythytlc8axdpe.R.inc(23287);boolean old = true;
        __CLR4_4_1hythytlc8axdpe.R.inc(23288);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1hythytlc8axdpe.R.iget(23289)!=0|true))||(__CLR4_4_1hythytlc8axdpe.R.iget(23290)==0&false))) {{
            __CLR4_4_1hythytlc8axdpe.R.inc(23291);old = false;
        }
        }__CLR4_4_1hythytlc8axdpe.R.inc(23292);OLD_JDK = old;
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1hythytlc8axdpe.R.inc(23293);
        // don't call Policy.getPolicy()
        __CLR4_4_1hythytlc8axdpe.R.inc(23294);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23295);
                __CLR4_4_1hythytlc8axdpe.R.inc(23296);Permissions p = new Permissions();
                __CLR4_4_1hythytlc8axdpe.R.inc(23297);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hythytlc8axdpe.R.inc(23298);return p;
            }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23299);
            }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23300);
                __CLR4_4_1hythytlc8axdpe.R.inc(23301);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1hythytlc8axdpe.R.iget(23302)!=0|true))||(__CLR4_4_1hythytlc8axdpe.R.iget(23303)==0&false))) {{
                    __CLR4_4_1hythytlc8axdpe.R.inc(23304);return false;
                }
                }__CLR4_4_1hythytlc8axdpe.R.inc(23305);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        };
        __CLR4_4_1hythytlc8axdpe.R.inc(23306);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23307);
                __CLR4_4_1hythytlc8axdpe.R.inc(23308);Permissions p = new Permissions();
                __CLR4_4_1hythytlc8axdpe.R.inc(23309);p.add(new AllPermission());  // enable everything
                __CLR4_4_1hythytlc8axdpe.R.inc(23310);return p;
            }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23311);
            }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23312);
        __CLR4_4_1hythytlc8axdpe.R.inc(23313);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23314);
        __CLR4_4_1hythytlc8axdpe.R.inc(23315);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1hythytlc8axdpe.R.inc(23317);try{__CLR4_4_1hythytlc8axdpe.R.inc(23316);
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hythytlc8axdpe.R.inc(23318);
        __CLR4_4_1hythytlc8axdpe.R.inc(23319);locale = Locale.getDefault();
        __CLR4_4_1hythytlc8axdpe.R.inc(23320);zone = DateTimeZone.getDefault();
        __CLR4_4_1hythytlc8axdpe.R.inc(23321);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hythytlc8axdpe.R.inc(23322);
        __CLR4_4_1hythytlc8axdpe.R.inc(23323);Locale.setDefault(locale);
        __CLR4_4_1hythytlc8axdpe.R.inc(23324);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testForID_String_old11() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17p8225hzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17p8225hzx(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23325); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23326);Map<String, String> map = new LinkedHashMap<String, String>(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23327);map.put("GMT", "UTC"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23328);map.put("WET", "WET"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23329);map.put("CET", "CET"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23330);map.put("MET", "CET"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23331);map.put("ECT", "CET"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23332);map.put("EET", "EET"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23333);map.put("MIT", "Pacific/Apia"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23334);map.put("HST", "Pacific/Honolulu"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23335);map.put("AST", "America/Anchorage"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23336);map.put("PST", "America/Los_Angeles"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23337);map.put("MST", "America/Denver"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23338);map.put("PNT", "America/Phoenix"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23339);map.put("CST", "America/Chicago"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23340);map.put("EST", "America/New_York"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23341);map.put("IET", "America/Indiana/Indianapolis"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23342);map.put("PRT", "America/Puerto_Rico"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23343);map.put("CNT", "America/St_Johns"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23344);map.put("AGT", "America/Argentina/Buenos_Aires"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23345);map.put("BET", "America/Sao_Paulo"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23346);map.put("ART", "Africa/Cairo"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23347);map.put("CAT", "Africa/Harare"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23348);map.put("EAT", "Africa/Addis_Ababa"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23349);map.put("NET", "Asia/Yerevan"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23350);map.put("PLT", "Asia/Karachi"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23351);map.put("IST", "Asia/Kolkata"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23352);map.put("BST", "Asia/Dhaka"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23353);map.put("VST", "Asia/Ho_Chi_Minh"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23354);map.put("CTT", "Asia/Shanghai"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23355);map.put("JST", "Asia/Tokyo"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23356);map.put("ACT", "Australia/Darwin"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23357);map.put("AET", "Australia/Sydney"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23358);map.put("SST", "Pacific/Guadalcanal"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23359);map.put("NST", "Pacific/Auckland"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23360);for (String key : map.keySet()) {{ 
         __CLR4_4_1hythytlc8axdpe.R.inc(23361);String value = map.get(key); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23362);TimeZone juZone = TimeZone.getTimeZone(key); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23363);DateTimeZone zone = DateTimeZone.forTimeZone(juZone); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23364);assertEquals(value, zone.getID()); 
     } 
 }}finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testEqualsHashCode97() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j8shu9i11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode97",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j8shu9i11(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23365); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23366);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23367);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23368);assertEquals(true, zone1.equals(zone1)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23369);assertEquals(true, zone1.equals(zone2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23370);assertEquals(true, zone2.equals(zone1)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23371);assertEquals(true, zone2.equals(zone2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23372);assertEquals(true, zone1.hashCode() == zone2.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23373);DateTimeZone zone3 = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23374);assertEquals(true, zone3.equals(zone3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23375);assertEquals(false, zone1.equals(zone3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23376);assertEquals(false, zone2.equals(zone3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23377);assertEquals(false, zone3.equals(zone1)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23378);assertEquals(false, zone3.equals(zone2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23379);assertEquals(false, zone1.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23380);assertEquals(true, zone3.hashCode() == zone3.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23381);DateTimeZone zone4 = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23382);assertEquals(true, zone4.equals(zone4)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23383);assertEquals(false, zone1.equals(zone4)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23384);assertEquals(false, zone2.equals(zone4)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23385);assertEquals(false, zone3.equals(zone4)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23386);assertEquals(false, zone4.equals(zone1)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23387);assertEquals(false, zone4.equals(zone2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23388);assertEquals(false, zone4.equals(zone3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23389);assertEquals(false, zone1.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23390);assertEquals(true, zone4.hashCode() == zone4.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23391);DateTimeZone zone5 = DateTimeZone.forID("+02:00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23392);assertEquals(true, zone5.equals(zone5)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23393);assertEquals(false, zone1.equals(zone5)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23394);assertEquals(false, zone2.equals(zone5)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23395);assertEquals(false, zone3.equals(zone5)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23396);assertEquals(false, zone4.equals(zone5)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23397);assertEquals(false, zone5.equals(zone1)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23398);assertEquals(false, zone5.equals(zone2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23399);assertEquals(false, zone5.equals(zone3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23400);assertEquals(false, zone5.equals(zone4)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23401);assertEquals(false, zone1.hashCode() == zone5.hashCode()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23402);assertEquals(true, zone5.hashCode() == zone5.hashCode()); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testPatchedNameKeysLondon111() throws Exception {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkh54ki23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkh54ki23() throws Exception{try{__CLR4_4_1hythytlc8axdpe.R.inc(23403); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23404);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23405);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23406);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23407);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23408);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testIsLocalDateTimeGap_Berlin159() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qipmefi29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin159",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qipmefi29(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23409); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23410);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23411);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23412);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23413);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23414);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23415);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23416);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23417);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23418);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23419);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23420);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23421);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testNameProvider186() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8ovlki2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider186",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8ovlki2m(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23422); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23423);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23424);assertNotNull(DateTimeZone.getNameProvider()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23425);NameProvider provider = DateTimeZone.getNameProvider(); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23426);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23427);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23428);provider = new MockOKButNullNameProvider(); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23429);DateTimeZone.setNameProvider(provider); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23430);assertSame(provider, DateTimeZone.getNameProvider()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23431);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23432);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23433);DateTimeZone.setNameProvider(null); 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23434);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23435);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23436);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23437);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23438);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23439);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23440);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testForOffsetHours_int229() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q7xmdi35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int229",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q7xmdi35(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23441); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23442);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23443);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23444);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23445);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23446);DateTimeZone.forOffsetHours(999999); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23447);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testForTimeZone_TimeZone238() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18t8zjqi3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone238",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18t8zjqi3c(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23448); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23449);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23450);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23451);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23452);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23453);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23454);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23455);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23456);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23457);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23458);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23459);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23460);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23461);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23462);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23463);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23464);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23465);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23466);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23467);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23468);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23469);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23470);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23471);assertEquals("+02:00", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23472);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23473);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23474);assertEquals("America/New_York", zone.getID()); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testNameProvider_badClassName252() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1et9lqfi43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName252",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1et9lqfi43(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23475); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23476);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23477);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23478);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23479);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23480);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23481);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetNameNullKey284() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvabh0i4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey284",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvabh0i4a(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23482); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23483);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23484);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testForID_String289() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gu21fgi4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String289",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gu21fgi4d(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23485); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23486);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23487);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23488);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23489);zone = DateTimeZone.forID("UTC"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23490);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23491);zone = DateTimeZone.forID("+00:00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23492);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23493);zone = DateTimeZone.forID("+00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23494);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23495);zone = DateTimeZone.forID("+01:23"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23496);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23497);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23498);zone = DateTimeZone.forID("-02:00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23499);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23500);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23501);zone = DateTimeZone.forID("-07:05:34.0"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23502);assertEquals("-07:05:34", zone.getID()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23503);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23504);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23505);DateTimeZone.forID("SST"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23506);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23507);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23508);DateTimeZone.forID("europe/london"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23509);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23510);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23511);DateTimeZone.forID("Europe/UK"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23512);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23513);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23514);DateTimeZone.forID("+"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23515);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23516);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23517);DateTimeZone.forID("+0"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23518);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testToTimeZone317() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qjpd2i5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone317",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qjpd2i5b(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23519); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23520);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23521);TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23522);assertEquals("Europe/Paris", tz.getID()); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testProvider_badClassName359() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ic95twi5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName359",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ic95twi5f(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23523); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23524);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23525);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23526);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23527);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23528);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23529);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testProvider399() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9j7tji5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider399",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9j7tji5m(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23530); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23531);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23532);assertNotNull(DateTimeZone.getProvider()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23533);Provider provider = DateTimeZone.getProvider(); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23534);DateTimeZone.setProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23535);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23536);try { 
             __CLR4_4_1hythytlc8axdpe.R.inc(23537);DateTimeZone.setProvider(new MockNullIDSProvider()); 
             __CLR4_4_1hythytlc8axdpe.R.inc(23538);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hythytlc8axdpe.R.inc(23539);try { 
             __CLR4_4_1hythytlc8axdpe.R.inc(23540);DateTimeZone.setProvider(new MockEmptyIDSProvider()); 
             __CLR4_4_1hythytlc8axdpe.R.inc(23541);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hythytlc8axdpe.R.inc(23542);try { 
             __CLR4_4_1hythytlc8axdpe.R.inc(23543);DateTimeZone.setProvider(new MockNoUTCProvider()); 
             __CLR4_4_1hythytlc8axdpe.R.inc(23544);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hythytlc8axdpe.R.inc(23545);try { 
             __CLR4_4_1hythytlc8axdpe.R.inc(23546);DateTimeZone.setProvider(new MockBadUTCProvider()); 
             __CLR4_4_1hythytlc8axdpe.R.inc(23547);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1hythytlc8axdpe.R.inc(23548);Provider prov = new MockOKProvider(); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23549);DateTimeZone.setProvider(prov); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23550);assertSame(prov, DateTimeZone.getProvider()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23551);assertEquals(2, DateTimeZone.getAvailableIDs().size()); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23552);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23553);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London")); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23554);DateTimeZone.setProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23555);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23556);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23557);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23558);DateTimeZone.setProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23559);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23560);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23561);DateTimeZone.setProvider(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23562);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testDefault479() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kccfuai6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault479",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kccfuai6j(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23563); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23564);assertNotNull(DateTimeZone.getDefault()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23565);DateTimeZone.setDefault(PARIS); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23566);assertSame(PARIS, DateTimeZone.getDefault()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23567);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23568);DateTimeZone.setDefault(null); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23569);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetShortNameNullKey540() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxsvabi6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey540",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxsvabi6q(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23570); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23571);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23572);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testIsFixed555() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s51ksi6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed555",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s51ksi6t(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23573); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23574);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23575);assertEquals(false, zone.isFixed()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23576);assertEquals(true, DateTimeZone.UTC.isFixed()); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetShortNameProviderName588() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmpccji6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName588",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmpccji6x(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23577); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23578);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23579);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23580);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23581);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testConstructor851() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsxieli72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor851",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsxieli72(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23582); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23583);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23584);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23585);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23586);new DateTimeZone(null) { 
  
             public String getNameKey(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23587); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23588);return null; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public int getOffset(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23589); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23590);return 0; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public int getStandardOffset(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23591); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23592);return 0; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public boolean isFixed() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23593); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23594);return false; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public long nextTransition(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23595); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23596);return 0; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public long previousTransition(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23597); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23598);return 0; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
  
             public boolean equals(Object object) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23599); 
                 __CLR4_4_1hythytlc8axdpe.R.inc(23600);return false; 
             }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 
         }; 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetMillisKeepLocal1006() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ma0ugi7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal1006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ma0ugi7l(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23601); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23602);long millisLondon = TEST_TIME_SUMMER; 
     __CLR4_4_1hythytlc8axdpe.R.inc(23603);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR; 
     __CLR4_4_1hythytlc8axdpe.R.inc(23604);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23605);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23606);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23607);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23608);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23609);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23610);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23611);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23612);DateTimeZone.setDefault(LONDON); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23613);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis)); 
     } finally { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23614);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testPatchedNameKeysSydneyHistoric1059() throws Exception {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xek5di7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric1059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xek5di7z() throws Exception{try{__CLR4_4_1hythytlc8axdpe.R.inc(23615); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23616);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23617);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23618);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23619);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23620);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testSerialization21104() throws Exception {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0n7s1i85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization21104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0n7s1i85() throws Exception{try{__CLR4_4_1hythytlc8axdpe.R.inc(23621); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23622);DateTimeZone zone = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23623);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23624);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23625);oos.writeObject(zone); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23626);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23627);oos.close(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23628);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23629);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23630);DateTimeZone result = (DateTimeZone) ois.readObject(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23631);ois.close(); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23632);assertSame(zone, result); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetAvailableIDs1136() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvv1b1i8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs1136",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvv1b1i8h(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23633); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23634);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testGetOffset_RI1273() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aep17ni8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI1273",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aep17ni8j(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23635); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23636);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23637);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23638);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23639);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 


public void testForOffsetHoursMinutes_int_int1628() {__CLR4_4_1hythytlc8axdpe.R.globalSliceStart(getClass().getName(),23640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vv7p90i8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hythytlc8axdpe.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hythytlc8axdpe.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int1628",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vv7p90i8o(){try{__CLR4_4_1hythytlc8axdpe.R.inc(23640); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23641);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23642);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23643);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23644);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23645);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23646);DateTimeZone.forOffsetHoursMinutes(2, -15); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23647);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23648);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23649);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23650);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23651);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23652);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23653);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23654);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59)); 
     __CLR4_4_1hythytlc8axdpe.R.inc(23655);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23656);DateTimeZone.forOffsetHoursMinutes(2, 60); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23657);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23658);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23659);DateTimeZone.forOffsetHoursMinutes(-2, 60); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23660);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23661);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23662);DateTimeZone.forOffsetHoursMinutes(24, 0); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23663);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1hythytlc8axdpe.R.inc(23664);try { 
         __CLR4_4_1hythytlc8axdpe.R.inc(23665);DateTimeZone.forOffsetHoursMinutes(-24, 0); 
         __CLR4_4_1hythytlc8axdpe.R.inc(23666);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}} 

    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23667);
            __CLR4_4_1hythytlc8axdpe.R.inc(23668);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23669);
            __CLR4_4_1hythytlc8axdpe.R.inc(23670);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23671);
            __CLR4_4_1hythytlc8axdpe.R.inc(23672);return new HashSet();
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23673);
            __CLR4_4_1hythytlc8axdpe.R.inc(23674);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23675);
            __CLR4_4_1hythytlc8axdpe.R.inc(23676);Set set = new HashSet();
            __CLR4_4_1hythytlc8axdpe.R.inc(23677);set.add("Europe/London");
            __CLR4_4_1hythytlc8axdpe.R.inc(23678);return set;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23679);
            __CLR4_4_1hythytlc8axdpe.R.inc(23680);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23681);
            __CLR4_4_1hythytlc8axdpe.R.inc(23682);Set set = new HashSet();
            __CLR4_4_1hythytlc8axdpe.R.inc(23683);set.add("UTC");
            __CLR4_4_1hythytlc8axdpe.R.inc(23684);set.add("Europe/London");
            __CLR4_4_1hythytlc8axdpe.R.inc(23685);return set;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23686);
            __CLR4_4_1hythytlc8axdpe.R.inc(23687);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23688);
            __CLR4_4_1hythytlc8axdpe.R.inc(23689);Set set = new HashSet();
            __CLR4_4_1hythytlc8axdpe.R.inc(23690);set.add("UTC");
            __CLR4_4_1hythytlc8axdpe.R.inc(23691);set.add("Europe/London");
            __CLR4_4_1hythytlc8axdpe.R.inc(23692);return set;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23693);
            __CLR4_4_1hythytlc8axdpe.R.inc(23694);return DateTimeZone.UTC;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23695);
            __CLR4_4_1hythytlc8axdpe.R.inc(23696);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23697);
            __CLR4_4_1hythytlc8axdpe.R.inc(23698);return null;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1hythytlc8axdpe.R.inc(23699);
      __CLR4_4_1hythytlc8axdpe.R.inc(23700);boolean jdk6 = true;
      __CLR4_4_1hythytlc8axdpe.R.inc(23701);try {
        __CLR4_4_1hythytlc8axdpe.R.inc(23702);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1hythytlc8axdpe.R.inc(23703);jdk6 = false;
      } 
      __CLR4_4_1hythytlc8axdpe.R.inc(23704);JDK6 = jdk6;
    }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1hythytlc8axdpe.R.inc(23706);try{__CLR4_4_1hythytlc8axdpe.R.inc(23705);
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23707);
            __CLR4_4_1hythytlc8axdpe.R.inc(23708);return null;  // null
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23709);
            __CLR4_4_1hythytlc8axdpe.R.inc(23710);return 0;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23711);
            __CLR4_4_1hythytlc8axdpe.R.inc(23712);return 0;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1hythytlc8axdpe.R.inc(23713);
            __CLR4_4_1hythytlc8axdpe.R.inc(23714);return false;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23715);
            __CLR4_4_1hythytlc8axdpe.R.inc(23716);return 0;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23717);
            __CLR4_4_1hythytlc8axdpe.R.inc(23718);return 0;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1hythytlc8axdpe.R.inc(23719);
            __CLR4_4_1hythytlc8axdpe.R.inc(23720);return false;
        }finally{__CLR4_4_1hythytlc8axdpe.R.flushNeeded();}}
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

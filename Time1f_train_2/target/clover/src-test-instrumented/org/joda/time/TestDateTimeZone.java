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
public class TestDateTimeZone extends TestCase {static class __CLR4_4_1ht5ht5le6qseq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,23385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean OLD_JDK;
    static {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23081);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23082);String str = System.getProperty("java.version");
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23083);boolean old = true;
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23084);if ((((str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1ht5ht5le6qseq3.R.iget(23085)!=0|true))||(__CLR4_4_1ht5ht5le6qseq3.R.iget(23086)==0&false))) {{
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23087);old = false;
        }
        }__CLR4_4_1ht5ht5le6qseq3.R.inc(23088);OLD_JDK = old;
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    
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
    static {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23089);
        // don't call Policy.getPolicy()
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23090);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23091);
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23092);Permissions p = new Permissions();
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23093);p.add(new AllPermission());  // enable everything
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23094);return p;
            }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23095);
            }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23096);
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23097);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1ht5ht5le6qseq3.R.iget(23098)!=0|true))||(__CLR4_4_1ht5ht5le6qseq3.R.iget(23099)==0&false))) {{
                    __CLR4_4_1ht5ht5le6qseq3.R.inc(23100);return false;
                }
                }__CLR4_4_1ht5ht5le6qseq3.R.inc(23101);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        };
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23102);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23103);
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23104);Permissions p = new Permissions();
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23105);p.add(new AllPermission());  // enable everything
                __CLR4_4_1ht5ht5le6qseq3.R.inc(23106);return p;
            }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
            public void refresh() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23107);
            }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    
    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23108);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23109);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23110);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23111);return new TestSuite(TestDateTimeZone.class);
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    public TestDateTimeZone(String name) {
        super(name);__CLR4_4_1ht5ht5le6qseq3.R.inc(23113);try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23112);
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23114);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23115);locale = Locale.getDefault();
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23116);zone = DateTimeZone.getDefault();
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23117);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23118);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23119);Locale.setDefault(locale);
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23120);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

public void testPatchedNameKeysLondon240() throws Exception {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tv54nhu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon240",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tv54nhu9() throws Exception{try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23121); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23122);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23123);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23124);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23125);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23126);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testIsFixed243() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wlft40huf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed243",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wlft40huf(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23127); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23128);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23129);assertEquals(false, zone.isFixed()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23130);assertEquals(true, DateTimeZone.UTC.isFixed()); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testProvider_badClassName613() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmhs9xhuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName613",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmhs9xhuj(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23131); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23132);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23133);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23134);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23135);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23136);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23137);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testSerialization2615() throws Exception {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jadubhuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2615",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jadubhuq() throws Exception{try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23138); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23139);DateTimeZone zone = DateTimeZone.forID("+01:00"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23140);ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23141);ObjectOutputStream oos = new ObjectOutputStream(baos); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23142);oos.writeObject(zone); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23143);byte[] bytes = baos.toByteArray(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23144);oos.close(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23145);ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23146);ObjectInputStream ois = new ObjectInputStream(bais); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23147);DateTimeZone result = (DateTimeZone) ois.readObject(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23148);ois.close(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23149);assertSame(zone, result); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testForOffsetHoursMinutes_int_int791() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xebf4shv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int791",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xebf4shv2(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23150); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23151);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23152);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23153);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23154);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23155);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23156);DateTimeZone.forOffsetHoursMinutes(2, -15); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23157);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23158);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23159);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23160);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23161);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23162);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23163);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23164);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23165);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23166);DateTimeZone.forOffsetHoursMinutes(2, 60); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23167);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23168);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23169);DateTimeZone.forOffsetHoursMinutes(-2, 60); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23170);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23171);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23172);DateTimeZone.forOffsetHoursMinutes(24, 0); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23173);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23174);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23175);DateTimeZone.forOffsetHoursMinutes(-24, 0); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23176);fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testForTimeZone_TimeZone792() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evx1sfhvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone792",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evx1sfhvt(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23177); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23178);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23179);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23180);assertEquals("Europe/London", zone.getID()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23181);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23182);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23183);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23184);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23185);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23186);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23187);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23188);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23189);assertSame(DateTimeZone.UTC, zone); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23190);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23191);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23192);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23193);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23194);assertEquals("+01:23", zone.getID()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23195);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23196);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23197);assertEquals("-02:00", zone.getID()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23198);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23199);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23200);assertEquals("+02:00", zone.getID()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23201);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23202);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23203);assertEquals("America/New_York", zone.getID()); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testForOffsetMillis_int793() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmcevshwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int793",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmcevshwk(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23204); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23205);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23206);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23207);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23208);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23209);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23210);assertEquals(DateTimeZone.forID("+04:45:17.045"), DateTimeZone.forOffsetMillis(4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetAvailableIDs794() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8ipq2hwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs794",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8ipq2hwr(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23211); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23212);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testProvider795() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189vesphwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider795",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189vesphwt(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23213); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23214);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23215);assertNotNull(DateTimeZone.getProvider()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23216);Provider provider = DateTimeZone.getProvider(); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23217);DateTimeZone.setProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23218);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23219);try { 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23220);DateTimeZone.setProvider(new MockNullIDSProvider()); 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23221);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23222);try { 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23223);DateTimeZone.setProvider(new MockEmptyIDSProvider()); 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23224);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23225);try { 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23226);DateTimeZone.setProvider(new MockNoUTCProvider()); 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23227);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23228);try { 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23229);DateTimeZone.setProvider(new MockBadUTCProvider()); 
             __CLR4_4_1ht5ht5le6qseq3.R.inc(23230);fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23231);Provider prov = new MockOKProvider(); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23232);DateTimeZone.setProvider(prov); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23233);assertSame(prov, DateTimeZone.getProvider()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23234);assertEquals(2, DateTimeZone.getAvailableIDs().size()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23235);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC")); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23236);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London")); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23237);DateTimeZone.setProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23238);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23239);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23240);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23241);DateTimeZone.setProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23242);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23243);System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23244);DateTimeZone.setProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23245);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testNameProvider_badClassName796() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161sh78hxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName796",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161sh78hxq(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23246); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23247);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23248);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23249);DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23250);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23251);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23252);DateTimeZone.setProvider(null); 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testNameProvider797() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122y5g2hxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider797",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122y5g2hxx(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23253); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23254);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23255);assertNotNull(DateTimeZone.getNameProvider()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23256);NameProvider provider = DateTimeZone.getNameProvider(); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23257);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23258);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23259);provider = new MockOKButNullNameProvider(); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23260);DateTimeZone.setNameProvider(provider); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23261);assertSame(provider, DateTimeZone.getNameProvider()); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23262);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23263);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23264);DateTimeZone.setNameProvider(null); 
     } 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23265);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23266);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23267);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23268);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23269);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23270);DateTimeZone.setNameProvider(null); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23271);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testConstructor798() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3vjsbhyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor798",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3vjsbhyg(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23272); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23273);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23274);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers())); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23275);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23276);new DateTimeZone(null) { 
  
             public String getNameKey(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23277); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23278);return null; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public int getOffset(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23279); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23280);return 0; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public int getStandardOffset(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23281); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23282);return 0; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public boolean isFixed() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23283); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23284);return false; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public long nextTransition(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23285); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23286);return 0; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public long previousTransition(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23287); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23288);return 0; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
  
             public boolean equals(Object object) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23289); 
                 __CLR4_4_1ht5ht5le6qseq3.R.inc(23290);return false; 
             }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 
         }; 
     } catch (IllegalArgumentException ex) { 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetShortNameNullKey799() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkygjbhyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey799",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkygjbhyz(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23291); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23292);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23293);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetNameNullKey800() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11atc96hz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey800",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11atc96hz2(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23294); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23295);DateTimeZone zone = new MockDateTimeZone("Europe/London"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23296);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetOffset_RI801() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15se45dhz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15se45dhz5(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23297); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23298);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23299);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER))); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23300);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER))); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23301);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetMillisKeepLocal805() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1we26vshza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal805",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1we26vshza(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23302); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23303);long millisLondon = TEST_TIME_SUMMER; 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23304);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR; 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23305);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23306);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23307);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23308);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23309);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23310);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23311);DateTimeZone zone = DateTimeZone.getDefault(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23312);try { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23313);DateTimeZone.setDefault(LONDON); 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23314);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis)); 
     } finally { 
         __CLR4_4_1ht5ht5le6qseq3.R.inc(23315);DateTimeZone.setDefault(zone); 
     } 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testToTimeZone807() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwfzr4hzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwfzr4hzo(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23316); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23317);DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23318);TimeZone tz = zone.toTimeZone(); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23319);assertEquals("Europe/Paris", tz.getID()); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testGetShortNameProviderName1387() {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxq4zdhzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName1387",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxq4zdhzs(){try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23320); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23321);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23322);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST")); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23323);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null)); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23324);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 


public void testPatchedNameKeysSydneyHistoric1388() throws Exception {__CLR4_4_1ht5ht5le6qseq3.R.globalSliceStart(getClass().getName(),23325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1geb6f4hzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ht5ht5le6qseq3.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ht5ht5le6qseq3.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric1388",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1geb6f4hzx() throws Exception{try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23325); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23326);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney"); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23327);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23328);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23329);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1ht5ht5le6qseq3.R.inc(23330);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}} 

    
            
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
            

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    
    
    

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23331);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23332);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23333);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23334);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }
    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23335);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23336);return new HashSet();
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23337);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23338);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }
    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23339);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23340);Set set = new HashSet();
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23341);set.add("Europe/London");
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23342);return set;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23343);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23344);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }
    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23345);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23346);Set set = new HashSet();
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23347);set.add("UTC");
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23348);set.add("Europe/London");
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23349);return set;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23350);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23351);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }
    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23352);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23353);Set set = new HashSet();
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23354);set.add("UTC");
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23355);set.add("Europe/London");
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23356);return set;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public DateTimeZone getZone(String id) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23357);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23358);return DateTimeZone.UTC;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    

    

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23359);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23360);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23361);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23362);return null;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    static final boolean JDK6;
    static {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23363);
      __CLR4_4_1ht5ht5le6qseq3.R.inc(23364);boolean jdk6 = true;
      __CLR4_4_1ht5ht5le6qseq3.R.inc(23365);try {
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23366);DateFormatSymbols.class.getMethod("getInstance", new Class[] {Locale.class});
      } catch (Exception ex) {
        __CLR4_4_1ht5ht5le6qseq3.R.inc(23367);jdk6 = false;
      } 
      __CLR4_4_1ht5ht5le6qseq3.R.inc(23368);JDK6 = jdk6;
    }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}

    
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
            super(id);__CLR4_4_1ht5ht5le6qseq3.R.inc(23370);try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23369);
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public String getNameKey(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23371);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23372);return null;  // null
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public int getOffset(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23373);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23374);return 0;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public int getStandardOffset(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23375);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23376);return 0;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public boolean isFixed() {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23377);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23378);return false;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public long nextTransition(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23379);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23380);return 0;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public long previousTransition(long instant) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23381);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23382);return 0;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
        public boolean equals(Object object) {try{__CLR4_4_1ht5ht5le6qseq3.R.inc(23383);
            __CLR4_4_1ht5ht5le6qseq3.R.inc(23384);return false;
        }finally{__CLR4_4_1ht5ht5le6qseq3.R.flushNeeded();}}
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

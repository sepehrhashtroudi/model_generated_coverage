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
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear;

/**
 * Test cases for ZoneInfoCompiler.
 *
 * @author Brian S O'Neill
 */
public class TestCompiler extends TestCase {static class __CLR4_4_1mfhmfhle6np4xm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0033\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524998868L,8589935092L,29142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29069);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29070);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29071);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29072);return new TestSuite(TestCompiler.class);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    static final String AMERICA_LOS_ANGELES_FILE =
        "# Rules for building just America/Los_Angeles time zone.\n" + 
        "\n" + 
        "Rule    US  1918    1919    -   Mar lastSun 2:00    1:00    D\n" + 
        "Rule    US  1918    1919    -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1942    only    -   Feb 9   2:00    1:00    W # War\n" + 
        "Rule    US  1945    only    -   Aug 14  23:00u  1:00    P # Peace\n" + 
        "Rule    US  1945    only    -   Sep 30  2:00    0   S\n" + 
        "Rule    US  1967    max -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1967    1973    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1974    only    -   Jan 6   2:00    1:00    D\n" + 
        "Rule    US  1975    only    -   Feb 23  2:00    1:00    D\n" + 
        "Rule    US  1976    1986    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1987    max -   Apr Sun>=1  2:00    1:00    D\n" + 
        "\n" + 
        "Rule    CA  1948    only    -   Mar 14  2:00    1:00    D\n" + 
        "Rule    CA  1949    only    -   Jan  1  2:00    0   S\n" + 
        "Rule    CA  1950    1966    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    CA  1950    1961    -   Sep lastSun 2:00    0   S\n" + 
        "Rule    CA  1962    1966    -   Oct lastSun 2:00    0   S\n" + 
        "\n" + 
        "Zone America/Los_Angeles -7:52:58 - LMT 1883 Nov 18 12:00\n" + 
        "            -8:00   US  P%sT    1946\n" + 
        "            -8:00   CA  P%sT    1967\n" + 
        "            -8:00   US  P%sT";

    private DateTimeZone originalDateTimeZone = null;

    public TestCompiler(String name) {
        super(name);__CLR4_4_1mfhmfhle6np4xm.R.inc(29074);try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29073);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29075);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29076);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29077);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29078);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29079);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testDateTimeZoneBuilder90() throws Exception {__CLR4_4_1mfhmfhle6np4xm.R.globalSliceStart(getClass().getName(),29080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jnbswmfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfhmfhle6np4xm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfhmfhle6np4xm.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testDateTimeZoneBuilder90",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jnbswmfs() throws Exception{try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29080); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29081);getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ1", true); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29082);final DateTimeZone[] zone = new DateTimeZone[1]; 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29083);Thread t = new Thread(new Runnable() { 
  
         public void run() {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29084); 
             __CLR4_4_1mfhmfhle6np4xm.R.inc(29085);zone[0] = getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ2", true); 
         }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}} 
     }); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29086);t.start(); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29087);t.join(); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29088);assertNotNull(zone[0]); 
 }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}
public void testPatchedNameKeysLondon93() throws Exception {__CLR4_4_1mfhmfhle6np4xm.R.globalSliceStart(getClass().getName(),29089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qw2ozxmg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfhmfhle6np4xm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfhmfhle6np4xm.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testPatchedNameKeysLondon93",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qw2ozxmg1() throws Exception{try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29089); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29090);DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29091);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29092);String str1 = zone.getName(now.getMillis()); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29093);String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29094);assertEquals(false, str1.equals(str2)); 
 }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}
public void test_2400_last383() {__CLR4_4_1mfhmfhle6np4xm.R.globalSliceStart(getClass().getName(),29095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153igrzmg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mfhmfhle6np4xm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mfhmfhle6np4xm.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_last383",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153igrzmg7(){try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29095); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29096);StringTokenizer st = new StringTokenizer("Mar lastSun 24:00"); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29097);DateTimeOfYear test = new DateTimeOfYear(st); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29098);assertEquals(4, test.iMonthOfYear); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29099);assertEquals(1, test.iDayOfMonth); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29100);assertEquals(1, test.iDayOfWeek); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29101);assertEquals(0, test.iMillisOfDay); 
     __CLR4_4_1mfhmfhle6np4xm.R.inc(29102);assertEquals(false, test.iAdvanceDayOfWeek); 
 }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}
    

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29103);
         __CLR4_4_1mfhmfhle6np4xm.R.inc(29104);return new DateTimeZoneBuilder()
             .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
             .setStandardOffset(3600000)
             .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
             .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}    

    //-----------------------------------------------------------------------
    

    private Provider compileAndLoad(String data) throws Exception {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29105);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29106);File tempDir = createDataFile(data);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29107);File destDir = makeTempDir();

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29108);ZoneInfoCompiler.main(new String[] {
            "-src", tempDir.getAbsolutePath(),
            "-dst", destDir.getAbsolutePath(),
            "tzdata"
        });

        // Mark all files to be deleted on exit.
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29109);deleteOnExit(destDir);

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29110);return new ZoneInfoProvider(destDir);
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    private File createDataFile(String data) throws IOException {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29111);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29112);File tempDir = makeTempDir();

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29113);File tempFile = new File(tempDir, "tzdata");
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29114);tempFile.deleteOnExit();

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29115);InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29116);FileOutputStream out = new FileOutputStream(tempFile);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29117);byte[] buf = new byte[1000];
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29118);int amt;
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29119);while ((amt = in.read(buf)) > 0) {{
            __CLR4_4_1mfhmfhle6np4xm.R.inc(29122);out.write(buf, 0, amt);
        }
        }__CLR4_4_1mfhmfhle6np4xm.R.inc(29123);out.close();
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29124);in.close();

        __CLR4_4_1mfhmfhle6np4xm.R.inc(29125);return tempDir;
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    private File makeTempDir() {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29126);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29127);File tempDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29128);tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29129);tempDir.mkdirs();
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29130);tempDir.deleteOnExit();
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29131);return tempDir;
    }finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    private void deleteOnExit(File tempFile) {try{__CLR4_4_1mfhmfhle6np4xm.R.inc(29132);
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29133);tempFile.deleteOnExit();
        __CLR4_4_1mfhmfhle6np4xm.R.inc(29134);if ((((tempFile.isDirectory())&&(__CLR4_4_1mfhmfhle6np4xm.R.iget(29135)!=0|true))||(__CLR4_4_1mfhmfhle6np4xm.R.iget(29136)==0&false))) {{
            __CLR4_4_1mfhmfhle6np4xm.R.inc(29137);File[] files = tempFile.listFiles();
            __CLR4_4_1mfhmfhle6np4xm.R.inc(29138);for (int i=0; (((i<files.length)&&(__CLR4_4_1mfhmfhle6np4xm.R.iget(29139)!=0|true))||(__CLR4_4_1mfhmfhle6np4xm.R.iget(29140)==0&false)); i++) {{
                __CLR4_4_1mfhmfhle6np4xm.R.inc(29141);deleteOnExit(files[i]);
            }
        }}
    }}finally{__CLR4_4_1mfhmfhle6np4xm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}

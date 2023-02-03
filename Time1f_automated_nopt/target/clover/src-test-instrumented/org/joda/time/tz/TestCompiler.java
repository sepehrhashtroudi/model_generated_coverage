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
public class TestCompiler extends TestCase {static class __CLR4_4_1jvojvoldl911or{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,25839,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1jvojvoldl911or.R.inc(25764);
        __CLR4_4_1jvojvoldl911or.R.inc(25765);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jvojvoldl911or.R.inc(25766);
        __CLR4_4_1jvojvoldl911or.R.inc(25767);return new TestSuite(TestCompiler.class);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

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
        super(name);__CLR4_4_1jvojvoldl911or.R.inc(25769);try{__CLR4_4_1jvojvoldl911or.R.inc(25768);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jvojvoldl911or.R.inc(25770);
        __CLR4_4_1jvojvoldl911or.R.inc(25771);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jvojvoldl911or.R.inc(25772);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jvojvoldl911or.R.inc(25773);
        __CLR4_4_1jvojvoldl911or.R.inc(25774);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    //-----------------------------------------------------------------------
public void testParseTime354() {__CLR4_4_1jvojvoldl911or.R.globalSliceStart(getClass().getName(),25775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13bdu97jvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvojvoldl911or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvojvoldl911or.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testParseTime354",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13bdu97jvz(){try{__CLR4_4_1jvojvoldl911or.R.inc(25775); __CLR4_4_1jvojvoldl911or.R.inc(25776);DateTime d = DateTime.parse("2013-01-01T00:00:00.000Z"); __CLR4_4_1jvojvoldl911or.R.inc(25777);System.out.println(d.toString()); }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}
public void simple() throws Exception {try{__CLR4_4_1jvojvoldl911or.R.inc(25778); __CLR4_4_1jvojvoldl911or.R.inc(25779);String path = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25780);String path2 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25781);String path3 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25782);String path4 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25783);String path5 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25784);String path6 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25785);String path7 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25786);String path8 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25787);String path9 = "/foo/bar/baz.txt"; __CLR4_4_1jvojvoldl911or.R.inc(25788);String path10 = "/foo/bar/baz.txt";
}finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

public void testGetUncachedZone422() {__CLR4_4_1jvojvoldl911or.R.globalSliceStart(getClass().getName(),25789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l31u8jwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvojvoldl911or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvojvoldl911or.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testGetUncachedZone422",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l31u8jwd(){try{__CLR4_4_1jvojvoldl911or.R.inc(25789); __CLR4_4_1jvojvoldl911or.R.inc(25790);DateTimeZone sz = CachedDateTimeZone.forZone(DateTimeZone.forID("America/Los_Angeles")).getUncachedZone(); __CLR4_4_1jvojvoldl911or.R.inc(25791);assertEquals(DateTimeZone.forID("America/Los_Angeles"), sz); }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}
public void testAddTransition453() throws Exception {__CLR4_4_1jvojvoldl911or.R.globalSliceStart(getClass().getName(),25792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153ch2tjwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvojvoldl911or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvojvoldl911or.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testAddTransition453",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153ch2tjwg() throws Exception{try{__CLR4_4_1jvojvoldl911or.R.inc(25792); __CLR4_4_1jvojvoldl911or.R.inc(25793);DateTime dt = DateTime.now(); __CLR4_4_1jvojvoldl911or.R.inc(25794);DateTime dt1 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1jvojvoldl911or.R.inc(25795);DateTime dt2 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1jvojvoldl911or.R.inc(25796);DateTime dt3 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1jvojvoldl911or.R.inc(25797);DateTime dt4 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1); __CLR4_4_1jvojvoldl911or.R.inc(25798);DateTime dt5 = dt.minusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
}finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

//public void simple() throws Exception { String val = "-dst=/tmp/test"; String val2 = "test2"; String val3 = "test3"; String val4 = "test4"; String val5 = "test5"; String val6 = "test6"; String val7 = "test7"; String val8 = "test8"; String val9 = "test9"; String val10 = "test10"; String val11 = "test11"; String val12 = "test12"; String val13 = "test13"; String val14 = "test14"; String val15 = "test15"; String val16 = "test16"; String val17 = "test17";
//}

public void testAddRecurringSavings1522() throws Exception {__CLR4_4_1jvojvoldl911or.R.globalSliceStart(getClass().getName(),25799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyfy6ijwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jvojvoldl911or.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jvojvoldl911or.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testAddRecurringSavings1522",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyfy6ijwn() throws Exception{try{__CLR4_4_1jvojvoldl911or.R.inc(25799); }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}
    

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {try{__CLR4_4_1jvojvoldl911or.R.inc(25800);
         __CLR4_4_1jvojvoldl911or.R.inc(25801);return new DateTimeZoneBuilder()
             .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
             .setStandardOffset(3600000)
             .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
             .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}    

    //-----------------------------------------------------------------------
    

    private Provider compileAndLoad(String data) throws Exception {try{__CLR4_4_1jvojvoldl911or.R.inc(25802);
        __CLR4_4_1jvojvoldl911or.R.inc(25803);File tempDir = createDataFile(data);
        __CLR4_4_1jvojvoldl911or.R.inc(25804);File destDir = makeTempDir();

        __CLR4_4_1jvojvoldl911or.R.inc(25805);ZoneInfoCompiler.main(new String[] {
            "-src", tempDir.getAbsolutePath(),
            "-dst", destDir.getAbsolutePath(),
            "tzdata"
        });

        // Mark all files to be deleted on exit.
        __CLR4_4_1jvojvoldl911or.R.inc(25806);deleteOnExit(destDir);

        __CLR4_4_1jvojvoldl911or.R.inc(25807);return new ZoneInfoProvider(destDir);
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    private File createDataFile(String data) throws IOException {try{__CLR4_4_1jvojvoldl911or.R.inc(25808);
        __CLR4_4_1jvojvoldl911or.R.inc(25809);File tempDir = makeTempDir();

        __CLR4_4_1jvojvoldl911or.R.inc(25810);File tempFile = new File(tempDir, "tzdata");
        __CLR4_4_1jvojvoldl911or.R.inc(25811);tempFile.deleteOnExit();

        __CLR4_4_1jvojvoldl911or.R.inc(25812);InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        __CLR4_4_1jvojvoldl911or.R.inc(25813);FileOutputStream out = new FileOutputStream(tempFile);
        __CLR4_4_1jvojvoldl911or.R.inc(25814);byte[] buf = new byte[1000];
        __CLR4_4_1jvojvoldl911or.R.inc(25815);int amt;
        __CLR4_4_1jvojvoldl911or.R.inc(25816);while ((amt = in.read(buf)) > 0) {{
            __CLR4_4_1jvojvoldl911or.R.inc(25819);out.write(buf, 0, amt);
        }
        }__CLR4_4_1jvojvoldl911or.R.inc(25820);out.close();
        __CLR4_4_1jvojvoldl911or.R.inc(25821);in.close();

        __CLR4_4_1jvojvoldl911or.R.inc(25822);return tempDir;
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    private File makeTempDir() {try{__CLR4_4_1jvojvoldl911or.R.inc(25823);
        __CLR4_4_1jvojvoldl911or.R.inc(25824);File tempDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_1jvojvoldl911or.R.inc(25825);tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        __CLR4_4_1jvojvoldl911or.R.inc(25826);tempDir.mkdirs();
        __CLR4_4_1jvojvoldl911or.R.inc(25827);tempDir.deleteOnExit();
        __CLR4_4_1jvojvoldl911or.R.inc(25828);return tempDir;
    }finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    private void deleteOnExit(File tempFile) {try{__CLR4_4_1jvojvoldl911or.R.inc(25829);
        __CLR4_4_1jvojvoldl911or.R.inc(25830);tempFile.deleteOnExit();
        __CLR4_4_1jvojvoldl911or.R.inc(25831);if ((((tempFile.isDirectory())&&(__CLR4_4_1jvojvoldl911or.R.iget(25832)!=0|true))||(__CLR4_4_1jvojvoldl911or.R.iget(25833)==0&false))) {{
            __CLR4_4_1jvojvoldl911or.R.inc(25834);File[] files = tempFile.listFiles();
            __CLR4_4_1jvojvoldl911or.R.inc(25835);for (int i=0; (((i<files.length)&&(__CLR4_4_1jvojvoldl911or.R.iget(25836)!=0|true))||(__CLR4_4_1jvojvoldl911or.R.iget(25837)==0&false)); i++) {{
                __CLR4_4_1jvojvoldl911or.R.inc(25838);deleteOnExit(files[i]);
            }
        }}
    }}finally{__CLR4_4_1jvojvoldl911or.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}

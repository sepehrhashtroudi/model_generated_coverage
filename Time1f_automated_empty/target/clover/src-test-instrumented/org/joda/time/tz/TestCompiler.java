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
public class TestCompiler extends TestCase {static class __CLR4_4_1jnxjnxldnipzgu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0065\u006d\u0070\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675367783049L,8589935092L,25535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25485);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25486);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25487);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25488);return new TestSuite(TestCompiler.class);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

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
        super(name);__CLR4_4_1jnxjnxldnipzgu.R.inc(25490);try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25489);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25491);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25492);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25493);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25494);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25495);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25496);
         __CLR4_4_1jnxjnxldnipzgu.R.inc(25497);return new DateTimeZoneBuilder()
             .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
             .setStandardOffset(3600000)
             .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
             .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}    

    //-----------------------------------------------------------------------
    

    private Provider compileAndLoad(String data) throws Exception {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25498);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25499);File tempDir = createDataFile(data);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25500);File destDir = makeTempDir();

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25501);ZoneInfoCompiler.main(new String[] {
            "-src", tempDir.getAbsolutePath(),
            "-dst", destDir.getAbsolutePath(),
            "tzdata"
        });

        // Mark all files to be deleted on exit.
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25502);deleteOnExit(destDir);

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25503);return new ZoneInfoProvider(destDir);
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    private File createDataFile(String data) throws IOException {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25504);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25505);File tempDir = makeTempDir();

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25506);File tempFile = new File(tempDir, "tzdata");
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25507);tempFile.deleteOnExit();

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25508);InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25509);FileOutputStream out = new FileOutputStream(tempFile);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25510);byte[] buf = new byte[1000];
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25511);int amt;
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25512);while ((amt = in.read(buf)) > 0) {{
            __CLR4_4_1jnxjnxldnipzgu.R.inc(25515);out.write(buf, 0, amt);
        }
        }__CLR4_4_1jnxjnxldnipzgu.R.inc(25516);out.close();
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25517);in.close();

        __CLR4_4_1jnxjnxldnipzgu.R.inc(25518);return tempDir;
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    private File makeTempDir() {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25519);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25520);File tempDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25521);tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25522);tempDir.mkdirs();
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25523);tempDir.deleteOnExit();
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25524);return tempDir;
    }finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    private void deleteOnExit(File tempFile) {try{__CLR4_4_1jnxjnxldnipzgu.R.inc(25525);
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25526);tempFile.deleteOnExit();
        __CLR4_4_1jnxjnxldnipzgu.R.inc(25527);if ((((tempFile.isDirectory())&&(__CLR4_4_1jnxjnxldnipzgu.R.iget(25528)!=0|true))||(__CLR4_4_1jnxjnxldnipzgu.R.iget(25529)==0&false))) {{
            __CLR4_4_1jnxjnxldnipzgu.R.inc(25530);File[] files = tempFile.listFiles();
            __CLR4_4_1jnxjnxldnipzgu.R.inc(25531);for (int i=0; (((i<files.length)&&(__CLR4_4_1jnxjnxldnipzgu.R.iget(25532)!=0|true))||(__CLR4_4_1jnxjnxldnipzgu.R.iget(25533)==0&false)); i++) {{
                __CLR4_4_1jnxjnxldnipzgu.R.inc(25534);deleteOnExit(files[i]);
            }
        }}
    }}finally{__CLR4_4_1jnxjnxldnipzgu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}

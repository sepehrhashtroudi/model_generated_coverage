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
package org.joda.time.chrono.gj;

import java.util.Random;

import junit.framework.TestCase;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * Tests either the Julian or Gregorian chronology from org.joda.time.chrono.gj
 * against the implementations in this package. It tests all the date fields
 * against their principal methods.
 * <p>
 * Randomly generated values are fed into the DateTimeField methods and the
 * results are compared between the two chronologies. If any result doesn't
 * match, an error report is generated and the program exits. Each time this
 * test program is run, the pseudo random number generator is seeded with the
 * same value. This ensures consistent results between test runs.
 * <p>
 * The main method accepts three optional arguments: iterations, mode, seed. By
 * default, iterations is set to 1,000,000. The test will take several minutes
 * to run, depending on the computer's performance. Every 5 seconds a progress
 * message is printed.
 * <p>
 * The mode can be either 'g' for proleptic gregorian (the default) or 'j' for
 * proleptic julian. To override the default random number generator seed, pass
 * in a third argument which accepts a long signed integer.
 *
 * @author Brian S O'Neill
 */
public class MainTest extends TestCase {static class __CLR4_4_1igqigqldl911hd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675230570616L,8589935092L,24177,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final int GREGORIAN_MODE = 0;
    public static final int JULIAN_MODE = 1;

    private static final long MILLIS_PER_YEAR = (long)365.2425 * 24 * 60 * 60 * 1000;
    private static final long _1000_YEARS = 1000 * MILLIS_PER_YEAR;
    private static final long _500_YEARS = 500 * MILLIS_PER_YEAR;
    private static final long MAX_MILLIS = (10000 - 1970) * MILLIS_PER_YEAR;
    private static final long MIN_MILLIS = (-10000 - 1970) * MILLIS_PER_YEAR;

    // Show progess reports every 5 seconds.
    private static final long UPDATE_INTERVAL = 5000;

    /**
     * Arguments: iterations [mode [seed]]
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_1igqigqldl911hd.R.inc(23930);
        __CLR4_4_1igqigqldl911hd.R.inc(23931);int iterations = 1000000;
        __CLR4_4_1igqigqldl911hd.R.inc(23932);int mode = GREGORIAN_MODE;
        __CLR4_4_1igqigqldl911hd.R.inc(23933);long seed = 1345435247779935L;

        __CLR4_4_1igqigqldl911hd.R.inc(23934);if ((((args.length > 0)&&(__CLR4_4_1igqigqldl911hd.R.iget(23935)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23936)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(23937);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1igqigqldl911hd.R.inc(23938);if ((((args.length > 1)&&(__CLR4_4_1igqigqldl911hd.R.iget(23939)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23940)==0&false))) {{
                __CLR4_4_1igqigqldl911hd.R.inc(23941);if ((((args[1].startsWith("g"))&&(__CLR4_4_1igqigqldl911hd.R.iget(23942)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23943)==0&false))) {{
                    __CLR4_4_1igqigqldl911hd.R.inc(23944);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1igqigqldl911hd.R.inc(23945);if ((((args[1].startsWith("j"))&&(__CLR4_4_1igqigqldl911hd.R.iget(23946)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23947)==0&false))) {{
                    __CLR4_4_1igqigqldl911hd.R.inc(23948);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1igqigqldl911hd.R.inc(23949);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1igqigqldl911hd.R.inc(23950);if ((((args.length > 2)&&(__CLR4_4_1igqigqldl911hd.R.iget(23951)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23952)==0&false))) {{
                    __CLR4_4_1igqigqldl911hd.R.inc(23953);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1igqigqldl911hd.R.inc(23954);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}
    public void testChronology() {__CLR4_4_1igqigqldl911hd.R.globalSliceStart(getClass().getName(),23955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nihf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igqigqldl911hd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igqigqldl911hd.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nihf(){try{__CLR4_4_1igqigqldl911hd.R.inc(23955);
        __CLR4_4_1igqigqldl911hd.R.inc(23956);int iterations = iIterations;
        __CLR4_4_1igqigqldl911hd.R.inc(23957);long seed = iSeed;
        __CLR4_4_1igqigqldl911hd.R.inc(23958);String modeStr;
        __CLR4_4_1igqigqldl911hd.R.inc(23959);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1igqigqldl911hd.R.iget(23960)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23961)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(23962);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1igqigqldl911hd.R.inc(23963);modeStr = "Julian";
        }

        }__CLR4_4_1igqigqldl911hd.R.inc(23964);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1igqigqldl911hd.R.inc(23965);Random rnd = new Random(seed);
        __CLR4_4_1igqigqldl911hd.R.inc(23966);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1igqigqldl911hd.R.inc(23967);for (int i=0; (((i<iterations)&&(__CLR4_4_1igqigqldl911hd.R.iget(23968)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23969)==0&false)); i++) {{
            __CLR4_4_1igqigqldl911hd.R.inc(23970);long now = System.currentTimeMillis();
            __CLR4_4_1igqigqldl911hd.R.inc(23971);if ((((now >= updateMillis)&&(__CLR4_4_1igqigqldl911hd.R.iget(23972)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23973)==0&false))) {{
                __CLR4_4_1igqigqldl911hd.R.inc(23974);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1igqigqldl911hd.R.inc(23975);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1igqigqldl911hd.R.inc(23976);if ((((complete < 100)&&(__CLR4_4_1igqigqldl911hd.R.iget(23977)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23978)==0&false))) {{
                    __CLR4_4_1igqigqldl911hd.R.inc(23979);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1igqigqldl911hd.R.inc(23980);long millis = randomMillis(rnd);
            __CLR4_4_1igqigqldl911hd.R.inc(23981);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1igqigqldl911hd.R.inc(23982);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1igqigqldl911hd.R.inc(23983);try {
                __CLR4_4_1igqigqldl911hd.R.inc(23984);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1igqigqldl911hd.R.inc(23985);System.out.println("Failure index: " + i);
                __CLR4_4_1igqigqldl911hd.R.inc(23986);System.out.println("Test millis: " + millis);
                __CLR4_4_1igqigqldl911hd.R.inc(23987);System.out.println("Test value: " + value);
                __CLR4_4_1igqigqldl911hd.R.inc(23988);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1igqigqldl911hd.R.inc(23989);fail(e.getMessage());
            }
        }

        }__CLR4_4_1igqigqldl911hd.R.inc(23990);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private final int iIterations;
    private final int iMode;
    private final long iSeed;
    private final Chronology iTest;
    private final Chronology iActual;

    /**
     * @param iterations number of test iterations to perform
     * @param mode GREGORIAN_MODE or JULIAN_MODE,0=Gregorian, 1=Julian
     * @param seed seed for random number generator
     */
    public MainTest(int iterations, int mode, long seed) {
        super("testChronology");__CLR4_4_1igqigqldl911hd.R.inc(23992);try{__CLR4_4_1igqigqldl911hd.R.inc(23991);
        __CLR4_4_1igqigqldl911hd.R.inc(23993);iIterations = iterations;
        __CLR4_4_1igqigqldl911hd.R.inc(23994);iMode = mode;
        __CLR4_4_1igqigqldl911hd.R.inc(23995);iSeed = seed;
        __CLR4_4_1igqigqldl911hd.R.inc(23996);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1igqigqldl911hd.R.iget(23997)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(23998)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(23999);iTest = new TestGregorianChronology();
            __CLR4_4_1igqigqldl911hd.R.inc(24000);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1igqigqldl911hd.R.inc(24001);iTest = new TestJulianChronology();
            __CLR4_4_1igqigqldl911hd.R.inc(24002);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1igqigqldl911hd.R.inc(24003);
        __CLR4_4_1igqigqldl911hd.R.inc(24004);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24005);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24006);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24007);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24008);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24009);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24010);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1igqigqldl911hd.R.inc(24011);
        __CLR4_4_1igqigqldl911hd.R.inc(24012);int a, b;
        __CLR4_4_1igqigqldl911hd.R.inc(24013);long x, y;
        __CLR4_4_1igqigqldl911hd.R.inc(24014);boolean m, n;

        // get test
        __CLR4_4_1igqigqldl911hd.R.inc(24015);a = fieldA.get(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24016);b = fieldB.get(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24017);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1igqigqldl911hd.R.inc(24018);Class fieldClass = fieldA.getClass();
        __CLR4_4_1igqigqldl911hd.R.inc(24019);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1igqigqldl911hd.R.iget(24020)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24021)==0&false))) {{
            
            __CLR4_4_1igqigqldl911hd.R.inc(24022);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1igqigqldl911hd.R.inc(24023);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1igqigqldl911hd.R.inc(24024);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1igqigqldl911hd.R.inc(24025);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24026);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24027);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1igqigqldl911hd.R.iget(24028)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24029)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1igqigqldl911hd.R.inc(24030);x = fieldA.set(millis, a);
            __CLR4_4_1igqigqldl911hd.R.inc(24031);y = fieldB.set(millis, b);
            __CLR4_4_1igqigqldl911hd.R.inc(24032);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1igqigqldl911hd.R.inc(24033);x = fieldA.roundFloor(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24034);y = fieldB.roundFloor(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24035);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1igqigqldl911hd.R.inc(24036);x = fieldA.roundCeiling(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24037);y = fieldB.roundCeiling(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24038);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1igqigqldl911hd.R.inc(24039);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24040);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24041);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1igqigqldl911hd.R.inc(24042);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24043);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24044);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1igqigqldl911hd.R.inc(24045);x = fieldA.remainder(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24046);y = fieldB.remainder(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24047);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1igqigqldl911hd.R.inc(24048);x = fieldA.add(millis, value);
        __CLR4_4_1igqigqldl911hd.R.inc(24049);y = fieldB.add(millis, value);
        __CLR4_4_1igqigqldl911hd.R.inc(24050);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1igqigqldl911hd.R.inc(24051);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1igqigqldl911hd.R.inc(24052);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1igqigqldl911hd.R.inc(24053);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1igqigqldl911hd.R.inc(24054);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24055);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1igqigqldl911hd.R.inc(24056);try {
            __CLR4_4_1igqigqldl911hd.R.inc(24057);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1igqigqldl911hd.R.inc(24058);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1igqigqldl911hd.R.inc(24059);throw e;
        }

        // isLeap test
        __CLR4_4_1igqigqldl911hd.R.inc(24060);m = fieldA.isLeap(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24061);n = fieldB.isLeap(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24062);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1igqigqldl911hd.R.inc(24063);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24064);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24065);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1igqigqldl911hd.R.inc(24066);
        __CLR4_4_1igqigqldl911hd.R.inc(24067);if ((((minValue >= maxValue)&&(__CLR4_4_1igqigqldl911hd.R.iget(24068)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24069)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24070);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1igqigqldl911hd.R.inc(24071);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1igqigqldl911hd.R.inc(24072);value -= minValue;

        __CLR4_4_1igqigqldl911hd.R.inc(24073);if ((((value >= 0)&&(__CLR4_4_1igqigqldl911hd.R.iget(24074)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24075)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24076);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1igqigqldl911hd.R.inc(24077);int remByRange = (-value) % wrapRange;

        __CLR4_4_1igqigqldl911hd.R.inc(24078);if ((((remByRange == 0)&&(__CLR4_4_1igqigqldl911hd.R.iget(24079)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24080)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24081);return 0 + minValue;
        }
        }__CLR4_4_1igqigqldl911hd.R.inc(24082);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24083);
        __CLR4_4_1igqigqldl911hd.R.inc(24084);if ((((valueA != valueB)&&(__CLR4_4_1igqigqldl911hd.R.iget(24085)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24086)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24087);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24088);
        __CLR4_4_1igqigqldl911hd.R.inc(24089);if ((((millisA != millisB)&&(__CLR4_4_1igqigqldl911hd.R.iget(24090)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24091)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24092);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24093);
        __CLR4_4_1igqigqldl911hd.R.inc(24094);if ((((millisA != millisB)&&(__CLR4_4_1igqigqldl911hd.R.iget(24095)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24096)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24097);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24098);
        __CLR4_4_1igqigqldl911hd.R.inc(24099);if ((((boolA != boolB)&&(__CLR4_4_1igqigqldl911hd.R.iget(24100)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24101)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24102);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24103);
        __CLR4_4_1igqigqldl911hd.R.inc(24104);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1igqigqldl911hd.R.inc(24105);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1igqigqldl911hd.R.inc(24106);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24107);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24108);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1igqigqldl911hd.R.inc(24109);throw new RuntimeException();
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24110);
        __CLR4_4_1igqigqldl911hd.R.inc(24111);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1igqigqldl911hd.R.inc(24112);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1igqigqldl911hd.R.inc(24113);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24114);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24115);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24116);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1igqigqldl911hd.R.inc(24117);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24118);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24119);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1igqigqldl911hd.R.inc(24120);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1igqigqldl911hd.R.inc(24121);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24122);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24123);throw new RuntimeException();
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24124);
        __CLR4_4_1igqigqldl911hd.R.inc(24125);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1igqigqldl911hd.R.inc(24126);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1igqigqldl911hd.R.inc(24127);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24128);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24129);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24130);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1igqigqldl911hd.R.inc(24131);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24132);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24133);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1igqigqldl911hd.R.inc(24134);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1igqigqldl911hd.R.inc(24135);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24136);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1igqigqldl911hd.R.inc(24137);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1igqigqldl911hd.R.inc(24138);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1igqigqldl911hd.R.inc(24139);throw new RuntimeException();
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24140);
        __CLR4_4_1igqigqldl911hd.R.inc(24141);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1igqigqldl911hd.R.inc(24142);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1igqigqldl911hd.R.inc(24143);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24144);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1igqigqldl911hd.R.inc(24145);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1igqigqldl911hd.R.inc(24146);throw new RuntimeException();
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1igqigqldl911hd.R.inc(24147);
        __CLR4_4_1igqigqldl911hd.R.inc(24148);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1igqigqldl911hd.R.iget(24149)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24150)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24151);return fieldA.getName();
        } }else {{
            __CLR4_4_1igqigqldl911hd.R.inc(24152);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1igqigqldl911hd.R.inc(24153);
        __CLR4_4_1igqigqldl911hd.R.inc(24154);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1igqigqldl911hd.R.inc(24155);
        __CLR4_4_1igqigqldl911hd.R.inc(24156);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1igqigqldl911hd.R.inc(24157);
        __CLR4_4_1igqigqldl911hd.R.inc(24158);return makeDate(millis, iActual);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1igqigqldl911hd.R.inc(24159);
        __CLR4_4_1igqigqldl911hd.R.inc(24160);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1igqigqldl911hd.R.inc(24161);
        __CLR4_4_1igqigqldl911hd.R.inc(24162);long millis = rnd.nextLong();
        __CLR4_4_1igqigqldl911hd.R.inc(24163);if ((((millis >= 0)&&(__CLR4_4_1igqigqldl911hd.R.iget(24164)!=0|true))||(__CLR4_4_1igqigqldl911hd.R.iget(24165)==0&false))) {{
            __CLR4_4_1igqigqldl911hd.R.inc(24166);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1igqigqldl911hd.R.inc(24167);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1igqigqldl911hd.R.inc(24168);return millis;
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1igqigqldl911hd.R.inc(24169);
        __CLR4_4_1igqigqldl911hd.R.inc(24170);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24171);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24172);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24173);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24174);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24175);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1igqigqldl911hd.R.inc(24176);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1igqigqldl911hd.R.flushNeeded();}}

}

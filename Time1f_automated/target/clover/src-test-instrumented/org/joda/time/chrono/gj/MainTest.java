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
public class MainTest extends TestCase {static class __CLR4_4_1j8pj8plccietwj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672525352587L,8589935092L,25184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1j8pj8plccietwj.R.inc(24937);
        __CLR4_4_1j8pj8plccietwj.R.inc(24938);int iterations = 1000000;
        __CLR4_4_1j8pj8plccietwj.R.inc(24939);int mode = GREGORIAN_MODE;
        __CLR4_4_1j8pj8plccietwj.R.inc(24940);long seed = 1345435247779935L;

        __CLR4_4_1j8pj8plccietwj.R.inc(24941);if ((((args.length > 0)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24942)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24943)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(24944);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1j8pj8plccietwj.R.inc(24945);if ((((args.length > 1)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24946)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24947)==0&false))) {{
                __CLR4_4_1j8pj8plccietwj.R.inc(24948);if ((((args[1].startsWith("g"))&&(__CLR4_4_1j8pj8plccietwj.R.iget(24949)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24950)==0&false))) {{
                    __CLR4_4_1j8pj8plccietwj.R.inc(24951);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1j8pj8plccietwj.R.inc(24952);if ((((args[1].startsWith("j"))&&(__CLR4_4_1j8pj8plccietwj.R.iget(24953)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24954)==0&false))) {{
                    __CLR4_4_1j8pj8plccietwj.R.inc(24955);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1j8pj8plccietwj.R.inc(24956);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1j8pj8plccietwj.R.inc(24957);if ((((args.length > 2)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24958)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24959)==0&false))) {{
                    __CLR4_4_1j8pj8plccietwj.R.inc(24960);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1j8pj8plccietwj.R.inc(24961);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    public void testChronology() {__CLR4_4_1j8pj8plccietwj.R.globalSliceStart(getClass().getName(),24962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nj9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j8pj8plccietwj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j8pj8plccietwj.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nj9e(){try{__CLR4_4_1j8pj8plccietwj.R.inc(24962);
        __CLR4_4_1j8pj8plccietwj.R.inc(24963);int iterations = iIterations;
        __CLR4_4_1j8pj8plccietwj.R.inc(24964);long seed = iSeed;
        __CLR4_4_1j8pj8plccietwj.R.inc(24965);String modeStr;
        __CLR4_4_1j8pj8plccietwj.R.inc(24966);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24967)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24968)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(24969);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1j8pj8plccietwj.R.inc(24970);modeStr = "Julian";
        }

        }__CLR4_4_1j8pj8plccietwj.R.inc(24971);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1j8pj8plccietwj.R.inc(24972);Random rnd = new Random(seed);
        __CLR4_4_1j8pj8plccietwj.R.inc(24973);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1j8pj8plccietwj.R.inc(24974);for (int i=0; (((i<iterations)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24975)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24976)==0&false)); i++) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(24977);long now = System.currentTimeMillis();
            __CLR4_4_1j8pj8plccietwj.R.inc(24978);if ((((now >= updateMillis)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24979)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24980)==0&false))) {{
                __CLR4_4_1j8pj8plccietwj.R.inc(24981);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1j8pj8plccietwj.R.inc(24982);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1j8pj8plccietwj.R.inc(24983);if ((((complete < 100)&&(__CLR4_4_1j8pj8plccietwj.R.iget(24984)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(24985)==0&false))) {{
                    __CLR4_4_1j8pj8plccietwj.R.inc(24986);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1j8pj8plccietwj.R.inc(24987);long millis = randomMillis(rnd);
            __CLR4_4_1j8pj8plccietwj.R.inc(24988);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1j8pj8plccietwj.R.inc(24989);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1j8pj8plccietwj.R.inc(24990);try {
                __CLR4_4_1j8pj8plccietwj.R.inc(24991);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1j8pj8plccietwj.R.inc(24992);System.out.println("Failure index: " + i);
                __CLR4_4_1j8pj8plccietwj.R.inc(24993);System.out.println("Test millis: " + millis);
                __CLR4_4_1j8pj8plccietwj.R.inc(24994);System.out.println("Test value: " + value);
                __CLR4_4_1j8pj8plccietwj.R.inc(24995);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1j8pj8plccietwj.R.inc(24996);fail(e.getMessage());
            }
        }

        }__CLR4_4_1j8pj8plccietwj.R.inc(24997);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}
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
        super("testChronology");__CLR4_4_1j8pj8plccietwj.R.inc(24999);try{__CLR4_4_1j8pj8plccietwj.R.inc(24998);
        __CLR4_4_1j8pj8plccietwj.R.inc(25000);iIterations = iterations;
        __CLR4_4_1j8pj8plccietwj.R.inc(25001);iMode = mode;
        __CLR4_4_1j8pj8plccietwj.R.inc(25002);iSeed = seed;
        __CLR4_4_1j8pj8plccietwj.R.inc(25003);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25004)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25005)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25006);iTest = new TestGregorianChronology();
            __CLR4_4_1j8pj8plccietwj.R.inc(25007);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25008);iTest = new TestJulianChronology();
            __CLR4_4_1j8pj8plccietwj.R.inc(25009);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25010);
        __CLR4_4_1j8pj8plccietwj.R.inc(25011);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25012);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25013);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25014);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25015);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25016);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25017);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1j8pj8plccietwj.R.inc(25018);
        __CLR4_4_1j8pj8plccietwj.R.inc(25019);int a, b;
        __CLR4_4_1j8pj8plccietwj.R.inc(25020);long x, y;
        __CLR4_4_1j8pj8plccietwj.R.inc(25021);boolean m, n;

        // get test
        __CLR4_4_1j8pj8plccietwj.R.inc(25022);a = fieldA.get(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25023);b = fieldB.get(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25024);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1j8pj8plccietwj.R.inc(25025);Class fieldClass = fieldA.getClass();
        __CLR4_4_1j8pj8plccietwj.R.inc(25026);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25027)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25028)==0&false))) {{
            
            __CLR4_4_1j8pj8plccietwj.R.inc(25029);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1j8pj8plccietwj.R.inc(25030);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1j8pj8plccietwj.R.inc(25031);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1j8pj8plccietwj.R.inc(25032);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25033);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25034);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1j8pj8plccietwj.R.iget(25035)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25036)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25037);x = fieldA.set(millis, a);
            __CLR4_4_1j8pj8plccietwj.R.inc(25038);y = fieldB.set(millis, b);
            __CLR4_4_1j8pj8plccietwj.R.inc(25039);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1j8pj8plccietwj.R.inc(25040);x = fieldA.roundFloor(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25041);y = fieldB.roundFloor(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25042);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1j8pj8plccietwj.R.inc(25043);x = fieldA.roundCeiling(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25044);y = fieldB.roundCeiling(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25045);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1j8pj8plccietwj.R.inc(25046);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25047);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25048);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1j8pj8plccietwj.R.inc(25049);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25050);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25051);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1j8pj8plccietwj.R.inc(25052);x = fieldA.remainder(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25053);y = fieldB.remainder(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25054);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1j8pj8plccietwj.R.inc(25055);x = fieldA.add(millis, value);
        __CLR4_4_1j8pj8plccietwj.R.inc(25056);y = fieldB.add(millis, value);
        __CLR4_4_1j8pj8plccietwj.R.inc(25057);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1j8pj8plccietwj.R.inc(25058);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1j8pj8plccietwj.R.inc(25059);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1j8pj8plccietwj.R.inc(25060);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1j8pj8plccietwj.R.inc(25061);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25062);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1j8pj8plccietwj.R.inc(25063);try {
            __CLR4_4_1j8pj8plccietwj.R.inc(25064);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1j8pj8plccietwj.R.inc(25065);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1j8pj8plccietwj.R.inc(25066);throw e;
        }

        // isLeap test
        __CLR4_4_1j8pj8plccietwj.R.inc(25067);m = fieldA.isLeap(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25068);n = fieldB.isLeap(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25069);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1j8pj8plccietwj.R.inc(25070);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25071);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25072);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25073);
        __CLR4_4_1j8pj8plccietwj.R.inc(25074);if ((((minValue >= maxValue)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25075)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25076)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25077);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1j8pj8plccietwj.R.inc(25078);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1j8pj8plccietwj.R.inc(25079);value -= minValue;

        __CLR4_4_1j8pj8plccietwj.R.inc(25080);if ((((value >= 0)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25081)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25082)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25083);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1j8pj8plccietwj.R.inc(25084);int remByRange = (-value) % wrapRange;

        __CLR4_4_1j8pj8plccietwj.R.inc(25085);if ((((remByRange == 0)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25086)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25087)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25088);return 0 + minValue;
        }
        }__CLR4_4_1j8pj8plccietwj.R.inc(25089);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25090);
        __CLR4_4_1j8pj8plccietwj.R.inc(25091);if ((((valueA != valueB)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25092)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25093)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25094);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25095);
        __CLR4_4_1j8pj8plccietwj.R.inc(25096);if ((((millisA != millisB)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25097)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25098)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25099);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25100);
        __CLR4_4_1j8pj8plccietwj.R.inc(25101);if ((((millisA != millisB)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25102)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25103)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25104);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25105);
        __CLR4_4_1j8pj8plccietwj.R.inc(25106);if ((((boolA != boolB)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25107)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25108)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25109);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25110);
        __CLR4_4_1j8pj8plccietwj.R.inc(25111);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1j8pj8plccietwj.R.inc(25112);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1j8pj8plccietwj.R.inc(25113);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25114);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25115);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1j8pj8plccietwj.R.inc(25116);throw new RuntimeException();
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25117);
        __CLR4_4_1j8pj8plccietwj.R.inc(25118);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1j8pj8plccietwj.R.inc(25119);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1j8pj8plccietwj.R.inc(25120);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25121);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25122);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25123);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1j8pj8plccietwj.R.inc(25124);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25125);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25126);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1j8pj8plccietwj.R.inc(25127);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1j8pj8plccietwj.R.inc(25128);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25129);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25130);throw new RuntimeException();
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25131);
        __CLR4_4_1j8pj8plccietwj.R.inc(25132);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1j8pj8plccietwj.R.inc(25133);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1j8pj8plccietwj.R.inc(25134);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25135);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25136);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25137);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1j8pj8plccietwj.R.inc(25138);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25139);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25140);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1j8pj8plccietwj.R.inc(25141);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1j8pj8plccietwj.R.inc(25142);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25143);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1j8pj8plccietwj.R.inc(25144);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1j8pj8plccietwj.R.inc(25145);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1j8pj8plccietwj.R.inc(25146);throw new RuntimeException();
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25147);
        __CLR4_4_1j8pj8plccietwj.R.inc(25148);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1j8pj8plccietwj.R.inc(25149);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1j8pj8plccietwj.R.inc(25150);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25151);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1j8pj8plccietwj.R.inc(25152);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1j8pj8plccietwj.R.inc(25153);throw new RuntimeException();
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25154);
        __CLR4_4_1j8pj8plccietwj.R.inc(25155);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1j8pj8plccietwj.R.iget(25156)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25157)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25158);return fieldA.getName();
        } }else {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25159);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25160);
        __CLR4_4_1j8pj8plccietwj.R.inc(25161);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25162);
        __CLR4_4_1j8pj8plccietwj.R.inc(25163);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25164);
        __CLR4_4_1j8pj8plccietwj.R.inc(25165);return makeDate(millis, iActual);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25166);
        __CLR4_4_1j8pj8plccietwj.R.inc(25167);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25168);
        __CLR4_4_1j8pj8plccietwj.R.inc(25169);long millis = rnd.nextLong();
        __CLR4_4_1j8pj8plccietwj.R.inc(25170);if ((((millis >= 0)&&(__CLR4_4_1j8pj8plccietwj.R.iget(25171)!=0|true))||(__CLR4_4_1j8pj8plccietwj.R.iget(25172)==0&false))) {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25173);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1j8pj8plccietwj.R.inc(25174);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1j8pj8plccietwj.R.inc(25175);return millis;
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1j8pj8plccietwj.R.inc(25176);
        __CLR4_4_1j8pj8plccietwj.R.inc(25177);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25178);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25179);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25180);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25181);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25182);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1j8pj8plccietwj.R.inc(25183);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1j8pj8plccietwj.R.flushNeeded();}}

}

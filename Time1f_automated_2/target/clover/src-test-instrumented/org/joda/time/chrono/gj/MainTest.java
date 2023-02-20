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
public class MainTest extends TestCase {static class __CLR4_4_1kltkltle6nl8kr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676524817201L,8589935092L,26952,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26705);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26706);int iterations = 1000000;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26707);int mode = GREGORIAN_MODE;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26708);long seed = 1345435247779935L;

        __CLR4_4_1kltkltle6nl8kr.R.inc(26709);if ((((args.length > 0)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26710)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26711)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26712);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26713);if ((((args.length > 1)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26714)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26715)==0&false))) {{
                __CLR4_4_1kltkltle6nl8kr.R.inc(26716);if ((((args[1].startsWith("g"))&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26717)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26718)==0&false))) {{
                    __CLR4_4_1kltkltle6nl8kr.R.inc(26719);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1kltkltle6nl8kr.R.inc(26720);if ((((args[1].startsWith("j"))&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26721)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26722)==0&false))) {{
                    __CLR4_4_1kltkltle6nl8kr.R.inc(26723);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1kltkltle6nl8kr.R.inc(26724);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1kltkltle6nl8kr.R.inc(26725);if ((((args.length > 2)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26726)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26727)==0&false))) {{
                    __CLR4_4_1kltkltle6nl8kr.R.inc(26728);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1kltkltle6nl8kr.R.inc(26729);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    public void testChronology() {__CLR4_4_1kltkltle6nl8kr.R.globalSliceStart(getClass().getName(),26730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nkmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kltkltle6nl8kr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kltkltle6nl8kr.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nkmi(){try{__CLR4_4_1kltkltle6nl8kr.R.inc(26730);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26731);int iterations = iIterations;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26732);long seed = iSeed;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26733);String modeStr;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26734);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26735)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26736)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26737);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26738);modeStr = "Julian";
        }

        }__CLR4_4_1kltkltle6nl8kr.R.inc(26739);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1kltkltle6nl8kr.R.inc(26740);Random rnd = new Random(seed);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26741);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1kltkltle6nl8kr.R.inc(26742);for (int i=0; (((i<iterations)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26743)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26744)==0&false)); i++) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26745);long now = System.currentTimeMillis();
            __CLR4_4_1kltkltle6nl8kr.R.inc(26746);if ((((now >= updateMillis)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26747)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26748)==0&false))) {{
                __CLR4_4_1kltkltle6nl8kr.R.inc(26749);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1kltkltle6nl8kr.R.inc(26750);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1kltkltle6nl8kr.R.inc(26751);if ((((complete < 100)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26752)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26753)==0&false))) {{
                    __CLR4_4_1kltkltle6nl8kr.R.inc(26754);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1kltkltle6nl8kr.R.inc(26755);long millis = randomMillis(rnd);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26756);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1kltkltle6nl8kr.R.inc(26757);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1kltkltle6nl8kr.R.inc(26758);try {
                __CLR4_4_1kltkltle6nl8kr.R.inc(26759);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1kltkltle6nl8kr.R.inc(26760);System.out.println("Failure index: " + i);
                __CLR4_4_1kltkltle6nl8kr.R.inc(26761);System.out.println("Test millis: " + millis);
                __CLR4_4_1kltkltle6nl8kr.R.inc(26762);System.out.println("Test value: " + value);
                __CLR4_4_1kltkltle6nl8kr.R.inc(26763);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1kltkltle6nl8kr.R.inc(26764);fail(e.getMessage());
            }
        }

        }__CLR4_4_1kltkltle6nl8kr.R.inc(26765);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}
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
        super("testChronology");__CLR4_4_1kltkltle6nl8kr.R.inc(26767);try{__CLR4_4_1kltkltle6nl8kr.R.inc(26766);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26768);iIterations = iterations;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26769);iMode = mode;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26770);iSeed = seed;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26771);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26772)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26773)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26774);iTest = new TestGregorianChronology();
            __CLR4_4_1kltkltle6nl8kr.R.inc(26775);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26776);iTest = new TestJulianChronology();
            __CLR4_4_1kltkltle6nl8kr.R.inc(26777);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26778);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26779);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26780);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26781);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26782);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26783);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26784);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26785);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26786);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26787);int a, b;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26788);long x, y;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26789);boolean m, n;

        // get test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26790);a = fieldA.get(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26791);b = fieldB.get(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26792);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1kltkltle6nl8kr.R.inc(26793);Class fieldClass = fieldA.getClass();
        __CLR4_4_1kltkltle6nl8kr.R.inc(26794);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26795)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26796)==0&false))) {{
            
            __CLR4_4_1kltkltle6nl8kr.R.inc(26797);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26798);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26799);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1kltkltle6nl8kr.R.inc(26800);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26801);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26802);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26803)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26804)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26805);x = fieldA.set(millis, a);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26806);y = fieldB.set(millis, b);
            __CLR4_4_1kltkltle6nl8kr.R.inc(26807);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1kltkltle6nl8kr.R.inc(26808);x = fieldA.roundFloor(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26809);y = fieldB.roundFloor(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26810);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26811);x = fieldA.roundCeiling(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26812);y = fieldB.roundCeiling(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26813);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26814);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26815);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26816);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26817);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26818);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26819);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26820);x = fieldA.remainder(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26821);y = fieldB.remainder(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26822);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26823);x = fieldA.add(millis, value);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26824);y = fieldB.add(millis, value);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26825);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26826);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26827);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26828);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26829);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26830);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26831);try {
            __CLR4_4_1kltkltle6nl8kr.R.inc(26832);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1kltkltle6nl8kr.R.inc(26833);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1kltkltle6nl8kr.R.inc(26834);throw e;
        }

        // isLeap test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26835);m = fieldA.isLeap(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26836);n = fieldB.isLeap(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26837);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1kltkltle6nl8kr.R.inc(26838);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26839);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26840);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26841);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26842);if ((((minValue >= maxValue)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26843)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26844)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26845);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1kltkltle6nl8kr.R.inc(26846);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1kltkltle6nl8kr.R.inc(26847);value -= minValue;

        __CLR4_4_1kltkltle6nl8kr.R.inc(26848);if ((((value >= 0)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26849)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26850)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26851);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1kltkltle6nl8kr.R.inc(26852);int remByRange = (-value) % wrapRange;

        __CLR4_4_1kltkltle6nl8kr.R.inc(26853);if ((((remByRange == 0)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26854)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26855)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26856);return 0 + minValue;
        }
        }__CLR4_4_1kltkltle6nl8kr.R.inc(26857);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26858);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26859);if ((((valueA != valueB)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26860)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26861)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26862);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26863);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26864);if ((((millisA != millisB)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26865)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26866)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26867);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26868);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26869);if ((((millisA != millisB)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26870)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26871)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26872);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26873);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26874);if ((((boolA != boolB)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26875)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26876)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26877);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26878);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26879);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26880);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kltkltle6nl8kr.R.inc(26881);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26882);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26883);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26884);throw new RuntimeException();
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26885);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26886);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26887);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kltkltle6nl8kr.R.inc(26888);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26889);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26890);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26891);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26892);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26893);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26894);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26895);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26896);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26897);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26898);throw new RuntimeException();
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26899);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26900);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26901);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kltkltle6nl8kr.R.inc(26902);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26903);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26904);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26905);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26906);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26907);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26908);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26909);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26910);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26911);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26912);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26913);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26914);throw new RuntimeException();
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26915);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26916);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26917);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1kltkltle6nl8kr.R.inc(26918);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26919);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26920);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26921);throw new RuntimeException();
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26922);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26923);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26924)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26925)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26926);return fieldA.getName();
        } }else {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26927);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26928);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26929);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26930);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26931);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26932);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26933);return makeDate(millis, iActual);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26934);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26935);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26936);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26937);long millis = rnd.nextLong();
        __CLR4_4_1kltkltle6nl8kr.R.inc(26938);if ((((millis >= 0)&&(__CLR4_4_1kltkltle6nl8kr.R.iget(26939)!=0|true))||(__CLR4_4_1kltkltle6nl8kr.R.iget(26940)==0&false))) {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26941);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1kltkltle6nl8kr.R.inc(26942);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1kltkltle6nl8kr.R.inc(26943);return millis;
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1kltkltle6nl8kr.R.inc(26944);
        __CLR4_4_1kltkltle6nl8kr.R.inc(26945);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26946);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26947);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26948);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26949);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26950);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1kltkltle6nl8kr.R.inc(26951);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1kltkltle6nl8kr.R.flushNeeded();}}

}

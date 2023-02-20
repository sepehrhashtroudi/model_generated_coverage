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
public class MainTest extends TestCase {static class __CLR4_4_1qdaqdale6qsfg7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u005f\u0074\u0072\u0061\u0069\u006e\u005f\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1676530191062L,8589935092L,34446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public static void main(String[] args) throws Exception {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34174);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34175);int iterations = 1000000;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34176);int mode = GREGORIAN_MODE;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34177);long seed = 1345435247779935L;

        __CLR4_4_1qdaqdale6qsfg7.R.inc(34178);if ((((args.length > 0)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34179)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34180)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34181);iterations = Integer.parseInt(args[0]);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34182);if ((((args.length > 1)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34183)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34184)==0&false))) {{
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34185);if ((((args[1].startsWith("g"))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34186)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34187)==0&false))) {{
                    __CLR4_4_1qdaqdale6qsfg7.R.inc(34188);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_1qdaqdale6qsfg7.R.inc(34189);if ((((args[1].startsWith("j"))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34190)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34191)==0&false))) {{
                    __CLR4_4_1qdaqdale6qsfg7.R.inc(34192);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_1qdaqdale6qsfg7.R.inc(34193);throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_1qdaqdale6qsfg7.R.inc(34194);if ((((args.length > 2)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34195)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34196)==0&false))) {{
                    __CLR4_4_1qdaqdale6qsfg7.R.inc(34197);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34198);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

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
        super("testChronology");__CLR4_4_1qdaqdale6qsfg7.R.inc(34200);try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34199);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34201);iIterations = iterations;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34202);iMode = mode;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34203);iSeed = seed;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34204);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34205)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34206)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34207);iTest = new TestGregorianChronology();
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34208);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34209);iTest = new TestJulianChronology();
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34210);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */

public static void main2(String[] args) throws Exception {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34211);
     __CLR4_4_1qdaqdale6qsfg7.R.inc(34212);int iterations = 1000000; 
     __CLR4_4_1qdaqdale6qsfg7.R.inc(34213);int mode = GREGORIAN_MODE; 
     __CLR4_4_1qdaqdale6qsfg7.R.inc(34214);long seed = 1345435247779935L; 
     __CLR4_4_1qdaqdale6qsfg7.R.inc(34215);if ((((args.length > 0)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34216)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34217)==0&false))) {{ 
         __CLR4_4_1qdaqdale6qsfg7.R.inc(34218);iterations = Integer.parseInt(args[0]); 
         __CLR4_4_1qdaqdale6qsfg7.R.inc(34219);if ((((args.length > 1)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34220)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34221)==0&false))) {{ 
             __CLR4_4_1qdaqdale6qsfg7.R.inc(34222);if ((((args[1].startsWith("g"))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34223)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34224)==0&false))) {{ 
                 __CLR4_4_1qdaqdale6qsfg7.R.inc(34225);mode = GREGORIAN_MODE; 
             } }else {__CLR4_4_1qdaqdale6qsfg7.R.inc(34226);if ((((args[1].startsWith("j"))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34227)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34228)==0&false))) {{ 
                 __CLR4_4_1qdaqdale6qsfg7.R.inc(34229);mode = JULIAN_MODE; 
             } }else {{ 
                 __CLR4_4_1qdaqdale6qsfg7.R.inc(34230);throw new IllegalArgumentException("Unknown mode: " + args[1]); 
             } 
             }}__CLR4_4_1qdaqdale6qsfg7.R.inc(34231);if ((((args.length > 2)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34232)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34233)==0&false))) {{ 
                 __CLR4_4_1qdaqdale6qsfg7.R.inc(34234);seed = Long.parseLong(args[2]); 
             } 
         }} 
     }} 
     }__CLR4_4_1qdaqdale6qsfg7.R.inc(34235);new MainTest(iterations, mode, seed).testChronology();
 }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    public void testChronology() {__CLR4_4_1qdaqdale6qsfg7.R.globalSliceStart(getClass().getName(),34236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86nqf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qdaqdale6qsfg7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qdaqdale6qsfg7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86nqf0(){try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34236);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34237);int iterations = iIterations;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34238);long seed = iSeed;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34239);String modeStr;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34240);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34241)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34242)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34243);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34244);modeStr = "Julian";
        }

        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34245);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_1qdaqdale6qsfg7.R.inc(34246);Random rnd = new Random(seed);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34247);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_1qdaqdale6qsfg7.R.inc(34248);for (int i=0; (((i<iterations)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34249)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34250)==0&false)); i++) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34251);long now = System.currentTimeMillis();
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34252);if ((((now >= updateMillis)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34253)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34254)==0&false))) {{
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34255);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34256);double complete = ((int)((double)i / iterations * 1000.0)) / 10d;
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34257);if ((((complete < 100)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34258)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34259)==0&false))) {{
                    __CLR4_4_1qdaqdale6qsfg7.R.inc(34260);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_1qdaqdale6qsfg7.R.inc(34261);long millis = randomMillis(rnd);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34262);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34263);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_1qdaqdale6qsfg7.R.inc(34264);try {
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34265);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34266);System.out.println("Failure index: " + i);
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34267);System.out.println("Test millis: " + millis);
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34268);System.out.println("Test value: " + value);
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34269);System.out.println("Test millis2: " + millis2);
                __CLR4_4_1qdaqdale6qsfg7.R.inc(34270);fail(e.getMessage());
            }
        }

        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34271);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}
    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34272);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34273);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34274);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34275);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34276);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34277);testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34278);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34279);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34280);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34281);int a, b;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34282);long x, y;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34283);boolean m, n;

        // get test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34284);a = fieldA.get(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34285);b = fieldB.get(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34286);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34287);Class fieldClass = fieldA.getClass();
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34288);if ((((fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34289)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34290)==0&false))) {{
            
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34291);a = fieldA.getMaximumValue(millis);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34292);b = fieldB.getMaximumValue(millis);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34293);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34294);a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34295);b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34296);if ((((iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34297)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34298)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34299);x = fieldA.set(millis, a);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34300);y = fieldB.set(millis, b);
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34301);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34302);x = fieldA.roundFloor(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34303);y = fieldB.roundFloor(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34304);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34305);x = fieldA.roundCeiling(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34306);y = fieldB.roundCeiling(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34307);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34308);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34309);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34310);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34311);x = fieldA.roundHalfEven(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34312);y = fieldB.roundHalfEven(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34313);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34314);x = fieldA.remainder(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34315);y = fieldB.remainder(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34316);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34317);x = fieldA.add(millis, value);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34318);y = fieldB.add(millis, value);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34319);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34320);x = fieldA.addWrapField(millis, value);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34321);y = fieldB.addWrapField(millis, value);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34322);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34323);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34324);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34325);try {
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34326);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34327);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34328);throw e;
        }

        // isLeap test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34329);m = fieldA.isLeap(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34330);n = fieldB.isLeap(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34331);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34332);a = fieldA.getLeapAmount(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34333);b = fieldB.getLeapAmount(millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34334);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34335);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34336);if ((((minValue >= maxValue)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34337)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34338)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34339);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34340);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34341);value -= minValue;

        __CLR4_4_1qdaqdale6qsfg7.R.inc(34342);if ((((value >= 0)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34343)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34344)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34345);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34346);int remByRange = (-value) % wrapRange;

        __CLR4_4_1qdaqdale6qsfg7.R.inc(34347);if ((((remByRange == 0)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34348)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34349)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34350);return 0 + minValue;
        }
        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34351);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34352);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34353);if ((((valueA != valueB)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34354)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34355)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34356);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34357);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34358);if ((((millisA != millisB)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34359)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34360)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34361);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34362);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34363);if ((((millisA != millisB)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34364)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34365)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34366);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34367);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34368);if ((((boolA != boolB)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34369)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34370)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34371);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34372);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34373);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34374);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34375);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34376);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34377);System.out.println(valueA + " != " + valueB);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34378);throw new RuntimeException();
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34379);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34380);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34381);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34382);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34383);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34384);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34385);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34386);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34387);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34388);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34389);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34390);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34391);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34392);throw new RuntimeException();
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34393);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34394);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34395);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34396);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34397);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34398);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34399);System.out.println(millisA + " != " + millisB);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34400);System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34401);System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34402);System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34403);System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34404);System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34405);System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34406);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34407);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34408);throw new RuntimeException();
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34409);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34410);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34411);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34412);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34413);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34414);System.out.println(boolA + " != " + boolB);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34415);throw new RuntimeException();
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34416);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34417);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34418)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34419)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34420);return fieldA.getName();
        } }else {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34421);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34422);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34423);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34424);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34425);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34426);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34427);return makeDate(millis, iActual);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34428);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34429);return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34430);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34431);long millis = rnd.nextLong();
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34432);if ((((millis >= 0)&&(__CLR4_4_1qdaqdale6qsfg7.R.iget(34433)!=0|true))||(__CLR4_4_1qdaqdale6qsfg7.R.iget(34434)==0&false))) {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34435);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_1qdaqdale6qsfg7.R.inc(34436);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_1qdaqdale6qsfg7.R.inc(34437);return millis;
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_1qdaqdale6qsfg7.R.inc(34438);
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34439);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34440);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34441);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34442);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34443);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34444);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_1qdaqdale6qsfg7.R.inc(34445);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_1qdaqdale6qsfg7.R.flushNeeded();}}

}

/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Default implementation of the context storing the label-value pairs for contexted exceptions.
 * <p>
 * This implementation is serializable, however this is dependent on the values that
 * are added also being serializable.
 * </p>
 * 
 * @see ContextedException
 * @see ContextedRuntimeException
 * @since 3.0
 */
public class DefaultExceptionContext implements ExceptionContext, Serializable {public static class __CLR4_4_18r48r4ldni83xz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366948091L,8589935092L,11414,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The serialization version. */
    private static final long serialVersionUID = 20110706L;

    /** The list storing the label-data pairs. */
    private final List<Pair<String, Object>> contextValues = new ArrayList<Pair<String,Object>>();

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultExceptionContext addContextValue(final String label, final Object value) {try{__CLR4_4_18r48r4ldni83xz.R.inc(11344);
        __CLR4_4_18r48r4ldni83xz.R.inc(11345);contextValues.add(new ImmutablePair<String, Object>(label, value));
        __CLR4_4_18r48r4ldni83xz.R.inc(11346);return this;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultExceptionContext setContextValue(final String label, final Object value) {try{__CLR4_4_18r48r4ldni83xz.R.inc(11347);
        __CLR4_4_18r48r4ldni83xz.R.inc(11348);for (final Iterator<Pair<String, Object>> iter = contextValues.iterator(); (((iter.hasNext())&&(__CLR4_4_18r48r4ldni83xz.R.iget(11349)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11350)==0&false));) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11351);final Pair<String, Object> p = iter.next();
            __CLR4_4_18r48r4ldni83xz.R.inc(11352);if ((((StringUtils.equals(label, p.getKey()))&&(__CLR4_4_18r48r4ldni83xz.R.iget(11353)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11354)==0&false))) {{
                __CLR4_4_18r48r4ldni83xz.R.inc(11355);iter.remove();
            }
        }}
        }__CLR4_4_18r48r4ldni83xz.R.inc(11356);addContextValue(label, value);
        __CLR4_4_18r48r4ldni83xz.R.inc(11357);return this;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Object> getContextValues(final String label) {try{__CLR4_4_18r48r4ldni83xz.R.inc(11358);
        __CLR4_4_18r48r4ldni83xz.R.inc(11359);final List<Object> values = new ArrayList<Object>();
        __CLR4_4_18r48r4ldni83xz.R.inc(11360);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11361);if ((((StringUtils.equals(label, pair.getKey()))&&(__CLR4_4_18r48r4ldni83xz.R.iget(11362)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11363)==0&false))) {{
                __CLR4_4_18r48r4ldni83xz.R.inc(11364);values.add(pair.getValue());
            }
        }}
        }__CLR4_4_18r48r4ldni83xz.R.inc(11365);return values;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getFirstContextValue(final String label) {try{__CLR4_4_18r48r4ldni83xz.R.inc(11366);
        __CLR4_4_18r48r4ldni83xz.R.inc(11367);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11368);if ((((StringUtils.equals(label, pair.getKey()))&&(__CLR4_4_18r48r4ldni83xz.R.iget(11369)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11370)==0&false))) {{
                __CLR4_4_18r48r4ldni83xz.R.inc(11371);return pair.getValue();
            }
        }}
        }__CLR4_4_18r48r4ldni83xz.R.inc(11372);return null;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> getContextLabels() {try{__CLR4_4_18r48r4ldni83xz.R.inc(11373);
        __CLR4_4_18r48r4ldni83xz.R.inc(11374);final Set<String> labels = new HashSet<String>();
        __CLR4_4_18r48r4ldni83xz.R.inc(11375);for (final Pair<String, Object> pair : contextValues) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11376);labels.add(pair.getKey());
        }
        }__CLR4_4_18r48r4ldni83xz.R.inc(11377);return labels;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pair<String, Object>> getContextEntries() {try{__CLR4_4_18r48r4ldni83xz.R.inc(11378);
        __CLR4_4_18r48r4ldni83xz.R.inc(11379);return contextValues;
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

    /**
     * Builds the message containing the contextual information.
     * 
     * @param baseMessage  the base exception message <b>without</b> context information appended
     * @return the exception message <b>with</b> context information appended, never null
     */
    @Override
    public String getFormattedExceptionMessage(final String baseMessage){try{__CLR4_4_18r48r4ldni83xz.R.inc(11380);
        __CLR4_4_18r48r4ldni83xz.R.inc(11381);final StringBuilder buffer = new StringBuilder(256);
        __CLR4_4_18r48r4ldni83xz.R.inc(11382);if ((((baseMessage != null)&&(__CLR4_4_18r48r4ldni83xz.R.iget(11383)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11384)==0&false))) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11385);buffer.append(baseMessage);
        }
        
        }__CLR4_4_18r48r4ldni83xz.R.inc(11386);if ((((contextValues.size() > 0)&&(__CLR4_4_18r48r4ldni83xz.R.iget(11387)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11388)==0&false))) {{
            __CLR4_4_18r48r4ldni83xz.R.inc(11389);if ((((buffer.length() > 0)&&(__CLR4_4_18r48r4ldni83xz.R.iget(11390)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11391)==0&false))) {{
                __CLR4_4_18r48r4ldni83xz.R.inc(11392);buffer.append('\n');
            }
            }__CLR4_4_18r48r4ldni83xz.R.inc(11393);buffer.append("Exception Context:\n");
            
            __CLR4_4_18r48r4ldni83xz.R.inc(11394);int i = 0;
            __CLR4_4_18r48r4ldni83xz.R.inc(11395);for (final Pair<String, Object> pair : contextValues) {{
                __CLR4_4_18r48r4ldni83xz.R.inc(11396);buffer.append("\t[");
                __CLR4_4_18r48r4ldni83xz.R.inc(11397);buffer.append(++i);
                __CLR4_4_18r48r4ldni83xz.R.inc(11398);buffer.append(':');
                __CLR4_4_18r48r4ldni83xz.R.inc(11399);buffer.append(pair.getKey());
                __CLR4_4_18r48r4ldni83xz.R.inc(11400);buffer.append("=");
                __CLR4_4_18r48r4ldni83xz.R.inc(11401);final Object value = pair.getValue();
                __CLR4_4_18r48r4ldni83xz.R.inc(11402);if ((((value == null)&&(__CLR4_4_18r48r4ldni83xz.R.iget(11403)!=0|true))||(__CLR4_4_18r48r4ldni83xz.R.iget(11404)==0&false))) {{
                    __CLR4_4_18r48r4ldni83xz.R.inc(11405);buffer.append("null");
                } }else {{
                    __CLR4_4_18r48r4ldni83xz.R.inc(11406);String valueStr;
                    __CLR4_4_18r48r4ldni83xz.R.inc(11407);try {
                        __CLR4_4_18r48r4ldni83xz.R.inc(11408);valueStr = value.toString();
                    } catch (final Exception e) {
                        __CLR4_4_18r48r4ldni83xz.R.inc(11409);valueStr = "Exception thrown on toString(): " + ExceptionUtils.getStackTrace(e);
                    }
                    __CLR4_4_18r48r4ldni83xz.R.inc(11410);buffer.append(valueStr);
                }
                }__CLR4_4_18r48r4ldni83xz.R.inc(11411);buffer.append("]\n");
            }
            }__CLR4_4_18r48r4ldni83xz.R.inc(11412);buffer.append("---------------------------------");
        }
        }__CLR4_4_18r48r4ldni83xz.R.inc(11413);return buffer.toString();
    }finally{__CLR4_4_18r48r4ldni83xz.R.flushNeeded();}}

}

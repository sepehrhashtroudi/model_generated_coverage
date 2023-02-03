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
package org.apache.commons.lang3.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.naming.event.ObjectChangeListener;

import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventUtilsTest 
{static class __CLR4_4_1g2vg2vldni84ya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u006d\u006f\u0064\u0065\u006c\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0065\u0064\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004c\u0061\u006e\u0067\u0031\u0066\u005f\u0061\u0075\u0074\u006f\u006d\u0061\u0074\u0065\u0064\u005f\u006e\u006f\u0070\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1675366950859L,8589935092L,20875,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    
    
    

    

    

    

    


    


    

    public static interface MultipleEventListener
    {
        public void event1(PropertyChangeEvent e);

        public void event2(PropertyChangeEvent e);
    }

    public static class EventCounter
    {
        private int count;

        public void eventOccurred()
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20839);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20840);count++;
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20841);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20842);return count;
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }

    public static class EventCounterWithEvent
    {
        private int count;

        public void eventOccurred(final PropertyChangeEvent e)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20843);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20844);count++;
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20845);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20846);return count;
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }


    private static class EventCountingInvociationHandler implements InvocationHandler
    {
        private final Map<String, Integer> eventCounts = new TreeMap<String, Integer>();

        public <L> L createListener(final Class<L> listenerType)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20847);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20848);return listenerType.cast(Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                    new Class[]{listenerType},
                    this));
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        public int getEventCount(final String eventName)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20849);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20850);final Integer count = eventCounts.get(eventName);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20851);return (((count == null )&&(__CLR4_4_1g2vg2vldni84ya.R.iget(20852)!=0|true))||(__CLR4_4_1g2vg2vldni84ya.R.iget(20853)==0&false))? 0 : count.intValue();
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20854);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20855);final Integer count = eventCounts.get(method.getName());
            __CLR4_4_1g2vg2vldni84ya.R.inc(20856);if ((((count == null)&&(__CLR4_4_1g2vg2vldni84ya.R.iget(20857)!=0|true))||(__CLR4_4_1g2vg2vldni84ya.R.iget(20858)==0&false)))
            {{
                __CLR4_4_1g2vg2vldni84ya.R.inc(20859);eventCounts.put(method.getName(), Integer.valueOf(1));
            }
            }else
            {{
                __CLR4_4_1g2vg2vldni84ya.R.inc(20860);eventCounts.put(method.getName(), Integer.valueOf(count.intValue() + 1));
            }
            }__CLR4_4_1g2vg2vldni84ya.R.inc(20861);return null;
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }

    public static class MultipleEventSource
    {
        private final EventListenerSupport<MultipleEventListener> listeners = EventListenerSupport.create(MultipleEventListener.class);

        public void addMultipleEventListener(final MultipleEventListener listener)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20862);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20863);listeners.addListener(listener);
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }

    public static class ExceptionEventSource
    {
        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20864);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20865);throw new RuntimeException();
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }

    public static class PropertyChangeSource
    {
        private final EventListenerSupport<PropertyChangeListener> listeners = EventListenerSupport.create(PropertyChangeListener.class);

        private String property;

        public void setProperty(final String property)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20866);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20867);final String oldValue = this.property;
            __CLR4_4_1g2vg2vldni84ya.R.inc(20868);this.property = property;
            __CLR4_4_1g2vg2vldni84ya.R.inc(20869);listeners.fire().propertyChange(new PropertyChangeEvent(this, "property", oldValue, property));
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        protected void addVetoableChangeListener(final VetoableChangeListener listener)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20870);
            // Do nothing!
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20871);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20872);listeners.addListener(listener);
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}

        public void removePropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_4_1g2vg2vldni84ya.R.inc(20873);
            __CLR4_4_1g2vg2vldni84ya.R.inc(20874);listeners.removeListener(listener);
        }finally{__CLR4_4_1g2vg2vldni84ya.R.flushNeeded();}}
    }
}

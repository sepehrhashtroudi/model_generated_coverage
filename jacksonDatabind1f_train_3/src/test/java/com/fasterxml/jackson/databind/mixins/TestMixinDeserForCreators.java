package com.fasterxml.jackson.databind.mixins;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestMixinDeserForCreators
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class BaseClass
    {
        protected String _a;

        public BaseClass(String a) {
            _a = a+"...";
        }

        private BaseClass(String value, boolean dummy) {
            _a = value;
        }

        public static BaseClass myFactory(String a) {
            return new BaseClass(a+"X", true);
        }
    }

    static class BaseClassWithPrivateCtor
    {
        protected String _a;
        private BaseClassWithPrivateCtor(String a) {
            _a = a+"...";
        }

    }

    /**
     * Mix-in class that will effectively suppresses String constructor,
     * and marks a non-auto-detectable static method as factory method
     * as a creator.
     *<p>
     * Note that method implementations are not used for anything; but
     * we have to a class: interface won't do, as they can't have
     * constructors or static methods.
     */
    static class MixIn
    {
        @JsonIgnore protected MixIn(String s) { }

        @JsonCreator
        static BaseClass myFactory(String a) { return null; }
    }

    static class MixInForPrivate
    {
        @JsonCreator MixInForPrivate(String s) { }
    }

    static class StringWrapper {
        String _value;
        private StringWrapper(String s, boolean foo) { _value = s; }

        @SuppressWarnings("unused")
		private static StringWrapper create(String str) {
            return new StringWrapper(str, false);
        }
    }

    abstract static class StringWrapperMixIn {
        @JsonCreator static StringWrapper create(String str) { return null; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testForFactoryAndCtor418() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     BaseClass result; 
     result = m.readValue("\"string\"", BaseClass.class); 
     assertEquals("string...", result._a); 
     m = new ObjectMapper(); 
     m.addMixInAnnotations(BaseClass.class, MixIn.class); 
     result = m.readValue("\"string\"", BaseClass.class); 
     assertEquals("stringX", result._a); 
 } 

    

    

    
}

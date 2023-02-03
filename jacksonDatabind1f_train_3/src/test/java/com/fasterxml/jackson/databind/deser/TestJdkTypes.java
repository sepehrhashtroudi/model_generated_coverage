package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.*;

public class TestJdkTypes extends BaseMapTest
{
    static class PrimitivesBean
    {
        public boolean booleanValue = true;
        public byte byteValue = 3;
        public char charValue = 'a';
        public short shortValue = 37;
        public int intValue = 1;
        public long longValue = 100L;
        public float floatValue = 0.25f;
        public double doubleValue = -1.0;
    }

    // for [JACKSON-616]
    static class WrappersBean
    {
        public Boolean booleanValue;
        public Byte byteValue;
        public Character charValue;
        public Short shortValue;
        public Integer intValue;
        public Long longValue;
        public Float floatValue;
        public Double doubleValue;
    }

    
    static class ParamClassBean
    {
         public String name = "bar";
         public Class<String> clazz ;

         public ParamClassBean() { }
         public ParamClassBean(String name) {
             this.name = name;
             clazz = String.class;
         }
    }

    static class BooleanBean {
        public Boolean wrapper;
        public boolean primitive;
        
        protected Boolean ctor;
        
        @JsonCreator
        public BooleanBean(@JsonProperty("ctor") Boolean foo) {
            ctor = foo;
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * Related to issues [JACKSON-155], [#170].
     */

public void testClass55() throws IOException { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertSame(String.class, mapper.readValue(quote("java.lang.String"), Class.class)); 
     assertSame(Boolean.TYPE, mapper.readValue(quote("boolean"), Class.class)); 
     assertSame(Byte.TYPE, mapper.readValue(quote("byte"), Class.class)); 
     assertSame(Short.TYPE, mapper.readValue(quote("short"), Class.class)); 
     assertSame(Character.TYPE, mapper.readValue(quote("char"), Class.class)); 
     assertSame(Integer.TYPE, mapper.readValue(quote("int"), Class.class)); 
     assertSame(Long.TYPE, mapper.readValue(quote("long"), Class.class)); 
     assertSame(Float.TYPE, mapper.readValue(quote("float"), Class.class)); 
     assertSame(Double.TYPE, mapper.readValue(quote("double"), Class.class)); 
     assertSame(Void.TYPE, mapper.readValue(quote("void"), Class.class)); 
 } 


public void testEmptyStringForWrappers332() throws IOException { 
     WrappersBean bean; 
     bean = mapper.readValue("{\"booleanValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.booleanValue); 
     bean = mapper.readValue("{\"byteValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.byteValue); 
     bean = mapper.readValue("{\"charValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.charValue); 
     bean = mapper.readValue("{\"shortValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.shortValue); 
     bean = mapper.readValue("{\"intValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.intValue); 
     bean = mapper.readValue("{\"longValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.longValue); 
     bean = mapper.readValue("{\"floatValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.floatValue); 
     bean = mapper.readValue("{\"doubleValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.doubleValue); 
 } 


public void testLongToBoolean333() throws Exception { 
     long value = 1L + Integer.MAX_VALUE; 
     BooleanBean b = mapper.readValue("{\"primitive\" : " + value + ", \"wrapper\":" + value + ", \"ctor\":" + value + "}", BooleanBean.class); 
     assertEquals(Boolean.TRUE, b.wrapper); 
     assertTrue(b.primitive); 
     assertEquals(Boolean.TRUE, b.ctor); 
 } 


public void testFile349() throws Exception { 
     File src = new File("/test").getAbsoluteFile(); 
     String abs = src.getAbsolutePath(); 
     String json = mapper.writeValueAsString(abs); 
     File result = mapper.readValue(json, File.class); 
     assertEquals(abs, result.getAbsolutePath()); 
     final ObjectMapper mapper2 = new ObjectMapper(); 
     mapper2.setVisibility(PropertyAccessor.CREATOR, Visibility.NONE); 
     result = mapper2.readValue(json, File.class); 
     assertEquals(abs, result.getAbsolutePath()); 
 } 


public void testCurrency356() throws IOException { 
     Currency usd = Currency.getInstance("USD"); 
     assertEquals(usd, new ObjectMapper().readValue(quote("USD"), Currency.class)); 
 } 


public void testRegexps357() throws IOException { 
     final String PATTERN_STR = "abc:\\s?(\\d+)"; 
     Pattern exp = Pattern.compile(PATTERN_STR); 
     String json = mapper.writeValueAsString(exp); 
     Pattern result = mapper.readValue(json, Pattern.class); 
     assertEquals(exp.pattern(), result.pattern()); 
 } 


public void testLocale358() throws IOException { 
     assertEquals(new Locale("en"), mapper.readValue(quote("en"), Locale.class)); 
     assertEquals(new Locale("es", "ES"), mapper.readValue(quote("es_ES"), Locale.class)); 
     assertEquals(new Locale("FI", "fi", "savo"), mapper.readValue(quote("fi_FI_savo"), Locale.class)); 
 } 


public void testInetAddress359() throws IOException { 
     InetAddress address = mapper.readValue(quote("127.0.0.1"), InetAddress.class); 
     assertEquals("127.0.0.1", address.getHostAddress()); 
     final String HOST = "www.ning.com"; 
     address = mapper.readValue(quote(HOST), InetAddress.class); 
     assertEquals(HOST, address.getHostName()); 
 } 


public void testCharset360() throws Exception { 
     Charset UTF8 = Charset.forName("UTF-8"); 
     assertSame(UTF8, mapper.readValue(quote("UTF-8"), Charset.class)); 
 } 


public void testUntypedWithJsonArrays473() throws Exception { 
     Object ob = mapper.readValue("[1]", Object.class); 
     assertTrue(ob instanceof List<?>); 
     mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true); 
     ob = mapper.readValue("[1]", Object.class); 
     assertEquals(Object[].class, ob.getClass()); 
 } 

    

    

    

    /**
     * Test for [JACKSON-419]
     */
    

    /**
     * Test for [JACKSON-420] (add DeserializationConfig.FAIL_ON_NULL_FOR_PRIMITIVES)
     */
    
    
    /**
     * Test for [JACKSON-483], allow handling of CharSequence
     */
    
    
    // [JACKSON-484]
    

    // [JACKSON-597]
    

    // [JACKSON-605]
    

    // by default, should return nulls, n'est pas?
    

    // for [JACKSON-616]
    // @since 1.9
    

    // for [JACKSON-652]
    // @since 1.9
    

    // Test for verifying that Long values are coerced to boolean correctly as well
    

    // [JACKSON-789]
    

    // [JACKSON-888]
    
}

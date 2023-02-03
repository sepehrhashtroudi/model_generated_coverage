package com.fasterxml.jackson.databind.introspect;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import javax.xml.namespace.QName;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;

@SuppressWarnings("serial")
public class TestJacksonAnnotationIntrospector
    extends BaseMapTest
{
    public static enum EnumExample {
        VALUE1;
    }

    public static class JacksonExample
    {
        private String attributeProperty;
        private String elementProperty;
        private List<String> wrappedElementProperty;
        private EnumExample enumProperty;
        private QName qname;

        @JsonSerialize(using=QNameSerializer.class)
        public QName getQname()
        {
            return qname;
        }

        @JsonDeserialize(using=QNameDeserializer.class)
        public void setQname(QName qname)
        {
            this.qname = qname;
        }

        @JsonProperty("myattribute")
        public String getAttributeProperty()
        {
            return attributeProperty;
        }

        @JsonProperty("myattribute")
        public void setAttributeProperty(String attributeProperty)
        {
            this.attributeProperty = attributeProperty;
        }

        @JsonProperty("myelement")
        public String getElementProperty()
        {
            return elementProperty;
        }

        @JsonProperty("myelement")
        public void setElementProperty(String elementProperty)
        {
            this.elementProperty = elementProperty;
        }

        @JsonProperty("mywrapped")
        public List<String> getWrappedElementProperty()
        {
            return wrappedElementProperty;
        }

        @JsonProperty("mywrapped")
        public void setWrappedElementProperty(List<String> wrappedElementProperty)
        {
            this.wrappedElementProperty = wrappedElementProperty;
        }

        public EnumExample getEnumProperty()
        {
            return enumProperty;
        }

        public void setEnumProperty(EnumExample enumProperty)
        {
            this.enumProperty = enumProperty;
        }
    }

    public static class QNameSerializer extends JsonSerializer<QName> {

        @Override
        public void serialize(QName value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException, JsonProcessingException
        {
            jgen.writeString(value.toString());
        }
    }


    public static class QNameDeserializer extends StdDeserializer<QName>
    {
        public QNameDeserializer() { super(QName.class); }
        @Override
        public QName deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            return QName.valueOf(jp.readValueAs(String.class));
        }
    }

    public static class DummyBuilder extends StdTypeResolverBuilder
    //<DummyBuilder>
    {
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS)
    @JsonTypeResolver(DummyBuilder.class)
    static class TypeResolverBean { }

    // @since 1.7
    @JsonIgnoreType
    static class IgnoredType { }

    static class IgnoredSubType extends IgnoredType { }

    // Test to ensure we can override enum settings
    static class LcEnumIntrospector extends JacksonAnnotationIntrospector
    {
        private static final long serialVersionUID = 1L;
        @Override
        public String findEnumValue(Enum<?> value)
        {
            return value.name().toLowerCase();
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * tests getting serializer/deserializer instances.
     */
public void testSimple1() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(MapperFeature.USE_ANNOTATIONS, false); 
     BasicBeanDescription beanDesc = mapper.getSerializationConfig().introspect(mapper.constructType(JacksonExample.class)); 
     assertNotNull(beanDesc); 
     JacksonExample ex = new JacksonExample(); 
     QName qname = new QName("urn:hi", "hello"); 
     ex.setQname(qname); 
     ex.setAttributeProperty("attributeValue"); 
     ex.setElementProperty("elementValue"); 
     ex.setWrappedElementProperty(Arrays.asList("wrappedElementValue")); 
     ex.setEnumProperty(EnumExample.VALUE1); 
     StringWriter writer = new StringWriter(); 
     mapper.writeValue(writer, beanDesc); 
     writer.flush(); 
     writer.close(); 
     String json = writer.toString(); 
     JacksonExample readEx = mapper.readValue(json, JacksonExample.class); 
     assertEquals(ex.qname, readEx.qname); 
     assertEquals(ex.attributeProperty, readEx.attributeProperty); 
     assertEquals(ex.elementProperty, readEx.elementProperty); 
     assertEquals(ex.wrappedElementProperty, readEx.wrappedElementProperty); 
     assertEquals(ex.enumProperty, readEx.enumProperty); 
 }
public void testJsonTypeResolver11() throws Exception { 
     JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector(); 
     AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(TypeResolverBean.class, ai, null); 
     JavaType baseType = TypeFactory.defaultInstance().constructType(TypeResolverBean.class); 
     ObjectMapper mapper = new ObjectMapper(); 
     TypeResolverBuilder<?> rb = ai.findTypeResolver(mapper.getDeserializationConfig(), ac, baseType); 
     assertNotNull(rb); 
     assertSame(DummyBuilder.class, rb.getClass()); 
 }
public void testOverrideIntrospectors65() { 
     ObjectMapper m = new ObjectMapper(); 
     DeserializationConfig cfg = m.getDeserializationConfig(); 
     cfg = cfg.with((ClassIntrospector) null); 
     cfg = cfg.with((AnnotationIntrospector) null); 
     assertNull(cfg.getAnnotationIntrospector()); 
 }
    

        

    /**
     * Tests to ensure that {@link JsonIgnoreType} is detected as expected
     * by the standard introspector.
     * 
     * @since 1.7
     */
    

    
}

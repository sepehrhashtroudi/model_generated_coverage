package com.fasterxml.jackson.databind.jsonschema;

import java.util.Collection;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @author Ryan Heaton
 */
@SuppressWarnings("deprecation")
public class TestGenerateJsonSchema
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    public static class SimpleBean
    {
        private int property1;
        private String property2;
        private String[] property3;
        private Collection<Float> property4;
        @JsonProperty(required=true)
        private String property5;
        
        public int getProperty1()
        {
            return property1;
        }

        public void setProperty1(int property1)
        {
            this.property1 = property1;
        }

        public String getProperty2()
        {
            return property2;
        }

        public void setProperty2(String property2)
        {
            this.property2 = property2;
        }

        public String[] getProperty3()
        {
            return property3;
        }

        public void setProperty3(String[] property3)
        {
            this.property3 = property3;
        }

        public Collection<Float> getProperty4()
        {
            return property4;
        }

        public void setProperty4(Collection<Float> property4)
        {
            this.property4 = property4;
        }
        
        public String getProperty5()
        {
            return property5;
        }

        public void setProperty5(String property5)
        {
            this.property5 = property5;
        }
    }

    public class TrivialBean {
        public String name;
    }

    @JsonSerializableSchema(id="myType")
    public class BeanWithId {
        public String value;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * tests generating json-schema stuff.
     */

public void testGeneratingJsonSchema90() throws Exception { 
     JsonSchema jsonSchema = MAPPER.generateJsonSchema(SimpleBean.class); 
     assertNotNull(jsonSchema); 
     assertTrue(jsonSchema.equals(jsonSchema)); 
     assertFalse(jsonSchema.equals(null)); 
     assertFalse(jsonSchema.equals("foo")); 
     assertNotNull(jsonSchema.toString()); 
     assertNotNull(JsonSchema.getDefaultSchemaNode()); 
     ObjectNode root = jsonSchema.getSchemaNode(); 
     assertEquals("object", root.get("type").asText()); 
     assertEquals(false, root.path("required").booleanValue()); 
     JsonNode propertiesSchema = root.get("properties"); 
     assertNotNull(propertiesSchema); 
     JsonNode property1Schema = propertiesSchema.get("property1"); 
     assertNotNull(property1Schema); 
     assertEquals("integer", property1Schema.get("type").asText()); 
     assertEquals(false, property1Schema.path("required").booleanValue()); 
     JsonNode property2Schema = propertiesSchema.get("property2"); 
     assertNotNull(property2Schema); 
     assertEquals("string", property2Schema.get("type").asText()); 
     assertEquals(false, property2Schema.path("required").booleanValue()); 
     JsonNode property3Schema = propertiesSchema.get("property3"); 
     assertNotNull(property3Schema); 
     assertEquals("array", property3Schema.get("type").asText()); 
     assertEquals(false, property3Schema.path("required").booleanValue()); 
     assertEquals("string", property3Schema.get("items").get("type").asText()); 
     JsonNode property4Schema = propertiesSchema.get("property4"); 
     assertNotNull(property4Schema); 
     assertEquals("array", property4Schema.get("type").asText()); 
     assertEquals(false, property4Schema.path("required").booleanValue()); 
     assertEquals("number", property4Schema.get("items").get("type").asText()); 
 } 


public void testGeneratingJsonSchemaWithFilters168() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setFilters(secretFilterProvider); 
     JsonSchema schema = mapper.generateJsonSchema(FilteredBean.class); 
     JsonNode node = schema.getSchemaNode().get("properties"); 
     assertTrue(node.has("obvious")); 
     assertFalse(node.has("secret")); 
 } 


public void testSchemaId303() throws Exception { 
     JsonSchema jsonSchema = MAPPER.generateJsonSchema(BeanWithId.class); 
     String json = jsonSchema.toString().replaceAll("\"", "'"); 
     assertEquals("{'type':'object','id':'myType','properties':{'value':{'type':'string'}}}", json); 
 } 


public void testInvalidCall502() throws Exception { 
     try { 
         MAPPER.generateJsonSchema(null); 
         fail("Should have failed"); 
     } catch (IllegalArgumentException iae) { 
         verifyException(iae, "class must be provided"); 
     } 
 } 

    
    
    @JsonFilter("filteredBean")
    protected static class FilteredBean {
    	
    	@JsonProperty
    	private String secret = "secret";
    	
    	@JsonProperty
    	private String obvious = "obvious";
    	
    	public String getSecret() { return secret; }
    	public void setSecret(String s) { secret = s; }
    	
    	public String getObvious() { return obvious; }
    	public void setObvious(String s) {obvious = s; }
    }
    
    public static FilterProvider secretFilterProvider = new SimpleFilterProvider()
        .addFilter("filteredBean", SimpleBeanPropertyFilter.filterOutAllExcept(new String[]{"obvious"}));

    

    /**
     * Additional unit test for verifying that schema object itself
     * can be properly serialized
     */
    

    

    /**
     * Test for [JACKSON-454]
     */
    

    
}

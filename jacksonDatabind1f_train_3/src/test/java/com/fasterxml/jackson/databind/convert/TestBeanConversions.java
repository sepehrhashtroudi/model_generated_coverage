package com.fasterxml.jackson.databind.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestBeanConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();

    static class Point {
        public int x, y;

        public int z = -13;

        public Point() { }
        public Point(int a, int b, int c)
        {
            x = a;
            y = b;
            z = c;
        }
    }

    static class PointStrings {
        public final String x, y;

        public PointStrings(String x, String y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class BooleanBean {
        public boolean boolProp;
    }

    static class WrapperBean {
        public BooleanBean x;
    }

    static class ObjectWrapper
    {
        private Object data;

        public ObjectWrapper() { }
        public ObjectWrapper(Object o) { data = o; }

        public Object getData() { return data; }
        public void setData(Object data) { this.data = data; }
    }

    static class Leaf {
        public int value;

        public Leaf() { }
        public Leaf(int v) { value = v; }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    

public void testBeanConvert275() { 
     PointStrings input = new PointStrings("37", "-9"); 
     Point point = MAPPER.convertValue(input, Point.class); 
     assertEquals(37, point.x); 
     assertEquals(-9, point.y); 
     assertEquals(-13, point.z); 
 } 


public void testNodeConvert309() throws Exception { 
     ObjectNode src = (ObjectNode) MAPPER.readTree("{}"); 
     TreeNode node = src; 
     ObjectNode result = MAPPER.treeToValue(node, ObjectNode.class); 
     assertSame(src, result); 
 } 


public void testConvertUsingCast318() throws Exception { 
     String str = new String("foo"); 
     CharSequence seq = str; 
     String result = MAPPER.convertValue(seq, String.class); 
     assertSame(str, result); 
 } 


public void testIssue11529() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     JsonNode n = root; 
     ObjectNode ob2 = MAPPER.convertValue(n, ObjectNode.class); 
     assertSame(root, ob2); 
     JsonNode n2 = MAPPER.convertValue(n, JsonNode.class); 
     assertSame(root, n2); 
     String STR = "test"; 
     CharSequence seq = MAPPER.convertValue(STR, CharSequence.class); 
     assertSame(STR, seq); 
     Leaf l = new Leaf(13); 
     Map<?, ?> m = MAPPER.convertValue(l, Map.class); 
     assertNotNull(m); 
     assertEquals(1, m.size()); 
     assertEquals(Integer.valueOf(13), m.get("value")); 
     Leaf l2 = MAPPER.convertValue(m, Leaf.class); 
     assertEquals(13, l2.value); 
     Object ob = MAPPER.convertValue(l, Object.class); 
     assertNotNull(ob); 
     assertEquals(LinkedHashMap.class, ob.getClass()); 
     final Object plaino = new Object(); 
     try { 
         m = MAPPER.convertValue(plaino, Map.class); 
         fail("Conversion should have failed"); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "no properties discovered"); 
     } 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS); 
     try { 
         assertEquals("{}", mapper.writeValueAsString(plaino)); 
     } catch (Exception e) { 
         throw (Exception) e.getCause(); 
     } 
     m = mapper.convertValue(plaino, Map.class); 
     assertNotNull(m); 
     assertEquals(0, m.size()); 
 } 

    
    
    // For [JACKSON-371]; verify that we know property that caused issue...
    // (note: not optimal place for test, but will have to do for now)
    

    

    // [JACKSON-710]: should work regardless of wrapping...
    

    // [Issue-11]: simple cast, for POJOs etc
    
    
    // [Issue-11]: simple cast, for Tree
    
    
    private void _convertAndVerifyPoint(ObjectMapper m)
    {
        final Point input = new Point(1, 2, 3);
        Point output = m.convertValue(input, Point.class);
        assertEquals(1, output.x);
        assertEquals(2, output.y);
        assertEquals(3, output.z);
    }

    /**
     * Need to test "shortcuts" introduced by [Issue-11]
     */
    
}

package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tests for Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class DocumentTest {
@Test
public void testTitles11() { 
     Document noTitle = Jsoup.parse("<p>Hello</p>"); 
     Document withTitle = Jsoup.parse("<title>First</title><title>Ignore</title><p>Hello</p>"); 
     assertEquals("", noTitle.title()); 
     noTitle.title("Hello"); 
     assertEquals("Hello", noTitle.title()); 
     assertEquals("Hello", noTitle.select("title").first().text()); 
     assertEquals("First", withTitle.title()); 
     withTitle.title("Hello"); 
     assertEquals("Hello", withTitle.title()); 
     assertEquals("Hello", withTitle.select("title").first().text()); 
 }
    
    
    
}

package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 Tests that the selector selects correctly.

 @author Jonathan Hedley, jonathan@hedley.net */
public class SelectorTest {
@Test
public void parentChildStar() { 
     String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements divChilds = doc.select("div > *"); 
     assertEquals(3, divChilds.size()); 
     assertEquals("p", divChilds.get(0).tagName()); 
     assertEquals("p", divChilds.get(1).tagName()); 
     assertEquals("span", divChilds.get(2).tagName()); 
 }
@Test
public void testPseudoEquals7() { 
     Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>"); 
     Elements ps = doc.select("div p:eq(0)"); 
     assertEquals(2, ps.size()); 
     assertEquals("One", ps.get(0).text()); 
     assertEquals("Four", ps.get(1).text()); 
     Elements ps2 = doc.select("div:eq(0) p:eq(0)"); 
     assertEquals(1, ps2.size()); 
     assertEquals("One", ps2.get(0).text()); 
     assertEquals("p", ps2.get(0).tagName()); 
 }
@Test
public void testSupportsLeadingCombinator10() { 
     String h = "<div><p><span>One</span><span>Two</span></p></div>"; 
     Document doc = Jsoup.parse(h); 
     Element p = doc.select("div > p").first(); 
     Elements spans = p.select("> span"); 
     assertEquals(2, spans.size()); 
     assertEquals("One", spans.first().text()); 
     h = "<div id=1><div id=2><div id=3></div></div></div>"; 
     doc = Jsoup.parse(h); 
     Element div = doc.select("div").select(" > div").first(); 
     assertEquals("2", div.id()); 
 }
@Test
public void mixCombinatorGroup() { 
     String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select(".foo > ol, ol > li + li"); 
     assertEquals(3, els.size()); 
     assertEquals("ol", els.get(0).tagName()); 
     assertEquals("Two", els.get(1).text()); 
     assertEquals("Three", els.get(2).text()); 
 }
@Test
public void and() { 
     String h = "<div id=1 class='foo bar' title=bar name=qux><p class=foo title=bar>Hello</p></div"; 
     Document doc = Jsoup.parse(h); 
     Elements div = doc.select("div.foo"); 
     assertEquals(1, div.size()); 
     assertEquals("div", div.first().tagName()); 
     Elements p = doc.select("div .foo"); 
     assertEquals(1, p.size()); 
     assertEquals("p", p.first().tagName()); 
     Elements div2 = doc.select("div#1.foo.bar[title=bar][name=qux]"); 
     assertEquals(1, div2.size()); 
     assertEquals("div", div2.first().tagName()); 
     Elements p2 = doc.select("div *.foo"); 
     assertEquals(1, p2.size()); 
     assertEquals("p", p2.first().tagName()); 
 }
@Test
public void generalSiblings() { 
     String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>"; 
     Document doc = Jsoup.parse(h); 
     Elements els = doc.select("#1 ~ #3"); 
     assertEquals(1, els.size()); 
     assertEquals("Three", els.first().text()); 
 }
@Test
public void caseInsensitive() { 
     String h = "<dIv tItle=bAr><div>"; 
     Document doc = Jsoup.parse(h); 
     assertEquals(2, doc.select("DIV").size()); 
     assertEquals(1, doc.select("DIV[TITLE]").size()); 
     assertEquals(1, doc.select("DIV[TITLE=BAR]").size()); 
     assertEquals(0, doc.select("DIV[TITLE=BARBARELLA").size()); 
 }
    

    

    

    

    
    
    

    

    

    
    
    

    

    
    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // for http://github.com/jhy/jsoup/issues#issue/10
    
    
    // for http://github.com/jhy/jsoup/issues#issue/13
    
    
    
    
    
    
    
    
    
    
    
}

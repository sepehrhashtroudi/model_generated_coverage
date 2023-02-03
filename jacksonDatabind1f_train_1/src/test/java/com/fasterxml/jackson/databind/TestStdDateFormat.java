package com.fasterxml.jackson.databind;

import java.util.*;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class TestStdDateFormat
    extends BaseMapTest
{

public void testInvalid159() { 
     StdDateFormat std = new StdDateFormat(); 
     try { 
         std.parse("foobar"); 
     } catch (java.text.ParseException e) { 
         verifyException(e, "Can not parse"); 
     } 
 } 

    

    
}

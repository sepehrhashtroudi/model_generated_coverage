/*
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

package org.apache.commons.csv;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

public class CSVPrinterTest {

    String lineSeparator = CSVFormat.DEFAULT.getLineSeparator();

@Test
public void testPrintSep1() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.printSep(); assertEquals("", out.toString()); printer.println("a", "b", "c"); printer.printSep(); assertEquals("a,b,c", out.toString()); }
@Test
public void testPrintln4() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); assertEquals("a,b,c", out.toString()); }
@Test
public void testCSVPrinter6() throws IOException { StringWriter out = new StringWriter(); CSVFormat format = CSVFormat.DEFAULT; CSVPrinter printer = new CSVPrinter(out, format); printer.println("a", "b", "c"); printer.println("d", "e", "f"); printer.println("g", "h", "i"); printer.println("j", "j", "k"); printer.println("k", "l", "l"); assertEquals("a,b,c,d,e,f", out.toString()); }
@Test
public void testPrint7() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.print("a", true); printer.print("b", true); printer.print("c", true); printer.print("d", true); assertEquals("a,b,c\\n", out.toString()); }
@Test
public void testPrintln8() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); printer.println("d", "e", "f"); printer.println("g", "h", "i", "j", "k", "l"); assertEquals("a,b,c,d,e,f,g,h,i,j,k,l", out.toString()); }
@Test
public void testPrintSep9() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); printer.printSep(); assertEquals("a,b,c", out.toString()); }
@Test
public void testPrintAndEncapsulate10() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.print("a", true); printer.print("b", true); printer.print("c", true); printer.print("d", true); assertEquals("a,b,c\\n", out.toString()); }
@Test
public void testLineSeparator15() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); assertEquals("a,b,c", out.toString()); }
@Test
public void testPrint16() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.print("a", false); printer.print("b", false); printer.print("c", false); printer.print("d", false); assertEquals("a,b,c\\n", out.toString()); }
@Test
public void testPrint17() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.print("a", false); printer.print("b", false); printer.print("c", false); assertEquals("a,b,c", out.toString()); }
@Test
public void testPrintln19() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); }
@Test
public void testPrintln20() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); printer.println("a", "b", "c"); assertEquals("a\\tb\\tc", out.toString()); }
@Test
public void testPrint21() throws IOException { StringWriter out = new StringWriter(); CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT); printer.print("a", true); printer.print("b", true); printer.print("c", true); printer.print("d", true); printer.print("e", true); printer.print("f", true); printer.print("g", true); printer.print("h", true); printer.print("i", true); assertEquals("a,b,c\\n", out.toString()); }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    public void doRandom(CSVFormat format, int iter) throws Exception {
        for (int i = 0; i < iter; i++) {
            doOneRandom(format);
        }
    }

    public void doOneRandom(CSVFormat format) throws Exception {
        Random r = new Random();
        
        int nLines = r.nextInt(4) + 1;
        int nCol = r.nextInt(3) + 1;
        // nLines=1;nCol=2;
        String[][] lines = new String[nLines][];
        for (int i = 0; i < nLines; i++) {
            String[] line = new String[nCol];
            lines[i] = line;
            for (int j = 0; j < nCol; j++) {
                line[j] = randStr();
            }
        }

        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, format);

        for (int i = 0; i < nLines; i++) {
            // for (int j=0; j<lines[i].length; j++) System.out.println("### VALUE=:" + printable(lines[i][j]));
            printer.println(lines[i]);
        }

        printer.flush();
        String result = sw.toString();
        // System.out.println("### :" + printable(result));

        CSVParser parser = new CSVParser(result, format);
        List<CSVRecord> parseResult = parser.getRecords();

        if (!equals(lines, parseResult)) {
            System.out.println("Printer output :" + printable(result));
            assertTrue(false);
        }
    }

    public static boolean equals(String[][] a, List<CSVRecord> b) {
        if (a.length != b.size()) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            String[] linea = a[i];
            String[] lineb = b.get(i).values();
            if (linea.length != lineb.length) {
                return false;
            }
            for (int j = 0; j < linea.length; j++) {
                String aval = linea[j];
                String bval = lineb[j];
                if (!aval.equals(bval)) {
                    System.out.println("expected  :" + printable(aval));
                    System.out.println("got       :" + printable(bval));
                    return false;
                }
            }
        }
        return true;
    }

    public static String printable(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch <= ' ' || ch >= 128) {
                sb.append("(").append((int) ch).append(")");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String randStr() {
        Random r = new Random();
        
        int sz = r.nextInt(20);
        // sz = r.nextInt(3);
        char[] buf = new char[sz];
        for (int i = 0; i < sz; i++) {
            // stick in special chars with greater frequency
            char ch;
            int what = r.nextInt(20);
            switch (what) {
                case 0:
                    ch = '\r';
                    break;
                case 1:
                    ch = '\n';
                    break;
                case 2:
                    ch = '\t';
                    break;
                case 3:
                    ch = '\f';
                    break;
                case 4:
                    ch = ' ';
                    break;
                case 5:
                    ch = ',';
                    break;
                case 6:
                    ch = '"';
                    break;
                case 7:
                    ch = '\'';
                    break;
                case 8:
                    ch = '\\';
                    break;
                default:
                    ch = (char) r.nextInt(300);
                    break;
                // default: ch = 'a'; break;
            }
            buf[i] = ch;
        }
        return new String(buf);
    }

}

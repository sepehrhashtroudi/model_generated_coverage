/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.zip.CRC32;

import org.apache.commons.compress.AbstractTestCase;

public class UTF8ZipFilesTest extends AbstractTestCase {

    private static final String UTF_8 = "utf-8";
    private static final String CP437 = "cp437";
    private static final String US_ASCII = "US-ASCII";
    private static final String ASCII_TXT = "ascii.txt";
    private static final String EURO_FOR_DOLLAR_TXT = "\u20AC_for_Dollar.txt";
    private static final String OIL_BARREL_TXT = "\u00D6lf\u00E4sser.txt";

    

    

    

    

    

    

    

    

    /*
     * 7-ZIP created archive, uses EFS to signal UTF-8 filenames.
     *
     * 7-ZIP doesn't use EFS for strings that can be encoded in CP437
     * - which is true for OIL_BARREL_TXT.
     */
    

    /*
     * WinZIP created archive, uses Unicode Extra Fields but only in
     * the central directory.
     */
    

    

    private static void testFileRoundtrip(String encoding, boolean withEFS,
                                          boolean withExplicitUnicodeExtra)
        throws IOException {

        File file = File.createTempFile(encoding + "-test", ".zip");
        try {
            createTestFile(file, encoding, withEFS, withExplicitUnicodeExtra);
            testFile(file, encoding);
        } finally {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private static void createTestFile(File file, String encoding,
                                       boolean withEFS,
                                       boolean withExplicitUnicodeExtra)
        throws UnsupportedEncodingException, IOException {

        ZipEncoding zipEncoding = ZipEncodingHelper.getZipEncoding(encoding);

        ZipArchiveOutputStream zos = null;
        try {
            zos = new ZipArchiveOutputStream(file);
            zos.setEncoding(encoding);
            zos.setUseLanguageEncodingFlag(withEFS);
            zos.setCreateUnicodeExtraFields(withExplicitUnicodeExtra ? 
                                            ZipArchiveOutputStream
                                            .UnicodeExtraFieldPolicy.NEVER
                                            : ZipArchiveOutputStream
                                            .UnicodeExtraFieldPolicy.ALWAYS);

            ZipArchiveEntry ze = new ZipArchiveEntry(OIL_BARREL_TXT);
            if (withExplicitUnicodeExtra
                && !zipEncoding.canEncode(ze.getName())) {

                ByteBuffer en = zipEncoding.encode(ze.getName());

                ze.addExtraField(new UnicodePathExtraField(ze.getName(),
                                                           en.array(),
                                                           en.arrayOffset(),
                                                           en.limit()));
            }

            zos.putNextEntry(ze);
            zos.write("Hello, world!".getBytes("US-ASCII"));
            zos.closeEntry();

            ze = new ZipArchiveEntry(EURO_FOR_DOLLAR_TXT);
            if (withExplicitUnicodeExtra
                && !zipEncoding.canEncode(ze.getName())) {

                ByteBuffer en = zipEncoding.encode(ze.getName());

                ze.addExtraField(new UnicodePathExtraField(ze.getName(),
                                                           en.array(),
                                                           en.arrayOffset(),
                                                           en.limit()));
            }

            zos.putNextEntry(ze);
            zos.write("Give me your money!".getBytes("US-ASCII"));
            zos.closeEntry();

            ze = new ZipArchiveEntry(ASCII_TXT);

            if (withExplicitUnicodeExtra
                && !zipEncoding.canEncode(ze.getName())) {

                ByteBuffer en = zipEncoding.encode(ze.getName());

                ze.addExtraField(new UnicodePathExtraField(ze.getName(),
                                                           en.array(),
                                                           en.arrayOffset(),
                                                           en.limit()));
            }

            zos.putNextEntry(ze);
            zos.write("ascii".getBytes("US-ASCII"));
            zos.closeEntry();
        } finally {
            if (zos != null) {
                try {
                    zos.close();
                } catch (IOException e) { /* swallow */ }
            }
        }
    }

    private static void testFile(File file, String encoding)
        throws IOException {
        ZipFile zf = null;
        try {
            zf = new ZipFile(file, encoding, false);

            Enumeration e = zf.getEntries();
            while (e.hasMoreElements()) {
                ZipArchiveEntry ze = (ZipArchiveEntry) e.nextElement();

                if (ze.getName().endsWith("sser.txt")) {
                    assertUnicodeName(ze, OIL_BARREL_TXT, encoding);

                } else if (ze.getName().endsWith("_for_Dollar.txt")) {
                    assertUnicodeName(ze, EURO_FOR_DOLLAR_TXT, encoding);
                } else if (!ze.getName().equals(ASCII_TXT)) {
                    throw new AssertionError("Urecognized ZIP entry with name ["
                                             + ze.getName() + "] found.");
                }
            }
        } finally {
            ZipFile.closeQuietly(zf);
        }
    }

    private static UnicodePathExtraField findUniCodePath(ZipArchiveEntry ze) {
        return (UnicodePathExtraField)
            ze.getExtraField(UnicodePathExtraField.UPATH_ID);
    }

    private static void assertUnicodeName(ZipArchiveEntry ze,
                                          String expectedName,
                                          String encoding)
        throws IOException {
        if (!expectedName.equals(ze.getName())) {
            UnicodePathExtraField ucpf = findUniCodePath(ze);
            assertNotNull(ucpf);

            ZipEncoding enc = ZipEncodingHelper.getZipEncoding(encoding);
            ByteBuffer ne = enc.encode(ze.getName());

            CRC32 crc = new CRC32();
            crc.update(ne.array(),ne.arrayOffset(),ne.limit());

            assertEquals(crc.getValue(), ucpf.getNameCRC32());
            assertEquals(expectedName, new String(ucpf.getUnicodeName(),
                                                  UTF_8));
        }
    }

    

}


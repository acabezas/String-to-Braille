package com.example.java;

import junit.framework.TestCase;

import static com.example.java.Main.stringToBraille;

public class MainTest extends TestCase {

    public void testStringToBraille1() throws Exception {
        assertEquals("100100101010100110100010",stringToBraille("code"));

    }
    public void testStringToBraille2() throws Exception {
        assertEquals("000001110000111010100000010100111000111000100010",stringToBraille("Braille"));

    }
    public void testStringToBraille3() throws Exception {
        assertEquals("000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100100010100110000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110",stringToBraille("The quick brown fox jumped over the lazy dog"));

    }

}
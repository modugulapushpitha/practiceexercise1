package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsCheckTest {
    VowelConsCheck testobj;

    @Before
    public void setUp() {
        testobj= new VowelConsCheck();
    }

    @After
    public void teardown() {
        testobj= null;
    }
    @Test
    public void givenCharShouldReturnVowel() {
        String res = testobj.inputCheck("a");
        assertEquals("Vowel", res);

    }
    @Test
    public void givenTwoletterShouldReturnConsonant() {
        String result = testobj.inputCheck("b");
        assertEquals("Consonant", result);

    }
    @Test
    public void givenTwoletterShouldReturnVowel() {
        String res = testobj.inputCheck("ab");
        assertEquals("VowelConsonant", res);

    }
}
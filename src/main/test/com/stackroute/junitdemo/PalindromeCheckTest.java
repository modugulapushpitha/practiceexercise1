package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck testobj;
    @Before
    public void setUp(){
        testobj=new PalindromeCheck();
    }
    @After
    public void tearDown(){
        testobj=null;
    }


    @Test
    public void givenOneNumberShouldReturnMessage(){
        String result=testobj.checkPalindrome(2334);
        assertEquals("Failure",result);
    }


    @Test
    public void givenZeroinputShouldReturnFailureMessage(){
        String result=testobj.checkPalindrome(0);
        assertEquals("Failure",result);
    }

    @Test
    public void givenintegerShouldReturnMessage(){
        String result=testobj.checkPalindrome(12221);
        assertEquals("Failure",result);
    }

    @Test
    public void givenPalindromeintShouldReturnMessage(){
        String res=testobj.checkPalindrome(19991);
        assertEquals("Failure",res);
    }

}
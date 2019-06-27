package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse testobj;
    @Before
    public void setUp(){
        testobj=new StringReverse();

    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void givenStringShouldReturnreverse(){
        String res=testobj.reverse("london");
        assertEquals("nodnol",res);
    }
    @Test
    public void givenStringShouldReturnrevstring(){
        String res=testobj.reverse("apple");
        assertEquals("elppa",res);
    }
    @Test
    public void givenNullStringShouldReturnErrorMessage(){
        String res=testobj.reverse(null);
        assertEquals("Null not allowed",res);
    }
    @Test
    public void givenNumericStringShouldReturnReverse(){
        String res=testobj.reverse("12345");
        assertEquals("54321",res);
    }

}
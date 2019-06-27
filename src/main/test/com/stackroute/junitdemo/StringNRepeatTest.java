package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringNRepeatTest {
    StringNRepeat testobj;
    @Before
    public void setUp(){
        testobj=new StringNRepeat();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void givenStringIntegerShouldReturnRepeatedOutput(){
        String result=testobj.repeatString("stackroute",5);
        assertEquals("stackrouterouterouterouterouteroute",result);

    }

    @Test
    public void givenStringIntegerShouldReturnOutput(){
        String result=testobj.repeatString("abc",4);
        assertEquals("String index out of range","input2 should be less than length of input1",result);

    }

}
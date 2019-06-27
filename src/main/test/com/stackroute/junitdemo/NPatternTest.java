package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NPatternTest {
    NPattern testobj;
    @Before
    public void setUp(){
        testobj=new NPattern();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void givenIntShouldReturnPattern(){
        String result=testobj.nrepeat(2);
        assertEquals("1 2 2",result.trim());
    }
    @Test
    public void givenIntegerShouldReturnPattern(){
        String result=testobj.nrepeat(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",result.trim());
    }
    @Test
    public void givenZeroShouldReturn(){
        String result=testobj.nrepeat(0);
        assertEquals("",result);
    }

}
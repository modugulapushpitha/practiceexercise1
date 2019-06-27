package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionCheckTest {
    ConditionCheck testobj;
    @Before
    public void setUp(){
        testobj=new ConditionCheck();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void givenIntegerShouldreturnOutputMessageJerry(){
        String res=testobj.conditionCheck(20);
        assertEquals("Jerry",res);
    }
    @Test
    public void givenOddIntegerShouldReturnTom(){
        String res=testobj.conditionCheck(25);
        assertEquals("Tom",res);
    }
    @Test
    public void givenIntegerShouldReturnOutputmessage(){
        String res=testobj.conditionCheck(1);
        assertEquals(null,res);
    }

}
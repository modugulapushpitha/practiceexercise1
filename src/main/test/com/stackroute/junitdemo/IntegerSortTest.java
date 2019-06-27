package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSortTest {
    IntegerSort testobj;
    @Before
    public void set(){
        testobj=new IntegerSort();
    }
    @After
    public void tear(){
        testobj=null;
    }
    @Test
    public void givenNumbershouldReturnFalseMessage(){
        String result=testobj.sortTheNumber(2345);
        assertEquals("False",result);
    }

    @Test
    public void givenNumbershouldReturnTrueMessage(){
        String result=testobj.sortTheNumber(88888);
        assertEquals("True",result);
    }
    @Test
    public void givenZeroshouldReturnMessage(){
        String result=testobj.sortTheNumber(0);
        assertEquals("False",result);
    }

    @Test
    public void givenNeagitiveValueshouldReturnMessage(){
        String result=testobj.sortTheNumber(-2345);
        assertEquals("False",result);
    }

}
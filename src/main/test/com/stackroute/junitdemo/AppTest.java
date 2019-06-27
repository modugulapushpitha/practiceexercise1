package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){
        app=new App();
        System.out.println("Before");
    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");
    }
    @Test
    public void givenTwoStringShouldReturnConcatinateUpperString(){
        //arrange

        //act
        String result=app.concatAndConvertString("sraddha","hello");
        //assert
        assertEquals("SRADDHAHELLO",result);
    }
    @Test
    public void givenTwoNullsShouldReturnErrorMessage(){
        //arrange
        //act
        String result=app.concatAndConvertString(null,null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneNullOneStringShouldReturnErrorMessage(){
        //arrange
        //act
        String result=app.concatAndConvertString("hello",null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumericString(){
        //arrange
        //act
        String result=app.concatAndConvertString(" ","6");
        //assert
        assertEquals(" 6",result);
    }
}
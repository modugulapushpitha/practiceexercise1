package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCheckTest {
    CharCheck testobj;
@Before
    public void setUp(){
    testobj=new CharCheck();
}
@After
    public void tearDown(){
    testobj=null;
}
@Test
    public void givenCharacterShouldReturnCapital()
{
    String res=testobj.characterCheck('A');
    assertEquals("Capital",res);
}
@Test
    public void givenCharacterShouldReturnSmall(){
    String res=testobj.characterCheck('a');
    assertEquals("Small case letter",res);
}
@Test
public void givenCharacterShouldReturnDigit(){
    String res=testobj.characterCheck('1');
    assertEquals("A Digit",res);
}
@Test
    public void givenCharacterShouldReturnSpecialChar() {
    String res = testobj.characterCheck('@');
    assertEquals("special character", res);
}

}
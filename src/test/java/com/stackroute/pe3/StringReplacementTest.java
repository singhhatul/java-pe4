package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplacementTest {
    StringReplacement stringReplacement;

    /* @Before annotation is used on a method containing Java
   code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
   */
    @Before
    public void setUp()  {
        this.stringReplacement=new StringReplacement();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.stringReplacement=null;
    }

    @Test
    public void givenStringInputShouldReturnReplacedString(){
        String expectedOutput="faity fry";
        String actualOutput=stringReplacement.getCharacterReplacer("daily dry",'d','l');
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenInputShouldNull(){
        String expectedOutput="string input is null";
        String actualOutput=stringReplacement.getCharacterReplacer(null);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenInputShouldSameOutputIfCharacterNotMatched(){
        String expectedOutput="daily dry";
        String actualOutput=stringReplacement.getCharacterReplacer("daily dry",'b','c');
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void givenIntegerStringInputShouldReturnReplacedString(){
        String expectedOutput="4632 6689";
        String actualOutput=stringReplacement.getCharacterReplacer("4532 5689",'5','6');
        assertEquals(expectedOutput,actualOutput);
    }


}